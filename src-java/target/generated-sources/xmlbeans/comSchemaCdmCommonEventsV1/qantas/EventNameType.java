/*
 * XML Type:  EventNameType
 * Namespace: urn:www.qantas.com:schema:cdm:common:Events:v1
 * Java type: comSchemaCdmCommonEventsV1.qantas.EventNameType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmCommonEventsV1.qantas;


/**
 * An XML EventNameType(@urn:www.qantas.com:schema:cdm:common:Events:v1).
 *
 * This is an atomic type that is a restriction of comSchemaCdmCommonEventsV1.qantas.EventNameType.
 */
public interface EventNameType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("eventnametype739ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AIRCRAFT_CHANGE = Enum.forString("AIRCRAFT_CHANGE");
    static final Enum ESTIMATE_CHANGE = Enum.forString("ESTIMATE_CHANGE");
    static final Enum BOARDING_STATUS_CHANGE = Enum.forString("BOARDING_STATUS_CHANGE");
    static final Enum BLOCKS_OFF = Enum.forString("BLOCKS_OFF");
    static final Enum BLOCKS_ON = Enum.forString("BLOCKS_ON");
    static final Enum WHEEL_OFF = Enum.forString("WHEEL_OFF");
    static final Enum WHEEL_ON = Enum.forString("WHEEL_ON");
    static final Enum GROUND_RETURN = Enum.forString("GROUND_RETURN");
    static final Enum AIR_RETURN = Enum.forString("AIR_RETURN");
    static final Enum AIR_DIVERSION = Enum.forString("AIR_DIVERSION");
    static final Enum FLIGHT_CANCEL = Enum.forString("FLIGHT_CANCEL");
    static final Enum FLIGHT_DELETE = Enum.forString("FLIGHT_DELETE");
    static final Enum SCHEDULE_CHANGE = Enum.forString("SCHEDULE_CHANGE");
    static final Enum FLIGHT_PLAN = Enum.forString("FLIGHT_PLAN");
    static final Enum FLIGHT_DELAY = Enum.forString("FLIGHT_DELAY");
    
    static final int INT_AIRCRAFT_CHANGE = Enum.INT_AIRCRAFT_CHANGE;
    static final int INT_ESTIMATE_CHANGE = Enum.INT_ESTIMATE_CHANGE;
    static final int INT_BOARDING_STATUS_CHANGE = Enum.INT_BOARDING_STATUS_CHANGE;
    static final int INT_BLOCKS_OFF = Enum.INT_BLOCKS_OFF;
    static final int INT_BLOCKS_ON = Enum.INT_BLOCKS_ON;
    static final int INT_WHEEL_OFF = Enum.INT_WHEEL_OFF;
    static final int INT_WHEEL_ON = Enum.INT_WHEEL_ON;
    static final int INT_GROUND_RETURN = Enum.INT_GROUND_RETURN;
    static final int INT_AIR_RETURN = Enum.INT_AIR_RETURN;
    static final int INT_AIR_DIVERSION = Enum.INT_AIR_DIVERSION;
    static final int INT_FLIGHT_CANCEL = Enum.INT_FLIGHT_CANCEL;
    static final int INT_FLIGHT_DELETE = Enum.INT_FLIGHT_DELETE;
    static final int INT_SCHEDULE_CHANGE = Enum.INT_SCHEDULE_CHANGE;
    static final int INT_FLIGHT_PLAN = Enum.INT_FLIGHT_PLAN;
    static final int INT_FLIGHT_DELAY = Enum.INT_FLIGHT_DELAY;
    
    /**
     * Enumeration value class for comSchemaCdmCommonEventsV1.qantas.EventNameType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AIRCRAFT_CHANGE
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
        
        static final int INT_AIRCRAFT_CHANGE = 1;
        static final int INT_ESTIMATE_CHANGE = 2;
        static final int INT_BOARDING_STATUS_CHANGE = 3;
        static final int INT_BLOCKS_OFF = 4;
        static final int INT_BLOCKS_ON = 5;
        static final int INT_WHEEL_OFF = 6;
        static final int INT_WHEEL_ON = 7;
        static final int INT_GROUND_RETURN = 8;
        static final int INT_AIR_RETURN = 9;
        static final int INT_AIR_DIVERSION = 10;
        static final int INT_FLIGHT_CANCEL = 11;
        static final int INT_FLIGHT_DELETE = 12;
        static final int INT_SCHEDULE_CHANGE = 13;
        static final int INT_FLIGHT_PLAN = 14;
        static final int INT_FLIGHT_DELAY = 15;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("AIRCRAFT_CHANGE", INT_AIRCRAFT_CHANGE),
                new Enum("ESTIMATE_CHANGE", INT_ESTIMATE_CHANGE),
                new Enum("BOARDING_STATUS_CHANGE", INT_BOARDING_STATUS_CHANGE),
                new Enum("BLOCKS_OFF", INT_BLOCKS_OFF),
                new Enum("BLOCKS_ON", INT_BLOCKS_ON),
                new Enum("WHEEL_OFF", INT_WHEEL_OFF),
                new Enum("WHEEL_ON", INT_WHEEL_ON),
                new Enum("GROUND_RETURN", INT_GROUND_RETURN),
                new Enum("AIR_RETURN", INT_AIR_RETURN),
                new Enum("AIR_DIVERSION", INT_AIR_DIVERSION),
                new Enum("FLIGHT_CANCEL", INT_FLIGHT_CANCEL),
                new Enum("FLIGHT_DELETE", INT_FLIGHT_DELETE),
                new Enum("SCHEDULE_CHANGE", INT_SCHEDULE_CHANGE),
                new Enum("FLIGHT_PLAN", INT_FLIGHT_PLAN),
                new Enum("FLIGHT_DELAY", INT_FLIGHT_DELAY),
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
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType newValue(java.lang.Object obj) {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) type.newValue( obj ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType newInstance() {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmCommonEventsV1.qantas.EventNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmCommonEventsV1.qantas.EventNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
