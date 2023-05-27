/*
 * XML Type:  FlightSegmentType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FlightSegmentType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML FlightSegmentType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class FlightSegmentTypeImpl extends org.iata.iata.x2007.x00.impl.FlightSegmentBaseTypeImpl implements org.iata.iata.x2007.x00.FlightSegmentType
{
    
    public FlightSegmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MARKETINGAIRLINE$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "MarketingAirline");
    private static final javax.xml.namespace.QName FLIGHTNUMBER$2 = 
        new javax.xml.namespace.QName("", "FlightNumber");
    private static final javax.xml.namespace.QName TOUROPERATORFLIGHTID$4 = 
        new javax.xml.namespace.QName("", "TourOperatorFlightID");
    private static final javax.xml.namespace.QName OPERATIONALSUFFIX$6 = 
        new javax.xml.namespace.QName("", "OperationalSuffix");
    
    
    /**
     * Gets the "MarketingAirline" element
     */
    public org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline getMarketingAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline)get_store().find_element_user(MARKETINGAIRLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MarketingAirline" element
     */
    public boolean isSetMarketingAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARKETINGAIRLINE$0) != 0;
        }
    }
    
    /**
     * Sets the "MarketingAirline" element
     */
    public void setMarketingAirline(org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline marketingAirline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline)get_store().find_element_user(MARKETINGAIRLINE$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline)get_store().add_element_user(MARKETINGAIRLINE$0);
            }
            target.set(marketingAirline);
        }
    }
    
    /**
     * Appends and returns a new empty "MarketingAirline" element
     */
    public org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline addNewMarketingAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline)get_store().add_element_user(MARKETINGAIRLINE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "MarketingAirline" element
     */
    public void unsetMarketingAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARKETINGAIRLINE$0, 0);
        }
    }
    
    /**
     * Gets the "FlightNumber" attribute
     */
    public java.lang.String getFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIGHTNUMBER$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FlightNumber" attribute
     */
    public org.iata.iata.x2007.x00.FlightNumberType xgetFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightNumberType target = null;
            target = (org.iata.iata.x2007.x00.FlightNumberType)get_store().find_attribute_user(FLIGHTNUMBER$2);
            return target;
        }
    }
    
    /**
     * True if has "FlightNumber" attribute
     */
    public boolean isSetFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLIGHTNUMBER$2) != null;
        }
    }
    
    /**
     * Sets the "FlightNumber" attribute
     */
    public void setFlightNumber(java.lang.String flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIGHTNUMBER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLIGHTNUMBER$2);
            }
            target.setStringValue(flightNumber);
        }
    }
    
    /**
     * Sets (as xml) the "FlightNumber" attribute
     */
    public void xsetFlightNumber(org.iata.iata.x2007.x00.FlightNumberType flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightNumberType target = null;
            target = (org.iata.iata.x2007.x00.FlightNumberType)get_store().find_attribute_user(FLIGHTNUMBER$2);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightNumberType)get_store().add_attribute_user(FLIGHTNUMBER$2);
            }
            target.set(flightNumber);
        }
    }
    
    /**
     * Unsets the "FlightNumber" attribute
     */
    public void unsetFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLIGHTNUMBER$2);
        }
    }
    
    /**
     * Gets the "TourOperatorFlightID" attribute
     */
    public java.lang.String getTourOperatorFlightID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOUROPERATORFLIGHTID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TourOperatorFlightID" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To8 xgetTourOperatorFlightID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To8 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().find_attribute_user(TOUROPERATORFLIGHTID$4);
            return target;
        }
    }
    
    /**
     * True if has "TourOperatorFlightID" attribute
     */
    public boolean isSetTourOperatorFlightID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOUROPERATORFLIGHTID$4) != null;
        }
    }
    
    /**
     * Sets the "TourOperatorFlightID" attribute
     */
    public void setTourOperatorFlightID(java.lang.String tourOperatorFlightID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOUROPERATORFLIGHTID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOUROPERATORFLIGHTID$4);
            }
            target.setStringValue(tourOperatorFlightID);
        }
    }
    
    /**
     * Sets (as xml) the "TourOperatorFlightID" attribute
     */
    public void xsetTourOperatorFlightID(org.iata.iata.x2007.x00.StringLength1To8 tourOperatorFlightID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To8 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().find_attribute_user(TOUROPERATORFLIGHTID$4);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().add_attribute_user(TOUROPERATORFLIGHTID$4);
            }
            target.set(tourOperatorFlightID);
        }
    }
    
    /**
     * Unsets the "TourOperatorFlightID" attribute
     */
    public void unsetTourOperatorFlightID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOUROPERATORFLIGHTID$4);
        }
    }
    
    /**
     * Gets the "OperationalSuffix" attribute
     */
    public java.lang.String getOperationalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATIONALSUFFIX$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OperationalSuffix" attribute
     */
    public org.iata.iata.x2007.x00.OperationalSuffixType xgetOperationalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.OperationalSuffixType target = null;
            target = (org.iata.iata.x2007.x00.OperationalSuffixType)get_store().find_attribute_user(OPERATIONALSUFFIX$6);
            return target;
        }
    }
    
    /**
     * True if has "OperationalSuffix" attribute
     */
    public boolean isSetOperationalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATIONALSUFFIX$6) != null;
        }
    }
    
    /**
     * Sets the "OperationalSuffix" attribute
     */
    public void setOperationalSuffix(java.lang.String operationalSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATIONALSUFFIX$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATIONALSUFFIX$6);
            }
            target.setStringValue(operationalSuffix);
        }
    }
    
    /**
     * Sets (as xml) the "OperationalSuffix" attribute
     */
    public void xsetOperationalSuffix(org.iata.iata.x2007.x00.OperationalSuffixType operationalSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.OperationalSuffixType target = null;
            target = (org.iata.iata.x2007.x00.OperationalSuffixType)get_store().find_attribute_user(OPERATIONALSUFFIX$6);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.OperationalSuffixType)get_store().add_attribute_user(OPERATIONALSUFFIX$6);
            }
            target.set(operationalSuffix);
        }
    }
    
    /**
     * Unsets the "OperationalSuffix" attribute
     */
    public void unsetOperationalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATIONALSUFFIX$6);
        }
    }
    /**
     * An XML MarketingAirline(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightSegmentType$MarketingAirline.
     */
    public static class MarketingAirlineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline
    {
        
        public MarketingAirlineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected MarketingAirlineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
        private static final javax.xml.namespace.QName SINGLEVENDORIND$8 = 
            new javax.xml.namespace.QName("", "SingleVendorInd");
        private static final javax.xml.namespace.QName RESBOOKDESIGCODE$10 = 
            new javax.xml.namespace.QName("", "ResBookDesigCode");
        
        
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
         * Gets the "SingleVendorInd" attribute
         */
        public org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd.Enum getSingleVendorInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINGLEVENDORIND$8);
                if (target == null)
                {
                    return null;
                }
                return (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "SingleVendorInd" attribute
         */
        public org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd xgetSingleVendorInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd target = null;
                target = (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd)get_store().find_attribute_user(SINGLEVENDORIND$8);
                return target;
            }
        }
        
        /**
         * True if has "SingleVendorInd" attribute
         */
        public boolean isSetSingleVendorInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SINGLEVENDORIND$8) != null;
            }
        }
        
        /**
         * Sets the "SingleVendorInd" attribute
         */
        public void setSingleVendorInd(org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd.Enum singleVendorInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINGLEVENDORIND$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SINGLEVENDORIND$8);
                }
                target.setEnumValue(singleVendorInd);
            }
        }
        
        /**
         * Sets (as xml) the "SingleVendorInd" attribute
         */
        public void xsetSingleVendorInd(org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd singleVendorInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd target = null;
                target = (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd)get_store().find_attribute_user(SINGLEVENDORIND$8);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd)get_store().add_attribute_user(SINGLEVENDORIND$8);
                }
                target.set(singleVendorInd);
            }
        }
        
        /**
         * Unsets the "SingleVendorInd" attribute
         */
        public void unsetSingleVendorInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SINGLEVENDORIND$8);
            }
        }
        
        /**
         * Gets the "ResBookDesigCode" attribute
         */
        public java.lang.String getResBookDesigCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESBOOKDESIGCODE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ResBookDesigCode" attribute
         */
        public org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2 xgetResBookDesigCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2 target = null;
                target = (org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2)get_store().find_attribute_user(RESBOOKDESIGCODE$10);
                return target;
            }
        }
        
        /**
         * True if has "ResBookDesigCode" attribute
         */
        public boolean isSetResBookDesigCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESBOOKDESIGCODE$10) != null;
            }
        }
        
        /**
         * Sets the "ResBookDesigCode" attribute
         */
        public void setResBookDesigCode(java.lang.String resBookDesigCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESBOOKDESIGCODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESBOOKDESIGCODE$10);
                }
                target.setStringValue(resBookDesigCode);
            }
        }
        
        /**
         * Sets (as xml) the "ResBookDesigCode" attribute
         */
        public void xsetResBookDesigCode(org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2 resBookDesigCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2 target = null;
                target = (org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2)get_store().find_attribute_user(RESBOOKDESIGCODE$10);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2)get_store().add_attribute_user(RESBOOKDESIGCODE$10);
                }
                target.set(resBookDesigCode);
            }
        }
        
        /**
         * Unsets the "ResBookDesigCode" attribute
         */
        public void unsetResBookDesigCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESBOOKDESIGCODE$10);
            }
        }
        /**
         * An XML SingleVendorInd(@).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightSegmentType$MarketingAirline$SingleVendorInd.
         */
        public static class SingleVendorIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.FlightSegmentType.MarketingAirline.SingleVendorInd
        {
            
            public SingleVendorIndImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SingleVendorIndImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
