/*
 * XML Type:  CustomFlightLegType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas;


/**
 * An XML CustomFlightLegType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
 *
 * This is a complex type.
 */
public interface CustomFlightLegType extends org.iata.iata.x2007.x00.FlightLegType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CustomFlightLegType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("customflightlegtype0096type");
    
    /**
     * Gets array of all "DelayDetails" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType[] getDelayDetailsArray();
    
    /**
     * Gets ith "DelayDetails" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType getDelayDetailsArray(int i);
    
    /**
     * Returns number of "DelayDetails" element
     */
    int sizeOfDelayDetailsArray();
    
    /**
     * Sets array of all "DelayDetails" element
     */
    void setDelayDetailsArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType[] delayDetailsArray);
    
    /**
     * Sets ith "DelayDetails" element
     */
    void setDelayDetailsArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType delayDetails);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DelayDetails" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType insertNewDelayDetails(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DelayDetails" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomDelayDetailsType addNewDelayDetails();
    
    /**
     * Removes the ith "DelayDetails" element
     */
    void removeDelayDetails(int i);
    
    /**
     * Gets array of all "GroundTime" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime[] getGroundTimeArray();
    
    /**
     * Gets ith "GroundTime" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime getGroundTimeArray(int i);
    
    /**
     * Returns number of "GroundTime" element
     */
    int sizeOfGroundTimeArray();
    
    /**
     * Sets array of all "GroundTime" element
     */
    void setGroundTimeArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime[] groundTimeArray);
    
    /**
     * Sets ith "GroundTime" element
     */
    void setGroundTimeArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime groundTime);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GroundTime" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime insertNewGroundTime(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GroundTime" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime addNewGroundTime();
    
    /**
     * Removes the ith "GroundTime" element
     */
    void removeGroundTime(int i);
    
    /**
     * An XML GroundTime(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType$GroundTime.
     */
    public interface GroundTime extends org.apache.xmlbeans.XmlDecimal
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GroundTime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("groundtime7046elemtype");
        
        /**
         * Gets the "Type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "Type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "Type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "Type" attribute
         */
        void unsetType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType.GroundTime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType newInstance() {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
