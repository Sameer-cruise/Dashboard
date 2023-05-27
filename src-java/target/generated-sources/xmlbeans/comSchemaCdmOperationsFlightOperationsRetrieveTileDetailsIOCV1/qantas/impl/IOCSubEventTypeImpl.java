/*
 * XML Type:  IOCSubEventType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.IOCSubEventType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.impl;
/**
 * An XML IOCSubEventType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
 *
 * This is a complex type.
 */
public class IOCSubEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.IOCSubEventType
{
    
    public IOCSubEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTID$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "eventId");
    private static final javax.xml.namespace.QName EVENTCOUNT$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "eventCount");
    private static final javax.xml.namespace.QName PORTOFOCCURENCE$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "portOfOccurence");
    private static final javax.xml.namespace.QName EVENTSTATUS$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "eventStatus");
    private static final javax.xml.namespace.QName CREATEDBY$8 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "createdBy");
    private static final javax.xml.namespace.QName EVENTSUMMARY$10 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "eventSummary");
    private static final javax.xml.namespace.QName HASUPDATED$12 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "hasUpdated");
    
    
    /**
     * Gets array of all "eventId" elements
     */
    public java.math.BigInteger[] getEventIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTID$0, targetList);
            java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
            return result;
        }
    }
    
    /**
     * Gets ith "eventId" element
     */
    public java.math.BigInteger getEventIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "eventId" elements
     */
    public org.apache.xmlbeans.XmlInteger[] xgetEventIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTID$0, targetList);
            org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "eventId" element
     */
    public org.apache.xmlbeans.XmlInteger xgetEventIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EVENTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInteger)target;
        }
    }
    
    /**
     * Returns number of "eventId" element
     */
    public int sizeOfEventIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTID$0);
        }
    }
    
    /**
     * Sets array of all "eventId" element
     */
    public void setEventIdArray(java.math.BigInteger[] eventIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventIdArray, EVENTID$0);
        }
    }
    
    /**
     * Sets ith "eventId" element
     */
    public void setEventIdArray(int i, java.math.BigInteger eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(eventId);
        }
    }
    
    /**
     * Sets (as xml) array of all "eventId" element
     */
    public void xsetEventIdArray(org.apache.xmlbeans.XmlInteger[]eventIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventIdArray, EVENTID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "eventId" element
     */
    public void xsetEventIdArray(int i, org.apache.xmlbeans.XmlInteger eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EVENTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eventId);
        }
    }
    
    /**
     * Inserts the value as the ith "eventId" element
     */
    public void insertEventId(int i, java.math.BigInteger eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EVENTID$0, i);
            target.setBigIntegerValue(eventId);
        }
    }
    
    /**
     * Appends the value as the last "eventId" element
     */
    public void addEventId(java.math.BigInteger eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTID$0);
            target.setBigIntegerValue(eventId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventId" element
     */
    public org.apache.xmlbeans.XmlInteger insertNewEventId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(EVENTID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventId" element
     */
    public org.apache.xmlbeans.XmlInteger addNewEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(EVENTID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "eventId" element
     */
    public void removeEventId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTID$0, i);
        }
    }
    
    /**
     * Gets array of all "eventCount" elements
     */
    public java.math.BigInteger[] getEventCountArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTCOUNT$2, targetList);
            java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
            return result;
        }
    }
    
    /**
     * Gets ith "eventCount" element
     */
    public java.math.BigInteger getEventCountArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTCOUNT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "eventCount" elements
     */
    public org.apache.xmlbeans.XmlInteger[] xgetEventCountArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTCOUNT$2, targetList);
            org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "eventCount" element
     */
    public org.apache.xmlbeans.XmlInteger xgetEventCountArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EVENTCOUNT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInteger)target;
        }
    }
    
    /**
     * Returns number of "eventCount" element
     */
    public int sizeOfEventCountArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTCOUNT$2);
        }
    }
    
    /**
     * Sets array of all "eventCount" element
     */
    public void setEventCountArray(java.math.BigInteger[] eventCountArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventCountArray, EVENTCOUNT$2);
        }
    }
    
    /**
     * Sets ith "eventCount" element
     */
    public void setEventCountArray(int i, java.math.BigInteger eventCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTCOUNT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(eventCount);
        }
    }
    
    /**
     * Sets (as xml) array of all "eventCount" element
     */
    public void xsetEventCountArray(org.apache.xmlbeans.XmlInteger[]eventCountArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventCountArray, EVENTCOUNT$2);
        }
    }
    
    /**
     * Sets (as xml) ith "eventCount" element
     */
    public void xsetEventCountArray(int i, org.apache.xmlbeans.XmlInteger eventCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EVENTCOUNT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eventCount);
        }
    }
    
    /**
     * Inserts the value as the ith "eventCount" element
     */
    public void insertEventCount(int i, java.math.BigInteger eventCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EVENTCOUNT$2, i);
            target.setBigIntegerValue(eventCount);
        }
    }
    
    /**
     * Appends the value as the last "eventCount" element
     */
    public void addEventCount(java.math.BigInteger eventCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTCOUNT$2);
            target.setBigIntegerValue(eventCount);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventCount" element
     */
    public org.apache.xmlbeans.XmlInteger insertNewEventCount(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(EVENTCOUNT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventCount" element
     */
    public org.apache.xmlbeans.XmlInteger addNewEventCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(EVENTCOUNT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "eventCount" element
     */
    public void removeEventCount(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTCOUNT$2, i);
        }
    }
    
    /**
     * Gets the "portOfOccurence" element
     */
    public java.lang.String getPortOfOccurence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORTOFOCCURENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "portOfOccurence" element
     */
    public org.apache.xmlbeans.XmlString xgetPortOfOccurence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PORTOFOCCURENCE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "portOfOccurence" element
     */
    public boolean isSetPortOfOccurence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTOFOCCURENCE$4) != 0;
        }
    }
    
    /**
     * Sets the "portOfOccurence" element
     */
    public void setPortOfOccurence(java.lang.String portOfOccurence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORTOFOCCURENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PORTOFOCCURENCE$4);
            }
            target.setStringValue(portOfOccurence);
        }
    }
    
    /**
     * Sets (as xml) the "portOfOccurence" element
     */
    public void xsetPortOfOccurence(org.apache.xmlbeans.XmlString portOfOccurence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PORTOFOCCURENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PORTOFOCCURENCE$4);
            }
            target.set(portOfOccurence);
        }
    }
    
    /**
     * Unsets the "portOfOccurence" element
     */
    public void unsetPortOfOccurence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTOFOCCURENCE$4, 0);
        }
    }
    
    /**
     * Gets the "eventStatus" element
     */
    public java.lang.String getEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSTATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSTATUS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "eventStatus" element
     */
    public boolean isSetEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTSTATUS$6) != 0;
        }
    }
    
    /**
     * Sets the "eventStatus" element
     */
    public void setEventStatus(java.lang.String eventStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSTATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSTATUS$6);
            }
            target.setStringValue(eventStatus);
        }
    }
    
    /**
     * Sets (as xml) the "eventStatus" element
     */
    public void xsetEventStatus(org.apache.xmlbeans.XmlString eventStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSTATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTSTATUS$6);
            }
            target.set(eventStatus);
        }
    }
    
    /**
     * Unsets the "eventStatus" element
     */
    public void unsetEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTSTATUS$6, 0);
        }
    }
    
    /**
     * Gets the "createdBy" element
     */
    public java.lang.String getCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "createdBy" element
     */
    public org.apache.xmlbeans.XmlString xgetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEDBY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "createdBy" element
     */
    public boolean isSetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$8) != 0;
        }
    }
    
    /**
     * Sets the "createdBy" element
     */
    public void setCreatedBy(java.lang.String createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDBY$8);
            }
            target.setStringValue(createdBy);
        }
    }
    
    /**
     * Sets (as xml) the "createdBy" element
     */
    public void xsetCreatedBy(org.apache.xmlbeans.XmlString createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEDBY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATEDBY$8);
            }
            target.set(createdBy);
        }
    }
    
    /**
     * Unsets the "createdBy" element
     */
    public void unsetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$8, 0);
        }
    }
    
    /**
     * Gets the "eventSummary" element
     */
    public java.lang.String getEventSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSUMMARY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventSummary" element
     */
    public org.apache.xmlbeans.XmlString xgetEventSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSUMMARY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "eventSummary" element
     */
    public boolean isSetEventSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTSUMMARY$10) != 0;
        }
    }
    
    /**
     * Sets the "eventSummary" element
     */
    public void setEventSummary(java.lang.String eventSummary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSUMMARY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSUMMARY$10);
            }
            target.setStringValue(eventSummary);
        }
    }
    
    /**
     * Sets (as xml) the "eventSummary" element
     */
    public void xsetEventSummary(org.apache.xmlbeans.XmlString eventSummary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSUMMARY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTSUMMARY$10);
            }
            target.set(eventSummary);
        }
    }
    
    /**
     * Unsets the "eventSummary" element
     */
    public void unsetEventSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTSUMMARY$10, 0);
        }
    }
    
    /**
     * Gets the "hasUpdated" element
     */
    public java.lang.String getHasUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASUPDATED$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasUpdated" element
     */
    public org.apache.xmlbeans.XmlString xgetHasUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASUPDATED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "hasUpdated" element
     */
    public boolean isSetHasUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASUPDATED$12) != 0;
        }
    }
    
    /**
     * Sets the "hasUpdated" element
     */
    public void setHasUpdated(java.lang.String hasUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASUPDATED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASUPDATED$12);
            }
            target.setStringValue(hasUpdated);
        }
    }
    
    /**
     * Sets (as xml) the "hasUpdated" element
     */
    public void xsetHasUpdated(org.apache.xmlbeans.XmlString hasUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASUPDATED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASUPDATED$12);
            }
            target.set(hasUpdated);
        }
    }
    
    /**
     * Unsets the "hasUpdated" element
     */
    public void unsetHasUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASUPDATED$12, 0);
        }
    }
}
