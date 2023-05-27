/*
 * XML Type:  FlightReferenceType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas;


/**
 * An XML FlightReferenceType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public interface FlightReferenceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightReferenceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flightreferencetype624etype");
    
    /**
     * Gets the "marketingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getMarketingCarrier();
    
    /**
     * Sets the "marketingCarrier" element
     */
    void setMarketingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType marketingCarrier);
    
    /**
     * Appends and returns a new empty "marketingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewMarketingCarrier();
    
    /**
     * Gets the "operatingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getOperatingCarrier();
    
    /**
     * True if has "operatingCarrier" element
     */
    boolean isSetOperatingCarrier();
    
    /**
     * Sets the "operatingCarrier" element
     */
    void setOperatingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType operatingCarrier);
    
    /**
     * Appends and returns a new empty "operatingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewOperatingCarrier();
    
    /**
     * Unsets the "operatingCarrier" element
     */
    void unsetOperatingCarrier();
    
    /**
     * Gets the "departure" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType getDeparture();
    
    /**
     * Sets the "departure" element
     */
    void setDeparture(comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType departure);
    
    /**
     * Appends and returns a new empty "departure" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType addNewDeparture();
    
    /**
     * Gets the "arrival" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType getArrival();
    
    /**
     * Sets the "arrival" element
     */
    void setArrival(comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType arrival);
    
    /**
     * Appends and returns a new empty "arrival" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType addNewArrival();
    
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
     * Gets the "actionCode" element
     */
    java.lang.String getActionCode();
    
    /**
     * Gets (as xml) the "actionCode" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType xgetActionCode();
    
    /**
     * True if has "actionCode" element
     */
    boolean isSetActionCode();
    
    /**
     * Sets the "actionCode" element
     */
    void setActionCode(java.lang.String actionCode);
    
    /**
     * Sets (as xml) the "actionCode" element
     */
    void xsetActionCode(comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType actionCode);
    
    /**
     * Unsets the "actionCode" element
     */
    void unsetActionCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType newInstance() {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
