
package it.fi.soap.test.def.wsdl.newservice;

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
 *         &amp;lt;element name="totalFlightTime" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
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
    "totalFlightTime"
})
@XmlRootElement(name = "FlightTimeResponse")
public class FlightTimeResponse {

    protected double totalFlightTime;

    /**
     * Recupera il valore della proprietà totalFlightTime.
     * 
     */
    public double getTotalFlightTime() {
        return totalFlightTime;
    }

    /**
     * Imposta il valore della proprietà totalFlightTime.
     * 
     */
    public void setTotalFlightTime(double value) {
        this.totalFlightTime = value;
    }

}
