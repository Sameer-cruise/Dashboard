/*
 * XML Type:  AirportDisplayNameType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1
 * Java type: comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkAirportV1.qantas;


/**
 * An XML AirportDisplayNameType(@urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1).
 *
 * This is a complex type.
 */
public interface AirportDisplayNameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AirportDisplayNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airportdisplaynametypef889type");
    
    /**
     * Gets the "airportName" element
     */
    java.lang.String getAirportName();
    
    /**
     * Gets (as xml) the "airportName" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.AirportNameType xgetAirportName();
    
    /**
     * Sets the "airportName" element
     */
    void setAirportName(java.lang.String airportName);
    
    /**
     * Sets (as xml) the "airportName" element
     */
    void xsetAirportName(comSchemaCdmFlightnetworkAirportV1.qantas.AirportNameType airportName);
    
    /**
     * Gets the "language" element
     */
    java.lang.String getLanguage();
    
    /**
     * Gets (as xml) the "language" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.LanguageType xgetLanguage();
    
    /**
     * Sets the "language" element
     */
    void setLanguage(java.lang.String language);
    
    /**
     * Sets (as xml) the "language" element
     */
    void xsetLanguage(comSchemaCdmFlightnetworkAirportV1.qantas.LanguageType language);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType newInstance() {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
