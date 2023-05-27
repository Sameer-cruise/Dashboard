/*
 * XML Type:  FuelQualifierType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FuelQualifierType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML FuelQualifierType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FuelQualifierType.
 */
public interface FuelQualifierType extends org.iata.iata.x2007.x00.FuelQualifierEnumType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FuelQualifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("fuelqualifiertypea806type");
    
    /**
     * Gets the "extension" attribute
     */
    java.lang.String getExtension();
    
    /**
     * Gets (as xml) the "extension" attribute
     */
    org.apache.xmlbeans.XmlString xgetExtension();
    
    /**
     * True if has "extension" attribute
     */
    boolean isSetExtension();
    
    /**
     * Sets the "extension" attribute
     */
    void setExtension(java.lang.String extension);
    
    /**
     * Sets (as xml) the "extension" attribute
     */
    void xsetExtension(org.apache.xmlbeans.XmlString extension);
    
    /**
     * Unsets the "extension" attribute
     */
    void unsetExtension();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.FuelQualifierType newInstance() {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FuelQualifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FuelQualifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
