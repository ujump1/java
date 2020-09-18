
package webClientTest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_EitfApInfors_Req complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_EitfApInfors_Req">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HEADER">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SYSTEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="REQUEST_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IF_CATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IF_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="USER_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BATCH_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TOTAL_SEG_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SEG_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CONTEXT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RECORD" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PAY_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PAY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="HD_REMARK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ASSET_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ASSET_CARD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LN_REMARK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_EitfApInfors_Req", propOrder = {
    "header",
    "context"
})
public class DTEitfApInforsReq {

    @XmlElement(name = "HEADER", required = true)
    protected DTEitfApInforsReq.HEADER header;
    @XmlElement(name = "CONTEXT", required = true)
    protected DTEitfApInforsReq.CONTEXT context;

    /**
     * ��ȡheader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DTEitfApInforsReq.HEADER }
     *     
     */
    public DTEitfApInforsReq.HEADER getHEADER() {
        return header;
    }

    /**
     * ����header���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DTEitfApInforsReq.HEADER }
     *     
     */
    public void setHEADER(DTEitfApInforsReq.HEADER value) {
        this.header = value;
    }

    /**
     * ��ȡcontext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DTEitfApInforsReq.CONTEXT }
     *     
     */
    public DTEitfApInforsReq.CONTEXT getCONTEXT() {
        return context;
    }

