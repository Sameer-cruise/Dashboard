/*
 * XML Type:  PaymentFormType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.PaymentFormType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML PaymentFormType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class PaymentFormTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PaymentFormType
{
    
    public PaymentFormTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENTCARD$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PaymentCard");
    private static final javax.xml.namespace.QName BANKACCT$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "BankAcct");
    private static final javax.xml.namespace.QName DIRECTBILL$4 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "DirectBill");
    private static final javax.xml.namespace.QName VOUCHER$6 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Voucher");
    private static final javax.xml.namespace.QName LOYALTYREDEMPTION$8 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "LoyaltyRedemption");
    private static final javax.xml.namespace.QName MISCCHARGEORDER$10 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "MiscChargeOrder");
    private static final javax.xml.namespace.QName CASH$12 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Cash");
    private static final javax.xml.namespace.QName OTHER$14 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Other");
    private static final javax.xml.namespace.QName SHARESYNCHIND$16 = 
        new javax.xml.namespace.QName("", "ShareSynchInd");
    private static final javax.xml.namespace.QName SHAREMARKETIND$18 = 
        new javax.xml.namespace.QName("", "ShareMarketInd");
    private static final javax.xml.namespace.QName COSTCENTERID$20 = 
        new javax.xml.namespace.QName("", "CostCenterID");
    private static final javax.xml.namespace.QName RPH$22 = 
        new javax.xml.namespace.QName("", "RPH");
    private static final javax.xml.namespace.QName PAYMENTTRANSACTIONTYPECODE$24 = 
        new javax.xml.namespace.QName("", "PaymentTransactionTypeCode");
    
    
    /**
     * Gets the "PaymentCard" element
     */
    public org.iata.iata.x2007.x00.PaymentCardType getPaymentCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType)get_store().find_element_user(PAYMENTCARD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PaymentCard" element
     */
    public boolean isSetPaymentCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTCARD$0) != 0;
        }
    }
    
    /**
     * Sets the "PaymentCard" element
     */
    public void setPaymentCard(org.iata.iata.x2007.x00.PaymentCardType paymentCard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType)get_store().find_element_user(PAYMENTCARD$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentCardType)get_store().add_element_user(PAYMENTCARD$0);
            }
            target.set(paymentCard);
        }
    }
    
    /**
     * Appends and returns a new empty "PaymentCard" element
     */
    public org.iata.iata.x2007.x00.PaymentCardType addNewPaymentCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType)get_store().add_element_user(PAYMENTCARD$0);
            return target;
        }
    }
    
    /**
     * Unsets the "PaymentCard" element
     */
    public void unsetPaymentCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTCARD$0, 0);
        }
    }
    
    /**
     * Gets the "BankAcct" element
     */
    public org.iata.iata.x2007.x00.BankAcctType getBankAcct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BankAcctType target = null;
            target = (org.iata.iata.x2007.x00.BankAcctType)get_store().find_element_user(BANKACCT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BankAcct" element
     */
    public boolean isSetBankAcct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BANKACCT$2) != 0;
        }
    }
    
    /**
     * Sets the "BankAcct" element
     */
    public void setBankAcct(org.iata.iata.x2007.x00.BankAcctType bankAcct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BankAcctType target = null;
            target = (org.iata.iata.x2007.x00.BankAcctType)get_store().find_element_user(BANKACCT$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.BankAcctType)get_store().add_element_user(BANKACCT$2);
            }
            target.set(bankAcct);
        }
    }
    
    /**
     * Appends and returns a new empty "BankAcct" element
     */
    public org.iata.iata.x2007.x00.BankAcctType addNewBankAcct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BankAcctType target = null;
            target = (org.iata.iata.x2007.x00.BankAcctType)get_store().add_element_user(BANKACCT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "BankAcct" element
     */
    public void unsetBankAcct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BANKACCT$2, 0);
        }
    }
    
    /**
     * Gets the "DirectBill" element
     */
    public org.iata.iata.x2007.x00.DirectBillType getDirectBill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DirectBillType target = null;
            target = (org.iata.iata.x2007.x00.DirectBillType)get_store().find_element_user(DIRECTBILL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DirectBill" element
     */
    public boolean isSetDirectBill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTBILL$4) != 0;
        }
    }
    
    /**
     * Sets the "DirectBill" element
     */
    public void setDirectBill(org.iata.iata.x2007.x00.DirectBillType directBill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DirectBillType target = null;
            target = (org.iata.iata.x2007.x00.DirectBillType)get_store().find_element_user(DIRECTBILL$4, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.DirectBillType)get_store().add_element_user(DIRECTBILL$4);
            }
            target.set(directBill);
        }
    }
    
    /**
     * Appends and returns a new empty "DirectBill" element
     */
    public org.iata.iata.x2007.x00.DirectBillType addNewDirectBill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DirectBillType target = null;
            target = (org.iata.iata.x2007.x00.DirectBillType)get_store().add_element_user(DIRECTBILL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DirectBill" element
     */
    public void unsetDirectBill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTBILL$4, 0);
        }
    }
    
    /**
     * Gets the "Voucher" element
     */
    public org.iata.iata.x2007.x00.PaymentFormType.Voucher getVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.Voucher target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.Voucher)get_store().find_element_user(VOUCHER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Voucher" element
     */
    public boolean isSetVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOUCHER$6) != 0;
        }
    }
    
    /**
     * Sets the "Voucher" element
     */
    public void setVoucher(org.iata.iata.x2007.x00.PaymentFormType.Voucher voucher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.Voucher target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.Voucher)get_store().find_element_user(VOUCHER$6, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentFormType.Voucher)get_store().add_element_user(VOUCHER$6);
            }
            target.set(voucher);
        }
    }
    
    /**
     * Appends and returns a new empty "Voucher" element
     */
    public org.iata.iata.x2007.x00.PaymentFormType.Voucher addNewVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.Voucher target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.Voucher)get_store().add_element_user(VOUCHER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Voucher" element
     */
    public void unsetVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOUCHER$6, 0);
        }
    }
    
    /**
     * Gets the "LoyaltyRedemption" element
     */
    public org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption getLoyaltyRedemption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption)get_store().find_element_user(LOYALTYREDEMPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LoyaltyRedemption" element
     */
    public boolean isSetLoyaltyRedemption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOYALTYREDEMPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "LoyaltyRedemption" element
     */
    public void setLoyaltyRedemption(org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption loyaltyRedemption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption)get_store().find_element_user(LOYALTYREDEMPTION$8, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption)get_store().add_element_user(LOYALTYREDEMPTION$8);
            }
            target.set(loyaltyRedemption);
        }
    }
    
    /**
     * Appends and returns a new empty "LoyaltyRedemption" element
     */
    public org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption addNewLoyaltyRedemption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption)get_store().add_element_user(LOYALTYREDEMPTION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "LoyaltyRedemption" element
     */
    public void unsetLoyaltyRedemption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOYALTYREDEMPTION$8, 0);
        }
    }
    
    /**
     * Gets the "MiscChargeOrder" element
     */
    public org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder getMiscChargeOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder)get_store().find_element_user(MISCCHARGEORDER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MiscChargeOrder" element
     */
    public boolean isSetMiscChargeOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MISCCHARGEORDER$10) != 0;
        }
    }
    
    /**
     * Sets the "MiscChargeOrder" element
     */
    public void setMiscChargeOrder(org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder miscChargeOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder)get_store().find_element_user(MISCCHARGEORDER$10, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder)get_store().add_element_user(MISCCHARGEORDER$10);
            }
            target.set(miscChargeOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "MiscChargeOrder" element
     */
    public org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder addNewMiscChargeOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder)get_store().add_element_user(MISCCHARGEORDER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "MiscChargeOrder" element
     */
    public void unsetMiscChargeOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MISCCHARGEORDER$10, 0);
        }
    }
    
    /**
     * Gets the "Cash" element
     */
    public org.iata.iata.x2007.x00.PaymentFormType.Cash getCash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.Cash target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.Cash)get_store().find_element_user(CASH$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Cash" element
     */
    public boolean isSetCash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASH$12) != 0;
        }
    }
    
    /**
     * Sets the "Cash" element
     */
    public void setCash(org.iata.iata.x2007.x00.PaymentFormType.Cash cash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.Cash target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.Cash)get_store().find_element_user(CASH$12, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentFormType.Cash)get_store().add_element_user(CASH$12);
            }
            target.set(cash);
        }
    }
    
    /**
     * Appends and returns a new empty "Cash" element
     */
    public org.iata.iata.x2007.x00.PaymentFormType.Cash addNewCash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.Cash target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.Cash)get_store().add_element_user(CASH$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Cash" element
     */
    public void unsetCash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASH$12, 0);
        }
    }
    
    /**
     * Gets the "Other" element
     */
    public org.iata.iata.x2007.x00.PaymentFormType.Other getOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.Other target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.Other)get_store().find_element_user(OTHER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Other" element
     */
    public boolean isSetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHER$14) != 0;
        }
    }
    
    /**
     * Sets the "Other" element
     */
    public void setOther(org.iata.iata.x2007.x00.PaymentFormType.Other other)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.Other target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.Other)get_store().find_element_user(OTHER$14, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentFormType.Other)get_store().add_element_user(OTHER$14);
            }
            target.set(other);
        }
    }
    
    /**
     * Appends and returns a new empty "Other" element
     */
    public org.iata.iata.x2007.x00.PaymentFormType.Other addNewOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.Other target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.Other)get_store().add_element_user(OTHER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Other" element
     */
    public void unsetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHER$14, 0);
        }
    }
    
    /**
     * Gets the "ShareSynchInd" attribute
     */
    public org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd.Enum getShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESYNCHIND$16);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShareSynchInd" attribute
     */
    public org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd xgetShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd)get_store().find_attribute_user(SHARESYNCHIND$16);
            return target;
        }
    }
    
    /**
     * True if has "ShareSynchInd" attribute
     */
    public boolean isSetShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHARESYNCHIND$16) != null;
        }
    }
    
    /**
     * Sets the "ShareSynchInd" attribute
     */
    public void setShareSynchInd(org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd.Enum shareSynchInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESYNCHIND$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHARESYNCHIND$16);
            }
            target.setEnumValue(shareSynchInd);
        }
    }
    
    /**
     * Sets (as xml) the "ShareSynchInd" attribute
     */
    public void xsetShareSynchInd(org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd shareSynchInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd)get_store().find_attribute_user(SHARESYNCHIND$16);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd)get_store().add_attribute_user(SHARESYNCHIND$16);
            }
            target.set(shareSynchInd);
        }
    }
    
    /**
     * Unsets the "ShareSynchInd" attribute
     */
    public void unsetShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHARESYNCHIND$16);
        }
    }
    
    /**
     * Gets the "ShareMarketInd" attribute
     */
    public org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd.Enum getShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREMARKETIND$18);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShareMarketInd" attribute
     */
    public org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd xgetShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd)get_store().find_attribute_user(SHAREMARKETIND$18);
            return target;
        }
    }
    
    /**
     * True if has "ShareMarketInd" attribute
     */
    public boolean isSetShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHAREMARKETIND$18) != null;
        }
    }
    
    /**
     * Sets the "ShareMarketInd" attribute
     */
    public void setShareMarketInd(org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd.Enum shareMarketInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREMARKETIND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHAREMARKETIND$18);
            }
            target.setEnumValue(shareMarketInd);
        }
    }
    
    /**
     * Sets (as xml) the "ShareMarketInd" attribute
     */
    public void xsetShareMarketInd(org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd shareMarketInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd)get_store().find_attribute_user(SHAREMARKETIND$18);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd)get_store().add_attribute_user(SHAREMARKETIND$18);
            }
            target.set(shareMarketInd);
        }
    }
    
    /**
     * Unsets the "ShareMarketInd" attribute
     */
    public void unsetShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHAREMARKETIND$18);
        }
    }
    
    /**
     * Gets the "CostCenterID" attribute
     */
    public java.lang.String getCostCenterID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COSTCENTERID$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CostCenterID" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetCostCenterID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(COSTCENTERID$20);
            return target;
        }
    }
    
    /**
     * True if has "CostCenterID" attribute
     */
    public boolean isSetCostCenterID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COSTCENTERID$20) != null;
        }
    }
    
    /**
     * Sets the "CostCenterID" attribute
     */
    public void setCostCenterID(java.lang.String costCenterID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COSTCENTERID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COSTCENTERID$20);
            }
            target.setStringValue(costCenterID);
        }
    }
    
    /**
     * Sets (as xml) the "CostCenterID" attribute
     */
    public void xsetCostCenterID(org.iata.iata.x2007.x00.StringLength1To32 costCenterID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(COSTCENTERID$20);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(COSTCENTERID$20);
            }
            target.set(costCenterID);
        }
    }
    
    /**
     * Unsets the "CostCenterID" attribute
     */
    public void unsetCostCenterID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COSTCENTERID$20);
        }
    }
    
    /**
     * Gets the "RPH" attribute
     */
    public java.lang.String getRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RPH$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RPH" attribute
     */
    public org.iata.iata.x2007.x00.RPHType xgetRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.RPHType target = null;
            target = (org.iata.iata.x2007.x00.RPHType)get_store().find_attribute_user(RPH$22);
            return target;
        }
    }
    
    /**
     * True if has "RPH" attribute
     */
    public boolean isSetRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RPH$22) != null;
        }
    }
    
    /**
     * Sets the "RPH" attribute
     */
    public void setRPH(java.lang.String rph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RPH$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RPH$22);
            }
            target.setStringValue(rph);
        }
    }
    
    /**
     * Sets (as xml) the "RPH" attribute
     */
    public void xsetRPH(org.iata.iata.x2007.x00.RPHType rph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.RPHType target = null;
            target = (org.iata.iata.x2007.x00.RPHType)get_store().find_attribute_user(RPH$22);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.RPHType)get_store().add_attribute_user(RPH$22);
            }
            target.set(rph);
        }
    }
    
    /**
     * Unsets the "RPH" attribute
     */
    public void unsetRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RPH$22);
        }
    }
    
    /**
     * Gets the "PaymentTransactionTypeCode" attribute
     */
    public org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode.Enum getPaymentTransactionTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAYMENTTRANSACTIONTYPECODE$24);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentTransactionTypeCode" attribute
     */
    public org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode xgetPaymentTransactionTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode)get_store().find_attribute_user(PAYMENTTRANSACTIONTYPECODE$24);
            return target;
        }
    }
    
    /**
     * True if has "PaymentTransactionTypeCode" attribute
     */
    public boolean isSetPaymentTransactionTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PAYMENTTRANSACTIONTYPECODE$24) != null;
        }
    }
    
    /**
     * Sets the "PaymentTransactionTypeCode" attribute
     */
    public void setPaymentTransactionTypeCode(org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode.Enum paymentTransactionTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAYMENTTRANSACTIONTYPECODE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAYMENTTRANSACTIONTYPECODE$24);
            }
            target.setEnumValue(paymentTransactionTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "PaymentTransactionTypeCode" attribute
     */
    public void xsetPaymentTransactionTypeCode(org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode paymentTransactionTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode target = null;
            target = (org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode)get_store().find_attribute_user(PAYMENTTRANSACTIONTYPECODE$24);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode)get_store().add_attribute_user(PAYMENTTRANSACTIONTYPECODE$24);
            }
            target.set(paymentTransactionTypeCode);
        }
    }
    
    /**
     * Unsets the "PaymentTransactionTypeCode" attribute
     */
    public void unsetPaymentTransactionTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PAYMENTTRANSACTIONTYPECODE$24);
        }
    }
    /**
     * An XML Voucher(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class VoucherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PaymentFormType.Voucher
    {
        
        public VoucherImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EFFECTIVEDATE$0 = 
            new javax.xml.namespace.QName("", "EffectiveDate");
        private static final javax.xml.namespace.QName EXPIREDATE$2 = 
            new javax.xml.namespace.QName("", "ExpireDate");
        
        
        /**
         * Gets the "EffectiveDate" attribute
         */
        public java.util.Calendar getEffectiveDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFECTIVEDATE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EffectiveDate" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetEffectiveDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(EFFECTIVEDATE$0);
                return target;
            }
        }
        
        /**
         * True if has "EffectiveDate" attribute
         */
        public boolean isSetEffectiveDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EFFECTIVEDATE$0) != null;
            }
        }
        
        /**
         * Sets the "EffectiveDate" attribute
         */
        public void setEffectiveDate(java.util.Calendar effectiveDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFECTIVEDATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EFFECTIVEDATE$0);
                }
                target.setCalendarValue(effectiveDate);
            }
        }
        
        /**
         * Sets (as xml) the "EffectiveDate" attribute
         */
        public void xsetEffectiveDate(org.apache.xmlbeans.XmlDate effectiveDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(EFFECTIVEDATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(EFFECTIVEDATE$0);
                }
                target.set(effectiveDate);
            }
        }
        
        /**
         * Unsets the "EffectiveDate" attribute
         */
        public void unsetEffectiveDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EFFECTIVEDATE$0);
            }
        }
        
        /**
         * Gets the "ExpireDate" attribute
         */
        public java.util.Calendar getExpireDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPIREDATE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExpireDate" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetExpireDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(EXPIREDATE$2);
                return target;
            }
        }
        
        /**
         * True if has "ExpireDate" attribute
         */
        public boolean isSetExpireDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXPIREDATE$2) != null;
            }
        }
        
        /**
         * Sets the "ExpireDate" attribute
         */
        public void setExpireDate(java.util.Calendar expireDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPIREDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPIREDATE$2);
                }
                target.setCalendarValue(expireDate);
            }
        }
        
        /**
         * Sets (as xml) the "ExpireDate" attribute
         */
        public void xsetExpireDate(org.apache.xmlbeans.XmlDate expireDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(EXPIREDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(EXPIREDATE$2);
                }
                target.set(expireDate);
            }
        }
        
        /**
         * Unsets the "ExpireDate" attribute
         */
        public void unsetExpireDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXPIREDATE$2);
            }
        }
    }
    /**
     * An XML LoyaltyRedemption(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class LoyaltyRedemptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PaymentFormType.LoyaltyRedemption
    {
        
        public LoyaltyRedemptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CERTIFICATENUMBER$0 = 
            new javax.xml.namespace.QName("", "CertificateNumber");
        private static final javax.xml.namespace.QName MEMBERNUMBER$2 = 
            new javax.xml.namespace.QName("", "MemberNumber");
        private static final javax.xml.namespace.QName PROGRAMNAME$4 = 
            new javax.xml.namespace.QName("", "ProgramName");
        private static final javax.xml.namespace.QName PROMOTIONCODE$6 = 
            new javax.xml.namespace.QName("", "PromotionCode");
        private static final javax.xml.namespace.QName PROMOTIONVENDORCODE$8 = 
            new javax.xml.namespace.QName("", "PromotionVendorCode");
        private static final javax.xml.namespace.QName REDEMPTIONQUANTITY$10 = 
            new javax.xml.namespace.QName("", "RedemptionQuantity");
        
        
        /**
         * Gets the "CertificateNumber" attribute
         */
        public java.lang.String getCertificateNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CERTIFICATENUMBER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CertificateNumber" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetCertificateNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CERTIFICATENUMBER$0);
                return target;
            }
        }
        
        /**
         * True if has "CertificateNumber" attribute
         */
        public boolean isSetCertificateNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CERTIFICATENUMBER$0) != null;
            }
        }
        
        /**
         * Sets the "CertificateNumber" attribute
         */
        public void setCertificateNumber(java.lang.String certificateNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CERTIFICATENUMBER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CERTIFICATENUMBER$0);
                }
                target.setStringValue(certificateNumber);
            }
        }
        
        /**
         * Sets (as xml) the "CertificateNumber" attribute
         */
        public void xsetCertificateNumber(org.iata.iata.x2007.x00.StringLength1To32 certificateNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CERTIFICATENUMBER$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(CERTIFICATENUMBER$0);
                }
                target.set(certificateNumber);
            }
        }
        
        /**
         * Unsets the "CertificateNumber" attribute
         */
        public void unsetCertificateNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CERTIFICATENUMBER$0);
            }
        }
        
        /**
         * Gets the "MemberNumber" attribute
         */
        public java.lang.String getMemberNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMBERNUMBER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MemberNumber" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetMemberNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(MEMBERNUMBER$2);
                return target;
            }
        }
        
        /**
         * True if has "MemberNumber" attribute
         */
        public boolean isSetMemberNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MEMBERNUMBER$2) != null;
            }
        }
        
        /**
         * Sets the "MemberNumber" attribute
         */
        public void setMemberNumber(java.lang.String memberNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMBERNUMBER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEMBERNUMBER$2);
                }
                target.setStringValue(memberNumber);
            }
        }
        
        /**
         * Sets (as xml) the "MemberNumber" attribute
         */
        public void xsetMemberNumber(org.iata.iata.x2007.x00.StringLength1To32 memberNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(MEMBERNUMBER$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(MEMBERNUMBER$2);
                }
                target.set(memberNumber);
            }
        }
        
        /**
         * Unsets the "MemberNumber" attribute
         */
        public void unsetMemberNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MEMBERNUMBER$2);
            }
        }
        
        /**
         * Gets the "ProgramName" attribute
         */
        public java.lang.String getProgramName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROGRAMNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProgramName" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To64 xgetProgramName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To64 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(PROGRAMNAME$4);
                return target;
            }
        }
        
        /**
         * True if has "ProgramName" attribute
         */
        public boolean isSetProgramName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROGRAMNAME$4) != null;
            }
        }
        
        /**
         * Sets the "ProgramName" attribute
         */
        public void setProgramName(java.lang.String programName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROGRAMNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROGRAMNAME$4);
                }
                target.setStringValue(programName);
            }
        }
        
        /**
         * Sets (as xml) the "ProgramName" attribute
         */
        public void xsetProgramName(org.iata.iata.x2007.x00.StringLength1To64 programName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To64 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(PROGRAMNAME$4);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_attribute_user(PROGRAMNAME$4);
                }
                target.set(programName);
            }
        }
        
        /**
         * Unsets the "ProgramName" attribute
         */
        public void unsetProgramName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROGRAMNAME$4);
            }
        }
        
        /**
         * Gets the "PromotionCode" attribute
         */
        public java.lang.String getPromotionCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMOTIONCODE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PromotionCode" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetPromotionCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(PROMOTIONCODE$6);
                return target;
            }
        }
        
        /**
         * True if has "PromotionCode" attribute
         */
        public boolean isSetPromotionCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROMOTIONCODE$6) != null;
            }
        }
        
        /**
         * Sets the "PromotionCode" attribute
         */
        public void setPromotionCode(java.lang.String promotionCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMOTIONCODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROMOTIONCODE$6);
                }
                target.setStringValue(promotionCode);
            }
        }
        
        /**
         * Sets (as xml) the "PromotionCode" attribute
         */
        public void xsetPromotionCode(org.iata.iata.x2007.x00.StringLength1To32 promotionCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(PROMOTIONCODE$6);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(PROMOTIONCODE$6);
                }
                target.set(promotionCode);
            }
        }
        
        /**
         * Unsets the "PromotionCode" attribute
         */
        public void unsetPromotionCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROMOTIONCODE$6);
            }
        }
        
        /**
         * Gets the "PromotionVendorCode" attribute
         */
        public java.util.List getPromotionVendorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMOTIONVENDORCODE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "PromotionVendorCode" attribute
         */
        public org.iata.iata.x2007.x00.ListOfStringLength1To8 xgetPromotionVendorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.ListOfStringLength1To8 target = null;
                target = (org.iata.iata.x2007.x00.ListOfStringLength1To8)get_store().find_attribute_user(PROMOTIONVENDORCODE$8);
                return target;
            }
        }
        
        /**
         * True if has "PromotionVendorCode" attribute
         */
        public boolean isSetPromotionVendorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROMOTIONVENDORCODE$8) != null;
            }
        }
        
        /**
         * Sets the "PromotionVendorCode" attribute
         */
        public void setPromotionVendorCode(java.util.List promotionVendorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMOTIONVENDORCODE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROMOTIONVENDORCODE$8);
                }
                target.setListValue(promotionVendorCode);
            }
        }
        
        /**
         * Sets (as xml) the "PromotionVendorCode" attribute
         */
        public void xsetPromotionVendorCode(org.iata.iata.x2007.x00.ListOfStringLength1To8 promotionVendorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.ListOfStringLength1To8 target = null;
                target = (org.iata.iata.x2007.x00.ListOfStringLength1To8)get_store().find_attribute_user(PROMOTIONVENDORCODE$8);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.ListOfStringLength1To8)get_store().add_attribute_user(PROMOTIONVENDORCODE$8);
                }
                target.set(promotionVendorCode);
            }
        }
        
        /**
         * Unsets the "PromotionVendorCode" attribute
         */
        public void unsetPromotionVendorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROMOTIONVENDORCODE$8);
            }
        }
        
        /**
         * Gets the "RedemptionQuantity" attribute
         */
        public java.math.BigInteger getRedemptionQuantity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REDEMPTIONQUANTITY$10);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "RedemptionQuantity" attribute
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetRedemptionQuantity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(REDEMPTIONQUANTITY$10);
                return target;
            }
        }
        
        /**
         * True if has "RedemptionQuantity" attribute
         */
        public boolean isSetRedemptionQuantity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REDEMPTIONQUANTITY$10) != null;
            }
        }
        
        /**
         * Sets the "RedemptionQuantity" attribute
         */
        public void setRedemptionQuantity(java.math.BigInteger redemptionQuantity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REDEMPTIONQUANTITY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REDEMPTIONQUANTITY$10);
                }
                target.setBigIntegerValue(redemptionQuantity);
            }
        }
        
        /**
         * Sets (as xml) the "RedemptionQuantity" attribute
         */
        public void xsetRedemptionQuantity(org.apache.xmlbeans.XmlPositiveInteger redemptionQuantity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(REDEMPTIONQUANTITY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(REDEMPTIONQUANTITY$10);
                }
                target.set(redemptionQuantity);
            }
        }
        
        /**
         * Unsets the "RedemptionQuantity" attribute
         */
        public void unsetRedemptionQuantity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REDEMPTIONQUANTITY$10);
            }
        }
    }
    /**
     * An XML MiscChargeOrder(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class MiscChargeOrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PaymentFormType.MiscChargeOrder
    {
        
        public MiscChargeOrderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TICKETNUMBER$0 = 
            new javax.xml.namespace.QName("", "TicketNumber");
        
        
        /**
         * Gets the "TicketNumber" attribute
         */
        public java.lang.String getTicketNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TICKETNUMBER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TicketNumber" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetTicketNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(TICKETNUMBER$0);
                return target;
            }
        }
        
        /**
         * True if has "TicketNumber" attribute
         */
        public boolean isSetTicketNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TICKETNUMBER$0) != null;
            }
        }
        
        /**
         * Sets the "TicketNumber" attribute
         */
        public void setTicketNumber(java.lang.String ticketNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TICKETNUMBER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TICKETNUMBER$0);
                }
                target.setStringValue(ticketNumber);
            }
        }
        
        /**
         * Sets (as xml) the "TicketNumber" attribute
         */
        public void xsetTicketNumber(org.iata.iata.x2007.x00.StringLength1To32 ticketNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(TICKETNUMBER$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(TICKETNUMBER$0);
                }
                target.set(ticketNumber);
            }
        }
        
        /**
         * Unsets the "TicketNumber" attribute
         */
        public void unsetTicketNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TICKETNUMBER$0);
            }
        }
    }
    /**
     * An XML Cash(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class CashImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PaymentFormType.Cash
    {
        
        public CashImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CASHINDICATOR$0 = 
            new javax.xml.namespace.QName("", "CashIndicator");
        
        
        /**
         * Gets the "CashIndicator" attribute
         */
        public boolean getCashIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CASHINDICATOR$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CASHINDICATOR$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "CashIndicator" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetCashIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CASHINDICATOR$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CASHINDICATOR$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "CashIndicator" attribute
         */
        public boolean isSetCashIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CASHINDICATOR$0) != null;
            }
        }
        
        /**
         * Sets the "CashIndicator" attribute
         */
        public void setCashIndicator(boolean cashIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CASHINDICATOR$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CASHINDICATOR$0);
                }
                target.setBooleanValue(cashIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "CashIndicator" attribute
         */
        public void xsetCashIndicator(org.apache.xmlbeans.XmlBoolean cashIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CASHINDICATOR$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CASHINDICATOR$0);
                }
                target.set(cashIndicator);
            }
        }
        
        /**
         * Unsets the "CashIndicator" attribute
         */
        public void unsetCashIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CASHINDICATOR$0);
            }
        }
    }
    /**
     * An XML Other(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class OtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PaymentFormType.Other
    {
        
        public OtherImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEXT$0 = 
            new javax.xml.namespace.QName("", "Text");
        
        
        /**
         * Gets the "Text" attribute
         */
        public java.lang.String getText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Text" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(TEXT$0);
                return target;
            }
        }
        
        /**
         * Sets the "Text" attribute
         */
        public void setText(java.lang.String text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXT$0);
                }
                target.setStringValue(text);
            }
        }
        
        /**
         * Sets (as xml) the "Text" attribute
         */
        public void xsetText(org.iata.iata.x2007.x00.StringLength1To32 text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(TEXT$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(TEXT$0);
                }
                target.set(text);
            }
        }
    }
    /**
     * An XML ShareSynchInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentFormType$ShareSynchInd.
     */
    public static class ShareSynchIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.PaymentFormType.ShareSynchInd
    {
        
        public ShareSynchIndImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ShareSynchIndImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML ShareMarketInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentFormType$ShareMarketInd.
     */
    public static class ShareMarketIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.PaymentFormType.ShareMarketInd
    {
        
        public ShareMarketIndImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ShareMarketIndImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML PaymentTransactionTypeCode(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentFormType$PaymentTransactionTypeCode.
     */
    public static class PaymentTransactionTypeCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.PaymentFormType.PaymentTransactionTypeCode
    {
        
        public PaymentTransactionTypeCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PaymentTransactionTypeCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
