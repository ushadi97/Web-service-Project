/**
 * Beverage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.model;

public class Beverage  implements java.io.Serializable {
    private java.lang.String beveragType;

    private int beverageId;

    private java.lang.String beverageName;

    private double beveragePrice;

    private int beverageQty;

    public Beverage() {
    }

    public Beverage(
           java.lang.String beveragType,
           int beverageId,
           java.lang.String beverageName,
           double beveragePrice,
           int beverageQty) {
           this.beveragType = beveragType;
           this.beverageId = beverageId;
           this.beverageName = beverageName;
           this.beveragePrice = beveragePrice;
           this.beverageQty = beverageQty;
    }


    /**
     * Gets the beveragType value for this Beverage.
     * 
     * @return beveragType
     */
    public java.lang.String getBeveragType() {
        return beveragType;
    }


    /**
     * Sets the beveragType value for this Beverage.
     * 
     * @param beveragType
     */
    public void setBeveragType(java.lang.String beveragType) {
        this.beveragType = beveragType;
    }


    /**
     * Gets the beverageId value for this Beverage.
     * 
     * @return beverageId
     */
    public int getBeverageId() {
        return beverageId;
    }


    /**
     * Sets the beverageId value for this Beverage.
     * 
     * @param beverageId
     */
    public void setBeverageId(int beverageId) {
        this.beverageId = beverageId;
    }


    /**
     * Gets the beverageName value for this Beverage.
     * 
     * @return beverageName
     */
    public java.lang.String getBeverageName() {
        return beverageName;
    }


    /**
     * Sets the beverageName value for this Beverage.
     * 
     * @param beverageName
     */
    public void setBeverageName(java.lang.String beverageName) {
        this.beverageName = beverageName;
    }


    /**
     * Gets the beveragePrice value for this Beverage.
     * 
     * @return beveragePrice
     */
    public double getBeveragePrice() {
        return beveragePrice;
    }


    /**
     * Sets the beveragePrice value for this Beverage.
     * 
     * @param beveragePrice
     */
    public void setBeveragePrice(double beveragePrice) {
        this.beveragePrice = beveragePrice;
    }


    /**
     * Gets the beverageQty value for this Beverage.
     * 
     * @return beverageQty
     */
    public int getBeverageQty() {
        return beverageQty;
    }


    /**
     * Sets the beverageQty value for this Beverage.
     * 
     * @param beverageQty
     */
    public void setBeverageQty(int beverageQty) {
        this.beverageQty = beverageQty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Beverage)) return false;
        Beverage other = (Beverage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.beveragType==null && other.getBeveragType()==null) || 
             (this.beveragType!=null &&
              this.beveragType.equals(other.getBeveragType()))) &&
            this.beverageId == other.getBeverageId() &&
            ((this.beverageName==null && other.getBeverageName()==null) || 
             (this.beverageName!=null &&
              this.beverageName.equals(other.getBeverageName()))) &&
            this.beveragePrice == other.getBeveragePrice() &&
            this.beverageQty == other.getBeverageQty();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBeveragType() != null) {
            _hashCode += getBeveragType().hashCode();
        }
        _hashCode += getBeverageId();
        if (getBeverageName() != null) {
            _hashCode += getBeverageName().hashCode();
        }
        _hashCode += new Double(getBeveragePrice()).hashCode();
        _hashCode += getBeverageQty();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Beverage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.com", "Beverage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beveragType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.com", "beveragType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beverageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.com", "beverageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beverageName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.com", "beverageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beveragePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.com", "beveragePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beverageQty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.com", "beverageQty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
