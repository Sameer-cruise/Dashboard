/*
 * XML Type:  FuelDataType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FuelDataType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML FuelDataType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class FuelDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FuelDataType
{
    
    public FuelDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Type");
    private static final javax.xml.namespace.QName QUANTITY$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Quantity");
    
    
    /**
     * Gets the "Type" element
     */
    public org.iata.iata.x2007.x00.FuelQualifierType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FuelQualifierType target = null;
            target = (org.iata.iata.x2007.x00.FuelQualifierType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(org.iata.iata.x2007.x00.FuelQualifierType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FuelQualifierType target = null;
            target = (org.iata.iata.x2007.x00.FuelQualifierType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FuelQualifierType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "Type" element
     */
    public org.iata.iata.x2007.x00.FuelQualifierType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FuelQualifierType target = null;
            target = (org.iata.iata.x2007.x00.FuelQualifierType)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Quantity" element
     */
    public org.iata.iata.x2007.x00.MeasurementType getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementType)get_store().find_element_user(QUANTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Quantity" element
     */
    public void setQuantity(org.iata.iata.x2007.x00.MeasurementType quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementType)get_store().find_element_user(QUANTITY$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.MeasurementType)get_store().add_element_user(QUANTITY$2);
            }
            target.set(quantity);
        }
    }
    
    /**
     * Appends and returns a new empty "Quantity" element
     */
    public org.iata.iata.x2007.x00.MeasurementType addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementType)get_store().add_element_user(QUANTITY$2);
            return target;
        }
    }
}
