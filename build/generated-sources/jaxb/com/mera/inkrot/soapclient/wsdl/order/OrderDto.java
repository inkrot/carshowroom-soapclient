//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.15 at 06:53:15 PM MSK 
//


package com.mera.inkrot.soapclient.wsdl.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.carshowroom.inkrot.mera.com/}dto">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://service.carshowroom.inkrot.mera.com/}customerDto" minOccurs="0"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://service.carshowroom.inkrot.mera.com/}statusDto" minOccurs="0"/>
 *         &lt;element name="options" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="option" type="{http://service.carshowroom.inkrot.mera.com/}optionDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderDto", propOrder = {
    "customer",
    "modelName",
    "brandName",
    "status",
    "options"
})
public class OrderDto
    extends Dto
{

    protected CustomerDto customer;
    protected String modelName;
    protected String brandName;
    protected StatusDto status;
    protected OrderDto.Options options;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDto }
     *     
     */
    public CustomerDto getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDto }
     *     
     */
    public void setCustomer(CustomerDto value) {
        this.customer = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDto }
     *     
     */
    public StatusDto getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDto }
     *     
     */
    public void setStatus(StatusDto value) {
        this.status = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDto.Options }
     *     
     */
    public OrderDto.Options getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDto.Options }
     *     
     */
    public void setOptions(OrderDto.Options value) {
        this.options = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="option" type="{http://service.carshowroom.inkrot.mera.com/}optionDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "option"
    })
    public static class Options {

        protected List<OptionDto> option;

        /**
         * Gets the value of the option property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the option property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OptionDto }
         * 
         * 
         */
        public List<OptionDto> getOption() {
            if (option == null) {
                option = new ArrayList<OptionDto>();
            }
            return this.option;
        }

    }

}