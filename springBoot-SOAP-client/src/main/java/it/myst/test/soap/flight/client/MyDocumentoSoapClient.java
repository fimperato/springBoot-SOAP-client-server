package it.myst.test.soap.flight.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import it.myst.test.soap.flight.client.base.BaseSoapClient;
import it.myst.test.wsdl.documento.client.GetDocumentoRequest;
import it.myst.test.wsdl.documento.client.GetDocumentoResponse;

@Configuration
@ConfigurationProperties(prefix = "it.myst.test.documento.soap")
public class MyDocumentoSoapClient extends BaseSoapClient {
	
	private static final Logger log = LoggerFactory.getLogger(MyDocumentoSoapClient.class);

	public MyDocumentoSoapClient() {
		super();
		setDefaultGeneratePackage("it.myst.test.wsdl.documento.client");
	}
	
	public GetDocumentoResponse lookup(String filename) {
		GetDocumentoRequest request = new GetDocumentoRequest();
		request.setFilename(filename);
		GetDocumentoResponse response = null;
		
		try {
			response = 
					(GetDocumentoResponse) this.GetResponse(request, "http://localhost:8081/GetDocumentoRequest", "http://localhost:8081/springBoot-SOAP-server/ws/documentoDef.wsdl");
			// war version: http://localhost:8081/springBoot-SOAP-server/ws/documentoDef.wsdl
			// jar version: http://localhost:8081/ws/documentoDef.wsdl
		} catch(Exception e) {
			log.error("Chiamata service senza esito positivo. "+e.getMessage());
		}
		log.info("The response is: " + (response==null?"N.D.":response.toString()) );
		
		return response;
	}
	
}
