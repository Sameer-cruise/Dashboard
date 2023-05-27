/*
 * XML Type:  SourceType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.SourceType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML SourceType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface SourceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("sourcetypeef6dtype");
    
    /**
     * Gets the "RequestorID" element
     */
    org.iata.iata.x2007.x00.SourceType.RequestorID getRequestorID();
    
    /**
     * True if has "RequestorID" element
     */
    boolean isSetRequestorID();
    
    /**
     * Sets the "RequestorID" element
     */
    void setRequestorID(org.iata.iata.x2007.x00.SourceType.RequestorID requestorID);
    
    /**
     * Appends and returns a new empty "RequestorID" element
     */
    org.iata.iata.x2007.x00.SourceType.RequestorID addNewRequestorID();
    
    /**
     * Unsets the "RequestorID" element
     */
    void unsetRequestorID();
    
    /**
     * Gets the "Position" element
     */
    org.iata.iata.x2007.x00.SourceType.Position getPosition();
    
    /**
     * True if has "Position" element
     */
    boolean isSetPosition();
    
    /**
     * Sets the "Position" element
     */
    void setPosition(org.iata.iata.x2007.x00.SourceType.Position position);
    
    /**
     * Appends and returns a new empty "Position" element
     */
    org.iata.iata.x2007.x00.SourceType.Position addNewPosition();
    
    /**
     * Unsets the "Position" element
     */
    void unsetPosition();
    
    /**
     * Gets the "BookingChannel" element
     */
    org.iata.iata.x2007.x00.SourceType.BookingChannel getBookingChannel();
    
    /**
     * True if has "BookingChannel" element
     */
    boolean isSetBookingChannel();
    
    /**
     * Sets the "BookingChannel" element
     */
    void setBookingChannel(org.iata.iata.x2007.x00.SourceType.BookingChannel bookingChannel);
    
    /**
     * Appends and returns a new empty "BookingChannel" element
     */
    org.iata.iata.x2007.x00.SourceType.BookingChannel addNewBookingChannel();
    
    /**
     * Unsets the "BookingChannel" element
     */
    void unsetBookingChannel();
    
    /**
     * Gets the "AgentSine" attribute
     */
    java.lang.String getAgentSine();
    
    /**
     * Gets (as xml) the "AgentSine" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To16 xgetAgentSine();
    
    /**
     * True if has "AgentSine" attribute
     */
    boolean isSetAgentSine();
    
    /**
     * Sets the "AgentSine" attribute
     */
    void setAgentSine(java.lang.String agentSine);
    
    /**
     * Sets (as xml) the "AgentSine" attribute
     */
    void xsetAgentSine(org.iata.iata.x2007.x00.StringLength1To16 agentSine);
    
    /**
     * Unsets the "AgentSine" attribute
     */
    void unsetAgentSine();
    
    /**
     * Gets the "PseudoCityCode" attribute
     */
    java.lang.String getPseudoCityCode();
    
    /**
     * Gets (as xml) the "PseudoCityCode" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To16 xgetPseudoCityCode();
    
    /**
     * True if has "PseudoCityCode" attribute
     */
    boolean isSetPseudoCityCode();
    
    /**
     * Sets the "PseudoCityCode" attribute
     */
    void setPseudoCityCode(java.lang.String pseudoCityCode);
    
    /**
     * Sets (as xml) the "PseudoCityCode" attribute
     */
    void xsetPseudoCityCode(org.iata.iata.x2007.x00.StringLength1To16 pseudoCityCode);
    
    /**
     * Unsets the "PseudoCityCode" attribute
     */
    void unsetPseudoCityCode();
    
    /**
     * Gets the "ISOCountry" attribute
     */
    java.lang.String getISOCountry();
    
    /**
     * Gets (as xml) the "ISOCountry" attribute
     */
    org.iata.iata.x2007.x00.ISO3166 xgetISOCountry();
    
    /**
     * True if has "ISOCountry" attribute
     */
    boolean isSetISOCountry();
    
    /**
     * Sets the "ISOCountry" attribute
     */
    void setISOCountry(java.lang.String isoCountry);
    
    /**
     * Sets (as xml) the "ISOCountry" attribute
     */
    void xsetISOCountry(org.iata.iata.x2007.x00.ISO3166 isoCountry);
    
    /**
     * Unsets the "ISOCountry" attribute
     */
    void unsetISOCountry();
    
    /**
     * Gets the "ISOCurrency" attribute
     */
    java.lang.String getISOCurrency();
    
    /**
     * Gets (as xml) the "ISOCurrency" attribute
     */
    org.iata.iata.x2007.x00.AlphaLength3 xgetISOCurrency();
    
    /**
     * True if has "ISOCurrency" attribute
     */
    boolean isSetISOCurrency();
    
    /**
     * Sets the "ISOCurrency" attribute
     */
    void setISOCurrency(java.lang.String isoCurrency);
    
    /**
     * Sets (as xml) the "ISOCurrency" attribute
     */
    void xsetISOCurrency(org.iata.iata.x2007.x00.AlphaLength3 isoCurrency);
    
    /**
     * Unsets the "ISOCurrency" attribute
     */
    void unsetISOCurrency();
    
    /**
     * Gets the "AgentDutyCode" attribute
     */
    java.lang.String getAgentDutyCode();
    
    /**
     * Gets (as xml) the "AgentDutyCode" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To16 xgetAgentDutyCode();
    
    /**
     * True if has "AgentDutyCode" attribute
     */
    boolean isSetAgentDutyCode();
    
    /**
     * Sets the "AgentDutyCode" attribute
     */
    void setAgentDutyCode(java.lang.String agentDutyCode);
    
    /**
     * Sets (as xml) the "AgentDutyCode" attribute
     */
    void xsetAgentDutyCode(org.iata.iata.x2007.x00.StringLength1To16 agentDutyCode);
    
    /**
     * Unsets the "AgentDutyCode" attribute
     */
    void unsetAgentDutyCode();
    
    /**
     * Gets the "AirlineVendorID" attribute
     */
    java.lang.String getAirlineVendorID();
    
    /**
     * Gets (as xml) the "AirlineVendorID" attribute
     */
    org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength2To3 xgetAirlineVendorID();
    
    /**
     * True if has "AirlineVendorID" attribute
     */
    boolean isSetAirlineVendorID();
    
    /**
     * Sets the "AirlineVendorID" attribute
     */
    void setAirlineVendorID(java.lang.String airlineVendorID);
    
    /**
     * Sets (as xml) the "AirlineVendorID" attribute
     */
    void xsetAirlineVendorID(org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength2To3 airlineVendorID);
    
    /**
     * Unsets the "AirlineVendorID" attribute
     */
    void unsetAirlineVendorID();
    
    /**
     * Gets the "AirportCode" attribute
     */
    java.lang.String getAirportCode();
    
    /**
     * Gets (as xml) the "AirportCode" attribute
     */
    org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength3To5 xgetAirportCode();
    
    /**
     * True if has "AirportCode" attribute
     */
    boolean isSetAirportCode();
    
    /**
     * Sets the "AirportCode" attribute
     */
    void setAirportCode(java.lang.String airportCode);
    
    /**
     * Sets (as xml) the "AirportCode" attribute
     */
    void xsetAirportCode(org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength3To5 airportCode);
    
    /**
     * Unsets the "AirportCode" attribute
     */
    void unsetAirportCode();
    
    /**
     * Gets the "FirstDepartPoint" attribute
     */
    java.lang.String getFirstDepartPoint();
    
    /**
     * Gets (as xml) the "FirstDepartPoint" attribute
     */
    org.iata.iata.x2007.x00.StringLength3 xgetFirstDepartPoint();
    
    /**
     * True if has "FirstDepartPoint" attribute
     */
    boolean isSetFirstDepartPoint();
    
    /**
     * Sets the "FirstDepartPoint" attribute
     */
    void setFirstDepartPoint(java.lang.String firstDepartPoint);
    
    /**
     * Sets (as xml) the "FirstDepartPoint" attribute
     */
    void xsetFirstDepartPoint(org.iata.iata.x2007.x00.StringLength3 firstDepartPoint);
    
    /**
     * Unsets the "FirstDepartPoint" attribute
     */
    void unsetFirstDepartPoint();
    
    /**
     * Gets the "ERSP_UserID" attribute
     */
    java.lang.String getERSPUserID();
    
    /**
     * Gets (as xml) the "ERSP_UserID" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To16 xgetERSPUserID();
    
    /**
     * True if has "ERSP_UserID" attribute
     */
    boolean isSetERSPUserID();
    
    /**
     * Sets the "ERSP_UserID" attribute
     */
    void setERSPUserID(java.lang.String erspUserID);
    
    /**
     * Sets (as xml) the "ERSP_UserID" attribute
     */
    void xsetERSPUserID(org.iata.iata.x2007.x00.StringLength1To16 erspUserID);
    
    /**
     * Unsets the "ERSP_UserID" attribute
     */
    void unsetERSPUserID();
    
    /**
     * Gets the "TerminalID" attribute
     */
    java.lang.String getTerminalID();
    
    /**
     * Gets (as xml) the "TerminalID" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetTerminalID();
    
    /**
     * True if has "TerminalID" attribute
     */
    boolean isSetTerminalID();
    
    /**
     * Sets the "TerminalID" attribute
     */
    void setTerminalID(java.lang.String terminalID);
    
    /**
     * Sets (as xml) the "TerminalID" attribute
     */
    void xsetTerminalID(org.iata.iata.x2007.x00.StringLength1To32 terminalID);
    
    /**
     * Unsets the "TerminalID" attribute
     */
    void unsetTerminalID();
    
    /**
     * An XML RequestorID(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface RequestorID extends org.iata.iata.x2007.x00.UniqueIDType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestorID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("requestorid1946elemtype");
        
        /**
         * Gets the "MessagePassword" attribute
         */
        java.lang.String getMessagePassword();
        
        /**
         * Gets (as xml) the "MessagePassword" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To16 xgetMessagePassword();
        
        /**
         * True if has "MessagePassword" attribute
         */
        boolean isSetMessagePassword();
        
        /**
         * Sets the "MessagePassword" attribute
         */
        void setMessagePassword(java.lang.String messagePassword);
        
        /**
         * Sets (as xml) the "MessagePassword" attribute
         */
        void xsetMessagePassword(org.iata.iata.x2007.x00.StringLength1To16 messagePassword);
        
        /**
         * Unsets the "MessagePassword" attribute
         */
        void unsetMessagePassword();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.SourceType.RequestorID newInstance() {
              return (org.iata.iata.x2007.x00.SourceType.RequestorID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.SourceType.RequestorID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.SourceType.RequestorID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Position(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface Position extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Position.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("position5492elemtype");
        
        /**
         * Gets the "Latitude" attribute
         */
        java.lang.String getLatitude();
        
        /**
         * Gets (as xml) the "Latitude" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To16 xgetLatitude();
        
        /**
         * True if has "Latitude" attribute
         */
        boolean isSetLatitude();
        
        /**
         * Sets the "Latitude" attribute
         */
        void setLatitude(java.lang.String latitude);
        
        /**
         * Sets (as xml) the "Latitude" attribute
         */
        void xsetLatitude(org.iata.iata.x2007.x00.StringLength1To16 latitude);
        
        /**
         * Unsets the "Latitude" attribute
         */
        void unsetLatitude();
        
        /**
         * Gets the "Longitude" attribute
         */
        java.lang.String getLongitude();
        
        /**
         * Gets (as xml) the "Longitude" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To16 xgetLongitude();
        
        /**
         * True if has "Longitude" attribute
         */
        boolean isSetLongitude();
        
        /**
         * Sets the "Longitude" attribute
         */
        void setLongitude(java.lang.String longitude);
        
        /**
         * Sets (as xml) the "Longitude" attribute
         */
        void xsetLongitude(org.iata.iata.x2007.x00.StringLength1To16 longitude);
        
        /**
         * Unsets the "Longitude" attribute
         */
        void unsetLongitude();
        
        /**
         * Gets the "Altitude" attribute
         */
        java.lang.String getAltitude();
        
        /**
         * Gets (as xml) the "Altitude" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To16 xgetAltitude();
        
        /**
         * True if has "Altitude" attribute
         */
        boolean isSetAltitude();
        
        /**
         * Sets the "Altitude" attribute
         */
        void setAltitude(java.lang.String altitude);
        
        /**
         * Sets (as xml) the "Altitude" attribute
         */
        void xsetAltitude(org.iata.iata.x2007.x00.StringLength1To16 altitude);
        
        /**
         * Unsets the "Altitude" attribute
         */
        void unsetAltitude();
        
        /**
         * Gets the "AltitudeUnitOfMeasureCode" attribute
         */
        java.lang.String getAltitudeUnitOfMeasureCode();
        
        /**
         * Gets (as xml) the "AltitudeUnitOfMeasureCode" attribute
         */
        org.iata.iata.x2007.x00.IATACodeType xgetAltitudeUnitOfMeasureCode();
        
        /**
         * True if has "AltitudeUnitOfMeasureCode" attribute
         */
        boolean isSetAltitudeUnitOfMeasureCode();
        
        /**
         * Sets the "AltitudeUnitOfMeasureCode" attribute
         */
        void setAltitudeUnitOfMeasureCode(java.lang.String altitudeUnitOfMeasureCode);
        
        /**
         * Sets (as xml) the "AltitudeUnitOfMeasureCode" attribute
         */
        void xsetAltitudeUnitOfMeasureCode(org.iata.iata.x2007.x00.IATACodeType altitudeUnitOfMeasureCode);
        
        /**
         * Unsets the "AltitudeUnitOfMeasureCode" attribute
         */
        void unsetAltitudeUnitOfMeasureCode();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.SourceType.Position newInstance() {
              return (org.iata.iata.x2007.x00.SourceType.Position) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.SourceType.Position newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.SourceType.Position) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML BookingChannel(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface BookingChannel extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BookingChannel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("bookingchannel6e13elemtype");
        
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
         * Gets the "Primary" attribute
         */
        boolean getPrimary();
        
        /**
         * Gets (as xml) the "Primary" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetPrimary();
        
        /**
         * True if has "Primary" attribute
         */
        boolean isSetPrimary();
        
        /**
         * Sets the "Primary" attribute
         */
        void setPrimary(boolean primary);
        
        /**
         * Sets (as xml) the "Primary" attribute
         */
        void xsetPrimary(org.apache.xmlbeans.XmlBoolean primary);
        
        /**
         * Unsets the "Primary" attribute
         */
        void unsetPrimary();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.SourceType.BookingChannel newInstance() {
              return (org.iata.iata.x2007.x00.SourceType.BookingChannel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.SourceType.BookingChannel newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.SourceType.BookingChannel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.SourceType newInstance() {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.SourceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.SourceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.SourceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.SourceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.SourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.SourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.SourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
