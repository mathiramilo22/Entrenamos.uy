package webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.9
 * 2021-11-12T11:03:36.049-03:00
 * Generated source version: 2.7.9
 * 
 */
@WebServiceClient(name = "WSContentControllerService", 
                  wsdlLocation = "http://localhost:9129/entrenamosuy/contentController?wsdl",
                  targetNamespace = "http://webServices/") 
public class WSContentControllerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webServices/", "WSContentControllerService");
    public final static QName WSContentControllerPort = new QName("http://webServices/", "WSContentControllerPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9129/entrenamosuy/contentController?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WSContentControllerService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:9129/entrenamosuy/contentController?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WSContentControllerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSContentControllerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSContentControllerService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WSContentControllerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WSContentControllerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WSContentControllerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns WSContentController
     */
    @WebEndpoint(name = "WSContentControllerPort")
    public WSContentController getWSContentControllerPort() {
        return super.getPort(WSContentControllerPort, WSContentController.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSContentController
     */
    @WebEndpoint(name = "WSContentControllerPort")
    public WSContentController getWSContentControllerPort(WebServiceFeature... features) {
        return super.getPort(WSContentControllerPort, WSContentController.class, features);
    }

}
