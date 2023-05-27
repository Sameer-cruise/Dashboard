/*
 * XML Type:  PaymentCardType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.PaymentCardType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML PaymentCardType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class PaymentCardTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PaymentCardType
{
    
    public PaymentCardTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARDHOLDERNAME$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CardHolderName");
    private static final javax.xml.namespace.QName CARDISSUERNAME$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CardIssuerName");
    private static final javax.xml.namespace.QName ADDRESS$4 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Address");
    private static final javax.xml.namespace.QName CUSTOMERFILEREF$6 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CustomerFileRef");
    private static final javax.xml.namespace.QName SHARESYNCHIND$8 = 
        new javax.xml.namespace.QName("", "ShareSynchInd");
    private static final javax.xml.namespace.QName SHAREMARKETIND$10 = 
        new javax.xml.namespace.QName("", "ShareMarketInd");
    private static final javax.xml.namespace.QName CARDTYPE$12 = 
        new javax.xml.namespace.QName("", "CardType");
    private static final javax.xml.namespace.QName CARDCODE$14 = 
        new javax.xml.namespace.QName("", "CardCode");
    private static final javax.xml.namespace.QName CARDNUMBER$16 = 
        new javax.xml.namespace.QName("", "CardNumber");
    private static final javax.xml.namespace.QName SERIESCODE$18 = 
        new javax.xml.namespace.QName("", "SeriesCode");
    private static final javax.xml.namespace.QName EFFECTIVEDATE$20 = 
        new javax.xml.namespace.QName("", "EffectiveDate");
    private static final javax.xml.namespace.QName EXPIREDATE$22 = 
        new javax.xml.namespace.QName("", "ExpireDate");
    private static final javax.xml.namespace.QName MASKEDCARDNUMBER$24 = 
        new javax.xml.namespace.QName("", "MaskedCardNumber");
    private static final javax.xml.namespace.QName CARDHOLDERRPH$26 = 
        new javax.xml.namespace.QName("", "CardHolderRPH");
    private static final javax.xml.namespace.QName ADDRESSVALIDATION$28 = 
        new javax.xml.namespace.QName("", "AddressValidation");
    private static final javax.xml.namespace.QName APPROVALCODE$30 = 
        new javax.xml.namespace.QName("", "ApprovalCode");
    private static final javax.xml.namespace.QName CORPORATECONTRACTCODE$32 = 
        new javax.xml.namespace.QName("", "CorporateContractCode");
    private static final javax.xml.namespace.QName TEXT$34 = 
        new javax.xml.namespace.QName("", "Text");
    private static final javax.xml.namespace.QName EXTENDEDPAYMENTCODE$36 = 
        new javax.xml.namespace.QName("", "ExtendedPaymentCode");
    private static final javax.xml.namespace.QName APPROVALTYPE$38 = 
        new javax.xml.namespace.QName("", "ApprovalType");
    private static final javax.xml.namespace.QName AMOUNT$40 = 
        new javax.xml.namespace.QName("", "Amount");
    private static final javax.xml.namespace.QName CURRENCYCODE$42 = 
        new javax.xml.namespace.QName("", "CurrencyCode");
    private static final javax.xml.namespace.QName DECIMALPLACES$44 = 
        new javax.xml.namespace.QName("", "DecimalPlaces");
    private static final javax.xml.namespace.QName TOKENIZEDCARDNUMBER$46 = 
        new javax.xml.namespace.QName("", "TokenizedCardNumber");
    
    
    /**
     * Gets the "CardHolderName" element
     */
    public java.lang.String getCardHolderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDHOLDERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CardHolderName" element
     */
    public org.iata.iata.x2007.x00.StringLength1To64 xgetCardHolderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(CARDHOLDERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CardHolderName" element
     */
    public boolean isSetCardHolderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARDHOLDERNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "CardHolderName" element
     */
    public void setCardHolderName(java.lang.String cardHolderName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDHOLDERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARDHOLDERNAME$0);
            }
            target.setStringValue(cardHolderName);
        }
    }
    
    /**
     * Sets (as xml) the "CardHolderName" element
     */
    public void xsetCardHolderName(org.iata.iata.x2007.x00.StringLength1To64 cardHolderName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(CARDHOLDERNAME$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_element_user(CARDHOLDERNAME$0);
            }
            target.set(cardHolderName);
        }
    }
    
    /**
     * Unsets the "CardHolderName" element
     */
    public void unsetCardHolderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARDHOLDERNAME$0, 0);
        }
    }
    
    /**
     * Gets the "CardIssuerName" element
     */
    public org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName getCardIssuerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName)get_store().find_element_user(CARDISSUERNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CardIssuerName" element
     */
    public boolean isSetCardIssuerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARDISSUERNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "CardIssuerName" element
     */
    public void setCardIssuerName(org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName cardIssuerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName)get_store().find_element_user(CARDISSUERNAME$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName)get_store().add_element_user(CARDISSUERNAME$2);
            }
            target.set(cardIssuerName);
        }
    }
    
    /**
     * Appends and returns a new empty "CardIssuerName" element
     */
    public org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName addNewCardIssuerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName)get_store().add_element_user(CARDISSUERNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CardIssuerName" element
     */
    public void unsetCardIssuerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARDISSUERNAME$2, 0);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public org.iata.iata.x2007.x00.PaymentCardType.Address getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.Address target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.Address)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(org.iata.iata.x2007.x00.PaymentCardType.Address address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.Address target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.Address)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentCardType.Address)get_store().add_element_user(ADDRESS$4);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public org.iata.iata.x2007.x00.PaymentCardType.Address addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.Address target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.Address)get_store().add_element_user(ADDRESS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$4, 0);
        }
    }
    
    /**
     * Gets the "CustomerFileRef" element
     */
    public org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef getCustomerFileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef)get_store().find_element_user(CUSTOMERFILEREF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerFileRef" element
     */
    public boolean isSetCustomerFileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERFILEREF$6) != 0;
        }
    }
    
    /**
     * Sets the "CustomerFileRef" element
     */
    public void setCustomerFileRef(org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef customerFileRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef)get_store().find_element_user(CUSTOMERFILEREF$6, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef)get_store().add_element_user(CUSTOMERFILEREF$6);
            }
            target.set(customerFileRef);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerFileRef" element
     */
    public org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef addNewCustomerFileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef)get_store().add_element_user(CUSTOMERFILEREF$6);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerFileRef" element
     */
    public void unsetCustomerFileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERFILEREF$6, 0);
        }
    }
    
    /**
     * Gets the "ShareSynchInd" attribute
     */
    public org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd.Enum getShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESYNCHIND$8);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShareSynchInd" attribute
     */
    public org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd xgetShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd)get_store().find_attribute_user(SHARESYNCHIND$8);
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
            return get_store().find_attribute_user(SHARESYNCHIND$8) != null;
        }
    }
    
    /**
     * Sets the "ShareSynchInd" attribute
     */
    public void setShareSynchInd(org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd.Enum shareSynchInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESYNCHIND$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHARESYNCHIND$8);
            }
            target.setEnumValue(shareSynchInd);
        }
    }
    
    /**
     * Sets (as xml) the "ShareSynchInd" attribute
     */
    public void xsetShareSynchInd(org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd shareSynchInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd)get_store().find_attribute_user(SHARESYNCHIND$8);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd)get_store().add_attribute_user(SHARESYNCHIND$8);
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
            get_store().remove_attribute(SHARESYNCHIND$8);
        }
    }
    
    /**
     * Gets the "ShareMarketInd" attribute
     */
    public org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd.Enum getShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREMARKETIND$10);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShareMarketInd" attribute
     */
    public org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd xgetShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd)get_store().find_attribute_user(SHAREMARKETIND$10);
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
            return get_store().find_attribute_user(SHAREMARKETIND$10) != null;
        }
    }
    
    /**
     * Sets the "ShareMarketInd" attribute
     */
    public void setShareMarketInd(org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd.Enum shareMarketInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREMARKETIND$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHAREMARKETIND$10);
            }
            target.setEnumValue(shareMarketInd);
        }
    }
    
    /**
     * Sets (as xml) the "ShareMarketInd" attribute
     */
    public void xsetShareMarketInd(org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd shareMarketInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd)get_store().find_attribute_user(SHAREMARKETIND$10);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd)get_store().add_attribute_user(SHAREMARKETIND$10);
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
            get_store().remove_attribute(SHAREMARKETIND$10);
        }
    }
    
    /**
     * Gets the "CardType" attribute
     */
    public java.lang.String getCardType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDTYPE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CardType" attribute
     */
    public org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 xgetCardType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To3)get_store().find_attribute_user(CARDTYPE$12);
            return target;
        }
    }
    
    /**
     * True if has "CardType" attribute
     */
    public boolean isSetCardType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CARDTYPE$12) != null;
        }
    }
    
    /**
     * Sets the "CardType" attribute
     */
    public void setCardType(java.lang.String cardType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDTYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDTYPE$12);
            }
            target.setStringValue(cardType);
        }
    }
    
    /**
     * Sets (as xml) the "CardType" attribute
     */
    public void xsetCardType(org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 cardType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To3)get_store().find_attribute_user(CARDTYPE$12);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To3)get_store().add_attribute_user(CARDTYPE$12);
            }
            target.set(cardType);
        }
    }
    
    /**
     * Unsets the "CardType" attribute
     */
    public void unsetCardType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CARDTYPE$12);
        }
    }
    
    /**
     * Gets the "CardCode" attribute
     */
    public java.lang.String getCardCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDCODE$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CardCode" attribute
     */
    public org.iata.iata.x2007.x00.PaymentCardCodeType xgetCardCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardCodeType target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardCodeType)get_store().find_attribute_user(CARDCODE$14);
            return target;
        }
    }
    
    /**
     * True if has "CardCode" attribute
     */
    public boolean isSetCardCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CARDCODE$14) != null;
        }
    }
    
    /**
     * Sets the "CardCode" attribute
     */
    public void setCardCode(java.lang.String cardCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDCODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDCODE$14);
            }
            target.setStringValue(cardCode);
        }
    }
    
    /**
     * Sets (as xml) the "CardCode" attribute
     */
    public void xsetCardCode(org.iata.iata.x2007.x00.PaymentCardCodeType cardCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentCardCodeType target = null;
            target = (org.iata.iata.x2007.x00.PaymentCardCodeType)get_store().find_attribute_user(CARDCODE$14);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentCardCodeType)get_store().add_attribute_user(CARDCODE$14);
            }
            target.set(cardCode);
        }
    }
    
    /**
     * Unsets the "CardCode" attribute
     */
    public void unsetCardCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CARDCODE$14);
        }
    }
    
    /**
     * Gets the "CardNumber" attribute
     */
    public java.lang.String getCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDNUMBER$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CardNumber" attribute
     */
    public org.iata.iata.x2007.x00.NumericStringLength1To19 xgetCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To19 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To19)get_store().find_attribute_user(CARDNUMBER$16);
            return target;
        }
    }
    
    /**
     * True if has "CardNumber" attribute
     */
    public boolean isSetCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CARDNUMBER$16) != null;
        }
    }
    
    /**
     * Sets the "CardNumber" attribute
     */
    public void setCardNumber(java.lang.String cardNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDNUMBER$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDNUMBER$16);
            }
            target.setStringValue(cardNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CardNumber" attribute
     */
    public void xsetCardNumber(org.iata.iata.x2007.x00.NumericStringLength1To19 cardNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To19 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To19)get_store().find_attribute_user(CARDNUMBER$16);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.NumericStringLength1To19)get_store().add_attribute_user(CARDNUMBER$16);
            }
            target.set(cardNumber);
        }
    }
    
    /**
     * Unsets the "CardNumber" attribute
     */
    public void unsetCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CARDNUMBER$16);
        }
    }
    
    /**
     * Gets the "SeriesCode" attribute
     */
    public java.lang.String getSeriesCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIESCODE$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SeriesCode" attribute
     */
    public org.iata.iata.x2007.x00.NumericStringLength1To8 xgetSeriesCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To8 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To8)get_store().find_attribute_user(SERIESCODE$18);
            return target;
        }
    }
    
    /**
     * True if has "SeriesCode" attribute
     */
    public boolean isSetSeriesCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERIESCODE$18) != null;
        }
    }
    
    /**
     * Sets the "SeriesCode" attribute
     */
    public void setSeriesCode(java.lang.String seriesCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIESCODE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIESCODE$18);
            }
            target.setStringValue(seriesCode);
        }
    }
    
    /**
     * Sets (as xml) the "SeriesCode" attribute
     */
    public void xsetSeriesCode(org.iata.iata.x2007.x00.NumericStringLength1To8 seriesCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To8 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To8)get_store().find_attribute_user(SERIESCODE$18);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.NumericStringLength1To8)get_store().add_attribute_user(SERIESCODE$18);
            }
            target.set(seriesCode);
        }
    }
    
    /**
     * Unsets the "SeriesCode" attribute
     */
    public void unsetSeriesCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERIESCODE$18);
        }
    }
    
    /**
     * Gets the "EffectiveDate" attribute
     */
    public java.lang.String getEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFECTIVEDATE$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EffectiveDate" attribute
     */
    public org.iata.iata.x2007.x00.MMYYDate xgetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MMYYDate target = null;
            target = (org.iata.iata.x2007.x00.MMYYDate)get_store().find_attribute_user(EFFECTIVEDATE$20);
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
            return get_store().find_attribute_user(EFFECTIVEDATE$20) != null;
        }
    }
    
    /**
     * Sets the "EffectiveDate" attribute
     */
    public void setEffectiveDate(java.lang.String effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFECTIVEDATE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EFFECTIVEDATE$20);
            }
            target.setStringValue(effectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "EffectiveDate" attribute
     */
    public void xsetEffectiveDate(org.iata.iata.x2007.x00.MMYYDate effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MMYYDate target = null;
            target = (org.iata.iata.x2007.x00.MMYYDate)get_store().find_attribute_user(EFFECTIVEDATE$20);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.MMYYDate)get_store().add_attribute_user(EFFECTIVEDATE$20);
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
            get_store().remove_attribute(EFFECTIVEDATE$20);
        }
    }
    
    /**
     * Gets the "ExpireDate" attribute
     */
    public java.lang.String getExpireDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPIREDATE$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExpireDate" attribute
     */
    public org.iata.iata.x2007.x00.MMYYDate xgetExpireDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MMYYDate target = null;
            target = (org.iata.iata.x2007.x00.MMYYDate)get_store().find_attribute_user(EXPIREDATE$22);
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
            return get_store().find_attribute_user(EXPIREDATE$22) != null;
        }
    }
    
    /**
     * Sets the "ExpireDate" attribute
     */
    public void setExpireDate(java.lang.String expireDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPIREDATE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPIREDATE$22);
            }
            target.setStringValue(expireDate);
        }
    }
    
    /**
     * Sets (as xml) the "ExpireDate" attribute
     */
    public void xsetExpireDate(org.iata.iata.x2007.x00.MMYYDate expireDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MMYYDate target = null;
            target = (org.iata.iata.x2007.x00.MMYYDate)get_store().find_attribute_user(EXPIREDATE$22);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.MMYYDate)get_store().add_attribute_user(EXPIREDATE$22);
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
            get_store().remove_attribute(EXPIREDATE$22);
        }
    }
    
    /**
     * Gets the "MaskedCardNumber" attribute
     */
    public java.lang.String getMaskedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASKEDCARDNUMBER$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaskedCardNumber" attribute
     */
    public org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 xgetMaskedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To19)get_store().find_attribute_user(MASKEDCARDNUMBER$24);
            return target;
        }
    }
    
    /**
     * True if has "MaskedCardNumber" attribute
     */
    public boolean isSetMaskedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MASKEDCARDNUMBER$24) != null;
        }
    }
    
    /**
     * Sets the "MaskedCardNumber" attribute
     */
    public void setMaskedCardNumber(java.lang.String maskedCardNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASKEDCARDNUMBER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MASKEDCARDNUMBER$24);
            }
            target.setStringValue(maskedCardNumber);
        }
    }
    
    /**
     * Sets (as xml) the "MaskedCardNumber" attribute
     */
    public void xsetMaskedCardNumber(org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 maskedCardNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To19)get_store().find_attribute_user(MASKEDCARDNUMBER$24);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To19)get_store().add_attribute_user(MASKEDCARDNUMBER$24);
            }
            target.set(maskedCardNumber);
        }
    }
    
    /**
     * Unsets the "MaskedCardNumber" attribute
     */
    public void unsetMaskedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MASKEDCARDNUMBER$24);
        }
    }
    
    /**
     * Gets the "CardHolderRPH" attribute
     */
    public java.lang.String getCardHolderRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDHOLDERRPH$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CardHolderRPH" attribute
     */
    public org.iata.iata.x2007.x00.RPHType xgetCardHolderRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.RPHType target = null;
            target = (org.iata.iata.x2007.x00.RPHType)get_store().find_attribute_user(CARDHOLDERRPH$26);
            return target;
        }
    }
    
    /**
     * True if has "CardHolderRPH" attribute
     */
    public boolean isSetCardHolderRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CARDHOLDERRPH$26) != null;
        }
    }
    
    /**
     * Sets the "CardHolderRPH" attribute
     */
    public void setCardHolderRPH(java.lang.String cardHolderRPH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDHOLDERRPH$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDHOLDERRPH$26);
            }
            target.setStringValue(cardHolderRPH);
        }
    }
    
    /**
     * Sets (as xml) the "CardHolderRPH" attribute
     */
    public void xsetCardHolderRPH(org.iata.iata.x2007.x00.RPHType cardHolderRPH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.RPHType target = null;
            target = (org.iata.iata.x2007.x00.RPHType)get_store().find_attribute_user(CARDHOLDERRPH$26);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.RPHType)get_store().add_attribute_user(CARDHOLDERRPH$26);
            }
            target.set(cardHolderRPH);
        }
    }
    
    /**
     * Unsets the "CardHolderRPH" attribute
     */
    public void unsetCardHolderRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CARDHOLDERRPH$26);
        }
    }
    
    /**
     * Gets the "AddressValidation" attribute
     */
    public java.lang.String getAddressValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSVALIDATION$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressValidation" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetAddressValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(ADDRESSVALIDATION$28);
            return target;
        }
    }
    
    /**
     * True if has "AddressValidation" attribute
     */
    public boolean isSetAddressValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDRESSVALIDATION$28) != null;
        }
    }
    
    /**
     * Sets the "AddressValidation" attribute
     */
    public void setAddressValidation(java.lang.String addressValidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSVALIDATION$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESSVALIDATION$28);
            }
            target.setStringValue(addressValidation);
        }
    }
    
    /**
     * Sets (as xml) the "AddressValidation" attribute
     */
    public void xsetAddressValidation(org.iata.iata.x2007.x00.StringLength1To32 addressValidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(ADDRESSVALIDATION$28);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(ADDRESSVALIDATION$28);
            }
            target.set(addressValidation);
        }
    }
    
    /**
     * Unsets the "AddressValidation" attribute
     */
    public void unsetAddressValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDRESSVALIDATION$28);
        }
    }
    
    /**
     * Gets the "ApprovalCode" attribute
     */
    public java.lang.String getApprovalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPROVALCODE$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ApprovalCode" attribute
     */
    public org.iata.iata.x2007.x00.AlphaNumericStringLength1To8 xgetApprovalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To8 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To8)get_store().find_attribute_user(APPROVALCODE$30);
            return target;
        }
    }
    
    /**
     * True if has "ApprovalCode" attribute
     */
    public boolean isSetApprovalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPROVALCODE$30) != null;
        }
    }
    
    /**
     * Sets the "ApprovalCode" attribute
     */
    public void setApprovalCode(java.lang.String approvalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPROVALCODE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPROVALCODE$30);
            }
            target.setStringValue(approvalCode);
        }
    }
    
    /**
     * Sets (as xml) the "ApprovalCode" attribute
     */
    public void xsetApprovalCode(org.iata.iata.x2007.x00.AlphaNumericStringLength1To8 approvalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To8 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To8)get_store().find_attribute_user(APPROVALCODE$30);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To8)get_store().add_attribute_user(APPROVALCODE$30);
            }
            target.set(approvalCode);
        }
    }
    
    /**
     * Unsets the "ApprovalCode" attribute
     */
    public void unsetApprovalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPROVALCODE$30);
        }
    }
    
    /**
     * Gets the "CorporateContractCode" attribute
     */
    public java.lang.String getCorporateContractCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORPORATECONTRACTCODE$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CorporateContractCode" attribute
     */
    public org.iata.iata.x2007.x00.AlphaNumericStringLength1 xgetCorporateContractCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1)get_store().find_attribute_user(CORPORATECONTRACTCODE$32);
            return target;
        }
    }
    
    /**
     * True if has "CorporateContractCode" attribute
     */
    public boolean isSetCorporateContractCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CORPORATECONTRACTCODE$32) != null;
        }
    }
    
    /**
     * Sets the "CorporateContractCode" attribute
     */
    public void setCorporateContractCode(java.lang.String corporateContractCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORPORATECONTRACTCODE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CORPORATECONTRACTCODE$32);
            }
            target.setStringValue(corporateContractCode);
        }
    }
    
    /**
     * Sets (as xml) the "CorporateContractCode" attribute
     */
    public void xsetCorporateContractCode(org.iata.iata.x2007.x00.AlphaNumericStringLength1 corporateContractCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1)get_store().find_attribute_user(CORPORATECONTRACTCODE$32);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1)get_store().add_attribute_user(CORPORATECONTRACTCODE$32);
            }
            target.set(corporateContractCode);
        }
    }
    
    /**
     * Unsets the "CorporateContractCode" attribute
     */
    public void unsetCorporateContractCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CORPORATECONTRACTCODE$32);
        }
    }
    
    /**
     * Gets the "Text" attribute
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$34);
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
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(TEXT$34);
            return target;
        }
    }
    
    /**
     * True if has "Text" attribute
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXT$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXT$34);
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
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(TEXT$34);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(TEXT$34);
            }
            target.set(text);
        }
    }
    
    /**
     * Unsets the "Text" attribute
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXT$34);
        }
    }
    
    /**
     * Gets the "ExtendedPaymentCode" attribute
     */
    public java.lang.String getExtendedPaymentCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDEDPAYMENTCODE$36);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExtendedPaymentCode" attribute
     */
    public org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 xgetExtendedPaymentCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To3)get_store().find_attribute_user(EXTENDEDPAYMENTCODE$36);
            return target;
        }
    }
    
    /**
     * True if has "ExtendedPaymentCode" attribute
     */
    public boolean isSetExtendedPaymentCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTENDEDPAYMENTCODE$36) != null;
        }
    }
    
    /**
     * Sets the "ExtendedPaymentCode" attribute
     */
    public void setExtendedPaymentCode(java.lang.String extendedPaymentCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDEDPAYMENTCODE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDEDPAYMENTCODE$36);
            }
            target.setStringValue(extendedPaymentCode);
        }
    }
    
    /**
     * Sets (as xml) the "ExtendedPaymentCode" attribute
     */
    public void xsetExtendedPaymentCode(org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 extendedPaymentCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To3)get_store().find_attribute_user(EXTENDEDPAYMENTCODE$36);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To3)get_store().add_attribute_user(EXTENDEDPAYMENTCODE$36);
            }
            target.set(extendedPaymentCode);
        }
    }
    
    /**
     * Unsets the "ExtendedPaymentCode" attribute
     */
    public void unsetExtendedPaymentCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTENDEDPAYMENTCODE$36);
        }
    }
    
    /**
     * Gets the "ApprovalType" attribute
     */
    public java.lang.String getApprovalType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPROVALTYPE$38);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ApprovalType" attribute
     */
    public org.iata.iata.x2007.x00.IATACodeType xgetApprovalType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(APPROVALTYPE$38);
            return target;
        }
    }
    
    /**
     * True if has "ApprovalType" attribute
     */
    public boolean isSetApprovalType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPROVALTYPE$38) != null;
        }
    }
    
    /**
     * Sets the "ApprovalType" attribute
     */
    public void setApprovalType(java.lang.String approvalType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPROVALTYPE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPROVALTYPE$38);
            }
            target.setStringValue(approvalType);
        }
    }
    
    /**
     * Sets (as xml) the "ApprovalType" attribute
     */
    public void xsetApprovalType(org.iata.iata.x2007.x00.IATACodeType approvalType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(APPROVALTYPE$38);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(APPROVALTYPE$38);
            }
            target.set(approvalType);
        }
    }
    
    /**
     * Unsets the "ApprovalType" attribute
     */
    public void unsetApprovalType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPROVALTYPE$38);
        }
    }
    
    /**
     * Gets the "Amount" attribute
     */
    public java.math.BigDecimal getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMOUNT$40);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Amount" attribute
     */
    public org.iata.iata.x2007.x00.Money xgetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.Money target = null;
            target = (org.iata.iata.x2007.x00.Money)get_store().find_attribute_user(AMOUNT$40);
            return target;
        }
    }
    
    /**
     * True if has "Amount" attribute
     */
    public boolean isSetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AMOUNT$40) != null;
        }
    }
    
    /**
     * Sets the "Amount" attribute
     */
    public void setAmount(java.math.BigDecimal amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMOUNT$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMOUNT$40);
            }
            target.setBigDecimalValue(amount);
        }
    }
    
    /**
     * Sets (as xml) the "Amount" attribute
     */
    public void xsetAmount(org.iata.iata.x2007.x00.Money amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.Money target = null;
            target = (org.iata.iata.x2007.x00.Money)get_store().find_attribute_user(AMOUNT$40);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.Money)get_store().add_attribute_user(AMOUNT$40);
            }
            target.set(amount);
        }
    }
    
    /**
     * Unsets the "Amount" attribute
     */
    public void unsetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AMOUNT$40);
        }
    }
    
    /**
     * Gets the "CurrencyCode" attribute
     */
    public java.lang.String getCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCYCODE$42);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrencyCode" attribute
     */
    public org.iata.iata.x2007.x00.AlphaLength3 xgetCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaLength3 target = null;
            target = (org.iata.iata.x2007.x00.AlphaLength3)get_store().find_attribute_user(CURRENCYCODE$42);
            return target;
        }
    }
    
    /**
     * True if has "CurrencyCode" attribute
     */
    public boolean isSetCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CURRENCYCODE$42) != null;
        }
    }
    
    /**
     * Sets the "CurrencyCode" attribute
     */
    public void setCurrencyCode(java.lang.String currencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCYCODE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENCYCODE$42);
            }
            target.setStringValue(currencyCode);
        }
    }
    
    /**
     * Sets (as xml) the "CurrencyCode" attribute
     */
    public void xsetCurrencyCode(org.iata.iata.x2007.x00.AlphaLength3 currencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaLength3 target = null;
            target = (org.iata.iata.x2007.x00.AlphaLength3)get_store().find_attribute_user(CURRENCYCODE$42);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.AlphaLength3)get_store().add_attribute_user(CURRENCYCODE$42);
            }
            target.set(currencyCode);
        }
    }
    
    /**
     * Unsets the "CurrencyCode" attribute
     */
    public void unsetCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CURRENCYCODE$42);
        }
    }
    
    /**
     * Gets the "DecimalPlaces" attribute
     */
    public java.math.BigInteger getDecimalPlaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALPLACES$44);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "DecimalPlaces" attribute
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetDecimalPlaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(DECIMALPLACES$44);
            return target;
        }
    }
    
    /**
     * True if has "DecimalPlaces" attribute
     */
    public boolean isSetDecimalPlaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECIMALPLACES$44) != null;
        }
    }
    
    /**
     * Sets the "DecimalPlaces" attribute
     */
    public void setDecimalPlaces(java.math.BigInteger decimalPlaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALPLACES$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECIMALPLACES$44);
            }
            target.setBigIntegerValue(decimalPlaces);
        }
    }
    
    /**
     * Sets (as xml) the "DecimalPlaces" attribute
     */
    public void xsetDecimalPlaces(org.apache.xmlbeans.XmlNonNegativeInteger decimalPlaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(DECIMALPLACES$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(DECIMALPLACES$44);
            }
            target.set(decimalPlaces);
        }
    }
    
    /**
     * Unsets the "DecimalPlaces" attribute
     */
    public void unsetDecimalPlaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECIMALPLACES$44);
        }
    }
    
    /**
     * Gets the "TokenizedCardNumber" attribute
     */
    public java.lang.String getTokenizedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOKENIZEDCARDNUMBER$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TokenizedCardNumber" attribute
     */
    public org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 xgetTokenizedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To19)get_store().find_attribute_user(TOKENIZEDCARDNUMBER$46);
            return target;
        }
    }
    
    /**
     * True if has "TokenizedCardNumber" attribute
     */
    public boolean isSetTokenizedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOKENIZEDCARDNUMBER$46) != null;
        }
    }
    
    /**
     * Sets the "TokenizedCardNumber" attribute
     */
    public void setTokenizedCardNumber(java.lang.String tokenizedCardNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOKENIZEDCARDNUMBER$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOKENIZEDCARDNUMBER$46);
            }
            target.setStringValue(tokenizedCardNumber);
        }
    }
    
    /**
     * Sets (as xml) the "TokenizedCardNumber" attribute
     */
    public void xsetTokenizedCardNumber(org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 tokenizedCardNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To19 target = null;
            target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To19)get_store().find_attribute_user(TOKENIZEDCARDNUMBER$46);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To19)get_store().add_attribute_user(TOKENIZEDCARDNUMBER$46);
            }
            target.set(tokenizedCardNumber);
        }
    }
    
    /**
     * Unsets the "TokenizedCardNumber" attribute
     */
    public void unsetTokenizedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOKENIZEDCARDNUMBER$46);
        }
    }
    /**
     * An XML CardIssuerName(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class CardIssuerNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PaymentCardType.CardIssuerName
    {
        
        public CardIssuerNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BANKID$0 = 
            new javax.xml.namespace.QName("", "BankID");
        
        
        /**
         * Gets the "BankID" attribute
         */
        public java.lang.String getBankID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANKID$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BankID" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To64 xgetBankID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To64 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(BANKID$0);
                return target;
            }
        }
        
        /**
         * True if has "BankID" attribute
         */
        public boolean isSetBankID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BANKID$0) != null;
            }
        }
        
        /**
         * Sets the "BankID" attribute
         */
        public void setBankID(java.lang.String bankID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANKID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BANKID$0);
                }
                target.setStringValue(bankID);
            }
        }
        
        /**
         * Sets (as xml) the "BankID" attribute
         */
        public void xsetBankID(org.iata.iata.x2007.x00.StringLength1To64 bankID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To64 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(BANKID$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_attribute_user(BANKID$0);
                }
                target.set(bankID);
            }
        }
        
        /**
         * Unsets the "BankID" attribute
         */
        public void unsetBankID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BANKID$0);
            }
        }
    }
    /**
     * An XML Address(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class AddressImpl extends org.iata.iata.x2007.x00.impl.AddressTypeImpl implements org.iata.iata.x2007.x00.PaymentCardType.Address
    {
        
        public AddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML CustomerFileRef(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class CustomerFileRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PaymentCardType.CustomerFileRef
    {
        
        public CustomerFileRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName URL$0 = 
            new javax.xml.namespace.QName("", "URL");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("", "Type");
        private static final javax.xml.namespace.QName INSTANCE$4 = 
            new javax.xml.namespace.QName("", "Instance");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "ID");
        private static final javax.xml.namespace.QName IDCONTEXT$8 = 
            new javax.xml.namespace.QName("", "ID_Context");
        
        
        /**
         * Gets the "URL" attribute
         */
        public java.lang.String getURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "URL" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URL$0);
                return target;
            }
        }
        
        /**
         * True if has "URL" attribute
         */
        public boolean isSetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(URL$0) != null;
            }
        }
        
        /**
         * Sets the "URL" attribute
         */
        public void setURL(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URL$0);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "URL" attribute
         */
        public void xsetURL(org.apache.xmlbeans.XmlAnyURI url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URL$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URL$0);
                }
                target.set(url);
            }
        }
        
        /**
         * Unsets the "URL" attribute
         */
        public void unsetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(URL$0);
            }
        }
        
        /**
         * Gets the "Type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "Type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$2) != null;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(org.iata.iata.x2007.x00.IATACodeType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$2);
            }
        }
        
        /**
         * Gets the "Instance" attribute
         */
        public java.lang.String getInstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTANCE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Instance" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetInstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(INSTANCE$4);
                return target;
            }
        }
        
        /**
         * True if has "Instance" attribute
         */
        public boolean isSetInstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INSTANCE$4) != null;
            }
        }
        
        /**
         * Sets the "Instance" attribute
         */
        public void setInstance(java.lang.String instance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTANCE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTANCE$4);
                }
                target.setStringValue(instance);
            }
        }
        
        /**
         * Sets (as xml) the "Instance" attribute
         */
        public void xsetInstance(org.iata.iata.x2007.x00.StringLength1To32 instance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(INSTANCE$4);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(INSTANCE$4);
                }
                target.set(instance);
            }
        }
        
        /**
         * Unsets the "Instance" attribute
         */
        public void unsetInstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INSTANCE$4);
            }
        }
        
        /**
         * Gets the "ID" attribute
         */
        public java.lang.String getID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ID" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(ID$6);
                return target;
            }
        }
        
        /**
         * True if has "ID" attribute
         */
        public boolean isSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$6) != null;
            }
        }
        
        /**
         * Sets the "ID" attribute
         */
        public void setID(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "ID" attribute
         */
        public void xsetID(org.iata.iata.x2007.x00.StringLength1To32 id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(ID$6);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "ID" attribute
         */
        public void unsetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$6);
            }
        }
        
        /**
         * Gets the "ID_Context" attribute
         */
        public java.lang.String getIDContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCONTEXT$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ID_Context" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetIDContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(IDCONTEXT$8);
                return target;
            }
        }
        
        /**
         * True if has "ID_Context" attribute
         */
        public boolean isSetIDContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDCONTEXT$8) != null;
            }
        }
        
        /**
         * Sets the "ID_Context" attribute
         */
        public void setIDContext(java.lang.String idContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCONTEXT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDCONTEXT$8);
                }
                target.setStringValue(idContext);
            }
        }
        
        /**
         * Sets (as xml) the "ID_Context" attribute
         */
        public void xsetIDContext(org.iata.iata.x2007.x00.StringLength1To32 idContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(IDCONTEXT$8);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(IDCONTEXT$8);
                }
                target.set(idContext);
            }
        }
        
        /**
         * Unsets the "ID_Context" attribute
         */
        public void unsetIDContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDCONTEXT$8);
            }
        }
    }
    /**
     * An XML ShareSynchInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentCardType$ShareSynchInd.
     */
    public static class ShareSynchIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.PaymentCardType.ShareSynchInd
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
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentCardType$ShareMarketInd.
     */
    public static class ShareMarketIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.PaymentCardType.ShareMarketInd
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
}
