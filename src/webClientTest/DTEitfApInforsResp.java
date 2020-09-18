
package webClientTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_EitfApInfors_Resp complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡresponsestatus���Ե�ֵ��
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
     * ����responsestatus���Ե�ֵ��
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
     * ��ȡresponsemessage���Ե�ֵ��
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
     * ����responsemessage���Ե�ֵ��
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
     * ��ȡresponseresult���Ե�ֵ��
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
     * ����responseresult���Ե�ֵ��
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
     * ��ȡsuccess���Ե�ֵ��
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
     * ����success���Ե�ֵ��
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
