# SOAP webservice client for Spring Boot

SOAP client hide the SOAP details from the business logic

## Launch:
  - Spring boot app
  - it.myst.test.flight to launch a simple SOAP Client test

### generate stub with:
#### (se configuration tag è esterno a execution tag):
mvn -Pspring-client jaxb2:generate
#### (se configuration tag è interno a execution tag): if you run mvn jaxb2:generate maven doesn't use the configuration inside the execution. You have already declared a phase on which your executions should be bound, so just run mvn generate-sources. Rif. https://maven.apache.org/guides/mini/guide-configuring-plugins.html#Using_the_executions_Tag :
#### Note: Configurations inside the <executions> tag differ from those that are outside <executions> in that they cannot be used from a direct command line invocation. Instead they are only applied when the lifecycle phase they are bound to are invoked. Alternatively, if you move a configuration section outside of the executions section, it will apply globally to all invocations of the plugin.
mvn -Pspring-client generate-sources

## lancio service per chiamata verso endpoint SOAP
curl http://localhost:8080/springBoot-SOAP-client-0.0.1-SNAPSHOT/fligths/italy



