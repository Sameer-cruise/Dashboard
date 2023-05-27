/*
 * XML Type:  airportDetailsType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1
 * Java type: comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsV1.qantas.impl;
/**
 * An XML airportDetailsType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
 *
 * This is a complex type.
 */
public class AirportDetailsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType
{
    
    public AirportDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPARTUREAIRPORT$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "departureAirport");
    private static final javax.xml.namespace.QName ARRIVALAIRPORT$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "arrivalAirport");
    private static final javax.xml.namespace.QName MOVEMENT$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "movement");
    
    
    /**
     * Gets the "departureAirport" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportType getDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(DEPARTUREAIRPORT$0, 0);
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
            return get_store().count_elements(DEPARTUREAIRPORT$0) != 0;
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
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(DEPARTUREAIRPORT$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(DEPARTUREAIRPORT$0);
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
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(DEPARTUREAIRPORT$0);
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
            get_store().remove_element(DEPARTUREAIRPORT$0, 0);
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
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(ARRIVALAIRPORT$2, 0);
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
            return get_store().count_elements(ARRIVALAIRPORT$2) != 0;
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
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().find_element_user(ARRIVALAIRPORT$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(ARRIVALAIRPORT$2);
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
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType)get_store().add_element_user(ARRIVALAIRPORT$2);
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
            get_store().remove_element(ARRIVALAIRPORT$2, 0);
        }
    }
    
    /**
     * Gets the "movement" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType getMovement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType)get_store().find_element_user(MOVEMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "movement" element
     */
    public boolean isSetMovement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVEMENT$4) != 0;
        }
    }
    
    /**
     * Sets the "movement" element
     */
    public void setMovement(comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType movement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType)get_store().find_element_user(MOVEMENT$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType)get_store().add_element_user(MOVEMENT$4);
            }
            target.set(movement);
        }
    }
    
    /**
     * Appends and returns a new empty "movement" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType addNewMovement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType)get_store().add_element_user(MOVEMENT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "movement" element
     */
    public void unsetMovement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVEMENT$4, 0);
        }
    }
}
