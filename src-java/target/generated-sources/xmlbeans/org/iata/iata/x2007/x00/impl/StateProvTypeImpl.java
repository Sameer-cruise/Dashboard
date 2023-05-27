/*
 * XML Type:  StateProvType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.StateProvType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML StateProvType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.StateProvType.
 */
public class StateProvTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.StateProvType
{
    
    public StateProvTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected StateProvTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName STATECODE$0 = 
        new javax.xml.namespace.QName("", "StateCode");
    
    
    /**
     * Gets the "StateCode" attribute
     */
    public java.lang.String getStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATECODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StateCode" attribute
     */
    public org.iata.iata.x2007.x00.StateProvCodeType xgetStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StateProvCodeType target = null;
            target = (org.iata.iata.x2007.x00.StateProvCodeType)get_store().find_attribute_user(STATECODE$0);
            return target;
        }
    }
    
    /**
     * True if has "StateCode" attribute
     */
    public boolean isSetStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATECODE$0) != null;
        }
    }
    
    /**
     * Sets the "StateCode" attribute
     */
    public void setStateCode(java.lang.String stateCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATECODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATECODE$0);
            }
            target.setStringValue(stateCode);
        }
    }
    
    /**
     * Sets (as xml) the "StateCode" attribute
     */
    public void xsetStateCode(org.iata.iata.x2007.x00.StateProvCodeType stateCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StateProvCodeType target = null;
            target = (org.iata.iata.x2007.x00.StateProvCodeType)get_store().find_attribute_user(STATECODE$0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StateProvCodeType)get_store().add_attribute_user(STATECODE$0);
            }
            target.set(stateCode);
        }
    }
    
    /**
     * Unsets the "StateCode" attribute
     */
    public void unsetStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATECODE$0);
        }
    }
}
