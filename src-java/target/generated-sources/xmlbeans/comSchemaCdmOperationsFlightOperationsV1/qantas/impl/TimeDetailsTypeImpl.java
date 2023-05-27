/*
 * XML Type:  timeDetailsType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1
 * Java type: comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsV1.qantas.impl;
/**
 * An XML timeDetailsType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
 *
 * This is a complex type.
 */
public class TimeDetailsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType
{
    
    public TimeDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLDTIME$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "oldTime");
    private static final javax.xml.namespace.QName NEWTIME$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "newTime");
    
    
    /**
     * Gets the "oldTime" element
     */
    public java.util.Calendar getOldTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetOldTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(OLDTIME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "oldTime" element
     */
    public boolean isSetOldTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLDTIME$0) != 0;
        }
    }
    
    /**
     * Sets the "oldTime" element
     */
    public void setOldTime(java.util.Calendar oldTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OLDTIME$0);
            }
            target.setCalendarValue(oldTime);
        }
    }
    
    /**
     * Sets (as xml) the "oldTime" element
     */
    public void xsetOldTime(org.apache.xmlbeans.XmlDateTime oldTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(OLDTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(OLDTIME$0);
            }
            target.set(oldTime);
        }
    }
    
    /**
     * Unsets the "oldTime" element
     */
    public void unsetOldTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLDTIME$0, 0);
        }
    }
    
    /**
     * Gets the "newTime" element
     */
    public java.util.Calendar getNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "newTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NEWTIME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "newTime" element
     */
    public boolean isSetNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEWTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "newTime" element
     */
    public void setNewTime(java.util.Calendar newTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWTIME$2);
            }
            target.setCalendarValue(newTime);
        }
    }
    
    /**
     * Sets (as xml) the "newTime" element
     */
    public void xsetNewTime(org.apache.xmlbeans.XmlDateTime newTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NEWTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(NEWTIME$2);
            }
            target.set(newTime);
        }
    }
    
    /**
     * Unsets the "newTime" element
     */
    public void unsetNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEWTIME$2, 0);
        }
    }
}
