package it.fi.soap.test.exception;

public class DocumentoResourceNotFoundException extends Exception implements ResourceNotFoundException<String> {

	private static final long serialVersionUID = -7511786857262100589L;

	private String resourceId;
	
    public DocumentoResourceNotFoundException(String resourceId, String message) {
        super(message);
        this.resourceId = resourceId;
    }

	@Override
    public String getResourceId() {
		return resourceId;
	}
    
}
