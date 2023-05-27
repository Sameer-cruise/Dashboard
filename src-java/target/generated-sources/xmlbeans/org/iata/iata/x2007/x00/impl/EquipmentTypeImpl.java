/*
 * XML Type:  EquipmentType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.EquipmentType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML EquipmentType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.EquipmentType.
 */
public class EquipmentTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.EquipmentType
{
    
    public EquipmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected EquipmentTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName AIREQUIPTYPE$0 = 
        new javax.xml.namespace.QName("", "AirEquipType");
    private static final javax.xml.namespace.QName CHANGEOFGAUGE$2 = 
        new javax.xml.namespace.QName("", "ChangeofGauge");
    
    
    /**
     * Gets the "AirEquipType" attribute
     */
    public java.lang.String getAirEquipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AIREQUIPTYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AirEquipType" attribute
     */
    public org.iata.iata.x2007.x00.StringLength3 xgetAirEquipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength3 target = null;
            target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_attribute_user(AIREQUIPTYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "AirEquipType" attribute
     */
    public void setAirEquipType(java.lang.String airEquipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AIREQUIPTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AIREQUIPTYPE$0);
            }
            target.setStringValue(airEquipType);
        }
    }
    
    /**
     * Sets (as xml) the "AirEquipType" attribute
     */
    public void xsetAirEquipType(org.iata.iata.x2007.x00.StringLength3 airEquipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength3 target = null;
            target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_attribute_user(AIREQUIPTYPE$0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength3)get_store().add_attribute_user(AIREQUIPTYPE$0);
            }
            target.set(airEquipType);
        }
    }
    
    /**
     * Gets the "ChangeofGauge" attribute
     */
    public boolean getChangeofGauge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGEOFGAUGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CHANGEOFGAUGE$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChangeofGauge" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetChangeofGauge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CHANGEOFGAUGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CHANGEOFGAUGE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "ChangeofGauge" attribute
     */
    public boolean isSetChangeofGauge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHANGEOFGAUGE$2) != null;
        }
    }
    
    /**
     * Sets the "ChangeofGauge" attribute
     */
    public void setChangeofGauge(boolean changeofGauge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGEOFGAUGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHANGEOFGAUGE$2);
            }
            target.setBooleanValue(changeofGauge);
        }
    }
    
    /**
     * Sets (as xml) the "ChangeofGauge" attribute
     */
    public void xsetChangeofGauge(org.apache.xmlbeans.XmlBoolean changeofGauge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CHANGEOFGAUGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CHANGEOFGAUGE$2);
            }
            target.set(changeofGauge);
        }
    }
    
    /**
     * Unsets the "ChangeofGauge" attribute
     */
    public void unsetChangeofGauge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHANGEOFGAUGE$2);
        }
    }
}
