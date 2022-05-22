
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package it.fi.soap.test.def.wsdl.calculator;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.2
 * Generated source version: 3.4.2
 *
 */

@javax.jws.WebService(
                      serviceName = "Calculator",
                      portName = "CalculatorSoap",
                      targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/",
                      wsdlLocation = "file:/home/francesco/repositories/github/springBoot-SOAP-client-server/springBoot-SOAP-server/src/main/resources/wsdl/calculator-wsdl.asmx",
                      endpointInterface = "it.fi.soap.test.def.wsdl.calculator.CalculatorSoap")

public class CalculatorSoapImpl implements CalculatorSoap {

    private static final Logger LOG = Logger.getLogger(CalculatorSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see it.fi.soap.test.def.wsdl.calculator.CalculatorSoap#add(int intA, int intB)*
     */
    public int add(int intA, int intB) {
        LOG.info("Executing operation add");
        System.out.println(intA);
        System.out.println(intB);
        try {
            int _return = 0;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see it.fi.soap.test.def.wsdl.calculator.CalculatorSoap#subtract(int intA, int intB)*
     */
    public int subtract(int intA, int intB) {
        LOG.info("Executing operation subtract");
        System.out.println(intA);
        System.out.println(intB);
        try {
            int _return = 0;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see it.fi.soap.test.def.wsdl.calculator.CalculatorSoap#divide(int intA, int intB)*
     */
    public int divide(int intA, int intB) {
        LOG.info("Executing operation divide");
        System.out.println(intA);
        System.out.println(intB);
        try {
            int _return = 0;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see it.fi.soap.test.def.wsdl.calculator.CalculatorSoap#multiply(int intA, int intB)*
     */
    public int multiply(int intA, int intB) {
        LOG.info("Executing operation multiply");
        System.out.println(intA);
        System.out.println(intB);
        try {
            int _return = 0;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
