# SOAP web service (Documento management)

Wsdl path: <host>:<port>/ws/documentoDef.wsdl .

Request url: <host>:<port>/ws

Request header: [{"key":"Content-Type","value":"text/xml","description":"","enabled":true}]
Example Request body: test_soap_requests/getDocumentoByFilename.xml

## commands
mvn jaxb2:xjc
mvn clean generate-sources
mvn eclipse:eclipse (to force build path by maven settings)

#### other (header security, more method to soap endpoint, https)
