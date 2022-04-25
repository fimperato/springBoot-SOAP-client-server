package it.fi.soap.test.documento.endpoint;

import it.fi.soap.test.def.wsdl.calculator.Add;
import it.fi.soap.test.def.wsdl.calculator.AddResponse;
import it.fi.soap.test.def.wsdl.documento.documentodef.Documento;
import it.fi.soap.test.def.wsdl.documento.documentodef.GetDocumentoRequest;
import it.fi.soap.test.def.wsdl.documento.documentodef.GetDocumentoResponse;
import it.fi.soap.test.def.wsdl.documento.documentodef.UploadDocumentoRequest;
import it.fi.soap.test.documento.dao.DocumentoDAO;
import it.fi.soap.test.exception.DocumentoResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.logging.Logger;

@Endpoint
public class CalculatorEndpoint {

	private static final Logger log = Logger.getLogger(CalculatorEndpoint.class.getName());

	private static final String NAMESPACE_URI = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/";

	@Autowired
	public CalculatorEndpoint() {

	}


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "Add")
	@ResponsePayload
	public AddResponse add(@RequestPayload Add request) {
		log.info("### Operation add ###");
		AddResponse response = new AddResponse();

		// implementation here

		response.setAddResult(request.getIntA() + request.getIntB());

		return response;
	}
}
