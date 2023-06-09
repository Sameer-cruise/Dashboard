/*
 * XML Type:  FlightNumberType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FlightNumberType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML FlightNumberType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.iata.iata.x2007.x00.FlightNumberType$Member
 *     org.iata.iata.x2007.x00.FlightNumberType$Member2
 */
public interface FlightNumberType extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    /** @deprecated */
    java.lang.Object objectValue();
    /** @deprecated */
    void objectSet(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightNumberType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flightnumbertypec12ftype");
    
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightNumberType$Member.
     */
    public interface Member extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("anon5154type");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.FlightNumberType.Member newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.FlightNumberType.Member) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.FlightNumberType.Member newInstance() {
              return (org.iata.iata.x2007.x00.FlightNumberType.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightNumberType.Member newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightNumberType.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightNumberType$Member2.
     */
    public interface Member2 extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Member2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("anon02d5type");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum OPEN = Enum.forString("OPEN");
        static final Enum ARNK = Enum.forString("ARNK");
        
        static final int INT_OPEN = Enum.INT_OPEN;
        static final int INT_ARNK = Enum.INT_ARNK;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.FlightNumberType$Member2.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_OPEN
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
            
            static final int INT_OPEN = 1;
            static final int INT_ARNK = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("OPEN", INT_OPEN),
                    new Enum("ARNK", INT_ARNK),
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
            public static org.iata.iata.x2007.x00.FlightNumberType.Member2 newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.FlightNumberType.Member2) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.FlightNumberType.Member2 newInstance() {
              return (org.iata.iata.x2007.x00.FlightNumberType.Member2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightNumberType.Member2 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightNumberType.Member2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.FlightNumberType newValue(java.lang.Object obj) {
          return (org.iata.iata.x2007.x00.FlightNumberType) type.newValue( obj ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType newInstance() {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.FlightNumberType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.FlightNumberType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightNumberType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FlightNumberType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FlightNumberType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FlightNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
