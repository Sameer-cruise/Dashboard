/*
 * XML Type:  FilterDataType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.impl;
/**
 * An XML FilterDataType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
 *
 * This is a complex type.
 */
public class FilterDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType
{
    
    public FilterDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRLINE$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Airline");
    private static final javax.xml.namespace.QName FLIGHTNUMBER$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "FlightNumber");
    private static final javax.xml.namespace.QName ARRIVALAIRPORT$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "ArrivalAirport");
    private static final javax.xml.namespace.QName DEPARTURESTARTDATE$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "DepartureStartDate");
    private static final javax.xml.namespace.QName ARRIVALENDDATE$8 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "ArrivalEndDate");
    private static final javax.xml.namespace.QName OPERATIONALSTATUS$10 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "OperationalStatus");
    private static final javax.xml.namespace.QName AIRCRAFTINFO$12 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "AircraftInfo");
    private static final javax.xml.namespace.QName FLIGHTTYPE$14 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "FlightType");
    private static final javax.xml.namespace.QName PRIORITY$16 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Priority");
    private static final javax.xml.namespace.QName ROWLIMIT$18 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "RowLimit");
    private static final javax.xml.namespace.QName RESULTORDER$20 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "ResultOrder");
    
    
    /**
     * Gets array of all "Airline" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline[] getAirlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AIRLINE$0, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline[] result = new comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Airline" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline getAirlineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline)get_store().find_element_user(AIRLINE$0, i);
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
    public void setAirlineArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline[] airlineArray)
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
    public void setAirlineArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline airline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline)get_store().find_element_user(AIRLINE$0, i);
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
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline insertNewAirline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline)get_store().insert_element_user(AIRLINE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Airline" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline addNewAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline)get_store().add_element_user(AIRLINE$0);
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
     * Gets array of all "ArrivalAirport" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport[] getArrivalAirportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRIVALAIRPORT$4, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport[] result = new comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrivalAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport getArrivalAirportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ArrivalAirport" element
     */
    public int sizeOfArrivalAirportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRIVALAIRPORT$4);
        }
    }
    
    /**
     * Sets array of all "ArrivalAirport" element
     */
    public void setArrivalAirportArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport[] arrivalAirportArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arrivalAirportArray, ARRIVALAIRPORT$4);
        }
    }
    
    /**
     * Sets ith "ArrivalAirport" element
     */
    public void setArrivalAirportArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport arrivalAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrivalAirport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrivalAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport insertNewArrivalAirport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport)get_store().insert_element_user(ARRIVALAIRPORT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrivalAirport" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport addNewArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrivalAirport" element
     */
    public void removeArrivalAirport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRIVALAIRPORT$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTURESTARTDATE$6, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DEPARTURESTARTDATE$6, 0);
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
            return get_store().count_elements(DEPARTURESTARTDATE$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTURESTARTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPARTURESTARTDATE$6);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DEPARTURESTARTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DEPARTURESTARTDATE$6);
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
            get_store().remove_element(DEPARTURESTARTDATE$6, 0);
        }
    }
    
    /**
     * Gets the "ArrivalEndDate" element
     */
    public java.util.Calendar getArrivalEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALENDDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ArrivalEndDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetArrivalEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ARRIVALENDDATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ArrivalEndDate" element
     */
    public boolean isSetArrivalEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRIVALENDDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "ArrivalEndDate" element
     */
    public void setArrivalEndDate(java.util.Calendar arrivalEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALENDDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARRIVALENDDATE$8);
            }
            target.setCalendarValue(arrivalEndDate);
        }
    }
    
    /**
     * Sets (as xml) the "ArrivalEndDate" element
     */
    public void xsetArrivalEndDate(org.apache.xmlbeans.XmlDate arrivalEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ARRIVALENDDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ARRIVALENDDATE$8);
            }
            target.set(arrivalEndDate);
        }
    }
    
    /**
     * Unsets the "ArrivalEndDate" element
     */
    public void unsetArrivalEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRIVALENDDATE$8, 0);
        }
    }
    
    /**
     * Gets array of all "OperationalStatus" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus[] getOperationalStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATIONALSTATUS$10, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus[] result = new comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OperationalStatus" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus getOperationalStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$10, i);
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
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$10, i);
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
            return get_store().count_elements(OPERATIONALSTATUS$10);
        }
    }
    
    /**
     * Sets array of all "OperationalStatus" element
     */
    public void setOperationalStatusArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus[] operationalStatusArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operationalStatusArray, OPERATIONALSTATUS$10);
        }
    }
    
    /**
     * Sets ith "OperationalStatus" element
     */
    public void setOperationalStatusArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus operationalStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$10, i);
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
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$10, i);
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
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus insertNewOperationalStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus)get_store().insert_element_user(OPERATIONALSTATUS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OperationalStatus" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus addNewOperationalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus)get_store().add_element_user(OPERATIONALSTATUS$10);
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
            get_store().remove_element(OPERATIONALSTATUS$10, i);
        }
    }
    
    /**
     * Gets array of all "AircraftInfo" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo[] getAircraftInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AIRCRAFTINFO$12, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo[] result = new comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AircraftInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo getAircraftInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo)get_store().find_element_user(AIRCRAFTINFO$12, i);
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
            return get_store().count_elements(AIRCRAFTINFO$12);
        }
    }
    
    /**
     * Sets array of all "AircraftInfo" element
     */
    public void setAircraftInfoArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo[] aircraftInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(aircraftInfoArray, AIRCRAFTINFO$12);
        }
    }
    
    /**
     * Sets ith "AircraftInfo" element
     */
    public void setAircraftInfoArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo aircraftInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo)get_store().find_element_user(AIRCRAFTINFO$12, i);
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
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo insertNewAircraftInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo)get_store().insert_element_user(AIRCRAFTINFO$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AircraftInfo" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo addNewAircraftInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo)get_store().add_element_user(AIRCRAFTINFO$12);
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
            get_store().remove_element(AIRCRAFTINFO$12, i);
        }
    }
    
    /**
     * Gets array of all "FlightType" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum[] getFlightTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLIGHTTYPE$14, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum[] result = new comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "FlightType" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum getFlightTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTTYPE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "FlightType" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType[] xgetFlightTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLIGHTTYPE$14, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType[] result = new comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "FlightType" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType xgetFlightTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType)get_store().find_element_user(FLIGHTTYPE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType)target;
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
            return get_store().count_elements(FLIGHTTYPE$14);
        }
    }
    
    /**
     * Sets array of all "FlightType" element
     */
    public void setFlightTypeArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum[] flightTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flightTypeArray, FLIGHTTYPE$14);
        }
    }
    
    /**
     * Sets ith "FlightType" element
     */
    public void setFlightTypeArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum flightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTTYPE$14, i);
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
    public void xsetFlightTypeArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType[]flightTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flightTypeArray, FLIGHTTYPE$14);
        }
    }
    
    /**
     * Sets (as xml) ith "FlightType" element
     */
    public void xsetFlightTypeArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType flightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType)get_store().find_element_user(FLIGHTTYPE$14, i);
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
    public void insertFlightType(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum flightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FLIGHTTYPE$14, i);
            target.setEnumValue(flightType);
        }
    }
    
    /**
     * Appends the value as the last "FlightType" element
     */
    public void addFlightType(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum flightType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTTYPE$14);
            target.setEnumValue(flightType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FlightType" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType insertNewFlightType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType)get_store().insert_element_user(FLIGHTTYPE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FlightType" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType addNewFlightType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType)get_store().add_element_user(FLIGHTTYPE$14);
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
            get_store().remove_element(FLIGHTTYPE$14, i);
        }
    }
    
    /**
     * Gets array of all "Priority" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum[] getPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIORITY$16, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum[] result = new comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Priority" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum getPriorityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Priority" elements
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority[] xgetPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIORITY$16, targetList);
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority[] result = new comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Priority" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority xgetPriorityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority)get_store().find_element_user(PRIORITY$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority)target;
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
            return get_store().count_elements(PRIORITY$16);
        }
    }
    
    /**
     * Sets array of all "Priority" element
     */
    public void setPriorityArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum[] priorityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(priorityArray, PRIORITY$16);
        }
    }
    
    /**
     * Sets ith "Priority" element
     */
    public void setPriorityArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$16, i);
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
    public void xsetPriorityArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority[]priorityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(priorityArray, PRIORITY$16);
        }
    }
    
    /**
     * Sets (as xml) ith "Priority" element
     */
    public void xsetPriorityArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority)get_store().find_element_user(PRIORITY$16, i);
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
    public void insertPriority(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PRIORITY$16, i);
            target.setEnumValue(priority);
        }
    }
    
    /**
     * Appends the value as the last "Priority" element
     */
    public void addPriority(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$16);
            target.setEnumValue(priority);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Priority" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority insertNewPriority(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority)get_store().insert_element_user(PRIORITY$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Priority" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority addNewPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority)get_store().add_element_user(PRIORITY$16);
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
            get_store().remove_element(PRIORITY$16, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWLIMIT$18, 0);
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
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROWLIMIT$18, 0);
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
            return get_store().count_elements(ROWLIMIT$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWLIMIT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWLIMIT$18);
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
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROWLIMIT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(ROWLIMIT$18);
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
            get_store().remove_element(ROWLIMIT$18, 0);
        }
    }
    
    /**
     * Gets the "ResultOrder" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder getResultOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder)get_store().find_element_user(RESULTORDER$20, 0);
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
            return get_store().count_elements(RESULTORDER$20) != 0;
        }
    }
    
    /**
     * Sets the "ResultOrder" element
     */
    public void setResultOrder(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder resultOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder)get_store().find_element_user(RESULTORDER$20, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder)get_store().add_element_user(RESULTORDER$20);
            }
            target.set(resultOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "ResultOrder" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder addNewResultOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder)get_store().add_element_user(RESULTORDER$20);
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
            get_store().remove_element(RESULTORDER$20, 0);
        }
    }
    /**
     * An XML Airline(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$Airline.
     */
    public static class AirlineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline
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
     * An XML ArrivalAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$ArrivalAirport.
     */
    public static class ArrivalAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport
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
     * An XML OperationalStatus(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$OperationalStatus.
     */
    public static class OperationalStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus
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
     * An XML AircraftInfo(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is a complex type.
     */
    public static class AircraftInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo
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
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration xgetRegistration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
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
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
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
        public void xsetRegistration(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration registration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration)get_store().add_element_user(REGISTRATION$4);
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
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration)get_store().add_element_user(REGISTRATION$4);
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
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$AircraftInfo$Registration.
         */
        public static class RegistrationImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration
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
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$FlightType.
     */
    public static class FlightTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType
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
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$Priority.
     */
    public static class PriorityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority
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
     * An XML ResultOrder(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$ResultOrder.
     */
    public static class ResultOrderImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder
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
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order.Enum getOrder()
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
                return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Order" attribute
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order xgetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order)get_store().find_attribute_user(ORDER$0);
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
        public void setOrder(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order.Enum order)
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
        public void xsetOrder(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order)get_store().find_attribute_user(ORDER$0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order)get_store().add_attribute_user(ORDER$0);
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
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$ResultOrder$Order.
         */
        public static class OrderImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order
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
