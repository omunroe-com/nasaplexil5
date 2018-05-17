//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.03 at 09:23:03 AM COT 
//


package org.nianet.plexil.plexilxml2maude.jaxbmodel;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.BinaryArithmeticExpression;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}NumericExpression"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "add",
    "sub",
    "mul",
    "div",
    "sqrt",
    "abs",
    "integerVariable",
    "realVariable",
    "integerValue",
    "realValue",
    "lookupOnChange",
    "lookupNow",
    "nodeTimepointValue",
    "arraySize",
    "arrayMaxSize",
    "arrayElement"
})
@XmlRootElement(name = "SQRT")
public class SQRT {

    @XmlElement(name = "ADD")
    protected ADD add;
    @XmlElement(name = "SUB")
    protected SUB sub;
    @XmlElement(name = "MUL")
    protected MUL mul;
    @XmlElement(name = "DIV")
    protected DIV div;
    @XmlElement(name = "SQRT")
    protected SQRT sqrt;
    @XmlElement(name = "ABS")
    protected ABS abs;
    @XmlElement(name = "IntegerVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String integerVariable;
    @XmlElement(name = "RealVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String realVariable;
    @XmlElement(name = "IntegerValue")
    protected BigInteger integerValue;
    @XmlElement(name = "RealValue")
    protected Double realValue;
    @XmlElement(name = "LookupOnChange")
    protected LookupOnChange lookupOnChange;
    @XmlElement(name = "LookupNow")
    protected LookupNow lookupNow;
    @XmlElement(name = "NodeTimepointValue")
    protected NodeTimepointValue nodeTimepointValue;
    @XmlElement(name = "ArraySize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String arraySize;
    @XmlElement(name = "ArrayMaxSize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String arrayMaxSize;
    @XmlElement(name = "ArrayElement")
    protected ArrayElement arrayElement;

    /**
     * Gets the value of the add property.
     * 
     * @return
     *     possible object is
     *     {@link ADD }
     *     
     */
    public ADD getADD() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADD }
     *     
     */
    public void setADD(ADD value) {
        this.add = value;
    }

    /**
     * Gets the value of the sub property.
     * 
     * @return
     *     possible object is
     *     {@link SUB }
     *     
     */
    public SUB getSUB() {
        return sub;
    }

    /**
     * Sets the value of the sub property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUB }
     *     
     */
    public void setSUB(SUB value) {
        this.sub = value;
    }

    /**
     * Gets the value of the mul property.
     * 
     * @return
     *     possible object is
     *     {@link MUL }
     *     
     */
    public MUL getMUL() {
        return mul;
    }

    /**
     * Sets the value of the mul property.
     * 
     * @param value
     *     allowed object is
     *     {@link MUL }
     *     
     */
    public void setMUL(MUL value) {
        this.mul = value;
    }

    /**
     * Gets the value of the div property.
     * 
     * @return
     *     possible object is
     *     {@link DIV }
     *     
     */
    public DIV getDIV() {
        return div;
    }

    /**
     * Sets the value of the div property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIV }
     *     
     */
    public void setDIV(DIV value) {
        this.div = value;
    }

    /**
     * Gets the value of the sqrt property.
     * 
     * @return
     *     possible object is
     *     {@link SQRT }
     *     
     */
    public SQRT getSQRT() {
        return sqrt;
    }

    /**
     * Sets the value of the sqrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQRT }
     *     
     */
    public void setSQRT(SQRT value) {
        this.sqrt = value;
    }

    /**
     * Gets the value of the abs property.
     * 
     * @return
     *     possible object is
     *     {@link ABS }
     *     
     */
    public ABS getABS() {
        return abs;
    }

    /**
     * Sets the value of the abs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ABS }
     *     
     */
    public void setABS(ABS value) {
        this.abs = value;
    }

    /**
     * Gets the value of the integerVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegerVariable() {
        return integerVariable;
    }

    /**
     * Sets the value of the integerVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegerVariable(String value) {
        this.integerVariable = value;
    }

    /**
     * Gets the value of the realVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealVariable() {
        return realVariable;
    }

    /**
     * Sets the value of the realVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealVariable(String value) {
        this.realVariable = value;
    }

    /**
     * Gets the value of the integerValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntegerValue(BigInteger value) {
        this.integerValue = value;
    }

    /**
     * Gets the value of the realValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRealValue() {
        return realValue;
    }

    /**
     * Sets the value of the realValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRealValue(Double value) {
        this.realValue = value;
    }

    /**
     * Gets the value of the lookupOnChange property.
     * 
     * @return
     *     possible object is
     *     {@link LookupOnChange }
     *     
     */
    public LookupOnChange getLookupOnChange() {
        return lookupOnChange;
    }

    /**
     * Sets the value of the lookupOnChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupOnChange }
     *     
     */
    public void setLookupOnChange(LookupOnChange value) {
        this.lookupOnChange = value;
    }

    /**
     * Gets the value of the lookupNow property.
     * 
     * @return
     *     possible object is
     *     {@link LookupNow }
     *     
     */
    public LookupNow getLookupNow() {
        return lookupNow;
    }

    /**
     * Sets the value of the lookupNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupNow }
     *     
     */
    public void setLookupNow(LookupNow value) {
        this.lookupNow = value;
    }

    /**
     * Gets the value of the nodeTimepointValue property.
     * 
     * @return
     *     possible object is
     *     {@link NodeTimepointValue }
     *     
     */
    public NodeTimepointValue getNodeTimepointValue() {
        return nodeTimepointValue;
    }

    /**
     * Sets the value of the nodeTimepointValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeTimepointValue }
     *     
     */
    public void setNodeTimepointValue(NodeTimepointValue value) {
        this.nodeTimepointValue = value;
    }

    /**
     * Gets the value of the arraySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArraySize() {
        return arraySize;
    }

    /**
     * Sets the value of the arraySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArraySize(String value) {
        this.arraySize = value;
    }

    /**
     * Gets the value of the arrayMaxSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrayMaxSize() {
        return arrayMaxSize;
    }

    /**
     * Sets the value of the arrayMaxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrayMaxSize(String value) {
        this.arrayMaxSize = value;
    }

    /**
     * Gets the value of the arrayElement property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayElement }
     *     
     */
    public ArrayElement getArrayElement() {
        return arrayElement;
    }

    /**
     * Sets the value of the arrayElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayElement }
     *     
     */
    public void setArrayElement(ArrayElement value) {
        this.arrayElement = value;
    }

}