/*
 * XML Type:  RetriveFlightEventType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas;


/**
 * An XML RetriveFlightEventType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1).
 *
 * This is a complex type.
 */
public interface RetriveFlightEventType extends comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetrieveFlightLegType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RetriveFlightEventType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("retriveflighteventtype9159type");
    
    /**
     * Gets the "DepartureLegEventId" element
     */
    java.math.BigInteger getDepartureLegEventId();
    
    /**
     * Gets (as xml) the "DepartureLegEventId" element
     */
    org.apache.xmlbeans.XmlInteger xgetDepartureLegEventId();
    
    /**
     * True if has "DepartureLegEventId" element
     */
    boolean isSetDepartureLegEventId();
    
    /**
     * Sets the "DepartureLegEventId" element
     */
    void setDepartureLegEventId(java.math.BigInteger departureLegEventId);
    
    /**
     * Sets (as xml) the "DepartureLegEventId" element
     */
    void xsetDepartureLegEventId(org.apache.xmlbeans.XmlInteger departureLegEventId);
    
    /**
     * Unsets the "DepartureLegEventId" element
     */
    void unsetDepartureLegEventId();
    
    /**
     * Gets the "ArrivalLegEventId" element
     */
    java.math.BigInteger getArrivalLegEventId();
    
    /**
     * Gets (as xml) the "ArrivalLegEventId" element
     */
    org.apache.xmlbeans.XmlInteger xgetArrivalLegEventId();
    
    /**
     * Sets the "ArrivalLegEventId" element
     */
    void setArrivalLegEventId(java.math.BigInteger arrivalLegEventId);
    
    /**
     * Sets (as xml) the "ArrivalLegEventId" element
     */
    void xsetArrivalLegEventId(org.apache.xmlbeans.XmlInteger arrivalLegEventId);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType newInstance() {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
