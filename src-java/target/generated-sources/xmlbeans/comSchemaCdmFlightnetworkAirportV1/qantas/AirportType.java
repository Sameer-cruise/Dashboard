/*
 * XML Type:  AirportType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1
 * Java type: comSchemaCdmFlightnetworkAirportV1.qantas.AirportType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkAirportV1.qantas;


/**
 * An XML AirportType(@urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1).
 *
 * This is a complex type.
 */
public interface AirportType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AirportType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airporttype5af2type");
    
    /**
     * Gets the "airportCode" element
     */
    java.lang.String getAirportCode();
    
    /**
     * Gets (as xml) the "airportCode" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeType xgetAirportCode();
    
    /**
     * Sets the "airportCode" element
     */
    void setAirportCode(java.lang.String airportCode);
    
    /**
     * Sets (as xml) the "airportCode" element
     */
    void xsetAirportCode(comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeType airportCode);
    
    /**
     * Gets the "codeContext" element
     */
    java.lang.String getCodeContext();
    
    /**
     * Gets (as xml) the "codeContext" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeContextType xgetCodeContext();
    
    /**
     * Sets the "codeContext" element
     */
    void setCodeContext(java.lang.String codeContext);
    
    /**
     * Sets (as xml) the "codeContext" element
     */
    void xsetCodeContext(comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeContextType codeContext);
    
    /**
     * Gets the "terminal" element
     */
    java.lang.String getTerminal();
    
    /**
     * Gets (as xml) the "terminal" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.TerminalType xgetTerminal();
    
    /**
     * True if has "terminal" element
     */
    boolean isSetTerminal();
    
    /**
     * Sets the "terminal" element
     */
    void setTerminal(java.lang.String terminal);
    
    /**
     * Sets (as xml) the "terminal" element
     */
    void xsetTerminal(comSchemaCdmFlightnetworkAirportV1.qantas.TerminalType terminal);
    
    /**
     * Unsets the "terminal" element
     */
    void unsetTerminal();
    
    /**
     * Gets the "gate" element
     */
    java.lang.String getGate();
    
    /**
     * Gets (as xml) the "gate" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.GateType xgetGate();
    
    /**
     * True if has "gate" element
     */
    boolean isSetGate();
    
    /**
     * Sets the "gate" element
     */
    void setGate(java.lang.String gate);
    
    /**
     * Sets (as xml) the "gate" element
     */
    void xsetGate(comSchemaCdmFlightnetworkAirportV1.qantas.GateType gate);
    
    /**
     * Unsets the "gate" element
     */
    void unsetGate();
    
    /**
     * Gets the "airportDisplayName" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType getAirportDisplayName();
    
    /**
     * True if has "airportDisplayName" element
     */
    boolean isSetAirportDisplayName();
    
    /**
     * Sets the "airportDisplayName" element
     */
    void setAirportDisplayName(comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType airportDisplayName);
    
    /**
     * Appends and returns a new empty "airportDisplayName" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType addNewAirportDisplayName();
    
    /**
     * Unsets the "airportDisplayName" element
     */
    void unsetAirportDisplayName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType newInstance() {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkAirportV1.qantas.AirportType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkAirportV1.qantas.AirportType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
