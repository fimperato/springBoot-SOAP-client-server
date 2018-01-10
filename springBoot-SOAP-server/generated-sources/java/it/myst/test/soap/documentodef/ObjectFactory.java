//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.01.09 alle 03:40:11 PM CET 
//


package it.myst.test.soap.documentodef;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.myst.test.soap.documentodef package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.myst.test.soap.documentodef
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDocumentoRequest }
     * 
     */
    public GetDocumentoRequest createGetDocumentoRequest() {
        return new GetDocumentoRequest();
    }

    /**
     * Create an instance of {@link UploadDocumentoRequest }
     * 
     */
    public UploadDocumentoRequest createUploadDocumentoRequest() {
        return new UploadDocumentoRequest();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link GetDocumentoResponse }
     * 
     */
    public GetDocumentoResponse createGetDocumentoResponse() {
        return new GetDocumentoResponse();
    }

}
