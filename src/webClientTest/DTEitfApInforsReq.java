
package webClientTest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_EitfApInfors_Req complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取header属性的值。
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
     * 设置header属性的值。
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
     * 获取context属性的值。
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
     * 设置context属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取paynumber属性的值。
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
             * 设置paynumber属性的值。
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
             * 获取paystatus属性的值。
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
             * 设置paystatus属性的值。
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
             * 获取hdremark属性的值。
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
             * 设置hdremark属性的值。
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
             * 获取assetcardid属性的值。
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
             * 设置assetcardid属性的值。
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
             * 获取assetcardnumber属性的值。
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
             * 设置assetcardnumber属性的值。
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
             * 获取lnremark属性的值。
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
             * 设置lnremark属性的值。
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
             * 获取attribute1属性的值。
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
             * 设置attribute1属性的值。
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
             * 获取attribute2属性的值。
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
             * 设置attribute2属性的值。
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
             * 获取attribute3属性的值。
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
             * 设置attribute3属性的值。
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
             * 获取attribute4属性的值。
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
             * 设置attribute4属性的值。
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
             * 获取attribute5属性的值。
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
             * 设置attribute5属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取businessgroup属性的值。
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
         * 设置businessgroup属性的值。
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
         * 获取systemcode属性的值。
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
         * 设置systemcode属性的值。
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
         * 获取requestid属性的值。
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
         * 设置requestid属性的值。
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
         * 获取ifcatecode属性的值。
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
         * 设置ifcatecode属性的值。
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
         * 获取ifcode属性的值。
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
         * 设置ifcode属性的值。
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
         * 获取username属性的值。
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
         * 设置username属性的值。
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
         * 获取password属性的值。
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
         * 设置password属性的值。
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
         * 获取batchnum属性的值。
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
         * 设置batchnum属性的值。
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
         * 获取totalsegcount属性的值。
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
         * 设置totalsegcount属性的值。
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
         * 获取segnum属性的值。
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
         * 设置segnum属性的值。
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
