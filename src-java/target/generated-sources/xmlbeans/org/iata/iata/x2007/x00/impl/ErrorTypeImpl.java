/*
 * XML Type:  ErrorType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.ErrorType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML ErrorType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.ErrorType.
 */
public class ErrorTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.ErrorType
{
    
    public ErrorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected ErrorTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LANGUAGE$0 = 
        new javax.xml.namespace.QName("", "Language");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName SHORTTEXT$4 = 
        new javax.xml.namespace.QName("", "ShortText");
    private static final javax.xml.namespace.QName CODE$6 = 
        new javax.xml.namespace.QName("", "Code");
    private static final javax.xml.namespace.QName DOCURL$8 = 
        new javax.xml.namespace.QName("", "DocURL");
    private static final javax.xml.namespace.QName STATUS$10 = 
        new javax.xml.namespace.QName("", "Status");
    private static final javax.xml.namespace.QName TAG$12 = 
        new javax.xml.namespace.QName("", "Tag");
    private static final javax.xml.namespace.QName RECORDID$14 = 
        new javax.xml.namespace.QName("", "RecordID");
    private static final javax.xml.namespace.QName NODELIST$16 = 
        new javax.xml.namespace.QName("", "NodeList");
    
    
    /**
     * Gets the "Language" attribute
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Language" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGE$0);
            return target;
        }
    }
    
    /**
     * True if has "Language" attribute
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGE$0) != null;
        }
    }
    
    /**
     * Sets the "Language" attribute
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$0);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "Language" attribute
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlLanguage language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANGUAGE$0);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "Language" attribute
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGE$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
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
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TYPE$2);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
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
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "ShortText" attribute
     */
    public java.lang.String getShortText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTTEXT$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShortText" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To64 xgetShortText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(SHORTTEXT$4);
            return target;
        }
    }
    
    /**
     * True if has "ShortText" attribute
     */
    public boolean isSetShortText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHORTTEXT$4) != null;
        }
    }
    
    /**
     * Sets the "ShortText" attribute
     */
    public void setShortText(java.lang.String shortText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTTEXT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHORTTEXT$4);
            }
            target.setStringValue(shortText);
        }
    }
    
    /**
     * Sets (as xml) the "ShortText" attribute
     */
    public void xsetShortText(org.iata.iata.x2007.x00.StringLength1To64 shortText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(SHORTTEXT$4);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_attribute_user(SHORTTEXT$4);
            }
            target.set(shortText);
        }
    }
    
    /**
     * Unsets the "ShortText" attribute
     */
    public void unsetShortText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHORTTEXT$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
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
    public org.iata.iata.x2007.x00.IATACodeType xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODE$6);
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
            return get_store().find_attribute_user(CODE$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$6);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "Code" attribute
     */
    public void xsetCode(org.iata.iata.x2007.x00.IATACodeType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODE$6);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODE$6);
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
            get_store().remove_attribute(CODE$6);
        }
    }
    
    /**
     * Gets the "DocURL" attribute
     */
    public java.lang.String getDocURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCURL$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocURL" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetDocURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(DOCURL$8);
            return target;
        }
    }
    
    /**
     * True if has "DocURL" attribute
     */
    public boolean isSetDocURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOCURL$8) != null;
        }
    }
    
    /**
     * Sets the "DocURL" attribute
     */
    public void setDocURL(java.lang.String docURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCURL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCURL$8);
            }
            target.setStringValue(docURL);
        }
    }
    
    /**
     * Sets (as xml) the "DocURL" attribute
     */
    public void xsetDocURL(org.apache.xmlbeans.XmlAnyURI docURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(DOCURL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(DOCURL$8);
            }
            target.set(docURL);
        }
    }
    
    /**
     * Unsets the "DocURL" attribute
     */
    public void unsetDocURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOCURL$8);
        }
    }
    
    /**
     * Gets the "Status" attribute
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To64 xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(STATUS$10);
            return target;
        }
    }
    
    /**
     * True if has "Status" attribute
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATUS$10) != null;
        }
    }
    
    /**
     * Sets the "Status" attribute
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$10);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    public void xsetStatus(org.iata.iata.x2007.x00.StringLength1To64 status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(STATUS$10);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_attribute_user(STATUS$10);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" attribute
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATUS$10);
        }
    }
    
    /**
     * Gets the "Tag" attribute
     */
    public java.lang.String getTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAG$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Tag" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TAG$12);
            return target;
        }
    }
    
    /**
     * True if has "Tag" attribute
     */
    public boolean isSetTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TAG$12) != null;
        }
    }
    
    /**
     * Sets the "Tag" attribute
     */
    public void setTag(java.lang.String tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TAG$12);
            }
            target.setStringValue(tag);
        }
    }
    
    /**
     * Sets (as xml) the "Tag" attribute
     */
    public void xsetTag(org.apache.xmlbeans.XmlString tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TAG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TAG$12);
            }
            target.set(tag);
        }
    }
    
    /**
     * Unsets the "Tag" attribute
     */
    public void unsetTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TAG$12);
        }
    }
    
    /**
     * Gets the "RecordID" attribute
     */
    public java.lang.String getRecordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDID$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecordID" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetRecordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(RECORDID$14);
            return target;
        }
    }
    
    /**
     * True if has "RecordID" attribute
     */
    public boolean isSetRecordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RECORDID$14) != null;
        }
    }
    
    /**
     * Sets the "RecordID" attribute
     */
    public void setRecordID(java.lang.String recordID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECORDID$14);
            }
            target.setStringValue(recordID);
        }
    }
    
    /**
     * Sets (as xml) the "RecordID" attribute
     */
    public void xsetRecordID(org.iata.iata.x2007.x00.StringLength1To32 recordID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(RECORDID$14);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(RECORDID$14);
            }
            target.set(recordID);
        }
    }
    
    /**
     * Unsets the "RecordID" attribute
     */
    public void unsetRecordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RECORDID$14);
        }
    }
    
    /**
     * Gets the "NodeList" attribute
     */
    public java.lang.String getNodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODELIST$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NodeList" attribute
     */
    public org.apache.xmlbeans.XmlString xgetNodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NODELIST$16);
            return target;
        }
    }
    
    /**
     * True if has "NodeList" attribute
     */
    public boolean isSetNodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NODELIST$16) != null;
        }
    }
    
    /**
     * Sets the "NodeList" attribute
     */
    public void setNodeList(java.lang.String nodeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODELIST$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NODELIST$16);
            }
            target.setStringValue(nodeList);
        }
    }
    
    /**
     * Sets (as xml) the "NodeList" attribute
     */
    public void xsetNodeList(org.apache.xmlbeans.XmlString nodeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NODELIST$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NODELIST$16);
            }
            target.set(nodeList);
        }
    }
    
    /**
     * Unsets the "NodeList" attribute
     */
    public void unsetNodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NODELIST$16);
        }
    }
}
