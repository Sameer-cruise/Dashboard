/*
 * XML Type:  DeadLoadType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.DeadLoadType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML DeadLoadType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class DeadLoadTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.DeadLoadType
{
    
    public DeadLoadTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Type");
    private static final javax.xml.namespace.QName WEIGHT$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Weight");
    private static final javax.xml.namespace.QName DESTINATIONTYPE$4 = 
        new javax.xml.namespace.QName("", "DestinationType");
    
    
    /**
     * Gets the "Type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public org.iata.iata.x2007.x00.IATACodeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(org.iata.iata.x2007.x00.IATACodeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "Weight" element
     */
    public org.iata.iata.x2007.x00.MeasurementType getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementType)get_store().find_element_user(WEIGHT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Weight" element
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEIGHT$2) != 0;
        }
    }
    
    /**
     * Sets the "Weight" element
     */
    public void setWeight(org.iata.iata.x2007.x00.MeasurementType weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementType)get_store().find_element_user(WEIGHT$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.MeasurementType)get_store().add_element_user(WEIGHT$2);
            }
            target.set(weight);
        }
    }
    
    /**
     * Appends and returns a new empty "Weight" element
     */
    public org.iata.iata.x2007.x00.MeasurementType addNewWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementType)get_store().add_element_user(WEIGHT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Weight" element
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEIGHT$2, 0);
        }
    }
    
    /**
     * Gets the "DestinationType" attribute
     */
    public org.iata.iata.x2007.x00.DestinationType.Enum getDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATIONTYPE$4);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.DestinationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DestinationType" attribute
     */
    public org.iata.iata.x2007.x00.DestinationType xgetDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DestinationType target = null;
            target = (org.iata.iata.x2007.x00.DestinationType)get_store().find_attribute_user(DESTINATIONTYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "DestinationType" attribute
     */
    public boolean isSetDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESTINATIONTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "DestinationType" attribute
     */
    public void setDestinationType(org.iata.iata.x2007.x00.DestinationType.Enum destinationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATIONTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESTINATIONTYPE$4);
            }
            target.setEnumValue(destinationType);
        }
    }
    
    /**
     * Sets (as xml) the "DestinationType" attribute
     */
    public void xsetDestinationType(org.iata.iata.x2007.x00.DestinationType destinationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DestinationType target = null;
            target = (org.iata.iata.x2007.x00.DestinationType)get_store().find_attribute_user(DESTINATIONTYPE$4);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.DestinationType)get_store().add_attribute_user(DESTINATIONTYPE$4);
            }
            target.set(destinationType);
        }
    }
    
    /**
     * Unsets the "DestinationType" attribute
     */
    public void unsetDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESTINATIONTYPE$4);
        }
    }
}
