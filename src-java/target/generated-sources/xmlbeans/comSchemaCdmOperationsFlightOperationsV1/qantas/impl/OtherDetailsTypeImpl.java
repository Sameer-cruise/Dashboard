/*
 * XML Type:  otherDetailsType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1
 * Java type: comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsV1.qantas.impl;
/**
 * An XML otherDetailsType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
 *
 * This is a complex type.
 */
public class OtherDetailsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType
{
    
    public OtherDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRPORTDETAILS$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "airportDetails");
    private static final javax.xml.namespace.QName ESTIMATETIMEDETAILS$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "EstimateTimeDetails");
    private static final javax.xml.namespace.QName ARRIVALTIMEDETAILS$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "ArrivalTimeDetails");
    private static final javax.xml.namespace.QName OPERATINGCARRIER$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "OperatingCarrier");
    private static final javax.xml.namespace.QName MARKETINGCARRIER$8 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "MarketingCarrier");
    private static final javax.xml.namespace.QName REGO$10 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "Rego");
    private static final javax.xml.namespace.QName DELAYINFORMATION$12 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "delayInformation");
    private static final javax.xml.namespace.QName DEPARTURETIMEDETAILS$14 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "departureTimeDetails");
    private static final javax.xml.namespace.QName LOCALDATE$16 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "localDate");
    
    
    /**
     * Gets the "airportDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType getAirportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType)get_store().find_element_user(AIRPORTDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "airportDetails" element
     */
    public boolean isSetAirportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AIRPORTDETAILS$0) != 0;
        }
    }
    
    /**
     * Sets the "airportDetails" element
     */
    public void setAirportDetails(comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType airportDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType)get_store().find_element_user(AIRPORTDETAILS$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType)get_store().add_element_user(AIRPORTDETAILS$0);
            }
            target.set(airportDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "airportDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType addNewAirportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType)get_store().add_element_user(AIRPORTDETAILS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "airportDetails" element
     */
    public void unsetAirportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AIRPORTDETAILS$0, 0);
        }
    }
    
    /**
     * Gets the "EstimateTimeDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType getEstimateTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().find_element_user(ESTIMATETIMEDETAILS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EstimateTimeDetails" element
     */
    public boolean isSetEstimateTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTIMATETIMEDETAILS$2) != 0;
        }
    }
    
    /**
     * Sets the "EstimateTimeDetails" element
     */
    public void setEstimateTimeDetails(comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType estimateTimeDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().find_element_user(ESTIMATETIMEDETAILS$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().add_element_user(ESTIMATETIMEDETAILS$2);
            }
            target.set(estimateTimeDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "EstimateTimeDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType addNewEstimateTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().add_element_user(ESTIMATETIMEDETAILS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "EstimateTimeDetails" element
     */
    public void unsetEstimateTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTIMATETIMEDETAILS$2, 0);
        }
    }
    
    /**
     * Gets the "ArrivalTimeDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType getArrivalTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().find_element_user(ARRIVALTIMEDETAILS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ArrivalTimeDetails" element
     */
    public boolean isSetArrivalTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRIVALTIMEDETAILS$4) != 0;
        }
    }
    
    /**
     * Sets the "ArrivalTimeDetails" element
     */
    public void setArrivalTimeDetails(comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType arrivalTimeDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().find_element_user(ARRIVALTIMEDETAILS$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().add_element_user(ARRIVALTIMEDETAILS$4);
            }
            target.set(arrivalTimeDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrivalTimeDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType addNewArrivalTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().add_element_user(ARRIVALTIMEDETAILS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ArrivalTimeDetails" element
     */
    public void unsetArrivalTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRIVALTIMEDETAILS$4, 0);
        }
    }
    
    /**
     * Gets the "OperatingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(OPERATINGCARRIER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OperatingCarrier" element
     */
    public boolean isSetOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATINGCARRIER$6) != 0;
        }
    }
    
    /**
     * Sets the "OperatingCarrier" element
     */
    public void setOperatingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType operatingCarrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(OPERATINGCARRIER$6, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(OPERATINGCARRIER$6);
            }
            target.set(operatingCarrier);
        }
    }
    
    /**
     * Appends and returns a new empty "OperatingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(OPERATINGCARRIER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "OperatingCarrier" element
     */
    public void unsetOperatingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATINGCARRIER$6, 0);
        }
    }
    
    /**
     * Gets the "MarketingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getMarketingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(MARKETINGCARRIER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MarketingCarrier" element
     */
    public boolean isSetMarketingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARKETINGCARRIER$8) != 0;
        }
    }
    
    /**
     * Sets the "MarketingCarrier" element
     */
    public void setMarketingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType marketingCarrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().find_element_user(MARKETINGCARRIER$8, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(MARKETINGCARRIER$8);
            }
            target.set(marketingCarrier);
        }
    }
    
    /**
     * Appends and returns a new empty "MarketingCarrier" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewMarketingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType)get_store().add_element_user(MARKETINGCARRIER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "MarketingCarrier" element
     */
    public void unsetMarketingCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARKETINGCARRIER$8, 0);
        }
    }
    
    /**
     * Gets the "Rego" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType getRego()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType)get_store().find_element_user(REGO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Rego" element
     */
    public boolean isSetRego()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGO$10) != 0;
        }
    }
    
    /**
     * Sets the "Rego" element
     */
    public void setRego(comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType rego)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType)get_store().find_element_user(REGO$10, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType)get_store().add_element_user(REGO$10);
            }
            target.set(rego);
        }
    }
    
    /**
     * Appends and returns a new empty "Rego" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType addNewRego()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType)get_store().add_element_user(REGO$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Rego" element
     */
    public void unsetRego()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGO$10, 0);
        }
    }
    
    /**
     * Gets the "delayInformation" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType getDelayInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType)get_store().find_element_user(DELAYINFORMATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "delayInformation" element
     */
    public boolean isSetDelayInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELAYINFORMATION$12) != 0;
        }
    }
    
    /**
     * Sets the "delayInformation" element
     */
    public void setDelayInformation(comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType delayInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType)get_store().find_element_user(DELAYINFORMATION$12, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType)get_store().add_element_user(DELAYINFORMATION$12);
            }
            target.set(delayInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "delayInformation" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType addNewDelayInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType)get_store().add_element_user(DELAYINFORMATION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "delayInformation" element
     */
    public void unsetDelayInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELAYINFORMATION$12, 0);
        }
    }
    
    /**
     * Gets the "departureTimeDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType getDepartureTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().find_element_user(DEPARTURETIMEDETAILS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "departureTimeDetails" element
     */
    public boolean isSetDepartureTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTURETIMEDETAILS$14) != 0;
        }
    }
    
    /**
     * Sets the "departureTimeDetails" element
     */
    public void setDepartureTimeDetails(comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType departureTimeDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().find_element_user(DEPARTURETIMEDETAILS$14, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().add_element_user(DEPARTURETIMEDETAILS$14);
            }
            target.set(departureTimeDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "departureTimeDetails" element
     */
    public comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType addNewDepartureTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType target = null;
            target = (comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType)get_store().add_element_user(DEPARTURETIMEDETAILS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "departureTimeDetails" element
     */
    public void unsetDepartureTimeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTURETIMEDETAILS$14, 0);
        }
    }
    
    /**
     * Gets the "localDate" element
     */
    public java.util.Calendar getLocalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALDATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "localDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLocalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LOCALDATE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "localDate" element
     */
    public boolean isSetLocalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALDATE$16) != 0;
        }
    }
    
    /**
     * Sets the "localDate" element
     */
    public void setLocalDate(java.util.Calendar localDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALDATE$16);
            }
            target.setCalendarValue(localDate);
        }
    }
    
    /**
     * Sets (as xml) the "localDate" element
     */
    public void xsetLocalDate(org.apache.xmlbeans.XmlDateTime localDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LOCALDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LOCALDATE$16);
            }
            target.set(localDate);
        }
    }
    
    /**
     * Unsets the "localDate" element
     */
    public void unsetLocalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALDATE$16, 0);
        }
    }
}
