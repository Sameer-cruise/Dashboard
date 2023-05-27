/*
 * An XML document type.
 * Localname: retriveFlightLegMsgRes
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgResDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.impl;
/**
 * A document containing one retriveFlightLegMsgRes(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1) element.
 *
 * This is a complex type.
 */
public class RetriveFlightLegMsgResDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgResDocument
{
    
    public RetriveFlightLegMsgResDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIVEFLIGHTLEGMSGRES$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "retriveFlightLegMsgRes");
    
    
    /**
     * Gets the "retriveFlightLegMsgRes" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType getRetriveFlightLegMsgRes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType)get_store().find_element_user(RETRIVEFLIGHTLEGMSGRES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "retriveFlightLegMsgRes" element
     */
    public void setRetriveFlightLegMsgRes(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType retriveFlightLegMsgRes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType)get_store().find_element_user(RETRIVEFLIGHTLEGMSGRES$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType)get_store().add_element_user(RETRIVEFLIGHTLEGMSGRES$0);
            }
            target.set(retriveFlightLegMsgRes);
        }
    }
    
    /**
     * Appends and returns a new empty "retriveFlightLegMsgRes" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType addNewRetriveFlightLegMsgRes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType)get_store().add_element_user(RETRIVEFLIGHTLEGMSGRES$0);
            return target;
        }
    }
}
