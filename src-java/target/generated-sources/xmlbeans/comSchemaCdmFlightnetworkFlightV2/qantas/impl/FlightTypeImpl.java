/*
 * XML Type:  FlightType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.FlightType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas.impl;
/**
 * An XML FlightType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public class FlightTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkFlightV2.qantas.FlightType
{
    
    public FlightTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELEMENTNUMBER$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "elementNumber");
    private static final javax.xml.namespace.QName MARKETINGCARRIER$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "marketingCarrier");
    private static final javax.xml.namespace.QName OPERATINGCARRIER$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "operatingCarrier");
    private static final javax.xml.namespace.QName EQUIPMENT$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "equipment");
    private static final javax.xml.namespace.QName DEPARTURE$8 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "departure");
    private static final javax.xml.namespace.QName ARRIVAL$10 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "arrival");
    private static final javax.xml.namespace.QName FLIGHTDURATION$12 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "flightDuration");
    private static final javax.xml.namespace.QName ELECTRONICTICKETINGINDICATOR$14 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "electronicTicketingIndicator");
    private static final javax.xml.namespace.QName TICKETLESSINDICATOR$16 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "ticketlessIndicator");
    private static final javax.xml.namespace.QName INSTANTPURCHASEINDICATOR$18 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "instantPurchaseIndicator");
    private static final javax.xml.namespace.QName INFORMATION$20 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "information");
    private static final javax.xml.namespace.QName STOPS$22 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "stops");
    private static final javax.xml.namespace.QName ACTIONCODE$24 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "actionCode");
    private static final javax.xml.namespace.QName FLIGHTNUMBER$26 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "flightNumber");
    private static final javax.xml.namespace.QName CLASSES$28 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "classes");
    private static final javax.xml.namespace.QName ORIGINDESTINATIONID$30 = 
        new javax.xml.namespace.QName("", "originDestinationID");
    private static final javax.xml.namespace.QName FLOWNINDICATOR$32 = 
        new javax.xml.namespace.QName("", "flownIndicator");
    private static final javax.xml.namespace.QName MARRIEDSEGMENT$34 = 
        new javax.xml.namespace.QName("", "marriedSegment");
    private static final javax.xml.namespace.QName MARRIEDREF$36 = 
        new javax.xml.namespace.QName("", "marriedRef");
    private static final javax.xml.namespace.QName OPTIONALFLIGHTTYPE$38 = 
        new javax.xml.namespace.QName("", "optionalFlightType");
    private static final javax.xml.namespace.QName CONNECTIONINDICATOR$40 = 
        new javax.xml.namespace.QName("", "connectionIndicator");
    private static final javax.xml.namespace.QName CHECKINFLAG$42 = 
        new javax.xml.namespace.QName("", "checkInFlag");
    private static final javax.xml.namespace.QName FLIGHTREFKEY$44 = 
        new javax.xml.namespace.QName("", "flightRefKey");
    private static final javax.xml.namespace.QName SECUREFLIGHT$46 = 
        new javax.xml.namespace.QName("", "secureFlight");
    private static final javax.xml.namespace.QName BOOKINGDATE$48 = 
        new javax.xml.namespace.QName("", "bookingDate");
    private static final javax.xml.namespace.QName BOOKINGTIME$50 = 
        new javax.xml.namespace.QName("", "bookingTime");
    
    
    /**
     * Gets the "elementNumber" element
     */
    public java.lang.String getElementNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENTNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "elementNumber" element
     */
    public comSchemaCdmCommonCommonV1.qantas.ElementNumberType xgetElementNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.ElementNumberType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.ElementNumberType)get_store().find_element_user(ELEMENTNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "elementNumber" element
     */
    public boolean isSetElementNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEMENTNUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "elementNumber" element
     */
    public void setElementNumber(java.lang.String elementNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELEMENTNUMBER$0);
            }
            target.setStringValue(elementNumber);
        }
    }
    
    /**
     * Sets (as xml) the "elementNumber" element
     */
    public void xsetElementNumber(comSchemaCdmCommonCommonV1.qantas.ElementNumberType elementNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.ElementNumberType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.ElementNumberType)get_store().find_element_user(ELEMENTNUMBER$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonCommonV1.qantas.ElementNumberType)get_store().add_element_user(ELEMENTNUMBER$0);
            }
            target.set(elementNumber);
        }
    }
    
    /**
     * Unsets the "elementNumber" element
     */
    public void unsetElementNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEMENTNUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "marketingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getMarketingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(MARKETINGCARRIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "marketingCarrier" element
     */
    public boolean isSetMarketingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARKETINGCARRIER$2) != 0;
        }
    }
    
    /**
     * Sets the "marketingCarrier" element
     */
    public void setMarketingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType marketingCarrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(MARKETINGCARRIER$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(MARKETINGCARRIER$2);
            }
            target.set(marketingCarrier);
        }
    }
    
    /**
     * Appends and returns a new empty "marketingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewMarketingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(MARKETINGCARRIER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "marketingCarrier" element
     */
    public void unsetMarketingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARKETINGCARRIER$2, 0);
        }
    }
    
    /**
     * Gets the "operatingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(OPERATINGCARRIER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "operatingCarrier" element
     */
    public boolean isSetOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATINGCARRIER$4) != 0;
        }
    }
    
    /**
     * Sets the "operatingCarrier" element
     */
    public void setOperatingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType operatingCarrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(OPERATINGCARRIER$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(OPERATINGCARRIER$4);
            }
            target.set(operatingCarrier);
        }
    }
    
    /**
     * Appends and returns a new empty "operatingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(OPERATINGCARRIER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "operatingCarrier" element
     */
    public void unsetOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATINGCARRIER$4, 0);
        }
    }
    
    /**
     * Gets the "equipment" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType getEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().find_element_user(EQUIPMENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "equipment" element
     */
    public boolean isSetEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EQUIPMENT$6) != 0;
        }
    }
    
    /**
     * Sets the "equipment" element
     */
    public void setEquipment(comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType equipment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().find_element_user(EQUIPMENT$6, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().add_element_user(EQUIPMENT$6);
            }
            target.set(equipment);
        }
    }
    
    /**
     * Appends and returns a new empty "equipment" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType addNewEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().add_element_user(EQUIPMENT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "equipment" element
     */
    public void unsetEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EQUIPMENT$6, 0);
        }
    }
    
    /**
     * Gets the "departure" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType getDeparture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(DEPARTURE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "departure" element
     */
    public boolean isSetDeparture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTURE$8) != 0;
        }
    }
    
    /**
     * Sets the "departure" element
     */
    public void setDeparture(comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType departure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(DEPARTURE$8, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(DEPARTURE$8);
            }
            target.set(departure);
        }
    }
    
    /**
     * Appends and returns a new empty "departure" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType addNewDeparture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(DEPARTURE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "departure" element
     */
    public void unsetDeparture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTURE$8, 0);
        }
    }
    
    /**
     * Gets the "arrival" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType getArrival()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(ARRIVAL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "arrival" element
     */
    public boolean isSetArrival()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRIVAL$10) != 0;
        }
    }
    
    /**
     * Sets the "arrival" element
     */
    public void setArrival(comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType arrival)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().find_element_user(ARRIVAL$10, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(ARRIVAL$10);
            }
            target.set(arrival);
        }
    }
    
    /**
     * Appends and returns a new empty "arrival" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType addNewArrival()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType)get_store().add_element_user(ARRIVAL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "arrival" element
     */
    public void unsetArrival()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRIVAL$10, 0);
        }
    }
    
    /**
     * Gets the "flightDuration" element
     */
    public java.lang.String getFlightDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTDURATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "flightDuration" element
     */
    public comSchemaCdmCommonCommonV1.qantas.TimeType xgetFlightDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TimeType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().find_element_user(FLIGHTDURATION$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "flightDuration" element
     */
    public boolean isSetFlightDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLIGHTDURATION$12) != 0;
        }
    }
    
    /**
     * Sets the "flightDuration" element
     */
    public void setFlightDuration(java.lang.String flightDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTDURATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTDURATION$12);
            }
            target.setStringValue(flightDuration);
        }
    }
    
    /**
     * Sets (as xml) the "flightDuration" element
     */
    public void xsetFlightDuration(comSchemaCdmCommonCommonV1.qantas.TimeType flightDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TimeType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().find_element_user(FLIGHTDURATION$12, 0);
            if (target == null)
            {
                target = (comSchemaCdmCommonCommonV1.qantas.TimeType)get_store().add_element_user(FLIGHTDURATION$12);
            }
            target.set(flightDuration);
        }
    }
    
    /**
     * Unsets the "flightDuration" element
     */
    public void unsetFlightDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLIGHTDURATION$12, 0);
        }
    }
    
    /**
     * Gets the "electronicTicketingIndicator" element
     */
    public java.lang.String getElectronicTicketingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTRONICTICKETINGINDICATOR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "electronicTicketingIndicator" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ElectronicTicketingIndicatorType xgetElectronicTicketingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ElectronicTicketingIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ElectronicTicketingIndicatorType)get_store().find_element_user(ELECTRONICTICKETINGINDICATOR$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "electronicTicketingIndicator" element
     */
    public boolean isSetElectronicTicketingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELECTRONICTICKETINGINDICATOR$14) != 0;
        }
    }
    
    /**
     * Sets the "electronicTicketingIndicator" element
     */
    public void setElectronicTicketingIndicator(java.lang.String electronicTicketingIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTRONICTICKETINGINDICATOR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELECTRONICTICKETINGINDICATOR$14);
            }
            target.setStringValue(electronicTicketingIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "electronicTicketingIndicator" element
     */
    public void xsetElectronicTicketingIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.ElectronicTicketingIndicatorType electronicTicketingIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ElectronicTicketingIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ElectronicTicketingIndicatorType)get_store().find_element_user(ELECTRONICTICKETINGINDICATOR$14, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.ElectronicTicketingIndicatorType)get_store().add_element_user(ELECTRONICTICKETINGINDICATOR$14);
            }
            target.set(electronicTicketingIndicator);
        }
    }
    
    /**
     * Unsets the "electronicTicketingIndicator" element
     */
    public void unsetElectronicTicketingIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELECTRONICTICKETINGINDICATOR$14, 0);
        }
    }
    
    /**
     * Gets the "ticketlessIndicator" element
     */
    public java.lang.String getTicketlessIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TICKETLESSINDICATOR$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ticketlessIndicator" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.TicketlessIndicatorType xgetTicketlessIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.TicketlessIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.TicketlessIndicatorType)get_store().find_element_user(TICKETLESSINDICATOR$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ticketlessIndicator" element
     */
    public boolean isSetTicketlessIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TICKETLESSINDICATOR$16) != 0;
        }
    }
    
    /**
     * Sets the "ticketlessIndicator" element
     */
    public void setTicketlessIndicator(java.lang.String ticketlessIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TICKETLESSINDICATOR$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TICKETLESSINDICATOR$16);
            }
            target.setStringValue(ticketlessIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "ticketlessIndicator" element
     */
    public void xsetTicketlessIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.TicketlessIndicatorType ticketlessIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.TicketlessIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.TicketlessIndicatorType)get_store().find_element_user(TICKETLESSINDICATOR$16, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.TicketlessIndicatorType)get_store().add_element_user(TICKETLESSINDICATOR$16);
            }
            target.set(ticketlessIndicator);
        }
    }
    
    /**
     * Unsets the "ticketlessIndicator" element
     */
    public void unsetTicketlessIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TICKETLESSINDICATOR$16, 0);
        }
    }
    
    /**
     * Gets the "instantPurchaseIndicator" element
     */
    public java.lang.String getInstantPurchaseIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTANTPURCHASEINDICATOR$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "instantPurchaseIndicator" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.InstantPurchaseIndicatorType xgetInstantPurchaseIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.InstantPurchaseIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.InstantPurchaseIndicatorType)get_store().find_element_user(INSTANTPURCHASEINDICATOR$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "instantPurchaseIndicator" element
     */
    public boolean isSetInstantPurchaseIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANTPURCHASEINDICATOR$18) != 0;
        }
    }
    
    /**
     * Sets the "instantPurchaseIndicator" element
     */
    public void setInstantPurchaseIndicator(java.lang.String instantPurchaseIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTANTPURCHASEINDICATOR$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTANTPURCHASEINDICATOR$18);
            }
            target.setStringValue(instantPurchaseIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "instantPurchaseIndicator" element
     */
    public void xsetInstantPurchaseIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.InstantPurchaseIndicatorType instantPurchaseIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.InstantPurchaseIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.InstantPurchaseIndicatorType)get_store().find_element_user(INSTANTPURCHASEINDICATOR$18, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.InstantPurchaseIndicatorType)get_store().add_element_user(INSTANTPURCHASEINDICATOR$18);
            }
            target.set(instantPurchaseIndicator);
        }
    }
    
    /**
     * Unsets the "instantPurchaseIndicator" element
     */
    public void unsetInstantPurchaseIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANTPURCHASEINDICATOR$18, 0);
        }
    }
    
    /**
     * Gets array of all "information" elements
     */
    public java.lang.String[] getInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFORMATION$20, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "information" element
     */
    public java.lang.String getInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "information" elements
     */
    public comSchemaCdmCommonCommonV1.qantas.TextType[] xgetInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFORMATION$20, targetList);
            comSchemaCdmCommonCommonV1.qantas.TextType[] result = new comSchemaCdmCommonCommonV1.qantas.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "information" element
     */
    public comSchemaCdmCommonCommonV1.qantas.TextType xgetInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TextType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TextType)get_store().find_element_user(INFORMATION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (comSchemaCdmCommonCommonV1.qantas.TextType)target;
        }
    }
    
    /**
     * Returns number of "information" element
     */
    public int sizeOfInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFORMATION$20);
        }
    }
    
    /**
     * Sets array of all "information" element
     */
    public void setInformationArray(java.lang.String[] informationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(informationArray, INFORMATION$20);
        }
    }
    
    /**
     * Sets ith "information" element
     */
    public void setInformationArray(int i, java.lang.String information)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(information);
        }
    }
    
    /**
     * Sets (as xml) array of all "information" element
     */
    public void xsetInformationArray(comSchemaCdmCommonCommonV1.qantas.TextType[]informationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(informationArray, INFORMATION$20);
        }
    }
    
    /**
     * Sets (as xml) ith "information" element
     */
    public void xsetInformationArray(int i, comSchemaCdmCommonCommonV1.qantas.TextType information)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TextType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TextType)get_store().find_element_user(INFORMATION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(information);
        }
    }
    
    /**
     * Inserts the value as the ith "information" element
     */
    public void insertInformation(int i, java.lang.String information)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INFORMATION$20, i);
            target.setStringValue(information);
        }
    }
    
    /**
     * Appends the value as the last "information" element
     */
    public void addInformation(java.lang.String information)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFORMATION$20);
            target.setStringValue(information);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "information" element
     */
    public comSchemaCdmCommonCommonV1.qantas.TextType insertNewInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TextType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TextType)get_store().insert_element_user(INFORMATION$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "information" element
     */
    public comSchemaCdmCommonCommonV1.qantas.TextType addNewInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmCommonCommonV1.qantas.TextType target = null;
            target = (comSchemaCdmCommonCommonV1.qantas.TextType)get_store().add_element_user(INFORMATION$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "information" element
     */
    public void removeInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFORMATION$20, i);
        }
    }
    
    /**
     * Gets array of all "stops" elements
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.StopType[] getStopsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STOPS$22, targetList);
            comSchemaCdmFlightnetworkFlightV2.qantas.StopType[] result = new comSchemaCdmFlightnetworkFlightV2.qantas.StopType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "stops" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.StopType getStopsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.StopType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.StopType)get_store().find_element_user(STOPS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "stops" element
     */
    public int sizeOfStopsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOPS$22);
        }
    }
    
    /**
     * Sets array of all "stops" element
     */
    public void setStopsArray(comSchemaCdmFlightnetworkFlightV2.qantas.StopType[] stopsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stopsArray, STOPS$22);
        }
    }
    
    /**
     * Sets ith "stops" element
     */
    public void setStopsArray(int i, comSchemaCdmFlightnetworkFlightV2.qantas.StopType stops)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.StopType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.StopType)get_store().find_element_user(STOPS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stops);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stops" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.StopType insertNewStops(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.StopType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.StopType)get_store().insert_element_user(STOPS$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stops" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.StopType addNewStops()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.StopType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.StopType)get_store().add_element_user(STOPS$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "stops" element
     */
    public void removeStops(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOPS$22, i);
        }
    }
    
    /**
     * Gets the "actionCode" element
     */
    public java.lang.String getActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONCODE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "actionCode" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType xgetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType)get_store().find_element_user(ACTIONCODE$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "actionCode" element
     */
    public boolean isSetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIONCODE$24) != 0;
        }
    }
    
    /**
     * Sets the "actionCode" element
     */
    public void setActionCode(java.lang.String actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONCODE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIONCODE$24);
            }
            target.setStringValue(actionCode);
        }
    }
    
    /**
     * Sets (as xml) the "actionCode" element
     */
    public void xsetActionCode(comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType)get_store().find_element_user(ACTIONCODE$24, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType)get_store().add_element_user(ACTIONCODE$24);
            }
            target.set(actionCode);
        }
    }
    
    /**
     * Unsets the "actionCode" element
     */
    public void unsetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIONCODE$24, 0);
        }
    }
    
    /**
     * Gets the "flightNumber" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType getFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().find_element_user(FLIGHTNUMBER$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "flightNumber" element
     */
    public boolean isSetFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLIGHTNUMBER$26) != 0;
        }
    }
    
    /**
     * Sets the "flightNumber" element
     */
    public void setFlightNumber(comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().find_element_user(FLIGHTNUMBER$26, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().add_element_user(FLIGHTNUMBER$26);
            }
            target.set(flightNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "flightNumber" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType addNewFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().add_element_user(FLIGHTNUMBER$26);
            return target;
        }
    }
    
    /**
     * Unsets the "flightNumber" element
     */
    public void unsetFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLIGHTNUMBER$26, 0);
        }
    }
    
    /**
     * Gets array of all "classes" elements
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[] getClassesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLASSES$28, targetList);
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[] result = new comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "classes" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType getClassesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().find_element_user(CLASSES$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "classes" element
     */
    public int sizeOfClassesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASSES$28);
        }
    }
    
    /**
     * Sets array of all "classes" element
     */
    public void setClassesArray(comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[] classesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(classesArray, CLASSES$28);
        }
    }
    
    /**
     * Sets ith "classes" element
     */
    public void setClassesArray(int i, comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType classes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().find_element_user(CLASSES$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(classes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "classes" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType insertNewClasses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().insert_element_user(CLASSES$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "classes" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType addNewClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType)get_store().add_element_user(CLASSES$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "classes" element
     */
    public void removeClasses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASSES$28, i);
        }
    }
    
    /**
     * Gets the "originDestinationID" attribute
     */
    public java.lang.String getOriginDestinationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGINDESTINATIONID$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "originDestinationID" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.OriginDestinationIDType xgetOriginDestinationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.OriginDestinationIDType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.OriginDestinationIDType)get_store().find_attribute_user(ORIGINDESTINATIONID$30);
            return target;
        }
    }
    
    /**
     * True if has "originDestinationID" attribute
     */
    public boolean isSetOriginDestinationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIGINDESTINATIONID$30) != null;
        }
    }
    
    /**
     * Sets the "originDestinationID" attribute
     */
    public void setOriginDestinationID(java.lang.String originDestinationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGINDESTINATIONID$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIGINDESTINATIONID$30);
            }
            target.setStringValue(originDestinationID);
        }
    }
    
    /**
     * Sets (as xml) the "originDestinationID" attribute
     */
    public void xsetOriginDestinationID(comSchemaCdmFlightnetworkFlightV2.qantas.OriginDestinationIDType originDestinationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.OriginDestinationIDType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.OriginDestinationIDType)get_store().find_attribute_user(ORIGINDESTINATIONID$30);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.OriginDestinationIDType)get_store().add_attribute_user(ORIGINDESTINATIONID$30);
            }
            target.set(originDestinationID);
        }
    }
    
    /**
     * Unsets the "originDestinationID" attribute
     */
    public void unsetOriginDestinationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIGINDESTINATIONID$30);
        }
    }
    
    /**
     * Gets the "flownIndicator" attribute
     */
    public java.lang.String getFlownIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOWNINDICATOR$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "flownIndicator" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlownIndicatorType xgetFlownIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlownIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlownIndicatorType)get_store().find_attribute_user(FLOWNINDICATOR$32);
            return target;
        }
    }
    
    /**
     * True if has "flownIndicator" attribute
     */
    public boolean isSetFlownIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLOWNINDICATOR$32) != null;
        }
    }
    
    /**
     * Sets the "flownIndicator" attribute
     */
    public void setFlownIndicator(java.lang.String flownIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOWNINDICATOR$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLOWNINDICATOR$32);
            }
            target.setStringValue(flownIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "flownIndicator" attribute
     */
    public void xsetFlownIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.FlownIndicatorType flownIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlownIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlownIndicatorType)get_store().find_attribute_user(FLOWNINDICATOR$32);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlownIndicatorType)get_store().add_attribute_user(FLOWNINDICATOR$32);
            }
            target.set(flownIndicator);
        }
    }
    
    /**
     * Unsets the "flownIndicator" attribute
     */
    public void unsetFlownIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLOWNINDICATOR$32);
        }
    }
    
    /**
     * Gets the "marriedSegment" attribute
     */
    public java.lang.String getMarriedSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARRIEDSEGMENT$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "marriedSegment" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.MarriedSegmentType xgetMarriedSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.MarriedSegmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.MarriedSegmentType)get_store().find_attribute_user(MARRIEDSEGMENT$34);
            return target;
        }
    }
    
    /**
     * True if has "marriedSegment" attribute
     */
    public boolean isSetMarriedSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MARRIEDSEGMENT$34) != null;
        }
    }
    
    /**
     * Sets the "marriedSegment" attribute
     */
    public void setMarriedSegment(java.lang.String marriedSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARRIEDSEGMENT$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARRIEDSEGMENT$34);
            }
            target.setStringValue(marriedSegment);
        }
    }
    
    /**
     * Sets (as xml) the "marriedSegment" attribute
     */
    public void xsetMarriedSegment(comSchemaCdmFlightnetworkFlightV2.qantas.MarriedSegmentType marriedSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.MarriedSegmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.MarriedSegmentType)get_store().find_attribute_user(MARRIEDSEGMENT$34);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.MarriedSegmentType)get_store().add_attribute_user(MARRIEDSEGMENT$34);
            }
            target.set(marriedSegment);
        }
    }
    
    /**
     * Unsets the "marriedSegment" attribute
     */
    public void unsetMarriedSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MARRIEDSEGMENT$34);
        }
    }
    
    /**
     * Gets the "marriedRef" attribute
     */
    public java.lang.String getMarriedRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARRIEDREF$36);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "marriedRef" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.MarriedRefType xgetMarriedRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.MarriedRefType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.MarriedRefType)get_store().find_attribute_user(MARRIEDREF$36);
            return target;
        }
    }
    
    /**
     * True if has "marriedRef" attribute
     */
    public boolean isSetMarriedRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MARRIEDREF$36) != null;
        }
    }
    
    /**
     * Sets the "marriedRef" attribute
     */
    public void setMarriedRef(java.lang.String marriedRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARRIEDREF$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARRIEDREF$36);
            }
            target.setStringValue(marriedRef);
        }
    }
    
    /**
     * Sets (as xml) the "marriedRef" attribute
     */
    public void xsetMarriedRef(comSchemaCdmFlightnetworkFlightV2.qantas.MarriedRefType marriedRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.MarriedRefType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.MarriedRefType)get_store().find_attribute_user(MARRIEDREF$36);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.MarriedRefType)get_store().add_attribute_user(MARRIEDREF$36);
            }
            target.set(marriedRef);
        }
    }
    
    /**
     * Unsets the "marriedRef" attribute
     */
    public void unsetMarriedRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MARRIEDREF$36);
        }
    }
    
    /**
     * Gets the "optionalFlightType" attribute
     */
    public java.lang.String getOptionalFlightType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIONALFLIGHTTYPE$38);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "optionalFlightType" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.OptionalFlightType xgetOptionalFlightType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.OptionalFlightType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.OptionalFlightType)get_store().find_attribute_user(OPTIONALFLIGHTTYPE$38);
            return target;
        }
    }
    
    /**
     * True if has "optionalFlightType" attribute
     */
    public boolean isSetOptionalFlightType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPTIONALFLIGHTTYPE$38) != null;
        }
    }
    
    /**
     * Sets the "optionalFlightType" attribute
     */
    public void setOptionalFlightType(java.lang.String optionalFlightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIONALFLIGHTTYPE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPTIONALFLIGHTTYPE$38);
            }
            target.setStringValue(optionalFlightType);
        }
    }
    
    /**
     * Sets (as xml) the "optionalFlightType" attribute
     */
    public void xsetOptionalFlightType(comSchemaCdmFlightnetworkFlightV2.qantas.OptionalFlightType optionalFlightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.OptionalFlightType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.OptionalFlightType)get_store().find_attribute_user(OPTIONALFLIGHTTYPE$38);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.OptionalFlightType)get_store().add_attribute_user(OPTIONALFLIGHTTYPE$38);
            }
            target.set(optionalFlightType);
        }
    }
    
    /**
     * Unsets the "optionalFlightType" attribute
     */
    public void unsetOptionalFlightType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPTIONALFLIGHTTYPE$38);
        }
    }
    
    /**
     * Gets the "connectionIndicator" attribute
     */
    public java.lang.String getConnectionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONINDICATOR$40);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectionIndicator" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CnxxIndicatorType xgetConnectionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CnxxIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CnxxIndicatorType)get_store().find_attribute_user(CONNECTIONINDICATOR$40);
            return target;
        }
    }
    
    /**
     * True if has "connectionIndicator" attribute
     */
    public boolean isSetConnectionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTIONINDICATOR$40) != null;
        }
    }
    
    /**
     * Sets the "connectionIndicator" attribute
     */
    public void setConnectionIndicator(java.lang.String connectionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONINDICATOR$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTIONINDICATOR$40);
            }
            target.setStringValue(connectionIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "connectionIndicator" attribute
     */
    public void xsetConnectionIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.CnxxIndicatorType connectionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CnxxIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CnxxIndicatorType)get_store().find_attribute_user(CONNECTIONINDICATOR$40);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.CnxxIndicatorType)get_store().add_attribute_user(CONNECTIONINDICATOR$40);
            }
            target.set(connectionIndicator);
        }
    }
    
    /**
     * Unsets the "connectionIndicator" attribute
     */
    public void unsetConnectionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTIONINDICATOR$40);
        }
    }
    
    /**
     * Gets the "checkInFlag" attribute
     */
    public java.lang.String getCheckInFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKINFLAG$42);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "checkInFlag" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CheckInFlagIndicatorType xgetCheckInFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CheckInFlagIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CheckInFlagIndicatorType)get_store().find_attribute_user(CHECKINFLAG$42);
            return target;
        }
    }
    
    /**
     * True if has "checkInFlag" attribute
     */
    public boolean isSetCheckInFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHECKINFLAG$42) != null;
        }
    }
    
    /**
     * Sets the "checkInFlag" attribute
     */
    public void setCheckInFlag(java.lang.String checkInFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKINFLAG$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHECKINFLAG$42);
            }
            target.setStringValue(checkInFlag);
        }
    }
    
    /**
     * Sets (as xml) the "checkInFlag" attribute
     */
    public void xsetCheckInFlag(comSchemaCdmFlightnetworkFlightV2.qantas.CheckInFlagIndicatorType checkInFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CheckInFlagIndicatorType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CheckInFlagIndicatorType)get_store().find_attribute_user(CHECKINFLAG$42);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.CheckInFlagIndicatorType)get_store().add_attribute_user(CHECKINFLAG$42);
            }
            target.set(checkInFlag);
        }
    }
    
    /**
     * Unsets the "checkInFlag" attribute
     */
    public void unsetCheckInFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHECKINFLAG$42);
        }
    }
    
    /**
     * Gets the "flightRefKey" attribute
     */
    public java.lang.String getFlightRefKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIGHTREFKEY$44);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "flightRefKey" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlightRefKeyType xgetFlightRefKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightRefKeyType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightRefKeyType)get_store().find_attribute_user(FLIGHTREFKEY$44);
            return target;
        }
    }
    
    /**
     * True if has "flightRefKey" attribute
     */
    public boolean isSetFlightRefKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLIGHTREFKEY$44) != null;
        }
    }
    
    /**
     * Sets the "flightRefKey" attribute
     */
    public void setFlightRefKey(java.lang.String flightRefKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIGHTREFKEY$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLIGHTREFKEY$44);
            }
            target.setStringValue(flightRefKey);
        }
    }
    
    /**
     * Sets (as xml) the "flightRefKey" attribute
     */
    public void xsetFlightRefKey(comSchemaCdmFlightnetworkFlightV2.qantas.FlightRefKeyType flightRefKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightRefKeyType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightRefKeyType)get_store().find_attribute_user(FLIGHTREFKEY$44);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightRefKeyType)get_store().add_attribute_user(FLIGHTREFKEY$44);
            }
            target.set(flightRefKey);
        }
    }
    
    /**
     * Unsets the "flightRefKey" attribute
     */
    public void unsetFlightRefKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLIGHTREFKEY$44);
        }
    }
    
    /**
     * Gets the "secureFlight" attribute
     */
    public java.lang.String getSecureFlight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECUREFLIGHT$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "secureFlight" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.SecureFlightType xgetSecureFlight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.SecureFlightType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.SecureFlightType)get_store().find_attribute_user(SECUREFLIGHT$46);
            return target;
        }
    }
    
    /**
     * True if has "secureFlight" attribute
     */
    public boolean isSetSecureFlight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SECUREFLIGHT$46) != null;
        }
    }
    
    /**
     * Sets the "secureFlight" attribute
     */
    public void setSecureFlight(java.lang.String secureFlight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECUREFLIGHT$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECUREFLIGHT$46);
            }
            target.setStringValue(secureFlight);
        }
    }
    
    /**
     * Sets (as xml) the "secureFlight" attribute
     */
    public void xsetSecureFlight(comSchemaCdmFlightnetworkFlightV2.qantas.SecureFlightType secureFlight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.SecureFlightType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.SecureFlightType)get_store().find_attribute_user(SECUREFLIGHT$46);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.SecureFlightType)get_store().add_attribute_user(SECUREFLIGHT$46);
            }
            target.set(secureFlight);
        }
    }
    
    /**
     * Unsets the "secureFlight" attribute
     */
    public void unsetSecureFlight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SECUREFLIGHT$46);
        }
    }
    
    /**
     * Gets the "bookingDate" attribute
     */
    public java.util.Calendar getBookingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOKINGDATE$48);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "bookingDate" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingDateType xgetBookingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingDateType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingDateType)get_store().find_attribute_user(BOOKINGDATE$48);
            return target;
        }
    }
    
    /**
     * True if has "bookingDate" attribute
     */
    public boolean isSetBookingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BOOKINGDATE$48) != null;
        }
    }
    
    /**
     * Sets the "bookingDate" attribute
     */
    public void setBookingDate(java.util.Calendar bookingDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOKINGDATE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOOKINGDATE$48);
            }
            target.setCalendarValue(bookingDate);
        }
    }
    
    /**
     * Sets (as xml) the "bookingDate" attribute
     */
    public void xsetBookingDate(comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingDateType bookingDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingDateType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingDateType)get_store().find_attribute_user(BOOKINGDATE$48);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingDateType)get_store().add_attribute_user(BOOKINGDATE$48);
            }
            target.set(bookingDate);
        }
    }
    
    /**
     * Unsets the "bookingDate" attribute
     */
    public void unsetBookingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BOOKINGDATE$48);
        }
    }
    
    /**
     * Gets the "bookingTime" attribute
     */
    public java.lang.String getBookingTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOKINGTIME$50);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bookingTime" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingTimeType xgetBookingTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingTimeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingTimeType)get_store().find_attribute_user(BOOKINGTIME$50);
            return target;
        }
    }
    
    /**
     * True if has "bookingTime" attribute
     */
    public boolean isSetBookingTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BOOKINGTIME$50) != null;
        }
    }
    
    /**
     * Sets the "bookingTime" attribute
     */
    public void setBookingTime(java.lang.String bookingTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOKINGTIME$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOOKINGTIME$50);
            }
            target.setStringValue(bookingTime);
        }
    }
    
    /**
     * Sets (as xml) the "bookingTime" attribute
     */
    public void xsetBookingTime(comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingTimeType bookingTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingTimeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingTimeType)get_store().find_attribute_user(BOOKINGTIME$50);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingTimeType)get_store().add_attribute_user(BOOKINGTIME$50);
            }
            target.set(bookingTime);
        }
    }
    
    /**
     * Unsets the "bookingTime" attribute
     */
    public void unsetBookingTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BOOKINGTIME$50);
        }
    }
}
