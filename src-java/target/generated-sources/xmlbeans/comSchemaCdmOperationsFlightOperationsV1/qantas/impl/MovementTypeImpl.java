/*
 * XML Type:  movementType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1
 * Java type: comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsV1.qantas.impl;
/**
 * An XML movementType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
 *
 * This is a complex type.
 */
public class MovementTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType
{
    
    public MovementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRIVALAIRPORT$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "arrivalAirport");
    
    
    /**
     * Gets the "arrivalAirport" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportType getArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(ARRIVALAIRPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(ARRIVALAIRPORT$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(ARRIVALAIRPORT$0);
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
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(ARRIVALAIRPORT$0);
            return target;
        }
    }
}
