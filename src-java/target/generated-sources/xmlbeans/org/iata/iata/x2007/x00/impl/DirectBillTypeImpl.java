/*
 * XML Type:  DirectBillType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.DirectBillType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML DirectBillType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class DirectBillTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.DirectBillType
{
    
    public DirectBillTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPANYNAME$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CompanyName");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Address");
    private static final javax.xml.namespace.QName SHARESYNCHIND$4 = 
        new javax.xml.namespace.QName("", "ShareSynchInd");
    private static final javax.xml.namespace.QName SHAREMARKETIND$6 = 
        new javax.xml.namespace.QName("", "ShareMarketInd");
    private static final javax.xml.namespace.QName DIRECTBILLID$8 = 
        new javax.xml.namespace.QName("", "DirectBill_ID");
    
    
    /**
     * Gets the "CompanyName" element
     */
    public org.iata.iata.x2007.x00.DirectBillType.CompanyName getCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DirectBillType.CompanyName target = null;
            target = (org.iata.iata.x2007.x00.DirectBillType.CompanyName)get_store().find_element_user(COMPANYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CompanyName" element
     */
    public boolean isSetCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "CompanyName" element
     */
    public void setCompanyName(org.iata.iata.x2007.x00.DirectBillType.CompanyName companyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DirectBillType.CompanyName target = null;
            target = (org.iata.iata.x2007.x00.DirectBillType.CompanyName)get_store().find_element_user(COMPANYNAME$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.DirectBillType.CompanyName)get_store().add_element_user(COMPANYNAME$0);
            }
            target.set(companyName);
        }
    }
    
    /**
     * Appends and returns a new empty "CompanyName" element
     */
    public org.iata.iata.x2007.x00.DirectBillType.CompanyName addNewCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DirectBillType.CompanyName target = null;
            target = (org.iata.iata.x2007.x00.DirectBillType.CompanyName)get_store().add_element_user(COMPANYNAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CompanyName" element
     */
    public void unsetCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANYNAME$0, 0);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public org.iata.iata.x2007.x00.AddressType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AddressType target = null;
            target = (org.iata.iata.x2007.x00.AddressType)get_store().find_element_user(ADDRESS$2, 0);
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
            return get_store().count_elements(ADDRESS$2) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(org.iata.iata.x2007.x00.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AddressType target = null;
            target = (org.iata.iata.x2007.x00.AddressType)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.AddressType)get_store().add_element_user(ADDRESS$2);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public org.iata.iata.x2007.x00.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AddressType target = null;
            target = (org.iata.iata.x2007.x00.AddressType)get_store().add_element_user(ADDRESS$2);
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
            get_store().remove_element(ADDRESS$2, 0);
        }
    }
    
    /**
     * Gets the "ShareSynchInd" attribute
     */
    public org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd.Enum getShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESYNCHIND$4);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShareSynchInd" attribute
     */
    public org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd xgetShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd target = null;
            target = (org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd)get_store().find_attribute_user(SHARESYNCHIND$4);
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
            return get_store().find_attribute_user(SHARESYNCHIND$4) != null;
        }
    }
    
    /**
     * Sets the "ShareSynchInd" attribute
     */
    public void setShareSynchInd(org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd.Enum shareSynchInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESYNCHIND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHARESYNCHIND$4);
            }
            target.setEnumValue(shareSynchInd);
        }
    }
    
    /**
     * Sets (as xml) the "ShareSynchInd" attribute
     */
    public void xsetShareSynchInd(org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd shareSynchInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd target = null;
            target = (org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd)get_store().find_attribute_user(SHARESYNCHIND$4);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd)get_store().add_attribute_user(SHARESYNCHIND$4);
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
            get_store().remove_attribute(SHARESYNCHIND$4);
        }
    }
    
    /**
     * Gets the "ShareMarketInd" attribute
     */
    public org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd.Enum getShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREMARKETIND$6);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShareMarketInd" attribute
     */
    public org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd xgetShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd target = null;
            target = (org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd)get_store().find_attribute_user(SHAREMARKETIND$6);
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
            return get_store().find_attribute_user(SHAREMARKETIND$6) != null;
        }
    }
    
    /**
     * Sets the "ShareMarketInd" attribute
     */
    public void setShareMarketInd(org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd.Enum shareMarketInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREMARKETIND$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHAREMARKETIND$6);
            }
            target.setEnumValue(shareMarketInd);
        }
    }
    
    /**
     * Sets (as xml) the "ShareMarketInd" attribute
     */
    public void xsetShareMarketInd(org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd shareMarketInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd target = null;
            target = (org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd)get_store().find_attribute_user(SHAREMARKETIND$6);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd)get_store().add_attribute_user(SHAREMARKETIND$6);
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
            get_store().remove_attribute(SHAREMARKETIND$6);
        }
    }
    
    /**
     * Gets the "DirectBill_ID" attribute
     */
    public java.lang.String getDirectBillID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTBILLID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DirectBill_ID" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetDirectBillID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(DIRECTBILLID$8);
            return target;
        }
    }
    
    /**
     * True if has "DirectBill_ID" attribute
     */
    public boolean isSetDirectBillID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIRECTBILLID$8) != null;
        }
    }
    
    /**
     * Sets the "DirectBill_ID" attribute
     */
    public void setDirectBillID(java.lang.String directBillID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTBILLID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTBILLID$8);
            }
            target.setStringValue(directBillID);
        }
    }
    
    /**
     * Sets (as xml) the "DirectBill_ID" attribute
     */
    public void xsetDirectBillID(org.iata.iata.x2007.x00.StringLength1To32 directBillID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(DIRECTBILLID$8);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(DIRECTBILLID$8);
            }
            target.set(directBillID);
        }
    }
    
    /**
     * Unsets the "DirectBill_ID" attribute
     */
    public void unsetDirectBillID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIRECTBILLID$8);
        }
    }
    /**
     * An XML CompanyName(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.DirectBillType$CompanyName.
     */
    public static class CompanyNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.DirectBillType.CompanyName
    {
        
        public CompanyNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected CompanyNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName COMPANYSHORTNAME$0 = 
            new javax.xml.namespace.QName("", "CompanyShortName");
        private static final javax.xml.namespace.QName TRAVELSECTOR$2 = 
            new javax.xml.namespace.QName("", "TravelSector");
        private static final javax.xml.namespace.QName CODE$4 = 
            new javax.xml.namespace.QName("", "Code");
        private static final javax.xml.namespace.QName CODECONTEXT$6 = 
            new javax.xml.namespace.QName("", "CodeContext");
        private static final javax.xml.namespace.QName CONTACTNAME$8 = 
            new javax.xml.namespace.QName("", "ContactName");
        
        
        /**
         * Gets the "CompanyShortName" attribute
         */
        public java.lang.String getCompanyShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANYSHORTNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CompanyShortName" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetCompanyShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(COMPANYSHORTNAME$0);
                return target;
            }
        }
        
        /**
         * True if has "CompanyShortName" attribute
         */
        public boolean isSetCompanyShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMPANYSHORTNAME$0) != null;
            }
        }
        
        /**
         * Sets the "CompanyShortName" attribute
         */
        public void setCompanyShortName(java.lang.String companyShortName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANYSHORTNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPANYSHORTNAME$0);
                }
                target.setStringValue(companyShortName);
            }
        }
        
        /**
         * Sets (as xml) the "CompanyShortName" attribute
         */
        public void xsetCompanyShortName(org.iata.iata.x2007.x00.StringLength1To32 companyShortName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(COMPANYSHORTNAME$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(COMPANYSHORTNAME$0);
                }
                target.set(companyShortName);
            }
        }
        
        /**
         * Unsets the "CompanyShortName" attribute
         */
        public void unsetCompanyShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMPANYSHORTNAME$0);
            }
        }
        
        /**
         * Gets the "TravelSector" attribute
         */
        public java.lang.String getTravelSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRAVELSECTOR$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TravelSector" attribute
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetTravelSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TRAVELSECTOR$2);
                return target;
            }
        }
        
        /**
         * True if has "TravelSector" attribute
         */
        public boolean isSetTravelSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRAVELSECTOR$2) != null;
            }
        }
        
        /**
         * Sets the "TravelSector" attribute
         */
        public void setTravelSector(java.lang.String travelSector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRAVELSECTOR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRAVELSECTOR$2);
                }
                target.setStringValue(travelSector);
            }
        }
        
        /**
         * Sets (as xml) the "TravelSector" attribute
         */
        public void xsetTravelSector(org.iata.iata.x2007.x00.IATACodeType travelSector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TRAVELSECTOR$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(TRAVELSECTOR$2);
                }
                target.set(travelSector);
            }
        }
        
        /**
         * Unsets the "TravelSector" attribute
         */
        public void unsetTravelSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRAVELSECTOR$2);
            }
        }
        
        /**
         * Gets the "Code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Code" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(CODE$4);
                return target;
            }
        }
        
        /**
         * True if has "Code" attribute
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODE$4) != null;
            }
        }
        
        /**
         * Sets the "Code" attribute
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$4);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "Code" attribute
         */
        public void xsetCode(org.iata.iata.x2007.x00.StringLength1To16 code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(CODE$4);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(CODE$4);
                }
                target.set(code);
            }
        }
        
        /**
         * Unsets the "Code" attribute
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODE$4);
            }
        }
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CodeContext" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CODECONTEXT$6);
                return target;
            }
        }
        
        /**
         * True if has "CodeContext" attribute
         */
        public boolean isSetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODECONTEXT$6) != null;
            }
        }
        
        /**
         * Sets the "CodeContext" attribute
         */
        public void setCodeContext(java.lang.String codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$6);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.StringLength1To32 codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CODECONTEXT$6);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(CODECONTEXT$6);
                }
                target.set(codeContext);
            }
        }
        
        /**
         * Unsets the "CodeContext" attribute
         */
        public void unsetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODECONTEXT$6);
            }
        }
        
        /**
         * Gets the "ContactName" attribute
         */
        public java.lang.String getContactName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTACTNAME$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ContactName" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To64 xgetContactName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To64 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(CONTACTNAME$8);
                return target;
            }
        }
        
        /**
         * True if has "ContactName" attribute
         */
        public boolean isSetContactName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONTACTNAME$8) != null;
            }
        }
        
        /**
         * Sets the "ContactName" attribute
         */
        public void setContactName(java.lang.String contactName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTACTNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTACTNAME$8);
                }
                target.setStringValue(contactName);
            }
        }
        
        /**
         * Sets (as xml) the "ContactName" attribute
         */
        public void xsetContactName(org.iata.iata.x2007.x00.StringLength1To64 contactName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To64 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_attribute_user(CONTACTNAME$8);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_attribute_user(CONTACTNAME$8);
                }
                target.set(contactName);
            }
        }
        
        /**
         * Unsets the "ContactName" attribute
         */
        public void unsetContactName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONTACTNAME$8);
            }
        }
    }
    /**
     * An XML ShareSynchInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.DirectBillType$ShareSynchInd.
     */
    public static class ShareSynchIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.DirectBillType.ShareSynchInd
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
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.DirectBillType$ShareMarketInd.
     */
    public static class ShareMarketIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.DirectBillType.ShareMarketInd
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
