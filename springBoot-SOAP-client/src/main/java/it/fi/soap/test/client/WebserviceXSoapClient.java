package it.fi.soap.test.client;

import it.fi.soap.test.client.base.BaseSoapClient;
import it.fi.soap.test.def.wsdl.Add;
import it.fi.soap.test.def.wsdl.AddResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration
@ConfigurationProperties(prefix = "it.fi.soap.test.def.wsdl")
public class WebserviceXSoapClient extends BaseSoapClient {

	@Value("${it.soap.test.def.wsdl.server.defaultHost}")
	private String serverDefaultHost;
	@Value("${it.soap.test.def.wsdl.server.defaultUriPath}")
	private String serverDefaultUriPath;
	@Value("${it.soap.test.def.wsdl.server.envHost}")
	private String serverEnvHost;

	private static final Logger log = LoggerFactory.getLogger(WebserviceXSoapClient.class);

	public WebserviceXSoapClient() {
		super();
		setDefaultGeneratePackage("it.fi.soap.test.def.wsdl");
	}

	public AddResponse lookup(int a, int b) {
		log.info("WebService SOAP client build request and get response by WebServiceTemplate");
        Add request = new Add();
		request.setIntA(a);
		request.setIntB(b);

		String serverUri = "http://" + (StringUtils.isEmpty(serverEnvHost) ? serverDefaultHost : serverEnvHost) + serverDefaultUriPath;
		AddResponse response =
				(AddResponse) this.GetResponse(
						request,
						"http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Add", // "http://tempuri.org/Add"
						serverUri // "http://www.dneonline.com/calculator.asmx"
				);
		log.info("The response is: " + response.toString());
		return response;
	}

}
