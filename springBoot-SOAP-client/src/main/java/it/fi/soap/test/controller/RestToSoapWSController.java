package it.fi.soap.test.controller;

import it.fi.soap.test.def.wsdl.AddResponse;
import it.fi.soap.test.service.SoapWebserviceXExecuteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestToSoapWSController {

	private static final Logger log = LoggerFactory.getLogger(RestToSoapWSController.class);

	@Autowired
	SoapWebserviceXExecuteService soapWebserviceXExecuteService;

	/**
	 * REST API to SOAP service client
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,
			value="/add/{a}/{b}",
			produces = { "application/xml"} )
	public AddResponse lookup(@PathVariable Integer a, @PathVariable Integer b) {
		log.info("REST API data call to webService SOAP client");
		return soapWebserviceXExecuteService.lookup(a, b);
	}

	/**
	 * Check if application and REST API is up
	 *
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,
			value="/rest-to-soap-api-up",
			produces = { "application/xml", "application/json" }
	)
	public String lookup() {
		log.info("rest-to-soap-api-up");
		return "test";
	}

}
