/*
 * An XML document type.
 * Localname: retriveFlightLegMsgRq
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas;


/**
 * A document containing one retriveFlightLegMsgRq(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1) element.
 *
 * This is a complex type.
 */
public interface RetriveFlightLegMsgRqDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RetriveFlightLegMsgRqDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("retriveflightlegmsgrq447bdoctype");
    
    /**
     * Gets the "retriveFlightLegMsgRq" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq getRetriveFlightLegMsgRq();
    
    /**
     * Sets the "retriveFlightLegMsgRq" element
     */
    void setRetriveFlightLegMsgRq(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq retriveFlightLegMsgRq);
    
    /**
     * Appends and returns a new empty "retriveFlightLegMsgRq" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq addNewRetriveFlightLegMsgRq();
    
    /**
     * An XML retriveFlightLegMsgRq(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is a complex type.
     */
    public interface RetriveFlightLegMsgRq extends comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetrieveFlightLegType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RetriveFlightLegMsgRq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("retriveflightlegmsgrq9c86elemtype");
        
        /**
         * Gets the "EventID" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID getEventID();
        
        /**
         * True if has "EventID" element
         */
        boolean isSetEventID();
        
        /**
         * Sets the "EventID" element
         */
        void setEventID(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID eventID);
        
        /**
         * Appends and returns a new empty "EventID" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID addNewEventID();
        
        /**
         * Unsets the "EventID" element
         */
        void unsetEventID();
        
        /**
         * Gets array of all "LegIdentifier" elements
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1[] getLegIdentifierArray();
        
        /**
         * Gets ith "LegIdentifier" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 getLegIdentifierArray(int i);
        
        /**
         * Returns number of "LegIdentifier" element
         */
        int sizeOfLegIdentifierArray();
        
        /**
         * Sets array of all "LegIdentifier" element
         */
        void setLegIdentifierArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1[] legIdentifierArray);
        
        /**
         * Sets ith "LegIdentifier" element
         */
        void setLegIdentifierArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 legIdentifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "LegIdentifier" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 insertNewLegIdentifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "LegIdentifier" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 addNewLegIdentifier();
        
        /**
         * Removes the ith "LegIdentifier" element
         */
        void removeLegIdentifier(int i);
        
        /**
         * Gets the "FilterData" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType getFilterData();
        
        /**
         * True if has "FilterData" element
         */
        boolean isSetFilterData();
        
        /**
         * Sets the "FilterData" element
         */
        void setFilterData(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType filterData);
        
        /**
         * Appends and returns a new empty "FilterData" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType addNewFilterData();
        
        /**
         * Unsets the "FilterData" element
         */
        void unsetFilterData();
        
        /**
         * Gets the "ExternalID" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID getExternalID();
        
        /**
         * True if has "ExternalID" element
         */
        boolean isSetExternalID();
        
        /**
         * Sets the "ExternalID" element
         */
        void setExternalID(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID externalID);
        
        /**
         * Appends and returns a new empty "ExternalID" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID addNewExternalID();
        
        /**
         * Unsets the "ExternalID" element
         */
        void unsetExternalID();
        
        /**
         * Gets the "ArvDepIndicator" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType.Enum getArvDepIndicator();
        
        /**
         * Gets (as xml) the "ArvDepIndicator" element
         */
        comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType xgetArvDepIndicator();
        
        /**
         * True if has "ArvDepIndicator" element
         */
        boolean isSetArvDepIndicator();
        
        /**
         * Sets the "ArvDepIndicator" element
         */
        void setArvDepIndicator(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType.Enum arvDepIndicator);
        
        /**
         * Sets (as xml) the "ArvDepIndicator" element
         */
        void xsetArvDepIndicator(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType arvDepIndicator);
        
        /**
         * Unsets the "ArvDepIndicator" element
         */
        void unsetArvDepIndicator();
        
        /**
         * Gets the "AircraftRego" element
         */
        java.lang.String getAircraftRego();
        
        /**
         * Gets (as xml) the "AircraftRego" element
         */
        org.apache.xmlbeans.XmlString xgetAircraftRego();
        
        /**
         * True if has "AircraftRego" element
         */
        boolean isSetAircraftRego();
        
        /**
         * Sets the "AircraftRego" element
         */
        void setAircraftRego(java.lang.String aircraftRego);
        
        /**
         * Sets (as xml) the "AircraftRego" element
         */
        void xsetAircraftRego(org.apache.xmlbeans.XmlString aircraftRego);
        
        /**
         * Unsets the "AircraftRego" element
         */
        void unsetAircraftRego();
        
        /**
         * An XML EventID(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
         *
         * This is a complex type.
         */
        public interface EventID extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("eventid86e5elemtype");
            
            /**
             * Gets the "Airline" element
             */
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline getAirline();
            
            /**
             * True if has "Airline" element
             */
            boolean isSetAirline();
            
            /**
             * Sets the "Airline" element
             */
            void setAirline(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline airline);
            
            /**
             * Appends and returns a new empty "Airline" element
             */
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline addNewAirline();
            
            /**
             * Unsets the "Airline" element
             */
            void unsetAirline();
            
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
             * Gets the "ArrivalAirport" element
             */
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport getArrivalAirport();
            
            /**
             * True if has "ArrivalAirport" element
             */
            boolean isSetArrivalAirport();
            
            /**
             * Sets the "ArrivalAirport" element
             */
            void setArrivalAirport(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport arrivalAirport);
            
            /**
             * Appends and returns a new empty "ArrivalAirport" element
             */
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport addNewArrivalAirport();
            
            /**
             * Unsets the "ArrivalAirport" element
             */
            void unsetArrivalAirport();
            
            /**
             * Gets the "DepartureAirport" element
             */
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport getDepartureAirport();
            
            /**
             * True if has "DepartureAirport" element
             */
            boolean isSetDepartureAirport();
            
            /**
             * Sets the "DepartureAirport" element
             */
            void setDepartureAirport(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport departureAirport);
            
            /**
             * Appends and returns a new empty "DepartureAirport" element
             */
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport addNewDepartureAirport();
            
            /**
             * Unsets the "DepartureAirport" element
             */
            void unsetDepartureAirport();
            
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
             * An XML Airline(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
             *
             * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument$RetriveFlightLegMsgRq$EventID$Airline.
             */
            public interface Airline extends org.iata.iata.x2007.x00.AirlineType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Airline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airline799belemtype");
                
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
                    public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline newInstance() {
                      return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ArrivalAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
             *
             * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument$RetriveFlightLegMsgRq$EventID$ArrivalAirport.
             */
            public interface ArrivalAirport extends org.iata.iata.x2007.x00.StationType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrivalAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("arrivalairportbd57elemtype");
                
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
                    public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport newInstance() {
                      return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML DepartureAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
             *
             * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument$RetriveFlightLegMsgRq$EventID$DepartureAirport.
             */
            public interface DepartureAirport extends org.iata.iata.x2007.x00.StationType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DepartureAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("departureairportea52elemtype");
                
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
                    public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport newInstance() {
                      return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID newInstance() {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ExternalID(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
         *
         * This is a complex type.
         */
        public interface ExternalID extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("externalideb64elemtype");
            
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
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port getPort();
            
            /**
             * True if has "Port" element
             */
            boolean isSetPort();
            
            /**
             * Sets the "Port" element
             */
            void setPort(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port port);
            
            /**
             * Appends and returns a new empty "Port" element
             */
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port addNewPort();
            
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
             * An XML Port(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
             *
             * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument$RetriveFlightLegMsgRq$ExternalID$Port.
             */
            public interface Port extends org.iata.iata.x2007.x00.StationType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Port.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("port3121elemtype");
                
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
                    public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port newInstance() {
                      return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID newInstance() {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument newInstance() {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
