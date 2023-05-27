/*
 * XML Type:  ListOfStringLength0to250
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.ListOfStringLength0To250
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML ListOfStringLength0to250(@http://www.iata.org/IATA/2007/00).
 *
 * This is a list type whose items are org.iata.iata.x2007.x00.StringLength0To250.
 */
public interface ListOfStringLength0To250 extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.util.List getListValue();
    java.util.List xgetListValue();
    void setListValue(java.util.List list);
    /** @deprecated */
    java.util.List listValue();
    /** @deprecated */
    java.util.List xlistValue();
    /** @deprecated */
    void set(java.util.List list);
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListOfStringLength0To250.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("listofstringlength0to2502f74type");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 newValue(java.lang.Object obj) {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) type.newValue( obj ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 newInstance() {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.ListOfStringLength0To250 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.ListOfStringLength0To250) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
