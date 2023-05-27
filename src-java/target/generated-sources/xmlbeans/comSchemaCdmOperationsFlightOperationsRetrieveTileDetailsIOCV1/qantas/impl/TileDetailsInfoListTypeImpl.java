/*
 * XML Type:  TileDetailsInfoListType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.impl;
/**
 * An XML TileDetailsInfoListType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
 *
 * This is a complex type.
 */
public class TileDetailsInfoListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoListType
{
    
    public TileDetailsInfoListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TILEDETAILSINFO$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "TileDetailsInfo");
    
    
    /**
     * Gets array of all "TileDetailsInfo" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType[] getTileDetailsInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TILEDETAILSINFO$0, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TileDetailsInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType getTileDetailsInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType)get_store().find_element_user(TILEDETAILSINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TileDetailsInfo" element
     */
    public int sizeOfTileDetailsInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TILEDETAILSINFO$0);
        }
    }
    
    /**
     * Sets array of all "TileDetailsInfo" element
     */
    public void setTileDetailsInfoArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType[] tileDetailsInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tileDetailsInfoArray, TILEDETAILSINFO$0);
        }
    }
    
    /**
     * Sets ith "TileDetailsInfo" element
     */
    public void setTileDetailsInfoArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType tileDetailsInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType)get_store().find_element_user(TILEDETAILSINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tileDetailsInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TileDetailsInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType insertNewTileDetailsInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType)get_store().insert_element_user(TILEDETAILSINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TileDetailsInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType addNewTileDetailsInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType)get_store().add_element_user(TILEDETAILSINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TileDetailsInfo" element
     */
    public void removeTileDetailsInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TILEDETAILSINFO$0, i);
        }
    }
}
