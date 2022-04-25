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

# create SOAP service client package
mvn clean package -Denv=local -Pspring-client -Pcxf-codegen-sources

# cleaning
docker container stop $(docker ps -a | grep "fimperato/springboot-soap-client" | awk '{print $1}')
docker container rm $(docker ps -a | grep "fimperato/springboot-soap-client" | awk '{print $1}')
docker rmi fimperato/springboot-soap-client

# build image
docker image build -t fimperato/springboot-soap-client ./

# start container
docker container run -it --publish $client_port_value:8080 -e "JAVA_TOOL_OPTIONS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005" -p 5005:5005  fimperato/springboot-soap-client
