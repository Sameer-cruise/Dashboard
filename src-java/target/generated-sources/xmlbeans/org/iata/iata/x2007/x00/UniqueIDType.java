/*
 * XML Type:  UniqueID_Type
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.UniqueIDType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML UniqueID_Type(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface UniqueIDType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UniqueIDType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("uniqueidtype6647type");
    
    /**
     * Gets the "CompanyName" element
     */
    org.iata.iata.x2007.x00.CompanyNameType getCompanyName();
    
    /**
     * True if has "CompanyName" element
     */
    boolean isSetCompanyName();
    
    /**
     * Sets the "CompanyName" element
     */
    void setCompanyName(org.iata.iata.x2007.x00.CompanyNameType companyName);
    
    /**
     * Appends and returns a new empty "CompanyName" element
     */
    org.iata.iata.x2007.x00.CompanyNameType addNewCompanyName();
    
    /**
     * Unsets the "CompanyName" element
     */
    void unsetCompanyName();
    
    /**
     * Gets the "URL" attribute
     */
    java.lang.String getURL();
    
    /**
     * Gets (as xml) the "URL" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetURL();
    
    /**
     * True if has "URL" attribute
     */
    boolean isSetURL();
    
    /**
     * Sets the "URL" attribute
     */
    void setURL(java.lang.String url);
    
    /**
     * Sets (as xml) the "URL" attribute
     */
    void xsetURL(org.apache.xmlbeans.XmlAnyURI url);
    
    /**
     * Unsets the "URL" attribute
     */
    void unsetURL();
    
    /**
     * Gets the "Type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    org.iata.iata.x2007.x00.IATACodeType xgetType();
    
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
    void xsetType(org.iata.iata.x2007.x00.IATACodeType type);
    
    /**
     * Unsets the "Type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "Instance" attribute
     */
    java.lang.String getInstance();
    
    /**
     * Gets (as xml) the "Instance" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetInstance();
    
    /**
     * True if has "Instance" attribute
     */
    boolean isSetInstance();
    
    /**
     * Sets the "Instance" attribute
     */
    void setInstance(java.lang.String instance);
    
    /**
     * Sets (as xml) the "Instance" attribute
     */
    void xsetInstance(org.iata.iata.x2007.x00.StringLength1To32 instance);
    
    /**
     * Unsets the "Instance" attribute
     */
    void unsetInstance();
    
    /**
     * Gets the "ID" attribute
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetID();
    
    /**
     * True if has "ID" attribute
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" attribute
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.iata.iata.x2007.x00.StringLength1To32 id);
    
    /**
     * Unsets the "ID" attribute
     */
    void unsetID();
    
    /**
     * Gets the "ID_Context" attribute
     */
    java.lang.String getIDContext();
    
    /**
     * Gets (as xml) the "ID_Context" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetIDContext();
    
    /**
     * True if has "ID_Context" attribute
     */
    boolean isSetIDContext();
    
    /**
     * Sets the "ID_Context" attribute
     */
    void setIDContext(java.lang.String idContext);
    
    /**
     * Sets (as xml) the "ID_Context" attribute
     */
    void xsetIDContext(org.iata.iata.x2007.x00.StringLength1To32 idContext);
    
    /**
     * Unsets the "ID_Context" attribute
     */
    void unsetIDContext();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.UniqueIDType newInstance() {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.UniqueIDType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.UniqueIDType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.UniqueIDType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.UniqueIDType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.UniqueIDType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.UniqueIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
