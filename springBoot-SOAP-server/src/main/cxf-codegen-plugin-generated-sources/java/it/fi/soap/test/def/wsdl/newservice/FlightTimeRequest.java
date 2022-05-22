
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
 *         &amp;lt;element name="boardingTime" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="flightTime" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
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
    "boardingTime",
    "flightTime"
})
@XmlRootElement(name = "FlightTimeRequest")
public class FlightTimeRequest {

    protected double boardingTime;
    protected int flightTime;

    /**
     * Recupera il valore della proprietà boardingTime.
     * 
     */
    public double getBoardingTime() {
        return boardingTime;
    }

    /**
     * Imposta il valore della proprietà boardingTime.
     * 
     */
    public void setBoardingTime(double value) {
        this.boardingTime = value;
    }

    /**
     * Recupera il valore della proprietà flightTime.
     * 
     */
    public int getFlightTime() {
        return flightTime;
    }

    /**
     * Imposta il valore della proprietà flightTime.
     * 
     */
    public void setFlightTime(int value) {
        this.flightTime = value;
    }

}
