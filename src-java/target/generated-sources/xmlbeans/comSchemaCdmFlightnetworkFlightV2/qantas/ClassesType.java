/*
 * XML Type:  ClassesType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas;


/**
 * An XML ClassesType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public interface ClassesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClassesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("classestype1cf9type");
    
    /**
     * Gets the "classOfService" element
     */
    java.lang.String getClassOfService();
    
    /**
     * Gets (as xml) the "classOfService" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ClassOfServiceType xgetClassOfService();
    
    /**
     * Sets the "classOfService" element
     */
    void setClassOfService(java.lang.String classOfService);
    
    /**
     * Sets (as xml) the "classOfService" element
     */
    void xsetClassOfService(comSchemaCdmFlightnetworkFlightV2.qantas.ClassOfServiceType classOfService);
    
    /**
     * Gets the "status" element
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.StatusType xgetStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(comSchemaCdmFlightnetworkFlightV2.qantas.StatusType status);
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "priceClass" element
     */
    java.lang.String getPriceClass();
    
    /**
     * Gets (as xml) the "priceClass" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.PriceClassType xgetPriceClass();
    
    /**
     * True if has "priceClass" element
     */
    boolean isSetPriceClass();
    
    /**
     * Sets the "priceClass" element
     */
    void setPriceClass(java.lang.String priceClass);
    
    /**
     * Sets (as xml) the "priceClass" element
     */
    void xsetPriceClass(comSchemaCdmFlightnetworkFlightV2.qantas.PriceClassType priceClass);
    
    /**
     * Unsets the "priceClass" element
     */
    void unsetPriceClass();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType newInstance() {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
