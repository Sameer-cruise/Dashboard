/*
 * XML Type:  FlightSegmentType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FlightSegmentType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML FlightSegmentType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface FlightSegmentType extends org.iata.iata.x2007.x00.FlightSegmentBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightSegmentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flightsegmenttype1c57type");
    
    /**
     * Gets the "MarketingAirline" element
     */
    org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline getMarketingAirline();
    
    /**
     * True if has "MarketingAirline" element
     */
    boolean isSetMarketingAirline();
    
    /**
     * Sets the "MarketingAirline" element
     */
    void setMarketingAirline(org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline marketingAirline);
    
    /**
     * Appends and returns a new empty "MarketingAirline" element
     */
    org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline addNewMarketingAirline();
    
    /**
     * Unsets the "MarketingAirline" element
     */
    void unsetMarketingAirline();
    
    /**
     * Gets the "FlightNumber" attribute
     */
    java.lang.String getFlightNumber();
    
    /**
     * Gets (as xml) the "FlightNumber" attribute
     */
    org.iata.iata.x2007.x00.FlightNumberType xgetFlightNumber();
    
    /**
     * True if has "FlightNumber" attribute
     */
    boolean isSetFlightNumber();
    
    /**
     * Sets the "FlightNumber" attribute
     */
    void setFlightNumber(java.lang.String flightNumber);
    
    /**
     * Sets (as xml) the "FlightNumber" attribute
     */
    void xsetFlightNumber(org.iata.iata.x2007.x00.FlightNumberType flightNumber);
    
    /**
     * Unsets the "FlightNumber" attribute
     */
    void unsetFlightNumber();
    
    /**
     * Gets the "TourOperatorFlightID" attribute
     */
    java.lang.String getTourOperatorFlightID();
    
    /**
     * Gets (as xml) the "TourOperatorFlightID" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To8 xgetTourOperatorFlightID();
    
    /**
     * True if has "TourOperatorFlightID" attribute
     */
    boolean isSetTourOperatorFlightID();
    
    /**
     * Sets the "TourOperatorFlightID" attribute
     */
    void setTourOperatorFlightID(java.lang.String tourOperatorFlightID);
    
    /**
     * Sets (as xml) the "TourOperatorFlightID" attribute
     */
    void xsetTourOperatorFlightID(org.iata.iata.x2007.x00.StringLength1To8 tourOperatorFlightID);
    
    /**
     * Unsets the "TourOperatorFlightID" attribute
     */
    void unsetTourOperatorFlightID();
    
    /**
     * Gets the "OperationalSuffix" attribute
     */
    java.lang.String getOperationalSuffix();
    
    /**
     * Gets (as xml) the "OperationalSuffix" attribute
     */
    org.iata.iata.x2007.x00.OperationalSuffixType xgetOperationalSuffix();
    
    /**
     * True if has "OperationalSuffix" attribute
     */
    boolean isSetOperationalSuffix();
    
    /**
     * Sets the "OperationalSuffix" attribute
     */
    void setOperationalSuffix(java.lang.String operationalSuffix);
    
    /**
     * Sets (as xml) the "OperationalSuffix" attribute
     */
    void xsetOperationalSuffix(org.iata.iata.x2007.x00.OperationalSuffixType operationalSuffix);
    
    /**
     * Unsets the "OperationalSuffix" attribute
     */
    void unsetOperationalSuffix();
    
    /**
     * An XML MarketingAirline(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightSegmentType$MarketingAirline.
     */
    public interface MarketingAirline extends org.iata.iata.x2007.x00.CompanyNameType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MarketingAirline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("marketingairline64e3elemtype");
        
        /**
         * Gets the "SingleVendorInd" attribute
         */
        org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd.Enum getSingleVendorInd();
        
        /**
         * Gets (as xml) the "SingleVendorInd" attribute
         */
        org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd xgetSingleVendorInd();
        
        /**
         * True if has "SingleVendorInd" attribute
         */
        boolean isSetSingleVendorInd();
        
        /**
         * Sets the "SingleVendorInd" attribute
         */
        void setSingleVendorInd(org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd.Enum singleVendorInd);
        
        /**
         * Sets (as xml) the "SingleVendorInd" attribute
         */
        void xsetSingleVendorInd(org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd singleVendorInd);
        
        /**
         * Unsets the "SingleVendorInd" attribute
         */
        void unsetSingleVendorInd();
        
        /**
         * Gets the "ResBookDesigCode" attribute
         */
        java.lang.String getResBookDesigCode();
        
        /**
         * Gets (as xml) the "ResBookDesigCode" attribute
         */
        org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2 xgetResBookDesigCode();
        
        /**
         * True if has "ResBookDesigCode" attribute
         */
        boolean isSetResBookDesigCode();
        
        /**
         * Sets the "ResBookDesigCode" attribute
         */
        void setResBookDesigCode(java.lang.String resBookDesigCode);
        
        /**
         * Sets (as xml) the "ResBookDesigCode" attribute
         */
        void xsetResBookDesigCode(org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2 resBookDesigCode);
        
        /**
         * Unsets the "ResBookDesigCode" attribute
         */
        void unsetResBookDesigCode();
        
        /**
         * An XML SingleVendorInd(@).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightSegmentType$MarketingAirline$SingleVendorInd.
         */
        public interface SingleVendorInd extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SingleVendorInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("singlevendorinddc3aattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SINGLE_VNDR = Enum.forString("SingleVndr");
            static final Enum ALLIANCE = Enum.forString("Alliance");
            
            static final int INT_SINGLE_VNDR = Enum.INT_SINGLE_VNDR;
            static final int INT_ALLIANCE = Enum.INT_ALLIANCE;
            
            /**
             * Enumeration value class for org.iata.iata.x2007.x00.FlightSegmentType$MarketingAirline$SingleVendorInd.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SINGLE_VNDR
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_SINGLE_VNDR = 1;
                static final int INT_ALLIANCE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("SingleVndr", INT_SINGLE_VNDR),
                      new Enum("Alliance", INT_ALLIANCE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd newValue(java.lang.Object obj) {
                  return (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd) type.newValue( obj ); }
                
                public static org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd newInstance() {
                  return (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline newInstance() {
              return (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.FlightSegmentType newInstance() {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FlightSegmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FlightSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
