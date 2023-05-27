/*
 * XML Type:  OperatingAirlineType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.OperatingAirlineType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML OperatingAirlineType(@http://www.iata.org/IATA/2007/00).
 *
 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.OperatingAirlineType.
 */
public class OperatingAirlineTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.OperatingAirlineType
{
    
    public OperatingAirlineTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected OperatingAirlineTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
    private static final javax.xml.namespace.QName FLIGHTNUMBER$8 = 
        new javax.xml.namespace.QName("", "FlightNumber");
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
     * Gets the "FlightNumber" attribute
     */
    public java.lang.String getFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIGHTNUMBER$8);
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
            target = (org.iata.iata.x2007.x00.FlightNumberType)get_store().find_attribute_user(FLIGHTNUMBER$8);
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
            return get_store().find_attribute_user(FLIGHTNUMBER$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIGHTNUMBER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLIGHTNUMBER$8);
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
            target = (org.iata.iata.x2007.x00.FlightNumberType)get_store().find_attribute_user(FLIGHTNUMBER$8);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightNumberType)get_store().add_attribute_user(FLIGHTNUMBER$8);
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
            get_store().remove_attribute(FLIGHTNUMBER$8);
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
}
