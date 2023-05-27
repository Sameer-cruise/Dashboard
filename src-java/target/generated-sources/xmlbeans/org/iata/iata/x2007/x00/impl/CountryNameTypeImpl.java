/*
 * XML Type:  CountryNameType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.CountryNameType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML CountryNameType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.CountryNameType.
 */
public class CountryNameTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.CountryNameType
{
    
    public CountryNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CountryNameTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("", "Code");
    
    
    /**
     * Gets the "Code" attribute
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Code" attribute
     */
    public org.iata.iata.x2007.x00.ISO3166 xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.ISO3166 target = null;
            target = (org.iata.iata.x2007.x00.ISO3166)get_store().find_attribute_user(CODE$0);
            return target;
        }
    }
    
    /**
     * True if has "Code" attribute
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODE$0) != null;
        }
    }
    
    /**
     * Sets the "Code" attribute
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$0);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "Code" attribute
     */
    public void xsetCode(org.iata.iata.x2007.x00.ISO3166 code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.ISO3166 target = null;
            target = (org.iata.iata.x2007.x00.ISO3166)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.ISO3166)get_store().add_attribute_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Unsets the "Code" attribute
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODE$0);
        }
    }
}
