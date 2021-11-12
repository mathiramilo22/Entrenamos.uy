
package webservices;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.9
 * 2021-11-12T11:03:35.976-03:00
 * Generated source version: 2.7.9
 * 
 */
public final class WSContentController_WSContentControllerPort_Client {

    private static final QName SERVICE_NAME = new QName("http://webServices/", "WSContentControllerService");

    private WSContentController_WSContentControllerPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = WSContentControllerService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        WSContentControllerService ss = new WSContentControllerService(wsdlURL, SERVICE_NAME);
        WSContentController port = ss.getWSContentControllerPort();  
        
        {
        System.out.println("Invoking post...");
        java.lang.String _post_arg0 = "_post_arg01210113504";
        java.lang.String _post_arg1 = "_post_arg11792331260";
        byte[] _post_arg2 = new byte[] {};
        try {
            port.post(_post_arg0, _post_arg1, _post_arg2);

        } catch (IOException_Exception e) { 
            System.out.println("Expected exception: IOException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking get...");
        java.lang.String _get_arg0 = "_get_arg0543605787";
        java.lang.String _get_arg1 = "_get_arg1861464850";
        try {
            byte[] _get__return = port.get(_get_arg0, _get_arg1);
            System.out.println("get.result=" + _get__return);

        } catch (IOException_Exception e) { 
            System.out.println("Expected exception: IOException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
