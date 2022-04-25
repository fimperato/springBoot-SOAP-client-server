#!/bin/bash

# SOAP service server script
echo "Starting server ..."

if [ -z "$1" ];
then
  server_port_value=8082
  echo "server port set to default value $server_port_value";
else
  server_port_value=$1
  echo "server port set to input value $server_port_value";
fi

# create SOAP server server package
mvn clean package -Denv=local -Pcxf-codegen-sources

# cleaning
docker container stop $(docker ps -a | grep "fimperato/springboot-soap-server" | awk '{print $1}')
docker container rm $(docker ps -a | grep "fimperato/springboot-soap-server" | awk '{print $1}')
docker rmi fimperato/springboot-soap-server

# build image
docker image build -t fimperato/springboot-soap-server ./

# start container
docker container run -it --publish $server_port_value:8080 fimperato/springboot-soap-server
