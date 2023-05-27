/*
 * XML Type:  FlightLegIdentifierType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FlightLegIdentifierType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML FlightLegIdentifierType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class FlightLegIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegIdentifierType
{
    
    public FlightLegIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRLINE$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Airline");
    private static final javax.xml.namespace.QName FLIGHTNUMBER$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "FlightNumber");
    private static final javax.xml.namespace.QName OPERATIONALSUFFIX$4 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "OperationalSuffix");
    private static final javax.xml.namespace.QName DEPARTUREAIRPORT$6 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "DepartureAirport");
    private static final javax.xml.namespace.QName ARRIVALAIRPORT$8 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "ArrivalAirport");
    private static final javax.xml.namespace.QName ORIGINDATE$10 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "OriginDate");
    private static final javax.xml.namespace.QName REPEATNUMBER$12 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "RepeatNumber");
    
    
    /**
     * Gets the "Airline" element
     */
    public org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline getAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline)get_store().find_element_user(AIRLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Airline" element
     */
    public void setAirline(org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline airline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline)get_store().find_element_user(AIRLINE$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline)get_store().add_element_user(AIRLINE$0);
            }
            target.set(airline);
        }
    }
    
    /**
     * Appends and returns a new empty "Airline" element
     */
    public org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline addNewAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline)get_store().add_element_user(AIRLINE$0);
            return target;
        }
    }
    
    /**
     * Gets the "FlightNumber" element
     */
    public java.lang.String getFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FlightNumber" element
     */
    public org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FlightNumber" element
     */
    public void setFlightNumber(java.lang.String flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTNUMBER$2);
            }
            target.setStringValue(flightNumber);
        }
    }
    
    /**
     * Sets (as xml) the "FlightNumber" element
     */
    public void xsetFlightNumber(org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.NumericStringLength1To4 target = null;
            target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().add_element_user(FLIGHTNUMBER$2);
            }
            target.set(flightNumber);
        }
    }
    
    /**
     * Gets the "OperationalSuffix" element
     */
    public java.lang.String getOperationalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALSUFFIX$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OperationalSuffix" element
     */
    public org.iata.iata.x2007.x00.OperationalSuffixType xgetOperationalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.OperationalSuffixType target = null;
            target = (org.iata.iata.x2007.x00.OperationalSuffixType)get_store().find_element_user(OPERATIONALSUFFIX$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "OperationalSuffix" element
     */
    public boolean isSetOperationalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONALSUFFIX$4) != 0;
        }
    }
    
    /**
     * Sets the "OperationalSuffix" element
     */
    public void setOperationalSuffix(java.lang.String operationalSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALSUFFIX$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONALSUFFIX$4);
            }
            target.setStringValue(operationalSuffix);
        }
    }
    
    /**
     * Sets (as xml) the "OperationalSuffix" element
     */
    public void xsetOperationalSuffix(org.iata.iata.x2007.x00.OperationalSuffixType operationalSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.OperationalSuffixType target = null;
            target = (org.iata.iata.x2007.x00.OperationalSuffixType)get_store().find_element_user(OPERATIONALSUFFIX$4, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.OperationalSuffixType)get_store().add_element_user(OPERATIONALSUFFIX$4);
            }
            target.set(operationalSuffix);
        }
    }
    
    /**
     * Unsets the "OperationalSuffix" element
     */
    public void unsetOperationalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONALSUFFIX$4, 0);
        }
    }
    
    /**
     * Gets the "DepartureAirport" element
     */
    public org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport getDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DepartureAirport" element
     */
    public void setDepartureAirport(org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport departureAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$6, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$6);
            }
            target.set(departureAirport);
        }
    }
    
    /**
     * Appends and returns a new empty "DepartureAirport" element
     */
    public org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport addNewDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$6);
            return target;
        }
    }
    
    /**
     * Gets the "ArrivalAirport" element
     */
    public org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport getArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArrivalAirport" element
     */
    public void setArrivalAirport(org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport arrivalAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$8, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$8);
            }
            target.set(arrivalAirport);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrivalAirport" element
     */
    public org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport addNewArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$8);
            return target;
        }
    }
    
    /**
     * Gets the "OriginDate" element
     */
    public java.util.Calendar getOriginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OriginDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetOriginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ORIGINDATE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OriginDate" element
     */
    public void setOriginDate(java.util.Calendar originDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINDATE$10);
            }
            target.setCalendarValue(originDate);
        }
    }
    
    /**
     * Sets (as xml) the "OriginDate" element
     */
    public void xsetOriginDate(org.apache.xmlbeans.XmlDate originDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ORIGINDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ORIGINDATE$10);
            }
            target.set(originDate);
        }
    }
    
    /**
     * Gets the "RepeatNumber" element
     */
    public org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber getRepeatNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber)get_store().find_element_user(REPEATNUMBER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RepeatNumber" element
     */
    public boolean isSetRepeatNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPEATNUMBER$12) != 0;
        }
    }
    
    /**
     * Sets the "RepeatNumber" element
     */
    public void setRepeatNumber(org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber repeatNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber)get_store().find_element_user(REPEATNUMBER$12, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber)get_store().add_element_user(REPEATNUMBER$12);
            }
            target.set(repeatNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "RepeatNumber" element
     */
    public org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber addNewRepeatNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber)get_store().add_element_user(REPEATNUMBER$12);
            return target;
        }
    }
    
    /**
     * Unsets the "RepeatNumber" element
     */
    public void unsetRepeatNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPEATNUMBER$12, 0);
        }
    }
    /**
     * An XML Airline(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegIdentifierType$Airline.
     */
    public static class AirlineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegIdentifierType.Airline
    {
        
        public AirlineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected AirlineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODECONTEXT$0 = 
            new javax.xml.namespace.QName("", "CodeContext");
        
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
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
        public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
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
                return get_store().find_attribute_user(CODECONTEXT$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
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
                get_store().remove_attribute(CODECONTEXT$0);
            }
        }
    }
    /**
     * An XML DepartureAirport(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegIdentifierType$DepartureAirport.
     */
    public static class DepartureAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegIdentifierType.DepartureAirport
    {
        
        public DepartureAirportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected DepartureAirportImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODECONTEXT$0 = 
            new javax.xml.namespace.QName("", "CodeContext");
        
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
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
        public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
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
                return get_store().find_attribute_user(CODECONTEXT$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
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
                get_store().remove_attribute(CODECONTEXT$0);
            }
        }
    }
    /**
     * An XML ArrivalAirport(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegIdentifierType$ArrivalAirport.
     */
    public static class ArrivalAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegIdentifierType.ArrivalAirport
    {
        
        public ArrivalAirportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ArrivalAirportImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODECONTEXT$0 = 
            new javax.xml.namespace.QName("", "CodeContext");
        
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
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
        public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
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
                return get_store().find_attribute_user(CODECONTEXT$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$0);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$0);
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
                get_store().remove_attribute(CODECONTEXT$0);
            }
        }
    }
    /**
     * An XML RepeatNumber(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegIdentifierType$RepeatNumber.
     */
    public static class RepeatNumberImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.iata.iata.x2007.x00.FlightLegIdentifierType.RepeatNumber
    {
        
        public RepeatNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RepeatNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CURRENTIND$0 = 
            new javax.xml.namespace.QName("", "CurrentInd");
        
        
        /**
         * Gets the "CurrentInd" attribute
         */
        public boolean getCurrentInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENTIND$0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "CurrentInd" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetCurrentInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CURRENTIND$0);
                return target;
            }
        }
        
        /**
         * True if has "CurrentInd" attribute
         */
        public boolean isSetCurrentInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CURRENTIND$0) != null;
            }
        }
        
        /**
         * Sets the "CurrentInd" attribute
         */
        public void setCurrentInd(boolean currentInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENTIND$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENTIND$0);
                }
                target.setBooleanValue(currentInd);
            }
        }
        
        /**
         * Sets (as xml) the "CurrentInd" attribute
         */
        public void xsetCurrentInd(org.apache.xmlbeans.XmlBoolean currentInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CURRENTIND$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CURRENTIND$0);
                }
                target.set(currentInd);
            }
        }
        
        /**
         * Unsets the "CurrentInd" attribute
         */
        public void unsetCurrentInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CURRENTIND$0);
            }
        }
    }
}
