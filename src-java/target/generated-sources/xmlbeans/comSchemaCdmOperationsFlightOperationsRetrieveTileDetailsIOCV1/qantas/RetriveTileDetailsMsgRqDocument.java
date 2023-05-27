/*
 * An XML document type.
 * Localname: retriveTileDetailsMsgRq
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas;


/**
 * A document containing one retriveTileDetailsMsgRq(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1) element.
 *
 * This is a complex type.
 */
public interface RetriveTileDetailsMsgRqDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RetriveTileDetailsMsgRqDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("retrivetiledetailsmsgrqa6f2doctype");
    
    /**
     * Gets the "retriveTileDetailsMsgRq" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC getRetriveTileDetailsMsgRq();
    
    /**
     * Sets the "retriveTileDetailsMsgRq" element
     */
    void setRetriveTileDetailsMsgRq(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC retriveTileDetailsMsgRq);
    
    /**
     * Appends and returns a new empty "retriveTileDetailsMsgRq" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.FilterDataTypeIOC addNewRetriveTileDetailsMsgRq();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument newInstance() {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.RetriveTileDetailsMsgRqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
