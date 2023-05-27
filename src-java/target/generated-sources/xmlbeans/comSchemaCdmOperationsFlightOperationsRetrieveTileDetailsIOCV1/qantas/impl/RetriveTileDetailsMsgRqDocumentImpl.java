/*
 * An XML document type.
 * Localname: retriveTileDetailsMsgRq
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.impl;
/**
 * A document containing one retriveTileDetailsMsgRq(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1) element.
 *
 * This is a complex type.
 */
public class RetriveTileDetailsMsgRqDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument
{
    
    public RetriveTileDetailsMsgRqDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIVETILEDETAILSMSGRQ$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "retriveTileDetailsMsgRq");
    
    
    /**
     * Gets the "retriveTileDetailsMsgRq" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC getRetriveTileDetailsMsgRq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC)get_store().find_element_user(RETRIVETILEDETAILSMSGRQ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "retriveTileDetailsMsgRq" element
     */
    public void setRetriveTileDetailsMsgRq(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC retriveTileDetailsMsgRq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC)get_store().find_element_user(RETRIVETILEDETAILSMSGRQ$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC)get_store().add_element_user(RETRIVETILEDETAILSMSGRQ$0);
            }
            target.set(retriveTileDetailsMsgRq);
        }
    }
    
    /**
     * Appends and returns a new empty "retriveTileDetailsMsgRq" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC addNewRetriveTileDetailsMsgRq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC)get_store().add_element_user(RETRIVETILEDETAILSMSGRQ$0);
            return target;
        }
    }
}
