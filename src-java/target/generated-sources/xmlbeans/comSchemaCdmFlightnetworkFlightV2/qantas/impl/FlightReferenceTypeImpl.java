/*
 * XML Type:  FlightReferenceType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas.impl;
/**
 * An XML FlightReferenceType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public class FlightReferenceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType
{
    
    public FlightReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MARKETINGCARRIER$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "marketingCarrier");
    private static final javax.xml.namespace.QName OPERATINGCARRIER$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "operatingCarrier");
    private static final javax.xml.namespace.QName DEPARTURE$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "departure");
    private static final javax.xml.namespace.QName ARRIVAL$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "arrival");
    private static final javax.xml.namespace.QName CLASSES$8 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "classes");
    private static final javax.xml.namespace.QName ACTIONCODE$10 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "actionCode");
    
    
    /**
     * Gets the "marketingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getMarketingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(MARKETINGCARRIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "marketingCarrier" element
     */
    public void setMarketingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType marketingCarrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(MARKETINGCARRIER$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(MARKETINGCARRIER$0);
            }
            target.set(marketingCarrier);
        }
    }
    
    /**
     * Appends and returns a new empty "marketingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewMarketingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(MARKETINGCARRIER$0);
            return target;
        }
    }
    
    /**
     * Gets the "operatingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(OPERATINGCARRIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "operatingCarrier" element
     */
    public boolean isSetOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATINGCARRIER$2) != 0;
        }
    }
    
    /**
     * Sets the "operatingCarrier" element
     */
    public void setOperatingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType operatingCarrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(OPERATINGCARRIER$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(OPERATINGCARRIER$2);
            }
            target.set(operatingCarrier);
        }
    }
    
    /**
     * Appends and returns a new empty "operatingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(OPERATINGCARRIER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "operatingCarrier" element
     */
    public void unsetOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATINGCARRIER$2, 0);
        }
    }
    
    /**
     * Gets the "departure" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType getDeparture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(DEPARTURE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "departure" element
     */
    public void setDeparture(comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType departure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(DEPARTURE$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(DEPARTURE$4);
            }
            target.set(departure);
        }
    }
    
    /**
     * Appends and returns a new empty "departure" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType addNewDeparture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(DEPARTURE$4);
            return target;
        }
    }
    
    /**
     * Gets the "arrival" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType getArrival()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(ARRIVAL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "arrival" element
     */
    public void setArrival(comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType arrival)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(ARRIVAL$6, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(ARRIVAL$6);
            }
            target.set(arrival);
        }
    }
    
    /**
     * Appends and returns a new empty "arrival" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType addNewArrival()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(ARRIVAL$6);
            return target;
        }
    }
    
    /**
     * Gets array of all "classes" elements
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[] getClassesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLASSES$8, targetList);
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[] result = new comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "classes" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType getClassesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().find_element_user(CLASSES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "classes" element
     */
    public int sizeOfClassesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASSES$8);
        }
    }
    
    /**
     * Sets array of all "classes" element
     */
    public void setClassesArray(comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[] classesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(classesArray, CLASSES$8);
        }
    }
    
    /**
     * Sets ith "classes" element
     */
    public void setClassesArray(int i, comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType classes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().find_element_user(CLASSES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(classes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "classes" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType insertNewClasses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().insert_element_user(CLASSES$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "classes" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType addNewClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().add_element_user(CLASSES$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "classes" element
     */
    public void removeClasses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASSES$8, i);
        }
    }
    
    /**
     * Gets the "actionCode" element
     */
    public java.lang.String getActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "actionCode" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType xgetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType)get_store().find_element_user(ACTIONCODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "actionCode" element
     */
    public boolean isSetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIONCODE$10) != 0;
        }
    }
    
    /**
     * Sets the "actionCode" element
     */
    public void setActionCode(java.lang.String actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIONCODE$10);
            }
            target.setStringValue(actionCode);
        }
    }
    
    /**
     * Sets (as xml) the "actionCode" element
     */
    public void xsetActionCode(comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType)get_store().find_element_user(ACTIONCODE$10, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType)get_store().add_element_user(ACTIONCODE$10);
            }
            target.set(actionCode);
        }
    }
    
    /**
     * Unsets the "actionCode" element
     */
    public void unsetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIONCODE$10, 0);
        }
    }
}
