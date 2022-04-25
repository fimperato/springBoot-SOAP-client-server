package it.fi.soap.test.service;

import it.fi.soap.test.client.WebserviceXSoapClient;
import it.fi.soap.test.def.wsdl.AddResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoapWebserviceXExecuteService {

	private static final Logger log = LoggerFactory.getLogger(SoapWebserviceXExecuteService.class);

	@Autowired
	WebserviceXSoapClient webserviceXSoapClient;

	public AddResponse lookup(int a, int b) {
		log.info("service layer call webService X SOAP client");
		return webserviceXSoapClient.lookup(a, b);
	}
}
