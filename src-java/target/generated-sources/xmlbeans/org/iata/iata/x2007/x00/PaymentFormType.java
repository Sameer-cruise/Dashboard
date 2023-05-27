/*
 * XML Type:  PaymentFormType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.PaymentFormType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML PaymentFormType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface PaymentFormType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaymentFormType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("paymentformtypeffb0type");
    
    /**
     * Gets the "PaymentCard" element
     */
    org.iata.iata.x2007.x00.PaymentCardType getPaymentCard();
    
    /**
     * True if has "PaymentCard" element
     */
    boolean isSetPaymentCard();
    
    /**
     * Sets the "PaymentCard" element
     */
    void setPaymentCard(org.iata.iata.x2007.x00.PaymentCardType paymentCard);
    
    /**
     * Appends and returns a new empty "PaymentCard" element
     */
    org.iata.iata.x2007.x00.PaymentCardType addNewPaymentCard();
    
    /**
     * Unsets the "PaymentCard" element
     */
    void unsetPaymentCard();
    
    /**
     * Gets the "BankAcct" element
     */
    org.iata.iata.x2007.x00.BankAcctType getBankAcct();
    
    /**
     * True if has "BankAcct" element
     */
    boolean isSetBankAcct();
    
    /**
     * Sets the "BankAcct" element
     */
    void setBankAcct(org.iata.iata.x2007.x00.BankAcctType bankAcct);
    
    /**
     * Appends and returns a new empty "BankAcct" element
     */
    org.iata.iata.x2007.x00.BankAcctType addNewBankAcct();
    
    /**
     * Unsets the "BankAcct" element
     */
    void unsetBankAcct();
    
    /**
     * Gets the "DirectBill" element
     */
    org.iata.iata.x2007.x00.DirectBillType getDirectBill();
    
    /**
     * True if has "DirectBill" element
     */
    boolean isSetDirectBill();
    
    /**
     * Sets the "DirectBill" element
     */
    void setDirectBill(org.iata.iata.x2007.x00.DirectBillType directBill);
    
    /**
     * Appends and returns a new empty "DirectBill" element
     */
    org.iata.iata.x2007.x00.DirectBillType addNewDirectBill();
    
    /**
     * Unsets the "DirectBill" element
     */
    void unsetDirectBill();
    
    /**
     * Gets the "Voucher" element
     */
    org.iata.iata.x2007.x00.PaymentFormType.Voucher getVoucher();
    
    /**
     * True if has "Voucher" element
     */
    boolean isSetVoucher();
    
    /**
     * Sets the "Voucher" element
     */
    void setVoucher(org.iata.iata.x2007.x00.PaymentFormType.Voucher voucher);
    
    /**
     * Appends and returns a new empty "Voucher" element
     */
    org.iata.iata.x2007.x00.PaymentFormType.Voucher addNewVoucher();
    
    /**
     * Unsets the "Voucher" element
     */
    void unsetVoucher();
    
    /**
     * Gets the "LoyaltyRedemption" element
     */
    org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption getLoyaltyRedemption();
    
    /**
     * True if has "LoyaltyRedemption" element
     */
    boolean isSetLoyaltyRedemption();
    
    /**
     * Sets the "LoyaltyRedemption" element
     */
    void setLoyaltyRedemption(org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption loyaltyRedemption);
    
    /**
     * Appends and returns a new empty "LoyaltyRedemption" element
     */
    org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption addNewLoyaltyRedemption();
    
    /**
     * Unsets the "LoyaltyRedemption" element
     */
    void unsetLoyaltyRedemption();
    
    /**
     * Gets the "MiscChargeOrder" element
     */
    org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder getMiscChargeOrder();
    
    /**
     * True if has "MiscChargeOrder" element
     */
    boolean isSetMiscChargeOrder();
    
    /**
     * Sets the "MiscChargeOrder" element
     */
    void setMiscChargeOrder(org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder miscChargeOrder);
    
    /**
     * Appends and returns a new empty "MiscChargeOrder" element
     */
    org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder addNewMiscChargeOrder();
    
    /**
     * Unsets the "MiscChargeOrder" element
     */
    void unsetMiscChargeOrder();
    
    /**
     * Gets the "Cash" element
     */
    org.iata.iata.x2007.x00.PaymentFormType.Cash getCash();
    
    /**
     * True if has "Cash" element
     */
    boolean isSetCash();
    
    /**
     * Sets the "Cash" element
     */
    void setCash(org.iata.iata.x2007.x00.PaymentFormType.Cash cash);
    
    /**
     * Appends and returns a new empty "Cash" element
     */
    org.iata.iata.x2007.x00.PaymentFormType.Cash addNewCash();
    
    /**
     * Unsets the "Cash" element
     */
    void unsetCash();
    
    /**
     * Gets the "Other" element
     */
    org.iata.iata.x2007.x00.PaymentFormType.Other getOther();
    
    /**
     * True if has "Other" element
     */
    boolean isSetOther();
    
    /**
     * Sets the "Other" element
     */
    void setOther(org.iata.iata.x2007.x00.PaymentFormType.Other other);
    
    /**
     * Appends and returns a new empty "Other" element
     */
    org.iata.iata.x2007.x00.PaymentFormType.Other addNewOther();
    
    /**
     * Unsets the "Other" element
     */
    void unsetOther();
    
    /**
     * Gets the "ShareSynchInd" attribute
     */
    org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd.Enum getShareSynchInd();
    
    /**
     * Gets (as xml) the "ShareSynchInd" attribute
     */
    org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd xgetShareSynchInd();
    
    /**
     * True if has "ShareSynchInd" attribute
     */
    boolean isSetShareSynchInd();
    
    /**
     * Sets the "ShareSynchInd" attribute
     */
    void setShareSynchInd(org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd.Enum shareSynchInd);
    
    /**
     * Sets (as xml) the "ShareSynchInd" attribute
     */
    void xsetShareSynchInd(org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd shareSynchInd);
    
    /**
     * Unsets the "ShareSynchInd" attribute
     */
    void unsetShareSynchInd();
    
    /**
     * Gets the "ShareMarketInd" attribute
     */
    org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd.Enum getShareMarketInd();
    
    /**
     * Gets (as xml) the "ShareMarketInd" attribute
     */
    org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd xgetShareMarketInd();
    
    /**
     * True if has "ShareMarketInd" attribute
     */
    boolean isSetShareMarketInd();
    
    /**
     * Sets the "ShareMarketInd" attribute
     */
    void setShareMarketInd(org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd.Enum shareMarketInd);
    
    /**
     * Sets (as xml) the "ShareMarketInd" attribute
     */
    void xsetShareMarketInd(org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd shareMarketInd);
    
    /**
     * Unsets the "ShareMarketInd" attribute
     */
    void unsetShareMarketInd();
    
    /**
     * Gets the "CostCenterID" attribute
     */
    java.lang.String getCostCenterID();
    
    /**
     * Gets (as xml) the "CostCenterID" attribute
     */
    org.iata.iata.x2007.x00.StringLength1To32 xgetCostCenterID();
    
    /**
     * True if has "CostCenterID" attribute
     */
    boolean isSetCostCenterID();
    
    /**
     * Sets the "CostCenterID" attribute
     */
    void setCostCenterID(java.lang.String costCenterID);
    
    /**
     * Sets (as xml) the "CostCenterID" attribute
     */
    void xsetCostCenterID(org.iata.iata.x2007.x00.StringLength1To32 costCenterID);
    
    /**
     * Unsets the "CostCenterID" attribute
     */
    void unsetCostCenterID();
    
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
     * Gets the "PaymentTransactionTypeCode" attribute
     */
    org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode.Enum getPaymentTransactionTypeCode();
    
    /**
     * Gets (as xml) the "PaymentTransactionTypeCode" attribute
     */
    org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode xgetPaymentTransactionTypeCode();
    
    /**
     * True if has "PaymentTransactionTypeCode" attribute
     */
    boolean isSetPaymentTransactionTypeCode();
    
    /**
     * Sets the "PaymentTransactionTypeCode" attribute
     */
    void setPaymentTransactionTypeCode(org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode.Enum paymentTransactionTypeCode);
    
    /**
     * Sets (as xml) the "PaymentTransactionTypeCode" attribute
     */
    void xsetPaymentTransactionTypeCode(org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode paymentTransactionTypeCode);
    
    /**
     * Unsets the "PaymentTransactionTypeCode" attribute
     */
    void unsetPaymentTransactionTypeCode();
    
    /**
     * An XML Voucher(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface Voucher extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Voucher.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("voucherbe76elemtype");
        
        /**
         * Gets the "EffectiveDate" attribute
         */
        java.util.Calendar getEffectiveDate();
        
        /**
         * Gets (as xml) the "EffectiveDate" attribute
         */
        org.apache.xmlbeans.XmlDate xgetEffectiveDate();
        
        /**
         * True if has "EffectiveDate" attribute
         */
        boolean isSetEffectiveDate();
        
        /**
         * Sets the "EffectiveDate" attribute
         */
        void setEffectiveDate(java.util.Calendar effectiveDate);
        
        /**
         * Sets (as xml) the "EffectiveDate" attribute
         */
        void xsetEffectiveDate(org.apache.xmlbeans.XmlDate effectiveDate);
        
        /**
         * Unsets the "EffectiveDate" attribute
         */
        void unsetEffectiveDate();
        
        /**
         * Gets the "ExpireDate" attribute
         */
        java.util.Calendar getExpireDate();
        
        /**
         * Gets (as xml) the "ExpireDate" attribute
         */
        org.apache.xmlbeans.XmlDate xgetExpireDate();
        
        /**
         * True if has "ExpireDate" attribute
         */
        boolean isSetExpireDate();
        
        /**
         * Sets the "ExpireDate" attribute
         */
        void setExpireDate(java.util.Calendar expireDate);
        
        /**
         * Sets (as xml) the "ExpireDate" attribute
         */
        void xsetExpireDate(org.apache.xmlbeans.XmlDate expireDate);
        
        /**
         * Unsets the "ExpireDate" attribute
         */
        void unsetExpireDate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.PaymentFormType.Voucher newInstance() {
              return (org.iata.iata.x2007.x00.PaymentFormType.Voucher) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.Voucher newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentFormType.Voucher) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML LoyaltyRedemption(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface LoyaltyRedemption extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoyaltyRedemption.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("loyaltyredemption0f33elemtype");
        
        /**
         * Gets the "CertificateNumber" attribute
         */
        java.lang.String getCertificateNumber();
        
        /**
         * Gets (as xml) the "CertificateNumber" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To32 xgetCertificateNumber();
        
        /**
         * True if has "CertificateNumber" attribute
         */
        boolean isSetCertificateNumber();
        
        /**
         * Sets the "CertificateNumber" attribute
         */
        void setCertificateNumber(java.lang.String certificateNumber);
        
        /**
         * Sets (as xml) the "CertificateNumber" attribute
         */
        void xsetCertificateNumber(org.iata.iata.x2007.x00.StringLength1To32 certificateNumber);
        
        /**
         * Unsets the "CertificateNumber" attribute
         */
        void unsetCertificateNumber();
        
        /**
         * Gets the "MemberNumber" attribute
         */
        java.lang.String getMemberNumber();
        
        /**
         * Gets (as xml) the "MemberNumber" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To32 xgetMemberNumber();
        
        /**
         * True if has "MemberNumber" attribute
         */
        boolean isSetMemberNumber();
        
        /**
         * Sets the "MemberNumber" attribute
         */
        void setMemberNumber(java.lang.String memberNumber);
        
        /**
         * Sets (as xml) the "MemberNumber" attribute
         */
        void xsetMemberNumber(org.iata.iata.x2007.x00.StringLength1To32 memberNumber);
        
        /**
         * Unsets the "MemberNumber" attribute
         */
        void unsetMemberNumber();
        
        /**
         * Gets the "ProgramName" attribute
         */
        java.lang.String getProgramName();
        
        /**
         * Gets (as xml) the "ProgramName" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To64 xgetProgramName();
        
        /**
         * True if has "ProgramName" attribute
         */
        boolean isSetProgramName();
        
        /**
         * Sets the "ProgramName" attribute
         */
        void setProgramName(java.lang.String programName);
        
        /**
         * Sets (as xml) the "ProgramName" attribute
         */
        void xsetProgramName(org.iata.iata.x2007.x00.StringLength1To64 programName);
        
        /**
         * Unsets the "ProgramName" attribute
         */
        void unsetProgramName();
        
        /**
         * Gets the "PromotionCode" attribute
         */
        java.lang.String getPromotionCode();
        
        /**
         * Gets (as xml) the "PromotionCode" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To32 xgetPromotionCode();
        
        /**
         * True if has "PromotionCode" attribute
         */
        boolean isSetPromotionCode();
        
        /**
         * Sets the "PromotionCode" attribute
         */
        void setPromotionCode(java.lang.String promotionCode);
        
        /**
         * Sets (as xml) the "PromotionCode" attribute
         */
        void xsetPromotionCode(org.iata.iata.x2007.x00.StringLength1To32 promotionCode);
        
        /**
         * Unsets the "PromotionCode" attribute
         */
        void unsetPromotionCode();
        
        /**
         * Gets the "PromotionVendorCode" attribute
         */
        java.util.List getPromotionVendorCode();
        
        /**
         * Gets (as xml) the "PromotionVendorCode" attribute
         */
        org.iata.iata.x2007.x00.ListOfStringLength1To8 xgetPromotionVendorCode();
        
        /**
         * True if has "PromotionVendorCode" attribute
         */
        boolean isSetPromotionVendorCode();
        
        /**
         * Sets the "PromotionVendorCode" attribute
         */
        void setPromotionVendorCode(java.util.List promotionVendorCode);
        
        /**
         * Sets (as xml) the "PromotionVendorCode" attribute
         */
        void xsetPromotionVendorCode(org.iata.iata.x2007.x00.ListOfStringLength1To8 promotionVendorCode);
        
        /**
         * Unsets the "PromotionVendorCode" attribute
         */
        void unsetPromotionVendorCode();
        
        /**
         * Gets the "RedemptionQuantity" attribute
         */
        java.math.BigInteger getRedemptionQuantity();
        
        /**
         * Gets (as xml) the "RedemptionQuantity" attribute
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetRedemptionQuantity();
        
        /**
         * True if has "RedemptionQuantity" attribute
         */
        boolean isSetRedemptionQuantity();
        
        /**
         * Sets the "RedemptionQuantity" attribute
         */
        void setRedemptionQuantity(java.math.BigInteger redemptionQuantity);
        
        /**
         * Sets (as xml) the "RedemptionQuantity" attribute
         */
        void xsetRedemptionQuantity(org.apache.xmlbeans.XmlPositiveInteger redemptionQuantity);
        
        /**
         * Unsets the "RedemptionQuantity" attribute
         */
        void unsetRedemptionQuantity();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption newInstance() {
              return (org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML MiscChargeOrder(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface MiscChargeOrder extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MiscChargeOrder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("miscchargeorder40b6elemtype");
        
        /**
         * Gets the "TicketNumber" attribute
         */
        java.lang.String getTicketNumber();
        
        /**
         * Gets (as xml) the "TicketNumber" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To32 xgetTicketNumber();
        
        /**
         * True if has "TicketNumber" attribute
         */
        boolean isSetTicketNumber();
        
        /**
         * Sets the "TicketNumber" attribute
         */
        void setTicketNumber(java.lang.String ticketNumber);
        
        /**
         * Sets (as xml) the "TicketNumber" attribute
         */
        void xsetTicketNumber(org.iata.iata.x2007.x00.StringLength1To32 ticketNumber);
        
        /**
         * Unsets the "TicketNumber" attribute
         */
        void unsetTicketNumber();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder newInstance() {
              return (org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Cash(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface Cash extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cash.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("cash5361elemtype");
        
        /**
         * Gets the "CashIndicator" attribute
         */
        boolean getCashIndicator();
        
        /**
         * Gets (as xml) the "CashIndicator" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetCashIndicator();
        
        /**
         * True if has "CashIndicator" attribute
         */
        boolean isSetCashIndicator();
        
        /**
         * Sets the "CashIndicator" attribute
         */
        void setCashIndicator(boolean cashIndicator);
        
        /**
         * Sets (as xml) the "CashIndicator" attribute
         */
        void xsetCashIndicator(org.apache.xmlbeans.XmlBoolean cashIndicator);
        
        /**
         * Unsets the "CashIndicator" attribute
         */
        void unsetCashIndicator();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.PaymentFormType.Cash newInstance() {
              return (org.iata.iata.x2007.x00.PaymentFormType.Cash) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.Cash newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentFormType.Cash) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Other(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface Other extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Other.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("other34d4elemtype");
        
        /**
         * Gets the "Text" attribute
         */
        java.lang.String getText();
        
        /**
         * Gets (as xml) the "Text" attribute
         */
        org.iata.iata.x2007.x00.StringLength1To32 xgetText();
        
        /**
         * Sets the "Text" attribute
         */
        void setText(java.lang.String text);
        
        /**
         * Sets (as xml) the "Text" attribute
         */
        void xsetText(org.iata.iata.x2007.x00.StringLength1To32 text);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.PaymentFormType.Other newInstance() {
              return (org.iata.iata.x2007.x00.PaymentFormType.Other) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.Other newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentFormType.Other) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ShareSynchInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentFormType$ShareSynchInd.
     */
    public interface ShareSynchInd extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShareSynchInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("sharesynchind1957attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum YES = Enum.forString("Yes");
        static final Enum NO = Enum.forString("No");
        static final Enum INHERIT = Enum.forString("Inherit");
        
        static final int INT_YES = Enum.INT_YES;
        static final int INT_NO = Enum.INT_NO;
        static final int INT_INHERIT = Enum.INT_INHERIT;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.PaymentFormType$ShareSynchInd.
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
            public static org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd newInstance() {
              return (org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ShareMarketInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentFormType$ShareMarketInd.
     */
    public interface ShareMarketInd extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShareMarketInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("sharemarketindb50cattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum YES = Enum.forString("Yes");
        static final Enum NO = Enum.forString("No");
        static final Enum INHERIT = Enum.forString("Inherit");
        
        static final int INT_YES = Enum.INT_YES;
        static final int INT_NO = Enum.INT_NO;
        static final int INT_INHERIT = Enum.INT_INHERIT;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.PaymentFormType$ShareMarketInd.
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
            public static org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd newInstance() {
              return (org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML PaymentTransactionTypeCode(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentFormType$PaymentTransactionTypeCode.
     */
    public interface PaymentTransactionTypeCode extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaymentTransactionTypeCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("paymenttransactiontypecodeceb1attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CHARGE = Enum.forString("charge");
        static final Enum RESERVE = Enum.forString("reserve");
        
        static final int INT_CHARGE = Enum.INT_CHARGE;
        static final int INT_RESERVE = Enum.INT_RESERVE;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.PaymentFormType$PaymentTransactionTypeCode.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_CHARGE
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
            
            static final int INT_CHARGE = 1;
            static final int INT_RESERVE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("charge", INT_CHARGE),
                    new Enum("reserve", INT_RESERVE),
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
            public static org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode newInstance() {
              return (org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.PaymentFormType newInstance() {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.PaymentFormType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.PaymentFormType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.PaymentFormType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.PaymentFormType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.PaymentFormType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.PaymentFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
