/*
 * XML Type:  MeasurementUnitType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.MeasurementUnitType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML MeasurementUnitType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.MeasurementUnitType.
 */
public interface MeasurementUnitType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MeasurementUnitType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("measurementunittypef97atype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum KILOGRAM = Enum.forString("Kilogram");
    static final Enum POUND = Enum.forString("Pound");
    static final Enum TON = Enum.forString("Ton");
    static final Enum TONNE = Enum.forString("Tonne");
    static final Enum LITRE = Enum.forString("Litre");
    static final Enum US_GALLON = Enum.forString("USGallon");
    static final Enum IMPERIAL_GALLON = Enum.forString("ImperialGallon");
    
    static final int INT_KILOGRAM = Enum.INT_KILOGRAM;
    static final int INT_POUND = Enum.INT_POUND;
    static final int INT_TON = Enum.INT_TON;
    static final int INT_TONNE = Enum.INT_TONNE;
    static final int INT_LITRE = Enum.INT_LITRE;
    static final int INT_US_GALLON = Enum.INT_US_GALLON;
    static final int INT_IMPERIAL_GALLON = Enum.INT_IMPERIAL_GALLON;
    
    /**
     * Enumeration value class for org.iata.iata.x2007.x00.MeasurementUnitType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_KILOGRAM
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
        
        static final int INT_KILOGRAM = 1;
        static final int INT_POUND = 2;
        static final int INT_TON = 3;
        static final int INT_TONNE = 4;
        static final int INT_LITRE = 5;
        static final int INT_US_GALLON = 6;
        static final int INT_IMPERIAL_GALLON = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Kilogram", INT_KILOGRAM),
                new Enum("Pound", INT_POUND),
                new Enum("Ton", INT_TON),
                new Enum("Tonne", INT_TONNE),
                new Enum("Litre", INT_LITRE),
                new Enum("USGallon", INT_US_GALLON),
                new Enum("ImperialGallon", INT_IMPERIAL_GALLON),
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
        public static org.iata.iata.x2007.x00.MeasurementUnitType newValue(java.lang.Object obj) {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) type.newValue( obj ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType newInstance() {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.MeasurementUnitType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.MeasurementUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
