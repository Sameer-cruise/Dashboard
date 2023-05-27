/*
 * XML Type:  OperationsChangeEventType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1
 * Java type: comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsV1.qantas.impl;
/**
 * An XML OperationsChangeEventType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
 *
 * This is a complex type.
 */
public class OperationsChangeEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType
{
    
    public OperationsChangeEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTDETAILS$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "eventDetails");
    private static final javax.xml.namespace.QName SUBEVENTS$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "subEvents");
    
    
    /**
     * Gets the "eventDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails getEventDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails)get_store().find_element_user(EVENTDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eventDetails" element
     */
    public void setEventDetails(comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails eventDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails)get_store().find_element_user(EVENTDETAILS$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails)get_store().add_element_user(EVENTDETAILS$0);
            }
            target.set(eventDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "eventDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails addNewEventDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails)get_store().add_element_user(EVENTDETAILS$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "subEvents" elements
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents[] getSubEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBEVENTS$2, targetList);
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents[] result = new comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subEvents" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents getSubEventsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents)get_store().find_element_user(SUBEVENTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subEvents" element
     */
    public int sizeOfSubEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBEVENTS$2);
        }
    }
    
    /**
     * Sets array of all "subEvents" element
     */
    public void setSubEventsArray(comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents[] subEventsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subEventsArray, SUBEVENTS$2);
        }
    }
    
    /**
     * Sets ith "subEvents" element
     */
    public void setSubEventsArray(int i, comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents subEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents)get_store().find_element_user(SUBEVENTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subEvents);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subEvents" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents insertNewSubEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents)get_store().insert_element_user(SUBEVENTS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subEvents" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents addNewSubEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents)get_store().add_element_user(SUBEVENTS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "subEvents" element
     */
    public void removeSubEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBEVENTS$2, i);
        }
    }
    /**
     * An XML eventDetails(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
     *
     * This is a complex type.
     */
    public static class EventDetailsImpl extends comSchemaCdmCommonEventsV1.qantas.impl.BaseEventTypeImpl implements comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails
    {
        
        public EventDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML subEvents(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
     *
     * This is a complex type.
     */
    public static class SubEventsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents
    {
        
        public SubEventsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBEVENTDETAILS$0 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "subEventDetails");
        private static final javax.xml.namespace.QName OTHERDETAILS$2 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "otherDetails");
        
        
        /**
         * Gets array of all "subEventDetails" elements
         */
        public comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType[] getSubEventDetailsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBEVENTDETAILS$0, targetList);
                comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType[] result = new comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "subEventDetails" element
         */
        public comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType getSubEventDetailsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType target = null;
                target = (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType)get_store().find_element_user(SUBEVENTDETAILS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "subEventDetails" element
         */
        public int sizeOfSubEventDetailsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBEVENTDETAILS$0);
            }
        }
        
        /**
         * Sets array of all "subEventDetails" element
         */
        public void setSubEventDetailsArray(comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType[] subEventDetailsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subEventDetailsArray, SUBEVENTDETAILS$0);
            }
        }
        
        /**
         * Sets ith "subEventDetails" element
         */
        public void setSubEventDetailsArray(int i, comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType subEventDetails)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType target = null;
                target = (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType)get_store().find_element_user(SUBEVENTDETAILS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subEventDetails);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subEventDetails" element
         */
        public comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType insertNewSubEventDetails(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType target = null;
                target = (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType)get_store().insert_element_user(SUBEVENTDETAILS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subEventDetails" element
         */
        public comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType addNewSubEventDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType target = null;
                target = (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType)get_store().add_element_user(SUBEVENTDETAILS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "subEventDetails" element
         */
        public void removeSubEventDetails(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBEVENTDETAILS$0, i);
            }
        }
        
        /**
         * Gets array of all "otherDetails" elements
         */
        public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails[] getOtherDetailsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OTHERDETAILS$2, targetList);
                comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails[] result = new comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "otherDetails" element
         */
        public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails getOtherDetailsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails target = null;
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails)get_store().find_element_user(OTHERDETAILS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "otherDetails" element
         */
        public int sizeOfOtherDetailsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OTHERDETAILS$2);
            }
        }
        
        /**
         * Sets array of all "otherDetails" element
         */
        public void setOtherDetailsArray(comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails[] otherDetailsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(otherDetailsArray, OTHERDETAILS$2);
            }
        }
        
        /**
         * Sets ith "otherDetails" element
         */
        public void setOtherDetailsArray(int i, comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails otherDetails)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails target = null;
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails)get_store().find_element_user(OTHERDETAILS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(otherDetails);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "otherDetails" element
         */
        public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails insertNewOtherDetails(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails target = null;
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails)get_store().insert_element_user(OTHERDETAILS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "otherDetails" element
         */
        public comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails addNewOtherDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails target = null;
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails)get_store().add_element_user(OTHERDETAILS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "otherDetails" element
         */
        public void removeOtherDetails(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OTHERDETAILS$2, i);
            }
        }
        /**
         * An XML otherDetails(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
         *
         * This is a complex type.
         */
        public static class OtherDetailsImpl extends comSchemaCdmOperationsFlightOperationsV1.qantas.impl.OtherDetailsTypeImpl implements comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails
        {
            
            public OtherDetailsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
