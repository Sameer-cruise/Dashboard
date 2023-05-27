/*
 * XML Type:  BankAcctType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.BankAcctType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML BankAcctType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface BankAcctType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BankAcctType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("bankaccttype8dd9type");
    
    /**
     * Gets the "BankAcctName" element
     */
    java.lang.String getBankAcctName();
    
    /**
     * Gets (as xml) the "BankAcctName" element
     */
    org.iata.iata.x2007.x00.StringLength1To64 xgetBankAcctName();
    
    /**
     * True if has "BankAcctName" element
     */
    boolean isSetBankAcctName();
    
    /**
     * Sets the "BankAcctName" element
     */
    void setBankAcctName(java.lang.String bankAcctName);
    
    /**
     * Sets (as xml) the "BankAcctName" element
     */
    void xsetBankAcctName(org.iata.iata.x2007.x00.StringLength1To64 bankAcctName);
    
    /**
     * Unsets the "BankAcctName" element
     */
    void unsetBankAcctName();
    
    /**
     * Gets the "ShareSynchInd" attribute
     */
    org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd.Enum getShareSynchInd();
    
    /**
     * Gets (as xml) the "ShareSynchInd" attribute
     */
    org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd xgetShareSynchInd();
    
    /**
     * True if has "ShareSynchInd" attribute
     */
    boolean isSetShareSynchInd();
    
    /**
     * Sets the "ShareSynchInd" attribute
     */
    void setShareSynchInd(org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd.Enum shareSynchInd);
    
    /**
     * Sets (as xml) the "ShareSynchInd" attribute
     */
    void xsetShareSynchInd(org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd shareSynchInd);
    
    /**
     * Unsets the "ShareSynchInd" attribute
     */
    void unsetShareSynchInd();
    
    /**
     * Gets the "ShareMarketInd" attribute
     */
    org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd.Enum getShareMarketInd();
    
    /**
     * Gets (as xml) the "ShareMarketInd" attribute
     */
    org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd xgetShareMarketInd();
    
    /**
     * True if has "ShareMarketInd" attribute
     */
    boolean isSetShareMarketInd();
    
    /**
     * Sets the "ShareMarketInd" attribute
     */
    void setShareMarketInd(org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd.Enum shareMarketInd);
    
    /**
     * Sets (as xml) the "ShareMarketInd" attribute
     */
    void xsetShareMarketInd(org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd shareMarketInd);
    
    /**
     * Unsets the "ShareMarketInd" attribute
     */
    void unsetShareMarketInd();
    
    /**
     * Gets the "BankID" attribute
     */
    java.lang.String getBankID();
    
    /**
     * Gets (as xml) the "BankID" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To64 xgetBankID();
    
    /**
     * True if has "BankID" attribute
     */
    boolean isSetBankID();
    
    /**
     * Sets the "BankID" attribute
     */
    void setBankID(java.lang.String bankID);
    
    /**
     * Sets (as xml) the "BankID" attribute
     */
    void xsetBankID(org.iata.iata.x2007.x00.StringLength1To64 bankID);
    
    /**
     * Unsets the "BankID" attribute
     */
    void unsetBankID();
    
    /**
     * Gets the "AcctType" attribute
     */
    java.lang.String getAcctType();
    
    /**
     * Gets (as xml) the "AcctType" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetAcctType();
    
    /**
     * True if has "AcctType" attribute
     */
    boolean isSetAcctType();
    
    /**
     * Sets the "AcctType" attribute
     */
    void setAcctType(java.lang.String acctType);
    
    /**
     * Sets (as xml) the "AcctType" attribute
     */
    void xsetAcctType(org.iata.iata.x2007.x00.StringLength1To32 acctType);
    
    /**
     * Unsets the "AcctType" attribute
     */
    void unsetAcctType();
    
    /**
     * Gets the "BankAcctNumber" attribute
     */
    java.lang.String getBankAcctNumber();
    
    /**
     * Gets (as xml) the "BankAcctNumber" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetBankAcctNumber();
    
    /**
     * True if has "BankAcctNumber" attribute
     */
    boolean isSetBankAcctNumber();
    
    /**
     * Sets the "BankAcctNumber" attribute
     */
    void setBankAcctNumber(java.lang.String bankAcctNumber);
    
    /**
     * Sets (as xml) the "BankAcctNumber" attribute
     */
    void xsetBankAcctNumber(org.iata.iata.x2007.x00.StringLength1To32 bankAcctNumber);
    
    /**
     * Unsets the "BankAcctNumber" attribute
     */
    void unsetBankAcctNumber();
    
    /**
     * Gets the "ChecksAcceptedInd" attribute
     */
    boolean getChecksAcceptedInd();
    
    /**
     * Gets (as xml) the "ChecksAcceptedInd" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetChecksAcceptedInd();
    
    /**
     * True if has "ChecksAcceptedInd" attribute
     */
    boolean isSetChecksAcceptedInd();
    
    /**
     * Sets the "ChecksAcceptedInd" attribute
     */
    void setChecksAcceptedInd(boolean checksAcceptedInd);
    
    /**
     * Sets (as xml) the "ChecksAcceptedInd" attribute
     */
    void xsetChecksAcceptedInd(org.apache.xmlbeans.XmlBoolean checksAcceptedInd);
    
    /**
     * Unsets the "ChecksAcceptedInd" attribute
     */
    void unsetChecksAcceptedInd();
    
    /**
     * An XML ShareSynchInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.BankAcctType$ShareSynchInd.
     */
    public interface ShareSynchInd extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShareSynchInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("sharesynchind2d92attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum YES = Enum.forString("Yes");
        static final Enum NO = Enum.forString("No");
        static final Enum INHERIT = Enum.forString("Inherit");
        
        static final int INT_YES = Enum.INT_YES;
        static final int INT_NO = Enum.INT_NO;
        static final int INT_INHERIT = Enum.INT_INHERIT;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.BankAcctType$ShareSynchInd.
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
            public static org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd newInstance() {
              return (org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ShareMarketInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.BankAcctType$ShareMarketInd.
     */
    public interface ShareMarketInd extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShareMarketInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("sharemarketind35fdattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum YES = Enum.forString("Yes");
        static final Enum NO = Enum.forString("No");
        static final Enum INHERIT = Enum.forString("Inherit");
        
        static final int INT_YES = Enum.INT_YES;
        static final int INT_NO = Enum.INT_NO;
        static final int INT_INHERIT = Enum.INT_INHERIT;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.BankAcctType$ShareMarketInd.
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
            public static org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd newInstance() {
              return (org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.BankAcctType newInstance() {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.BankAcctType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.BankAcctType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.BankAcctType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.BankAcctType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.BankAcctType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.BankAcctType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
