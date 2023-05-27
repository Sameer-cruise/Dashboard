/*
 * XML Type:  CarrierType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas.impl;
/**
 * An XML CarrierType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public class CarrierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType
{
    
    public CarrierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRLINE$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "airline");
    private static final javax.xml.namespace.QName FLIGHTNUMBER$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "flightNumber");
    
    
    /**
     * Gets the "airline" element
     */
    public comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType getAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType target = null;
            target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType)get_store().find_element_user(AIRLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "airline" element
     */
    public void setAirline(comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType airline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType target = null;
            target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType)get_store().find_element_user(AIRLINE$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType)get_store().add_element_user(AIRLINE$0);
            }
            target.set(airline);
        }
    }
    
    /**
     * Appends and returns a new empty "airline" element
     */
    public comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType addNewAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType target = null;
            target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType)get_store().add_element_user(AIRLINE$0);
            return target;
        }
    }
    
    /**
     * Gets the "flightNumber" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType getFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().find_element_user(FLIGHTNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "flightNumber" element
     */
    public void setFlightNumber(comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().find_element_user(FLIGHTNUMBER$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().add_element_user(FLIGHTNUMBER$2);
            }
            target.set(flightNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "flightNumber" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType addNewFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().add_element_user(FLIGHTNUMBER$2);
            return target;
        }
    }
}