    /**
     * ����context���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DTEitfApInforsReq.CONTEXT }
     *     
     */
    public void setCONTEXT(DTEitfApInforsReq.CONTEXT value) {
        this.context = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RECORD" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PAY_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PAY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="HD_REMARK" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ASSET_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ASSET_CARD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LN_REMARK" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "record"
    })
    public static class CONTEXT {

        @XmlElement(name = "RECORD")
        protected List<DTEitfApInforsReq.CONTEXT.RECORD> record;

        /**
         * Gets the value of the record property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the record property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRECORD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTEitfApInforsReq.CONTEXT.RECORD }
         * 
         * 
         */
        public List<DTEitfApInforsReq.CONTEXT.RECORD> getRECORD() {
            if (record == null) {
                record = new ArrayList<DTEitfApInforsReq.CONTEXT.RECORD>();
            }
            return this.record;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PAY_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PAY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="HD_REMARK" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ASSET_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ASSET_CARD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LN_REMARK" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ATTRIBUTE1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ATTRIBUTE2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ATTRIBUTE3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ATTRIBUTE4" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ATTRIBUTE5" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paynumber",
            "paystatus",
            "hdremark",
            "assetcardid",
            "assetcardnumber",
            "lnremark",
            "attribute1",
            "attribute2",
            "attribute3",
            "attribute4",
            "attribute5"
        })
        public static class RECORD {

            @XmlElement(name = "PAY_NUMBER", required = true)
            protected String paynumber;
            @XmlElement(name = "PAY_STATUS", required = true)
            protected String paystatus;
            @XmlElement(name = "HD_REMARK", required = true)
            protected String hdremark;
            @XmlElement(name = "ASSET_CARD_ID", required = true)
            protected String assetcardid;
            @XmlElement(name = "ASSET_CARD_NUMBER", required = true)
            protected String assetcardnumber;
            @XmlElement(name = "LN_REMARK", required = true)
            protected String lnremark;
            @XmlElement(name = "ATTRIBUTE1", required = true)
            protected String attribute1;
            @XmlElement(name = "ATTRIBUTE2", required = true)
            protected String attribute2;
            @XmlElement(name = "ATTRIBUTE3", required = true)
            protected String attribute3;
            @XmlElement(name = "ATTRIBUTE4", required = true)
            protected String attribute4;
            @XmlElement(name = "ATTRIBUTE5", required = true)
            protected String attribute5;

            /**
             * ��ȡpaynumber���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYNUMBER() {
                return paynumber;
            }

            /**
             * ����paynumber���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYNUMBER(String value) {
                this.paynumber = value;
            }

            /**
             * ��ȡpaystatus���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSTATUS() {
                return paystatus;
            }

            /**
             * ����paystatus���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSTATUS(String value) {
                this.paystatus = value;
            }

            /**
             * ��ȡhdremark���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDREMARK() {
                return hdremark;
            }

            /**
             * ����hdremark���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDREMARK(String value) {
                this.hdremark = value;
            }

            /**
             * ��ȡassetcardid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getASSETCARDID() {
                return assetcardid;
            }

            /**
             * ����assetcardid���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setASSETCARDID(String value) {
                this.assetcardid = value;
            }

            /**
             * ��ȡassetcardnumber���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getASSETCARDNUMBER() {
                return assetcardnumber;
            }

            /**
             * ����assetcardnumber���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setASSETCARDNUMBER(String value) {
                this.assetcardnumber = value;
            }

            /**
             * ��ȡlnremark���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLNREMARK() {
                return lnremark;
            }

            /**
             * ����lnremark���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLNREMARK(String value) {
                this.lnremark = value;
            }

            /**
             * ��ȡattribute1���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getATTRIBUTE1() {
                return attribute1;
            }

            /**
             * ����attribute1���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setATTRIBUTE1(String value) {
                this.attribute1 = value;
            }

            /**
             * ��ȡattribute2���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getATTRIBUTE2() {
                return attribute2;
            }

            /**
             * ����attribute2���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setATTRIBUTE2(String value) {
                this.attribute2 = value;
            }

            /**
             * ��ȡattribute3���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getATTRIBUTE3() {
                return attribute3;
            }

            /**
             * ����attribute3���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setATTRIBUTE3(String value) {
                this.attribute3 = value;
            }

            /**
             * ��ȡattribute4���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getATTRIBUTE4() {
                return attribute4;
            }

            /**
             * ����attribute4���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setATTRIBUTE4(String value) {
                this.attribute4 = value;
            }

            /**
             * ��ȡattribute5���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getATTRIBUTE5() {
                return attribute5;
            }

            /**
             * ����attribute5���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setATTRIBUTE5(String value) {
                this.attribute5 = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BUSINESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SYSTEM_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="REQUEST_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IF_CATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IF_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="USER_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BATCH_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TOTAL_SEG_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SEG_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "businessgroup",
        "systemcode",
        "requestid",
        "ifcatecode",
        "ifcode",
        "username",
        "password",
        "batchnum",
        "totalsegcount",
        "segnum"
    })
    public static class HEADER {

        @XmlElement(name = "BUSINESS_GROUP", required = true)
        protected String businessgroup;
        @XmlElement(name = "SYSTEM_CODE", required = true)
        protected String systemcode;
        @XmlElement(name = "REQUEST_ID", required = true)
        protected String requestid;
        @XmlElement(name = "IF_CATE_CODE", required = true)
        protected String ifcatecode;
        @XmlElement(name = "IF_CODE", required = true)
        protected String ifcode;
        @XmlElement(name = "USER_NAME", required = true)
        protected String username;
        @XmlElement(name = "PASSWORD", required = true)
        protected String password;
        @XmlElement(name = "BATCH_NUM", required = true)
        protected String batchnum;
        @XmlElement(name = "TOTAL_SEG_COUNT", required = true)
        protected String totalsegcount;
        @XmlElement(name = "SEG_NUM", required = true)
        protected String segnum;

        /**
         * ��ȡbusinessgroup���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBUSINESSGROUP() {
            return businessgroup;
        }

        /**
         * ����businessgroup���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBUSINESSGROUP(String value) {
            this.businessgroup = value;
        }

        /**
         * ��ȡsystemcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSYSTEMCODE() {
            return systemcode;
        }

        /**
         * ����systemcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSYSTEMCODE(String value) {
            this.systemcode = value;
        }

        /**
         * ��ȡrequestid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUESTID() {
            return requestid;
        }

        /**
         * ����requestid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUESTID(String value) {
            this.requestid = value;
        }

        /**
         * ��ȡifcatecode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIFCATECODE() {
            return ifcatecode;
        }

        /**
         * ����ifcatecode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIFCATECODE(String value) {
            this.ifcatecode = value;
        }

        /**
         * ��ȡifcode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIFCODE() {
            return ifcode;
        }

        /**
         * ����ifcode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIFCODE(String value) {
            this.ifcode = value;
        }

        /**
         * ��ȡusername���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSERNAME() {
            return username;
        }

        /**
         * ����username���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSERNAME(String value) {
            this.username = value;
        }

        /**
         * ��ȡpassword���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSWORD() {
            return password;
        }

        /**
         * ����password���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSWORD(String value) {
            this.password = value;
        }

        /**
         * ��ȡbatchnum���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBATCHNUM() {
            return batchnum;
        }

        /**
         * ����batchnum���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBATCHNUM(String value) {
            this.batchnum = value;
        }

        /**
         * ��ȡtotalsegcount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOTALSEGCOUNT() {
            return totalsegcount;
        }

        /**
         * ����totalsegcount���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOTALSEGCOUNT(String value) {
            this.totalsegcount = value;
        }

        /**
         * ��ȡsegnum���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEGNUM() {
            return segnum;
        }

        /**
         * ����segnum���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEGNUM(String value) {
            this.segnum = value;
        }

    }

}
