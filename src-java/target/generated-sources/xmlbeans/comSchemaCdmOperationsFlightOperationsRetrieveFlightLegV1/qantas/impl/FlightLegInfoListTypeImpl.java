/*
 * XML Type:  FlightLegInfoListType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.impl;
/**
 * An XML FlightLegInfoListType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
 *
 * This is a complex type.
 */
public class FlightLegInfoListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType
{
    
    public FlightLegInfoListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLIGHTLEGINFO$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "FlightLegInfo");
    private static final javax.xml.namespace.QName LEGDETAILS$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "LegDetails");
    
    
    /**
     * Gets array of all "FlightLegInfo" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType[] getFlightLegInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLIGHTLEGINFO$0, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType[] result = new comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FlightLegInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType getFlightLegInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType)get_store().find_element_user(FLIGHTLEGINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "FlightLegInfo" element
     */
    public int sizeOfFlightLegInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLIGHTLEGINFO$0);
        }
    }
    
    /**
     * Sets array of all "FlightLegInfo" element
     */
    public void setFlightLegInfoArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType[] flightLegInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flightLegInfoArray, FLIGHTLEGINFO$0);
        }
    }
    
    /**
     * Sets ith "FlightLegInfo" element
     */
    public void setFlightLegInfoArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType flightLegInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType)get_store().find_element_user(FLIGHTLEGINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(flightLegInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FlightLegInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType insertNewFlightLegInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType)get_store().insert_element_user(FLIGHTLEGINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FlightLegInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType addNewFlightLegInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType)get_store().add_element_user(FLIGHTLEGINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "FlightLegInfo" element
     */
    public void removeFlightLegInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLIGHTLEGINFO$0, i);
        }
    }
    
    /**
     * Gets array of all "LegDetails" elements
     */
    public org.iata.iata.x2007.x00.FlightLegType[] getLegDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LEGDETAILS$2, targetList);
            org.iata.iata.x2007.x00.FlightLegType[] result = new org.iata.iata.x2007.x00.FlightLegType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LegDetails" element
     */
    public org.iata.iata.x2007.x00.FlightLegType getLegDetailsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().find_element_user(LEGDETAILS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LegDetails" element
     */
    public int sizeOfLegDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGDETAILS$2);
        }
    }
    
    /**
     * Sets array of all "LegDetails" element
     */
    public void setLegDetailsArray(org.iata.iata.x2007.x00.FlightLegType[] legDetailsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(legDetailsArray, LEGDETAILS$2);
        }
    }
    
    /**
     * Sets ith "LegDetails" element
     */
    public void setLegDetailsArray(int i, org.iata.iata.x2007.x00.FlightLegType legDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().find_element_user(LEGDETAILS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(legDetails);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LegDetails" element
     */
    public org.iata.iata.x2007.x00.FlightLegType insertNewLegDetails(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().insert_element_user(LEGDETAILS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LegDetails" element
     */
    public org.iata.iata.x2007.x00.FlightLegType addNewLegDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().add_element_user(LEGDETAILS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "LegDetails" element
     */
    public void removeLegDetails(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGDETAILS$2, i);
        }
    }
}
