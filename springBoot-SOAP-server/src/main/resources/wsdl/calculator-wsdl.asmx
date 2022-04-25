<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions
        xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
        xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/"
        xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/"
        xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/"
        xmlns:tns="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/"
        xmlns:s="http://www.w3.org/2001/XMLSchema"
        xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/"
        xmlns:http="http://schemas.xmlsoap.org/wsdl/http/"
        targetNamespace="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/"
        xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
    >
    <wsdl:types>
        <s:schema elementFormDefault="qualified" targetNamespace="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/">
            <s:element name="Add">
                <s:complexType>
                    <s:sequence>
                        <s:element minOccurs="1" maxOccurs="1" name="intA" type="s:int" />
                        <s:element minOccurs="1" maxOccurs="1" name="intB" type="s:int" />
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="AddResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element minOccurs="1" maxOccurs="1" name="AddResult" type="s:int" />
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="Subtract">
                <s:complexType>
                    <s:sequence>
                        <s:element minOccurs="1" maxOccurs="1" name="intA" type="s:int" />
                        <s:element minOccurs="1" maxOccurs="1" name="intB" type="s:int" />
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="SubtractResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element minOccurs="1" maxOccurs="1" name="SubtractResult" type="s:int" />
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="Multiply">
                <s:complexType>
                    <s:sequence>
                        <s:element minOccurs="1" maxOccurs="1" name="intA" type="s:int" />
                        <s:element minOccurs="1" maxOccurs="1" name="intB" type="s:int" />
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="MultiplyResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element minOccurs="1" maxOccurs="1" name="MultiplyResult" type="s:int" />
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="Divide">
                <s:complexType>
                    <s:sequence>
                        <s:element minOccurs="1" maxOccurs="1" name="intA" type="s:int" />
                        <s:element minOccurs="1" maxOccurs="1" name="intB" type="s:int" />
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="DivideResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element minOccurs="1" maxOccurs="1" name="DivideResult" type="s:int" />
                    </s:sequence>
                </s:complexType>
            </s:element>
        </s:schema>
    </wsdl:types>
    <wsdl:message name="AddSoapIn">
        <wsdl:part name="parameters" element="tns:Add" />
    </wsdl:message>
    <wsdl:message name="AddSoapOut">
        <wsdl:part name="parameters" element="tns:AddResponse" />
    </wsdl:message>
    <wsdl:message name="SubtractSoapIn">
        <wsdl:part name="parameters" element="tns:Subtract" />
    </wsdl:message>
    <wsdl:message name="SubtractSoapOut">
        <wsdl:part name="parameters" element="tns:SubtractResponse" />
    </wsdl:message>
    <wsdl:message name="MultiplySoapIn">
        <wsdl:part name="parameters" element="tns:Multiply" />
    </wsdl:message>
    <wsdl:message name="MultiplySoapOut">
        <wsdl:part name="parameters" element="tns:MultiplyResponse" />
    </wsdl:message>
    <wsdl:message name="DivideSoapIn">
        <wsdl:part name="parameters" element="tns:Divide" />
    </wsdl:message>
    <wsdl:message name="DivideSoapOut">
        <wsdl:part name="parameters" element="tns:DivideResponse" />
    </wsdl:message>
    <wsdl:portType name="CalculatorSoap">
        <wsdl:operation name="Add">
            <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Adds two integers. This is a test WebService. ©DNE Online</wsdl:documentation>
            <wsdl:input message="tns:AddSoapIn" />
            <wsdl:output message="tns:AddSoapOut" />
        </wsdl:operation>
        <wsdl:operation name="Subtract">
            <wsdl:input message="tns:SubtractSoapIn" />
            <wsdl:output message="tns:SubtractSoapOut" />
        </wsdl:operation>
        <wsdl:operation name="Multiply">
            <wsdl:input message="tns:MultiplySoapIn" />
            <wsdl:output message="tns:MultiplySoapOut" />
        </wsdl:operation>
        <wsdl:operation name="Divide">
            <wsdl:input message="tns:DivideSoapIn" />
            <wsdl:output message="tns:DivideSoapOut" />
        </wsdl:operation>
    </wsdl:portType>
    <wsdl:binding name="CalculatorSoap" type="tns:CalculatorSoap">
        <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
        <wsdl:operation name="Add">
            <soap:operation soapAction="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Add" style="document" />
            <wsdl:input>
                <soap:body use="literal" />
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal" />
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="Subtract">
            <soap:operation soapAction="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Subtract" style="document" />
            <wsdl:input>
                <soap:body use="literal" />
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal" />
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="Multiply">
            <soap:operation soapAction="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Multiply" style="document" />
            <wsdl:input>
                <soap:body use="literal" />
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal" />
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="Divide">
            <soap:operation soapAction="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Divide" style="document" />
            <wsdl:input>
                <soap:body use="literal" />
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal" />
            </wsdl:output>
        </wsdl:operation>
    </wsdl:binding>
    <wsdl:binding name="CalculatorSoap12" type="tns:CalculatorSoap">
        <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
        <wsdl:operation name="Add">
            <soap12:operation soapAction="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Add" style="document" />
            <wsdl:input>
                <soap12:body use="literal" />
            </wsdl:input>
            <wsdl:output>
                <soap12:body use="literal" />
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="Subtract">
            <soap12:operation soapAction="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Subtract" style="document" />
            <wsdl:input>
                <soap12:body use="literal" />
            </wsdl:input>
            <wsdl:output>
                <soap12:body use="literal" />
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="Multiply">
            <soap12:operation soapAction="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Multiply" style="document" />
            <wsdl:input>
                <soap12:body use="literal" />
            </wsdl:input>
            <wsdl:output>
                <soap12:body use="literal" />
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="Divide">
            <soap12:operation soapAction="http://calculator.wsdl.def.test.soap.fi.it/calculatorDef/Divide" style="document" />
            <wsdl:input>
                <soap12:body use="literal" />
            </wsdl:input>
            <wsdl:output>
                <soap12:body use="literal" />
            </wsdl:output>
        </wsdl:operation>
    </wsdl:binding>
    <wsdl:service name="Calculator">
        <wsdl:port name="CalculatorSoap" binding="tns:CalculatorSoap">
            <soap:address location="http://localhost:8080/springBoot-SOAP-server/ws/documentoDef.wsdl" />
        </wsdl:port>
        <wsdl:port name="CalculatorSoap12" binding="tns:CalculatorSoap12">
            <soap12:address location="http://localhost:8080/springBoot-SOAP-server/ws/documentoDef.wsdl" />
        </wsdl:port>
    </wsdl:service>
</wsdl:definitions>