package it.fi.soap.test.def.wsdl.newservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.2
 * Generated source version: 3.4.2
 *
 */
@WebServiceClient(name = "AirService",
                  wsdlLocation = "file:/home/francesco/repositories/github/springBoot-SOAP-client-server/springBoot-SOAP-server/target/classes/wsdl/new-service/new-soap-service.wsdl",
                  targetNamespace = "http://airservice.wsdl.def.test.soap.fi.it/airDef/")
public class AirService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://airservice.wsdl.def.test.soap.fi.it/airDef/", "AirService");
    public final static QName AirServiceSoap = new QName("http://airservice.wsdl.def.test.soap.fi.it/airDef/", "AirServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/francesco/repositories/github/springBoot-SOAP-client-server/springBoot-SOAP-server/target/classes/wsdl/new-service/new-soap-service.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AirService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/francesco/repositories/github/springBoot-SOAP-client-server/springBoot-SOAP-server/target/classes/wsdl/new-service/new-soap-service.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AirService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AirService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AirService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AirService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AirService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AirService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AirServiceSoap
     */
    @WebEndpoint(name = "AirServiceSoap")
    public AirServiceSoap getAirServiceSoap() {
        return super.getPort(AirServiceSoap, AirServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirServiceSoap
     */
    @WebEndpoint(name = "AirServiceSoap")
    public AirServiceSoap getAirServiceSoap(WebServiceFeature... features) {
        return super.getPort(AirServiceSoap, AirServiceSoap.class, features);
    }

}
