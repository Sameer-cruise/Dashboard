/*
 * XML Type:  FlightLegInfoType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.impl;
/**
 * An XML FlightLegInfoType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
 *
 * This is a complex type.
 */
public class FlightLegInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType
{
    
    public FlightLegInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENTSTATION$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "current_station");
    private static final javax.xml.namespace.QName CURRENTBOOL$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "current_bool");
    private static final javax.xml.namespace.QName LASTCOMMENT$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "last_comment");
    private static final javax.xml.namespace.QName LASTCOMMENTTIME$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "last_comment_time");
    private static final javax.xml.namespace.QName LASTCOMMENTUSER$8 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "last_comment_user");
    private static final javax.xml.namespace.QName EVENTID$10 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "event_id");
    private static final javax.xml.namespace.QName EVENTSTATUS$12 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "event_status");
    private static final javax.xml.namespace.QName EVENTOWNER$14 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "event_owner");
    private static final javax.xml.namespace.QName EVENTCOORDINATOR$16 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "event_coordinator");
    private static final javax.xml.namespace.QName FLIGHTLEG$18 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "FlightLeg");
    
    
    /**
     * Gets the "current_station" element
     */
    public java.lang.String getCurrentStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTSTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "current_station" element
     */
    public org.iata.iata.x2007.x00.IATACodeType xgetCurrentStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_element_user(CURRENTSTATION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "current_station" element
     */
    public boolean isSetCurrentStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTSTATION$0) != 0;
        }
    }
    
    /**
     * Sets the "current_station" element
     */
    public void setCurrentStation(java.lang.String currentStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTSTATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTSTATION$0);
            }
            target.setStringValue(currentStation);
        }
    }
    
    /**
     * Sets (as xml) the "current_station" element
     */
    public void xsetCurrentStation(org.iata.iata.x2007.x00.IATACodeType currentStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_element_user(CURRENTSTATION$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_element_user(CURRENTSTATION$0);
            }
            target.set(currentStation);
        }
    }
    
    /**
     * Unsets the "current_station" element
     */
    public void unsetCurrentStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTSTATION$0, 0);
        }
    }
    
    /**
     * Gets the "current_bool" element
     */
    public boolean getCurrentBool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTBOOL$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "current_bool" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCurrentBool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CURRENTBOOL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "current_bool" element
     */
    public boolean isSetCurrentBool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTBOOL$2) != 0;
        }
    }
    
    /**
     * Sets the "current_bool" element
     */
    public void setCurrentBool(boolean currentBool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTBOOL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTBOOL$2);
            }
            target.setBooleanValue(currentBool);
        }
    }
    
    /**
     * Sets (as xml) the "current_bool" element
     */
    public void xsetCurrentBool(org.apache.xmlbeans.XmlBoolean currentBool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CURRENTBOOL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CURRENTBOOL$2);
            }
            target.set(currentBool);
        }
    }
    
    /**
     * Unsets the "current_bool" element
     */
    public void unsetCurrentBool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTBOOL$2, 0);
        }
    }
    
    /**
     * Gets the "last_comment" element
     */
    public java.lang.String getLastComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCOMMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "last_comment" element
     */
    public org.apache.xmlbeans.XmlString xgetLastComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTCOMMENT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "last_comment" element
     */
    public boolean isSetLastComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTCOMMENT$4) != 0;
        }
    }
    
    /**
     * Sets the "last_comment" element
     */
    public void setLastComment(java.lang.String lastComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCOMMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTCOMMENT$4);
            }
            target.setStringValue(lastComment);
        }
    }
    
    /**
     * Sets (as xml) the "last_comment" element
     */
    public void xsetLastComment(org.apache.xmlbeans.XmlString lastComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTCOMMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTCOMMENT$4);
            }
            target.set(lastComment);
        }
    }
    
    /**
     * Unsets the "last_comment" element
     */
    public void unsetLastComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTCOMMENT$4, 0);
        }
    }
    
    /**
     * Gets the "last_comment_time" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime getLastCommentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime)get_store().find_element_user(LASTCOMMENTTIME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "last_comment_time" element
     */
    public boolean isSetLastCommentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTCOMMENTTIME$6) != 0;
        }
    }
    
    /**
     * Sets the "last_comment_time" element
     */
    public void setLastCommentTime(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime lastCommentTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime)get_store().find_element_user(LASTCOMMENTTIME$6, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime)get_store().add_element_user(LASTCOMMENTTIME$6);
            }
            target.set(lastCommentTime);
        }
    }
    
    /**
     * Appends and returns a new empty "last_comment_time" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime addNewLastCommentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime)get_store().add_element_user(LASTCOMMENTTIME$6);
            return target;
        }
    }
    
    /**
     * Unsets the "last_comment_time" element
     */
    public void unsetLastCommentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTCOMMENTTIME$6, 0);
        }
    }
    
    /**
     * Gets the "last_comment_user" element
     */
    public java.lang.String getLastCommentUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCOMMENTUSER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "last_comment_user" element
     */
    public org.apache.xmlbeans.XmlString xgetLastCommentUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTCOMMENTUSER$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "last_comment_user" element
     */
    public boolean isSetLastCommentUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTCOMMENTUSER$8) != 0;
        }
    }
    
    /**
     * Sets the "last_comment_user" element
     */
    public void setLastCommentUser(java.lang.String lastCommentUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCOMMENTUSER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTCOMMENTUSER$8);
            }
            target.setStringValue(lastCommentUser);
        }
    }
    
    /**
     * Sets (as xml) the "last_comment_user" element
     */
    public void xsetLastCommentUser(org.apache.xmlbeans.XmlString lastCommentUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTCOMMENTUSER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTCOMMENTUSER$8);
            }
            target.set(lastCommentUser);
        }
    }
    
    /**
     * Unsets the "last_comment_user" element
     */
    public void unsetLastCommentUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTCOMMENTUSER$8, 0);
        }
    }
    
    /**
     * Gets the "event_id" element
     */
    public java.lang.String getEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "event_id" element
     */
    public org.apache.xmlbeans.XmlString xgetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "event_id" element
     */
    public boolean isSetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTID$10) != 0;
        }
    }
    
    /**
     * Sets the "event_id" element
     */
    public void setEventId(java.lang.String eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTID$10);
            }
            target.setStringValue(eventId);
        }
    }
    
    /**
     * Sets (as xml) the "event_id" element
     */
    public void xsetEventId(org.apache.xmlbeans.XmlString eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTID$10);
            }
            target.set(eventId);
        }
    }
    
    /**
     * Unsets the "event_id" element
     */
    public void unsetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTID$10, 0);
        }
    }
    
    /**
     * Gets the "event_status" element
     */
    public java.lang.String getEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSTATUS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "event_status" element
     */
    public org.apache.xmlbeans.XmlString xgetEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSTATUS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "event_status" element
     */
    public boolean isSetEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTSTATUS$12) != 0;
        }
    }
    
    /**
     * Sets the "event_status" element
     */
    public void setEventStatus(java.lang.String eventStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSTATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSTATUS$12);
            }
            target.setStringValue(eventStatus);
        }
    }
    
    /**
     * Sets (as xml) the "event_status" element
     */
    public void xsetEventStatus(org.apache.xmlbeans.XmlString eventStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSTATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTSTATUS$12);
            }
            target.set(eventStatus);
        }
    }
    
    /**
     * Unsets the "event_status" element
     */
    public void unsetEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTSTATUS$12, 0);
        }
    }
    
    /**
     * Gets the "event_owner" element
     */
    public java.lang.String getEventOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTOWNER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "event_owner" element
     */
    public org.apache.xmlbeans.XmlString xgetEventOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTOWNER$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "event_owner" element
     */
    public boolean isSetEventOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTOWNER$14) != 0;
        }
    }
    
    /**
     * Sets the "event_owner" element
     */
    public void setEventOwner(java.lang.String eventOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTOWNER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTOWNER$14);
            }
            target.setStringValue(eventOwner);
        }
    }
    
    /**
     * Sets (as xml) the "event_owner" element
     */
    public void xsetEventOwner(org.apache.xmlbeans.XmlString eventOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTOWNER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTOWNER$14);
            }
            target.set(eventOwner);
        }
    }
    
    /**
     * Unsets the "event_owner" element
     */
    public void unsetEventOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTOWNER$14, 0);
        }
    }
    
    /**
     * Gets the "event_coordinator" element
     */
    public java.lang.String getEventCoordinator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTCOORDINATOR$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "event_coordinator" element
     */
    public org.apache.xmlbeans.XmlString xgetEventCoordinator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTCOORDINATOR$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "event_coordinator" element
     */
    public boolean isSetEventCoordinator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTCOORDINATOR$16) != 0;
        }
    }
    
    /**
     * Sets the "event_coordinator" element
     */
    public void setEventCoordinator(java.lang.String eventCoordinator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTCOORDINATOR$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTCOORDINATOR$16);
            }
            target.setStringValue(eventCoordinator);
        }
    }
    
    /**
     * Sets (as xml) the "event_coordinator" element
     */
    public void xsetEventCoordinator(org.apache.xmlbeans.XmlString eventCoordinator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTCOORDINATOR$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTCOORDINATOR$16);
            }
            target.set(eventCoordinator);
        }
    }
    
    /**
     * Unsets the "event_coordinator" element
     */
    public void unsetEventCoordinator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTCOORDINATOR$16, 0);
        }
    }
    
    /**
     * Gets array of all "FlightLeg" elements
     */
    public org.iata.iata.x2007.x00.FlightLegType[] getFlightLegArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLIGHTLEG$18, targetList);
            org.iata.iata.x2007.x00.FlightLegType[] result = new org.iata.iata.x2007.x00.FlightLegType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FlightLeg" element
     */
    public org.iata.iata.x2007.x00.FlightLegType getFlightLegArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().find_element_user(FLIGHTLEG$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "FlightLeg" element
     */
    public int sizeOfFlightLegArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLIGHTLEG$18);
        }
    }
    
    /**
     * Sets array of all "FlightLeg" element
     */
    public void setFlightLegArray(org.iata.iata.x2007.x00.FlightLegType[] flightLegArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flightLegArray, FLIGHTLEG$18);
        }
    }
    
    /**
     * Sets ith "FlightLeg" element
     */
    public void setFlightLegArray(int i, org.iata.iata.x2007.x00.FlightLegType flightLeg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().find_element_user(FLIGHTLEG$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(flightLeg);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FlightLeg" element
     */
    public org.iata.iata.x2007.x00.FlightLegType insertNewFlightLeg(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().insert_element_user(FLIGHTLEG$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FlightLeg" element
     */
    public org.iata.iata.x2007.x00.FlightLegType addNewFlightLeg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType)get_store().add_element_user(FLIGHTLEG$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "FlightLeg" element
     */
    public void removeFlightLeg(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLIGHTLEG$18, i);
        }
    }
    /**
     * An XML last_comment_time(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is a union type. Instances are of one of the following types:
     *     org.apache.xmlbeans.XmlDate
     *     org.apache.xmlbeans.XmlDateTime
     */
    public static class LastCommentTimeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType.LastCommentTime, org.apache.xmlbeans.XmlDate, org.apache.xmlbeans.XmlDateTime
    {
        
        public LastCommentTimeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected LastCommentTimeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TIMETYPE$0 = 
            new javax.xml.namespace.QName("", "TimeType");
        
        
        /**
         * Gets the "TimeType" attribute
         */
        public java.lang.String getTimeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TimeType" attribute
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetTimeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TIMETYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "TimeType" attribute
         */
        public boolean isSetTimeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMETYPE$0) != null;
            }
        }
        
        /**
         * Sets the "TimeType" attribute
         */
        public void setTimeType(java.lang.String timeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMETYPE$0);
                }
                target.setStringValue(timeType);
            }
        }
        
        /**
         * Sets (as xml) the "TimeType" attribute
         */
        public void xsetTimeType(org.iata.iata.x2007.x00.IATACodeType timeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TIMETYPE$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(TIMETYPE$0);
                }
                target.set(timeType);
            }
        }
        
        /**
         * Unsets the "TimeType" attribute
         */
        public void unsetTimeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMETYPE$0);
            }
        }
    }
}
