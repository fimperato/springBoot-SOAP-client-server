
package it.fi.soap.test.def.wsdl.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per anonymous complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="intA" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="intB" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intA",
    "intB"
})
@XmlRootElement(name = "Multiply")
public class Multiply {

    protected int intA;
    protected int intB;

    /**
     * Recupera il valore della proprietà intA.
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * Imposta il valore della proprietà intA.
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * Recupera il valore della proprietà intB.
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * Imposta il valore della proprietà intB.
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}
