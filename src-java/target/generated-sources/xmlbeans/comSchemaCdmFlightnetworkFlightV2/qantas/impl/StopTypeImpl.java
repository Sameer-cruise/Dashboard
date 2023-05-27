/*
 * XML Type:  StopType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.StopType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas.impl;
/**
 * An XML StopType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public class StopTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkFlightV2.qantas.StopType
{
    
    public StopTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRIVINGINFO$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "arrivingInfo");
    private static final javax.xml.namespace.QName DEPARTINGINFO$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "departingInfo");
    private static final javax.xml.namespace.QName NEWEQUIPMENT$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "newEquipment");
    private static final javax.xml.namespace.QName GROUNDTIME$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "groundTime");
    private static final javax.xml.namespace.QName CHANGEOFGUAGEINDICATOR$8 = 
        new javax.xml.namespace.QName("", "changeOfGuageIndicator");
    
    
    /**
     * Gets the "arrivingInfo" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType getArrivingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(ARRIVINGINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "arrivingInfo" element
     */
    public void setArrivingInfo(comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType arrivingInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(ARRIVINGINFO$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(ARRIVINGINFO$0);
            }
            target.set(arrivingInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "arrivingInfo" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType addNewArrivingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(ARRIVINGINFO$0);
            return target;
        }
    }
    
    /**
     * Gets the "departingInfo" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType getDepartingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(DEPARTINGINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "departingInfo" element
     */
    public void setDepartingInfo(comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType departingInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(DEPARTINGINFO$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(DEPARTINGINFO$2);
            }
            target.set(departingInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "departingInfo" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType addNewDepartingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(DEPARTINGINFO$2);
            return target;
        }
    }
    
    /**
     * Gets the "newEquipment" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType getNewEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().find_element_user(NEWEQUIPMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "newEquipment" element
     */
    public void setNewEquipment(comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType newEquipment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().find_element_user(NEWEQUIPMENT$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().add_element_user(NEWEQUIPMENT$4);
            }
            target.set(newEquipment);
        }
    }
    
    /**
     * Appends and returns a new empty "newEquipment" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType addNewNewEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().add_element_user(NEWEQUIPMENT$4);
            return target;
        }
    }
    
    /**
     * Gets the "groundTime" element
     */
    public java.lang.String getGroundTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDTIME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "groundTime" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.GroundTimeType xgetGroundTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.GroundTimeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.GroundTimeType)get_store().find_element_user(GROUNDTIME$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "groundTime" element
     */
    public void setGroundTime(java.lang.String groundTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDTIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUNDTIME$6);
            }
            target.setStringValue(groundTime);
        }
    }
    
    /**
     * Sets (as xml) the "groundTime" element
     */
    public void xsetGroundTime(comSchemaCdmFlightnetworkFlightV2.qantas.GroundTimeType groundTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.GroundTimeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.GroundTimeType)get_store().find_element_user(GROUNDTIME$6, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.GroundTimeType)get_store().add_element_user(GROUNDTIME$6);
            }
            target.set(groundTime);
        }
    }
    
    /**
     * Gets the "changeOfGuageIndicator" attribute
     */
    public java.lang.String getChangeOfGuageIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGEOFGUAGEINDICATOR$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "changeOfGuageIndicator" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ChangeOfGuageIndicatorType xgetChangeOfGuageIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ChangeOfGuageIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ChangeOfGuageIndicatorType)get_store().find_attribute_user(CHANGEOFGUAGEINDICATOR$8);
            return target;
        }
    }
    
    /**
     * True if has "changeOfGuageIndicator" attribute
     */
    public boolean isSetChangeOfGuageIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHANGEOFGUAGEINDICATOR$8) != null;
        }
    }
    
    /**
     * Sets the "changeOfGuageIndicator" attribute
     */
    public void setChangeOfGuageIndicator(java.lang.String changeOfGuageIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGEOFGUAGEINDICATOR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHANGEOFGUAGEINDICATOR$8);
            }
            target.setStringValue(changeOfGuageIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "changeOfGuageIndicator" attribute
     */
    public void xsetChangeOfGuageIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.ChangeOfGuageIndicatorType changeOfGuageIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ChangeOfGuageIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ChangeOfGuageIndicatorType)get_store().find_attribute_user(CHANGEOFGUAGEINDICATOR$8);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.ChangeOfGuageIndicatorType)get_store().add_attribute_user(CHANGEOFGUAGEINDICATOR$8);
            }
            target.set(changeOfGuageIndicator);
        }
    }
    
    /**
     * Unsets the "changeOfGuageIndicator" attribute
     */
    public void unsetChangeOfGuageIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHANGEOFGUAGEINDICATOR$8);
        }
    }
}
