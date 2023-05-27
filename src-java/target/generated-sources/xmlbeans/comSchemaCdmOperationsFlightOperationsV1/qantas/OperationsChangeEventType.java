/*
 * XML Type:  OperationsChangeEventType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1
 * Java type: comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsV1.qantas;


/**
 * An XML OperationsChangeEventType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
 *
 * This is a complex type.
 */
public interface OperationsChangeEventType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationsChangeEventType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("operationschangeeventtypee8c4type");
    
    /**
     * Gets the "eventDetails" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails getEventDetails();
    
    /**
     * Sets the "eventDetails" element
     */
    void setEventDetails(comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails eventDetails);
    
    /**
     * Appends and returns a new empty "eventDetails" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails addNewEventDetails();
    
    /**
     * Gets array of all "subEvents" elements
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents[] getSubEventsArray();
    
    /**
     * Gets ith "subEvents" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents getSubEventsArray(int i);
    
    /**
     * Returns number of "subEvents" element
     */
    int sizeOfSubEventsArray();
    
    /**
     * Sets array of all "subEvents" element
     */
    void setSubEventsArray(comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents[] subEventsArray);
    
    /**
     * Sets ith "subEvents" element
     */
    void setSubEventsArray(int i, comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents subEvents);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subEvents" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents insertNewSubEvents(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subEvents" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents addNewSubEvents();
    
    /**
     * Removes the ith "subEvents" element
     */
    void removeSubEvents(int i);
    
    /**
     * An XML eventDetails(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
     *
     * This is a complex type.
     */
    public interface EventDetails extends comSchemaCdmCommonEventsV1.qantas.BaseEventType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("eventdetails9660elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails newInstance() {
              return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.EventDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML subEvents(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
     *
     * This is a complex type.
     */
    public interface SubEvents extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubEvents.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("subevents8e7felemtype");
        
        /**
         * Gets array of all "subEventDetails" elements
         */
        comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType[] getSubEventDetailsArray();
        
        /**
         * Gets ith "subEventDetails" element
         */
        comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType getSubEventDetailsArray(int i);
        
        /**
         * Returns number of "subEventDetails" element
         */
        int sizeOfSubEventDetailsArray();
        
        /**
         * Sets array of all "subEventDetails" element
         */
        void setSubEventDetailsArray(comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType[] subEventDetailsArray);
        
        /**
         * Sets ith "subEventDetails" element
         */
        void setSubEventDetailsArray(int i, comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType subEventDetails);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subEventDetails" element
         */
        comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType insertNewSubEventDetails(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subEventDetails" element
         */
        comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType addNewSubEventDetails();
        
        /**
         * Removes the ith "subEventDetails" element
         */
        void removeSubEventDetails(int i);
        
        /**
         * Gets array of all "otherDetails" elements
         */
        comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails[] getOtherDetailsArray();
        
        /**
         * Gets ith "otherDetails" element
         */
        comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails getOtherDetailsArray(int i);
        
        /**
         * Returns number of "otherDetails" element
         */
        int sizeOfOtherDetailsArray();
        
        /**
         * Sets array of all "otherDetails" element
         */
        void setOtherDetailsArray(comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails[] otherDetailsArray);
        
        /**
         * Sets ith "otherDetails" element
         */
        void setOtherDetailsArray(int i, comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails otherDetails);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "otherDetails" element
         */
        comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails insertNewOtherDetails(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "otherDetails" element
         */
        comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails addNewOtherDetails();
        
        /**
         * Removes the ith "otherDetails" element
         */
        void removeOtherDetails(int i);
        
        /**
         * An XML otherDetails(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
         *
         * This is a complex type.
         */
        public interface OtherDetails extends comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OtherDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("otherdetailsb591elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails newInstance() {
                  return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents.OtherDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents newInstance() {
              return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType.SubEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType newInstance() {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OperationsChangeEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
