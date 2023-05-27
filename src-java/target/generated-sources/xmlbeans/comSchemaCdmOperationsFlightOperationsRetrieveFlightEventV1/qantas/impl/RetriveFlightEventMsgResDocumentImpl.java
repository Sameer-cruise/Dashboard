/*
 * An XML document type.
 * Localname: retriveFlightEventMsgRes
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventMsgResDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.impl;
/**
 * A document containing one retriveFlightEventMsgRes(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1) element.
 *
 * This is a complex type.
 */
public class RetriveFlightEventMsgResDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventMsgResDocument
{
    
    public RetriveFlightEventMsgResDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIVEFLIGHTEVENTMSGRES$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1", "retriveFlightEventMsgRes");
    
    
    /**
     * Gets the "retriveFlightEventMsgRes" element
     */
    public org.iata.iata.x2007.x00.FlightLegType getRetriveFlightEventMsgRes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().find_element_user(RETRIVEFLIGHTEVENTMSGRES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "retriveFlightEventMsgRes" element
     */
    public void setRetriveFlightEventMsgRes(org.iata.iata.x2007.x00.FlightLegType retriveFlightEventMsgRes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().find_element_user(RETRIVEFLIGHTEVENTMSGRES$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightLegType)get_store().add_element_user(RETRIVEFLIGHTEVENTMSGRES$0);
            }
            target.set(retriveFlightEventMsgRes);
        }
    }
    
    /**
     * Appends and returns a new empty "retriveFlightEventMsgRes" element
     */
    public org.iata.iata.x2007.x00.FlightLegType addNewRetriveFlightEventMsgRes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().add_element_user(RETRIVEFLIGHTEVENTMSGRES$0);
            return target;
        }
    }
}
