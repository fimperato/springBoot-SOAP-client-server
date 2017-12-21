package it.myst.test.soap.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.myst.test.soap.flight.service.WebserviceXSiteFlightService;
import it.myst.test.wsdl.airport.client.GetAirportInformationByCountryResponse;

@RestController
public class SoapFlightController {
	
	@Autowired
	WebserviceXSiteFlightService webserviceXSiteService;

	@RequestMapping(method=RequestMethod.GET, value="/fligths/{cntry}", produces = { "application/xml"})
	public GetAirportInformationByCountryResponse lookup(@PathVariable String cntry) {
		return webserviceXSiteService.lookup(cntry);
	}

}
