/*
 * XML Type:  AddressType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.AddressType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML AddressType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface AddressType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("addresstypeee66type");
    
    /**
     * Gets the "StreetNmbr" element
     */
    org.iata.iata.x2007.x00.AddressType.StreetNmbr getStreetNmbr();
    
    /**
     * True if has "StreetNmbr" element
     */
    boolean isSetStreetNmbr();
    
    /**
     * Sets the "StreetNmbr" element
     */
    void setStreetNmbr(org.iata.iata.x2007.x00.AddressType.StreetNmbr streetNmbr);
    
    /**
     * Appends and returns a new empty "StreetNmbr" element
     */
    org.iata.iata.x2007.x00.AddressType.StreetNmbr addNewStreetNmbr();
    
    /**
     * Unsets the "StreetNmbr" element
     */
    void unsetStreetNmbr();
    
    /**
     * Gets the "BldgRoom" element
     */
    java.lang.String getBldgRoom();
    
    /**
     * Gets (as xml) the "BldgRoom" element
     */
    org.iata.iata.x2007.x00.StringLength0To64 xgetBldgRoom();
    
    /**
     * True if has "BldgRoom" element
     */
    boolean isSetBldgRoom();
    
    /**
     * Sets the "BldgRoom" element
     */
    void setBldgRoom(java.lang.String bldgRoom);
    
    /**
     * Sets (as xml) the "BldgRoom" element
     */
    void xsetBldgRoom(org.iata.iata.x2007.x00.StringLength0To64 bldgRoom);
    
    /**
     * Unsets the "BldgRoom" element
     */
    void unsetBldgRoom();
    
    /**
     * Gets array of all "AddressLine" elements
     */
    java.lang.String[] getAddressLineArray();
    
    /**
     * Gets ith "AddressLine" element
     */
    java.lang.String getAddressLineArray(int i);
    
    /**
     * Gets (as xml) array of all "AddressLine" elements
     */
    org.iata.iata.x2007.x00.StringLength1To255[] xgetAddressLineArray();
    
    /**
     * Gets (as xml) ith "AddressLine" element
     */
    org.iata.iata.x2007.x00.StringLength1To255 xgetAddressLineArray(int i);
    
    /**
     * Returns number of "AddressLine" element
     */
    int sizeOfAddressLineArray();
    
    /**
     * Sets array of all "AddressLine" element
     */
    void setAddressLineArray(java.lang.String[] addressLineArray);
    
    /**
     * Sets ith "AddressLine" element
     */
    void setAddressLineArray(int i, java.lang.String addressLine);
    
    /**
     * Sets (as xml) array of all "AddressLine" element
     */
    void xsetAddressLineArray(org.iata.iata.x2007.x00.StringLength1To255[] addressLineArray);
    
    /**
     * Sets (as xml) ith "AddressLine" element
     */
    void xsetAddressLineArray(int i, org.iata.iata.x2007.x00.StringLength1To255 addressLine);
    
    /**
     * Inserts the value as the ith "AddressLine" element
     */
    void insertAddressLine(int i, java.lang.String addressLine);
    
    /**
     * Appends the value as the last "AddressLine" element
     */
    void addAddressLine(java.lang.String addressLine);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AddressLine" element
     */
    org.iata.iata.x2007.x00.StringLength1To255 insertNewAddressLine(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AddressLine" element
     */
    org.iata.iata.x2007.x00.StringLength1To255 addNewAddressLine();
    
    /**
     * Removes the ith "AddressLine" element
     */
    void removeAddressLine(int i);
    
    /**
     * Gets the "CityName" element
     */
    java.lang.String getCityName();
    
    /**
     * Gets (as xml) the "CityName" element
     */
    org.iata.iata.x2007.x00.StringLength1To64 xgetCityName();
    
    /**
     * True if has "CityName" element
     */
    boolean isSetCityName();
    
    /**
     * Sets the "CityName" element
     */
    void setCityName(java.lang.String cityName);
    
    /**
     * Sets (as xml) the "CityName" element
     */
    void xsetCityName(org.iata.iata.x2007.x00.StringLength1To64 cityName);
    
    /**
     * Unsets the "CityName" element
     */
    void unsetCityName();
    
    /**
     * Gets the "PostalCode" element
     */
    java.lang.String getPostalCode();
    
    /**
     * Gets (as xml) the "PostalCode" element
     */
    org.iata.iata.x2007.x00.StringLength1To16 xgetPostalCode();
    
    /**
     * True if has "PostalCode" element
     */
    boolean isSetPostalCode();
    
    /**
     * Sets the "PostalCode" element
     */
    void setPostalCode(java.lang.String postalCode);
    
    /**
     * Sets (as xml) the "PostalCode" element
     */
    void xsetPostalCode(org.iata.iata.x2007.x00.StringLength1To16 postalCode);
    
    /**
     * Unsets the "PostalCode" element
     */
    void unsetPostalCode();
    
    /**
     * Gets the "County" element
     */
    java.lang.String getCounty();
    
    /**
     * Gets (as xml) the "County" element
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetCounty();
    
    /**
     * True if has "County" element
     */
    boolean isSetCounty();
    
    /**
     * Sets the "County" element
     */
    void setCounty(java.lang.String county);
    
    /**
     * Sets (as xml) the "County" element
     */
    void xsetCounty(org.iata.iata.x2007.x00.StringLength1To32 county);
    
    /**
     * Unsets the "County" element
     */
    void unsetCounty();
    
    /**
     * Gets the "StateProv" element
     */
    org.iata.iata.x2007.x00.StateProvType getStateProv();
    
    /**
     * True if has "StateProv" element
     */
    boolean isSetStateProv();
    
    /**
     * Sets the "StateProv" element
     */
    void setStateProv(org.iata.iata.x2007.x00.StateProvType stateProv);
    
    /**
     * Appends and returns a new empty "StateProv" element
     */
    org.iata.iata.x2007.x00.StateProvType addNewStateProv();
    
    /**
     * Unsets the "StateProv" element
     */
    void unsetStateProv();
    
    /**
     * Gets the "CountryName" element
     */
    org.iata.iata.x2007.x00.CountryNameType getCountryName();
    
    /**
     * True if has "CountryName" element
     */
    boolean isSetCountryName();
    
    /**
     * Sets the "CountryName" element
     */
    void setCountryName(org.iata.iata.x2007.x00.CountryNameType countryName);
    
    /**
     * Appends and returns a new empty "CountryName" element
     */
    org.iata.iata.x2007.x00.CountryNameType addNewCountryName();
    
    /**
     * Unsets the "CountryName" element
     */
    void unsetCountryName();
    
    /**
     * Gets the "FormattedInd" attribute
     */
    boolean getFormattedInd();
    
    /**
     * Gets (as xml) the "FormattedInd" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFormattedInd();
    
    /**
     * True if has "FormattedInd" attribute
     */
    boolean isSetFormattedInd();
    
    /**
     * Sets the "FormattedInd" attribute
     */
    void setFormattedInd(boolean formattedInd);
    
    /**
     * Sets (as xml) the "FormattedInd" attribute
     */
    void xsetFormattedInd(org.apache.xmlbeans.XmlBoolean formattedInd);
    
    /**
     * Unsets the "FormattedInd" attribute
     */
    void unsetFormattedInd();
    
    /**
     * Gets the "DefaultInd" attribute
     */
    boolean getDefaultInd();
    
    /**
     * Gets (as xml) the "DefaultInd" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDefaultInd();
    
    /**
     * True if has "DefaultInd" attribute
     */
    boolean isSetDefaultInd();
    
    /**
     * Sets the "DefaultInd" attribute
     */
    void setDefaultInd(boolean defaultInd);
    
    /**
     * Sets (as xml) the "DefaultInd" attribute
     */
    void xsetDefaultInd(org.apache.xmlbeans.XmlBoolean defaultInd);
    
    /**
     * Unsets the "DefaultInd" attribute
     */
    void unsetDefaultInd();
    
    /**
     * Gets the "UseType" attribute
     */
    java.lang.String getUseType();
    
    /**
     * Gets (as xml) the "UseType" attribute
     */
    org.iata.iata.x2007.x00.IATACodeType xgetUseType();
    
    /**
     * True if has "UseType" attribute
     */
    boolean isSetUseType();
    
    /**
     * Sets the "UseType" attribute
     */
    void setUseType(java.lang.String useType);
    
    /**
     * Sets (as xml) the "UseType" attribute
     */
    void xsetUseType(org.iata.iata.x2007.x00.IATACodeType useType);
    
    /**
     * Unsets the "UseType" attribute
     */
    void unsetUseType();
    
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
     * An XML StreetNmbr(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface StreetNmbr extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StreetNmbr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("streetnmbr5cf8elemtype");
        
        /**
         * Gets the "POBox" attribute
         */
        java.lang.String getPOBox();
        
        /**
         * Gets (as xml) the "POBox" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To16 xgetPOBox();
        
        /**
         * True if has "POBox" attribute
         */
        boolean isSetPOBox();
        
        /**
         * Sets the "POBox" attribute
         */
        void setPOBox(java.lang.String poBox);
        
        /**
         * Sets (as xml) the "POBox" attribute
         */
        void xsetPOBox(org.iata.iata.x2007.x00.StringLength1To16 poBox);
        
        /**
         * Unsets the "POBox" attribute
         */
        void unsetPOBox();
        
        /**
         * Gets the "StreetNmbrSuffix" attribute
         */
        java.lang.String getStreetNmbrSuffix();
        
        /**
         * Gets (as xml) the "StreetNmbrSuffix" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To8 xgetStreetNmbrSuffix();
        
        /**
         * True if has "StreetNmbrSuffix" attribute
         */
        boolean isSetStreetNmbrSuffix();
        
        /**
         * Sets the "StreetNmbrSuffix" attribute
         */
        void setStreetNmbrSuffix(java.lang.String streetNmbrSuffix);
        
        /**
         * Sets (as xml) the "StreetNmbrSuffix" attribute
         */
        void xsetStreetNmbrSuffix(org.iata.iata.x2007.x00.StringLength1To8 streetNmbrSuffix);
        
        /**
         * Unsets the "StreetNmbrSuffix" attribute
         */
        void unsetStreetNmbrSuffix();
        
        /**
         * Gets the "StreetDirection" attribute
         */
        java.lang.String getStreetDirection();
        
        /**
         * Gets (as xml) the "StreetDirection" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To8 xgetStreetDirection();
        
        /**
         * True if has "StreetDirection" attribute
         */
        boolean isSetStreetDirection();
        
        /**
         * Sets the "StreetDirection" attribute
         */
        void setStreetDirection(java.lang.String streetDirection);
        
        /**
         * Sets (as xml) the "StreetDirection" attribute
         */
        void xsetStreetDirection(org.iata.iata.x2007.x00.StringLength1To8 streetDirection);
        
        /**
         * Unsets the "StreetDirection" attribute
         */
        void unsetStreetDirection();
        
        /**
         * Gets the "RuralRouteNmbr" attribute
         */
        java.lang.String getRuralRouteNmbr();
        
        /**
         * Gets (as xml) the "RuralRouteNmbr" attribute
         */
        org.iata.iata.x2007.x00.NumericStringLength1To5 xgetRuralRouteNmbr();
        
        /**
         * True if has "RuralRouteNmbr" attribute
         */
        boolean isSetRuralRouteNmbr();
        
        /**
         * Sets the "RuralRouteNmbr" attribute
         */
        void setRuralRouteNmbr(java.lang.String ruralRouteNmbr);
        
        /**
         * Sets (as xml) the "RuralRouteNmbr" attribute
         */
        void xsetRuralRouteNmbr(org.iata.iata.x2007.x00.NumericStringLength1To5 ruralRouteNmbr);
        
        /**
         * Unsets the "RuralRouteNmbr" attribute
         */
        void unsetRuralRouteNmbr();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.AddressType.StreetNmbr newInstance() {
              return (org.iata.iata.x2007.x00.AddressType.StreetNmbr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.AddressType.StreetNmbr newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.AddressType.StreetNmbr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.AddressType newInstance() {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.AddressType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.AddressType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.AddressType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.AddressType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.AddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.AddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
