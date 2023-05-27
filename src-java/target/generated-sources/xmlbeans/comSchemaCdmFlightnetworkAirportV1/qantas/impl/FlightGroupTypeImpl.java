/*
 * XML Type:  FlightGroupType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1
 * Java type: comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkAirportV1.qantas.impl;
/**
 * An XML FlightGroupType(@urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1).
 *
 * This is a complex type.
 */
public class FlightGroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType
{
    
    public FlightGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRPORT$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "airport");
    private static final javax.xml.namespace.QName DATE$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "date");
    private static final javax.xml.namespace.QName TIME$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "time");
    
    
    /**
     * Gets the "airport" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportType getAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(AIRPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "airport" element
     */
    public void setAirport(comSchemaCdmFlightnetworkAirportV1.qantas.AirportType airport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(AIRPORT$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(AIRPORT$0);
            }
            target.set(airport);
        }
    }
    
    /**
     * Appends and returns a new empty "airport" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportType addNewAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(AIRPORT$0);
            return target;
        }
    }
    
    /**
     * Gets the "date" element
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
     * Gets (as xml) the "date" element
     */
    public comSchemaCdmCommonCommonV1.qantas.DateType xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.DateType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.DateType)get_store().find_element_user(DATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "date" element
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
     * Sets (as xml) the "date" element
     */
    public void xsetDate(comSchemaCdmCommonCommonV1.qantas.DateType date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.DateType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.DateType)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonCommonV1.qantas.DateType)get_store().add_element_user(DATE$2);
            }
            target.set(date);
        }
    }
    
    /**
     * Gets the "time" element
     */
    public java.lang.String getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "time" element
     */
    public comSchemaCdmCommonCommonV1.qantas.TimeType xgetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TimeType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().find_element_user(TIME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "time" element
     */
    public void setTime(java.lang.String time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIME$4);
            }
            target.setStringValue(time);
        }
    }
    
    /**
     * Sets (as xml) the "time" element
     */
    public void xsetTime(comSchemaCdmCommonCommonV1.qantas.TimeType time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TimeType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().find_element_user(TIME$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().add_element_user(TIME$4);
            }
            target.set(time);
        }
    }
}
