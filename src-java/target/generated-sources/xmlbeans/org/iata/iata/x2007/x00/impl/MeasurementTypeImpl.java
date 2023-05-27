/*
 * XML Type:  MeasurementType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.MeasurementType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML MeasurementType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.MeasurementType.
 */
public class MeasurementTypeImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements org.iata.iata.x2007.x00.MeasurementType
{
    
    public MeasurementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected MeasurementTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName MEASUREMENTUNIT$0 = 
        new javax.xml.namespace.QName("", "MeasurementUnit");
    
    
    /**
     * Gets the "MeasurementUnit" attribute
     */
    public org.iata.iata.x2007.x00.MeasurementUnitType.Enum getMeasurementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUREMENTUNIT$0);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.MeasurementUnitType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MeasurementUnit" attribute
     */
    public org.iata.iata.x2007.x00.MeasurementUnitType xgetMeasurementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementUnitType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementUnitType)get_store().find_attribute_user(MEASUREMENTUNIT$0);
            return target;
        }
    }
    
    /**
     * True if has "MeasurementUnit" attribute
     */
    public boolean isSetMeasurementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEASUREMENTUNIT$0) != null;
        }
    }
    
    /**
     * Sets the "MeasurementUnit" attribute
     */
    public void setMeasurementUnit(org.iata.iata.x2007.x00.MeasurementUnitType.Enum measurementUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUREMENTUNIT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASUREMENTUNIT$0);
            }
            target.setEnumValue(measurementUnit);
        }
    }
    
    /**
     * Sets (as xml) the "MeasurementUnit" attribute
     */
    public void xsetMeasurementUnit(org.iata.iata.x2007.x00.MeasurementUnitType measurementUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementUnitType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementUnitType)get_store().find_attribute_user(MEASUREMENTUNIT$0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.MeasurementUnitType)get_store().add_attribute_user(MEASUREMENTUNIT$0);
            }
            target.set(measurementUnit);
        }
    }
    
    /**
     * Unsets the "MeasurementUnit" attribute
     */
    public void unsetMeasurementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEASUREMENTUNIT$0);
        }
    }
}
