/*
 * An XML document type.
 * Localname: flightOperationsEventMsgRq
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1
 * Java type: comSchemaCdmOperationsFlightOperationsV1.qantas.FlightOperationsEventMsgRqDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsV1.qantas.impl;
/**
 * A document containing one flightOperationsEventMsgRq(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1) element.
 *
 * This is a complex type.
 */
public class FlightOperationsEventMsgRqDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsV1.qantas.FlightOperationsEventMsgRqDocument
{
    
    public FlightOperationsEventMsgRqDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLIGHTOPERATIONSEVENTMSGRQ$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "flightOperationsEventMsgRq");
    
    
    /**
     * Gets the "flightOperationsEventMsgRq" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType getFlightOperationsEventMsgRq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType)get_store().find_element_user(FLIGHTOPERATIONSEVENTMSGRQ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "flightOperationsEventMsgRq" element
     */
    public void setFlightOperationsEventMsgRq(comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType flightOperationsEventMsgRq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType)get_store().find_element_user(FLIGHTOPERATIONSEVENTMSGRQ$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType)get_store().add_element_user(FLIGHTOPERATIONSEVENTMSGRQ$0);
            }
            target.set(flightOperationsEventMsgRq);
        }
    }
    
    /**
     * Appends and returns a new empty "flightOperationsEventMsgRq" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType addNewFlightOperationsEventMsgRq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType)get_store().add_element_user(FLIGHTOPERATIONSEVENTMSGRQ$0);
            return target;
        }
    }
}
