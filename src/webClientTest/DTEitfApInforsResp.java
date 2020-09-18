
package webClientTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_EitfApInfors_Resp complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_EitfApInfors_Resp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESPONSE_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RESPONSE_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RESPONSE_RESULT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="success" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_EitfApInfors_Resp", propOrder = {
    "responsestatus",
    "responsemessage",
    "responseresult"
})
public class DTEitfApInforsResp {

    @XmlElement(name = "RESPONSE_STATUS", required = true)
    protected String responsestatus;
    @XmlElement(name = "RESPONSE_MESSAGE", required = true)
    protected String responsemessage;
    @XmlElement(name = "RESPONSE_RESULT", required = true)
    protected String responseresult;
    @XmlAttribute(name = "success")
    protected String success;

    /**
     * 获取responsestatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSESTATUS() {
        return responsestatus;
    }

    /**
     * 设置responsestatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSESTATUS(String value) {
        this.responsestatus = value;
    }

    /**
     * 获取responsemessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSEMESSAGE() {
        return responsemessage;
    }

    /**
     * 设置responsemessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSEMESSAGE(String value) {
        this.responsemessage = value;
    }

    /**
     * 获取responseresult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSERESULT() {
        return responseresult;
    }

    /**
     * 设置responseresult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSERESULT(String value) {
        this.responseresult = value;
    }

    /**
     * 获取success属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccess() {
        return success;
    }

    /**
     * 设置success属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccess(String value) {
        this.success = value;
    }

}
