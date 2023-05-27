/*
 * XML Type:  DirectBillType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.DirectBillType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML DirectBillType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface DirectBillType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DirectBillType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("directbilltype7198type");
    
    /**
     * Gets the "CompanyName" element
     */
    org.iata.iata.x2007.x00.DirectBillType.CompanyName getCompanyName();
    
    /**
     * True if has "CompanyName" element
     */
    boolean isSetCompanyName();
    
    /**
     * Sets the "CompanyName" element
     */
    void setCompanyName(org.iata.iata.x2007.x00.DirectBillType.CompanyName companyName);
    
    /**
     * Appends and returns a new empty "CompanyName" element
     */
    org.iata.iata.x2007.x00.DirectBillType.CompanyName addNewCompanyName();
    
    /**
     * Unsets the "CompanyName" element
     */
    void unsetCompanyName();
    
    /**
     * Gets the "Address" element
     */
    org.iata.iata.x2007.x00.AddressType getAddress();
    
    /**
     * True if has "Address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "Address" element
     */
    void setAddress(org.iata.iata.x2007.x00.AddressType address);
    
    /**
     * Appends and returns a new empty "Address" element
     */
    org.iata.iata.x2007.x00.AddressType addNewAddress();
    
    /**
     * Unsets the "Address" element
     */
    void unsetAddress();
    
    /**
     * Gets the "ShareSynchInd" attribute
     */
    org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd.Enum getShareSynchInd();
    
    /**
     * Gets (as xml) the "ShareSynchInd" attribute
     */
    org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd xgetShareSynchInd();
    
    /**
     * True if has "ShareSynchInd" attribute
     */
    boolean isSetShareSynchInd();
    
    /**
     * Sets the "ShareSynchInd" attribute
     */
    void setShareSynchInd(org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd.Enum shareSynchInd);
    
    /**
     * Sets (as xml) the "ShareSynchInd" attribute
     */
    void xsetShareSynchInd(org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd shareSynchInd);
    
    /**
     * Unsets the "ShareSynchInd" attribute
     */
    void unsetShareSynchInd();
    
    /**
     * Gets the "ShareMarketInd" attribute
     */
    org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd.Enum getShareMarketInd();
    
    /**
     * Gets (as xml) the "ShareMarketInd" attribute
     */
    org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd xgetShareMarketInd();
    
    /**
     * True if has "ShareMarketInd" attribute
     */
    boolean isSetShareMarketInd();
    
    /**
     * Sets the "ShareMarketInd" attribute
     */
    void setShareMarketInd(org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd.Enum shareMarketInd);
    
    /**
     * Sets (as xml) the "ShareMarketInd" attribute
     */
    void xsetShareMarketInd(org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd shareMarketInd);
    
    /**
     * Unsets the "ShareMarketInd" attribute
     */
    void unsetShareMarketInd();
    
    /**
     * Gets the "DirectBill_ID" attribute
     */
    java.lang.String getDirectBillID();
    
    /**
     * Gets (as xml) the "DirectBill_ID" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetDirectBillID();
    
    /**
     * True if has "DirectBill_ID" attribute
     */
    boolean isSetDirectBillID();
    
    /**
     * Sets the "DirectBill_ID" attribute
     */
    void setDirectBillID(java.lang.String directBillID);
    
    /**
     * Sets (as xml) the "DirectBill_ID" attribute
     */
    void xsetDirectBillID(org.iata.iata.x2007.x00.StringLength1To32 directBillID);
    
    /**
     * Unsets the "DirectBill_ID" attribute
     */
    void unsetDirectBillID();
    
    /**
     * An XML CompanyName(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.DirectBillType$CompanyName.
     */
    public interface CompanyName extends org.iata.iata.x2007.x00.CompanyNameType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompanyName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("companyname418celemtype");
        
        /**
         * Gets the "ContactName" attribute
         */
        java.lang.String getContactName();
        
        /**
         * Gets (as xml) the "ContactName" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To64 xgetContactName();
        
        /**
         * True if has "ContactName" attribute
         */
        boolean isSetContactName();
        
        /**
         * Sets the "ContactName" attribute
         */
        void setContactName(java.lang.String contactName);
        
        /**
         * Sets (as xml) the "ContactName" attribute
         */
        void xsetContactName(org.iata.iata.x2007.x00.StringLength1To64 contactName);
        
        /**
         * Unsets the "ContactName" attribute
         */
        void unsetContactName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.DirectBillType.CompanyName newInstance() {
              return (org.iata.iata.x2007.x00.DirectBillType.CompanyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.DirectBillType.CompanyName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.DirectBillType.CompanyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ShareSynchInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.DirectBillType$ShareSynchInd.
     */
    public interface ShareSynchInd extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShareSynchInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("sharesynchind0711attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum YES = Enum.forString("Yes");
        static final Enum NO = Enum.forString("No");
        static final Enum INHERIT = Enum.forString("Inherit");
        
        static final int INT_YES = Enum.INT_YES;
        static final int INT_NO = Enum.INT_NO;
        static final int INT_INHERIT = Enum.INT_INHERIT;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.DirectBillType$ShareSynchInd.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_YES
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
            
            static final int INT_YES = 1;
            static final int INT_NO = 2;
            static final int INT_INHERIT = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Yes", INT_YES),
                    new Enum("No", INT_NO),
                    new Enum("Inherit", INT_INHERIT),
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
            public static org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd newInstance() {
              return (org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ShareMarketInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.DirectBillType$ShareMarketInd.
     */
    public interface ShareMarketInd extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShareMarketInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("sharemarketinda0bcattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum YES = Enum.forString("Yes");
        static final Enum NO = Enum.forString("No");
        static final Enum INHERIT = Enum.forString("Inherit");
        
        static final int INT_YES = Enum.INT_YES;
        static final int INT_NO = Enum.INT_NO;
        static final int INT_INHERIT = Enum.INT_INHERIT;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.DirectBillType$ShareMarketInd.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_YES
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
            
            static final int INT_YES = 1;
            static final int INT_NO = 2;
            static final int INT_INHERIT = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Yes", INT_YES),
                    new Enum("No", INT_NO),
                    new Enum("Inherit", INT_INHERIT),
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
            public static org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd newInstance() {
              return (org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.DirectBillType newInstance() {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.DirectBillType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.DirectBillType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.DirectBillType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.DirectBillType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.DirectBillType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.DirectBillType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
