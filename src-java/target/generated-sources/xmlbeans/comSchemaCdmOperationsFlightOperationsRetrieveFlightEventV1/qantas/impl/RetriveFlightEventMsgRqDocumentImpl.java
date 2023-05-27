/*
 * An XML document type.
 * Localname: retriveFlightEventMsgRq
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventMsgRqDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.impl;
/**
 * A document containing one retriveFlightEventMsgRq(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1) element.
 *
 * This is a complex type.
 */
public class RetriveFlightEventMsgRqDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventMsgRqDocument
{
    
    public RetriveFlightEventMsgRqDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIVEFLIGHTEVENTMSGRQ$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1", "retriveFlightEventMsgRq");
    
    
    /**
     * Gets the "retriveFlightEventMsgRq" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType getRetriveFlightEventMsgRq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType)get_store().find_element_user(RETRIVEFLIGHTEVENTMSGRQ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "retriveFlightEventMsgRq" element
     */
    public void setRetriveFlightEventMsgRq(comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType retriveFlightEventMsgRq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType)get_store().find_element_user(RETRIVEFLIGHTEVENTMSGRQ$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType)get_store().add_element_user(RETRIVEFLIGHTEVENTMSGRQ$0);
            }
            target.set(retriveFlightEventMsgRq);
        }
    }
    
    /**
     * Appends and returns a new empty "retriveFlightEventMsgRq" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType addNewRetriveFlightEventMsgRq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType)get_store().add_element_user(RETRIVEFLIGHTEVENTMSGRQ$0);
            return target;
        }
    }
}
