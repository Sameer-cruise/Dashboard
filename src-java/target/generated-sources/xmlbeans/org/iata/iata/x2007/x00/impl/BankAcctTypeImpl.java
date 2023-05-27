/*
 * XML Type:  BankAcctType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.BankAcctType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML BankAcctType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class BankAcctTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.BankAcctType
{
    
    public BankAcctTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BANKACCTNAME$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "BankAcctName");
    private static final javax.xml.namespace.QName SHARESYNCHIND$2 = 
        new javax.xml.namespace.QName("", "ShareSynchInd");
    private static final javax.xml.namespace.QName SHAREMARKETIND$4 = 
        new javax.xml.namespace.QName("", "ShareMarketInd");
    private static final javax.xml.namespace.QName BANKID$6 = 
        new javax.xml.namespace.QName("", "BankID");
    private static final javax.xml.namespace.QName ACCTTYPE$8 = 
        new javax.xml.namespace.QName("", "AcctType");
    private static final javax.xml.namespace.QName BANKACCTNUMBER$10 = 
        new javax.xml.namespace.QName("", "BankAcctNumber");
    private static final javax.xml.namespace.QName CHECKSACCEPTEDIND$12 = 
        new javax.xml.namespace.QName("", "ChecksAcceptedInd");
    
    
    /**
     * Gets the "BankAcctName" element
     */
    public java.lang.String getBankAcctName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BANKACCTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BankAcctName" element
     */
    public org.iata.iata.x2007.x00.StringLength1To64 xgetBankAcctName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(BANKACCTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "BankAcctName" element
     */
    public boolean isSetBankAcctName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BANKACCTNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "BankAcctName" element
     */
    public void setBankAcctName(java.lang.String bankAcctName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BANKACCTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BANKACCTNAME$0);
            }
            target.setStringValue(bankAcctName);
        }
    }
    
    /**
     * Sets (as xml) the "BankAcctName" element
     */
    public void xsetBankAcctName(org.iata.iata.x2007.x00.StringLength1To64 bankAcctName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(BANKACCTNAME$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_element_user(BANKACCTNAME$0);
            }
            target.set(bankAcctName);
        }
    }
    
    /**
     * Unsets the "BankAcctName" element
     */
    public void unsetBankAcctName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BANKACCTNAME$0, 0);
        }
    }
    
    /**
     * Gets the "ShareSynchInd" attribute
     */
    public org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd.Enum getShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESYNCHIND$2);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShareSynchInd" attribute
     */
    public org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd xgetShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd target = null;
            target = (org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd)get_store().find_attribute_user(SHARESYNCHIND$2);
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
            return get_store().find_attribute_user(SHARESYNCHIND$2) != null;
        }
    }
    
    /**
     * Sets the "ShareSynchInd" attribute
     */
    public void setShareSynchInd(org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd.Enum shareSynchInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESYNCHIND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHARESYNCHIND$2);
            }
            target.setEnumValue(shareSynchInd);
        }
    }
    
    /**
     * Sets (as xml) the "ShareSynchInd" attribute
     */
    public void xsetShareSynchInd(org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd shareSynchInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd target = null;
            target = (org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd)get_store().find_attribute_user(SHARESYNCHIND$2);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd)get_store().add_attribute_user(SHARESYNCHIND$2);
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
            get_store().remove_attribute(SHARESYNCHIND$2);
        }
    }
    
    /**
     * Gets the "ShareMarketInd" attribute
     */
    public org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd.Enum getShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREMARKETIND$4);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShareMarketInd" attribute
     */
    public org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd xgetShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd target = null;
            target = (org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd)get_store().find_attribute_user(SHAREMARKETIND$4);
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
            return get_store().find_attribute_user(SHAREMARKETIND$4) != null;
        }
    }
    
    /**
     * Sets the "ShareMarketInd" attribute
     */
    public void setShareMarketInd(org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd.Enum shareMarketInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREMARKETIND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHAREMARKETIND$4);
            }
            target.setEnumValue(shareMarketInd);
        }
    }
    
    /**
     * Sets (as xml) the "ShareMarketInd" attribute
     */
    public void xsetShareMarketInd(org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd shareMarketInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd target = null;
            target = (org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd)get_store().find_attribute_user(SHAREMARKETIND$4);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd)get_store().add_attribute_user(SHAREMARKETIND$4);
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
            get_store().remove_attribute(SHAREMARKETIND$4);
        }
    }
    
    /**
     * Gets the "BankID" attribute
     */
    public java.lang.String getBankID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANKID$6);
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
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(BANKID$6);
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
            return get_store().find_attribute_user(BANKID$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANKID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BANKID$6);
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
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(BANKID$6);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_attribute_user(BANKID$6);
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
            get_store().remove_attribute(BANKID$6);
        }
    }
    
    /**
     * Gets the "AcctType" attribute
     */
    public java.lang.String getAcctType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCTTYPE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AcctType" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetAcctType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(ACCTTYPE$8);
            return target;
        }
    }
    
    /**
     * True if has "AcctType" attribute
     */
    public boolean isSetAcctType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCTTYPE$8) != null;
        }
    }
    
    /**
     * Sets the "AcctType" attribute
     */
    public void setAcctType(java.lang.String acctType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCTTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCTTYPE$8);
            }
            target.setStringValue(acctType);
        }
    }
    
    /**
     * Sets (as xml) the "AcctType" attribute
     */
    public void xsetAcctType(org.iata.iata.x2007.x00.StringLength1To32 acctType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(ACCTTYPE$8);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(ACCTTYPE$8);
            }
            target.set(acctType);
        }
    }
    
    /**
     * Unsets the "AcctType" attribute
     */
    public void unsetAcctType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCTTYPE$8);
        }
    }
    
    /**
     * Gets the "BankAcctNumber" attribute
     */
    public java.lang.String getBankAcctNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANKACCTNUMBER$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BankAcctNumber" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetBankAcctNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(BANKACCTNUMBER$10);
            return target;
        }
    }
    
    /**
     * True if has "BankAcctNumber" attribute
     */
    public boolean isSetBankAcctNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BANKACCTNUMBER$10) != null;
        }
    }
    
    /**
     * Sets the "BankAcctNumber" attribute
     */
    public void setBankAcctNumber(java.lang.String bankAcctNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANKACCTNUMBER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BANKACCTNUMBER$10);
            }
            target.setStringValue(bankAcctNumber);
        }
    }
    
    /**
     * Sets (as xml) the "BankAcctNumber" attribute
     */
    public void xsetBankAcctNumber(org.iata.iata.x2007.x00.StringLength1To32 bankAcctNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(BANKACCTNUMBER$10);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(BANKACCTNUMBER$10);
            }
            target.set(bankAcctNumber);
        }
    }
    
    /**
     * Unsets the "BankAcctNumber" attribute
     */
    public void unsetBankAcctNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BANKACCTNUMBER$10);
        }
    }
    
    /**
     * Gets the "ChecksAcceptedInd" attribute
     */
    public boolean getChecksAcceptedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKSACCEPTEDIND$12);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChecksAcceptedInd" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetChecksAcceptedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CHECKSACCEPTEDIND$12);
            return target;
        }
    }
    
    /**
     * True if has "ChecksAcceptedInd" attribute
     */
    public boolean isSetChecksAcceptedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHECKSACCEPTEDIND$12) != null;
        }
    }
    
    /**
     * Sets the "ChecksAcceptedInd" attribute
     */
    public void setChecksAcceptedInd(boolean checksAcceptedInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKSACCEPTEDIND$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHECKSACCEPTEDIND$12);
            }
            target.setBooleanValue(checksAcceptedInd);
        }
    }
    
    /**
     * Sets (as xml) the "ChecksAcceptedInd" attribute
     */
    public void xsetChecksAcceptedInd(org.apache.xmlbeans.XmlBoolean checksAcceptedInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CHECKSACCEPTEDIND$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CHECKSACCEPTEDIND$12);
            }
            target.set(checksAcceptedInd);
        }
    }
    
    /**
     * Unsets the "ChecksAcceptedInd" attribute
     */
    public void unsetChecksAcceptedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHECKSACCEPTEDIND$12);
        }
    }
    /**
     * An XML ShareSynchInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.BankAcctType$ShareSynchInd.
     */
    public static class ShareSynchIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.BankAcctType.ShareSynchInd
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
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.BankAcctType$ShareMarketInd.
     */
    public static class ShareMarketIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.BankAcctType.ShareMarketInd
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
