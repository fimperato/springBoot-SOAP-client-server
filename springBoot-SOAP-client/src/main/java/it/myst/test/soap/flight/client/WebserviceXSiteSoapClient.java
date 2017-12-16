package it.myst.test.soap.flight.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import it.myst.test.soap.client.SoapClient;
import it.myst.test.wsdl.GetAirportInformationByCountry;
import it.myst.test.wsdl.GetAirportInformationByCountryResponse;

@Configuration
@ConfigurationProperties(prefix = "it.myst.test.flight.soap")
public class WebserviceXSiteSoapClient extends SoapClient {
	private static final Logger log = LoggerFactory.getLogger(WebserviceXSiteSoapClient.class);

	public GetAirportInformationByCountryResponse lookup(String cntry) {
		GetAirportInformationByCountry request = new GetAirportInformationByCountry();
		request.setCountry(cntry);
		
		GetAirportInformationByCountryResponse response = 
				(GetAirportInformationByCountryResponse) this.GetResponse(request, "http://www.webserviceX.NET/GetAirportInformationByCountry", "http://www.webservicex.net/airport.asmx");
		log.info("The response is: " + response.toString());
		return response;
	}
	
}
