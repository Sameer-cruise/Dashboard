/*
 * XML Type:  FlightSearchType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas.impl;
/**
 * An XML FlightSearchType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public class FlightSearchTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType
{
    
    public FlightSearchTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELEMENTNUMBER$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "elementNumber");
    private static final javax.xml.namespace.QName CARRIER$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "carrier");
    private static final javax.xml.namespace.QName DEPARTUREAIRPORT$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "departureAirport");
    private static final javax.xml.namespace.QName DEPARTUREDATE$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "departureDate");
    private static final javax.xml.namespace.QName DEPARTURETIME$8 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "departureTime");
    private static final javax.xml.namespace.QName ARRIVALAIRPORT$10 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "arrivalAirport");
    private static final javax.xml.namespace.QName ARRIVALDATE$12 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "arrivalDate");
    private static final javax.xml.namespace.QName ARRIVALTIME$14 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "arrivalTime");
    private static final javax.xml.namespace.QName CLASSES$16 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "classes");
    
    
    /**
     * Gets the "elementNumber" element
     */
    public java.lang.String getElementNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENTNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "elementNumber" element
     */
    public comSchemaCdmCommonCommonV1.qantas.ElementNumberType xgetElementNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.ElementNumberType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.ElementNumberType)get_store().find_element_user(ELEMENTNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "elementNumber" element
     */
    public boolean isSetElementNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEMENTNUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "elementNumber" element
     */
    public void setElementNumber(java.lang.String elementNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELEMENTNUMBER$0);
            }
            target.setStringValue(elementNumber);
        }
    }
    
    /**
     * Sets (as xml) the "elementNumber" element
     */
    public void xsetElementNumber(comSchemaCdmCommonCommonV1.qantas.ElementNumberType elementNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.ElementNumberType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.ElementNumberType)get_store().find_element_user(ELEMENTNUMBER$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonCommonV1.qantas.ElementNumberType)get_store().add_element_user(ELEMENTNUMBER$0);
            }
            target.set(elementNumber);
        }
    }
    
    /**
     * Unsets the "elementNumber" element
     */
    public void unsetElementNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEMENTNUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "carrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(CARRIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "carrier" element
     */
    public void setCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType carrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(CARRIER$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(CARRIER$2);
            }
            target.set(carrier);
        }
    }
    
    /**
     * Appends and returns a new empty "carrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(CARRIER$2);
            return target;
        }
    }
    
    /**
     * Gets the "departureAirport" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportType getDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(DEPARTUREAIRPORT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "departureAirport" element
     */
    public boolean isSetDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTUREAIRPORT$4) != 0;
        }
    }
    
    /**
     * Sets the "departureAirport" element
     */
    public void setDepartureAirport(comSchemaCdmFlightnetworkAirportV1.qantas.AirportType departureAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(DEPARTUREAIRPORT$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(DEPARTUREAIRPORT$4);
            }
            target.set(departureAirport);
        }
    }
    
    /**
     * Appends and returns a new empty "departureAirport" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportType addNewDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(DEPARTUREAIRPORT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "departureAirport" element
     */
    public void unsetDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTUREAIRPORT$4, 0);
        }
    }
    
    /**
     * Gets the "departureDate" element
     */
    public java.util.Calendar getDepartureDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTUREDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "departureDate" element
     */
    public comSchemaCdmCommonCommonV1.qantas.DateType xgetDepartureDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.DateType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.DateType)get_store().find_element_user(DEPARTUREDATE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "departureDate" element
     */
    public void setDepartureDate(java.util.Calendar departureDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTUREDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPARTUREDATE$6);
            }
            target.setCalendarValue(departureDate);
        }
    }
    
    /**
     * Sets (as xml) the "departureDate" element
     */
    public void xsetDepartureDate(comSchemaCdmCommonCommonV1.qantas.DateType departureDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.DateType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.DateType)get_store().find_element_user(DEPARTUREDATE$6, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonCommonV1.qantas.DateType)get_store().add_element_user(DEPARTUREDATE$6);
            }
            target.set(departureDate);
        }
    }
    
    /**
     * Gets the "departureTime" element
     */
    public java.lang.String getDepartureTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTURETIME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "departureTime" element
     */
    public comSchemaCdmCommonCommonV1.qantas.TimeType xgetDepartureTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TimeType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().find_element_user(DEPARTURETIME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "departureTime" element
     */
    public boolean isSetDepartureTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTURETIME$8) != 0;
        }
    }
    
    /**
     * Sets the "departureTime" element
     */
    public void setDepartureTime(java.lang.String departureTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTURETIME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPARTURETIME$8);
            }
            target.setStringValue(departureTime);
        }
    }
    
    /**
     * Sets (as xml) the "departureTime" element
     */
    public void xsetDepartureTime(comSchemaCdmCommonCommonV1.qantas.TimeType departureTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TimeType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().find_element_user(DEPARTURETIME$8, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().add_element_user(DEPARTURETIME$8);
            }
            target.set(departureTime);
        }
    }
    
    /**
     * Unsets the "departureTime" element
     */
    public void unsetDepartureTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTURETIME$8, 0);
        }
    }
    
    /**
     * Gets the "arrivalAirport" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportType getArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(ARRIVALAIRPORT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "arrivalAirport" element
     */
    public boolean isSetArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRIVALAIRPORT$10) != 0;
        }
    }
    
    /**
     * Sets the "arrivalAirport" element
     */
    public void setArrivalAirport(comSchemaCdmFlightnetworkAirportV1.qantas.AirportType arrivalAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(ARRIVALAIRPORT$10, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(ARRIVALAIRPORT$10);
            }
            target.set(arrivalAirport);
        }
    }
    
    /**
     * Appends and returns a new empty "arrivalAirport" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportType addNewArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(ARRIVALAIRPORT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "arrivalAirport" element
     */
    public void unsetArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRIVALAIRPORT$10, 0);
        }
    }
    
    /**
     * Gets the "arrivalDate" element
     */
    public java.util.Calendar getArrivalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "arrivalDate" element
     */
    public comSchemaCdmCommonCommonV1.qantas.DateType xgetArrivalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.DateType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.DateType)get_store().find_element_user(ARRIVALDATE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "arrivalDate" element
     */
    public boolean isSetArrivalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRIVALDATE$12) != 0;
        }
    }
    
    /**
     * Sets the "arrivalDate" element
     */
    public void setArrivalDate(java.util.Calendar arrivalDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARRIVALDATE$12);
            }
            target.setCalendarValue(arrivalDate);
        }
    }
    
    /**
     * Sets (as xml) the "arrivalDate" element
     */
    public void xsetArrivalDate(comSchemaCdmCommonCommonV1.qantas.DateType arrivalDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.DateType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.DateType)get_store().find_element_user(ARRIVALDATE$12, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonCommonV1.qantas.DateType)get_store().add_element_user(ARRIVALDATE$12);
            }
            target.set(arrivalDate);
        }
    }
    
    /**
     * Unsets the "arrivalDate" element
     */
    public void unsetArrivalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRIVALDATE$12, 0);
        }
    }
    
    /**
     * Gets the "arrivalTime" element
     */
    public java.lang.String getArrivalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALTIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arrivalTime" element
     */
    public comSchemaCdmCommonCommonV1.qantas.TimeType xgetArrivalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TimeType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().find_element_user(ARRIVALTIME$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "arrivalTime" element
     */
    public boolean isSetArrivalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRIVALTIME$14) != 0;
        }
    }
    
    /**
     * Sets the "arrivalTime" element
     */
    public void setArrivalTime(java.lang.String arrivalTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALTIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARRIVALTIME$14);
            }
            target.setStringValue(arrivalTime);
        }
    }
    
    /**
     * Sets (as xml) the "arrivalTime" element
     */
    public void xsetArrivalTime(comSchemaCdmCommonCommonV1.qantas.TimeType arrivalTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TimeType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().find_element_user(ARRIVALTIME$14, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().add_element_user(ARRIVALTIME$14);
            }
            target.set(arrivalTime);
        }
    }
    
    /**
     * Unsets the "arrivalTime" element
     */
    public void unsetArrivalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRIVALTIME$14, 0);
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
            get_store().find_all_element_users(CLASSES$16, targetList);
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
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().find_element_user(CLASSES$16, i);
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
            return get_store().count_elements(CLASSES$16);
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
            arraySetterHelper(classesArray, CLASSES$16);
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
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().find_element_user(CLASSES$16, i);
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
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().insert_element_user(CLASSES$16, i);
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
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().add_element_user(CLASSES$16);
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
            get_store().remove_element(CLASSES$16, i);
        }
    }
}
