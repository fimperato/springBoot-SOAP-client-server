# SOAP webservice client with Spring Boot

## Only maven execution to generate SOAP service stub

`mvn -Pspring-client -Pjaxb2-sources jaxb2:generate`

### configuration tag not external to execution tag - generate-sources phase  
    If you run mvn jaxb2:generate maven doesn't use the configuration inside the execution. You have already declared a phase on which your executions should be bound, so just run mvn generate-sources. Rif. https://maven.apache.org/guides/mini/guide-configuring-plugins.html#Using_the_executions_Tag :
    Note: Configurations inside the <executions> tag differ from those that are outside <executions> in that they cannot be used from a direct command line invocation. Instead they are only applied when the lifecycle phase they are bound to are invoked. Alternatively, if you move a configuration section outside of the executions section, it will apply globally to all invocations of the plugin.

`mvn -Pspring-client -Pjaxb2-sources generate-sources`

### Maven commands before package deploy

`$ mvn clean prepare-package -Denv=local -Pspring-client -Pjaxb2-sources`

`$ mvn clean package`


## With local tomcat installation
### check tomcat logs after war deploy

`$ tail -f -n500 /var/log/tomcat9/catalina.yyyy-MM-dd.log`

## Dockerize app (war) case
### docker clean and image build -t your_name/some-app location_of_dockerfile and running container

```$ mvn clean package -Denv=local -Pspring-client -Pcxf-codegen-sources
docker container stop $(docker ps -a | grep "fimperato/springboot-soap-client" | awk '{print $1}')
docker container rm $(docker ps -a | grep "fimperato/springboot-soap-client" | awk '{print $1}')
docker rmi fimperato/springboot-soap-client
docker image build -t fimperato/springboot-soap-client ./
docker container run -it --publish 8081:8080 fimperato/springboot-soap-client

```

### Or only step creating and running container

`$ docker container run -it --publish 8081:8080 fimperato/springboot-soap-client`

### check container logs

`$ docker exec -it $(docker ps -a | grep "fimperato/springboot-soap-client" | awk '{print $NF}') /bin/bash`

## SOAP service check

`$ curl http://localhost:8081/springBoot-SOAP-client/rest-to-soap-api-up`

## SOAP service call by REST utils API

`$ curl http://localhost:8081/springBoot-SOAP-client/add/1/9`

`<?xml version="1.0" encoding="UTF-8" standalone="yes"?><AddResponse><AddResult>10</AddResult></AddResponse>`


