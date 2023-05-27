/*
 * XML Type:  FlightLegInfoListType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas;


/**
 * An XML FlightLegInfoListType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
 *
 * This is a complex type.
 */
public interface FlightLegInfoListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightLegInfoListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flightleginfolisttype72b0type");
    
    /**
     * Gets array of all "FlightLegInfo" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType[] getFlightLegInfoArray();
    
    /**
     * Gets ith "FlightLegInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType getFlightLegInfoArray(int i);
    
    /**
     * Returns number of "FlightLegInfo" element
     */
    int sizeOfFlightLegInfoArray();
    
    /**
     * Sets array of all "FlightLegInfo" element
     */
    void setFlightLegInfoArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType[] flightLegInfoArray);
    
    /**
     * Sets ith "FlightLegInfo" element
     */
    void setFlightLegInfoArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType flightLegInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FlightLegInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType insertNewFlightLegInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FlightLegInfo" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType addNewFlightLegInfo();
    
    /**
     * Removes the ith "FlightLegInfo" element
     */
    void removeFlightLegInfo(int i);
    
    /**
     * Gets array of all "LegDetails" elements
     */
    org.iata.iata.x2007.x00.FlightLegType[] getLegDetailsArray();
    
    /**
     * Gets ith "LegDetails" element
     */
    org.iata.iata.x2007.x00.FlightLegType getLegDetailsArray(int i);
    
    /**
     * Returns number of "LegDetails" element
     */
    int sizeOfLegDetailsArray();
    
    /**
     * Sets array of all "LegDetails" element
     */
    void setLegDetailsArray(org.iata.iata.x2007.x00.FlightLegType[] legDetailsArray);
    
    /**
     * Sets ith "LegDetails" element
     */
    void setLegDetailsArray(int i, org.iata.iata.x2007.x00.FlightLegType legDetails);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LegDetails" element
     */
    org.iata.iata.x2007.x00.FlightLegType insertNewLegDetails(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LegDetails" element
     */
    org.iata.iata.x2007.x00.FlightLegType addNewLegDetails();
    
    /**
     * Removes the ith "LegDetails" element
     */
    void removeLegDetails(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType newInstance() {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}