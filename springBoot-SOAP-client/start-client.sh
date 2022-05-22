#!/bin/bash

# SOAP service client script
echo "Starting client ..."

if [ -z "$1" ];
then
  client_port_value=8081
  echo "client port set to default value $client_port_value";
else
  client_port_value=$1
  echo "client port set to input value $client_port_value";
fi

if [ -z "$2" ];
then
  server_port_value=8082
  echo "server port set to default value $server_port_value";
else
  server_port_value=$2
  echo "server port set to input value $server_port_value";
fi

docker_internal_host=$( ifconfig docker0 | grep "inet " | awk '{ print  $2}' )
if [ -z "$docker_internal_host" ];
then
  docker_internal_host=172.17.0.1
  echo "docker_internal_host set to default value $docker_internal_host";
else
  echo "docker_internal_host retrieved value $docker_internal_host";
fi
##export SOAP_SERVER_HOST=$docker_internal_host:$server_port_value


# create SOAP service client package
mvn clean package -Denv=local -Pspring-client -Pcxf-codegen-sources

# cleaning
docker container stop $(docker ps -a | grep "fimperato/springboot-soap-client" | awk '{print $1}')
docker container rm $(docker ps -a | grep "fimperato/springboot-soap-client" | awk '{print $1}')
docker rmi fimperato/springboot-soap-client

# build image
docker image build -t fimperato/springboot-soap-client ./

# start container
docker container run -it --publish $client_port_value:8080 \
        -e "JAVA_TOOL_OPTIONS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005" -p 5005:5005 \
        -e "it.soap.test.def.wsdl.server.envHost=$docker_internal_host:$server_port_value" \
        fimperato/springboot-soap-client
