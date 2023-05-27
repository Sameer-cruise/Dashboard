/*
 * XML Type:  CompanyNameType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.CompanyNameType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML CompanyNameType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.CompanyNameType.
 */
public class CompanyNameTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.CompanyNameType
{
    
    public CompanyNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CompanyNameTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName COMPANYSHORTNAME$0 = 
        new javax.xml.namespace.QName("", "CompanyShortName");
    private static final javax.xml.namespace.QName TRAVELSECTOR$2 = 
        new javax.xml.namespace.QName("", "TravelSector");
    private static final javax.xml.namespace.QName CODE$4 = 
        new javax.xml.namespace.QName("", "Code");
    private static final javax.xml.namespace.QName CODECONTEXT$6 = 
        new javax.xml.namespace.QName("", "CodeContext");
    
    
    /**
     * Gets the "CompanyShortName" attribute
     */
    public java.lang.String getCompanyShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANYSHORTNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompanyShortName" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetCompanyShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(COMPANYSHORTNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "CompanyShortName" attribute
     */
    public boolean isSetCompanyShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPANYSHORTNAME$0) != null;
        }
    }
    
    /**
     * Sets the "CompanyShortName" attribute
     */
    public void setCompanyShortName(java.lang.String companyShortName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANYSHORTNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPANYSHORTNAME$0);
            }
            target.setStringValue(companyShortName);
        }
    }
    
    /**
     * Sets (as xml) the "CompanyShortName" attribute
     */
    public void xsetCompanyShortName(org.iata.iata.x2007.x00.StringLength1To32 companyShortName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(COMPANYSHORTNAME$0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(COMPANYSHORTNAME$0);
            }
            target.set(companyShortName);
        }
    }
    
    /**
     * Unsets the "CompanyShortName" attribute
     */
    public void unsetCompanyShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPANYSHORTNAME$0);
        }
    }
    
    /**
     * Gets the "TravelSector" attribute
     */
    public java.lang.String getTravelSector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRAVELSECTOR$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TravelSector" attribute
     */
    public org.iata.iata.x2007.x00.IATACodeType xgetTravelSector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TRAVELSECTOR$2);
            return target;
        }
    }
    
    /**
     * True if has "TravelSector" attribute
     */
    public boolean isSetTravelSector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRAVELSECTOR$2) != null;
        }
    }
    
    /**
     * Sets the "TravelSector" attribute
     */
    public void setTravelSector(java.lang.String travelSector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRAVELSECTOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRAVELSECTOR$2);
            }
            target.setStringValue(travelSector);
        }
    }
    
    /**
     * Sets (as xml) the "TravelSector" attribute
     */
    public void xsetTravelSector(org.iata.iata.x2007.x00.IATACodeType travelSector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TRAVELSECTOR$2);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(TRAVELSECTOR$2);
            }
            target.set(travelSector);
        }
    }
    
    /**
     * Unsets the "TravelSector" attribute
     */
    public void unsetTravelSector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRAVELSECTOR$2);
        }
    }
    
    /**
     * Gets the "Code" attribute
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
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
    public org.iata.iata.x2007.x00.StringLength1To16 xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(CODE$4);
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
            return get_store().find_attribute_user(CODE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$4);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "Code" attribute
     */
    public void xsetCode(org.iata.iata.x2007.x00.StringLength1To16 code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(CODE$4);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(CODE$4);
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
            get_store().remove_attribute(CODE$4);
        }
    }
    
    /**
     * Gets the "CodeContext" attribute
     */
    public java.lang.String getCodeContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodeContext" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetCodeContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CODECONTEXT$6);
            return target;
        }
    }
    
    /**
     * True if has "CodeContext" attribute
     */
    public boolean isSetCodeContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODECONTEXT$6) != null;
        }
    }
    
    /**
     * Sets the "CodeContext" attribute
     */
    public void setCodeContext(java.lang.String codeContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$6);
            }
            target.setStringValue(codeContext);
        }
    }
    
    /**
     * Sets (as xml) the "CodeContext" attribute
     */
    public void xsetCodeContext(org.iata.iata.x2007.x00.StringLength1To32 codeContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CODECONTEXT$6);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(CODECONTEXT$6);
            }
            target.set(codeContext);
        }
    }
    
    /**
     * Unsets the "CodeContext" attribute
     */
    public void unsetCodeContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODECONTEXT$6);
        }
    }
}
