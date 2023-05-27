/*
 * XML Type:  FilterDataTypeIOC
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.impl;
/**
 * An XML FilterDataTypeIOC(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
 *
 * This is a complex type.
 */
public class FilterDataTypeIOCImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC
{
    
    public FilterDataTypeIOCImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRLINE$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "Airline");
    private static final javax.xml.namespace.QName FLIGHTNUMBER$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "FlightNumber");
    private static final javax.xml.namespace.QName TRIPSEARCH$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "TripSearch");
    private static final javax.xml.namespace.QName ALDEPARTUREAIRPORT$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "AL_DepartureAirport");
    private static final javax.xml.namespace.QName DLDEPARTUREAIRPORT$8 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "DL_DepartureAirport");
    private static final javax.xml.namespace.QName DLARRIVALAIRPORT$10 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "DL_ArrivalAirport");
    private static final javax.xml.namespace.QName DEPARTURESTARTDATE$12 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "DepartureStartDate");
    private static final javax.xml.namespace.QName DEPARTUREENDDATE$14 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "DepartureEndDate");
    private static final javax.xml.namespace.QName DLDEPARTUREDATE$16 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "DL_DepartureDate");
    private static final javax.xml.namespace.QName ORIGINDATELOCAL$18 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "OriginDateLocal");
    private static final javax.xml.namespace.QName OPERATIONALSTATUS$20 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "OperationalStatus");
    private static final javax.xml.namespace.QName IOCEVENTTYPE$22 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "IOCEventType");
    private static final javax.xml.namespace.QName REQUESTUSER$24 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "RequestUser");
    private static final javax.xml.namespace.QName AIRCRAFTINFO$26 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "AircraftInfo");
    private static final javax.xml.namespace.QName FLIGHTTYPE$28 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "FlightType");
    private static final javax.xml.namespace.QName PRIORITY$30 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "Priority");
    private static final javax.xml.namespace.QName ROWLIMIT$32 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "RowLimit");
    private static final javax.xml.namespace.QName RESULTORDER$34 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "ResultOrder");
    
    
    /**
     * Gets array of all "Airline" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline[] getAirlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AIRLINE$0, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Airline" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline getAirlineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline)get_store().find_element_user(AIRLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Airline" element
     */
    public int sizeOfAirlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AIRLINE$0);
        }
    }
    
    /**
     * Sets array of all "Airline" element
     */
    public void setAirlineArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline[] airlineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(airlineArray, AIRLINE$0);
        }
    }
    
    /**
     * Sets ith "Airline" element
     */
    public void setAirlineArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline airline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline)get_store().find_element_user(AIRLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(airline);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Airline" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline insertNewAirline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline)get_store().insert_element_user(AIRLINE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Airline" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline addNewAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline)get_store().add_element_user(AIRLINE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Airline" element
     */
    public void removeAirline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AIRLINE$0, i);
        }
    }
    
    /**
     * Gets array of all "FlightNumber" elements
     */
    public java.lang.String[] getFlightNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLIGHTNUMBER$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "FlightNumber" element
     */
    public java.lang.String getFlightNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "FlightNumber" elements
     */
    public org.iata.iata.x2007.x00.NumericStringLength1To4[] xgetFlightNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLIGHTNUMBER$2, targetList);
            org.iata.iata.x2007.x00.NumericStringLength1To4[] result = new org.iata.iata.x2007.x00.NumericStringLength1To4[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "FlightNumber" element
     */
    public org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.iata.iata.x2007.x00.NumericStringLength1To4)target;
        }
    }
    
    /**
     * Returns number of "FlightNumber" element
     */
    public int sizeOfFlightNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLIGHTNUMBER$2);
        }
    }
    
    /**
     * Sets array of all "FlightNumber" element
     */
    public void setFlightNumberArray(java.lang.String[] flightNumberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flightNumberArray, FLIGHTNUMBER$2);
        }
    }
    
    /**
     * Sets ith "FlightNumber" element
     */
    public void setFlightNumberArray(int i, java.lang.String flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(flightNumber);
        }
    }
    
    /**
     * Sets (as xml) array of all "FlightNumber" element
     */
    public void xsetFlightNumberArray(org.iata.iata.x2007.x00.NumericStringLength1To4[]flightNumberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flightNumberArray, FLIGHTNUMBER$2);
        }
    }
    
    /**
     * Sets (as xml) ith "FlightNumber" element
     */
    public void xsetFlightNumberArray(int i, org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(flightNumber);
        }
    }
    
    /**
     * Inserts the value as the ith "FlightNumber" element
     */
    public void insertFlightNumber(int i, java.lang.String flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FLIGHTNUMBER$2, i);
            target.setStringValue(flightNumber);
        }
    }
    
    /**
     * Appends the value as the last "FlightNumber" element
     */
    public void addFlightNumber(java.lang.String flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTNUMBER$2);
            target.setStringValue(flightNumber);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FlightNumber" element
     */
    public org.iata.iata.x2007.x00.NumericStringLength1To4 insertNewFlightNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().insert_element_user(FLIGHTNUMBER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FlightNumber" element
     */
    public org.iata.iata.x2007.x00.NumericStringLength1To4 addNewFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().add_element_user(FLIGHTNUMBER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "FlightNumber" element
     */
    public void removeFlightNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLIGHTNUMBER$2, i);
        }
    }
    
    /**
     * Gets the "TripSearch" element
     */
    public java.lang.String getTripSearch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIPSEARCH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TripSearch" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch xgetTripSearch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch)get_store().find_element_user(TRIPSEARCH$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TripSearch" element
     */
    public boolean isNilTripSearch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch)get_store().find_element_user(TRIPSEARCH$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TripSearch" element
     */
    public boolean isSetTripSearch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIPSEARCH$4) != 0;
        }
    }
    
    /**
     * Sets the "TripSearch" element
     */
    public void setTripSearch(java.lang.String tripSearch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIPSEARCH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRIPSEARCH$4);
            }
            target.setStringValue(tripSearch);
        }
    }
    
    /**
     * Sets (as xml) the "TripSearch" element
     */
    public void xsetTripSearch(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch tripSearch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch)get_store().find_element_user(TRIPSEARCH$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch)get_store().add_element_user(TRIPSEARCH$4);
            }
            target.set(tripSearch);
        }
    }
    
    /**
     * Nils the "TripSearch" element
     */
    public void setNilTripSearch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch)get_store().find_element_user(TRIPSEARCH$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch)get_store().add_element_user(TRIPSEARCH$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TripSearch" element
     */
    public void unsetTripSearch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIPSEARCH$4, 0);
        }
    }
    
    /**
     * Gets array of all "AL_DepartureAirport" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport[] getALDepartureAirportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALDEPARTUREAIRPORT$6, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AL_DepartureAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport getALDepartureAirportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport)get_store().find_element_user(ALDEPARTUREAIRPORT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AL_DepartureAirport" element
     */
    public int sizeOfALDepartureAirportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALDEPARTUREAIRPORT$6);
        }
    }
    
    /**
     * Sets array of all "AL_DepartureAirport" element
     */
    public void setALDepartureAirportArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport[] alDepartureAirportArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alDepartureAirportArray, ALDEPARTUREAIRPORT$6);
        }
    }
    
    /**
     * Sets ith "AL_DepartureAirport" element
     */
    public void setALDepartureAirportArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport alDepartureAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport)get_store().find_element_user(ALDEPARTUREAIRPORT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alDepartureAirport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AL_DepartureAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport insertNewALDepartureAirport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport)get_store().insert_element_user(ALDEPARTUREAIRPORT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AL_DepartureAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport addNewALDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport)get_store().add_element_user(ALDEPARTUREAIRPORT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "AL_DepartureAirport" element
     */
    public void removeALDepartureAirport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALDEPARTUREAIRPORT$6, i);
        }
    }
    
    /**
     * Gets array of all "DL_DepartureAirport" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport[] getDLDepartureAirportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DLDEPARTUREAIRPORT$8, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DL_DepartureAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport getDLDepartureAirportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport)get_store().find_element_user(DLDEPARTUREAIRPORT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DL_DepartureAirport" element
     */
    public int sizeOfDLDepartureAirportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DLDEPARTUREAIRPORT$8);
        }
    }
    
    /**
     * Sets array of all "DL_DepartureAirport" element
     */
    public void setDLDepartureAirportArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport[] dlDepartureAirportArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dlDepartureAirportArray, DLDEPARTUREAIRPORT$8);
        }
    }
    
    /**
     * Sets ith "DL_DepartureAirport" element
     */
    public void setDLDepartureAirportArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport dlDepartureAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport)get_store().find_element_user(DLDEPARTUREAIRPORT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dlDepartureAirport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DL_DepartureAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport insertNewDLDepartureAirport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport)get_store().insert_element_user(DLDEPARTUREAIRPORT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DL_DepartureAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport addNewDLDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport)get_store().add_element_user(DLDEPARTUREAIRPORT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "DL_DepartureAirport" element
     */
    public void removeDLDepartureAirport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DLDEPARTUREAIRPORT$8, i);
        }
    }
    
    /**
     * Gets array of all "DL_ArrivalAirport" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport[] getDLArrivalAirportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DLARRIVALAIRPORT$10, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DL_ArrivalAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport getDLArrivalAirportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport)get_store().find_element_user(DLARRIVALAIRPORT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DL_ArrivalAirport" element
     */
    public int sizeOfDLArrivalAirportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DLARRIVALAIRPORT$10);
        }
    }
    
    /**
     * Sets array of all "DL_ArrivalAirport" element
     */
    public void setDLArrivalAirportArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport[] dlArrivalAirportArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dlArrivalAirportArray, DLARRIVALAIRPORT$10);
        }
    }
    
    /**
     * Sets ith "DL_ArrivalAirport" element
     */
    public void setDLArrivalAirportArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport dlArrivalAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport)get_store().find_element_user(DLARRIVALAIRPORT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dlArrivalAirport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DL_ArrivalAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport insertNewDLArrivalAirport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport)get_store().insert_element_user(DLARRIVALAIRPORT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DL_ArrivalAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport addNewDLArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport)get_store().add_element_user(DLARRIVALAIRPORT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "DL_ArrivalAirport" element
     */
    public void removeDLArrivalAirport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DLARRIVALAIRPORT$10, i);
        }
    }
    
    /**
     * Gets the "DepartureStartDate" element
     */
    public java.util.Calendar getDepartureStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTURESTARTDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepartureStartDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetDepartureStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DEPARTURESTARTDATE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "DepartureStartDate" element
     */
    public boolean isSetDepartureStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTURESTARTDATE$12) != 0;
        }
    }
    
    /**
     * Sets the "DepartureStartDate" element
     */
    public void setDepartureStartDate(java.util.Calendar departureStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTURESTARTDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPARTURESTARTDATE$12);
            }
            target.setCalendarValue(departureStartDate);
        }
    }
    
    /**
     * Sets (as xml) the "DepartureStartDate" element
     */
    public void xsetDepartureStartDate(org.apache.xmlbeans.XmlDate departureStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DEPARTURESTARTDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DEPARTURESTARTDATE$12);
            }
            target.set(departureStartDate);
        }
    }
    
    /**
     * Unsets the "DepartureStartDate" element
     */
    public void unsetDepartureStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTURESTARTDATE$12, 0);
        }
    }
    
    /**
     * Gets the "DepartureEndDate" element
     */
    public java.util.Calendar getDepartureEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTUREENDDATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepartureEndDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetDepartureEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DEPARTUREENDDATE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "DepartureEndDate" element
     */
    public boolean isSetDepartureEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTUREENDDATE$14) != 0;
        }
    }
    
    /**
     * Sets the "DepartureEndDate" element
     */
    public void setDepartureEndDate(java.util.Calendar departureEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTUREENDDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPARTUREENDDATE$14);
            }
            target.setCalendarValue(departureEndDate);
        }
    }
    
    /**
     * Sets (as xml) the "DepartureEndDate" element
     */
    public void xsetDepartureEndDate(org.apache.xmlbeans.XmlDate departureEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DEPARTUREENDDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DEPARTUREENDDATE$14);
            }
            target.set(departureEndDate);
        }
    }
    
    /**
     * Unsets the "DepartureEndDate" element
     */
    public void unsetDepartureEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTUREENDDATE$14, 0);
        }
    }
    
    /**
     * Gets the "DL_DepartureDate" element
     */
    public java.util.Calendar getDLDepartureDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DLDEPARTUREDATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DL_DepartureDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetDLDepartureDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DLDEPARTUREDATE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "DL_DepartureDate" element
     */
    public boolean isSetDLDepartureDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DLDEPARTUREDATE$16) != 0;
        }
    }
    
    /**
     * Sets the "DL_DepartureDate" element
     */
    public void setDLDepartureDate(java.util.Calendar dlDepartureDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DLDEPARTUREDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DLDEPARTUREDATE$16);
            }
            target.setCalendarValue(dlDepartureDate);
        }
    }
    
    /**
     * Sets (as xml) the "DL_DepartureDate" element
     */
    public void xsetDLDepartureDate(org.apache.xmlbeans.XmlDate dlDepartureDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DLDEPARTUREDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DLDEPARTUREDATE$16);
            }
            target.set(dlDepartureDate);
        }
    }
    
    /**
     * Unsets the "DL_DepartureDate" element
     */
    public void unsetDLDepartureDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DLDEPARTUREDATE$16, 0);
        }
    }
    
    /**
     * Gets the "OriginDateLocal" element
     */
    public java.util.Calendar getOriginDateLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINDATELOCAL$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OriginDateLocal" element
     */
    public org.apache.xmlbeans.XmlDate xgetOriginDateLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ORIGINDATELOCAL$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "OriginDateLocal" element
     */
    public boolean isSetOriginDateLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINDATELOCAL$18) != 0;
        }
    }
    
    /**
     * Sets the "OriginDateLocal" element
     */
    public void setOriginDateLocal(java.util.Calendar originDateLocal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINDATELOCAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINDATELOCAL$18);
            }
            target.setCalendarValue(originDateLocal);
        }
    }
    
    /**
     * Sets (as xml) the "OriginDateLocal" element
     */
    public void xsetOriginDateLocal(org.apache.xmlbeans.XmlDate originDateLocal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ORIGINDATELOCAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ORIGINDATELOCAL$18);
            }
            target.set(originDateLocal);
        }
    }
    
    /**
     * Unsets the "OriginDateLocal" element
     */
    public void unsetOriginDateLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINDATELOCAL$18, 0);
        }
    }
    
    /**
     * Gets array of all "OperationalStatus" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus[] getOperationalStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATIONALSTATUS$20, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OperationalStatus" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus getOperationalStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OperationalStatus" element
     */
    public boolean isNilOperationalStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OperationalStatus" element
     */
    public int sizeOfOperationalStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONALSTATUS$20);
        }
    }
    
    /**
     * Sets array of all "OperationalStatus" element
     */
    public void setOperationalStatusArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus[] operationalStatusArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operationalStatusArray, OPERATIONALSTATUS$20);
        }
    }
    
    /**
     * Sets ith "OperationalStatus" element
     */
    public void setOperationalStatusArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus operationalStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operationalStatus);
        }
    }
    
    /**
     * Nils the ith "OperationalStatus" element
     */
    public void setNilOperationalStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OperationalStatus" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus insertNewOperationalStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus)get_store().insert_element_user(OPERATIONALSTATUS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OperationalStatus" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus addNewOperationalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus)get_store().add_element_user(OPERATIONALSTATUS$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "OperationalStatus" element
     */
    public void removeOperationalStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONALSTATUS$20, i);
        }
    }
    
    /**
     * Gets array of all "IOCEventType" elements
     */
    public java.lang.String[] getIOCEventTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IOCEVENTTYPE$22, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "IOCEventType" element
     */
    public java.lang.String getIOCEventTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IOCEVENTTYPE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "IOCEventType" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetIOCEventTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IOCEVENTTYPE$22, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "IOCEventType" element
     */
    public org.apache.xmlbeans.XmlString xgetIOCEventTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IOCEVENTTYPE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "IOCEventType" element
     */
    public int sizeOfIOCEventTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IOCEVENTTYPE$22);
        }
    }
    
    /**
     * Sets array of all "IOCEventType" element
     */
    public void setIOCEventTypeArray(java.lang.String[] iocEventTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iocEventTypeArray, IOCEVENTTYPE$22);
        }
    }
    
    /**
     * Sets ith "IOCEventType" element
     */
    public void setIOCEventTypeArray(int i, java.lang.String iocEventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IOCEVENTTYPE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(iocEventType);
        }
    }
    
    /**
     * Sets (as xml) array of all "IOCEventType" element
     */
    public void xsetIOCEventTypeArray(org.apache.xmlbeans.XmlString[]iocEventTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iocEventTypeArray, IOCEVENTTYPE$22);
        }
    }
    
    /**
     * Sets (as xml) ith "IOCEventType" element
     */
    public void xsetIOCEventTypeArray(int i, org.apache.xmlbeans.XmlString iocEventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IOCEVENTTYPE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(iocEventType);
        }
    }
    
    /**
     * Inserts the value as the ith "IOCEventType" element
     */
    public void insertIOCEventType(int i, java.lang.String iocEventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IOCEVENTTYPE$22, i);
            target.setStringValue(iocEventType);
        }
    }
    
    /**
     * Appends the value as the last "IOCEventType" element
     */
    public void addIOCEventType(java.lang.String iocEventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IOCEVENTTYPE$22);
            target.setStringValue(iocEventType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IOCEventType" element
     */
    public org.apache.xmlbeans.XmlString insertNewIOCEventType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(IOCEVENTTYPE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IOCEventType" element
     */
    public org.apache.xmlbeans.XmlString addNewIOCEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IOCEVENTTYPE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "IOCEventType" element
     */
    public void removeIOCEventType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IOCEVENTTYPE$22, i);
        }
    }
    
    /**
     * Gets the "RequestUser" element
     */
    public java.lang.String getRequestUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTUSER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestUser" element
     */
    public org.apache.xmlbeans.XmlString xgetRequestUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTUSER$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestUser" element
     */
    public boolean isSetRequestUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTUSER$24) != 0;
        }
    }
    
    /**
     * Sets the "RequestUser" element
     */
    public void setRequestUser(java.lang.String requestUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTUSER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTUSER$24);
            }
            target.setStringValue(requestUser);
        }
    }
    
    /**
     * Sets (as xml) the "RequestUser" element
     */
    public void xsetRequestUser(org.apache.xmlbeans.XmlString requestUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTUSER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTUSER$24);
            }
            target.set(requestUser);
        }
    }
    
    /**
     * Unsets the "RequestUser" element
     */
    public void unsetRequestUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTUSER$24, 0);
        }
    }
    
    /**
     * Gets array of all "AircraftInfo" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo[] getAircraftInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AIRCRAFTINFO$26, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AircraftInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo getAircraftInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo)get_store().find_element_user(AIRCRAFTINFO$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AircraftInfo" element
     */
    public int sizeOfAircraftInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AIRCRAFTINFO$26);
        }
    }
    
    /**
     * Sets array of all "AircraftInfo" element
     */
    public void setAircraftInfoArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo[] aircraftInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(aircraftInfoArray, AIRCRAFTINFO$26);
        }
    }
    
    /**
     * Sets ith "AircraftInfo" element
     */
    public void setAircraftInfoArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo aircraftInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo)get_store().find_element_user(AIRCRAFTINFO$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(aircraftInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AircraftInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo insertNewAircraftInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo)get_store().insert_element_user(AIRCRAFTINFO$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AircraftInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo addNewAircraftInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo)get_store().add_element_user(AIRCRAFTINFO$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "AircraftInfo" element
     */
    public void removeAircraftInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AIRCRAFTINFO$26, i);
        }
    }
    
    /**
     * Gets array of all "FlightType" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum[] getFlightTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLIGHTTYPE$28, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "FlightType" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum getFlightTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTTYPE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "FlightType" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType[] xgetFlightTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLIGHTTYPE$28, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "FlightType" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType xgetFlightTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType)get_store().find_element_user(FLIGHTTYPE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType)target;
        }
    }
    
    /**
     * Returns number of "FlightType" element
     */
    public int sizeOfFlightTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLIGHTTYPE$28);
        }
    }
    
    /**
     * Sets array of all "FlightType" element
     */
    public void setFlightTypeArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum[] flightTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flightTypeArray, FLIGHTTYPE$28);
        }
    }
    
    /**
     * Sets ith "FlightType" element
     */
    public void setFlightTypeArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum flightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTTYPE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(flightType);
        }
    }
    
    /**
     * Sets (as xml) array of all "FlightType" element
     */
    public void xsetFlightTypeArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType[]flightTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flightTypeArray, FLIGHTTYPE$28);
        }
    }
    
    /**
     * Sets (as xml) ith "FlightType" element
     */
    public void xsetFlightTypeArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType flightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType)get_store().find_element_user(FLIGHTTYPE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(flightType);
        }
    }
    
    /**
     * Inserts the value as the ith "FlightType" element
     */
    public void insertFlightType(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum flightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FLIGHTTYPE$28, i);
            target.setEnumValue(flightType);
        }
    }
    
    /**
     * Appends the value as the last "FlightType" element
     */
    public void addFlightType(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum flightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTTYPE$28);
            target.setEnumValue(flightType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FlightType" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType insertNewFlightType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType)get_store().insert_element_user(FLIGHTTYPE$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FlightType" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType addNewFlightType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType)get_store().add_element_user(FLIGHTTYPE$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "FlightType" element
     */
    public void removeFlightType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLIGHTTYPE$28, i);
        }
    }
    
    /**
     * Gets array of all "Priority" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum[] getPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIORITY$30, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Priority" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum getPriorityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Priority" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority[] xgetPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIORITY$30, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority[] result = new comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Priority" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority xgetPriorityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority)get_store().find_element_user(PRIORITY$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority)target;
        }
    }
    
    /**
     * Returns number of "Priority" element
     */
    public int sizeOfPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$30);
        }
    }
    
    /**
     * Sets array of all "Priority" element
     */
    public void setPriorityArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum[] priorityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(priorityArray, PRIORITY$30);
        }
    }
    
    /**
     * Sets ith "Priority" element
     */
    public void setPriorityArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(priority);
        }
    }
    
    /**
     * Sets (as xml) array of all "Priority" element
     */
    public void xsetPriorityArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority[]priorityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(priorityArray, PRIORITY$30);
        }
    }
    
    /**
     * Sets (as xml) ith "Priority" element
     */
    public void xsetPriorityArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority)get_store().find_element_user(PRIORITY$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(priority);
        }
    }
    
    /**
     * Inserts the value as the ith "Priority" element
     */
    public void insertPriority(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PRIORITY$30, i);
            target.setEnumValue(priority);
        }
    }
    
    /**
     * Appends the value as the last "Priority" element
     */
    public void addPriority(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$30);
            target.setEnumValue(priority);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Priority" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority insertNewPriority(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority)get_store().insert_element_user(PRIORITY$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Priority" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority addNewPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority)get_store().add_element_user(PRIORITY$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "Priority" element
     */
    public void removePriority(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$30, i);
        }
    }
    
    /**
     * Gets the "RowLimit" element
     */
    public java.math.BigInteger getRowLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWLIMIT$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "RowLimit" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetRowLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROWLIMIT$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "RowLimit" element
     */
    public boolean isSetRowLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROWLIMIT$32) != 0;
        }
    }
    
    /**
     * Sets the "RowLimit" element
     */
    public void setRowLimit(java.math.BigInteger rowLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWLIMIT$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWLIMIT$32);
            }
            target.setBigIntegerValue(rowLimit);
        }
    }
    
    /**
     * Sets (as xml) the "RowLimit" element
     */
    public void xsetRowLimit(org.apache.xmlbeans.XmlPositiveInteger rowLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROWLIMIT$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(ROWLIMIT$32);
            }
            target.set(rowLimit);
        }
    }
    
    /**
     * Unsets the "RowLimit" element
     */
    public void unsetRowLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROWLIMIT$32, 0);
        }
    }
    
    /**
     * Gets the "ResultOrder" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder getResultOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder)get_store().find_element_user(RESULTORDER$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResultOrder" element
     */
    public boolean isSetResultOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULTORDER$34) != 0;
        }
    }
    
    /**
     * Sets the "ResultOrder" element
     */
    public void setResultOrder(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder resultOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder)get_store().find_element_user(RESULTORDER$34, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder)get_store().add_element_user(RESULTORDER$34);
            }
            target.set(resultOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "ResultOrder" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder addNewResultOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder)get_store().add_element_user(RESULTORDER$34);
            return target;
        }
    }
    
    /**
     * Unsets the "ResultOrder" element
     */
    public void unsetResultOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULTORDER$34, 0);
        }
    }
    /**
     * An XML Airline(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$Airline.
     */
    public static class AirlineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline
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
     * An XML TripSearch(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$TripSearch.
     */
    public static class TripSearchImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch
    {
        
        public TripSearchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TripSearchImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML AL_DepartureAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$ALDepartureAirport.
     */
    public static class ALDepartureAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport
    {
        
        public ALDepartureAirportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ALDepartureAirportImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
     * An XML DL_DepartureAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$DLDepartureAirport.
     */
    public static class DLDepartureAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport
    {
        
        public DLDepartureAirportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected DLDepartureAirportImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
     * An XML DL_ArrivalAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$DLArrivalAirport.
     */
    public static class DLArrivalAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport
    {
        
        public DLArrivalAirportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected DLArrivalAirportImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
     * An XML OperationalStatus(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$OperationalStatus.
     */
    public static class OperationalStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus
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
        public org.apache.xmlbeans.XmlString xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECONTEXT$0);
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
        public void xsetCodeContext(org.apache.xmlbeans.XmlString codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODECONTEXT$0);
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
     * An XML AircraftInfo(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is a complex type.
     */
    public static class AircraftInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo
    {
        
        public AircraftInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AIRCRAFTTYPE$0 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "AircraftType");
        private static final javax.xml.namespace.QName AIRCRAFTSUBTYPE$2 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "AircraftSubType");
        private static final javax.xml.namespace.QName REGISTRATION$4 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1", "Registration");
        
        
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
        public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration xgetRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
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
                comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
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
        public void xsetRegistration(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration registration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration)get_store().add_element_user(REGISTRATION$4);
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
                comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration)get_store().add_element_user(REGISTRATION$4);
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
         * An XML Registration(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$AircraftInfo$Registration.
         */
        public static class RegistrationImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration
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
     * An XML FlightType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$FlightType.
     */
    public static class FlightTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType
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
     * An XML Priority(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$Priority.
     */
    public static class PriorityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority
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
    /**
     * An XML ResultOrder(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$ResultOrder.
     */
    public static class ResultOrderImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder
    {
        
        public ResultOrderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ResultOrderImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName ORDER$0 = 
            new javax.xml.namespace.QName("", "Order");
        
        
        /**
         * Gets the "Order" attribute
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order.Enum getOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$0);
                if (target == null)
                {
                    return null;
                }
                return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Order" attribute
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order xgetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order)get_store().find_attribute_user(ORDER$0);
                return target;
            }
        }
        
        /**
         * True if has "Order" attribute
         */
        public boolean isSetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORDER$0) != null;
            }
        }
        
        /**
         * Sets the "Order" attribute
         */
        public void setOrder(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order.Enum order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDER$0);
                }
                target.setEnumValue(order);
            }
        }
        
        /**
         * Sets (as xml) the "Order" attribute
         */
        public void xsetOrder(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order)get_store().find_attribute_user(ORDER$0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order)get_store().add_attribute_user(ORDER$0);
                }
                target.set(order);
            }
        }
        
        /**
         * Unsets the "Order" attribute
         */
        public void unsetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORDER$0);
            }
        }
        /**
         * An XML Order(@).
         *
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$ResultOrder$Order.
         */
        public static class OrderImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order
        {
            
            public OrderImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OrderImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
