//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.30 alle 12:03:58 PM CET 
//


package it.myst.test.soap.documentodef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per documento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="documento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="byte" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userSave" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documento", propOrder = {
    "id",
    "title",
    "filename",
    "_byte",
    "documentoType",
    "userSave"
})
public class Documento {

    protected long id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String filename;
    @XmlElement(name = "byte", required = true)
    protected String _byte;
    @XmlElement(required = true)
    protected String documentoType;
    @XmlElement(required = true)
    protected String userSave;

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Imposta il valore della proprietà title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Recupera il valore della proprietà filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Imposta il valore della proprietà filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Recupera il valore della proprietà byte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByte() {
        return _byte;
    }

    /**
     * Imposta il valore della proprietà byte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByte(String value) {
        this._byte = value;
    }

    /**
     * Recupera il valore della proprietà documentoType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoType() {
        return documentoType;
    }

    /**
     * Imposta il valore della proprietà documentoType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoType(String value) {
        this.documentoType = value;
    }

    /**
     * Recupera il valore della proprietà userSave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSave() {
        return userSave;
    }

    /**
     * Imposta il valore della proprietà userSave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSave(String value) {
        this.userSave = value;
    }

}
