/*
 * XML Type:  SourceType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.SourceType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML SourceType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class SourceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.SourceType
{
    
    public SourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTORID$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "RequestorID");
    private static final javax.xml.namespace.QName POSITION$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Position");
    private static final javax.xml.namespace.QName BOOKINGCHANNEL$4 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "BookingChannel");
    private static final javax.xml.namespace.QName AGENTSINE$6 = 
        new javax.xml.namespace.QName("", "AgentSine");
    private static final javax.xml.namespace.QName PSEUDOCITYCODE$8 = 
        new javax.xml.namespace.QName("", "PseudoCityCode");
    private static final javax.xml.namespace.QName ISOCOUNTRY$10 = 
        new javax.xml.namespace.QName("", "ISOCountry");
    private static final javax.xml.namespace.QName ISOCURRENCY$12 = 
        new javax.xml.namespace.QName("", "ISOCurrency");
    private static final javax.xml.namespace.QName AGENTDUTYCODE$14 = 
        new javax.xml.namespace.QName("", "AgentDutyCode");
    private static final javax.xml.namespace.QName AIRLINEVENDORID$16 = 
        new javax.xml.namespace.QName("", "AirlineVendorID");
    private static final javax.xml.namespace.QName AIRPORTCODE$18 = 
        new javax.xml.namespace.QName("", "AirportCode");
    private static final javax.xml.namespace.QName FIRSTDEPARTPOINT$20 = 
        new javax.xml.namespace.QName("", "FirstDepartPoint");
    private static final javax.xml.namespace.QName ERSPUSERID$22 = 
        new javax.xml.namespace.QName("", "ERSP_UserID");
    private static final javax.xml.namespace.QName TERMINALID$24 = 
        new javax.xml.namespace.QName("", "TerminalID");
    
    
    /**
     * Gets the "RequestorID" element
     */
    public org.iata.iata.x2007.x00.SourceType.RequestorID getRequestorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType.RequestorID target = null;
            target = (org.iata.iata.x2007.x00.SourceType.RequestorID)get_store().find_element_user(REQUESTORID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RequestorID" element
     */
    public boolean isSetRequestorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTORID$0) != 0;
        }
    }
    
    /**
     * Sets the "RequestorID" element
     */
    public void setRequestorID(org.iata.iata.x2007.x00.SourceType.RequestorID requestorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType.RequestorID target = null;
            target = (org.iata.iata.x2007.x00.SourceType.RequestorID)get_store().find_element_user(REQUESTORID$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.SourceType.RequestorID)get_store().add_element_user(REQUESTORID$0);
            }
            target.set(requestorID);
        }
    }
    
    /**
     * Appends and returns a new empty "RequestorID" element
     */
    public org.iata.iata.x2007.x00.SourceType.RequestorID addNewRequestorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType.RequestorID target = null;
            target = (org.iata.iata.x2007.x00.SourceType.RequestorID)get_store().add_element_user(REQUESTORID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "RequestorID" element
     */
    public void unsetRequestorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTORID$0, 0);
        }
    }
    
    /**
     * Gets the "Position" element
     */
    public org.iata.iata.x2007.x00.SourceType.Position getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType.Position target = null;
            target = (org.iata.iata.x2007.x00.SourceType.Position)get_store().find_element_user(POSITION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Position" element
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$2) != 0;
        }
    }
    
    /**
     * Sets the "Position" element
     */
    public void setPosition(org.iata.iata.x2007.x00.SourceType.Position position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType.Position target = null;
            target = (org.iata.iata.x2007.x00.SourceType.Position)get_store().find_element_user(POSITION$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.SourceType.Position)get_store().add_element_user(POSITION$2);
            }
            target.set(position);
        }
    }
    
    /**
     * Appends and returns a new empty "Position" element
     */
    public org.iata.iata.x2007.x00.SourceType.Position addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType.Position target = null;
            target = (org.iata.iata.x2007.x00.SourceType.Position)get_store().add_element_user(POSITION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Position" element
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$2, 0);
        }
    }
    
    /**
     * Gets the "BookingChannel" element
     */
    public org.iata.iata.x2007.x00.SourceType.BookingChannel getBookingChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType.BookingChannel target = null;
            target = (org.iata.iata.x2007.x00.SourceType.BookingChannel)get_store().find_element_user(BOOKINGCHANNEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BookingChannel" element
     */
    public boolean isSetBookingChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKINGCHANNEL$4) != 0;
        }
    }
    
    /**
     * Sets the "BookingChannel" element
     */
    public void setBookingChannel(org.iata.iata.x2007.x00.SourceType.BookingChannel bookingChannel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType.BookingChannel target = null;
            target = (org.iata.iata.x2007.x00.SourceType.BookingChannel)get_store().find_element_user(BOOKINGCHANNEL$4, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.SourceType.BookingChannel)get_store().add_element_user(BOOKINGCHANNEL$4);
            }
            target.set(bookingChannel);
        }
    }
    
    /**
     * Appends and returns a new empty "BookingChannel" element
     */
    public org.iata.iata.x2007.x00.SourceType.BookingChannel addNewBookingChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType.BookingChannel target = null;
            target = (org.iata.iata.x2007.x00.SourceType.BookingChannel)get_store().add_element_user(BOOKINGCHANNEL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "BookingChannel" element
     */
    public void unsetBookingChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKINGCHANNEL$4, 0);
        }
    }
    
    /**
     * Gets the "AgentSine" attribute
     */
    public java.lang.String getAgentSine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTSINE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AgentSine" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To16 xgetAgentSine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(AGENTSINE$6);
            return target;
        }
    }
    
    /**
     * True if has "AgentSine" attribute
     */
    public boolean isSetAgentSine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AGENTSINE$6) != null;
        }
    }
    
    /**
     * Sets the "AgentSine" attribute
     */
    public void setAgentSine(java.lang.String agentSine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTSINE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENTSINE$6);
            }
            target.setStringValue(agentSine);
        }
    }
    
    /**
     * Sets (as xml) the "AgentSine" attribute
     */
    public void xsetAgentSine(org.iata.iata.x2007.x00.StringLength1To16 agentSine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(AGENTSINE$6);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(AGENTSINE$6);
            }
            target.set(agentSine);
        }
    }
    
    /**
     * Unsets the "AgentSine" attribute
     */
    public void unsetAgentSine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AGENTSINE$6);
        }
    }
    
    /**
     * Gets the "PseudoCityCode" attribute
     */
    public java.lang.String getPseudoCityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PSEUDOCITYCODE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PseudoCityCode" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To16 xgetPseudoCityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(PSEUDOCITYCODE$8);
            return target;
        }
    }
    
    /**
     * True if has "PseudoCityCode" attribute
     */
    public boolean isSetPseudoCityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PSEUDOCITYCODE$8) != null;
        }
    }
    
    /**
     * Sets the "PseudoCityCode" attribute
     */
    public void setPseudoCityCode(java.lang.String pseudoCityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PSEUDOCITYCODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PSEUDOCITYCODE$8);
            }
            target.setStringValue(pseudoCityCode);
        }
    }
    
    /**
     * Sets (as xml) the "PseudoCityCode" attribute
     */
    public void xsetPseudoCityCode(org.iata.iata.x2007.x00.StringLength1To16 pseudoCityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(PSEUDOCITYCODE$8);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(PSEUDOCITYCODE$8);
            }
            target.set(pseudoCityCode);
        }
    }
    
    /**
     * Unsets the "PseudoCityCode" attribute
     */
    public void unsetPseudoCityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PSEUDOCITYCODE$8);
        }
    }
    
    /**
     * Gets the "ISOCountry" attribute
     */
    public java.lang.String getISOCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOCOUNTRY$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ISOCountry" attribute
     */
    public org.iata.iata.x2007.x00.ISO3166 xgetISOCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.ISO3166 target = null;
            target = (org.iata.iata.x2007.x00.ISO3166)get_store().find_attribute_user(ISOCOUNTRY$10);
            return target;
        }
    }
    
    /**
     * True if has "ISOCountry" attribute
     */
    public boolean isSetISOCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISOCOUNTRY$10) != null;
        }
    }
    
    /**
     * Sets the "ISOCountry" attribute
     */
    public void setISOCountry(java.lang.String isoCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOCOUNTRY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISOCOUNTRY$10);
            }
            target.setStringValue(isoCountry);
        }
    }
    
    /**
     * Sets (as xml) the "ISOCountry" attribute
     */
    public void xsetISOCountry(org.iata.iata.x2007.x00.ISO3166 isoCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.ISO3166 target = null;
            target = (org.iata.iata.x2007.x00.ISO3166)get_store().find_attribute_user(ISOCOUNTRY$10);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.ISO3166)get_store().add_attribute_user(ISOCOUNTRY$10);
            }
            target.set(isoCountry);
        }
    }
    
    /**
     * Unsets the "ISOCountry" attribute
     */
    public void unsetISOCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISOCOUNTRY$10);
        }
    }
    
    /**
     * Gets the "ISOCurrency" attribute
     */
    public java.lang.String getISOCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOCURRENCY$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ISOCurrency" attribute
     */
    public org.iata.iata.x2007.x00.AlphaLength3 xgetISOCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaLength3 target = null;
            target = (org.iata.iata.x2007.x00.AlphaLength3)get_store().find_attribute_user(ISOCURRENCY$12);
            return target;
        }
    }
    
    /**
     * True if has "ISOCurrency" attribute
     */
    public boolean isSetISOCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISOCURRENCY$12) != null;
        }
    }
    
    /**
     * Sets the "ISOCurrency" attribute
     */
    public void setISOCurrency(java.lang.String isoCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOCURRENCY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISOCURRENCY$12);
            }
            target.setStringValue(isoCurrency);
        }
    }
    
    /**
     * Sets (as xml) the "ISOCurrency" attribute
     */
    public void xsetISOCurrency(org.iata.iata.x2007.x00.AlphaLength3 isoCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AlphaLength3 target = null;
            target = (org.iata.iata.x2007.x00.AlphaLength3)get_store().find_attribute_user(ISOCURRENCY$12);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.AlphaLength3)get_store().add_attribute_user(ISOCURRENCY$12);
            }
            target.set(isoCurrency);
        }
    }
    
    /**
     * Unsets the "ISOCurrency" attribute
     */
    public void unsetISOCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISOCURRENCY$12);
        }
    }
    
    /**
     * Gets the "AgentDutyCode" attribute
     */
    public java.lang.String getAgentDutyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTDUTYCODE$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AgentDutyCode" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To16 xgetAgentDutyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(AGENTDUTYCODE$14);
            return target;
        }
    }
    
    /**
     * True if has "AgentDutyCode" attribute
     */
    public boolean isSetAgentDutyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AGENTDUTYCODE$14) != null;
        }
    }
    
    /**
     * Sets the "AgentDutyCode" attribute
     */
    public void setAgentDutyCode(java.lang.String agentDutyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTDUTYCODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENTDUTYCODE$14);
            }
            target.setStringValue(agentDutyCode);
        }
    }
    
    /**
     * Sets (as xml) the "AgentDutyCode" attribute
     */
    public void xsetAgentDutyCode(org.iata.iata.x2007.x00.StringLength1To16 agentDutyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(AGENTDUTYCODE$14);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(AGENTDUTYCODE$14);
            }
            target.set(agentDutyCode);
        }
    }
    
    /**
     * Unsets the "AgentDutyCode" attribute
     */
    public void unsetAgentDutyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AGENTDUTYCODE$14);
        }
    }
    
    /**
     * Gets the "AirlineVendorID" attribute
     */
    public java.lang.String getAirlineVendorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AIRLINEVENDORID$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AirlineVendorID" attribute
     */
    public org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength2To3 xgetAirlineVendorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength2To3 target = null;
            target = (org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength2To3)get_store().find_attribute_user(AIRLINEVENDORID$16);
            return target;
        }
    }
    
    /**
     * True if has "AirlineVendorID" attribute
     */
    public boolean isSetAirlineVendorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AIRLINEVENDORID$16) != null;
        }
    }
    
    /**
     * Sets the "AirlineVendorID" attribute
     */
    public void setAirlineVendorID(java.lang.String airlineVendorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AIRLINEVENDORID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AIRLINEVENDORID$16);
            }
            target.setStringValue(airlineVendorID);
        }
    }
    
    /**
     * Sets (as xml) the "AirlineVendorID" attribute
     */
    public void xsetAirlineVendorID(org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength2To3 airlineVendorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength2To3 target = null;
            target = (org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength2To3)get_store().find_attribute_user(AIRLINEVENDORID$16);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength2To3)get_store().add_attribute_user(AIRLINEVENDORID$16);
            }
            target.set(airlineVendorID);
        }
    }
    
    /**
     * Unsets the "AirlineVendorID" attribute
     */
    public void unsetAirlineVendorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AIRLINEVENDORID$16);
        }
    }
    
    /**
     * Gets the "AirportCode" attribute
     */
    public java.lang.String getAirportCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AIRPORTCODE$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AirportCode" attribute
     */
    public org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength3To5 xgetAirportCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength3To5 target = null;
            target = (org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength3To5)get_store().find_attribute_user(AIRPORTCODE$18);
            return target;
        }
    }
    
    /**
     * True if has "AirportCode" attribute
     */
    public boolean isSetAirportCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AIRPORTCODE$18) != null;
        }
    }
    
    /**
     * Sets the "AirportCode" attribute
     */
    public void setAirportCode(java.lang.String airportCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AIRPORTCODE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AIRPORTCODE$18);
            }
            target.setStringValue(airportCode);
        }
    }
    
    /**
     * Sets (as xml) the "AirportCode" attribute
     */
    public void xsetAirportCode(org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength3To5 airportCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength3To5 target = null;
            target = (org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength3To5)get_store().find_attribute_user(AIRPORTCODE$18);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.UpperCaseAlphaNumericLength3To5)get_store().add_attribute_user(AIRPORTCODE$18);
            }
            target.set(airportCode);
        }
    }
    
    /**
     * Unsets the "AirportCode" attribute
     */
    public void unsetAirportCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AIRPORTCODE$18);
        }
    }
    
    /**
     * Gets the "FirstDepartPoint" attribute
     */
    public java.lang.String getFirstDepartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTDEPARTPOINT$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FirstDepartPoint" attribute
     */
    public org.iata.iata.x2007.x00.StringLength3 xgetFirstDepartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength3 target = null;
            target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_attribute_user(FIRSTDEPARTPOINT$20);
            return target;
        }
    }
    
    /**
     * True if has "FirstDepartPoint" attribute
     */
    public boolean isSetFirstDepartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTDEPARTPOINT$20) != null;
        }
    }
    
    /**
     * Sets the "FirstDepartPoint" attribute
     */
    public void setFirstDepartPoint(java.lang.String firstDepartPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTDEPARTPOINT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTDEPARTPOINT$20);
            }
            target.setStringValue(firstDepartPoint);
        }
    }
    
    /**
     * Sets (as xml) the "FirstDepartPoint" attribute
     */
    public void xsetFirstDepartPoint(org.iata.iata.x2007.x00.StringLength3 firstDepartPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength3 target = null;
            target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_attribute_user(FIRSTDEPARTPOINT$20);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength3)get_store().add_attribute_user(FIRSTDEPARTPOINT$20);
            }
            target.set(firstDepartPoint);
        }
    }
    
    /**
     * Unsets the "FirstDepartPoint" attribute
     */
    public void unsetFirstDepartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTDEPARTPOINT$20);
        }
    }
    
    /**
     * Gets the "ERSP_UserID" attribute
     */
    public java.lang.String getERSPUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERSPUSERID$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ERSP_UserID" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To16 xgetERSPUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(ERSPUSERID$22);
            return target;
        }
    }
    
    /**
     * True if has "ERSP_UserID" attribute
     */
    public boolean isSetERSPUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERSPUSERID$22) != null;
        }
    }
    
    /**
     * Sets the "ERSP_UserID" attribute
     */
    public void setERSPUserID(java.lang.String erspUserID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERSPUSERID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERSPUSERID$22);
            }
            target.setStringValue(erspUserID);
        }
    }
    
    /**
     * Sets (as xml) the "ERSP_UserID" attribute
     */
    public void xsetERSPUserID(org.iata.iata.x2007.x00.StringLength1To16 erspUserID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(ERSPUSERID$22);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(ERSPUSERID$22);
            }
            target.set(erspUserID);
        }
    }
    
    /**
     * Unsets the "ERSP_UserID" attribute
     */
    public void unsetERSPUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERSPUSERID$22);
        }
    }
    
    /**
     * Gets the "TerminalID" attribute
     */
    public java.lang.String getTerminalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMINALID$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TerminalID" attribute
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetTerminalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(TERMINALID$24);
            return target;
        }
    }
    
    /**
     * True if has "TerminalID" attribute
     */
    public boolean isSetTerminalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TERMINALID$24) != null;
        }
    }
    
    /**
     * Sets the "TerminalID" attribute
     */
    public void setTerminalID(java.lang.String terminalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMINALID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMINALID$24);
            }
            target.setStringValue(terminalID);
        }
    }
    
    /**
     * Sets (as xml) the "TerminalID" attribute
     */
    public void xsetTerminalID(org.iata.iata.x2007.x00.StringLength1To32 terminalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(TERMINALID$24);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(TERMINALID$24);
            }
            target.set(terminalID);
        }
    }
    
    /**
     * Unsets the "TerminalID" attribute
     */
    public void unsetTerminalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TERMINALID$24);
        }
    }
    /**
     * An XML RequestorID(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class RequestorIDImpl extends org.iata.iata.x2007.x00.impl.UniqueIDTypeImpl implements org.iata.iata.x2007.x00.SourceType.RequestorID
    {
        
        public RequestorIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGEPASSWORD$0 = 
            new javax.xml.namespace.QName("", "MessagePassword");
        
        
        /**
         * Gets the "MessagePassword" attribute
         */
        public java.lang.String getMessagePassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEPASSWORD$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MessagePassword" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetMessagePassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(MESSAGEPASSWORD$0);
                return target;
            }
        }
        
        /**
         * True if has "MessagePassword" attribute
         */
        public boolean isSetMessagePassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MESSAGEPASSWORD$0) != null;
            }
        }
        
        /**
         * Sets the "MessagePassword" attribute
         */
        public void setMessagePassword(java.lang.String messagePassword)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEPASSWORD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGEPASSWORD$0);
                }
                target.setStringValue(messagePassword);
            }
        }
        
        /**
         * Sets (as xml) the "MessagePassword" attribute
         */
        public void xsetMessagePassword(org.iata.iata.x2007.x00.StringLength1To16 messagePassword)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(MESSAGEPASSWORD$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(MESSAGEPASSWORD$0);
                }
                target.set(messagePassword);
            }
        }
        
        /**
         * Unsets the "MessagePassword" attribute
         */
        public void unsetMessagePassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MESSAGEPASSWORD$0);
            }
        }
    }
    /**
     * An XML Position(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class PositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.SourceType.Position
    {
        
        public PositionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LATITUDE$0 = 
            new javax.xml.namespace.QName("", "Latitude");
        private static final javax.xml.namespace.QName LONGITUDE$2 = 
            new javax.xml.namespace.QName("", "Longitude");
        private static final javax.xml.namespace.QName ALTITUDE$4 = 
            new javax.xml.namespace.QName("", "Altitude");
        private static final javax.xml.namespace.QName ALTITUDEUNITOFMEASURECODE$6 = 
            new javax.xml.namespace.QName("", "AltitudeUnitOfMeasureCode");
        
        
        /**
         * Gets the "Latitude" attribute
         */
        public java.lang.String getLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATITUDE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Latitude" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(LATITUDE$0);
                return target;
            }
        }
        
        /**
         * True if has "Latitude" attribute
         */
        public boolean isSetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LATITUDE$0) != null;
            }
        }
        
        /**
         * Sets the "Latitude" attribute
         */
        public void setLatitude(java.lang.String latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATITUDE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATITUDE$0);
                }
                target.setStringValue(latitude);
            }
        }
        
        /**
         * Sets (as xml) the "Latitude" attribute
         */
        public void xsetLatitude(org.iata.iata.x2007.x00.StringLength1To16 latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(LATITUDE$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(LATITUDE$0);
                }
                target.set(latitude);
            }
        }
        
        /**
         * Unsets the "Latitude" attribute
         */
        public void unsetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LATITUDE$0);
            }
        }
        
        /**
         * Gets the "Longitude" attribute
         */
        public java.lang.String getLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGITUDE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Longitude" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(LONGITUDE$2);
                return target;
            }
        }
        
        /**
         * True if has "Longitude" attribute
         */
        public boolean isSetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LONGITUDE$2) != null;
            }
        }
        
        /**
         * Sets the "Longitude" attribute
         */
        public void setLongitude(java.lang.String longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGITUDE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LONGITUDE$2);
                }
                target.setStringValue(longitude);
            }
        }
        
        /**
         * Sets (as xml) the "Longitude" attribute
         */
        public void xsetLongitude(org.iata.iata.x2007.x00.StringLength1To16 longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(LONGITUDE$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(LONGITUDE$2);
                }
                target.set(longitude);
            }
        }
        
        /**
         * Unsets the "Longitude" attribute
         */
        public void unsetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LONGITUDE$2);
            }
        }
        
        /**
         * Gets the "Altitude" attribute
         */
        public java.lang.String getAltitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTITUDE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Altitude" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetAltitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(ALTITUDE$4);
                return target;
            }
        }
        
        /**
         * True if has "Altitude" attribute
         */
        public boolean isSetAltitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALTITUDE$4) != null;
            }
        }
        
        /**
         * Sets the "Altitude" attribute
         */
        public void setAltitude(java.lang.String altitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTITUDE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALTITUDE$4);
                }
                target.setStringValue(altitude);
            }
        }
        
        /**
         * Sets (as xml) the "Altitude" attribute
         */
        public void xsetAltitude(org.iata.iata.x2007.x00.StringLength1To16 altitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(ALTITUDE$4);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(ALTITUDE$4);
                }
                target.set(altitude);
            }
        }
        
        /**
         * Unsets the "Altitude" attribute
         */
        public void unsetAltitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALTITUDE$4);
            }
        }
        
        /**
         * Gets the "AltitudeUnitOfMeasureCode" attribute
         */
        public java.lang.String getAltitudeUnitOfMeasureCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTITUDEUNITOFMEASURECODE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AltitudeUnitOfMeasureCode" attribute
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetAltitudeUnitOfMeasureCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(ALTITUDEUNITOFMEASURECODE$6);
                return target;
            }
        }
        
        /**
         * True if has "AltitudeUnitOfMeasureCode" attribute
         */
        public boolean isSetAltitudeUnitOfMeasureCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALTITUDEUNITOFMEASURECODE$6) != null;
            }
        }
        
        /**
         * Sets the "AltitudeUnitOfMeasureCode" attribute
         */
        public void setAltitudeUnitOfMeasureCode(java.lang.String altitudeUnitOfMeasureCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTITUDEUNITOFMEASURECODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALTITUDEUNITOFMEASURECODE$6);
                }
                target.setStringValue(altitudeUnitOfMeasureCode);
            }
        }
        
        /**
         * Sets (as xml) the "AltitudeUnitOfMeasureCode" attribute
         */
        public void xsetAltitudeUnitOfMeasureCode(org.iata.iata.x2007.x00.IATACodeType altitudeUnitOfMeasureCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(ALTITUDEUNITOFMEASURECODE$6);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(ALTITUDEUNITOFMEASURECODE$6);
                }
                target.set(altitudeUnitOfMeasureCode);
            }
        }
        
        /**
         * Unsets the "AltitudeUnitOfMeasureCode" attribute
         */
        public void unsetAltitudeUnitOfMeasureCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALTITUDEUNITOFMEASURECODE$6);
            }
        }
    }
    /**
     * An XML BookingChannel(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class BookingChannelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.SourceType.BookingChannel
    {
        
        public BookingChannelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMPANYNAME$0 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CompanyName");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("", "Type");
        private static final javax.xml.namespace.QName PRIMARY$4 = 
            new javax.xml.namespace.QName("", "Primary");
        
        
        /**
         * Gets the "CompanyName" element
         */
        public org.iata.iata.x2007.x00.CompanyNameType getCompanyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.CompanyNameType target = null;
                target = (org.iata.iata.x2007.x00.CompanyNameType)get_store().find_element_user(COMPANYNAME$0, 0);
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
        public void setCompanyName(org.iata.iata.x2007.x00.CompanyNameType companyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.CompanyNameType target = null;
                target = (org.iata.iata.x2007.x00.CompanyNameType)get_store().find_element_user(COMPANYNAME$0, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.CompanyNameType)get_store().add_element_user(COMPANYNAME$0);
                }
                target.set(companyName);
            }
        }
        
        /**
         * Appends and returns a new empty "CompanyName" element
         */
        public org.iata.iata.x2007.x00.CompanyNameType addNewCompanyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.CompanyNameType target = null;
                target = (org.iata.iata.x2007.x00.CompanyNameType)get_store().add_element_user(COMPANYNAME$0);
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
         * Gets the "Primary" attribute
         */
        public boolean getPrimary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIMARY$4);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Primary" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetPrimary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRIMARY$4);
                return target;
            }
        }
        
        /**
         * True if has "Primary" attribute
         */
        public boolean isSetPrimary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PRIMARY$4) != null;
            }
        }
        
        /**
         * Sets the "Primary" attribute
         */
        public void setPrimary(boolean primary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIMARY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIMARY$4);
                }
                target.setBooleanValue(primary);
            }
        }
        
        /**
         * Sets (as xml) the "Primary" attribute
         */
        public void xsetPrimary(org.apache.xmlbeans.XmlBoolean primary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRIMARY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRIMARY$4);
                }
                target.set(primary);
            }
        }
        
        /**
         * Unsets the "Primary" attribute
         */
        public void unsetPrimary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PRIMARY$4);
            }
        }
    }
}
