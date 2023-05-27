/*
 * XML Type:  FilterDataType1
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas;


/**
 * An XML FilterDataType1(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
 *
 * This is a complex type.
 */
public interface FilterDataType1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FilterDataType1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("filterdatatype1959ftype");
    
    /**
     * Gets the "Airline" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline getAirline();
    
    /**
     * True if has "Airline" element
     */
    boolean isSetAirline();
    
    /**
     * Sets the "Airline" element
     */
    void setAirline(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline airline);
    
    /**
     * Appends and returns a new empty "Airline" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline addNewAirline();
    
    /**
     * Unsets the "Airline" element
     */
    void unsetAirline();
    
    /**
     * Gets the "Aircraft_Owner" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner getAircraftOwner();
    
    /**
     * True if has "Aircraft_Owner" element
     */
    boolean isSetAircraftOwner();
    
    /**
     * Sets the "Aircraft_Owner" element
     */
    void setAircraftOwner(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner aircraftOwner);
    
    /**
     * Appends and returns a new empty "Aircraft_Owner" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner addNewAircraftOwner();
    
    /**
     * Unsets the "Aircraft_Owner" element
     */
    void unsetAircraftOwner();
    
    /**
     * Gets the "FlightNumber" element
     */
    java.lang.String getFlightNumber();
    
    /**
     * Gets (as xml) the "FlightNumber" element
     */
    org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumber();
    
    /**
     * True if has "FlightNumber" element
     */
    boolean isSetFlightNumber();
    
    /**
     * Sets the "FlightNumber" element
     */
    void setFlightNumber(java.lang.String flightNumber);
    
    /**
     * Sets (as xml) the "FlightNumber" element
     */
    void xsetFlightNumber(org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber);
    
    /**
     * Unsets the "FlightNumber" element
     */
    void unsetFlightNumber();
    
    /**
     * Gets the "OriginDate" element
     */
    java.util.Calendar getOriginDate();
    
    /**
     * Gets (as xml) the "OriginDate" element
     */
    org.apache.xmlbeans.XmlDate xgetOriginDate();
    
    /**
     * True if has "OriginDate" element
     */
    boolean isSetOriginDate();
    
    /**
     * Sets the "OriginDate" element
     */
    void setOriginDate(java.util.Calendar originDate);
    
    /**
     * Sets (as xml) the "OriginDate" element
     */
    void xsetOriginDate(org.apache.xmlbeans.XmlDate originDate);
    
    /**
     * Unsets the "OriginDate" element
     */
    void unsetOriginDate();
    
    /**
     * Gets the "ArrivalAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport getArrivalAirport();
    
    /**
     * True if has "ArrivalAirport" element
     */
    boolean isSetArrivalAirport();
    
    /**
     * Sets the "ArrivalAirport" element
     */
    void setArrivalAirport(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport arrivalAirport);
    
    /**
     * Appends and returns a new empty "ArrivalAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport addNewArrivalAirport();
    
    /**
     * Unsets the "ArrivalAirport" element
     */
    void unsetArrivalAirport();
    
    /**
     * Gets the "DepartureAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport getDepartureAirport();
    
    /**
     * True if has "DepartureAirport" element
     */
    boolean isSetDepartureAirport();
    
    /**
     * Sets the "DepartureAirport" element
     */
    void setDepartureAirport(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport departureAirport);
    
    /**
     * Appends and returns a new empty "DepartureAirport" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport addNewDepartureAirport();
    
    /**
     * Unsets the "DepartureAirport" element
     */
    void unsetDepartureAirport();
    
    /**
     * Gets the "OperationalStatus" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus getOperationalStatus();
    
    /**
     * Tests for nil "OperationalStatus" element
     */
    boolean isNilOperationalStatus();
    
    /**
     * True if has "OperationalStatus" element
     */
    boolean isSetOperationalStatus();
    
    /**
     * Sets the "OperationalStatus" element
     */
    void setOperationalStatus(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus operationalStatus);
    
    /**
     * Appends and returns a new empty "OperationalStatus" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus addNewOperationalStatus();
    
    /**
     * Nils the "OperationalStatus" element
     */
    void setNilOperationalStatus();
    
    /**
     * Unsets the "OperationalStatus" element
     */
    void unsetOperationalStatus();
    
    /**
     * Gets the "AircraftInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo getAircraftInfo();
    
    /**
     * True if has "AircraftInfo" element
     */
    boolean isSetAircraftInfo();
    
    /**
     * Sets the "AircraftInfo" element
     */
    void setAircraftInfo(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo aircraftInfo);
    
    /**
     * Appends and returns a new empty "AircraftInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo addNewAircraftInfo();
    
    /**
     * Unsets the "AircraftInfo" element
     */
    void unsetAircraftInfo();
    
    /**
     * Gets the "Sect_Tiebreak" element
     */
    java.lang.String getSectTiebreak();
    
    /**
     * Gets (as xml) the "Sect_Tiebreak" element
     */
    org.iata.iata.x2007.x00.NumericStringLength1To4 xgetSectTiebreak();
    
    /**
     * True if has "Sect_Tiebreak" element
     */
    boolean isSetSectTiebreak();
    
    /**
     * Sets the "Sect_Tiebreak" element
     */
    void setSectTiebreak(java.lang.String sectTiebreak);
    
    /**
     * Sets (as xml) the "Sect_Tiebreak" element
     */
    void xsetSectTiebreak(org.iata.iata.x2007.x00.NumericStringLength1To4 sectTiebreak);
    
    /**
     * Unsets the "Sect_Tiebreak" element
     */
    void unsetSectTiebreak();
    
    /**
     * Gets the "FlightType" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType.Enum getFlightType();
    
    /**
     * Gets (as xml) the "FlightType" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType xgetFlightType();
    
    /**
     * True if has "FlightType" element
     */
    boolean isSetFlightType();
    
    /**
     * Sets the "FlightType" element
     */
    void setFlightType(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType.Enum flightType);
    
    /**
     * Sets (as xml) the "FlightType" element
     */
    void xsetFlightType(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType flightType);
    
    /**
     * Unsets the "FlightType" element
     */
    void unsetFlightType();
    
    /**
     * Gets the "Priority" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority.Enum getPriority();
    
    /**
     * Gets (as xml) the "Priority" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority xgetPriority();
    
    /**
     * True if has "Priority" element
     */
    boolean isSetPriority();
    
    /**
     * Sets the "Priority" element
     */
    void setPriority(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority.Enum priority);
    
    /**
     * Sets (as xml) the "Priority" element
     */
    void xsetPriority(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority priority);
    
    /**
     * Unsets the "Priority" element
     */
    void unsetPriority();
    
    /**
     * An XML Airline(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$Airline.
     */
    public interface Airline extends org.iata.iata.x2007.x00.AirlineType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Airline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airlinef655elemtype");
        
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Aircraft_Owner(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$AircraftOwner.
     */
    public interface AircraftOwner extends org.iata.iata.x2007.x00.AirlineType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AircraftOwner.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("aircraftowner6b79elemtype");
        
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftOwner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ArrivalAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$ArrivalAirport.
     */
    public interface ArrivalAirport extends org.iata.iata.x2007.x00.StationType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrivalAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("arrivalairporta611elemtype");
        
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML DepartureAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$DepartureAirport.
     */
    public interface DepartureAirport extends org.iata.iata.x2007.x00.StationType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DepartureAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("departureairportaa0celemtype");
        
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML OperationalStatus(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$OperationalStatus.
     */
    public interface OperationalStatus extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationalStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("operationalstatusb6efelemtype");
        
        /**
         * Gets the "CodeContext" attribute
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext.Enum getCodeContext();
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext xgetCodeContext();
        
        /**
         * True if has "CodeContext" attribute
         */
        boolean isSetCodeContext();
        
        /**
         * Sets the "CodeContext" attribute
         */
        void setCodeContext(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext.Enum codeContext);
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        void xsetCodeContext(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext codeContext);
        
        /**
         * Unsets the "CodeContext" attribute
         */
        void unsetCodeContext();
        
        /**
         * An XML CodeContext(@).
         *
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$OperationalStatus$CodeContext.
         */
        public interface CodeContext extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodeContext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("codecontext7fe5attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum FLIGHT = Enum.forString("Flight");
            static final Enum DEPARTED_ARRIVED = Enum.forString("DepartedArrived");
            static final Enum ENGINEERING = Enum.forString("Engineering");
            
            static final int INT_FLIGHT = Enum.INT_FLIGHT;
            static final int INT_DEPARTED_ARRIVED = Enum.INT_DEPARTED_ARRIVED;
            static final int INT_ENGINEERING = Enum.INT_ENGINEERING;
            
            /**
             * Enumeration value class for comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$OperationalStatus$CodeContext.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_FLIGHT
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
                
                static final int INT_FLIGHT = 1;
                static final int INT_DEPARTED_ARRIVED = 2;
                static final int INT_ENGINEERING = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("Flight", INT_FLIGHT),
                      new Enum("DepartedArrived", INT_DEPARTED_ARRIVED),
                      new Enum("Engineering", INT_ENGINEERING),
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
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext newValue(java.lang.Object obj) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext) type.newValue( obj ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext newInstance() {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus.CodeContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.OperationalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AircraftInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("aircraftinfo0bffelemtype");
        
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
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration xgetRegistration();
        
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
        void xsetRegistration(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration registration);
        
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
         * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$AircraftInfo$Registration.
         */
        public interface Registration extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Registration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("registration6774elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration newValue(java.lang.Object obj) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration) type.newValue( obj ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration newInstance() {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo.Registration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.AircraftInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML FlightType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$FlightType.
     */
    public interface FlightType extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flighttype57d9elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum I = Enum.forString("I");
        static final Enum D = Enum.forString("D");
        static final Enum R = Enum.forString("R");
        static final Enum T = Enum.forString("T");
        
        static final int INT_I = Enum.INT_I;
        static final int INT_D = Enum.INT_D;
        static final int INT_R = Enum.INT_R;
        static final int INT_T = Enum.INT_T;
        
        /**
         * Enumeration value class for comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$FlightType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_I
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
            
            static final int INT_I = 1;
            static final int INT_D = 2;
            static final int INT_R = 3;
            static final int INT_T = 4;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("I", INT_I),
                    new Enum("D", INT_D),
                    new Enum("R", INT_R),
                    new Enum("T", INT_T),
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType newValue(java.lang.Object obj) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType) type.newValue( obj ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Priority(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$Priority.
     */
    public interface Priority extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Priority.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("priority133felemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CURRENT = Enum.forString("Current");
        static final Enum ALL = Enum.forString("All");
        
        static final int INT_CURRENT = Enum.INT_CURRENT;
        static final int INT_ALL = Enum.INT_ALL;
        
        /**
         * Enumeration value class for comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1$Priority.
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority newValue(java.lang.Object obj) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority) type.newValue( obj ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1.Priority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 newInstance() {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
