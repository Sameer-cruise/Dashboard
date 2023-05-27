/*
 * XML Type:  FilterDataType1
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.impl;
/**
 * An XML FilterDataType1(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
 *
 * This is a complex type.
 */
public class FilterDataType1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1
{
    
    public FilterDataType1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRLINE$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Airline");
    private static final javax.xml.namespace.QName AIRCRAFTOWNER$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Aircraft_Owner");
    private static final javax.xml.namespace.QName FLIGHTNUMBER$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "FlightNumber");
    private static final javax.xml.namespace.QName ORIGINDATE$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "OriginDate");
    private static final javax.xml.namespace.QName ARRIVALAIRPORT$8 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "ArrivalAirport");
    private static final javax.xml.namespace.QName DEPARTUREAIRPORT$10 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "DepartureAirport");
    private static final javax.xml.namespace.QName OPERATIONALSTATUS$12 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "OperationalStatus");
    private static final javax.xml.namespace.QName AIRCRAFTINFO$14 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "AircraftInfo");
    private static final javax.xml.namespace.QName SECTTIEBREAK$16 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Sect_Tiebreak");
    private static final javax.xml.namespace.QName FLIGHTTYPE$18 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "FlightType");
    private static final javax.xml.namespace.QName PRIORITY$20 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Priority");
    
    
    /**
     * Gets the "Airline" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline getAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline)get_store().find_element_user(AIRLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Airline" element
     */
    public boolean isSetAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AIRLINE$0) != 0;
        }
    }
    
    /**
     * Sets the "Airline" element
     */
    public void setAirline(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline airline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline)get_store().find_element_user(AIRLINE$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline)get_store().add_element_user(AIRLINE$0);
            }
            target.set(airline);
        }
    }
    
    /**
     * Appends and returns a new empty "Airline" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline addNewAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline)get_store().add_element_user(AIRLINE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Airline" element
     */
    public void unsetAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AIRLINE$0, 0);
        }
    }
    
    /**
     * Gets the "Aircraft_Owner" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner getAircraftOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner)get_store().find_element_user(AIRCRAFTOWNER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Aircraft_Owner" element
     */
    public boolean isSetAircraftOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AIRCRAFTOWNER$2) != 0;
        }
    }
    
    /**
     * Sets the "Aircraft_Owner" element
     */
    public void setAircraftOwner(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner aircraftOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner)get_store().find_element_user(AIRCRAFTOWNER$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner)get_store().add_element_user(AIRCRAFTOWNER$2);
            }
            target.set(aircraftOwner);
        }
    }
    
    /**
     * Appends and returns a new empty "Aircraft_Owner" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner addNewAircraftOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner)get_store().add_element_user(AIRCRAFTOWNER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Aircraft_Owner" element
     */
    public void unsetAircraftOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AIRCRAFTOWNER$2, 0);
        }
    }
    
    /**
     * Gets the "FlightNumber" element
     */
    public java.lang.String getFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FlightNumber" element
     */
    public org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "FlightNumber" element
     */
    public boolean isSetFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLIGHTNUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "FlightNumber" element
     */
    public void setFlightNumber(java.lang.String flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTNUMBER$4);
            }
            target.setStringValue(flightNumber);
        }
    }
    
    /**
     * Sets (as xml) the "FlightNumber" element
     */
    public void xsetFlightNumber(org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$4, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().add_element_user(FLIGHTNUMBER$4);
            }
            target.set(flightNumber);
        }
    }
    
    /**
     * Unsets the "FlightNumber" element
     */
    public void unsetFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLIGHTNUMBER$4, 0);
        }
    }
    
    /**
     * Gets the "OriginDate" element
     */
    public java.util.Calendar getOriginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OriginDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetOriginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ORIGINDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "OriginDate" element
     */
    public boolean isSetOriginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "OriginDate" element
     */
    public void setOriginDate(java.util.Calendar originDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINDATE$6);
            }
            target.setCalendarValue(originDate);
        }
    }
    
    /**
     * Sets (as xml) the "OriginDate" element
     */
    public void xsetOriginDate(org.apache.xmlbeans.XmlDate originDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ORIGINDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ORIGINDATE$6);
            }
            target.set(originDate);
        }
    }
    
    /**
     * Unsets the "OriginDate" element
     */
    public void unsetOriginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINDATE$6, 0);
        }
    }
    
    /**
     * Gets the "ArrivalAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport getArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ArrivalAirport" element
     */
    public boolean isSetArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRIVALAIRPORT$8) != 0;
        }
    }
    
    /**
     * Sets the "ArrivalAirport" element
     */
    public void setArrivalAirport(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport arrivalAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$8, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$8);
            }
            target.set(arrivalAirport);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrivalAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport addNewArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ArrivalAirport" element
     */
    public void unsetArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRIVALAIRPORT$8, 0);
        }
    }
    
    /**
     * Gets the "DepartureAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport getDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DepartureAirport" element
     */
    public boolean isSetDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTUREAIRPORT$10) != 0;
        }
    }
    
    /**
     * Sets the "DepartureAirport" element
     */
    public void setDepartureAirport(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport departureAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$10, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$10);
            }
            target.set(departureAirport);
        }
    }
    
    /**
     * Appends and returns a new empty "DepartureAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport addNewDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "DepartureAirport" element
     */
    public void unsetDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTUREAIRPORT$10, 0);
        }
    }
    
    /**
     * Gets the "OperationalStatus" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus getOperationalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OperationalStatus" element
     */
    public boolean isNilOperationalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OperationalStatus" element
     */
    public boolean isSetOperationalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONALSTATUS$12) != 0;
        }
    }
    
    /**
     * Sets the "OperationalStatus" element
     */
    public void setOperationalStatus(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus operationalStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$12, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus)get_store().add_element_user(OPERATIONALSTATUS$12);
            }
            target.set(operationalStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "OperationalStatus" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus addNewOperationalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus)get_store().add_element_user(OPERATIONALSTATUS$12);
            return target;
        }
    }
    
    /**
     * Nils the "OperationalStatus" element
     */
    public void setNilOperationalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$12, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus)get_store().add_element_user(OPERATIONALSTATUS$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OperationalStatus" element
     */
    public void unsetOperationalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONALSTATUS$12, 0);
        }
    }
    
    /**
     * Gets the "AircraftInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo getAircraftInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo)get_store().find_element_user(AIRCRAFTINFO$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AircraftInfo" element
     */
    public boolean isSetAircraftInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AIRCRAFTINFO$14) != 0;
        }
    }
    
    /**
     * Sets the "AircraftInfo" element
     */
    public void setAircraftInfo(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo aircraftInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo)get_store().find_element_user(AIRCRAFTINFO$14, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo)get_store().add_element_user(AIRCRAFTINFO$14);
            }
            target.set(aircraftInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "AircraftInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo addNewAircraftInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo)get_store().add_element_user(AIRCRAFTINFO$14);
            return target;
        }
    }
    
    /**
     * Unsets the "AircraftInfo" element
     */
    public void unsetAircraftInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AIRCRAFTINFO$14, 0);
        }
    }
    
    /**
     * Gets the "Sect_Tiebreak" element
     */
    public java.lang.String getSectTiebreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECTTIEBREAK$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sect_Tiebreak" element
     */
    public org.iata.iata.x2007.x00.NumericStringLength1To4 xgetSectTiebreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(SECTTIEBREAK$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "Sect_Tiebreak" element
     */
    public boolean isSetSectTiebreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECTTIEBREAK$16) != 0;
        }
    }
    
    /**
     * Sets the "Sect_Tiebreak" element
     */
    public void setSectTiebreak(java.lang.String sectTiebreak)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECTTIEBREAK$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECTTIEBREAK$16);
            }
            target.setStringValue(sectTiebreak);
        }
    }
    
    /**
     * Sets (as xml) the "Sect_Tiebreak" element
     */
    public void xsetSectTiebreak(org.iata.iata.x2007.x00.NumericStringLength1To4 sectTiebreak)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(SECTTIEBREAK$16, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().add_element_user(SECTTIEBREAK$16);
            }
            target.set(sectTiebreak);
        }
    }
    
    /**
     * Unsets the "Sect_Tiebreak" element
     */
    public void unsetSectTiebreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECTTIEBREAK$16, 0);
        }
    }
    
    /**
     * Gets the "FlightType" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType.Enum getFlightType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTTYPE$18, 0);
            if (target == null)
            {
                return null;
            }
            return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FlightType" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType xgetFlightType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType)get_store().find_element_user(FLIGHTTYPE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "FlightType" element
     */
    public boolean isSetFlightType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLIGHTTYPE$18) != 0;
        }
    }
    
    /**
     * Sets the "FlightType" element
     */
    public void setFlightType(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType.Enum flightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTTYPE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTTYPE$18);
            }
            target.setEnumValue(flightType);
        }
    }
    
    /**
     * Sets (as xml) the "FlightType" element
     */
    public void xsetFlightType(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType flightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType)get_store().find_element_user(FLIGHTTYPE$18, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType)get_store().add_element_user(FLIGHTTYPE$18);
            }
            target.set(flightType);
        }
    }
    
    /**
     * Unsets the "FlightType" element
     */
    public void unsetFlightType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLIGHTTYPE$18, 0);
        }
    }
    
    /**
     * Gets the "Priority" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority.Enum getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$20, 0);
            if (target == null)
            {
                return null;
            }
            return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Priority" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority)get_store().find_element_user(PRIORITY$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "Priority" element
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$20) != 0;
        }
    }
    
    /**
     * Sets the "Priority" element
     */
    public void setPriority(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority.Enum priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$20);
            }
            target.setEnumValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "Priority" element
     */
    public void xsetPriority(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority)get_store().find_element_user(PRIORITY$20, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority)get_store().add_element_user(PRIORITY$20);
            }
            target.set(priority);
        }
    }
    
    /**
     * Unsets the "Priority" element
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$20, 0);
        }
    }
    /**
     * An XML Airline(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$Airline.
     */
    public static class AirlineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline
    {
        
        public AirlineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected AirlineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODECONTEXT$0 = 
            new javax.xml.namespace.QName("", "CodeContext");
        
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                return target;
            }
        }
        
        /**
         * True if has "CodeContext" attribute
         */
        public boolean isSetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODECONTEXT$0) != null;
            }
        }
        
        /**
         * Sets the "CodeContext" attribute
         */
        public void setCodeContext(java.lang.String codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.set(codeContext);
            }
        }
        
        /**
         * Unsets the "CodeContext" attribute
         */
        public void unsetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODECONTEXT$0);
            }
        }
    }
    /**
     * An XML Aircraft_Owner(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$AircraftOwner.
     */
    public static class AircraftOwnerImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner
    {
        
        public AircraftOwnerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected AircraftOwnerImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODECONTEXT$0 = 
            new javax.xml.namespace.QName("", "CodeContext");
        
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                return target;
            }
        }
        
        /**
         * True if has "CodeContext" attribute
         */
        public boolean isSetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODECONTEXT$0) != null;
            }
        }
        
        /**
         * Sets the "CodeContext" attribute
         */
        public void setCodeContext(java.lang.String codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.set(codeContext);
            }
        }
        
        /**
         * Unsets the "CodeContext" attribute
         */
        public void unsetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODECONTEXT$0);
            }
        }
    }
    /**
     * An XML ArrivalAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$ArrivalAirport.
     */
    public static class ArrivalAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport
    {
        
        public ArrivalAirportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ArrivalAirportImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODECONTEXT$0 = 
            new javax.xml.namespace.QName("", "CodeContext");
        
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                return target;
            }
        }
        
        /**
         * True if has "CodeContext" attribute
         */
        public boolean isSetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODECONTEXT$0) != null;
            }
        }
        
        /**
         * Sets the "CodeContext" attribute
         */
        public void setCodeContext(java.lang.String codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.set(codeContext);
            }
        }
        
        /**
         * Unsets the "CodeContext" attribute
         */
        public void unsetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODECONTEXT$0);
            }
        }
    }
    /**
     * An XML DepartureAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$DepartureAirport.
     */
    public static class DepartureAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport
    {
        
        public DepartureAirportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected DepartureAirportImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODECONTEXT$0 = 
            new javax.xml.namespace.QName("", "CodeContext");
        
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                return target;
            }
        }
        
        /**
         * True if has "CodeContext" attribute
         */
        public boolean isSetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODECONTEXT$0) != null;
            }
        }
        
        /**
         * Sets the "CodeContext" attribute
         */
        public void setCodeContext(java.lang.String codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.set(codeContext);
            }
        }
        
        /**
         * Unsets the "CodeContext" attribute
         */
        public void unsetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODECONTEXT$0);
            }
        }
    }
    /**
     * An XML OperationalStatus(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$OperationalStatus.
     */
    public static class OperationalStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus
    {
        
        public OperationalStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected OperationalStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODECONTEXT$0 = 
            new javax.xml.namespace.QName("", "CodeContext");
        
        
        /**
         * Gets the "CodeContext" attribute
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext.Enum getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    return null;
                }
                return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext)get_store().find_attribute_user(CODECONTEXT$0);
                return target;
            }
        }
        
        /**
         * True if has "CodeContext" attribute
         */
        public boolean isSetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODECONTEXT$0) != null;
            }
        }
        
        /**
         * Sets the "CodeContext" attribute
         */
        public void setCodeContext(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext.Enum codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.setEnumValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.set(codeContext);
            }
        }
        
        /**
         * Unsets the "CodeContext" attribute
         */
        public void unsetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODECONTEXT$0);
            }
        }
        /**
         * An XML CodeContext(@).
         *
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$OperationalStatus$CodeContext.
         */
        public static class CodeContextImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext
        {
            
            public CodeContextImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CodeContextImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML AircraftInfo(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is a complex type.
     */
    public static class AircraftInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo
    {
        
        public AircraftInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AIRCRAFTTYPE$0 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "AircraftType");
        private static final javax.xml.namespace.QName AIRCRAFTSUBTYPE$2 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "AircraftSubType");
        private static final javax.xml.namespace.QName REGISTRATION$4 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Registration");
        
        
        /**
         * Gets the "AircraftType" element
         */
        public java.lang.String getAircraftType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AircraftType" element
         */
        public org.iata.iata.x2007.x00.AirEquipType xgetAircraftType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.AirEquipType target = null;
                target = (org.iata.iata.x2007.x00.AirEquipType)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "AircraftType" element
         */
        public boolean isNilAircraftType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.AirEquipType target = null;
                target = (org.iata.iata.x2007.x00.AirEquipType)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "AircraftType" element
         */
        public boolean isSetAircraftType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AIRCRAFTTYPE$0) != 0;
            }
        }
        
        /**
         * Sets the "AircraftType" element
         */
        public void setAircraftType(java.lang.String aircraftType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRCRAFTTYPE$0);
                }
                target.setStringValue(aircraftType);
            }
        }
        
        /**
         * Sets (as xml) the "AircraftType" element
         */
        public void xsetAircraftType(org.iata.iata.x2007.x00.AirEquipType aircraftType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.AirEquipType target = null;
                target = (org.iata.iata.x2007.x00.AirEquipType)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.AirEquipType)get_store().add_element_user(AIRCRAFTTYPE$0);
                }
                target.set(aircraftType);
            }
        }
        
        /**
         * Nils the "AircraftType" element
         */
        public void setNilAircraftType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.AirEquipType target = null;
                target = (org.iata.iata.x2007.x00.AirEquipType)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.AirEquipType)get_store().add_element_user(AIRCRAFTTYPE$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "AircraftType" element
         */
        public void unsetAircraftType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AIRCRAFTTYPE$0, 0);
            }
        }
        
        /**
         * Gets the "AircraftSubType" element
         */
        public java.lang.String getAircraftSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AircraftSubType" element
         */
        public org.iata.iata.x2007.x00.StringLength3 xgetAircraftSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength3 target = null;
                target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "AircraftSubType" element
         */
        public boolean isNilAircraftSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength3 target = null;
                target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "AircraftSubType" element
         */
        public boolean isSetAircraftSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AIRCRAFTSUBTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "AircraftSubType" element
         */
        public void setAircraftSubType(java.lang.String aircraftSubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRCRAFTSUBTYPE$2);
                }
                target.setStringValue(aircraftSubType);
            }
        }
        
        /**
         * Sets (as xml) the "AircraftSubType" element
         */
        public void xsetAircraftSubType(org.iata.iata.x2007.x00.StringLength3 aircraftSubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength3 target = null;
                target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength3)get_store().add_element_user(AIRCRAFTSUBTYPE$2);
                }
                target.set(aircraftSubType);
            }
        }
        
        /**
         * Nils the "AircraftSubType" element
         */
        public void setNilAircraftSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength3 target = null;
                target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength3)get_store().add_element_user(AIRCRAFTSUBTYPE$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "AircraftSubType" element
         */
        public void unsetAircraftSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AIRCRAFTSUBTYPE$2, 0);
            }
        }
        
        /**
         * Gets the "Registration" element
         */
        public java.lang.String getRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Registration" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration xgetRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Registration" element
         */
        public boolean isNilRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "Registration" element
         */
        public boolean isSetRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGISTRATION$4) != 0;
            }
        }
        
        /**
         * Sets the "Registration" element
         */
        public void setRegistration(java.lang.String registration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRATION$4);
                }
                target.setStringValue(registration);
            }
        }
        
        /**
         * Sets (as xml) the "Registration" element
         */
        public void xsetRegistration(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration registration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration)get_store().add_element_user(REGISTRATION$4);
                }
                target.set(registration);
            }
        }
        
        /**
         * Nils the "Registration" element
         */
        public void setNilRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration)get_store().add_element_user(REGISTRATION$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "Registration" element
         */
        public void unsetRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGISTRATION$4, 0);
            }
        }
        /**
         * An XML Registration(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$AircraftInfo$Registration.
         */
        public static class RegistrationImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration
        {
            
            public RegistrationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RegistrationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML FlightType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$FlightType.
     */
    public static class FlightTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType
    {
        
        public FlightTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FlightTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML Priority(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$Priority.
     */
    public static class PriorityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority
    {
        
        public PriorityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PriorityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
