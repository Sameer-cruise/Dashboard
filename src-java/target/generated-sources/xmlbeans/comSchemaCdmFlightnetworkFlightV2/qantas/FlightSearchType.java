/*
 * XML Type:  FlightSearchType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas;


/**
 * An XML FlightSearchType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public interface FlightSearchType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightSearchType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flightsearchtype7dbdtype");
    
    /**
     * Gets the "elementNumber" element
     */
    java.lang.String getElementNumber();
    
    /**
     * Gets (as xml) the "elementNumber" element
     */
    comSchemaCdmCommonCommonV1.qantas.ElementNumberType xgetElementNumber();
    
    /**
     * True if has "elementNumber" element
     */
    boolean isSetElementNumber();
    
    /**
     * Sets the "elementNumber" element
     */
    void setElementNumber(java.lang.String elementNumber);
    
    /**
     * Sets (as xml) the "elementNumber" element
     */
    void xsetElementNumber(comSchemaCdmCommonCommonV1.qantas.ElementNumberType elementNumber);
    
    /**
     * Unsets the "elementNumber" element
     */
    void unsetElementNumber();
    
    /**
     * Gets the "carrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getCarrier();
    
    /**
     * Sets the "carrier" element
     */
    void setCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType carrier);
    
    /**
     * Appends and returns a new empty "carrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewCarrier();
    
    /**
     * Gets the "departureAirport" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.AirportType getDepartureAirport();
    
    /**
     * True if has "departureAirport" element
     */
    boolean isSetDepartureAirport();
    
    /**
     * Sets the "departureAirport" element
     */
    void setDepartureAirport(comSchemaCdmFlightnetworkAirportV1.qantas.AirportType departureAirport);
    
    /**
     * Appends and returns a new empty "departureAirport" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.AirportType addNewDepartureAirport();
    
    /**
     * Unsets the "departureAirport" element
     */
    void unsetDepartureAirport();
    
    /**
     * Gets the "departureDate" element
     */
    java.util.Calendar getDepartureDate();
    
    /**
     * Gets (as xml) the "departureDate" element
     */
    comSchemaCdmCommonCommonV1.qantas.DateType xgetDepartureDate();
    
    /**
     * Sets the "departureDate" element
     */
    void setDepartureDate(java.util.Calendar departureDate);
    
    /**
     * Sets (as xml) the "departureDate" element
     */
    void xsetDepartureDate(comSchemaCdmCommonCommonV1.qantas.DateType departureDate);
    
    /**
     * Gets the "departureTime" element
     */
    java.lang.String getDepartureTime();
    
    /**
     * Gets (as xml) the "departureTime" element
     */
    comSchemaCdmCommonCommonV1.qantas.TimeType xgetDepartureTime();
    
    /**
     * True if has "departureTime" element
     */
    boolean isSetDepartureTime();
    
    /**
     * Sets the "departureTime" element
     */
    void setDepartureTime(java.lang.String departureTime);
    
    /**
     * Sets (as xml) the "departureTime" element
     */
    void xsetDepartureTime(comSchemaCdmCommonCommonV1.qantas.TimeType departureTime);
    
    /**
     * Unsets the "departureTime" element
     */
    void unsetDepartureTime();
    
    /**
     * Gets the "arrivalAirport" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.AirportType getArrivalAirport();
    
    /**
     * True if has "arrivalAirport" element
     */
    boolean isSetArrivalAirport();
    
    /**
     * Sets the "arrivalAirport" element
     */
    void setArrivalAirport(comSchemaCdmFlightnetworkAirportV1.qantas.AirportType arrivalAirport);
    
    /**
     * Appends and returns a new empty "arrivalAirport" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.AirportType addNewArrivalAirport();
    
    /**
     * Unsets the "arrivalAirport" element
     */
    void unsetArrivalAirport();
    
    /**
     * Gets the "arrivalDate" element
     */
    java.util.Calendar getArrivalDate();
    
    /**
     * Gets (as xml) the "arrivalDate" element
     */
    comSchemaCdmCommonCommonV1.qantas.DateType xgetArrivalDate();
    
    /**
     * True if has "arrivalDate" element
     */
    boolean isSetArrivalDate();
    
    /**
     * Sets the "arrivalDate" element
     */
    void setArrivalDate(java.util.Calendar arrivalDate);
    
    /**
     * Sets (as xml) the "arrivalDate" element
     */
    void xsetArrivalDate(comSchemaCdmCommonCommonV1.qantas.DateType arrivalDate);
    
    /**
     * Unsets the "arrivalDate" element
     */
    void unsetArrivalDate();
    
    /**
     * Gets the "arrivalTime" element
     */
    java.lang.String getArrivalTime();
    
    /**
     * Gets (as xml) the "arrivalTime" element
     */
    comSchemaCdmCommonCommonV1.qantas.TimeType xgetArrivalTime();
    
    /**
     * True if has "arrivalTime" element
     */
    boolean isSetArrivalTime();
    
    /**
     * Sets the "arrivalTime" element
     */
    void setArrivalTime(java.lang.String arrivalTime);
    
    /**
     * Sets (as xml) the "arrivalTime" element
     */
    void xsetArrivalTime(comSchemaCdmCommonCommonV1.qantas.TimeType arrivalTime);
    
    /**
     * Unsets the "arrivalTime" element
     */
    void unsetArrivalTime();
    
    /**
     * Gets array of all "classes" elements
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[] getClassesArray();
    
    /**
     * Gets ith "classes" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType getClassesArray(int i);
    
    /**
     * Returns number of "classes" element
     */
    int sizeOfClassesArray();
    
    /**
     * Sets array of all "classes" element
     */
    void setClassesArray(comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[] classesArray);
    
    /**
     * Sets ith "classes" element
     */
    void setClassesArray(int i, comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType classes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "classes" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType insertNewClasses(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "classes" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType addNewClasses();
    
    /**
     * Removes the ith "classes" element
     */
    void removeClasses(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType newInstance() {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightSearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
