/*
 * XML Type:  CustomFlightLegType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.impl;
/**
 * An XML CustomFlightLegType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
 *
 * This is a complex type.
 */
public class CustomFlightLegTypeImpl extends org.iata.iata.x2007.x00.impl.FlightLegTypeImpl implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType
{
    
    public CustomFlightLegTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELAYDETAILS$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "DelayDetails");
    private static final javax.xml.namespace.QName GROUNDTIME$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "GroundTime");
    
    
    /**
     * Gets array of all "DelayDetails" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType[] getDelayDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELAYDETAILS$0, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DelayDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType getDelayDetailsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType)get_store().find_element_user(DELAYDETAILS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DelayDetails" element
     */
    public int sizeOfDelayDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELAYDETAILS$0);
        }
    }
    
    /**
     * Sets array of all "DelayDetails" element
     */
    public void setDelayDetailsArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType[] delayDetailsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(delayDetailsArray, DELAYDETAILS$0);
        }
    }
    
    /**
     * Sets ith "DelayDetails" element
     */
    public void setDelayDetailsArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType delayDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType)get_store().find_element_user(DELAYDETAILS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(delayDetails);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DelayDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType insertNewDelayDetails(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType)get_store().insert_element_user(DELAYDETAILS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DelayDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType addNewDelayDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType)get_store().add_element_user(DELAYDETAILS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DelayDetails" element
     */
    public void removeDelayDetails(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELAYDETAILS$0, i);
        }
    }
    
    /**
     * Gets array of all "GroundTime" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime[] getGroundTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUNDTIME$2, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GroundTime" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime getGroundTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime)get_store().find_element_user(GROUNDTIME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "GroundTime" element
     */
    public int sizeOfGroundTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUNDTIME$2);
        }
    }
    
    /**
     * Sets array of all "GroundTime" element
     */
    public void setGroundTimeArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime[] groundTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groundTimeArray, GROUNDTIME$2);
        }
    }
    
    /**
     * Sets ith "GroundTime" element
     */
    public void setGroundTimeArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime groundTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime)get_store().find_element_user(GROUNDTIME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(groundTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GroundTime" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime insertNewGroundTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime)get_store().insert_element_user(GROUNDTIME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GroundTime" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime addNewGroundTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime)get_store().add_element_user(GROUNDTIME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "GroundTime" element
     */
    public void removeGroundTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUNDTIME$2, i);
        }
    }
    /**
     * An XML GroundTime(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType$GroundTime.
     */
    public static class GroundTimeImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime
    {
        
        public GroundTimeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected GroundTimeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "Type");
        
        
        /**
         * Gets the "Type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "Type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$0);
            }
        }
    }
}
