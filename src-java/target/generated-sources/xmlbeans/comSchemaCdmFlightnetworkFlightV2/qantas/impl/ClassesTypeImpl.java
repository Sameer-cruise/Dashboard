/*
 * XML Type:  ClassesType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas.impl;
/**
 * An XML ClassesType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public class ClassesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType
{
    
    public ClassesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSOFSERVICE$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "classOfService");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "status");
    private static final javax.xml.namespace.QName PRICECLASS$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "priceClass");
    
    
    /**
     * Gets the "classOfService" element
     */
    public java.lang.String getClassOfService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSOFSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classOfService" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ClassOfServiceType xgetClassOfService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassOfServiceType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassOfServiceType)get_store().find_element_user(CLASSOFSERVICE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "classOfService" element
     */
    public void setClassOfService(java.lang.String classOfService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSOFSERVICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSOFSERVICE$0);
            }
            target.setStringValue(classOfService);
        }
    }
    
    /**
     * Sets (as xml) the "classOfService" element
     */
    public void xsetClassOfService(comSchemaCdmFlightnetworkFlightV2.qantas.ClassOfServiceType classOfService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassOfServiceType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassOfServiceType)get_store().find_element_user(CLASSOFSERVICE$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassOfServiceType)get_store().add_element_user(CLASSOFSERVICE$0);
            }
            target.set(classOfService);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.StatusType xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.StatusType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.StatusType)get_store().find_element_user(STATUS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(comSchemaCdmFlightnetworkFlightV2.qantas.StatusType status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.StatusType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.StatusType)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.StatusType)get_store().add_element_user(STATUS$2);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$2, 0);
        }
    }
    
    /**
     * Gets the "priceClass" element
     */
    public java.lang.String getPriceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICECLASS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "priceClass" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.PriceClassType xgetPriceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.PriceClassType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.PriceClassType)get_store().find_element_user(PRICECLASS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "priceClass" element
     */
    public boolean isSetPriceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICECLASS$4) != 0;
        }
    }
    
    /**
     * Sets the "priceClass" element
     */
    public void setPriceClass(java.lang.String priceClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICECLASS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICECLASS$4);
            }
            target.setStringValue(priceClass);
        }
    }
    
    /**
     * Sets (as xml) the "priceClass" element
     */
    public void xsetPriceClass(comSchemaCdmFlightnetworkFlightV2.qantas.PriceClassType priceClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.PriceClassType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.PriceClassType)get_store().find_element_user(PRICECLASS$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.PriceClassType)get_store().add_element_user(PRICECLASS$4);
            }
            target.set(priceClass);
        }
    }
    
    /**
     * Unsets the "priceClass" element
     */
    public void unsetPriceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICECLASS$4, 0);
        }
    }
}
