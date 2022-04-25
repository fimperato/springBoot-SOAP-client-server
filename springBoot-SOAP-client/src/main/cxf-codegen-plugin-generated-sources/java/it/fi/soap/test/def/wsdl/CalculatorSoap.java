package it.fi.soap.test.def.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.2
 * 2022-04-25T17:35:21.612+02:00
 * Generated source version: 3.4.2
 *
 */
@WebService(targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/", name = "CalculatorSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface CalculatorSoap {

    /**
     * Adds two integers. This is a test WebService. ©DNE Online
     */
    @WebMethod(operationName = "Add", action = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Add")
    @RequestWrapper(localName = "Add", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/", className = "it.fi.soap.test.def.wsdl.Add")
    @ResponseWrapper(localName = "AddResponse", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/", className = "it.fi.soap.test.def.wsdl.AddResponse")
    @WebResult(name = "AddResult", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
    public int add(

        @WebParam(name = "intA", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
        int intB
    );

    @WebMethod(operationName = "Subtract", action = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Subtract")
    @RequestWrapper(localName = "Subtract", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/", className = "it.fi.soap.test.def.wsdl.Subtract")
    @ResponseWrapper(localName = "SubtractResponse", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/", className = "it.fi.soap.test.def.wsdl.SubtractResponse")
    @WebResult(name = "SubtractResult", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
    public int subtract(

        @WebParam(name = "intA", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
        int intB
    );

    @WebMethod(operationName = "Divide", action = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Divide")
    @RequestWrapper(localName = "Divide", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/", className = "it.fi.soap.test.def.wsdl.Divide")
    @ResponseWrapper(localName = "DivideResponse", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/", className = "it.fi.soap.test.def.wsdl.DivideResponse")
    @WebResult(name = "DivideResult", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
    public int divide(

        @WebParam(name = "intA", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
        int intB
    );

    @WebMethod(operationName = "Multiply", action = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Multiply")
    @RequestWrapper(localName = "Multiply", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/", className = "it.fi.soap.test.def.wsdl.Multiply")
    @ResponseWrapper(localName = "MultiplyResponse", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/", className = "it.fi.soap.test.def.wsdl.MultiplyResponse")
    @WebResult(name = "MultiplyResult", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
    public int multiply(

        @WebParam(name = "intA", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/")
        int intB
    );
}