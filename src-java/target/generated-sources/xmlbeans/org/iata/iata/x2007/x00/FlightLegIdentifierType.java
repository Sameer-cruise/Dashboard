/*
 * XML Type:  FlightLegIdentifierType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FlightLegIdentifierType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML FlightLegIdentifierType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface FlightLegIdentifierType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightLegIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flightlegidentifiertype49f3type");
    
    /**
     * Gets the "Airline" element
     */
    org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline getAirline();
    
    /**
     * Sets the "Airline" element
     */
    void setAirline(org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline airline);
    
    /**
     * Appends and returns a new empty "Airline" element
     */
    org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline addNewAirline();
    
    /**
     * Gets the "FlightNumber" element
     */
    java.lang.String getFlightNumber();
    
    /**
     * Gets (as xml) the "FlightNumber" element
     */
    org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumber();
    
    /**
     * Sets the "FlightNumber" element
     */
    void setFlightNumber(java.lang.String flightNumber);
    
    /**
     * Sets (as xml) the "FlightNumber" element
     */
    void xsetFlightNumber(org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber);
    
    /**
     * Gets the "OperationalSuffix" element
     */
    java.lang.String getOperationalSuffix();
    
    /**
     * Gets (as xml) the "OperationalSuffix" element
     */
    org.iata.iata.x2007.x00.OperationalSuffixType xgetOperationalSuffix();
    
    /**
     * True if has "OperationalSuffix" element
     */
    boolean isSetOperationalSuffix();
    
    /**
     * Sets the "OperationalSuffix" element
     */
    void setOperationalSuffix(java.lang.String operationalSuffix);
    
    /**
     * Sets (as xml) the "OperationalSuffix" element
     */
    void xsetOperationalSuffix(org.iata.iata.x2007.x00.OperationalSuffixType operationalSuffix);
    
    /**
     * Unsets the "OperationalSuffix" element
     */
    void unsetOperationalSuffix();
    
    /**
     * Gets the "DepartureAirport" element
     */
    org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport getDepartureAirport();
    
    /**
     * Sets the "DepartureAirport" element
     */
    void setDepartureAirport(org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport departureAirport);
    
    /**
     * Appends and returns a new empty "DepartureAirport" element
     */
    org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport addNewDepartureAirport();
    
    /**
     * Gets the "ArrivalAirport" element
     */
    org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport getArrivalAirport();
    
    /**
     * Sets the "ArrivalAirport" element
     */
    void setArrivalAirport(org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport arrivalAirport);
    
    /**
     * Appends and returns a new empty "ArrivalAirport" element
     */
    org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport addNewArrivalAirport();
    
    /**
     * Gets the "OriginDate" element
     */
    java.util.Calendar getOriginDate();
    
    /**
     * Gets (as xml) the "OriginDate" element
     */
    org.apache.xmlbeans.XmlDate xgetOriginDate();
    
    /**
     * Sets the "OriginDate" element
     */
    void setOriginDate(java.util.Calendar originDate);
    
    /**
     * Sets (as xml) the "OriginDate" element
     */
    void xsetOriginDate(org.apache.xmlbeans.XmlDate originDate);
    
    /**
     * Gets the "RepeatNumber" element
     */
    org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber getRepeatNumber();
    
    /**
     * True if has "RepeatNumber" element
     */
    boolean isSetRepeatNumber();
    
    /**
     * Sets the "RepeatNumber" element
     */
    void setRepeatNumber(org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber repeatNumber);
    
    /**
     * Appends and returns a new empty "RepeatNumber" element
     */
    org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber addNewRepeatNumber();
    
    /**
     * Unsets the "RepeatNumber" element
     */
    void unsetRepeatNumber();
    
    /**
     * An XML Airline(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegIdentifierType$Airline.
     */
    public interface Airline extends org.iata.iata.x2007.x00.AirlineType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Airline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airline4329elemtype");
        
        /**
         * Gets the "CodeContext" attribute
         */
        java.lang.String getCodeContext();
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
        
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
        void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
        
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
            public static org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline newInstance() {
              return (org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML DepartureAirport(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegIdentifierType$DepartureAirport.
     */
    public interface DepartureAirport extends org.iata.iata.x2007.x00.StationType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DepartureAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("departureairport6820elemtype");
        
        /**
         * Gets the "CodeContext" attribute
         */
        java.lang.String getCodeContext();
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
        
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
        void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
        
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
            public static org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport newInstance() {
              return (org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ArrivalAirport(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegIdentifierType$ArrivalAirport.
     */
    public interface ArrivalAirport extends org.iata.iata.x2007.x00.StationType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrivalAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("arrivalairport5fe5elemtype");
        
        /**
         * Gets the "CodeContext" attribute
         */
        java.lang.String getCodeContext();
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
        
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
        void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
        
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
            public static org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport newInstance() {
              return (org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML RepeatNumber(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegIdentifierType$RepeatNumber.
     */
    public interface RepeatNumber extends org.iata.iata.x2007.x00.Numeric1To99
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RepeatNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("repeatnumber8c73elemtype");
        
        /**
         * Gets the "CurrentInd" attribute
         */
        boolean getCurrentInd();
        
        /**
         * Gets (as xml) the "CurrentInd" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetCurrentInd();
        
        /**
         * True if has "CurrentInd" attribute
         */
        boolean isSetCurrentInd();
        
        /**
         * Sets the "CurrentInd" attribute
         */
        void setCurrentInd(boolean currentInd);
        
        /**
         * Sets (as xml) the "CurrentInd" attribute
         */
        void xsetCurrentInd(org.apache.xmlbeans.XmlBoolean currentInd);
        
        /**
         * Unsets the "CurrentInd" attribute
         */
        void unsetCurrentInd();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber newInstance() {
              return (org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType newInstance() {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FlightLegIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FlightLegIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
