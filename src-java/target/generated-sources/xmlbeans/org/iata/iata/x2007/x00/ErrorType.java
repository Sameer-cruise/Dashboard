/*
 * XML Type:  ErrorType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.ErrorType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML ErrorType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.ErrorType.
 */
public interface ErrorType extends org.iata.iata.x2007.x00.FreeTextType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("errortype6312type");
    
    /**
     * Gets the "Type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    org.iata.iata.x2007.x00.IATACodeType xgetType();
    
    /**
     * Sets the "Type" attribute
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    void xsetType(org.iata.iata.x2007.x00.IATACodeType type);
    
    /**
     * Gets the "ShortText" attribute
     */
    java.lang.String getShortText();
    
    /**
     * Gets (as xml) the "ShortText" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To64 xgetShortText();
    
    /**
     * True if has "ShortText" attribute
     */
    boolean isSetShortText();
    
    /**
     * Sets the "ShortText" attribute
     */
    void setShortText(java.lang.String shortText);
    
    /**
     * Sets (as xml) the "ShortText" attribute
     */
    void xsetShortText(org.iata.iata.x2007.x00.StringLength1To64 shortText);
    
    /**
     * Unsets the "ShortText" attribute
     */
    void unsetShortText();
    
    /**
     * Gets the "Code" attribute
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "Code" attribute
     */
    org.iata.iata.x2007.x00.IATACodeType xgetCode();
    
    /**
     * True if has "Code" attribute
     */
    boolean isSetCode();
    
    /**
     * Sets the "Code" attribute
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "Code" attribute
     */
    void xsetCode(org.iata.iata.x2007.x00.IATACodeType code);
    
    /**
     * Unsets the "Code" attribute
     */
    void unsetCode();
    
    /**
     * Gets the "DocURL" attribute
     */
    java.lang.String getDocURL();
    
    /**
     * Gets (as xml) the "DocURL" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetDocURL();
    
    /**
     * True if has "DocURL" attribute
     */
    boolean isSetDocURL();
    
    /**
     * Sets the "DocURL" attribute
     */
    void setDocURL(java.lang.String docURL);
    
    /**
     * Sets (as xml) the "DocURL" attribute
     */
    void xsetDocURL(org.apache.xmlbeans.XmlAnyURI docURL);
    
    /**
     * Unsets the "DocURL" attribute
     */
    void unsetDocURL();
    
    /**
     * Gets the "Status" attribute
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To64 xgetStatus();
    
    /**
     * True if has "Status" attribute
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" attribute
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    void xsetStatus(org.iata.iata.x2007.x00.StringLength1To64 status);
    
    /**
     * Unsets the "Status" attribute
     */
    void unsetStatus();
    
    /**
     * Gets the "Tag" attribute
     */
    java.lang.String getTag();
    
    /**
     * Gets (as xml) the "Tag" attribute
     */
    org.apache.xmlbeans.XmlString xgetTag();
    
    /**
     * True if has "Tag" attribute
     */
    boolean isSetTag();
    
    /**
     * Sets the "Tag" attribute
     */
    void setTag(java.lang.String tag);
    
    /**
     * Sets (as xml) the "Tag" attribute
     */
    void xsetTag(org.apache.xmlbeans.XmlString tag);
    
    /**
     * Unsets the "Tag" attribute
     */
    void unsetTag();
    
    /**
     * Gets the "RecordID" attribute
     */
    java.lang.String getRecordID();
    
    /**
     * Gets (as xml) the "RecordID" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetRecordID();
    
    /**
     * True if has "RecordID" attribute
     */
    boolean isSetRecordID();
    
    /**
     * Sets the "RecordID" attribute
     */
    void setRecordID(java.lang.String recordID);
    
    /**
     * Sets (as xml) the "RecordID" attribute
     */
    void xsetRecordID(org.iata.iata.x2007.x00.StringLength1To32 recordID);
    
    /**
     * Unsets the "RecordID" attribute
     */
    void unsetRecordID();
    
    /**
     * Gets the "NodeList" attribute
     */
    java.lang.String getNodeList();
    
    /**
     * Gets (as xml) the "NodeList" attribute
     */
    org.apache.xmlbeans.XmlString xgetNodeList();
    
    /**
     * True if has "NodeList" attribute
     */
    boolean isSetNodeList();
    
    /**
     * Sets the "NodeList" attribute
     */
    void setNodeList(java.lang.String nodeList);
    
    /**
     * Sets (as xml) the "NodeList" attribute
     */
    void xsetNodeList(org.apache.xmlbeans.XmlString nodeList);
    
    /**
     * Unsets the "NodeList" attribute
     */
    void unsetNodeList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.ErrorType newInstance() {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.ErrorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.ErrorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.ErrorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.ErrorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.ErrorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.ErrorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
