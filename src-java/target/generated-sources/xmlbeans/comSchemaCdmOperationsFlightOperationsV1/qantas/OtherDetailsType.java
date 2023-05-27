/*
 * XML Type:  otherDetailsType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1
 * Java type: comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsV1.qantas;


/**
 * An XML otherDetailsType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
 *
 * This is a complex type.
 */
public interface OtherDetailsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OtherDetailsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("otherdetailstype11detype");
    
    /**
     * Gets the "airportDetails" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType getAirportDetails();
    
    /**
     * True if has "airportDetails" element
     */
    boolean isSetAirportDetails();
    
    /**
     * Sets the "airportDetails" element
     */
    void setAirportDetails(comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType airportDetails);
    
    /**
     * Appends and returns a new empty "airportDetails" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.AirportDetailsType addNewAirportDetails();
    
    /**
     * Unsets the "airportDetails" element
     */
    void unsetAirportDetails();
    
    /**
     * Gets the "EstimateTimeDetails" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType getEstimateTimeDetails();
    
    /**
     * True if has "EstimateTimeDetails" element
     */
    boolean isSetEstimateTimeDetails();
    
    /**
     * Sets the "EstimateTimeDetails" element
     */
    void setEstimateTimeDetails(comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType estimateTimeDetails);
    
    /**
     * Appends and returns a new empty "EstimateTimeDetails" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType addNewEstimateTimeDetails();
    
    /**
     * Unsets the "EstimateTimeDetails" element
     */
    void unsetEstimateTimeDetails();
    
    /**
     * Gets the "ArrivalTimeDetails" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType getArrivalTimeDetails();
    
    /**
     * True if has "ArrivalTimeDetails" element
     */
    boolean isSetArrivalTimeDetails();
    
    /**
     * Sets the "ArrivalTimeDetails" element
     */
    void setArrivalTimeDetails(comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType arrivalTimeDetails);
    
    /**
     * Appends and returns a new empty "ArrivalTimeDetails" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType addNewArrivalTimeDetails();
    
    /**
     * Unsets the "ArrivalTimeDetails" element
     */
    void unsetArrivalTimeDetails();
    
    /**
     * Gets the "OperatingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getOperatingCarrier();
    
    /**
     * True if has "OperatingCarrier" element
     */
    boolean isSetOperatingCarrier();
    
    /**
     * Sets the "OperatingCarrier" element
     */
    void setOperatingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType operatingCarrier);
    
    /**
     * Appends and returns a new empty "OperatingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewOperatingCarrier();
    
    /**
     * Unsets the "OperatingCarrier" element
     */
    void unsetOperatingCarrier();
    
    /**
     * Gets the "MarketingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getMarketingCarrier();
    
    /**
     * True if has "MarketingCarrier" element
     */
    boolean isSetMarketingCarrier();
    
    /**
     * Sets the "MarketingCarrier" element
     */
    void setMarketingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType marketingCarrier);
    
    /**
     * Appends and returns a new empty "MarketingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewMarketingCarrier();
    
    /**
     * Unsets the "MarketingCarrier" element
     */
    void unsetMarketingCarrier();
    
    /**
     * Gets the "Rego" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType getRego();
    
    /**
     * True if has "Rego" element
     */
    boolean isSetRego();
    
    /**
     * Sets the "Rego" element
     */
    void setRego(comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType rego);
    
    /**
     * Appends and returns a new empty "Rego" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType addNewRego();
    
    /**
     * Unsets the "Rego" element
     */
    void unsetRego();
    
    /**
     * Gets the "delayInformation" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType getDelayInformation();
    
    /**
     * True if has "delayInformation" element
     */
    boolean isSetDelayInformation();
    
    /**
     * Sets the "delayInformation" element
     */
    void setDelayInformation(comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType delayInformation);
    
    /**
     * Appends and returns a new empty "delayInformation" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.DelayInformationType addNewDelayInformation();
    
    /**
     * Unsets the "delayInformation" element
     */
    void unsetDelayInformation();
    
    /**
     * Gets the "departureTimeDetails" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType getDepartureTimeDetails();
    
    /**
     * True if has "departureTimeDetails" element
     */
    boolean isSetDepartureTimeDetails();
    
    /**
     * Sets the "departureTimeDetails" element
     */
    void setDepartureTimeDetails(comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType departureTimeDetails);
    
    /**
     * Appends and returns a new empty "departureTimeDetails" element
     */
    comSchemaCdmOperationsFlightOperationsV1.qantas.TimeDetailsType addNewDepartureTimeDetails();
    
    /**
     * Unsets the "departureTimeDetails" element
     */
    void unsetDepartureTimeDetails();
    
    /**
     * Gets the "localDate" element
     */
    java.util.Calendar getLocalDate();
    
    /**
     * Gets (as xml) the "localDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetLocalDate();
    
    /**
     * True if has "localDate" element
     */
    boolean isSetLocalDate();
    
    /**
     * Sets the "localDate" element
     */
    void setLocalDate(java.util.Calendar localDate);
    
    /**
     * Sets (as xml) the "localDate" element
     */
    void xsetLocalDate(org.apache.xmlbeans.XmlDateTime localDate);
    
    /**
     * Unsets the "localDate" element
     */
    void unsetLocalDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType newInstance() {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsV1.qantas.OtherDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
