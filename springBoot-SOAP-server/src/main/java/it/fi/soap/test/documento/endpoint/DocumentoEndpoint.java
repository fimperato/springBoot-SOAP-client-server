package it.fi.soap.test.documento.endpoint;

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
public class DocumentoEndpoint {

	private static final Logger log = Logger.getLogger(DocumentoEndpoint.class.getName());

	private static final String NAMESPACE_URI = "http://documento.wsdl.def.test.soap.fi.it/documentoDef";

	private DocumentoDAO documentoDAO;

	@Autowired
	public DocumentoEndpoint(DocumentoDAO documentoDAO) {
		this.documentoDAO = documentoDAO;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDocumentoRequest")
	@ResponsePayload
	public GetDocumentoResponse getByFilename(@RequestPayload GetDocumentoRequest request) throws DocumentoResourceNotFoundException {
		log.info("### Operation getDocumento ###");
		GetDocumentoResponse response = new GetDocumentoResponse();
		
		String resourceId = request.getFilename();
		Documento documento = documentoDAO.getDocumentoByFilename(resourceId);
		 if (documento == null) {
			 throw new DocumentoResourceNotFoundException(resourceId, 
					 "Nessun documento trovato per filename: "+resourceId);
		}
		response.setDocumento(documento);
		
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "uploadDocumentoRequest")
	@ResponsePayload
	public GetDocumentoResponse upload(@RequestPayload UploadDocumentoRequest request) {
		log.info("### Operation uploadDocumento ###");
		GetDocumentoResponse response = new GetDocumentoResponse();
		response.setDocumento(documentoDAO.upload(request.getDocumento()));

		return response;
	}
}
