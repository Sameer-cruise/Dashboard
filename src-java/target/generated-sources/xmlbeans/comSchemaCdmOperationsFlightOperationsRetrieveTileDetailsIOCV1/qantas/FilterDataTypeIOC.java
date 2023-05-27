/*
 * XML Type:  FilterDataTypeIOC
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas;


/**
 * An XML FilterDataTypeIOC(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
 *
 * This is a complex type.
 */
public interface FilterDataTypeIOC extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FilterDataTypeIOC.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("filterdatatypeioca230type");
    
    /**
     * Gets array of all "Airline" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline[] getAirlineArray();
    
    /**
     * Gets ith "Airline" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline getAirlineArray(int i);
    
    /**
     * Returns number of "Airline" element
     */
    int sizeOfAirlineArray();
    
    /**
     * Sets array of all "Airline" element
     */
    void setAirlineArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline[] airlineArray);
    
    /**
     * Sets ith "Airline" element
     */
    void setAirlineArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline airline);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Airline" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline insertNewAirline(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Airline" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline addNewAirline();
    
    /**
     * Removes the ith "Airline" element
     */
    void removeAirline(int i);
    
    /**
     * Gets array of all "FlightNumber" elements
     */
    java.lang.String[] getFlightNumberArray();
    
    /**
     * Gets ith "FlightNumber" element
     */
    java.lang.String getFlightNumberArray(int i);
    
    /**
     * Gets (as xml) array of all "FlightNumber" elements
     */
    org.iata.iata.x2007.x00.NumericStringLength1To4[] xgetFlightNumberArray();
    
    /**
     * Gets (as xml) ith "FlightNumber" element
     */
    org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumberArray(int i);
    
    /**
     * Returns number of "FlightNumber" element
     */
    int sizeOfFlightNumberArray();
    
    /**
     * Sets array of all "FlightNumber" element
     */
    void setFlightNumberArray(java.lang.String[] flightNumberArray);
    
    /**
     * Sets ith "FlightNumber" element
     */
    void setFlightNumberArray(int i, java.lang.String flightNumber);
    
    /**
     * Sets (as xml) array of all "FlightNumber" element
     */
    void xsetFlightNumberArray(org.iata.iata.x2007.x00.NumericStringLength1To4[] flightNumberArray);
    
    /**
     * Sets (as xml) ith "FlightNumber" element
     */
    void xsetFlightNumberArray(int i, org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber);
    
    /**
     * Inserts the value as the ith "FlightNumber" element
     */
    void insertFlightNumber(int i, java.lang.String flightNumber);
    
    /**
     * Appends the value as the last "FlightNumber" element
     */
    void addFlightNumber(java.lang.String flightNumber);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FlightNumber" element
     */
    org.iata.iata.x2007.x00.NumericStringLength1To4 insertNewFlightNumber(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FlightNumber" element
     */
    org.iata.iata.x2007.x00.NumericStringLength1To4 addNewFlightNumber();
    
    /**
     * Removes the ith "FlightNumber" element
     */
    void removeFlightNumber(int i);
    
    /**
     * Gets the "TripSearch" element
     */
    java.lang.String getTripSearch();
    
    /**
     * Gets (as xml) the "TripSearch" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch xgetTripSearch();
    
    /**
     * Tests for nil "TripSearch" element
     */
    boolean isNilTripSearch();
    
    /**
     * True if has "TripSearch" element
     */
    boolean isSetTripSearch();
    
    /**
     * Sets the "TripSearch" element
     */
    void setTripSearch(java.lang.String tripSearch);
    
    /**
     * Sets (as xml) the "TripSearch" element
     */
    void xsetTripSearch(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch tripSearch);
    
    /**
     * Nils the "TripSearch" element
     */
    void setNilTripSearch();
    
    /**
     * Unsets the "TripSearch" element
     */
    void unsetTripSearch();
    
    /**
     * Gets array of all "AL_DepartureAirport" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport[] getALDepartureAirportArray();
    
    /**
     * Gets ith "AL_DepartureAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport getALDepartureAirportArray(int i);
    
    /**
     * Returns number of "AL_DepartureAirport" element
     */
    int sizeOfALDepartureAirportArray();
    
    /**
     * Sets array of all "AL_DepartureAirport" element
     */
    void setALDepartureAirportArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport[] alDepartureAirportArray);
    
    /**
     * Sets ith "AL_DepartureAirport" element
     */
    void setALDepartureAirportArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport alDepartureAirport);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AL_DepartureAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport insertNewALDepartureAirport(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AL_DepartureAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport addNewALDepartureAirport();
    
    /**
     * Removes the ith "AL_DepartureAirport" element
     */
    void removeALDepartureAirport(int i);
    
    /**
     * Gets array of all "DL_DepartureAirport" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport[] getDLDepartureAirportArray();
    
    /**
     * Gets ith "DL_DepartureAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport getDLDepartureAirportArray(int i);
    
    /**
     * Returns number of "DL_DepartureAirport" element
     */
    int sizeOfDLDepartureAirportArray();
    
    /**
     * Sets array of all "DL_DepartureAirport" element
     */
    void setDLDepartureAirportArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport[] dlDepartureAirportArray);
    
    /**
     * Sets ith "DL_DepartureAirport" element
     */
    void setDLDepartureAirportArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport dlDepartureAirport);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DL_DepartureAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport insertNewDLDepartureAirport(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DL_DepartureAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport addNewDLDepartureAirport();
    
    /**
     * Removes the ith "DL_DepartureAirport" element
     */
    void removeDLDepartureAirport(int i);
    
    /**
     * Gets array of all "DL_ArrivalAirport" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport[] getDLArrivalAirportArray();
    
    /**
     * Gets ith "DL_ArrivalAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport getDLArrivalAirportArray(int i);
    
    /**
     * Returns number of "DL_ArrivalAirport" element
     */
    int sizeOfDLArrivalAirportArray();
    
    /**
     * Sets array of all "DL_ArrivalAirport" element
     */
    void setDLArrivalAirportArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport[] dlArrivalAirportArray);
    
    /**
     * Sets ith "DL_ArrivalAirport" element
     */
    void setDLArrivalAirportArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport dlArrivalAirport);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DL_ArrivalAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport insertNewDLArrivalAirport(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DL_ArrivalAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport addNewDLArrivalAirport();
    
    /**
     * Removes the ith "DL_ArrivalAirport" element
     */
    void removeDLArrivalAirport(int i);
    
    /**
     * Gets the "DepartureStartDate" element
     */
    java.util.Calendar getDepartureStartDate();
    
    /**
     * Gets (as xml) the "DepartureStartDate" element
     */
    org.apache.xmlbeans.XmlDate xgetDepartureStartDate();
    
    /**
     * True if has "DepartureStartDate" element
     */
    boolean isSetDepartureStartDate();
    
    /**
     * Sets the "DepartureStartDate" element
     */
    void setDepartureStartDate(java.util.Calendar departureStartDate);
    
    /**
     * Sets (as xml) the "DepartureStartDate" element
     */
    void xsetDepartureStartDate(org.apache.xmlbeans.XmlDate departureStartDate);
    
    /**
     * Unsets the "DepartureStartDate" element
     */
    void unsetDepartureStartDate();
    
    /**
     * Gets the "DepartureEndDate" element
     */
    java.util.Calendar getDepartureEndDate();
    
    /**
     * Gets (as xml) the "DepartureEndDate" element
     */
    org.apache.xmlbeans.XmlDate xgetDepartureEndDate();
    
    /**
     * True if has "DepartureEndDate" element
     */
    boolean isSetDepartureEndDate();
    
    /**
     * Sets the "DepartureEndDate" element
     */
    void setDepartureEndDate(java.util.Calendar departureEndDate);
    
    /**
     * Sets (as xml) the "DepartureEndDate" element
     */
    void xsetDepartureEndDate(org.apache.xmlbeans.XmlDate departureEndDate);
    
    /**
     * Unsets the "DepartureEndDate" element
     */
    void unsetDepartureEndDate();
    
    /**
     * Gets the "DL_DepartureDate" element
     */
    java.util.Calendar getDLDepartureDate();
    
    /**
     * Gets (as xml) the "DL_DepartureDate" element
     */
    org.apache.xmlbeans.XmlDate xgetDLDepartureDate();
    
    /**
     * True if has "DL_DepartureDate" element
     */
    boolean isSetDLDepartureDate();
    
    /**
     * Sets the "DL_DepartureDate" element
     */
    void setDLDepartureDate(java.util.Calendar dlDepartureDate);
    
    /**
     * Sets (as xml) the "DL_DepartureDate" element
     */
    void xsetDLDepartureDate(org.apache.xmlbeans.XmlDate dlDepartureDate);
    
    /**
     * Unsets the "DL_DepartureDate" element
     */
    void unsetDLDepartureDate();
    
    /**
     * Gets the "OriginDateLocal" element
     */
    java.util.Calendar getOriginDateLocal();
    
    /**
     * Gets (as xml) the "OriginDateLocal" element
     */
    org.apache.xmlbeans.XmlDate xgetOriginDateLocal();
    
    /**
     * True if has "OriginDateLocal" element
     */
    boolean isSetOriginDateLocal();
    
    /**
     * Sets the "OriginDateLocal" element
     */
    void setOriginDateLocal(java.util.Calendar originDateLocal);
    
    /**
     * Sets (as xml) the "OriginDateLocal" element
     */
    void xsetOriginDateLocal(org.apache.xmlbeans.XmlDate originDateLocal);
    
    /**
     * Unsets the "OriginDateLocal" element
     */
    void unsetOriginDateLocal();
    
    /**
     * Gets array of all "OperationalStatus" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus[] getOperationalStatusArray();
    
    /**
     * Gets ith "OperationalStatus" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus getOperationalStatusArray(int i);
    
    /**
     * Tests for nil ith "OperationalStatus" element
     */
    boolean isNilOperationalStatusArray(int i);
    
    /**
     * Returns number of "OperationalStatus" element
     */
    int sizeOfOperationalStatusArray();
    
    /**
     * Sets array of all "OperationalStatus" element
     */
    void setOperationalStatusArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus[] operationalStatusArray);
    
    /**
     * Sets ith "OperationalStatus" element
     */
    void setOperationalStatusArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus operationalStatus);
    
    /**
     * Nils the ith "OperationalStatus" element
     */
    void setNilOperationalStatusArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OperationalStatus" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus insertNewOperationalStatus(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OperationalStatus" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus addNewOperationalStatus();
    
    /**
     * Removes the ith "OperationalStatus" element
     */
    void removeOperationalStatus(int i);
    
    /**
     * Gets array of all "IOCEventType" elements
     */
    java.lang.String[] getIOCEventTypeArray();
    
    /**
     * Gets ith "IOCEventType" element
     */
    java.lang.String getIOCEventTypeArray(int i);
    
    /**
     * Gets (as xml) array of all "IOCEventType" elements
     */
    org.apache.xmlbeans.XmlString[] xgetIOCEventTypeArray();
    
    /**
     * Gets (as xml) ith "IOCEventType" element
     */
    org.apache.xmlbeans.XmlString xgetIOCEventTypeArray(int i);
    
    /**
     * Returns number of "IOCEventType" element
     */
    int sizeOfIOCEventTypeArray();
    
    /**
     * Sets array of all "IOCEventType" element
     */
    void setIOCEventTypeArray(java.lang.String[] iocEventTypeArray);
    
    /**
     * Sets ith "IOCEventType" element
     */
    void setIOCEventTypeArray(int i, java.lang.String iocEventType);
    
    /**
     * Sets (as xml) array of all "IOCEventType" element
     */
    void xsetIOCEventTypeArray(org.apache.xmlbeans.XmlString[] iocEventTypeArray);
    
    /**
     * Sets (as xml) ith "IOCEventType" element
     */
    void xsetIOCEventTypeArray(int i, org.apache.xmlbeans.XmlString iocEventType);
    
    /**
     * Inserts the value as the ith "IOCEventType" element
     */
    void insertIOCEventType(int i, java.lang.String iocEventType);
    
    /**
     * Appends the value as the last "IOCEventType" element
     */
    void addIOCEventType(java.lang.String iocEventType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IOCEventType" element
     */
    org.apache.xmlbeans.XmlString insertNewIOCEventType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IOCEventType" element
     */
    org.apache.xmlbeans.XmlString addNewIOCEventType();
    
    /**
     * Removes the ith "IOCEventType" element
     */
    void removeIOCEventType(int i);
    
    /**
     * Gets the "RequestUser" element
     */
    java.lang.String getRequestUser();
    
    /**
     * Gets (as xml) the "RequestUser" element
     */
    org.apache.xmlbeans.XmlString xgetRequestUser();
    
    /**
     * True if has "RequestUser" element
     */
    boolean isSetRequestUser();
    
    /**
     * Sets the "RequestUser" element
     */
    void setRequestUser(java.lang.String requestUser);
    
    /**
     * Sets (as xml) the "RequestUser" element
     */
    void xsetRequestUser(org.apache.xmlbeans.XmlString requestUser);
    
    /**
     * Unsets the "RequestUser" element
     */
    void unsetRequestUser();
    
    /**
     * Gets array of all "AircraftInfo" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo[] getAircraftInfoArray();
    
    /**
     * Gets ith "AircraftInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo getAircraftInfoArray(int i);
    
    /**
     * Returns number of "AircraftInfo" element
     */
    int sizeOfAircraftInfoArray();
    
    /**
     * Sets array of all "AircraftInfo" element
     */
    void setAircraftInfoArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo[] aircraftInfoArray);
    
    /**
     * Sets ith "AircraftInfo" element
     */
    void setAircraftInfoArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo aircraftInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AircraftInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo insertNewAircraftInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AircraftInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo addNewAircraftInfo();
    
    /**
     * Removes the ith "AircraftInfo" element
     */
    void removeAircraftInfo(int i);
    
    /**
     * Gets array of all "FlightType" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum[] getFlightTypeArray();
    
    /**
     * Gets ith "FlightType" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum getFlightTypeArray(int i);
    
    /**
     * Gets (as xml) array of all "FlightType" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType[] xgetFlightTypeArray();
    
    /**
     * Gets (as xml) ith "FlightType" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType xgetFlightTypeArray(int i);
    
    /**
     * Returns number of "FlightType" element
     */
    int sizeOfFlightTypeArray();
    
    /**
     * Sets array of all "FlightType" element
     */
    void setFlightTypeArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum[] flightTypeArray);
    
    /**
     * Sets ith "FlightType" element
     */
    void setFlightTypeArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum flightType);
    
    /**
     * Sets (as xml) array of all "FlightType" element
     */
    void xsetFlightTypeArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType[] flightTypeArray);
    
    /**
     * Sets (as xml) ith "FlightType" element
     */
    void xsetFlightTypeArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType flightType);
    
    /**
     * Inserts the value as the ith "FlightType" element
     */
    void insertFlightType(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum flightType);
    
    /**
     * Appends the value as the last "FlightType" element
     */
    void addFlightType(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType.Enum flightType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FlightType" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType insertNewFlightType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FlightType" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType addNewFlightType();
    
    /**
     * Removes the ith "FlightType" element
     */
    void removeFlightType(int i);
    
    /**
     * Gets array of all "Priority" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum[] getPriorityArray();
    
    /**
     * Gets ith "Priority" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum getPriorityArray(int i);
    
    /**
     * Gets (as xml) array of all "Priority" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority[] xgetPriorityArray();
    
    /**
     * Gets (as xml) ith "Priority" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority xgetPriorityArray(int i);
    
    /**
     * Returns number of "Priority" element
     */
    int sizeOfPriorityArray();
    
    /**
     * Sets array of all "Priority" element
     */
    void setPriorityArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum[] priorityArray);
    
    /**
     * Sets ith "Priority" element
     */
    void setPriorityArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum priority);
    
    /**
     * Sets (as xml) array of all "Priority" element
     */
    void xsetPriorityArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority[] priorityArray);
    
    /**
     * Sets (as xml) ith "Priority" element
     */
    void xsetPriorityArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority priority);
    
    /**
     * Inserts the value as the ith "Priority" element
     */
    void insertPriority(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum priority);
    
    /**
     * Appends the value as the last "Priority" element
     */
    void addPriority(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority.Enum priority);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Priority" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority insertNewPriority(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Priority" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority addNewPriority();
    
    /**
     * Removes the ith "Priority" element
     */
    void removePriority(int i);
    
    /**
     * Gets the "RowLimit" element
     */
    java.math.BigInteger getRowLimit();
    
    /**
     * Gets (as xml) the "RowLimit" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetRowLimit();
    
    /**
     * True if has "RowLimit" element
     */
    boolean isSetRowLimit();
    
    /**
     * Sets the "RowLimit" element
     */
    void setRowLimit(java.math.BigInteger rowLimit);
    
    /**
     * Sets (as xml) the "RowLimit" element
     */
    void xsetRowLimit(org.apache.xmlbeans.XmlPositiveInteger rowLimit);
    
    /**
     * Unsets the "RowLimit" element
     */
    void unsetRowLimit();
    
    /**
     * Gets the "ResultOrder" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder getResultOrder();
    
    /**
     * True if has "ResultOrder" element
     */
    boolean isSetResultOrder();
    
    /**
     * Sets the "ResultOrder" element
     */
    void setResultOrder(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder resultOrder);
    
    /**
     * Appends and returns a new empty "ResultOrder" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder addNewResultOrder();
    
    /**
     * Unsets the "ResultOrder" element
     */
    void unsetResultOrder();
    
    /**
     * An XML Airline(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$Airline.
     */
    public interface Airline extends org.iata.iata.x2007.x00.AirlineType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Airline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airline28baelemtype");
        
        /**
         * Gets the "CodeContext" attribute
         */
        java.lang.String getCodeContext();
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
        
        /**
         * True if has "CodeContext" attribute
         */
        boolean isSetCodeContext();
        
        /**
         * Sets the "CodeContext" attribute
         */
        void setCodeContext(java.lang.String codeContext);
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
        
        /**
         * Unsets the "CodeContext" attribute
         */
        void unsetCodeContext();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML TripSearch(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$TripSearch.
     */
    public interface TripSearch extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TripSearch.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("tripsearch5a19elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch newValue(java.lang.Object obj) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch) type.newValue( obj ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.TripSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML AL_DepartureAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$ALDepartureAirport.
     */
    public interface ALDepartureAirport extends org.iata.iata.x2007.x00.StationType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ALDepartureAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("aldepartureairport9287elemtype");
        
        /**
         * Gets the "CodeContext" attribute
         */
        java.lang.String getCodeContext();
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
        
        /**
         * True if has "CodeContext" attribute
         */
        boolean isSetCodeContext();
        
        /**
         * Sets the "CodeContext" attribute
         */
        void setCodeContext(java.lang.String codeContext);
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
        
        /**
         * Unsets the "CodeContext" attribute
         */
        void unsetCodeContext();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ALDepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML DL_DepartureAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$DLDepartureAirport.
     */
    public interface DLDepartureAirport extends org.iata.iata.x2007.x00.StationType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DLDepartureAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("dldepartureairport60caelemtype");
        
        /**
         * Gets the "CodeContext" attribute
         */
        java.lang.String getCodeContext();
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
        
        /**
         * True if has "CodeContext" attribute
         */
        boolean isSetCodeContext();
        
        /**
         * Sets the "CodeContext" attribute
         */
        void setCodeContext(java.lang.String codeContext);
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
        
        /**
         * Unsets the "CodeContext" attribute
         */
        void unsetCodeContext();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLDepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML DL_ArrivalAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$DLArrivalAirport.
     */
    public interface DLArrivalAirport extends org.iata.iata.x2007.x00.StationType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DLArrivalAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("dlarrivalairport82e5elemtype");
        
        /**
         * Gets the "CodeContext" attribute
         */
        java.lang.String getCodeContext();
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
        
        /**
         * True if has "CodeContext" attribute
         */
        boolean isSetCodeContext();
        
        /**
         * Sets the "CodeContext" attribute
         */
        void setCodeContext(java.lang.String codeContext);
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
        
        /**
         * Unsets the "CodeContext" attribute
         */
        void unsetCodeContext();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.DLArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML OperationalStatus(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$OperationalStatus.
     */
    public interface OperationalStatus extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationalStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("operationalstatus66e0elemtype");
        
        /**
         * Gets the "CodeContext" attribute
         */
        java.lang.String getCodeContext();
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        org.apache.xmlbeans.XmlString xgetCodeContext();
        
        /**
         * True if has "CodeContext" attribute
         */
        boolean isSetCodeContext();
        
        /**
         * Sets the "CodeContext" attribute
         */
        void setCodeContext(java.lang.String codeContext);
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        void xsetCodeContext(org.apache.xmlbeans.XmlString codeContext);
        
        /**
         * Unsets the "CodeContext" attribute
         */
        void unsetCodeContext();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.OperationalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML AircraftInfo(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is a complex type.
     */
    public interface AircraftInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AircraftInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("aircraftinfo3fd0elemtype");
        
        /**
         * Gets the "AircraftType" element
         */
        java.lang.String getAircraftType();
        
        /**
         * Gets (as xml) the "AircraftType" element
         */
        org.iata.iata.x2007.x00.AirEquipType xgetAircraftType();
        
        /**
         * Tests for nil "AircraftType" element
         */
        boolean isNilAircraftType();
        
        /**
         * True if has "AircraftType" element
         */
        boolean isSetAircraftType();
        
        /**
         * Sets the "AircraftType" element
         */
        void setAircraftType(java.lang.String aircraftType);
        
        /**
         * Sets (as xml) the "AircraftType" element
         */
        void xsetAircraftType(org.iata.iata.x2007.x00.AirEquipType aircraftType);
        
        /**
         * Nils the "AircraftType" element
         */
        void setNilAircraftType();
        
        /**
         * Unsets the "AircraftType" element
         */
        void unsetAircraftType();
        
        /**
         * Gets the "AircraftSubType" element
         */
        java.lang.String getAircraftSubType();
        
        /**
         * Gets (as xml) the "AircraftSubType" element
         */
        org.iata.iata.x2007.x00.StringLength3 xgetAircraftSubType();
        
        /**
         * Tests for nil "AircraftSubType" element
         */
        boolean isNilAircraftSubType();
        
        /**
         * True if has "AircraftSubType" element
         */
        boolean isSetAircraftSubType();
        
        /**
         * Sets the "AircraftSubType" element
         */
        void setAircraftSubType(java.lang.String aircraftSubType);
        
        /**
         * Sets (as xml) the "AircraftSubType" element
         */
        void xsetAircraftSubType(org.iata.iata.x2007.x00.StringLength3 aircraftSubType);
        
        /**
         * Nils the "AircraftSubType" element
         */
        void setNilAircraftSubType();
        
        /**
         * Unsets the "AircraftSubType" element
         */
        void unsetAircraftSubType();
        
        /**
         * Gets the "Registration" element
         */
        java.lang.String getRegistration();
        
        /**
         * Gets (as xml) the "Registration" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration xgetRegistration();
        
        /**
         * Tests for nil "Registration" element
         */
        boolean isNilRegistration();
        
        /**
         * True if has "Registration" element
         */
        boolean isSetRegistration();
        
        /**
         * Sets the "Registration" element
         */
        void setRegistration(java.lang.String registration);
        
        /**
         * Sets (as xml) the "Registration" element
         */
        void xsetRegistration(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration registration);
        
        /**
         * Nils the "Registration" element
         */
        void setNilRegistration();
        
        /**
         * Unsets the "Registration" element
         */
        void unsetRegistration();
        
        /**
         * An XML Registration(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$AircraftInfo$Registration.
         */
        public interface Registration extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Registration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("registration06bbelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration newValue(java.lang.Object obj) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration) type.newValue( obj ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration newInstance() {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo.Registration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.AircraftInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML FlightType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$FlightType.
     */
    public interface FlightType extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flighttypecab6elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum INTERNATIONAL = Enum.forString("International");
        static final Enum DOMESTIC = Enum.forString("Domestic");
        static final Enum REGIONAL = Enum.forString("Regional");
        static final Enum HOSTED = Enum.forString("Hosted");
        
        static final int INT_INTERNATIONAL = Enum.INT_INTERNATIONAL;
        static final int INT_DOMESTIC = Enum.INT_DOMESTIC;
        static final int INT_REGIONAL = Enum.INT_REGIONAL;
        static final int INT_HOSTED = Enum.INT_HOSTED;
        
        /**
         * Enumeration value class for comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$FlightType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_INTERNATIONAL
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_INTERNATIONAL = 1;
            static final int INT_DOMESTIC = 2;
            static final int INT_REGIONAL = 3;
            static final int INT_HOSTED = 4;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("International", INT_INTERNATIONAL),
                    new Enum("Domestic", INT_DOMESTIC),
                    new Enum("Regional", INT_REGIONAL),
                    new Enum("Hosted", INT_HOSTED),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType newValue(java.lang.Object obj) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType) type.newValue( obj ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Priority(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$Priority.
     */
    public interface Priority extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Priority.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("priority9090elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CURRENT = Enum.forString("Current");
        static final Enum PTS = Enum.forString("PTS");
        static final Enum FLYING = Enum.forString("Flying");
        static final Enum GROUND = Enum.forString("Ground");
        static final Enum CANCEL = Enum.forString("Cancel");
        static final Enum ALL = Enum.forString("All");
        
        static final int INT_CURRENT = Enum.INT_CURRENT;
        static final int INT_PTS = Enum.INT_PTS;
        static final int INT_FLYING = Enum.INT_FLYING;
        static final int INT_GROUND = Enum.INT_GROUND;
        static final int INT_CANCEL = Enum.INT_CANCEL;
        static final int INT_ALL = Enum.INT_ALL;
        
        /**
         * Enumeration value class for comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$Priority.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_CURRENT
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_CURRENT = 1;
            static final int INT_PTS = 2;
            static final int INT_FLYING = 3;
            static final int INT_GROUND = 4;
            static final int INT_CANCEL = 5;
            static final int INT_ALL = 6;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Current", INT_CURRENT),
                    new Enum("PTS", INT_PTS),
                    new Enum("Flying", INT_FLYING),
                    new Enum("Ground", INT_GROUND),
                    new Enum("Cancel", INT_CANCEL),
                    new Enum("All", INT_ALL),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority newValue(java.lang.Object obj) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority) type.newValue( obj ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.Priority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ResultOrder(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$ResultOrder.
     */
    public interface ResultOrder extends comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.ArrivalDepartureType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultOrder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("resultorder62adelemtype");
        
        /**
         * Gets the "Order" attribute
         */
        comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order.Enum getOrder();
        
        /**
         * Gets (as xml) the "Order" attribute
         */
        comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order xgetOrder();
        
        /**
         * True if has "Order" attribute
         */
        boolean isSetOrder();
        
        /**
         * Sets the "Order" attribute
         */
        void setOrder(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order.Enum order);
        
        /**
         * Sets (as xml) the "Order" attribute
         */
        void xsetOrder(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order order);
        
        /**
         * Unsets the "Order" attribute
         */
        void unsetOrder();
        
        /**
         * An XML Order(@).
         *
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$ResultOrder$Order.
         */
        public interface Order extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Order.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("ordere6c3attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum ASC = Enum.forString("ASC");
            static final Enum DESC = Enum.forString("DESC");
            
            static final int INT_ASC = Enum.INT_ASC;
            static final int INT_DESC = Enum.INT_DESC;
            
            /**
             * Enumeration value class for comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC$ResultOrder$Order.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ASC
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_ASC = 1;
                static final int INT_DESC = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("ASC", INT_ASC),
                      new Enum("DESC", INT_DESC),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order newValue(java.lang.Object obj) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order) type.newValue( obj ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order newInstance() {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC.ResultOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC newInstance() {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
