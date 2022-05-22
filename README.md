Spring SOAP Client-Server
==========================

Designing, implementing and testing client-server SOAP services with REST API utility interface. 

Project contains the following artifacts:

| Module | Description |
|---|---|
| springBoot-SOAP-server | SOAP server services project |
| springBoot-SOAP-client | SOAP client services project |

## Install
mvn clean install

## Usage

Sample usage for new service endpoint definition:

```java
    @Endpoint
    public class NewServiceEndpoint {
        // ...
        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "<Operation>")
        @ResponsePayload
        public <Response> add(@RequestPayload <Request> request) {
            return response;
        }
    }
```

## How to run
To run the base sample contained in project or additional new SOAP services, first you need to run server:

```
    cd springBoot-SOAP-server
    ./start-server.sh
```    

Then run client with SOAP services integration and REST API utility: 

```
    cd springBoot-SOAP-client
    ./start-client.sh
```

Base sample SOAP service check:

`$ curl http://localhost:8081/springBoot-SOAP-client/add/10/25`

```
    <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    <AddResponse xmlns="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/">
        <AddResult>35</AddResult>
    </AddResponse>
```

## Graphical interface to build new simple service from WSDL definition

A graphical user interface builder for simple WSDL definition accessible at the following link: 

https://fimperato.herokuapp.com/soap-service-builder

WSDL file built can be downloaded by GUI. Then run the server with WSDL file path and name to start the server with new service class definitions.

```./start-server.sh -s 8082 -w "$HOME/temp/services" -n "new-soap-service.wsdl"```

![alt text](https://github.com/fimperato/springBoot-SOAP-client-server/blob/master/utility/images/graphicalInterfaceWSDLBuilder.png?raw=true)

