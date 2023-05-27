/*
 * XML Type:  PaymentCardType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.PaymentCardType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML PaymentCardType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface PaymentCardType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaymentCardType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("paymentcardtyped0e4type");
    
    /**
     * Gets the "CardHolderName" element
     */
    java.lang.String getCardHolderName();
    
    /**
     * Gets (as xml) the "CardHolderName" element
     */
    org.iata.iata.x2007.x00.StringLength1To64 xgetCardHolderName();
    
    /**
     * True if has "CardHolderName" element
     */
    boolean isSetCardHolderName();
    
    /**
     * Sets the "CardHolderName" element
     */
    void setCardHolderName(java.lang.String cardHolderName);
    
    /**
     * Sets (as xml) the "CardHolderName" element
     */
    void xsetCardHolderName(org.iata.iata.x2007.x00.StringLength1To64 cardHolderName);
    
    /**
     * Unsets the "CardHolderName" element
     */
    void unsetCardHolderName();
    
    /**
     * Gets the "CardIssuerName" element
     */
    org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName getCardIssuerName();
    
    /**
     * True if has "CardIssuerName" element
     */
    boolean isSetCardIssuerName();
    
    /**
     * Sets the "CardIssuerName" element
     */
    void setCardIssuerName(org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName cardIssuerName);
    
    /**
     * Appends and returns a new empty "CardIssuerName" element
     */
    org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName addNewCardIssuerName();
    
    /**
     * Unsets the "CardIssuerName" element
     */
    void unsetCardIssuerName();
    
    /**
     * Gets the "Address" element
     */
    org.iata.iata.x2007.x00.PaymentCardType.Address getAddress();
    
    /**
     * True if has "Address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "Address" element
     */
    void setAddress(org.iata.iata.x2007.x00.PaymentCardType.Address address);
    
    /**
     * Appends and returns a new empty "Address" element
     */
    org.iata.iata.x2007.x00.PaymentCardType.Address addNewAddress();
    
    /**
     * Unsets the "Address" element
     */
    void unsetAddress();
    
    /**
     * Gets the "CustomerFileRef" element
     */
    org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef getCustomerFileRef();
    
    /**
     * True if has "CustomerFileRef" element
     */
    boolean isSetCustomerFileRef();
    
    /**
     * Sets the "CustomerFileRef" element
     */
    void setCustomerFileRef(org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef customerFileRef);
    
    /**
     * Appends and returns a new empty "CustomerFileRef" element
     */
    org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef addNewCustomerFileRef();
    
    /**
     * Unsets the "CustomerFileRef" element
     */
    void unsetCustomerFileRef();
    
    /**
     * Gets the "ShareSynchInd" attribute
     */
    org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd.Enum getShareSynchInd();
    
    /**
     * Gets (as xml) the "ShareSynchInd" attribute
     */
    org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd xgetShareSynchInd();
    
    /**
     * True if has "ShareSynchInd" attribute
     */
    boolean isSetShareSynchInd();
    
    /**
     * Sets the "ShareSynchInd" attribute
     */
    void setShareSynchInd(org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd.Enum shareSynchInd);
    
    /**
     * Sets (as xml) the "ShareSynchInd" attribute
     */
    void xsetShareSynchInd(org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd shareSynchInd);
    
    /**
     * Unsets the "ShareSynchInd" attribute
     */
    void unsetShareSynchInd();
    
    /**
     * Gets the "ShareMarketInd" attribute
     */
    org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd.Enum getShareMarketInd();
    
    /**
     * Gets (as xml) the "ShareMarketInd" attribute
     */
    org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd xgetShareMarketInd();
    
    /**
     * True if has "ShareMarketInd" attribute
     */
    boolean isSetShareMarketInd();
    
    /**
     * Sets the "ShareMarketInd" attribute
     */
    void setShareMarketInd(org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd.Enum shareMarketInd);
    
    /**
     * Sets (as xml) the "ShareMarketInd" attribute
     */
    void xsetShareMarketInd(org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd shareMarketInd);
    
    /**
     * Unsets the "ShareMarketInd" attribute
     */
    void unsetShareMarketInd();
    
    /**
     * Gets the "CardType" attribute
     */
    java.lang.String getCardType();
    
    /**
     * Gets (as xml) the "CardType" attribute
     */
    org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 xgetCardType();
    
    /**
     * True if has "CardType" attribute
     */
    boolean isSetCardType();
    
    /**
     * Sets the "CardType" attribute
     */
    void setCardType(java.lang.String cardType);
    
    /**
     * Sets (as xml) the "CardType" attribute
     */
    void xsetCardType(org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 cardType);
    
    /**
     * Unsets the "CardType" attribute
     */
    void unsetCardType();
    
    /**
     * Gets the "CardCode" attribute
     */
    java.lang.String getCardCode();
    
    /**
     * Gets (as xml) the "CardCode" attribute
     */
    org.iata.iata.x2007.x00.PaymentCardCodeType xgetCardCode();
    
    /**
     * True if has "CardCode" attribute
     */
    boolean isSetCardCode();
    
    /**
     * Sets the "CardCode" attribute
     */
    void setCardCode(java.lang.String cardCode);
    
    /**
     * Sets (as xml) the "CardCode" attribute
     */
    void xsetCardCode(org.iata.iata.x2007.x00.PaymentCardCodeType cardCode);
    
    /**
     * Unsets the "CardCode" attribute
     */
    void unsetCardCode();
    
    /**
     * Gets the "CardNumber" attribute
     */
    java.lang.String getCardNumber();
    
    /**
     * Gets (as xml) the "CardNumber" attribute
     */
    org.iata.iata.x2007.x00.NumericStringLength1To19 xgetCardNumber();
    
    /**
     * True if has "CardNumber" attribute
     */
    boolean isSetCardNumber();
    
    /**
     * Sets the "CardNumber" attribute
     */
    void setCardNumber(java.lang.String cardNumber);
    
    /**
     * Sets (as xml) the "CardNumber" attribute
     */
    void xsetCardNumber(org.iata.iata.x2007.x00.NumericStringLength1To19 cardNumber);
    
    /**
     * Unsets the "CardNumber" attribute
     */
    void unsetCardNumber();
    
    /**
     * Gets the "SeriesCode" attribute
     */
    java.lang.String getSeriesCode();
    
    /**
     * Gets (as xml) the "SeriesCode" attribute
     */
    org.iata.iata.x2007.x00.NumericStringLength1To8 xgetSeriesCode();
    
    /**
     * True if has "SeriesCode" attribute
     */
    boolean isSetSeriesCode();
    
    /**
     * Sets the "SeriesCode" attribute
     */
    void setSeriesCode(java.lang.String seriesCode);
    
    /**
     * Sets (as xml) the "SeriesCode" attribute
     */
    void xsetSeriesCode(org.iata.iata.x2007.x00.NumericStringLength1To8 seriesCode);
    
    /**
     * Unsets the "SeriesCode" attribute
     */
    void unsetSeriesCode();
    
    /**
     * Gets the "EffectiveDate" attribute
     */
    java.lang.String getEffectiveDate();
    
    /**
     * Gets (as xml) the "EffectiveDate" attribute
     */
    org.iata.iata.x2007.x00.MMYYDate xgetEffectiveDate();
    
    /**
     * True if has "EffectiveDate" attribute
     */
    boolean isSetEffectiveDate();
    
    /**
     * Sets the "EffectiveDate" attribute
     */
    void setEffectiveDate(java.lang.String effectiveDate);
    
    /**
     * Sets (as xml) the "EffectiveDate" attribute
     */
    void xsetEffectiveDate(org.iata.iata.x2007.x00.MMYYDate effectiveDate);
    
    /**
     * Unsets the "EffectiveDate" attribute
     */
    void unsetEffectiveDate();
    
    /**
     * Gets the "ExpireDate" attribute
     */
    java.lang.String getExpireDate();
    
    /**
     * Gets (as xml) the "ExpireDate" attribute
     */
    org.iata.iata.x2007.x00.MMYYDate xgetExpireDate();
    
    /**
     * True if has "ExpireDate" attribute
     */
    boolean isSetExpireDate();
    
    /**
     * Sets the "ExpireDate" attribute
     */
    void setExpireDate(java.lang.String expireDate);
    
    /**
     * Sets (as xml) the "ExpireDate" attribute
     */
    void xsetExpireDate(org.iata.iata.x2007.x00.MMYYDate expireDate);
    
    /**
     * Unsets the "ExpireDate" attribute
     */
    void unsetExpireDate();
    
    /**
     * Gets the "MaskedCardNumber" attribute
     */
    java.lang.String getMaskedCardNumber();
    
    /**
     * Gets (as xml) the "MaskedCardNumber" attribute
     */
    org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 xgetMaskedCardNumber();
    
    /**
     * True if has "MaskedCardNumber" attribute
     */
    boolean isSetMaskedCardNumber();
    
    /**
     * Sets the "MaskedCardNumber" attribute
     */
    void setMaskedCardNumber(java.lang.String maskedCardNumber);
    
    /**
     * Sets (as xml) the "MaskedCardNumber" attribute
     */
    void xsetMaskedCardNumber(org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 maskedCardNumber);
    
    /**
     * Unsets the "MaskedCardNumber" attribute
     */
    void unsetMaskedCardNumber();
    
    /**
     * Gets the "CardHolderRPH" attribute
     */
    java.lang.String getCardHolderRPH();
    
    /**
     * Gets (as xml) the "CardHolderRPH" attribute
     */
    org.iata.iata.x2007.x00.RPHType xgetCardHolderRPH();
    
    /**
     * True if has "CardHolderRPH" attribute
     */
    boolean isSetCardHolderRPH();
    
    /**
     * Sets the "CardHolderRPH" attribute
     */
    void setCardHolderRPH(java.lang.String cardHolderRPH);
    
    /**
     * Sets (as xml) the "CardHolderRPH" attribute
     */
    void xsetCardHolderRPH(org.iata.iata.x2007.x00.RPHType cardHolderRPH);
    
    /**
     * Unsets the "CardHolderRPH" attribute
     */
    void unsetCardHolderRPH();
    
    /**
     * Gets the "AddressValidation" attribute
     */
    java.lang.String getAddressValidation();
    
    /**
     * Gets (as xml) the "AddressValidation" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetAddressValidation();
    
    /**
     * True if has "AddressValidation" attribute
     */
    boolean isSetAddressValidation();
    
    /**
     * Sets the "AddressValidation" attribute
     */
    void setAddressValidation(java.lang.String addressValidation);
    
    /**
     * Sets (as xml) the "AddressValidation" attribute
     */
    void xsetAddressValidation(org.iata.iata.x2007.x00.StringLength1To32 addressValidation);
    
    /**
     * Unsets the "AddressValidation" attribute
     */
    void unsetAddressValidation();
    
    /**
     * Gets the "ApprovalCode" attribute
     */
    java.lang.String getApprovalCode();
    
    /**
     * Gets (as xml) the "ApprovalCode" attribute
     */
    org.iata.iata.x2007.x00.AlphaNumericStringLength1To8 xgetApprovalCode();
    
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
    void xsetApprovalCode(org.iata.iata.x2007.x00.AlphaNumericStringLength1To8 approvalCode);
    
    /**
     * Unsets the "ApprovalCode" attribute
     */
    void unsetApprovalCode();
    
    /**
     * Gets the "CorporateContractCode" attribute
     */
    java.lang.String getCorporateContractCode();
    
    /**
     * Gets (as xml) the "CorporateContractCode" attribute
     */
    org.iata.iata.x2007.x00.AlphaNumericStringLength1 xgetCorporateContractCode();
    
    /**
     * True if has "CorporateContractCode" attribute
     */
    boolean isSetCorporateContractCode();
    
    /**
     * Sets the "CorporateContractCode" attribute
     */
    void setCorporateContractCode(java.lang.String corporateContractCode);
    
    /**
     * Sets (as xml) the "CorporateContractCode" attribute
     */
    void xsetCorporateContractCode(org.iata.iata.x2007.x00.AlphaNumericStringLength1 corporateContractCode);
    
    /**
     * Unsets the "CorporateContractCode" attribute
     */
    void unsetCorporateContractCode();
    
    /**
     * Gets the "Text" attribute
     */
    java.lang.String getText();
    
    /**
     * Gets (as xml) the "Text" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetText();
    
    /**
     * True if has "Text" attribute
     */
    boolean isSetText();
    
    /**
     * Sets the "Text" attribute
     */
    void setText(java.lang.String text);
    
    /**
     * Sets (as xml) the "Text" attribute
     */
    void xsetText(org.iata.iata.x2007.x00.StringLength1To32 text);
    
    /**
     * Unsets the "Text" attribute
     */
    void unsetText();
    
    /**
     * Gets the "ExtendedPaymentCode" attribute
     */
    java.lang.String getExtendedPaymentCode();
    
    /**
     * Gets (as xml) the "ExtendedPaymentCode" attribute
     */
    org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 xgetExtendedPaymentCode();
    
    /**
     * True if has "ExtendedPaymentCode" attribute
     */
    boolean isSetExtendedPaymentCode();
    
    /**
     * Sets the "ExtendedPaymentCode" attribute
     */
    void setExtendedPaymentCode(java.lang.String extendedPaymentCode);
    
    /**
     * Sets (as xml) the "ExtendedPaymentCode" attribute
     */
    void xsetExtendedPaymentCode(org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 extendedPaymentCode);
    
    /**
     * Unsets the "ExtendedPaymentCode" attribute
     */
    void unsetExtendedPaymentCode();
    
    /**
     * Gets the "ApprovalType" attribute
     */
    java.lang.String getApprovalType();
    
    /**
     * Gets (as xml) the "ApprovalType" attribute
     */
    org.iata.iata.x2007.x00.IATACodeType xgetApprovalType();
    
    /**
     * True if has "ApprovalType" attribute
     */
    boolean isSetApprovalType();
    
    /**
     * Sets the "ApprovalType" attribute
     */
    void setApprovalType(java.lang.String approvalType);
    
    /**
     * Sets (as xml) the "ApprovalType" attribute
     */
    void xsetApprovalType(org.iata.iata.x2007.x00.IATACodeType approvalType);
    
    /**
     * Unsets the "ApprovalType" attribute
     */
    void unsetApprovalType();
    
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
     * Gets the "TokenizedCardNumber" attribute
     */
    java.lang.String getTokenizedCardNumber();
    
    /**
     * Gets (as xml) the "TokenizedCardNumber" attribute
     */
    org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 xgetTokenizedCardNumber();
    
    /**
     * True if has "TokenizedCardNumber" attribute
     */
    boolean isSetTokenizedCardNumber();
    
    /**
     * Sets the "TokenizedCardNumber" attribute
     */
    void setTokenizedCardNumber(java.lang.String tokenizedCardNumber);
    
    /**
     * Sets (as xml) the "TokenizedCardNumber" attribute
     */
    void xsetTokenizedCardNumber(org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 tokenizedCardNumber);
    
    /**
     * Unsets the "TokenizedCardNumber" attribute
     */
    void unsetTokenizedCardNumber();
    
    /**
     * An XML CardIssuerName(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface CardIssuerName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CardIssuerName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("cardissuernamef414elemtype");
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName newInstance() {
              return (org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Address(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface Address extends org.iata.iata.x2007.x00.AddressType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Address.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("address98a4elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.PaymentCardType.Address newInstance() {
              return (org.iata.iata.x2007.x00.PaymentCardType.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentCardType.Address newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentCardType.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML CustomerFileRef(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface CustomerFileRef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CustomerFileRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("customerfilerefbcbfelemtype");
        
        /**
         * Gets the "URL" attribute
         */
        java.lang.String getURL();
        
        /**
         * Gets (as xml) the "URL" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetURL();
        
        /**
         * True if has "URL" attribute
         */
        boolean isSetURL();
        
        /**
         * Sets the "URL" attribute
         */
        void setURL(java.lang.String url);
        
        /**
         * Sets (as xml) the "URL" attribute
         */
        void xsetURL(org.apache.xmlbeans.XmlAnyURI url);
        
        /**
         * Unsets the "URL" attribute
         */
        void unsetURL();
        
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
         * Gets the "Instance" attribute
         */
        java.lang.String getInstance();
        
        /**
         * Gets (as xml) the "Instance" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To32 xgetInstance();
        
        /**
         * True if has "Instance" attribute
         */
        boolean isSetInstance();
        
        /**
         * Sets the "Instance" attribute
         */
        void setInstance(java.lang.String instance);
        
        /**
         * Sets (as xml) the "Instance" attribute
         */
        void xsetInstance(org.iata.iata.x2007.x00.StringLength1To32 instance);
        
        /**
         * Unsets the "Instance" attribute
         */
        void unsetInstance();
        
        /**
         * Gets the "ID" attribute
         */
        java.lang.String getID();
        
        /**
         * Gets (as xml) the "ID" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To32 xgetID();
        
        /**
         * True if has "ID" attribute
         */
        boolean isSetID();
        
        /**
         * Sets the "ID" attribute
         */
        void setID(java.lang.String id);
        
        /**
         * Sets (as xml) the "ID" attribute
         */
        void xsetID(org.iata.iata.x2007.x00.StringLength1To32 id);
        
        /**
         * Unsets the "ID" attribute
         */
        void unsetID();
        
        /**
         * Gets the "ID_Context" attribute
         */
        java.lang.String getIDContext();
        
        /**
         * Gets (as xml) the "ID_Context" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To32 xgetIDContext();
        
        /**
         * True if has "ID_Context" attribute
         */
        boolean isSetIDContext();
        
        /**
         * Sets the "ID_Context" attribute
         */
        void setIDContext(java.lang.String idContext);
        
        /**
         * Sets (as xml) the "ID_Context" attribute
         */
        void xsetIDContext(org.iata.iata.x2007.x00.StringLength1To32 idContext);
        
        /**
         * Unsets the "ID_Context" attribute
         */
        void unsetIDContext();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef newInstance() {
              return (org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ShareSynchInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentCardType$ShareSynchInd.
     */
    public interface ShareSynchInd extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShareSynchInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("sharesynchindea8battrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum YES = Enum.forString("Yes");
        static final Enum NO = Enum.forString("No");
        static final Enum INHERIT = Enum.forString("Inherit");
        
        static final int INT_YES = Enum.INT_YES;
        static final int INT_NO = Enum.INT_NO;
        static final int INT_INHERIT = Enum.INT_INHERIT;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.PaymentCardType$ShareSynchInd.
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
            public static org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd newInstance() {
              return (org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ShareMarketInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentCardType$ShareMarketInd.
     */
    public interface ShareMarketInd extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShareMarketInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("sharemarketind8640attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum YES = Enum.forString("Yes");
        static final Enum NO = Enum.forString("No");
        static final Enum INHERIT = Enum.forString("Inherit");
        
        static final int INT_YES = Enum.INT_YES;
        static final int INT_NO = Enum.INT_NO;
        static final int INT_INHERIT = Enum.INT_INHERIT;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.PaymentCardType$ShareMarketInd.
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
            public static org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd newInstance() {
              return (org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.PaymentCardType newInstance() {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.PaymentCardType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.PaymentCardType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentCardType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.PaymentCardType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.PaymentCardType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.PaymentCardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
