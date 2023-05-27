/*
 * An XML document type.
 * Localname: retriveTileDetailsMsgRes
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgResDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.impl;
/**
 * A document containing one retriveTileDetailsMsgRes(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1) element.
 *
 * This is a complex type.
 */
public class RetriveTileDetailsMsgResDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgResDocument
{
    
    public RetriveTileDetailsMsgResDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIVETILEDETAILSMSGRES$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "retriveTileDetailsMsgRes");
    
    
    /**
     * Gets the "retriveTileDetailsMsgRes" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType getRetriveTileDetailsMsgRes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType)get_store().find_element_user(RETRIVETILEDETAILSMSGRES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "retriveTileDetailsMsgRes" element
     */
    public void setRetriveTileDetailsMsgRes(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType retriveTileDetailsMsgRes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType)get_store().find_element_user(RETRIVETILEDETAILSMSGRES$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType)get_store().add_element_user(RETRIVETILEDETAILSMSGRES$0);
            }
            target.set(retriveTileDetailsMsgRes);
        }
    }
    
    /**
     * Appends and returns a new empty "retriveTileDetailsMsgRes" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType addNewRetriveTileDetailsMsgRes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType)get_store().add_element_user(RETRIVETILEDETAILSMSGRES$0);
            return target;
        }
    }
}
