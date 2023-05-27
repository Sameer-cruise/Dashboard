/*
 * XML Type:  FlightSegmentBaseType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FlightSegmentBaseType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML FlightSegmentBaseType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface FlightSegmentBaseType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightSegmentBaseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flightsegmentbasetype2106type");
    
    /**
     * Gets the "DepartureAirport" element
     */
    org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport getDepartureAirport();
    
    /**
     * True if has "DepartureAirport" element
     */
    boolean isSetDepartureAirport();
    
    /**
     * Sets the "DepartureAirport" element
     */
    void setDepartureAirport(org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport departureAirport);
    
    /**
     * Appends and returns a new empty "DepartureAirport" element
     */
    org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport addNewDepartureAirport();
    
    /**
     * Unsets the "DepartureAirport" element
     */
    void unsetDepartureAirport();
    
    /**
     * Gets the "ArrivalAirport" element
     */
    org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport getArrivalAirport();
    
    /**
     * True if has "ArrivalAirport" element
     */
    boolean isSetArrivalAirport();
    
    /**
     * Sets the "ArrivalAirport" element
     */
    void setArrivalAirport(org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport arrivalAirport);
    
    /**
     * Appends and returns a new empty "ArrivalAirport" element
     */
    org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport addNewArrivalAirport();
    
    /**
     * Unsets the "ArrivalAirport" element
     */
    void unsetArrivalAirport();
    
    /**
     * Gets the "OperatingAirline" element
     */
    org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline getOperatingAirline();
    
    /**
     * True if has "OperatingAirline" element
     */
    boolean isSetOperatingAirline();
    
    /**
     * Sets the "OperatingAirline" element
     */
    void setOperatingAirline(org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline operatingAirline);
    
    /**
     * Appends and returns a new empty "OperatingAirline" element
     */
    org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline addNewOperatingAirline();
    
    /**
     * Unsets the "OperatingAirline" element
     */
    void unsetOperatingAirline();
    
    /**
     * Gets array of all "Equipment" elements
     */
    org.iata.iata.x2007.x00.EquipmentType[] getEquipmentArray();
    
    /**
     * Gets ith "Equipment" element
     */
    org.iata.iata.x2007.x00.EquipmentType getEquipmentArray(int i);
    
    /**
     * Returns number of "Equipment" element
     */
    int sizeOfEquipmentArray();
    
    /**
     * Sets array of all "Equipment" element
     */
    void setEquipmentArray(org.iata.iata.x2007.x00.EquipmentType[] equipmentArray);
    
    /**
     * Sets ith "Equipment" element
     */
    void setEquipmentArray(int i, org.iata.iata.x2007.x00.EquipmentType equipment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Equipment" element
     */
    org.iata.iata.x2007.x00.EquipmentType insertNewEquipment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Equipment" element
     */
    org.iata.iata.x2007.x00.EquipmentType addNewEquipment();
    
    /**
     * Removes the ith "Equipment" element
     */
    void removeEquipment(int i);
    
    /**
     * Gets the "DepartureDateTime" attribute
     */
    java.util.Calendar getDepartureDateTime();
    
    /**
     * Gets (as xml) the "DepartureDateTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDepartureDateTime();
    
    /**
     * True if has "DepartureDateTime" attribute
     */
    boolean isSetDepartureDateTime();
    
    /**
     * Sets the "DepartureDateTime" attribute
     */
    void setDepartureDateTime(java.util.Calendar departureDateTime);
    
    /**
     * Sets (as xml) the "DepartureDateTime" attribute
     */
    void xsetDepartureDateTime(org.apache.xmlbeans.XmlDateTime departureDateTime);
    
    /**
     * Unsets the "DepartureDateTime" attribute
     */
    void unsetDepartureDateTime();
    
    /**
     * Gets the "ArrivalDateTime" attribute
     */
    java.util.Calendar getArrivalDateTime();
    
    /**
     * Gets (as xml) the "ArrivalDateTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetArrivalDateTime();
    
    /**
     * True if has "ArrivalDateTime" attribute
     */
    boolean isSetArrivalDateTime();
    
    /**
     * Sets the "ArrivalDateTime" attribute
     */
    void setArrivalDateTime(java.util.Calendar arrivalDateTime);
    
    /**
     * Sets (as xml) the "ArrivalDateTime" attribute
     */
    void xsetArrivalDateTime(org.apache.xmlbeans.XmlDateTime arrivalDateTime);
    
    /**
     * Unsets the "ArrivalDateTime" attribute
     */
    void unsetArrivalDateTime();
    
    /**
     * Gets the "StopQuantity" attribute
     */
    java.math.BigInteger getStopQuantity();
    
    /**
     * Gets (as xml) the "StopQuantity" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetStopQuantity();
    
    /**
     * True if has "StopQuantity" attribute
     */
    boolean isSetStopQuantity();
    
    /**
     * Sets the "StopQuantity" attribute
     */
    void setStopQuantity(java.math.BigInteger stopQuantity);
    
    /**
     * Sets (as xml) the "StopQuantity" attribute
     */
    void xsetStopQuantity(org.apache.xmlbeans.XmlNonNegativeInteger stopQuantity);
    
    /**
     * Unsets the "StopQuantity" attribute
     */
    void unsetStopQuantity();
    
    /**
     * Gets the "RPH" attribute
     */
    java.lang.String getRPH();
    
    /**
     * Gets (as xml) the "RPH" attribute
     */
    org.iata.iata.x2007.x00.RPHType xgetRPH();
    
    /**
     * True if has "RPH" attribute
     */
    boolean isSetRPH();
    
    /**
     * Sets the "RPH" attribute
     */
    void setRPH(java.lang.String rph);
    
    /**
     * Sets (as xml) the "RPH" attribute
     */
    void xsetRPH(org.iata.iata.x2007.x00.RPHType rph);
    
    /**
     * Unsets the "RPH" attribute
     */
    void unsetRPH();
    
    /**
     * Gets the "InfoSource" attribute
     */
    java.lang.String getInfoSource();
    
    /**
     * Gets (as xml) the "InfoSource" attribute
     */
    org.iata.iata.x2007.x00.InfoSourceType xgetInfoSource();
    
    /**
     * True if has "InfoSource" attribute
     */
    boolean isSetInfoSource();
    
    /**
     * Sets the "InfoSource" attribute
     */
    void setInfoSource(java.lang.String infoSource);
    
    /**
     * Sets (as xml) the "InfoSource" attribute
     */
    void xsetInfoSource(org.iata.iata.x2007.x00.InfoSourceType infoSource);
    
    /**
     * Unsets the "InfoSource" attribute
     */
    void unsetInfoSource();
    
    /**
     * An XML DepartureAirport(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface DepartureAirport extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DepartureAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("departureairporte673elemtype");
        
        /**
         * Gets the "LocationCode" attribute
         */
        java.lang.String getLocationCode();
        
        /**
         * Gets (as xml) the "LocationCode" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To8 xgetLocationCode();
        
        /**
         * True if has "LocationCode" attribute
         */
        boolean isSetLocationCode();
        
        /**
         * Sets the "LocationCode" attribute
         */
        void setLocationCode(java.lang.String locationCode);
        
        /**
         * Sets (as xml) the "LocationCode" attribute
         */
        void xsetLocationCode(org.iata.iata.x2007.x00.StringLength1To8 locationCode);
        
        /**
         * Unsets the "LocationCode" attribute
         */
        void unsetLocationCode();
        
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
         * Gets the "Terminal" attribute
         */
        java.lang.String getTerminal();
        
        /**
         * Gets (as xml) the "Terminal" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To16 xgetTerminal();
        
        /**
         * True if has "Terminal" attribute
         */
        boolean isSetTerminal();
        
        /**
         * Sets the "Terminal" attribute
         */
        void setTerminal(java.lang.String terminal);
        
        /**
         * Sets (as xml) the "Terminal" attribute
         */
        void xsetTerminal(org.iata.iata.x2007.x00.StringLength1To16 terminal);
        
        /**
         * Unsets the "Terminal" attribute
         */
        void unsetTerminal();
        
        /**
         * Gets the "Gate" attribute
         */
        java.lang.String getGate();
        
        /**
         * Gets (as xml) the "Gate" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To16 xgetGate();
        
        /**
         * True if has "Gate" attribute
         */
        boolean isSetGate();
        
        /**
         * Sets the "Gate" attribute
         */
        void setGate(java.lang.String gate);
        
        /**
         * Sets (as xml) the "Gate" attribute
         */
        void xsetGate(org.iata.iata.x2007.x00.StringLength1To16 gate);
        
        /**
         * Unsets the "Gate" attribute
         */
        void unsetGate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport newInstance() {
              return (org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ArrivalAirport(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface ArrivalAirport extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrivalAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("arrivalairport0b78elemtype");
        
        /**
         * Gets the "LocationCode" attribute
         */
        java.lang.String getLocationCode();
        
        /**
         * Gets (as xml) the "LocationCode" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To8 xgetLocationCode();
        
        /**
         * True if has "LocationCode" attribute
         */
        boolean isSetLocationCode();
        
        /**
         * Sets the "LocationCode" attribute
         */
        void setLocationCode(java.lang.String locationCode);
        
        /**
         * Sets (as xml) the "LocationCode" attribute
         */
        void xsetLocationCode(org.iata.iata.x2007.x00.StringLength1To8 locationCode);
        
        /**
         * Unsets the "LocationCode" attribute
         */
        void unsetLocationCode();
        
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
         * Gets the "Terminal" attribute
         */
        java.lang.String getTerminal();
        
        /**
         * Gets (as xml) the "Terminal" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To16 xgetTerminal();
        
        /**
         * True if has "Terminal" attribute
         */
        boolean isSetTerminal();
        
        /**
         * Sets the "Terminal" attribute
         */
        void setTerminal(java.lang.String terminal);
        
        /**
         * Sets (as xml) the "Terminal" attribute
         */
        void xsetTerminal(org.iata.iata.x2007.x00.StringLength1To16 terminal);
        
        /**
         * Unsets the "Terminal" attribute
         */
        void unsetTerminal();
        
        /**
         * Gets the "Gate" attribute
         */
        java.lang.String getGate();
        
        /**
         * Gets (as xml) the "Gate" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To16 xgetGate();
        
        /**
         * True if has "Gate" attribute
         */
        boolean isSetGate();
        
        /**
         * Sets the "Gate" attribute
         */
        void setGate(java.lang.String gate);
        
        /**
         * Sets (as xml) the "Gate" attribute
         */
        void xsetGate(org.iata.iata.x2007.x00.StringLength1To16 gate);
        
        /**
         * Unsets the "Gate" attribute
         */
        void unsetGate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport newInstance() {
              return (org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML OperatingAirline(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightSegmentBaseType$OperatingAirline.
     */
    public interface OperatingAirline extends org.iata.iata.x2007.x00.OperatingAirlineType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperatingAirline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("operatingairlinef6adelemtype");
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline newInstance() {
              return (org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType newInstance() {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FlightSegmentBaseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FlightSegmentBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
