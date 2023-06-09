/*
 * XML Type:  AmountDeterminationType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.AmountDeterminationType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML AmountDeterminationType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.AmountDeterminationType.
 */
public interface AmountDeterminationType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AmountDeterminationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("amountdeterminationtype94cftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum INCLUSIVE = Enum.forString("Inclusive");
    static final Enum EXCLUSIVE = Enum.forString("Exclusive");
    static final Enum CUMULATIVE = Enum.forString("Cumulative");
    
    static final int INT_INCLUSIVE = Enum.INT_INCLUSIVE;
    static final int INT_EXCLUSIVE = Enum.INT_EXCLUSIVE;
    static final int INT_CUMULATIVE = Enum.INT_CUMULATIVE;
    
    /**
     * Enumeration value class for org.iata.iata.x2007.x00.AmountDeterminationType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_INCLUSIVE
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
        
        static final int INT_INCLUSIVE = 1;
        static final int INT_EXCLUSIVE = 2;
        static final int INT_CUMULATIVE = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Inclusive", INT_INCLUSIVE),
                new Enum("Exclusive", INT_EXCLUSIVE),
                new Enum("Cumulative", INT_CUMULATIVE),
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
        public static org.iata.iata.x2007.x00.AmountDeterminationType newValue(java.lang.Object obj) {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) type.newValue( obj ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType newInstance() {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.AmountDeterminationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.AmountDeterminationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
