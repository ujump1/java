
package webClientTest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webClientTest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MTEitfApInforsReq_QNAME = new QName("urn:newhope.com/SSC/Financial/Outbound", "MT_EitfApInfors_Req");
    private final static QName _MTEitfApInforsResp_QNAME = new QName("urn:newhope.com/SSC/Financial/Outbound", "MT_EitfApInfors_Resp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webClientTest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTEitfApInforsReq }
     * 
     */
    public DTEitfApInforsReq createDTEitfApInforsReq() {
        return new DTEitfApInforsReq();
    }

    /**
     * Create an instance of {@link DTEitfApInforsReq.CONTEXT }
     * 
     */
    public DTEitfApInforsReq.CONTEXT createDTEitfApInforsReqCONTEXT() {
        return new DTEitfApInforsReq.CONTEXT();
    }

    /**
     * Create an instance of {@link DTEitfApInforsResp }
     * 
     */
    public DTEitfApInforsResp createDTEitfApInforsResp() {
        return new DTEitfApInforsResp();
    }

    /**
     * Create an instance of {@link DTEitfApInforsReq.HEADER }
     * 
     */
    public DTEitfApInforsReq.HEADER createDTEitfApInforsReqHEADER() {
        return new DTEitfApInforsReq.HEADER();
    }

    /**
     * Create an instance of {@link DTEitfApInforsReq.CONTEXT.RECORD }
     * 
     */
    public DTEitfApInforsReq.CONTEXT.RECORD createDTEitfApInforsReqCONTEXTRECORD() {
        return new DTEitfApInforsReq.CONTEXT.RECORD();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTEitfApInforsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:newhope.com/SSC/Financial/Outbound", name = "MT_EitfApInfors_Req")
    public JAXBElement<DTEitfApInforsReq> createMTEitfApInforsReq(DTEitfApInforsReq value) {
        return new JAXBElement<DTEitfApInforsReq>(_MTEitfApInforsReq_QNAME, DTEitfApInforsReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTEitfApInforsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:newhope.com/SSC/Financial/Outbound", name = "MT_EitfApInfors_Resp")
    public JAXBElement<DTEitfApInforsResp> createMTEitfApInforsResp(DTEitfApInforsResp value) {
        return new JAXBElement<DTEitfApInforsResp>(_MTEitfApInforsResp_QNAME, DTEitfApInforsResp.class, null, value);
    }

}
