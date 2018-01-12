package it.myst.test.soap.flight.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.myst.test.soap.flight.service.MyDocumentoService;
import it.myst.test.wsdl.documento.client.GetDocumentoResponse;

@RestController
public class SoapMyDocumentoController {
	
	@Autowired
	MyDocumentoService myDocumentoService;

	@RequestMapping(method=RequestMethod.GET, 
			value = {"/documenti/{filename}", "/documenti/{filename}/{fileformat}"},
			produces = { "application/xml"})
	public GetDocumentoResponse lookup(@PathVariable String filename, 
			@PathVariable Optional<String> fileformat) {
		String format=null;
		if(fileformat.isPresent()) {
			format=fileformat.get();
		}
		filename = filename+(format==null?"":"."+format);
		return myDocumentoService.lookup(filename);
	}

}
