package it.myst.test.soap.flight.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.myst.test.soap.flight.client.WebserviceXSiteSoapClient;
import it.myst.test.wsdl.GetAirportInformationByCountryResponse;

@Service
public class WebserviceXSiteService {
	
	private static final Logger log = LoggerFactory.getLogger(WebserviceXSiteService.class);
	
	@Autowired
	WebserviceXSiteSoapClient webserviceXSiteSoapClient;
	
	public GetAirportInformationByCountryResponse lookup(String ticker) {
		return webserviceXSiteSoapClient.lookup(ticker);
	}
}
