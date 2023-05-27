/*
 * XML Type:  BaseEventType
 * Namespace: urn:www.qantas.com:schema:cdm:common:Events:v1
 * Java type: comSchemaCdmCommonEventsV1.qantas.BaseEventType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmCommonEventsV1.qantas.impl;
/**
 * An XML BaseEventType(@urn:www.qantas.com:schema:cdm:common:Events:v1).
 *
 * This is a complex type.
 */
public class BaseEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmCommonEventsV1.qantas.BaseEventType
{
    
    public BaseEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTNAME$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "EventName");
    private static final javax.xml.namespace.QName EVENTID$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "EventID");
    private static final javax.xml.namespace.QName EXTERNALID$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "ExternalID");
    private static final javax.xml.namespace.QName EVENTTIME$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "EventTime");
    
    
    /**
     * Gets the "EventName" element
     */
    public comSchemaCdmCommonEventsV1.qantas.EventNameType.Enum getEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return (comSchemaCdmCommonEventsV1.qantas.EventNameType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventName" element
     */
    public comSchemaCdmCommonEventsV1.qantas.EventNameType xgetEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonEventsV1.qantas.EventNameType target = null;
            target = (comSchemaCdmCommonEventsV1.qantas.EventNameType)get_store().find_element_user(EVENTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EventName" element
     */
    public void setEventName(comSchemaCdmCommonEventsV1.qantas.EventNameType.Enum eventName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTNAME$0);
            }
            target.setEnumValue(eventName);
        }
    }
    
    /**
     * Sets (as xml) the "EventName" element
     */
    public void xsetEventName(comSchemaCdmCommonEventsV1.qantas.EventNameType eventName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonEventsV1.qantas.EventNameType target = null;
            target = (comSchemaCdmCommonEventsV1.qantas.EventNameType)get_store().find_element_user(EVENTNAME$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonEventsV1.qantas.EventNameType)get_store().add_element_user(EVENTNAME$0);
            }
            target.set(eventName);
        }
    }
    
    /**
     * Gets the "EventID" element
     */
    public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID getEventID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID target = null;
            target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID)get_store().find_element_user(EVENTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EventID" element
     */
    public void setEventID(comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID eventID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID target = null;
            target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID)get_store().find_element_user(EVENTID$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID)get_store().add_element_user(EVENTID$2);
            }
            target.set(eventID);
        }
    }
    
    /**
     * Appends and returns a new empty "EventID" element
     */
    public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID addNewEventID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID target = null;
            target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID)get_store().add_element_user(EVENTID$2);
            return target;
        }
    }
    
    /**
     * Gets the "ExternalID" element
     */
    public comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID getExternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID target = null;
            target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID)get_store().find_element_user(EXTERNALID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExternalID" element
     */
    public void setExternalID(comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID externalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID target = null;
            target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID)get_store().find_element_user(EXTERNALID$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID)get_store().add_element_user(EXTERNALID$4);
            }
            target.set(externalID);
        }
    }
    
    /**
     * Appends and returns a new empty "ExternalID" element
     */
    public comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID addNewExternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID target = null;
            target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID)get_store().add_element_user(EXTERNALID$4);
            return target;
        }
    }
    
    /**
     * Gets the "EventTime" element
     */
    public java.util.Calendar getEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EventTime" element
     */
    public void setEventTime(java.util.Calendar eventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTIME$6);
            }
            target.setCalendarValue(eventTime);
        }
    }
    
    /**
     * Sets (as xml) the "EventTime" element
     */
    public void xsetEventTime(org.apache.xmlbeans.XmlDateTime eventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EVENTTIME$6);
            }
            target.set(eventTime);
        }
    }
    /**
     * An XML EventID(@urn:www.qantas.com:schema:cdm:common:Events:v1).
     *
     * This is a complex type.
     */
    public static class EventIDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID
    {
        
        public EventIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AIRLINE$0 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "Airline");
        private static final javax.xml.namespace.QName FLIGHTNUMBER$2 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "FlightNumber");
        private static final javax.xml.namespace.QName DATE$4 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "Date");
        private static final javax.xml.namespace.QName ARRIVALAIRPORT$6 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "ArrivalAirport");
        private static final javax.xml.namespace.QName DEPARTUREAIRPORT$8 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "DepartureAirport");
        private static final javax.xml.namespace.QName COMERCIALSUFFIX$10 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "ComercialSuffix");
        private static final javax.xml.namespace.QName EVENTSEQUENTID$12 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "Event_SequentID");
        private static final javax.xml.namespace.QName SEQUNET$14 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "Sequnet");
        
        
        /**
         * Gets array of all "Airline" elements
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline[] getAirlineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AIRLINE$0, targetList);
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline[] result = new comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Airline" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline getAirlineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline)get_store().find_element_user(AIRLINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Airline" element
         */
        public int sizeOfAirlineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AIRLINE$0);
            }
        }
        
        /**
         * Sets array of all "Airline" element
         */
        public void setAirlineArray(comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline[] airlineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(airlineArray, AIRLINE$0);
            }
        }
        
        /**
         * Sets ith "Airline" element
         */
        public void setAirlineArray(int i, comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline airline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline)get_store().find_element_user(AIRLINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(airline);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Airline" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline insertNewAirline(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline)get_store().insert_element_user(AIRLINE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Airline" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline addNewAirline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline)get_store().add_element_user(AIRLINE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Airline" element
         */
        public void removeAirline(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AIRLINE$0, i);
            }
        }
        
        /**
         * Gets the "FlightNumber" element
         */
        public java.lang.String getFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FlightNumber" element
         */
        public org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
                target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "FlightNumber" element
         */
        public boolean isSetFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FLIGHTNUMBER$2) != 0;
            }
        }
        
        /**
         * Sets the "FlightNumber" element
         */
        public void setFlightNumber(java.lang.String flightNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTNUMBER$2);
                }
                target.setStringValue(flightNumber);
            }
        }
        
        /**
         * Sets (as xml) the "FlightNumber" element
         */
        public void xsetFlightNumber(org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
                target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$2, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().add_element_user(FLIGHTNUMBER$2);
                }
                target.set(flightNumber);
            }
        }
        
        /**
         * Unsets the "FlightNumber" element
         */
        public void unsetFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FLIGHTNUMBER$2, 0);
            }
        }
        
        /**
         * Gets the "Date" element
         */
        public java.util.Calendar getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Date" element
         */
        public org.apache.xmlbeans.XmlDate xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "Date" element
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATE$4) != 0;
            }
        }
        
        /**
         * Sets the "Date" element
         */
        public void setDate(java.util.Calendar date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$4);
                }
                target.setCalendarValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "Date" element
         */
        public void xsetDate(org.apache.xmlbeans.XmlDate date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATE$4);
                }
                target.set(date);
            }
        }
        
        /**
         * Unsets the "Date" element
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATE$4, 0);
            }
        }
        
        /**
         * Gets array of all "ArrivalAirport" elements
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport[] getArrivalAirportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ARRIVALAIRPORT$6, targetList);
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport[] result = new comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ArrivalAirport" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport getArrivalAirportArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ArrivalAirport" element
         */
        public int sizeOfArrivalAirportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARRIVALAIRPORT$6);
            }
        }
        
        /**
         * Sets array of all "ArrivalAirport" element
         */
        public void setArrivalAirportArray(comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport[] arrivalAirportArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(arrivalAirportArray, ARRIVALAIRPORT$6);
            }
        }
        
        /**
         * Sets ith "ArrivalAirport" element
         */
        public void setArrivalAirportArray(int i, comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport arrivalAirport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(arrivalAirport);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ArrivalAirport" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport insertNewArrivalAirport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport)get_store().insert_element_user(ARRIVALAIRPORT$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ArrivalAirport" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport addNewArrivalAirport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "ArrivalAirport" element
         */
        public void removeArrivalAirport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARRIVALAIRPORT$6, i);
            }
        }
        
        /**
         * Gets array of all "DepartureAirport" elements
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport[] getDepartureAirportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEPARTUREAIRPORT$8, targetList);
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport[] result = new comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DepartureAirport" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport getDepartureAirportArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DepartureAirport" element
         */
        public int sizeOfDepartureAirportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEPARTUREAIRPORT$8);
            }
        }
        
        /**
         * Sets array of all "DepartureAirport" element
         */
        public void setDepartureAirportArray(comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport[] departureAirportArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(departureAirportArray, DEPARTUREAIRPORT$8);
            }
        }
        
        /**
         * Sets ith "DepartureAirport" element
         */
        public void setDepartureAirportArray(int i, comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport departureAirport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(departureAirport);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DepartureAirport" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport insertNewDepartureAirport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport)get_store().insert_element_user(DEPARTUREAIRPORT$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DepartureAirport" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport addNewDepartureAirport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "DepartureAirport" element
         */
        public void removeDepartureAirport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEPARTUREAIRPORT$8, i);
            }
        }
        
        /**
         * Gets the "ComercialSuffix" element
         */
        public java.lang.String getComercialSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMERCIALSUFFIX$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ComercialSuffix" element
         */
        public org.apache.xmlbeans.XmlString xgetComercialSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMERCIALSUFFIX$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "ComercialSuffix" element
         */
        public boolean isSetComercialSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMERCIALSUFFIX$10) != 0;
            }
        }
        
        /**
         * Sets the "ComercialSuffix" element
         */
        public void setComercialSuffix(java.lang.String comercialSuffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMERCIALSUFFIX$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMERCIALSUFFIX$10);
                }
                target.setStringValue(comercialSuffix);
            }
        }
        
        /**
         * Sets (as xml) the "ComercialSuffix" element
         */
        public void xsetComercialSuffix(org.apache.xmlbeans.XmlString comercialSuffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMERCIALSUFFIX$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMERCIALSUFFIX$10);
                }
                target.set(comercialSuffix);
            }
        }
        
        /**
         * Unsets the "ComercialSuffix" element
         */
        public void unsetComercialSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMERCIALSUFFIX$10, 0);
            }
        }
        
        /**
         * Gets the "Event_SequentID" element
         */
        public int getEventSequentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSEQUENTID$12, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Event_SequentID" element
         */
        public org.apache.xmlbeans.XmlInt xgetEventSequentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EVENTSEQUENTID$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "Event_SequentID" element
         */
        public boolean isSetEventSequentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENTSEQUENTID$12) != 0;
            }
        }
        
        /**
         * Sets the "Event_SequentID" element
         */
        public void setEventSequentID(int eventSequentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSEQUENTID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSEQUENTID$12);
                }
                target.setIntValue(eventSequentID);
            }
        }
        
        /**
         * Sets (as xml) the "Event_SequentID" element
         */
        public void xsetEventSequentID(org.apache.xmlbeans.XmlInt eventSequentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EVENTSEQUENTID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EVENTSEQUENTID$12);
                }
                target.set(eventSequentID);
            }
        }
        
        /**
         * Unsets the "Event_SequentID" element
         */
        public void unsetEventSequentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENTSEQUENTID$12, 0);
            }
        }
        
        /**
         * Gets the "Sequnet" element
         */
        public int getSequnet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUNET$14, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Sequnet" element
         */
        public org.apache.xmlbeans.XmlInt xgetSequnet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUNET$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "Sequnet" element
         */
        public boolean isSetSequnet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQUNET$14) != 0;
            }
        }
        
        /**
         * Sets the "Sequnet" element
         */
        public void setSequnet(int sequnet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUNET$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQUNET$14);
                }
                target.setIntValue(sequnet);
            }
        }
        
        /**
         * Sets (as xml) the "Sequnet" element
         */
        public void xsetSequnet(org.apache.xmlbeans.XmlInt sequnet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUNET$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SEQUNET$14);
                }
                target.set(sequnet);
            }
        }
        
        /**
         * Unsets the "Sequnet" element
         */
        public void unsetSequnet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQUNET$14, 0);
            }
        }
        /**
         * An XML Airline(@urn:www.qantas.com:schema:cdm:common:Events:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmCommonEventsV1.qantas.BaseEventType$EventID$Airline.
         */
        public static class AirlineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline
        {
            
            public AirlineImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected AirlineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName CODECONTEXT$0 = 
                new javax.xml.namespace.QName("", "CodeContext");
            
            
            /**
             * Gets the "CodeContext" attribute
             */
            public java.lang.String getCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
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
            public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
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
                    return get_store().find_attribute_user(CODECONTEXT$0) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                    }
                    target.setStringValue(codeContext);
                }
            }
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
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
                    get_store().remove_attribute(CODECONTEXT$0);
                }
            }
        }
        /**
         * An XML ArrivalAirport(@urn:www.qantas.com:schema:cdm:common:Events:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmCommonEventsV1.qantas.BaseEventType$EventID$ArrivalAirport.
         */
        public static class ArrivalAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport
        {
            
            public ArrivalAirportImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ArrivalAirportImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName CODECONTEXT$0 = 
                new javax.xml.namespace.QName("", "CodeContext");
            
            
            /**
             * Gets the "CodeContext" attribute
             */
            public java.lang.String getCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
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
            public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
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
                    return get_store().find_attribute_user(CODECONTEXT$0) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                    }
                    target.setStringValue(codeContext);
                }
            }
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
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
                    get_store().remove_attribute(CODECONTEXT$0);
                }
            }
        }
        /**
         * An XML DepartureAirport(@urn:www.qantas.com:schema:cdm:common:Events:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmCommonEventsV1.qantas.BaseEventType$EventID$DepartureAirport.
         */
        public static class DepartureAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport
        {
            
            public DepartureAirportImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected DepartureAirportImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName CODECONTEXT$0 = 
                new javax.xml.namespace.QName("", "CodeContext");
            
            
            /**
             * Gets the "CodeContext" attribute
             */
            public java.lang.String getCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
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
            public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
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
                    return get_store().find_attribute_user(CODECONTEXT$0) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                    }
                    target.setStringValue(codeContext);
                }
            }
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
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
                    get_store().remove_attribute(CODECONTEXT$0);
                }
            }
        }
    }
    /**
     * An XML ExternalID(@urn:www.qantas.com:schema:cdm:common:Events:v1).
     *
     * This is a complex type.
     */
    public static class ExternalIDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID
    {
        
        public ExternalIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FLIGHTNUMBER$0 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "FlightNumber");
        private static final javax.xml.namespace.QName DATE$2 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "Date");
        private static final javax.xml.namespace.QName PORT$4 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "Port");
        private static final javax.xml.namespace.QName SEQUENT$6 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:common:Events:v1", "Sequent");
        
        
        /**
         * Gets the "FlightNumber" element
         */
        public java.lang.String getFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FlightNumber" element
         */
        public org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
                target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "FlightNumber" element
         */
        public boolean isSetFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FLIGHTNUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "FlightNumber" element
         */
        public void setFlightNumber(java.lang.String flightNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTNUMBER$0);
                }
                target.setStringValue(flightNumber);
            }
        }
        
        /**
         * Sets (as xml) the "FlightNumber" element
         */
        public void xsetFlightNumber(org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
                target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().add_element_user(FLIGHTNUMBER$0);
                }
                target.set(flightNumber);
            }
        }
        
        /**
         * Unsets the "FlightNumber" element
         */
        public void unsetFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FLIGHTNUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "Date" element
         */
        public java.util.Calendar getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Date" element
         */
        public org.apache.xmlbeans.XmlDate xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Date" element
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATE$2) != 0;
            }
        }
        
        /**
         * Sets the "Date" element
         */
        public void setDate(java.util.Calendar date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$2);
                }
                target.setCalendarValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "Date" element
         */
        public void xsetDate(org.apache.xmlbeans.XmlDate date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATE$2);
                }
                target.set(date);
            }
        }
        
        /**
         * Unsets the "Date" element
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATE$2, 0);
            }
        }
        
        /**
         * Gets the "Port" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port getPort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port)get_store().find_element_user(PORT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Port" element
         */
        public boolean isSetPort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PORT$4) != 0;
            }
        }
        
        /**
         * Sets the "Port" element
         */
        public void setPort(comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port port)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port)get_store().find_element_user(PORT$4, 0);
                if (target == null)
                {
                    target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port)get_store().add_element_user(PORT$4);
                }
                target.set(port);
            }
        }
        
        /**
         * Appends and returns a new empty "Port" element
         */
        public comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port addNewPort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port target = null;
                target = (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port)get_store().add_element_user(PORT$4);
                return target;
            }
        }
        
        /**
         * Unsets the "Port" element
         */
        public void unsetPort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PORT$4, 0);
            }
        }
        
        /**
         * Gets the "Sequent" element
         */
        public int getSequent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENT$6, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Sequent" element
         */
        public org.apache.xmlbeans.XmlInt xgetSequent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUENT$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "Sequent" element
         */
        public boolean isSetSequent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQUENT$6) != 0;
            }
        }
        
        /**
         * Sets the "Sequent" element
         */
        public void setSequent(int sequent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQUENT$6);
                }
                target.setIntValue(sequent);
            }
        }
        
        /**
         * Sets (as xml) the "Sequent" element
         */
        public void xsetSequent(org.apache.xmlbeans.XmlInt sequent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUENT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SEQUENT$6);
                }
                target.set(sequent);
            }
        }
        
        /**
         * Unsets the "Sequent" element
         */
        public void unsetSequent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQUENT$6, 0);
            }
        }
        /**
         * An XML Port(@urn:www.qantas.com:schema:cdm:common:Events:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmCommonEventsV1.qantas.BaseEventType$ExternalID$Port.
         */
        public static class PortImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port
        {
            
            public PortImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected PortImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName CODECONTEXT$0 = 
                new javax.xml.namespace.QName("", "CodeContext");
            
            
            /**
             * Gets the "CodeContext" attribute
             */
            public java.lang.String getCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
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
            public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
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
                    return get_store().find_attribute_user(CODECONTEXT$0) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                    }
                    target.setStringValue(codeContext);
                }
            }
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
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
                    get_store().remove_attribute(CODECONTEXT$0);
                }
            }
        }
    }
}
