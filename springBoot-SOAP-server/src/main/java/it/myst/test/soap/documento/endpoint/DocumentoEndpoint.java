package it.myst.test.soap.documento.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import it.myst.test.soap.documento.dao.DocumentoDAO;
import it.myst.test.soap.documentodef.Documento;
import it.myst.test.soap.documentodef.GetDocumentoRequest;
import it.myst.test.soap.documentodef.GetDocumentoResponse;
import it.myst.test.soap.documentodef.UploadDocumentoRequest;
import it.myst.test.soap.exception.DocumentoResourceNotFoundException;
import it.myst.test.soap.exception.ResourceNotFoundException;

@Endpoint
public class DocumentoEndpoint {
	private static final String NAMESPACE_URI = "http://soap.test.myst.it/documentoDef";

	private DocumentoDAO documentoDAO;

	@Autowired
	public DocumentoEndpoint(DocumentoDAO documentoDAO) {
		this.documentoDAO = documentoDAO;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDocumentoRequest")
	@ResponsePayload
	public GetDocumentoResponse getByFilename(@RequestPayload GetDocumentoRequest request) throws DocumentoResourceNotFoundException {
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
		GetDocumentoResponse response = new GetDocumentoResponse();
		response.setDocumento(documentoDAO.upload(request.getDocumento()));

		return response;
	}
}
