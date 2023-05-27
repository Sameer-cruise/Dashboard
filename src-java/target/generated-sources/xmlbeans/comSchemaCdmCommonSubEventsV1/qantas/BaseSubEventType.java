/*
 * XML Type:  BaseSubEventType
 * Namespace: urn:www.qantas.com:schema:cdm:common:SubEvents:v1
 * Java type: comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmCommonSubEventsV1.qantas;


/**
 * An XML BaseSubEventType(@urn:www.qantas.com:schema:cdm:common:SubEvents:v1).
 *
 * This is a complex type.
 */
public interface BaseSubEventType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaseSubEventType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("basesubeventtype9571type");
    
    /**
     * Gets the "SubEventName" element
     */
    java.lang.String getSubEventName();
    
    /**
     * Gets (as xml) the "SubEventName" element
     */
    comSchemaCdmCommonSubEventsV1.qantas.SubEventNameType xgetSubEventName();
    
    /**
     * Sets the "SubEventName" element
     */
    void setSubEventName(java.lang.String subEventName);
    
    /**
     * Sets (as xml) the "SubEventName" element
     */
    void xsetSubEventName(comSchemaCdmCommonSubEventsV1.qantas.SubEventNameType subEventName);
    
    /**
     * Gets the "SubEventId" element
     */
    java.lang.String getSubEventId();
    
    /**
     * Gets (as xml) the "SubEventId" element
     */
    org.apache.xmlbeans.XmlString xgetSubEventId();
    
    /**
     * True if has "SubEventId" element
     */
    boolean isSetSubEventId();
    
    /**
     * Sets the "SubEventId" element
     */
    void setSubEventId(java.lang.String subEventId);
    
    /**
     * Sets (as xml) the "SubEventId" element
     */
    void xsetSubEventId(org.apache.xmlbeans.XmlString subEventId);
    
    /**
     * Unsets the "SubEventId" element
     */
    void unsetSubEventId();
    
    /**
     * Gets the "ExternalId" element
     */
    java.lang.String getExternalId();
    
    /**
     * Gets (as xml) the "ExternalId" element
     */
    org.apache.xmlbeans.XmlString xgetExternalId();
    
    /**
     * True if has "ExternalId" element
     */
    boolean isSetExternalId();
    
    /**
     * Sets the "ExternalId" element
     */
    void setExternalId(java.lang.String externalId);
    
    /**
     * Sets (as xml) the "ExternalId" element
     */
    void xsetExternalId(org.apache.xmlbeans.XmlString externalId);
    
    /**
     * Unsets the "ExternalId" element
     */
    void unsetExternalId();
    
    /**
     * Gets the "SubEventTime" element
     */
    java.util.Calendar getSubEventTime();
    
    /**
     * Gets (as xml) the "SubEventTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetSubEventTime();
    
    /**
     * Sets the "SubEventTime" element
     */
    void setSubEventTime(java.util.Calendar subEventTime);
    
    /**
     * Sets (as xml) the "SubEventTime" element
     */
    void xsetSubEventTime(org.apache.xmlbeans.XmlDateTime subEventTime);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType newInstance() {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmCommonSubEventsV1.qantas.BaseSubEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
