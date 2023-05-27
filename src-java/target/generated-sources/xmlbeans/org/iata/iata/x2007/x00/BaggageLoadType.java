/*
 * XML Type:  BaggageLoadType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.BaggageLoadType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML BaggageLoadType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface BaggageLoadType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaggageLoadType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("baggageloadtypeecd4type");
    
    /**
     * Gets array of all "BagCount" elements
     */
    org.iata.iata.x2007.x00.BaggageLoadType.BagCount[] getBagCountArray();
    
    /**
     * Gets ith "BagCount" element
     */
    org.iata.iata.x2007.x00.BaggageLoadType.BagCount getBagCountArray(int i);
    
    /**
     * Returns number of "BagCount" element
     */
    int sizeOfBagCountArray();
    
    /**
     * Sets array of all "BagCount" element
     */
    void setBagCountArray(org.iata.iata.x2007.x00.BaggageLoadType.BagCount[] bagCountArray);
    
    /**
     * Sets ith "BagCount" element
     */
    void setBagCountArray(int i, org.iata.iata.x2007.x00.BaggageLoadType.BagCount bagCount);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BagCount" element
     */
    org.iata.iata.x2007.x00.BaggageLoadType.BagCount insertNewBagCount(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BagCount" element
     */
    org.iata.iata.x2007.x00.BaggageLoadType.BagCount addNewBagCount();
    
    /**
     * Removes the ith "BagCount" element
     */
    void removeBagCount(int i);
    
    /**
     * Gets the "Weight" element
     */
    org.iata.iata.x2007.x00.MeasurementType getWeight();
    
    /**
     * True if has "Weight" element
     */
    boolean isSetWeight();
    
    /**
     * Sets the "Weight" element
     */
    void setWeight(org.iata.iata.x2007.x00.MeasurementType weight);
    
    /**
     * Appends and returns a new empty "Weight" element
     */
    org.iata.iata.x2007.x00.MeasurementType addNewWeight();
    
    /**
     * Unsets the "Weight" element
     */
    void unsetWeight();
    
    /**
     * Gets the "ServiceClass" attribute
     */
    java.lang.String getServiceClass();
    
    /**
     * Gets (as xml) the "ServiceClass" attribute
     */
    org.iata.iata.x2007.x00.IATACodeType xgetServiceClass();
    
    /**
     * True if has "ServiceClass" attribute
     */
    boolean isSetServiceClass();
    
    /**
     * Sets the "ServiceClass" attribute
     */
    void setServiceClass(java.lang.String serviceClass);
    
    /**
     * Sets (as xml) the "ServiceClass" attribute
     */
    void xsetServiceClass(org.iata.iata.x2007.x00.IATACodeType serviceClass);
    
    /**
     * Unsets the "ServiceClass" attribute
     */
    void unsetServiceClass();
    
    /**
     * Gets the "DestinationType" attribute
     */
    org.iata.iata.x2007.x00.DestinationType.Enum getDestinationType();
    
    /**
     * Gets (as xml) the "DestinationType" attribute
     */
    org.iata.iata.x2007.x00.DestinationType xgetDestinationType();
    
    /**
     * True if has "DestinationType" attribute
     */
    boolean isSetDestinationType();
    
    /**
     * Sets the "DestinationType" attribute
     */
    void setDestinationType(org.iata.iata.x2007.x00.DestinationType.Enum destinationType);
    
    /**
     * Sets (as xml) the "DestinationType" attribute
     */
    void xsetDestinationType(org.iata.iata.x2007.x00.DestinationType destinationType);
    
    /**
     * Unsets the "DestinationType" attribute
     */
    void unsetDestinationType();
    
    /**
     * Gets the "RepeatIndex" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getRepeatIndex();
    
    /**
     * True if has "RepeatIndex" attribute
     */
    boolean isSetRepeatIndex();
    
    /**
     * Sets the "RepeatIndex" attribute
     */
    void setRepeatIndex(org.apache.xmlbeans.XmlAnySimpleType repeatIndex);
    
    /**
     * Appends and returns a new empty "RepeatIndex" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewRepeatIndex();
    
    /**
     * Unsets the "RepeatIndex" attribute
     */
    void unsetRepeatIndex();
    
    /**
     * An XML BagCount(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.BaggageLoadType$BagCount.
     */
    public interface BagCount extends org.apache.xmlbeans.XmlPositiveInteger
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BagCount.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("bagcountf951elemtype");
        
        /**
         * Gets the "Location" attribute
         */
        java.lang.String getLocation();
        
        /**
         * Gets (as xml) the "Location" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocation();
        
        /**
         * Sets the "Location" attribute
         */
        void setLocation(java.lang.String location);
        
        /**
         * Sets (as xml) the "Location" attribute
         */
        void xsetLocation(org.apache.xmlbeans.XmlString location);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.BaggageLoadType.BagCount newInstance() {
              return (org.iata.iata.x2007.x00.BaggageLoadType.BagCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.BaggageLoadType.BagCount newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.BaggageLoadType.BagCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.BaggageLoadType newInstance() {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.BaggageLoadType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.BaggageLoadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
