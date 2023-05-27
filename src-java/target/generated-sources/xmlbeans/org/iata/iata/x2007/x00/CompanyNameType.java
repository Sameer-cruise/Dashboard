/*
 * XML Type:  CompanyNameType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.CompanyNameType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML CompanyNameType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.CompanyNameType.
 */
public interface CompanyNameType extends org.iata.iata.x2007.x00.StringLength0To128
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompanyNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("companynametype59b2type");
    
    /**
     * Gets the "CompanyShortName" attribute
     */
    java.lang.String getCompanyShortName();
    
    /**
     * Gets (as xml) the "CompanyShortName" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetCompanyShortName();
    
    /**
     * True if has "CompanyShortName" attribute
     */
    boolean isSetCompanyShortName();
    
    /**
     * Sets the "CompanyShortName" attribute
     */
    void setCompanyShortName(java.lang.String companyShortName);
    
    /**
     * Sets (as xml) the "CompanyShortName" attribute
     */
    void xsetCompanyShortName(org.iata.iata.x2007.x00.StringLength1To32 companyShortName);
    
    /**
     * Unsets the "CompanyShortName" attribute
     */
    void unsetCompanyShortName();
    
    /**
     * Gets the "TravelSector" attribute
     */
    java.lang.String getTravelSector();
    
    /**
     * Gets (as xml) the "TravelSector" attribute
     */
    org.iata.iata.x2007.x00.IATACodeType xgetTravelSector();
    
    /**
     * True if has "TravelSector" attribute
     */
    boolean isSetTravelSector();
    
    /**
     * Sets the "TravelSector" attribute
     */
    void setTravelSector(java.lang.String travelSector);
    
    /**
     * Sets (as xml) the "TravelSector" attribute
     */
    void xsetTravelSector(org.iata.iata.x2007.x00.IATACodeType travelSector);
    
    /**
     * Unsets the "TravelSector" attribute
     */
    void unsetTravelSector();
    
    /**
     * Gets the "Code" attribute
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "Code" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To16 xgetCode();
    
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
    void xsetCode(org.iata.iata.x2007.x00.StringLength1To16 code);
    
    /**
     * Unsets the "Code" attribute
     */
    void unsetCode();
    
    /**
     * Gets the "CodeContext" attribute
     */
    java.lang.String getCodeContext();
    
    /**
     * Gets (as xml) the "CodeContext" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetCodeContext();
    
    /**
     * True if has "CodeContext" attribute
     */
    boolean isSetCodeContext();
    
    /**
     * Sets the "CodeContext" attribute
     */
    void setCodeContext(java.lang.String codeContext);
    
    /**
     * Sets (as xml) the "CodeContext" attribute
     */
    void xsetCodeContext(org.iata.iata.x2007.x00.StringLength1To32 codeContext);
    
    /**
     * Unsets the "CodeContext" attribute
     */
    void unsetCodeContext();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.CompanyNameType newInstance() {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.CompanyNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.CompanyNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.CompanyNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.CompanyNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.CompanyNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.CompanyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
