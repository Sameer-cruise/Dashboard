/*
 * XML Type:  FilterDataType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas;


/**
 * An XML FilterDataType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
 *
 * This is a complex type.
 */
public interface FilterDataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FilterDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("filterdatatypef886type");
    
    /**
     * Gets array of all "Airline" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline[] getAirlineArray();
    
    /**
     * Gets ith "Airline" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline getAirlineArray(int i);
    
    /**
     * Returns number of "Airline" element
     */
    int sizeOfAirlineArray();
    
    /**
     * Sets array of all "Airline" element
     */
    void setAirlineArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline[] airlineArray);
    
    /**
     * Sets ith "Airline" element
     */
    void setAirlineArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline airline);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Airline" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline insertNewAirline(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Airline" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline addNewAirline();
    
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
     * Gets array of all "ArrivalAirport" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport[] getArrivalAirportArray();
    
    /**
     * Gets ith "ArrivalAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport getArrivalAirportArray(int i);
    
    /**
     * Returns number of "ArrivalAirport" element
     */
    int sizeOfArrivalAirportArray();
    
    /**
     * Sets array of all "ArrivalAirport" element
     */
    void setArrivalAirportArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport[] arrivalAirportArray);
    
    /**
     * Sets ith "ArrivalAirport" element
     */
    void setArrivalAirportArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport arrivalAirport);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrivalAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport insertNewArrivalAirport(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrivalAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport addNewArrivalAirport();
    
    /**
     * Removes the ith "ArrivalAirport" element
     */
    void removeArrivalAirport(int i);
    
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
     * Gets the "ArrivalEndDate" element
     */
    java.util.Calendar getArrivalEndDate();
    
    /**
     * Gets (as xml) the "ArrivalEndDate" element
     */
    org.apache.xmlbeans.XmlDate xgetArrivalEndDate();
    
    /**
     * True if has "ArrivalEndDate" element
     */
    boolean isSetArrivalEndDate();
    
    /**
     * Sets the "ArrivalEndDate" element
     */
    void setArrivalEndDate(java.util.Calendar arrivalEndDate);
    
    /**
     * Sets (as xml) the "ArrivalEndDate" element
     */
    void xsetArrivalEndDate(org.apache.xmlbeans.XmlDate arrivalEndDate);
    
    /**
     * Unsets the "ArrivalEndDate" element
     */
    void unsetArrivalEndDate();
    
    /**
     * Gets array of all "OperationalStatus" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus[] getOperationalStatusArray();
    
    /**
     * Gets ith "OperationalStatus" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus getOperationalStatusArray(int i);
    
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
    void setOperationalStatusArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus[] operationalStatusArray);
    
    /**
     * Sets ith "OperationalStatus" element
     */
    void setOperationalStatusArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus operationalStatus);
    
    /**
     * Nils the ith "OperationalStatus" element
     */
    void setNilOperationalStatusArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OperationalStatus" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus insertNewOperationalStatus(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OperationalStatus" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus addNewOperationalStatus();
    
    /**
     * Removes the ith "OperationalStatus" element
     */
    void removeOperationalStatus(int i);
    
    /**
     * Gets array of all "AircraftInfo" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo[] getAircraftInfoArray();
    
    /**
     * Gets ith "AircraftInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo getAircraftInfoArray(int i);
    
    /**
     * Returns number of "AircraftInfo" element
     */
    int sizeOfAircraftInfoArray();
    
    /**
     * Sets array of all "AircraftInfo" element
     */
    void setAircraftInfoArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo[] aircraftInfoArray);
    
    /**
     * Sets ith "AircraftInfo" element
     */
    void setAircraftInfoArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo aircraftInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AircraftInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo insertNewAircraftInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AircraftInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo addNewAircraftInfo();
    
    /**
     * Removes the ith "AircraftInfo" element
     */
    void removeAircraftInfo(int i);
    
    /**
     * Gets array of all "FlightType" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum[] getFlightTypeArray();
    
    /**
     * Gets ith "FlightType" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum getFlightTypeArray(int i);
    
    /**
     * Gets (as xml) array of all "FlightType" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType[] xgetFlightTypeArray();
    
    /**
     * Gets (as xml) ith "FlightType" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType xgetFlightTypeArray(int i);
    
    /**
     * Returns number of "FlightType" element
     */
    int sizeOfFlightTypeArray();
    
    /**
     * Sets array of all "FlightType" element
     */
    void setFlightTypeArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum[] flightTypeArray);
    
    /**
     * Sets ith "FlightType" element
     */
    void setFlightTypeArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum flightType);
    
    /**
     * Sets (as xml) array of all "FlightType" element
     */
    void xsetFlightTypeArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType[] flightTypeArray);
    
    /**
     * Sets (as xml) ith "FlightType" element
     */
    void xsetFlightTypeArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType flightType);
    
    /**
     * Inserts the value as the ith "FlightType" element
     */
    void insertFlightType(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum flightType);
    
    /**
     * Appends the value as the last "FlightType" element
     */
    void addFlightType(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType.Enum flightType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FlightType" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType insertNewFlightType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FlightType" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType addNewFlightType();
    
    /**
     * Removes the ith "FlightType" element
     */
    void removeFlightType(int i);
    
    /**
     * Gets array of all "Priority" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum[] getPriorityArray();
    
    /**
     * Gets ith "Priority" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum getPriorityArray(int i);
    
    /**
     * Gets (as xml) array of all "Priority" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority[] xgetPriorityArray();
    
    /**
     * Gets (as xml) ith "Priority" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority xgetPriorityArray(int i);
    
    /**
     * Returns number of "Priority" element
     */
    int sizeOfPriorityArray();
    
    /**
     * Sets array of all "Priority" element
     */
    void setPriorityArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum[] priorityArray);
    
    /**
     * Sets ith "Priority" element
     */
    void setPriorityArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum priority);
    
    /**
     * Sets (as xml) array of all "Priority" element
     */
    void xsetPriorityArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority[] priorityArray);
    
    /**
     * Sets (as xml) ith "Priority" element
     */
    void xsetPriorityArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority priority);
    
    /**
     * Inserts the value as the ith "Priority" element
     */
    void insertPriority(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum priority);
    
    /**
     * Appends the value as the last "Priority" element
     */
    void addPriority(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority.Enum priority);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Priority" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority insertNewPriority(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Priority" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority addNewPriority();
    
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
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder getResultOrder();
    
    /**
     * True if has "ResultOrder" element
     */
    boolean isSetResultOrder();
    
    /**
     * Sets the "ResultOrder" element
     */
    void setResultOrder(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder resultOrder);
    
    /**
     * Appends and returns a new empty "ResultOrder" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder addNewResultOrder();
    
    /**
     * Unsets the "ResultOrder" element
     */
    void unsetResultOrder();
    
    /**
     * An XML Airline(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$Airline.
     */
    public interface Airline extends org.iata.iata.x2007.x00.AirlineType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Airline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airlinea910elemtype");
        
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ArrivalAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$ArrivalAirport.
     */
    public interface ArrivalAirport extends org.iata.iata.x2007.x00.StationType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrivalAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("arrivalairport11d4elemtype");
        
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML OperationalStatus(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$OperationalStatus.
     */
    public interface OperationalStatus extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationalStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("operationalstatus6d36elemtype");
        
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.OperationalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML AircraftInfo(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is a complex type.
     */
    public interface AircraftInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AircraftInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("aircraftinfo3626elemtype");
        
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
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration xgetRegistration();
        
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
        void xsetRegistration(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration registration);
        
        /**
         * Nils the "Registration" element
         */
        void setNilRegistration();
        
        /**
         * Unsets the "Registration" element
         */
        void unsetRegistration();
        
        /**
         * An XML Registration(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$AircraftInfo$Registration.
         */
        public interface Registration extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Registration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("registration1811elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration newValue(java.lang.Object obj) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration) type.newValue( obj ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration newInstance() {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo.Registration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.AircraftInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML FlightType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$FlightType.
     */
    public interface FlightType extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flighttype070celemtype");
        
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
         * Enumeration value class for comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$FlightType.
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType newValue(java.lang.Object obj) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType) type.newValue( obj ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Priority(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$Priority.
     */
    public interface Priority extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Priority.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("priority46e6elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CURRENT = Enum.forString("Current");
        static final Enum ALL = Enum.forString("All");
        
        static final int INT_CURRENT = Enum.INT_CURRENT;
        static final int INT_ALL = Enum.INT_ALL;
        
        /**
         * Enumeration value class for comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$Priority.
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
            static final int INT_ALL = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Current", INT_CURRENT),
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority newValue(java.lang.Object obj) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority) type.newValue( obj ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.Priority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ResultOrder(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$ResultOrder.
     */
    public interface ResultOrder extends comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultOrder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("resultorder8603elemtype");
        
        /**
         * Gets the "Order" attribute
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order.Enum getOrder();
        
        /**
         * Gets (as xml) the "Order" attribute
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order xgetOrder();
        
        /**
         * True if has "Order" attribute
         */
        boolean isSetOrder();
        
        /**
         * Sets the "Order" attribute
         */
        void setOrder(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order.Enum order);
        
        /**
         * Sets (as xml) the "Order" attribute
         */
        void xsetOrder(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order order);
        
        /**
         * Unsets the "Order" attribute
         */
        void unsetOrder();
        
        /**
         * An XML Order(@).
         *
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$ResultOrder$Order.
         */
        public interface Order extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Order.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("order8019attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum ASC = Enum.forString("ASC");
            static final Enum DESC = Enum.forString("DESC");
            
            static final int INT_ASC = Enum.INT_ASC;
            static final int INT_DESC = Enum.INT_DESC;
            
            /**
             * Enumeration value class for comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType$ResultOrder$Order.
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
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order newValue(java.lang.Object obj) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order) type.newValue( obj ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order newInstance() {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType.ResultOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType newInstance() {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
