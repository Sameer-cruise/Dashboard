/*
 * XML Type:  BaseEventType
 * Namespace: urn:www.qantas.com:schema:cdm:common:Events:v1
 * Java type: comSchemaCdmCommonEventsV1.qantas.BaseEventType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmCommonEventsV1.qantas;


/**
 * An XML BaseEventType(@urn:www.qantas.com:schema:cdm:common:Events:v1).
 *
 * This is a complex type.
 */
public interface BaseEventType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaseEventType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("baseeventtype0b1btype");
    
    /**
     * Gets the "EventName" element
     */
    comSchemaCdmCommonEventsV1.qantas.EventNameType.Enum getEventName();
    
    /**
     * Gets (as xml) the "EventName" element
     */
    comSchemaCdmCommonEventsV1.qantas.EventNameType xgetEventName();
    
    /**
     * Sets the "EventName" element
     */
    void setEventName(comSchemaCdmCommonEventsV1.qantas.EventNameType.Enum eventName);
    
    /**
     * Sets (as xml) the "EventName" element
     */
    void xsetEventName(comSchemaCdmCommonEventsV1.qantas.EventNameType eventName);
    
    /**
     * Gets the "EventID" element
     */
    comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID getEventID();
    
    /**
     * Sets the "EventID" element
     */
    void setEventID(comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID eventID);
    
    /**
     * Appends and returns a new empty "EventID" element
     */
    comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID addNewEventID();
    
    /**
     * Gets the "ExternalID" element
     */
    comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID getExternalID();
    
    /**
     * Sets the "ExternalID" element
     */
    void setExternalID(comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID externalID);
    
    /**
     * Appends and returns a new empty "ExternalID" element
     */
    comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID addNewExternalID();
    
    /**
     * Gets the "EventTime" element
     */
    java.util.Calendar getEventTime();
    
    /**
     * Gets (as xml) the "EventTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEventTime();
    
    /**
     * Sets the "EventTime" element
     */
    void setEventTime(java.util.Calendar eventTime);
    
    /**
     * Sets (as xml) the "EventTime" element
     */
    void xsetEventTime(org.apache.xmlbeans.XmlDateTime eventTime);
    
    /**
     * An XML EventID(@urn:www.qantas.com:schema:cdm:common:Events:v1).
     *
     * This is a complex type.
     */
    public interface EventID extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("eventid6d7aelemtype");
        
        /**
         * Gets array of all "Airline" elements
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline[] getAirlineArray();
        
        /**
         * Gets ith "Airline" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline getAirlineArray(int i);
        
        /**
         * Returns number of "Airline" element
         */
        int sizeOfAirlineArray();
        
        /**
         * Sets array of all "Airline" element
         */
        void setAirlineArray(comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline[] airlineArray);
        
        /**
         * Sets ith "Airline" element
         */
        void setAirlineArray(int i, comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline airline);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Airline" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline insertNewAirline(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Airline" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline addNewAirline();
        
        /**
         * Removes the ith "Airline" element
         */
        void removeAirline(int i);
        
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
         * Gets the "Date" element
         */
        java.util.Calendar getDate();
        
        /**
         * Gets (as xml) the "Date" element
         */
        org.apache.xmlbeans.XmlDate xgetDate();
        
        /**
         * True if has "Date" element
         */
        boolean isSetDate();
        
        /**
         * Sets the "Date" element
         */
        void setDate(java.util.Calendar date);
        
        /**
         * Sets (as xml) the "Date" element
         */
        void xsetDate(org.apache.xmlbeans.XmlDate date);
        
        /**
         * Unsets the "Date" element
         */
        void unsetDate();
        
        /**
         * Gets array of all "ArrivalAirport" elements
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport[] getArrivalAirportArray();
        
        /**
         * Gets ith "ArrivalAirport" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport getArrivalAirportArray(int i);
        
        /**
         * Returns number of "ArrivalAirport" element
         */
        int sizeOfArrivalAirportArray();
        
        /**
         * Sets array of all "ArrivalAirport" element
         */
        void setArrivalAirportArray(comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport[] arrivalAirportArray);
        
        /**
         * Sets ith "ArrivalAirport" element
         */
        void setArrivalAirportArray(int i, comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport arrivalAirport);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ArrivalAirport" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport insertNewArrivalAirport(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ArrivalAirport" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport addNewArrivalAirport();
        
        /**
         * Removes the ith "ArrivalAirport" element
         */
        void removeArrivalAirport(int i);
        
        /**
         * Gets array of all "DepartureAirport" elements
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport[] getDepartureAirportArray();
        
        /**
         * Gets ith "DepartureAirport" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport getDepartureAirportArray(int i);
        
        /**
         * Returns number of "DepartureAirport" element
         */
        int sizeOfDepartureAirportArray();
        
        /**
         * Sets array of all "DepartureAirport" element
         */
        void setDepartureAirportArray(comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport[] departureAirportArray);
        
        /**
         * Sets ith "DepartureAirport" element
         */
        void setDepartureAirportArray(int i, comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport departureAirport);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DepartureAirport" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport insertNewDepartureAirport(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DepartureAirport" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport addNewDepartureAirport();
        
        /**
         * Removes the ith "DepartureAirport" element
         */
        void removeDepartureAirport(int i);
        
        /**
         * Gets the "ComercialSuffix" element
         */
        java.lang.String getComercialSuffix();
        
        /**
         * Gets (as xml) the "ComercialSuffix" element
         */
        org.apache.xmlbeans.XmlString xgetComercialSuffix();
        
        /**
         * True if has "ComercialSuffix" element
         */
        boolean isSetComercialSuffix();
        
        /**
         * Sets the "ComercialSuffix" element
         */
        void setComercialSuffix(java.lang.String comercialSuffix);
        
        /**
         * Sets (as xml) the "ComercialSuffix" element
         */
        void xsetComercialSuffix(org.apache.xmlbeans.XmlString comercialSuffix);
        
        /**
         * Unsets the "ComercialSuffix" element
         */
        void unsetComercialSuffix();
        
        /**
         * Gets the "Event_SequentID" element
         */
        int getEventSequentID();
        
        /**
         * Gets (as xml) the "Event_SequentID" element
         */
        org.apache.xmlbeans.XmlInt xgetEventSequentID();
        
        /**
         * True if has "Event_SequentID" element
         */
        boolean isSetEventSequentID();
        
        /**
         * Sets the "Event_SequentID" element
         */
        void setEventSequentID(int eventSequentID);
        
        /**
         * Sets (as xml) the "Event_SequentID" element
         */
        void xsetEventSequentID(org.apache.xmlbeans.XmlInt eventSequentID);
        
        /**
         * Unsets the "Event_SequentID" element
         */
        void unsetEventSequentID();
        
        /**
         * Gets the "Sequnet" element
         */
        int getSequnet();
        
        /**
         * Gets (as xml) the "Sequnet" element
         */
        org.apache.xmlbeans.XmlInt xgetSequnet();
        
        /**
         * True if has "Sequnet" element
         */
        boolean isSetSequnet();
        
        /**
         * Sets the "Sequnet" element
         */
        void setSequnet(int sequnet);
        
        /**
         * Sets (as xml) the "Sequnet" element
         */
        void xsetSequnet(org.apache.xmlbeans.XmlInt sequnet);
        
        /**
         * Unsets the "Sequnet" element
         */
        void unsetSequnet();
        
        /**
         * An XML Airline(@urn:www.qantas.com:schema:cdm:common:Events:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmCommonEventsV1.qantas.BaseEventType$EventID$Airline.
         */
        public interface Airline extends org.iata.iata.x2007.x00.AirlineType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Airline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airline1030elemtype");
            
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
                public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline newInstance() {
                  return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ArrivalAirport(@urn:www.qantas.com:schema:cdm:common:Events:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmCommonEventsV1.qantas.BaseEventType$EventID$ArrivalAirport.
         */
        public interface ArrivalAirport extends org.iata.iata.x2007.x00.StationType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrivalAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("arrivalairport33ecelemtype");
            
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
                public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport newInstance() {
                  return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML DepartureAirport(@urn:www.qantas.com:schema:cdm:common:Events:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmCommonEventsV1.qantas.BaseEventType$EventID$DepartureAirport.
         */
        public interface DepartureAirport extends org.iata.iata.x2007.x00.StationType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DepartureAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("departureairportb8e7elemtype");
            
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
                public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport newInstance() {
                  return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID newInstance() {
              return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.EventID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ExternalID(@urn:www.qantas.com:schema:cdm:common:Events:v1).
     *
     * This is a complex type.
     */
    public interface ExternalID extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("externalid49f9elemtype");
        
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
         * Gets the "Date" element
         */
        java.util.Calendar getDate();
        
        /**
         * Gets (as xml) the "Date" element
         */
        org.apache.xmlbeans.XmlDate xgetDate();
        
        /**
         * True if has "Date" element
         */
        boolean isSetDate();
        
        /**
         * Sets the "Date" element
         */
        void setDate(java.util.Calendar date);
        
        /**
         * Sets (as xml) the "Date" element
         */
        void xsetDate(org.apache.xmlbeans.XmlDate date);
        
        /**
         * Unsets the "Date" element
         */
        void unsetDate();
        
        /**
         * Gets the "Port" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port getPort();
        
        /**
         * True if has "Port" element
         */
        boolean isSetPort();
        
        /**
         * Sets the "Port" element
         */
        void setPort(comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port port);
        
        /**
         * Appends and returns a new empty "Port" element
         */
        comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port addNewPort();
        
        /**
         * Unsets the "Port" element
         */
        void unsetPort();
        
        /**
         * Gets the "Sequent" element
         */
        int getSequent();
        
        /**
         * Gets (as xml) the "Sequent" element
         */
        org.apache.xmlbeans.XmlInt xgetSequent();
        
        /**
         * True if has "Sequent" element
         */
        boolean isSetSequent();
        
        /**
         * Sets the "Sequent" element
         */
        void setSequent(int sequent);
        
        /**
         * Sets (as xml) the "Sequent" element
         */
        void xsetSequent(org.apache.xmlbeans.XmlInt sequent);
        
        /**
         * Unsets the "Sequent" element
         */
        void unsetSequent();
        
        /**
         * An XML Port(@urn:www.qantas.com:schema:cdm:common:Events:v1).
         *
         * This is an atomic type that is a restriction of comSchemaCdmCommonEventsV1.qantas.BaseEventType$ExternalID$Port.
         */
        public interface Port extends org.iata.iata.x2007.x00.StationType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Port.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("portf7b6elemtype");
            
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
                public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port newInstance() {
                  return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID.Port) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID newInstance() {
              return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmCommonEventsV1.qantas.BaseEventType.ExternalID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType newInstance() {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmCommonEventsV1.qantas.BaseEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmCommonEventsV1.qantas.BaseEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
