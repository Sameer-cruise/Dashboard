/*
 * XML Type:  airportDetailsType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1
 * Java type: comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsV1.qantas;


/**
 * An XML airportDetailsType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
 *
 * This is a complex type.
 */
public interface AirportDetailsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AirportDetailsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airportdetailstype7ad9type");
    
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
     * Gets the "movement" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType getMovement();
    
    /**
     * True if has "movement" element
     */
    boolean isSetMovement();
    
    /**
     * Sets the "movement" element
     */
    void setMovement(comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType movement);
    
    /**
     * Appends and returns a new empty "movement" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.MovementType addNewMovement();
    
    /**
     * Unsets the "movement" element
     */
    void unsetMovement();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType newInstance() {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
