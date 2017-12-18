package it.myst.test.soap.flight.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.myst.test.soap.flight.client.WebserviceXSiteFlightSoapClient;
import it.myst.test.wsdl.airport.client.GetAirportInformationByCountryResponse;

@Service
public class WebserviceXSiteFlightService {
	
	private static final Logger log = LoggerFactory.getLogger(WebserviceXSiteFlightService.class);
	
	@Autowired
	WebserviceXSiteFlightSoapClient webserviceXSiteSoapClient;
	
	public GetAirportInformationByCountryResponse lookup(String ticker) {
		return webserviceXSiteSoapClient.lookup(ticker);
	}
}
