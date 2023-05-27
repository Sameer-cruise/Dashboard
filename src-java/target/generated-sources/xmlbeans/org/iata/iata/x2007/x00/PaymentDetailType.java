/*
 * XML Type:  PaymentDetailType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.PaymentDetailType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML PaymentDetailType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface PaymentDetailType extends org.iata.iata.x2007.x00.PaymentFormType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaymentDetailType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("paymentdetailtype5b83type");
    
    /**
     * Gets the "PaymentAmount" element
     */
    org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount getPaymentAmount();
    
    /**
     * True if has "PaymentAmount" element
     */
    boolean isSetPaymentAmount();
    
    /**
     * Sets the "PaymentAmount" element
     */
    void setPaymentAmount(org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount paymentAmount);
    
    /**
     * Appends and returns a new empty "PaymentAmount" element
     */
    org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount addNewPaymentAmount();
    
    /**
     * Unsets the "PaymentAmount" element
     */
    void unsetPaymentAmount();
    
    /**
     * An XML PaymentAmount(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface PaymentAmount extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaymentAmount.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("paymentamountc579elemtype");
        
        /**
         * Gets the "Amount" attribute
         */
        java.math.BigDecimal getAmount();
        
        /**
         * Gets (as xml) the "Amount" attribute
         */
        org.iata.iata.x2007.x00.Money xgetAmount();
        
        /**
         * True if has "Amount" attribute
         */
        boolean isSetAmount();
        
        /**
         * Sets the "Amount" attribute
         */
        void setAmount(java.math.BigDecimal amount);
        
        /**
         * Sets (as xml) the "Amount" attribute
         */
        void xsetAmount(org.iata.iata.x2007.x00.Money amount);
        
        /**
         * Unsets the "Amount" attribute
         */
        void unsetAmount();
        
        /**
         * Gets the "CurrencyCode" attribute
         */
        java.lang.String getCurrencyCode();
        
        /**
         * Gets (as xml) the "CurrencyCode" attribute
         */
        org.iata.iata.x2007.x00.AlphaLength3 xgetCurrencyCode();
        
        /**
         * True if has "CurrencyCode" attribute
         */
        boolean isSetCurrencyCode();
        
        /**
         * Sets the "CurrencyCode" attribute
         */
        void setCurrencyCode(java.lang.String currencyCode);
        
        /**
         * Sets (as xml) the "CurrencyCode" attribute
         */
        void xsetCurrencyCode(org.iata.iata.x2007.x00.AlphaLength3 currencyCode);
        
        /**
         * Unsets the "CurrencyCode" attribute
         */
        void unsetCurrencyCode();
        
        /**
         * Gets the "DecimalPlaces" attribute
         */
        java.math.BigInteger getDecimalPlaces();
        
        /**
         * Gets (as xml) the "DecimalPlaces" attribute
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetDecimalPlaces();
        
        /**
         * True if has "DecimalPlaces" attribute
         */
        boolean isSetDecimalPlaces();
        
        /**
         * Sets the "DecimalPlaces" attribute
         */
        void setDecimalPlaces(java.math.BigInteger decimalPlaces);
        
        /**
         * Sets (as xml) the "DecimalPlaces" attribute
         */
        void xsetDecimalPlaces(org.apache.xmlbeans.XmlNonNegativeInteger decimalPlaces);
        
        /**
         * Unsets the "DecimalPlaces" attribute
         */
        void unsetDecimalPlaces();
        
        /**
         * Gets the "ApprovalCode" attribute
         */
        java.lang.String getApprovalCode();
        
        /**
         * Gets (as xml) the "ApprovalCode" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To16 xgetApprovalCode();
        
        /**
         * True if has "ApprovalCode" attribute
         */
        boolean isSetApprovalCode();
        
        /**
         * Sets the "ApprovalCode" attribute
         */
        void setApprovalCode(java.lang.String approvalCode);
        
        /**
         * Sets (as xml) the "ApprovalCode" attribute
         */
        void xsetApprovalCode(org.iata.iata.x2007.x00.StringLength1To16 approvalCode);
        
        /**
         * Unsets the "ApprovalCode" attribute
         */
        void unsetApprovalCode();
        
        /**
         * Gets the "RefundCalcMethod" attribute
         */
        org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod.Enum getRefundCalcMethod();
        
        /**
         * Gets (as xml) the "RefundCalcMethod" attribute
         */
        org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod xgetRefundCalcMethod();
        
        /**
         * True if has "RefundCalcMethod" attribute
         */
        boolean isSetRefundCalcMethod();
        
        /**
         * Sets the "RefundCalcMethod" attribute
         */
        void setRefundCalcMethod(org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod.Enum refundCalcMethod);
        
        /**
         * Sets (as xml) the "RefundCalcMethod" attribute
         */
        void xsetRefundCalcMethod(org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod refundCalcMethod);
        
        /**
         * Unsets the "RefundCalcMethod" attribute
         */
        void unsetRefundCalcMethod();
        
        /**
         * An XML RefundCalcMethod(@).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentDetailType$PaymentAmount$RefundCalcMethod.
         */
        public interface RefundCalcMethod extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RefundCalcMethod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("refundcalcmethodaccbattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SYSTEM = Enum.forString("System");
            static final Enum MANUAL = Enum.forString("Manual");
            
            static final int INT_SYSTEM = Enum.INT_SYSTEM;
            static final int INT_MANUAL = Enum.INT_MANUAL;
            
            /**
             * Enumeration value class for org.iata.iata.x2007.x00.PaymentDetailType$PaymentAmount$RefundCalcMethod.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SYSTEM
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
                
                static final int INT_SYSTEM = 1;
                static final int INT_MANUAL = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("System", INT_SYSTEM),
                      new Enum("Manual", INT_MANUAL),
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
                public static org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod newValue(java.lang.Object obj) {
                  return (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod) type.newValue( obj ); }
                
                public static org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod newInstance() {
                  return (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount newInstance() {
              return (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.PaymentDetailType newInstance() {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.PaymentDetailType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.PaymentDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
