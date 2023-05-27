/*
 * An XML document type.
 * Localname: airport
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1
 * Java type: comSchemaCdmFlightnetworkAirportV1.qantas.AirportDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkAirportV1.qantas.impl;
/**
 * A document containing one airport(@urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1) element.
 *
 * This is a complex type.
 */
public class AirportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkAirportV1.qantas.AirportDocument
{
    
    public AirportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRPORT$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "airport");
    
    
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
}
