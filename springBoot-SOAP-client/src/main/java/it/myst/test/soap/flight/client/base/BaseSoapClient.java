package it.myst.test.soap.flight.client.base;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@ConfigurationProperties(prefix = "it.myst.test.soap")
public class BaseSoapClient extends WebServiceGatewaySupport {
	private static final Logger log = LoggerFactory.getLogger(BaseSoapClient.class);
	
	private String generatePackage;
	
	protected String defaultGeneratePackage;
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in pom.xml
		if(generatePackage==null) {
			generatePackage=this.defaultGeneratePackage;
		}
		marshaller.setContextPath(generatePackage);
		return marshaller;
	}

	public String getGeneratePackage() {
		return generatePackage;
	}

	public void setGeneratePackage(String generatePackage) {
		this.generatePackage = generatePackage;
	}

	
	@PostConstruct
	protected void init() {
		this.setDefaultUri(getDefaultUri());
		this.setMarshaller(marshaller());
		this.setUnmarshaller(marshaller());
	}

	public Object GetResponse (Object request, String soapActionCallBack) {
		return this.GetResponse(request, soapActionCallBack, getDefaultUri());
		
	}
	
	public Object GetResponse(Object request, String soapActionCallBack, String uri){
		
		log.debug("The request is: " + request.toString());
		Object response = getWebServiceTemplate()
				.marshalSendAndReceive(uri,
						request,
						new SoapActionCallback(soapActionCallBack));
		
		return response;
		
	}

	public String getDefaultGeneratePackage() {
		return defaultGeneratePackage;
	}

	public void setDefaultGeneratePackage(String defaultGeneratePackage) {
		this.defaultGeneratePackage = defaultGeneratePackage;
	}

}
