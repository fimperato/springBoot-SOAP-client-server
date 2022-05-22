# SOAP web service (Documento, Calaculator, initial services)

Wsdl path: 

`<host>:<port>/ws/documentoDef.wsdl`
`<host>:<port>/ws/calculatorDef.wsdl`

(e.g. http://localhost:8080/springBoot-SOAP-server/ws/calculatorDef.wsdl)

Request url: 

`<host>:<port>/ws`

Request header: 

`[{"key":"Content-Type","value":"text/xml","description":"","enabled":true}]`

Example Request body: 

`test_soap_requests/getDocumentoByFilename.xml`

## generate source and package commands
`mvn jaxb2:xjc`

`mvn clean generate-sources`

`mvn clean package -Denv=local -Pcxf-codegen-sources`

## Https: 

`https://<host>:8443/springBoot-SOAP-server/ws/documentoDef.wsdl`


## Dockerize app (war) case
### docker clean and image build -t your_name/some-app location_of_dockerfile and running container

```
$ mvn clean package -Denv=local -Pspring-server -Pcxf-codegen-sources
docker container stop $(docker ps -a | grep "fimperato/springboot-soap-server" | awk '{print $1}')
docker container rm $(docker ps -a | grep "fimperato/springboot-soap-server" | awk '{print $1}')
docker rmi fimperato/springboot-soap-server
docker image build -t fimperato/springboot-soap-server ./
docker container run -it --publish 8081:8080 --network=host fimperato/springboot-soap-server

```

## Sh file, call example

`./start-server.sh -s 8082 -w "$HOME/temp/services" -n "new-soap-service.wsdl" `
