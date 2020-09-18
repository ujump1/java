
package webClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webClient package. 
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

    private final static QName _Hello_QNAME = new QName("http://webService/", "Hello");
    private final static QName _HelloResponse_QNAME = new QName("http://webService/", "HelloResponse");
    private final static QName _Love_QNAME = new QName("http://webService/", "Love");
    private final static QName _LoveResponse_QNAME = new QName("http://webService/", "LoveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoveResponse }
     * 
     */
    public LoveResponse createLoveResponse() {
        return new LoveResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Love }
     * 
     */
    public Love createLove() {
        return new Love();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "Hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "HelloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Love }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "Love")
    public JAXBElement<Love> createLove(Love value) {
        return new JAXBElement<Love>(_Love_QNAME, Love.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "LoveResponse")
    public JAXBElement<LoveResponse> createLoveResponse(LoveResponse value) {
        return new JAXBElement<LoveResponse>(_LoveResponse_QNAME, LoveResponse.class, null, value);
    }

}
