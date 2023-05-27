/*
 * XML Type:  UniqueID_Type
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.UniqueIDType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML UniqueID_Type(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class UniqueIDTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.UniqueIDType
{
    
    public UniqueIDTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPANYNAME$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CompanyName");
    private static final javax.xml.namespace.QName URL$2 = 
        new javax.xml.namespace.QName("", "URL");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName INSTANCE$6 = 
        new javax.xml.namespace.QName("", "Instance");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName IDCONTEXT$10 = 
        new javax.xml.namespace.QName("", "ID_Context");
    
    
    /**
     * Gets the "CompanyName" element
     */
    public org.iata.iata.x2007.x00.CompanyNameType getCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.CompanyNameType target = null;
            target = (org.iata.iata.x2007.x00.CompanyNameType)get_store().find_element_user(COMPANYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CompanyName" element
     */
    public boolean isSetCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "CompanyName" element
     */
    public void setCompanyName(org.iata.iata.x2007.x00.CompanyNameType companyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.CompanyNameType target = null;
            target = (org.iata.iata.x2007.x00.CompanyNameType)get_store().find_element_user(COMPANYNAME$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.CompanyNameType)get_store().add_element_user(COMPANYNAME$0);
            }
            target.set(companyName);
        }
    }
    
    /**
     * Appends and returns a new empty "CompanyName" element
     */
    public org.iata.iata.x2007.x00.CompanyNameType addNewCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.CompanyNameType target = null;
            target = (org.iata.iata.x2007.x00.CompanyNameType)get_store().add_element_user(COMPANYNAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CompanyName" element
     */
    public void unsetCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANYNAME$0, 0);
        }
    }
    
    /**
     * Gets the "URL" attribute
     */
    public java.lang.String getURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URL" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URL$2);
            return target;
        }
    }
    
    /**
     * True if has "URL" attribute
     */
    public boolean isSetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URL$2) != null;
        }
    }
    
    /**
     * Sets the "URL" attribute
     */
    public void setURL(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URL$2);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "URL" attribute
     */
    public void xsetURL(org.apache.xmlbeans.XmlAnyURI url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URL$2);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "URL" attribute
     */
    public void unsetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URL$2);
        }
    }
    
    /**
     * Gets the "Type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public org.iata.iata.x2007.x00.IATACodeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "Type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(org.iata.iata.x2007.x00.IATACodeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$4);
        }
    }
    
    /**
     * Gets the "Instance" attribute
     */
    public java.lang.String getInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTANCE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Instance" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(INSTANCE$6);
            return target;
        }
    }
    
    /**
     * True if has "Instance" attribute
     */
    public boolean isSetInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSTANCE$6) != null;
        }
    }
    
    /**
     * Sets the "Instance" attribute
     */
    public void setInstance(java.lang.String instance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTANCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTANCE$6);
            }
            target.setStringValue(instance);
        }
    }
    
    /**
     * Sets (as xml) the "Instance" attribute
     */
    public void xsetInstance(org.iata.iata.x2007.x00.StringLength1To32 instance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(INSTANCE$6);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(INSTANCE$6);
            }
            target.set(instance);
        }
    }
    
    /**
     * Unsets the "Instance" attribute
     */
    public void unsetInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSTANCE$6);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(ID$8);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$8) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.iata.iata.x2007.x00.StringLength1To32 id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(ID$8);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$8);
        }
    }
    
    /**
     * Gets the "ID_Context" attribute
     */
    public java.lang.String getIDContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCONTEXT$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID_Context" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetIDContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(IDCONTEXT$10);
            return target;
        }
    }
    
    /**
     * True if has "ID_Context" attribute
     */
    public boolean isSetIDContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDCONTEXT$10) != null;
        }
    }
    
    /**
     * Sets the "ID_Context" attribute
     */
    public void setIDContext(java.lang.String idContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCONTEXT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDCONTEXT$10);
            }
            target.setStringValue(idContext);
        }
    }
    
    /**
     * Sets (as xml) the "ID_Context" attribute
     */
    public void xsetIDContext(org.iata.iata.x2007.x00.StringLength1To32 idContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(IDCONTEXT$10);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(IDCONTEXT$10);
            }
            target.set(idContext);
        }
    }
    
    /**
     * Unsets the "ID_Context" attribute
     */
    public void unsetIDContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDCONTEXT$10);
        }
    }
}
