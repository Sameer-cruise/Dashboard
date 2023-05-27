/*
 * XML Type:  BaseSubEventType
 * Namespace: urn:www.qantas.com:schema:cdm:common:SubEvents:v1
 * Java type: comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmCommonSubEventsV1.qantas.impl;
/**
 * An XML BaseSubEventType(@urn:www.qantas.com:schema:cdm:common:SubEvents:v1).
 *
 * This is a complex type.
 */
public class BaseSubEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType
{
    
    public BaseSubEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBEVENTNAME$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:SubEvents:v1", "SubEventName");
    private static final javax.xml.namespace.QName SUBEVENTID$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:SubEvents:v1", "SubEventId");
    private static final javax.xml.namespace.QName EXTERNALID$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:SubEvents:v1", "ExternalId");
    private static final javax.xml.namespace.QName SUBEVENTTIME$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:SubEvents:v1", "SubEventTime");
    
    
    /**
     * Gets the "SubEventName" element
     */
    public java.lang.String getSubEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBEVENTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubEventName" element
     */
    public comSchemaCdmCommonSubEventsV1.qantas.SubEventNameType xgetSubEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonSubEventsV1.qantas.SubEventNameType target = null;
            target = (comSchemaCdmCommonSubEventsV1.qantas.SubEventNameType)get_store().find_element_user(SUBEVENTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SubEventName" element
     */
    public void setSubEventName(java.lang.String subEventName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBEVENTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBEVENTNAME$0);
            }
            target.setStringValue(subEventName);
        }
    }
    
    /**
     * Sets (as xml) the "SubEventName" element
     */
    public void xsetSubEventName(comSchemaCdmCommonSubEventsV1.qantas.SubEventNameType subEventName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonSubEventsV1.qantas.SubEventNameType target = null;
            target = (comSchemaCdmCommonSubEventsV1.qantas.SubEventNameType)get_store().find_element_user(SUBEVENTNAME$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonSubEventsV1.qantas.SubEventNameType)get_store().add_element_user(SUBEVENTNAME$0);
            }
            target.set(subEventName);
        }
    }
    
    /**
     * Gets the "SubEventId" element
     */
    public java.lang.String getSubEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBEVENTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubEventId" element
     */
    public org.apache.xmlbeans.XmlString xgetSubEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBEVENTID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubEventId" element
     */
    public boolean isSetSubEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBEVENTID$2) != 0;
        }
    }
    
    /**
     * Sets the "SubEventId" element
     */
    public void setSubEventId(java.lang.String subEventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBEVENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBEVENTID$2);
            }
            target.setStringValue(subEventId);
        }
    }
    
    /**
     * Sets (as xml) the "SubEventId" element
     */
    public void xsetSubEventId(org.apache.xmlbeans.XmlString subEventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBEVENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBEVENTID$2);
            }
            target.set(subEventId);
        }
    }
    
    /**
     * Unsets the "SubEventId" element
     */
    public void unsetSubEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBEVENTID$2, 0);
        }
    }
    
    /**
     * Gets the "ExternalId" element
     */
    public java.lang.String getExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalId" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExternalId" element
     */
    public boolean isSetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALID$4) != 0;
        }
    }
    
    /**
     * Sets the "ExternalId" element
     */
    public void setExternalId(java.lang.String externalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALID$4);
            }
            target.setStringValue(externalId);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalId" element
     */
    public void xsetExternalId(org.apache.xmlbeans.XmlString externalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALID$4);
            }
            target.set(externalId);
        }
    }
    
    /**
     * Unsets the "ExternalId" element
     */
    public void unsetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALID$4, 0);
        }
    }
    
    /**
     * Gets the "SubEventTime" element
     */
    public java.util.Calendar getSubEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBEVENTTIME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubEventTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetSubEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SUBEVENTTIME$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SubEventTime" element
     */
    public void setSubEventTime(java.util.Calendar subEventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBEVENTTIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBEVENTTIME$6);
            }
            target.setCalendarValue(subEventTime);
        }
    }
    
    /**
     * Sets (as xml) the "SubEventTime" element
     */
    public void xsetSubEventTime(org.apache.xmlbeans.XmlDateTime subEventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SUBEVENTTIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SUBEVENTTIME$6);
            }
            target.set(subEventTime);
        }
    }
}
