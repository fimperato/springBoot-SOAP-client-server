package it.myst.test.soap.flight.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.myst.test.soap.flight.client.MyDocumentoSoapClient;
import it.myst.test.wsdl.documento.client.GetDocumentoResponse;

@Service
public class MyDocumentoService {
	
	private static final Logger log = LoggerFactory.getLogger(MyDocumentoService.class);
	
	@Autowired
	MyDocumentoSoapClient myDocumentoSoapClient;
	
	public GetDocumentoResponse lookup(String ticker) {
		log.debug("ticker is: "+ticker);
		
		return myDocumentoSoapClient.lookup(ticker);
	}
}
