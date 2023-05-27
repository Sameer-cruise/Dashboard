/*
 * XML Type:  FlightLegType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FlightLegType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML FlightLegType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class FlightLegTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType
{
    
    public FlightLegTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEGIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "LegIdentifier");
    private static final javax.xml.namespace.QName SPECIALACTION$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "SpecialAction");
    private static final javax.xml.namespace.QName LEGDATA$4 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "LegData");
    private static final javax.xml.namespace.QName TPAEXTENSION$6 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "TPA_Extension");
    
    
    /**
     * Gets the "LegIdentifier" element
     */
    public org.iata.iata.x2007.x00.FlightLegIdentifierType getLegIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType)get_store().find_element_user(LEGIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LegIdentifier" element
     */
    public void setLegIdentifier(org.iata.iata.x2007.x00.FlightLegIdentifierType legIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType)get_store().find_element_user(LEGIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightLegIdentifierType)get_store().add_element_user(LEGIDENTIFIER$0);
            }
            target.set(legIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "LegIdentifier" element
     */
    public org.iata.iata.x2007.x00.FlightLegIdentifierType addNewLegIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegIdentifierType target = null;
            target = (org.iata.iata.x2007.x00.FlightLegIdentifierType)get_store().add_element_user(LEGIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets the "SpecialAction" element
     */
    public org.iata.iata.x2007.x00.FlightLegType.SpecialAction.Enum getSpecialAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALACTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.FlightLegType.SpecialAction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SpecialAction" element
     */
    public org.iata.iata.x2007.x00.FlightLegType.SpecialAction xgetSpecialAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType.SpecialAction target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType.SpecialAction)get_store().find_element_user(SPECIALACTION$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SpecialAction" element
     */
    public boolean isNilSpecialAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType.SpecialAction target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType.SpecialAction)get_store().find_element_user(SPECIALACTION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SpecialAction" element
     */
    public boolean isSetSpecialAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIALACTION$2) != 0;
        }
    }
    
    /**
     * Sets the "SpecialAction" element
     */
    public void setSpecialAction(org.iata.iata.x2007.x00.FlightLegType.SpecialAction.Enum specialAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALACTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPECIALACTION$2);
            }
            target.setEnumValue(specialAction);
        }
    }
    
    /**
     * Sets (as xml) the "SpecialAction" element
     */
    public void xsetSpecialAction(org.iata.iata.x2007.x00.FlightLegType.SpecialAction specialAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType.SpecialAction target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType.SpecialAction)get_store().find_element_user(SPECIALACTION$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightLegType.SpecialAction)get_store().add_element_user(SPECIALACTION$2);
            }
            target.set(specialAction);
        }
    }
    
    /**
     * Nils the "SpecialAction" element
     */
    public void setNilSpecialAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType.SpecialAction target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType.SpecialAction)get_store().find_element_user(SPECIALACTION$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightLegType.SpecialAction)get_store().add_element_user(SPECIALACTION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SpecialAction" element
     */
    public void unsetSpecialAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIALACTION$2, 0);
        }
    }
    
    /**
     * Gets the "LegData" element
     */
    public org.iata.iata.x2007.x00.FlightLegType.LegData getLegData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType.LegData target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType.LegData)get_store().find_element_user(LEGDATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LegData" element
     */
    public void setLegData(org.iata.iata.x2007.x00.FlightLegType.LegData legData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType.LegData target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType.LegData)get_store().find_element_user(LEGDATA$4, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData)get_store().add_element_user(LEGDATA$4);
            }
            target.set(legData);
        }
    }
    
    /**
     * Appends and returns a new empty "LegData" element
     */
    public org.iata.iata.x2007.x00.FlightLegType.LegData addNewLegData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightLegType.LegData target = null;
            target = (org.iata.iata.x2007.x00.FlightLegType.LegData)get_store().add_element_user(LEGDATA$4);
            return target;
        }
    }
    
    /**
     * Gets the "TPA_Extension" element
     */
    public org.iata.iata.x2007.x00.TPAExtensionsType getTPAExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.TPAExtensionsType target = null;
            target = (org.iata.iata.x2007.x00.TPAExtensionsType)get_store().find_element_user(TPAEXTENSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TPA_Extension" element
     */
    public boolean isSetTPAExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TPAEXTENSION$6) != 0;
        }
    }
    
    /**
     * Sets the "TPA_Extension" element
     */
    public void setTPAExtension(org.iata.iata.x2007.x00.TPAExtensionsType tpaExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.TPAExtensionsType target = null;
            target = (org.iata.iata.x2007.x00.TPAExtensionsType)get_store().find_element_user(TPAEXTENSION$6, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.TPAExtensionsType)get_store().add_element_user(TPAEXTENSION$6);
            }
            target.set(tpaExtension);
        }
    }
    
    /**
     * Appends and returns a new empty "TPA_Extension" element
     */
    public org.iata.iata.x2007.x00.TPAExtensionsType addNewTPAExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.TPAExtensionsType target = null;
            target = (org.iata.iata.x2007.x00.TPAExtensionsType)get_store().add_element_user(TPAEXTENSION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "TPA_Extension" element
     */
    public void unsetTPAExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TPAEXTENSION$6, 0);
        }
    }
    /**
     * An XML SpecialAction(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$SpecialAction.
     */
    public static class SpecialActionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.FlightLegType.SpecialAction
    {
        
        public SpecialActionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SpecialActionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML LegData(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class LegDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData
    {
        
        public LegDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPERATIONALSTATUS$0 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "OperationalStatus");
        private static final javax.xml.namespace.QName PUBLICSTATUS$2 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PublicStatus");
        private static final javax.xml.namespace.QName OPERATINGALLIANCE$4 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "OperatingAlliance");
        private static final javax.xml.namespace.QName SERVICETYPE$6 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "ServiceType");
        private static final javax.xml.namespace.QName TECHNICALSTOPIND$8 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "TechnicalStopInd");
        private static final javax.xml.namespace.QName DEPSECURITYCHECKIND$10 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "DepSecurityCheckInd");
        private static final javax.xml.namespace.QName ARRSECURITYCHECKIND$12 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "ArrSecurityCheckInd");
        private static final javax.xml.namespace.QName ESTFLIGHTDURATION$14 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "EstFlightDuration");
        private static final javax.xml.namespace.QName OWNERAIRLINE$16 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "OwnerAirline");
        private static final javax.xml.namespace.QName PLANNEDARRIVALAPTHISTORY$18 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PlannedArrivalAptHistory");
        private static final javax.xml.namespace.QName SPECIALEMPHASIS$20 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "SpecialEmphasis");
        private static final javax.xml.namespace.QName IRREGULARITYDELAY$22 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "IrregularityDelay");
        private static final javax.xml.namespace.QName CABINCLASS$24 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CabinClass");
        private static final javax.xml.namespace.QName SPECIALCARGO$26 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "SpecialCargo");
        private static final javax.xml.namespace.QName CODESHAREINFO$28 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CodeShareInfo");
        private static final javax.xml.namespace.QName ASSOCIATEDFLIGHTLEGAIRCRAFT$30 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AssociatedFlightLegAircraft");
        private static final javax.xml.namespace.QName ASSOCIATEDFLIGHTLEGSCHEDULE$32 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AssociatedFlightLegSchedule");
        private static final javax.xml.namespace.QName REMARKTEXTCODE$34 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "RemarkTextCode");
        private static final javax.xml.namespace.QName REMARKFREETEXT$36 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "RemarkFreeText");
        private static final javax.xml.namespace.QName AIRPORTRESOURCES$38 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AirportResources");
        private static final javax.xml.namespace.QName OPERATIONTIME$40 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "OperationTime");
        private static final javax.xml.namespace.QName AIRCRAFTINFO$42 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AircraftInfo");
        private static final javax.xml.namespace.QName CLEARANCEAGREEMENT$44 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "ClearanceAgreement");
        private static final javax.xml.namespace.QName PUBLICFLIGHTDISPLAY$46 = 
            new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PublicFlightDisplay");
        private static final javax.xml.namespace.QName FLIGHTCLASSIFICATION$48 = 
            new javax.xml.namespace.QName("", "FlightClassification");
        private static final javax.xml.namespace.QName INTERNATIONALSTATUS$50 = 
            new javax.xml.namespace.QName("", "InternationalStatus");
        
        
        /**
         * Gets array of all "OperationalStatus" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus[] getOperationalStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OPERATIONALSTATUS$0, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OperationalStatus" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus getOperationalStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "OperationalStatus" element
         */
        public boolean isNilOperationalStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "OperationalStatus" element
         */
        public int sizeOfOperationalStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPERATIONALSTATUS$0);
            }
        }
        
        /**
         * Sets array of all "OperationalStatus" element
         */
        public void setOperationalStatusArray(org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus[] operationalStatusArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(operationalStatusArray, OPERATIONALSTATUS$0);
            }
        }
        
        /**
         * Sets ith "OperationalStatus" element
         */
        public void setOperationalStatusArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus operationalStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(operationalStatus);
            }
        }
        
        /**
         * Nils the ith "OperationalStatus" element
         */
        public void setNilOperationalStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus)get_store().find_element_user(OPERATIONALSTATUS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OperationalStatus" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus insertNewOperationalStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus)get_store().insert_element_user(OPERATIONALSTATUS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OperationalStatus" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus addNewOperationalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus)get_store().add_element_user(OPERATIONALSTATUS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "OperationalStatus" element
         */
        public void removeOperationalStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPERATIONALSTATUS$0, i);
            }
        }
        
        /**
         * Gets the "PublicStatus" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus getPublicStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus)get_store().find_element_user(PUBLICSTATUS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "PublicStatus" element
         */
        public boolean isNilPublicStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus)get_store().find_element_user(PUBLICSTATUS$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "PublicStatus" element
         */
        public boolean isSetPublicStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUBLICSTATUS$2) != 0;
            }
        }
        
        /**
         * Sets the "PublicStatus" element
         */
        public void setPublicStatus(org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus publicStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus)get_store().find_element_user(PUBLICSTATUS$2, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus)get_store().add_element_user(PUBLICSTATUS$2);
                }
                target.set(publicStatus);
            }
        }
        
        /**
         * Appends and returns a new empty "PublicStatus" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus addNewPublicStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus)get_store().add_element_user(PUBLICSTATUS$2);
                return target;
            }
        }
        
        /**
         * Nils the "PublicStatus" element
         */
        public void setNilPublicStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus)get_store().find_element_user(PUBLICSTATUS$2, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus)get_store().add_element_user(PUBLICSTATUS$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "PublicStatus" element
         */
        public void unsetPublicStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUBLICSTATUS$2, 0);
            }
        }
        
        /**
         * Gets the "OperatingAlliance" element
         */
        public java.lang.String getOperatingAlliance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATINGALLIANCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperatingAlliance" element
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetOperatingAlliance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_element_user(OPERATINGALLIANCE$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "OperatingAlliance" element
         */
        public boolean isNilOperatingAlliance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_element_user(OPERATINGALLIANCE$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "OperatingAlliance" element
         */
        public boolean isSetOperatingAlliance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPERATINGALLIANCE$4) != 0;
            }
        }
        
        /**
         * Sets the "OperatingAlliance" element
         */
        public void setOperatingAlliance(java.lang.String operatingAlliance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATINGALLIANCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATINGALLIANCE$4);
                }
                target.setStringValue(operatingAlliance);
            }
        }
        
        /**
         * Sets (as xml) the "OperatingAlliance" element
         */
        public void xsetOperatingAlliance(org.iata.iata.x2007.x00.IATACodeType operatingAlliance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_element_user(OPERATINGALLIANCE$4, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_element_user(OPERATINGALLIANCE$4);
                }
                target.set(operatingAlliance);
            }
        }
        
        /**
         * Nils the "OperatingAlliance" element
         */
        public void setNilOperatingAlliance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_element_user(OPERATINGALLIANCE$4, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_element_user(OPERATINGALLIANCE$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "OperatingAlliance" element
         */
        public void unsetOperatingAlliance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPERATINGALLIANCE$4, 0);
            }
        }
        
        /**
         * Gets the "ServiceType" element
         */
        public java.lang.String getServiceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICETYPE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ServiceType" element
         */
        public org.iata.iata.x2007.x00.ServiceType xgetServiceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.ServiceType target = null;
                target = (org.iata.iata.x2007.x00.ServiceType)get_store().find_element_user(SERVICETYPE$6, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "ServiceType" element
         */
        public boolean isNilServiceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.ServiceType target = null;
                target = (org.iata.iata.x2007.x00.ServiceType)get_store().find_element_user(SERVICETYPE$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "ServiceType" element
         */
        public boolean isSetServiceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICETYPE$6) != 0;
            }
        }
        
        /**
         * Sets the "ServiceType" element
         */
        public void setServiceType(java.lang.String serviceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICETYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICETYPE$6);
                }
                target.setStringValue(serviceType);
            }
        }
        
        /**
         * Sets (as xml) the "ServiceType" element
         */
        public void xsetServiceType(org.iata.iata.x2007.x00.ServiceType serviceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.ServiceType target = null;
                target = (org.iata.iata.x2007.x00.ServiceType)get_store().find_element_user(SERVICETYPE$6, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.ServiceType)get_store().add_element_user(SERVICETYPE$6);
                }
                target.set(serviceType);
            }
        }
        
        /**
         * Nils the "ServiceType" element
         */
        public void setNilServiceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.ServiceType target = null;
                target = (org.iata.iata.x2007.x00.ServiceType)get_store().find_element_user(SERVICETYPE$6, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.ServiceType)get_store().add_element_user(SERVICETYPE$6);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "ServiceType" element
         */
        public void unsetServiceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICETYPE$6, 0);
            }
        }
        
        /**
         * Gets the "TechnicalStopInd" element
         */
        public boolean getTechnicalStopInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TECHNICALSTOPIND$8, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "TechnicalStopInd" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetTechnicalStopInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TECHNICALSTOPIND$8, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "TechnicalStopInd" element
         */
        public boolean isNilTechnicalStopInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TECHNICALSTOPIND$8, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "TechnicalStopInd" element
         */
        public boolean isSetTechnicalStopInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TECHNICALSTOPIND$8) != 0;
            }
        }
        
        /**
         * Sets the "TechnicalStopInd" element
         */
        public void setTechnicalStopInd(boolean technicalStopInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TECHNICALSTOPIND$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TECHNICALSTOPIND$8);
                }
                target.setBooleanValue(technicalStopInd);
            }
        }
        
        /**
         * Sets (as xml) the "TechnicalStopInd" element
         */
        public void xsetTechnicalStopInd(org.apache.xmlbeans.XmlBoolean technicalStopInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TECHNICALSTOPIND$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TECHNICALSTOPIND$8);
                }
                target.set(technicalStopInd);
            }
        }
        
        /**
         * Nils the "TechnicalStopInd" element
         */
        public void setNilTechnicalStopInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TECHNICALSTOPIND$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TECHNICALSTOPIND$8);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "TechnicalStopInd" element
         */
        public void unsetTechnicalStopInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TECHNICALSTOPIND$8, 0);
            }
        }
        
        /**
         * Gets the "DepSecurityCheckInd" element
         */
        public boolean getDepSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPSECURITYCHECKIND$10, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "DepSecurityCheckInd" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetDepSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEPSECURITYCHECKIND$10, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "DepSecurityCheckInd" element
         */
        public boolean isNilDepSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEPSECURITYCHECKIND$10, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "DepSecurityCheckInd" element
         */
        public boolean isSetDepSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEPSECURITYCHECKIND$10) != 0;
            }
        }
        
        /**
         * Sets the "DepSecurityCheckInd" element
         */
        public void setDepSecurityCheckInd(boolean depSecurityCheckInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPSECURITYCHECKIND$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPSECURITYCHECKIND$10);
                }
                target.setBooleanValue(depSecurityCheckInd);
            }
        }
        
        /**
         * Sets (as xml) the "DepSecurityCheckInd" element
         */
        public void xsetDepSecurityCheckInd(org.apache.xmlbeans.XmlBoolean depSecurityCheckInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEPSECURITYCHECKIND$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DEPSECURITYCHECKIND$10);
                }
                target.set(depSecurityCheckInd);
            }
        }
        
        /**
         * Nils the "DepSecurityCheckInd" element
         */
        public void setNilDepSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEPSECURITYCHECKIND$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DEPSECURITYCHECKIND$10);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "DepSecurityCheckInd" element
         */
        public void unsetDepSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEPSECURITYCHECKIND$10, 0);
            }
        }
        
        /**
         * Gets the "ArrSecurityCheckInd" element
         */
        public boolean getArrSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRSECURITYCHECKIND$12, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "ArrSecurityCheckInd" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetArrSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ARRSECURITYCHECKIND$12, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "ArrSecurityCheckInd" element
         */
        public boolean isNilArrSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ARRSECURITYCHECKIND$12, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "ArrSecurityCheckInd" element
         */
        public boolean isSetArrSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARRSECURITYCHECKIND$12) != 0;
            }
        }
        
        /**
         * Sets the "ArrSecurityCheckInd" element
         */
        public void setArrSecurityCheckInd(boolean arrSecurityCheckInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRSECURITYCHECKIND$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARRSECURITYCHECKIND$12);
                }
                target.setBooleanValue(arrSecurityCheckInd);
            }
        }
        
        /**
         * Sets (as xml) the "ArrSecurityCheckInd" element
         */
        public void xsetArrSecurityCheckInd(org.apache.xmlbeans.XmlBoolean arrSecurityCheckInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ARRSECURITYCHECKIND$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ARRSECURITYCHECKIND$12);
                }
                target.set(arrSecurityCheckInd);
            }
        }
        
        /**
         * Nils the "ArrSecurityCheckInd" element
         */
        public void setNilArrSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ARRSECURITYCHECKIND$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ARRSECURITYCHECKIND$12);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "ArrSecurityCheckInd" element
         */
        public void unsetArrSecurityCheckInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARRSECURITYCHECKIND$12, 0);
            }
        }
        
        /**
         * Gets the "EstFlightDuration" element
         */
        public org.apache.xmlbeans.GDuration getEstFlightDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTFLIGHTDURATION$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getGDurationValue();
            }
        }
        
        /**
         * Gets (as xml) the "EstFlightDuration" element
         */
        public org.apache.xmlbeans.XmlDuration xgetEstFlightDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDuration target = null;
                target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(ESTFLIGHTDURATION$14, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "EstFlightDuration" element
         */
        public boolean isNilEstFlightDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDuration target = null;
                target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(ESTFLIGHTDURATION$14, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "EstFlightDuration" element
         */
        public boolean isSetEstFlightDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ESTFLIGHTDURATION$14) != 0;
            }
        }
        
        /**
         * Sets the "EstFlightDuration" element
         */
        public void setEstFlightDuration(org.apache.xmlbeans.GDuration estFlightDuration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTFLIGHTDURATION$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTFLIGHTDURATION$14);
                }
                target.setGDurationValue(estFlightDuration);
            }
        }
        
        /**
         * Sets (as xml) the "EstFlightDuration" element
         */
        public void xsetEstFlightDuration(org.apache.xmlbeans.XmlDuration estFlightDuration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDuration target = null;
                target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(ESTFLIGHTDURATION$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(ESTFLIGHTDURATION$14);
                }
                target.set(estFlightDuration);
            }
        }
        
        /**
         * Nils the "EstFlightDuration" element
         */
        public void setNilEstFlightDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDuration target = null;
                target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(ESTFLIGHTDURATION$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(ESTFLIGHTDURATION$14);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "EstFlightDuration" element
         */
        public void unsetEstFlightDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ESTFLIGHTDURATION$14, 0);
            }
        }
        
        /**
         * Gets the "OwnerAirline" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline getOwnerAirline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline)get_store().find_element_user(OWNERAIRLINE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "OwnerAirline" element
         */
        public boolean isNilOwnerAirline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline)get_store().find_element_user(OWNERAIRLINE$16, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "OwnerAirline" element
         */
        public boolean isSetOwnerAirline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OWNERAIRLINE$16) != 0;
            }
        }
        
        /**
         * Sets the "OwnerAirline" element
         */
        public void setOwnerAirline(org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline ownerAirline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline)get_store().find_element_user(OWNERAIRLINE$16, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline)get_store().add_element_user(OWNERAIRLINE$16);
                }
                target.set(ownerAirline);
            }
        }
        
        /**
         * Appends and returns a new empty "OwnerAirline" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline addNewOwnerAirline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline)get_store().add_element_user(OWNERAIRLINE$16);
                return target;
            }
        }
        
        /**
         * Nils the "OwnerAirline" element
         */
        public void setNilOwnerAirline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline)get_store().find_element_user(OWNERAIRLINE$16, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline)get_store().add_element_user(OWNERAIRLINE$16);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "OwnerAirline" element
         */
        public void unsetOwnerAirline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OWNERAIRLINE$16, 0);
            }
        }
        
        /**
         * Gets array of all "PlannedArrivalAptHistory" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory[] getPlannedArrivalAptHistoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLANNEDARRIVALAPTHISTORY$18, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PlannedArrivalAptHistory" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory getPlannedArrivalAptHistoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory)get_store().find_element_user(PLANNEDARRIVALAPTHISTORY$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "PlannedArrivalAptHistory" element
         */
        public boolean isNilPlannedArrivalAptHistoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory)get_store().find_element_user(PLANNEDARRIVALAPTHISTORY$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "PlannedArrivalAptHistory" element
         */
        public int sizeOfPlannedArrivalAptHistoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLANNEDARRIVALAPTHISTORY$18);
            }
        }
        
        /**
         * Sets array of all "PlannedArrivalAptHistory" element
         */
        public void setPlannedArrivalAptHistoryArray(org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory[] plannedArrivalAptHistoryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(plannedArrivalAptHistoryArray, PLANNEDARRIVALAPTHISTORY$18);
            }
        }
        
        /**
         * Sets ith "PlannedArrivalAptHistory" element
         */
        public void setPlannedArrivalAptHistoryArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory plannedArrivalAptHistory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory)get_store().find_element_user(PLANNEDARRIVALAPTHISTORY$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(plannedArrivalAptHistory);
            }
        }
        
        /**
         * Nils the ith "PlannedArrivalAptHistory" element
         */
        public void setNilPlannedArrivalAptHistoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory)get_store().find_element_user(PLANNEDARRIVALAPTHISTORY$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PlannedArrivalAptHistory" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory insertNewPlannedArrivalAptHistory(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory)get_store().insert_element_user(PLANNEDARRIVALAPTHISTORY$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PlannedArrivalAptHistory" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory addNewPlannedArrivalAptHistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory)get_store().add_element_user(PLANNEDARRIVALAPTHISTORY$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "PlannedArrivalAptHistory" element
         */
        public void removePlannedArrivalAptHistory(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLANNEDARRIVALAPTHISTORY$18, i);
            }
        }
        
        /**
         * Gets array of all "SpecialEmphasis" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis[] getSpecialEmphasisArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SPECIALEMPHASIS$20, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SpecialEmphasis" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis getSpecialEmphasisArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis)get_store().find_element_user(SPECIALEMPHASIS$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "SpecialEmphasis" element
         */
        public boolean isNilSpecialEmphasisArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis)get_store().find_element_user(SPECIALEMPHASIS$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "SpecialEmphasis" element
         */
        public int sizeOfSpecialEmphasisArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPECIALEMPHASIS$20);
            }
        }
        
        /**
         * Sets array of all "SpecialEmphasis" element
         */
        public void setSpecialEmphasisArray(org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis[] specialEmphasisArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(specialEmphasisArray, SPECIALEMPHASIS$20);
            }
        }
        
        /**
         * Sets ith "SpecialEmphasis" element
         */
        public void setSpecialEmphasisArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis specialEmphasis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis)get_store().find_element_user(SPECIALEMPHASIS$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(specialEmphasis);
            }
        }
        
        /**
         * Nils the ith "SpecialEmphasis" element
         */
        public void setNilSpecialEmphasisArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis)get_store().find_element_user(SPECIALEMPHASIS$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SpecialEmphasis" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis insertNewSpecialEmphasis(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis)get_store().insert_element_user(SPECIALEMPHASIS$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SpecialEmphasis" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis addNewSpecialEmphasis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis)get_store().add_element_user(SPECIALEMPHASIS$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "SpecialEmphasis" element
         */
        public void removeSpecialEmphasis(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPECIALEMPHASIS$20, i);
            }
        }
        
        /**
         * Gets array of all "IrregularityDelay" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay[] getIrregularityDelayArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IRREGULARITYDELAY$22, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "IrregularityDelay" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay getIrregularityDelayArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay)get_store().find_element_user(IRREGULARITYDELAY$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "IrregularityDelay" element
         */
        public boolean isNilIrregularityDelayArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay)get_store().find_element_user(IRREGULARITYDELAY$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "IrregularityDelay" element
         */
        public int sizeOfIrregularityDelayArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IRREGULARITYDELAY$22);
            }
        }
        
        /**
         * Sets array of all "IrregularityDelay" element
         */
        public void setIrregularityDelayArray(org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay[] irregularityDelayArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(irregularityDelayArray, IRREGULARITYDELAY$22);
            }
        }
        
        /**
         * Sets ith "IrregularityDelay" element
         */
        public void setIrregularityDelayArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay irregularityDelay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay)get_store().find_element_user(IRREGULARITYDELAY$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(irregularityDelay);
            }
        }
        
        /**
         * Nils the ith "IrregularityDelay" element
         */
        public void setNilIrregularityDelayArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay)get_store().find_element_user(IRREGULARITYDELAY$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IrregularityDelay" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay insertNewIrregularityDelay(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay)get_store().insert_element_user(IRREGULARITYDELAY$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IrregularityDelay" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay addNewIrregularityDelay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay)get_store().add_element_user(IRREGULARITYDELAY$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "IrregularityDelay" element
         */
        public void removeIrregularityDelay(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IRREGULARITYDELAY$22, i);
            }
        }
        
        /**
         * Gets array of all "CabinClass" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass[] getCabinClassArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CABINCLASS$24, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CabinClass" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass getCabinClassArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass)get_store().find_element_user(CABINCLASS$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CabinClass" element
         */
        public int sizeOfCabinClassArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CABINCLASS$24);
            }
        }
        
        /**
         * Sets array of all "CabinClass" element
         */
        public void setCabinClassArray(org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass[] cabinClassArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(cabinClassArray, CABINCLASS$24);
            }
        }
        
        /**
         * Sets ith "CabinClass" element
         */
        public void setCabinClassArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass cabinClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass)get_store().find_element_user(CABINCLASS$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(cabinClass);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CabinClass" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass insertNewCabinClass(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass)get_store().insert_element_user(CABINCLASS$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CabinClass" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass addNewCabinClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass)get_store().add_element_user(CABINCLASS$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "CabinClass" element
         */
        public void removeCabinClass(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CABINCLASS$24, i);
            }
        }
        
        /**
         * Gets array of all "SpecialCargo" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo[] getSpecialCargoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SPECIALCARGO$26, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SpecialCargo" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo getSpecialCargoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo)get_store().find_element_user(SPECIALCARGO$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "SpecialCargo" element
         */
        public boolean isNilSpecialCargoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo)get_store().find_element_user(SPECIALCARGO$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "SpecialCargo" element
         */
        public int sizeOfSpecialCargoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPECIALCARGO$26);
            }
        }
        
        /**
         * Sets array of all "SpecialCargo" element
         */
        public void setSpecialCargoArray(org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo[] specialCargoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(specialCargoArray, SPECIALCARGO$26);
            }
        }
        
        /**
         * Sets ith "SpecialCargo" element
         */
        public void setSpecialCargoArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo specialCargo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo)get_store().find_element_user(SPECIALCARGO$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(specialCargo);
            }
        }
        
        /**
         * Nils the ith "SpecialCargo" element
         */
        public void setNilSpecialCargoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo)get_store().find_element_user(SPECIALCARGO$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SpecialCargo" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo insertNewSpecialCargo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo)get_store().insert_element_user(SPECIALCARGO$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SpecialCargo" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo addNewSpecialCargo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo)get_store().add_element_user(SPECIALCARGO$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "SpecialCargo" element
         */
        public void removeSpecialCargo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPECIALCARGO$26, i);
            }
        }
        
        /**
         * Gets array of all "CodeShareInfo" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo[] getCodeShareInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CODESHAREINFO$28, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CodeShareInfo" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo getCodeShareInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo)get_store().find_element_user(CODESHAREINFO$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "CodeShareInfo" element
         */
        public boolean isNilCodeShareInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo)get_store().find_element_user(CODESHAREINFO$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "CodeShareInfo" element
         */
        public int sizeOfCodeShareInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CODESHAREINFO$28);
            }
        }
        
        /**
         * Sets array of all "CodeShareInfo" element
         */
        public void setCodeShareInfoArray(org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo[] codeShareInfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(codeShareInfoArray, CODESHAREINFO$28);
            }
        }
        
        /**
         * Sets ith "CodeShareInfo" element
         */
        public void setCodeShareInfoArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo codeShareInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo)get_store().find_element_user(CODESHAREINFO$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(codeShareInfo);
            }
        }
        
        /**
         * Nils the ith "CodeShareInfo" element
         */
        public void setNilCodeShareInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo)get_store().find_element_user(CODESHAREINFO$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CodeShareInfo" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo insertNewCodeShareInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo)get_store().insert_element_user(CODESHAREINFO$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CodeShareInfo" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo addNewCodeShareInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo)get_store().add_element_user(CODESHAREINFO$28);
                return target;
            }
        }
        
        /**
         * Removes the ith "CodeShareInfo" element
         */
        public void removeCodeShareInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CODESHAREINFO$28, i);
            }
        }
        
        /**
         * Gets array of all "AssociatedFlightLegAircraft" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft[] getAssociatedFlightLegAircraftArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ASSOCIATEDFLIGHTLEGAIRCRAFT$30, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AssociatedFlightLegAircraft" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft getAssociatedFlightLegAircraftArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft)get_store().find_element_user(ASSOCIATEDFLIGHTLEGAIRCRAFT$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "AssociatedFlightLegAircraft" element
         */
        public boolean isNilAssociatedFlightLegAircraftArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft)get_store().find_element_user(ASSOCIATEDFLIGHTLEGAIRCRAFT$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "AssociatedFlightLegAircraft" element
         */
        public int sizeOfAssociatedFlightLegAircraftArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ASSOCIATEDFLIGHTLEGAIRCRAFT$30);
            }
        }
        
        /**
         * Sets array of all "AssociatedFlightLegAircraft" element
         */
        public void setAssociatedFlightLegAircraftArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft[] associatedFlightLegAircraftArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(associatedFlightLegAircraftArray, ASSOCIATEDFLIGHTLEGAIRCRAFT$30);
            }
        }
        
        /**
         * Sets ith "AssociatedFlightLegAircraft" element
         */
        public void setAssociatedFlightLegAircraftArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft associatedFlightLegAircraft)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft)get_store().find_element_user(ASSOCIATEDFLIGHTLEGAIRCRAFT$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(associatedFlightLegAircraft);
            }
        }
        
        /**
         * Nils the ith "AssociatedFlightLegAircraft" element
         */
        public void setNilAssociatedFlightLegAircraftArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft)get_store().find_element_user(ASSOCIATEDFLIGHTLEGAIRCRAFT$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AssociatedFlightLegAircraft" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft insertNewAssociatedFlightLegAircraft(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft)get_store().insert_element_user(ASSOCIATEDFLIGHTLEGAIRCRAFT$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AssociatedFlightLegAircraft" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft addNewAssociatedFlightLegAircraft()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft)get_store().add_element_user(ASSOCIATEDFLIGHTLEGAIRCRAFT$30);
                return target;
            }
        }
        
        /**
         * Removes the ith "AssociatedFlightLegAircraft" element
         */
        public void removeAssociatedFlightLegAircraft(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ASSOCIATEDFLIGHTLEGAIRCRAFT$30, i);
            }
        }
        
        /**
         * Gets array of all "AssociatedFlightLegSchedule" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule[] getAssociatedFlightLegScheduleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ASSOCIATEDFLIGHTLEGSCHEDULE$32, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AssociatedFlightLegSchedule" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule getAssociatedFlightLegScheduleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule)get_store().find_element_user(ASSOCIATEDFLIGHTLEGSCHEDULE$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "AssociatedFlightLegSchedule" element
         */
        public boolean isNilAssociatedFlightLegScheduleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule)get_store().find_element_user(ASSOCIATEDFLIGHTLEGSCHEDULE$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "AssociatedFlightLegSchedule" element
         */
        public int sizeOfAssociatedFlightLegScheduleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ASSOCIATEDFLIGHTLEGSCHEDULE$32);
            }
        }
        
        /**
         * Sets array of all "AssociatedFlightLegSchedule" element
         */
        public void setAssociatedFlightLegScheduleArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule[] associatedFlightLegScheduleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(associatedFlightLegScheduleArray, ASSOCIATEDFLIGHTLEGSCHEDULE$32);
            }
        }
        
        /**
         * Sets ith "AssociatedFlightLegSchedule" element
         */
        public void setAssociatedFlightLegScheduleArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule associatedFlightLegSchedule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule)get_store().find_element_user(ASSOCIATEDFLIGHTLEGSCHEDULE$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(associatedFlightLegSchedule);
            }
        }
        
        /**
         * Nils the ith "AssociatedFlightLegSchedule" element
         */
        public void setNilAssociatedFlightLegScheduleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule)get_store().find_element_user(ASSOCIATEDFLIGHTLEGSCHEDULE$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AssociatedFlightLegSchedule" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule insertNewAssociatedFlightLegSchedule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule)get_store().insert_element_user(ASSOCIATEDFLIGHTLEGSCHEDULE$32, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AssociatedFlightLegSchedule" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule addNewAssociatedFlightLegSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule)get_store().add_element_user(ASSOCIATEDFLIGHTLEGSCHEDULE$32);
                return target;
            }
        }
        
        /**
         * Removes the ith "AssociatedFlightLegSchedule" element
         */
        public void removeAssociatedFlightLegSchedule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ASSOCIATEDFLIGHTLEGSCHEDULE$32, i);
            }
        }
        
        /**
         * Gets array of all "RemarkTextCode" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode[] getRemarkTextCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REMARKTEXTCODE$34, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RemarkTextCode" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode getRemarkTextCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode)get_store().find_element_user(REMARKTEXTCODE$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "RemarkTextCode" element
         */
        public boolean isNilRemarkTextCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode)get_store().find_element_user(REMARKTEXTCODE$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "RemarkTextCode" element
         */
        public int sizeOfRemarkTextCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMARKTEXTCODE$34);
            }
        }
        
        /**
         * Sets array of all "RemarkTextCode" element
         */
        public void setRemarkTextCodeArray(org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode[] remarkTextCodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(remarkTextCodeArray, REMARKTEXTCODE$34);
            }
        }
        
        /**
         * Sets ith "RemarkTextCode" element
         */
        public void setRemarkTextCodeArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode remarkTextCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode)get_store().find_element_user(REMARKTEXTCODE$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(remarkTextCode);
            }
        }
        
        /**
         * Nils the ith "RemarkTextCode" element
         */
        public void setNilRemarkTextCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode)get_store().find_element_user(REMARKTEXTCODE$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RemarkTextCode" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode insertNewRemarkTextCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode)get_store().insert_element_user(REMARKTEXTCODE$34, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RemarkTextCode" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode addNewRemarkTextCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode)get_store().add_element_user(REMARKTEXTCODE$34);
                return target;
            }
        }
        
        /**
         * Removes the ith "RemarkTextCode" element
         */
        public void removeRemarkTextCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMARKTEXTCODE$34, i);
            }
        }
        
        /**
         * Gets the "RemarkFreeText" element
         */
        public java.lang.String getRemarkFreeText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMARKFREETEXT$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RemarkFreeText" element
         */
        public org.apache.xmlbeans.XmlString xgetRemarkFreeText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMARKFREETEXT$36, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "RemarkFreeText" element
         */
        public boolean isNilRemarkFreeText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMARKFREETEXT$36, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "RemarkFreeText" element
         */
        public boolean isSetRemarkFreeText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMARKFREETEXT$36) != 0;
            }
        }
        
        /**
         * Sets the "RemarkFreeText" element
         */
        public void setRemarkFreeText(java.lang.String remarkFreeText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMARKFREETEXT$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REMARKFREETEXT$36);
                }
                target.setStringValue(remarkFreeText);
            }
        }
        
        /**
         * Sets (as xml) the "RemarkFreeText" element
         */
        public void xsetRemarkFreeText(org.apache.xmlbeans.XmlString remarkFreeText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMARKFREETEXT$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REMARKFREETEXT$36);
                }
                target.set(remarkFreeText);
            }
        }
        
        /**
         * Nils the "RemarkFreeText" element
         */
        public void setNilRemarkFreeText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMARKFREETEXT$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REMARKFREETEXT$36);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "RemarkFreeText" element
         */
        public void unsetRemarkFreeText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMARKFREETEXT$36, 0);
            }
        }
        
        /**
         * Gets array of all "AirportResources" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources[] getAirportResourcesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AIRPORTRESOURCES$38, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AirportResources" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources getAirportResourcesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources)get_store().find_element_user(AIRPORTRESOURCES$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AirportResources" element
         */
        public int sizeOfAirportResourcesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AIRPORTRESOURCES$38);
            }
        }
        
        /**
         * Sets array of all "AirportResources" element
         */
        public void setAirportResourcesArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources[] airportResourcesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(airportResourcesArray, AIRPORTRESOURCES$38);
            }
        }
        
        /**
         * Sets ith "AirportResources" element
         */
        public void setAirportResourcesArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources airportResources)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources)get_store().find_element_user(AIRPORTRESOURCES$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(airportResources);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AirportResources" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources insertNewAirportResources(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources)get_store().insert_element_user(AIRPORTRESOURCES$38, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AirportResources" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources addNewAirportResources()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources)get_store().add_element_user(AIRPORTRESOURCES$38);
                return target;
            }
        }
        
        /**
         * Removes the ith "AirportResources" element
         */
        public void removeAirportResources(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AIRPORTRESOURCES$38, i);
            }
        }
        
        /**
         * Gets array of all "OperationTime" elements
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime[] getOperationTimeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OPERATIONTIME$40, targetList);
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OperationTime" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime getOperationTimeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime)get_store().find_element_user(OPERATIONTIME$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "OperationTime" element
         */
        public boolean isNilOperationTimeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime)get_store().find_element_user(OPERATIONTIME$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "OperationTime" element
         */
        public int sizeOfOperationTimeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPERATIONTIME$40);
            }
        }
        
        /**
         * Sets array of all "OperationTime" element
         */
        public void setOperationTimeArray(org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime[] operationTimeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(operationTimeArray, OPERATIONTIME$40);
            }
        }
        
        /**
         * Sets ith "OperationTime" element
         */
        public void setOperationTimeArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime operationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime)get_store().find_element_user(OPERATIONTIME$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(operationTime);
            }
        }
        
        /**
         * Nils the ith "OperationTime" element
         */
        public void setNilOperationTimeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime)get_store().find_element_user(OPERATIONTIME$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OperationTime" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime insertNewOperationTime(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime)get_store().insert_element_user(OPERATIONTIME$40, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OperationTime" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime addNewOperationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime)get_store().add_element_user(OPERATIONTIME$40);
                return target;
            }
        }
        
        /**
         * Removes the ith "OperationTime" element
         */
        public void removeOperationTime(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPERATIONTIME$40, i);
            }
        }
        
        /**
         * Gets the "AircraftInfo" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo getAircraftInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo)get_store().find_element_user(AIRCRAFTINFO$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AircraftInfo" element
         */
        public boolean isSetAircraftInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AIRCRAFTINFO$42) != 0;
            }
        }
        
        /**
         * Sets the "AircraftInfo" element
         */
        public void setAircraftInfo(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo aircraftInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo)get_store().find_element_user(AIRCRAFTINFO$42, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo)get_store().add_element_user(AIRCRAFTINFO$42);
                }
                target.set(aircraftInfo);
            }
        }
        
        /**
         * Appends and returns a new empty "AircraftInfo" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo addNewAircraftInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo)get_store().add_element_user(AIRCRAFTINFO$42);
                return target;
            }
        }
        
        /**
         * Unsets the "AircraftInfo" element
         */
        public void unsetAircraftInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AIRCRAFTINFO$42, 0);
            }
        }
        
        /**
         * Gets the "ClearanceAgreement" element
         */
        public java.lang.String getClearanceAgreement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLEARANCEAGREEMENT$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ClearanceAgreement" element
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetClearanceAgreement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_element_user(CLEARANCEAGREEMENT$44, 0);
                return target;
            }
        }
        
        /**
         * True if has "ClearanceAgreement" element
         */
        public boolean isSetClearanceAgreement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLEARANCEAGREEMENT$44) != 0;
            }
        }
        
        /**
         * Sets the "ClearanceAgreement" element
         */
        public void setClearanceAgreement(java.lang.String clearanceAgreement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLEARANCEAGREEMENT$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLEARANCEAGREEMENT$44);
                }
                target.setStringValue(clearanceAgreement);
            }
        }
        
        /**
         * Sets (as xml) the "ClearanceAgreement" element
         */
        public void xsetClearanceAgreement(org.iata.iata.x2007.x00.IATACodeType clearanceAgreement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_element_user(CLEARANCEAGREEMENT$44, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_element_user(CLEARANCEAGREEMENT$44);
                }
                target.set(clearanceAgreement);
            }
        }
        
        /**
         * Unsets the "ClearanceAgreement" element
         */
        public void unsetClearanceAgreement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLEARANCEAGREEMENT$44, 0);
            }
        }
        
        /**
         * Gets the "PublicFlightDisplay" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay getPublicFlightDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay)get_store().find_element_user(PUBLICFLIGHTDISPLAY$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PublicFlightDisplay" element
         */
        public boolean isSetPublicFlightDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUBLICFLIGHTDISPLAY$46) != 0;
            }
        }
        
        /**
         * Sets the "PublicFlightDisplay" element
         */
        public void setPublicFlightDisplay(org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay publicFlightDisplay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay)get_store().find_element_user(PUBLICFLIGHTDISPLAY$46, 0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay)get_store().add_element_user(PUBLICFLIGHTDISPLAY$46);
                }
                target.set(publicFlightDisplay);
            }
        }
        
        /**
         * Appends and returns a new empty "PublicFlightDisplay" element
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay addNewPublicFlightDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay)get_store().add_element_user(PUBLICFLIGHTDISPLAY$46);
                return target;
            }
        }
        
        /**
         * Unsets the "PublicFlightDisplay" element
         */
        public void unsetPublicFlightDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUBLICFLIGHTDISPLAY$46, 0);
            }
        }
        
        /**
         * Gets the "FlightClassification" attribute
         */
        public java.lang.String getFlightClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIGHTCLASSIFICATION$48);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FlightClassification" attribute
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification xgetFlightClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification)get_store().find_attribute_user(FLIGHTCLASSIFICATION$48);
                return target;
            }
        }
        
        /**
         * True if has "FlightClassification" attribute
         */
        public boolean isSetFlightClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FLIGHTCLASSIFICATION$48) != null;
            }
        }
        
        /**
         * Sets the "FlightClassification" attribute
         */
        public void setFlightClassification(java.lang.String flightClassification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIGHTCLASSIFICATION$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLIGHTCLASSIFICATION$48);
                }
                target.setStringValue(flightClassification);
            }
        }
        
        /**
         * Sets (as xml) the "FlightClassification" attribute
         */
        public void xsetFlightClassification(org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification flightClassification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification)get_store().find_attribute_user(FLIGHTCLASSIFICATION$48);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification)get_store().add_attribute_user(FLIGHTCLASSIFICATION$48);
                }
                target.set(flightClassification);
            }
        }
        
        /**
         * Unsets the "FlightClassification" attribute
         */
        public void unsetFlightClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FLIGHTCLASSIFICATION$48);
            }
        }
        
        /**
         * Gets the "InternationalStatus" attribute
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus.Enum getInternationalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNATIONALSTATUS$50);
                if (target == null)
                {
                    return null;
                }
                return (org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "InternationalStatus" attribute
         */
        public org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus xgetInternationalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus)get_store().find_attribute_user(INTERNATIONALSTATUS$50);
                return target;
            }
        }
        
        /**
         * True if has "InternationalStatus" attribute
         */
        public boolean isSetInternationalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INTERNATIONALSTATUS$50) != null;
            }
        }
        
        /**
         * Sets the "InternationalStatus" attribute
         */
        public void setInternationalStatus(org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus.Enum internationalStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNATIONALSTATUS$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERNATIONALSTATUS$50);
                }
                target.setEnumValue(internationalStatus);
            }
        }
        
        /**
         * Sets (as xml) the "InternationalStatus" attribute
         */
        public void xsetInternationalStatus(org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus internationalStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus target = null;
                target = (org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus)get_store().find_attribute_user(INTERNATIONALSTATUS$50);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus)get_store().add_attribute_user(INTERNATIONALSTATUS$50);
                }
                target.set(internationalStatus);
            }
        }
        
        /**
         * Unsets the "InternationalStatus" attribute
         */
        public void unsetInternationalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INTERNATIONALSTATUS$50);
            }
        }
        /**
         * An XML OperationalStatus(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$OperationalStatus.
         */
        public static class OperationalStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus
        {
            
            public OperationalStatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected OperationalStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName REPEATINDEX$0 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            private static final javax.xml.namespace.QName CODECONTEXT$2 = 
                new javax.xml.namespace.QName("", "CodeContext");
            
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$0) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$0);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$0);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$2);
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
            public org.apache.xmlbeans.XmlString xgetCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECONTEXT$2);
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
                    return get_store().find_attribute_user(CODECONTEXT$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$2);
                    }
                    target.setStringValue(codeContext);
                }
            }
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            public void xsetCodeContext(org.apache.xmlbeans.XmlString codeContext)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECONTEXT$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODECONTEXT$2);
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
                    get_store().remove_attribute(CODECONTEXT$2);
                }
            }
        }
        /**
         * An XML PublicStatus(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$PublicStatus.
         */
        public static class PublicStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus
        {
            
            public PublicStatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected PublicStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
            public org.apache.xmlbeans.XmlString xgetCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECONTEXT$0);
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
            public void xsetCodeContext(org.apache.xmlbeans.XmlString codeContext)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECONTEXT$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODECONTEXT$0);
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
         * An XML OwnerAirline(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public static class OwnerAirlineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline
        {
            
            public OwnerAirlineImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AIRLINE$0 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Airline");
            private static final javax.xml.namespace.QName FLIGHTNUMBER$2 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "FlightNumber");
            private static final javax.xml.namespace.QName OPERATIONALSUFFIX$4 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "OperationalSuffix");
            
            
            /**
             * Gets the "Airline" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline getAirline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline)get_store().find_element_user(AIRLINE$0, 0);
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
            public void setAirline(org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline airline)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline)get_store().find_element_user(AIRLINE$0, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline)get_store().add_element_user(AIRLINE$0);
                    }
                    target.set(airline);
                }
            }
            
            /**
             * Appends and returns a new empty "Airline" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline addNewAirline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline)get_store().add_element_user(AIRLINE$0);
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
             * True if has "FlightNumber" element
             */
            public boolean isSetFlightNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FLIGHTNUMBER$2) != 0;
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
             * Unsets the "FlightNumber" element
             */
            public void unsetFlightNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FLIGHTNUMBER$2, 0);
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
             * Tests for nil "OperationalSuffix" element
             */
            public boolean isNilOperationalSuffix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.OperationalSuffixType target = null;
                    target = (org.iata.iata.x2007.x00.OperationalSuffixType)get_store().find_element_user(OPERATIONALSUFFIX$4, 0);
                    if (target == null) return false;
                    return target.isNil();
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
             * Nils the "OperationalSuffix" element
             */
            public void setNilOperationalSuffix()
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
                    target.setNil();
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
             * An XML Airline(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$OwnerAirline$Airline.
             */
            public static class AirlineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline
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
        }
        /**
         * An XML PlannedArrivalAptHistory(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$PlannedArrivalAptHistory.
         */
        public static class PlannedArrivalAptHistoryImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory
        {
            
            public PlannedArrivalAptHistoryImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected PlannedArrivalAptHistoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName CODECONTEXT$0 = 
                new javax.xml.namespace.QName("", "CodeContext");
            private static final javax.xml.namespace.QName REPEATINDEX$2 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            
            
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
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$2);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$2);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$2) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$2);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$2);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$2);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$2);
                }
            }
        }
        /**
         * An XML SpecialEmphasis(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$SpecialEmphasis.
         */
        public static class SpecialEmphasisImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis
        {
            
            public SpecialEmphasisImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected SpecialEmphasisImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName REPEATINDEX$0 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$0) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$0);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$0);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$0);
                }
            }
        }
        /**
         * An XML IrregularityDelay(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public static class IrregularityDelayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay
        {
            
            public IrregularityDelayImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REASONCODE$0 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "ReasonCode");
            private static final javax.xml.namespace.QName DURATION$2 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Duration");
            private static final javax.xml.namespace.QName DEPARTUREORARRIVAL$4 = 
                new javax.xml.namespace.QName("", "DepartureOrArrival");
            private static final javax.xml.namespace.QName REPEATINDEX$6 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            
            
            /**
             * Gets the "ReasonCode" element
             */
            public java.lang.String getReasonCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ReasonCode" element
             */
            public org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 xgetReasonCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 target = null;
                    target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To3)get_store().find_element_user(REASONCODE$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "ReasonCode" element
             */
            public void setReasonCode(java.lang.String reasonCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASONCODE$0);
                    }
                    target.setStringValue(reasonCode);
                }
            }
            
            /**
             * Sets (as xml) the "ReasonCode" element
             */
            public void xsetReasonCode(org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 reasonCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 target = null;
                    target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To3)get_store().find_element_user(REASONCODE$0, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.AlphaNumericStringLength1To3)get_store().add_element_user(REASONCODE$0);
                    }
                    target.set(reasonCode);
                }
            }
            
            /**
             * Gets the "Duration" element
             */
            public org.apache.xmlbeans.GDuration getDuration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getGDurationValue();
                }
            }
            
            /**
             * Gets (as xml) the "Duration" element
             */
            public org.apache.xmlbeans.XmlDuration xgetDuration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDuration target = null;
                    target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Duration" element
             */
            public boolean isSetDuration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DURATION$2) != 0;
                }
            }
            
            /**
             * Sets the "Duration" element
             */
            public void setDuration(org.apache.xmlbeans.GDuration duration)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$2);
                    }
                    target.setGDurationValue(duration);
                }
            }
            
            /**
             * Sets (as xml) the "Duration" element
             */
            public void xsetDuration(org.apache.xmlbeans.XmlDuration duration)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDuration target = null;
                    target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(DURATION$2);
                    }
                    target.set(duration);
                }
            }
            
            /**
             * Unsets the "Duration" element
             */
            public void unsetDuration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DURATION$2, 0);
                }
            }
            
            /**
             * Gets the "DepartureOrArrival" attribute
             */
            public org.iata.iata.x2007.x00.DepartureArrivalType.Enum getDepartureOrArrival()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPARTUREORARRIVAL$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.iata.iata.x2007.x00.DepartureArrivalType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "DepartureOrArrival" attribute
             */
            public org.iata.iata.x2007.x00.DepartureArrivalType xgetDepartureOrArrival()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.DepartureArrivalType target = null;
                    target = (org.iata.iata.x2007.x00.DepartureArrivalType)get_store().find_attribute_user(DEPARTUREORARRIVAL$4);
                    return target;
                }
            }
            
            /**
             * Sets the "DepartureOrArrival" attribute
             */
            public void setDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType.Enum departureOrArrival)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPARTUREORARRIVAL$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPARTUREORARRIVAL$4);
                    }
                    target.setEnumValue(departureOrArrival);
                }
            }
            
            /**
             * Sets (as xml) the "DepartureOrArrival" attribute
             */
            public void xsetDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType departureOrArrival)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.DepartureArrivalType target = null;
                    target = (org.iata.iata.x2007.x00.DepartureArrivalType)get_store().find_attribute_user(DEPARTUREORARRIVAL$4);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.DepartureArrivalType)get_store().add_attribute_user(DEPARTUREORARRIVAL$4);
                    }
                    target.set(departureOrArrival);
                }
            }
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$6);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$6);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$6) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$6);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$6);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$6);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$6);
                }
            }
        }
        /**
         * An XML CabinClass(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public static class CabinClassImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass
        {
            
            public CabinClassImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INFLIGHTSERVICE$0 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "InflightService");
            private static final javax.xml.namespace.QName INFLIGHTMEALSERVICE$2 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "InflightMealService");
            private static final javax.xml.namespace.QName PAXCOUNT$4 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PaxCount");
            private static final javax.xml.namespace.QName SEATCAPACITY$6 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "SeatCapacity");
            private static final javax.xml.namespace.QName CLASS1$8 = 
                new javax.xml.namespace.QName("", "Class");
            private static final javax.xml.namespace.QName REPEATINDEX$10 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            
            
            /**
             * Gets array of all "InflightService" elements
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService[] getInflightServiceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INFLIGHTSERVICE$0, targetList);
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "InflightService" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService getInflightServiceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService)get_store().find_element_user(INFLIGHTSERVICE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Tests for nil ith "InflightService" element
             */
            public boolean isNilInflightServiceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService)get_store().find_element_user(INFLIGHTSERVICE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.isNil();
                }
            }
            
            /**
             * Returns number of "InflightService" element
             */
            public int sizeOfInflightServiceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INFLIGHTSERVICE$0);
                }
            }
            
            /**
             * Sets array of all "InflightService" element
             */
            public void setInflightServiceArray(org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService[] inflightServiceArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(inflightServiceArray, INFLIGHTSERVICE$0);
                }
            }
            
            /**
             * Sets ith "InflightService" element
             */
            public void setInflightServiceArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService inflightService)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService)get_store().find_element_user(INFLIGHTSERVICE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(inflightService);
                }
            }
            
            /**
             * Nils the ith "InflightService" element
             */
            public void setNilInflightServiceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService)get_store().find_element_user(INFLIGHTSERVICE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setNil();
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "InflightService" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService insertNewInflightService(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService)get_store().insert_element_user(INFLIGHTSERVICE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "InflightService" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService addNewInflightService()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService)get_store().add_element_user(INFLIGHTSERVICE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "InflightService" element
             */
            public void removeInflightService(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INFLIGHTSERVICE$0, i);
                }
            }
            
            /**
             * Gets array of all "InflightMealService" elements
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService[] getInflightMealServiceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INFLIGHTMEALSERVICE$2, targetList);
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "InflightMealService" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService getInflightMealServiceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService)get_store().find_element_user(INFLIGHTMEALSERVICE$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Tests for nil ith "InflightMealService" element
             */
            public boolean isNilInflightMealServiceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService)get_store().find_element_user(INFLIGHTMEALSERVICE$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.isNil();
                }
            }
            
            /**
             * Returns number of "InflightMealService" element
             */
            public int sizeOfInflightMealServiceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INFLIGHTMEALSERVICE$2);
                }
            }
            
            /**
             * Sets array of all "InflightMealService" element
             */
            public void setInflightMealServiceArray(org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService[] inflightMealServiceArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(inflightMealServiceArray, INFLIGHTMEALSERVICE$2);
                }
            }
            
            /**
             * Sets ith "InflightMealService" element
             */
            public void setInflightMealServiceArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService inflightMealService)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService)get_store().find_element_user(INFLIGHTMEALSERVICE$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(inflightMealService);
                }
            }
            
            /**
             * Nils the ith "InflightMealService" element
             */
            public void setNilInflightMealServiceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService)get_store().find_element_user(INFLIGHTMEALSERVICE$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setNil();
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "InflightMealService" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService insertNewInflightMealService(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService)get_store().insert_element_user(INFLIGHTMEALSERVICE$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "InflightMealService" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService addNewInflightMealService()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService)get_store().add_element_user(INFLIGHTMEALSERVICE$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "InflightMealService" element
             */
            public void removeInflightMealService(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INFLIGHTMEALSERVICE$2, i);
                }
            }
            
            /**
             * Gets array of all "PaxCount" elements
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount[] getPaxCountArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PAXCOUNT$4, targetList);
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "PaxCount" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount getPaxCountArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount)get_store().find_element_user(PAXCOUNT$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Tests for nil ith "PaxCount" element
             */
            public boolean isNilPaxCountArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount)get_store().find_element_user(PAXCOUNT$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.isNil();
                }
            }
            
            /**
             * Returns number of "PaxCount" element
             */
            public int sizeOfPaxCountArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PAXCOUNT$4);
                }
            }
            
            /**
             * Sets array of all "PaxCount" element
             */
            public void setPaxCountArray(org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount[] paxCountArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(paxCountArray, PAXCOUNT$4);
                }
            }
            
            /**
             * Sets ith "PaxCount" element
             */
            public void setPaxCountArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount paxCount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount)get_store().find_element_user(PAXCOUNT$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(paxCount);
                }
            }
            
            /**
             * Nils the ith "PaxCount" element
             */
            public void setNilPaxCountArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount)get_store().find_element_user(PAXCOUNT$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setNil();
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "PaxCount" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount insertNewPaxCount(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount)get_store().insert_element_user(PAXCOUNT$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "PaxCount" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount addNewPaxCount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount)get_store().add_element_user(PAXCOUNT$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "PaxCount" element
             */
            public void removePaxCount(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PAXCOUNT$4, i);
                }
            }
            
            /**
             * Gets the "SeatCapacity" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity getSeatCapacity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity)get_store().find_element_user(SEATCAPACITY$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Tests for nil "SeatCapacity" element
             */
            public boolean isNilSeatCapacity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity)get_store().find_element_user(SEATCAPACITY$6, 0);
                    if (target == null) return false;
                    return target.isNil();
                }
            }
            
            /**
             * True if has "SeatCapacity" element
             */
            public boolean isSetSeatCapacity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEATCAPACITY$6) != 0;
                }
            }
            
            /**
             * Sets the "SeatCapacity" element
             */
            public void setSeatCapacity(org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity seatCapacity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity)get_store().find_element_user(SEATCAPACITY$6, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity)get_store().add_element_user(SEATCAPACITY$6);
                    }
                    target.set(seatCapacity);
                }
            }
            
            /**
             * Appends and returns a new empty "SeatCapacity" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity addNewSeatCapacity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity)get_store().add_element_user(SEATCAPACITY$6);
                    return target;
                }
            }
            
            /**
             * Nils the "SeatCapacity" element
             */
            public void setNilSeatCapacity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity)get_store().find_element_user(SEATCAPACITY$6, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity)get_store().add_element_user(SEATCAPACITY$6);
                    }
                    target.setNil();
                }
            }
            
            /**
             * Unsets the "SeatCapacity" element
             */
            public void unsetSeatCapacity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEATCAPACITY$6, 0);
                }
            }
            
            /**
             * Gets the "Class" attribute
             */
            public java.lang.String getClass1()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Class" attribute
             */
            public org.iata.iata.x2007.x00.IATACodeType xgetClass1()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CLASS1$8);
                    return target;
                }
            }
            
            /**
             * True if has "Class" attribute
             */
            public boolean isSetClass1()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(CLASS1$8) != null;
                }
            }
            
            /**
             * Sets the "Class" attribute
             */
            public void setClass1(java.lang.String class1)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$8);
                    }
                    target.setStringValue(class1);
                }
            }
            
            /**
             * Sets (as xml) the "Class" attribute
             */
            public void xsetClass1(org.iata.iata.x2007.x00.IATACodeType class1)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CLASS1$8);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CLASS1$8);
                    }
                    target.set(class1);
                }
            }
            
            /**
             * Unsets the "Class" attribute
             */
            public void unsetClass1()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(CLASS1$8);
                }
            }
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$10);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$10);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$10) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$10);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$10);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$10);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$10);
                }
            }
            /**
             * An XML InflightService(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$CabinClass$InflightService.
             */
            public static class InflightServiceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService
            {
                
                public InflightServiceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected InflightServiceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName REPEATINDEX$0 = 
                    new javax.xml.namespace.QName("", "RepeatIndex");
                
                
                /**
                 * Gets the "RepeatIndex" attribute
                 */
                public int getRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RepeatIndex" attribute
                 */
                public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.Numeric1To99 target = null;
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "RepeatIndex" attribute
                 */
                public boolean isSetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REPEATINDEX$0) != null;
                    }
                }
                
                /**
                 * Sets the "RepeatIndex" attribute
                 */
                public void setRepeatIndex(int repeatIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$0);
                      }
                      target.setIntValue(repeatIndex);
                    }
                }
                
                /**
                 * Sets (as xml) the "RepeatIndex" attribute
                 */
                public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.Numeric1To99 target = null;
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$0);
                      }
                      target.set(repeatIndex);
                    }
                }
                
                /**
                 * Unsets the "RepeatIndex" attribute
                 */
                public void unsetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REPEATINDEX$0);
                    }
                }
            }
            /**
             * An XML InflightMealService(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$CabinClass$InflightMealService.
             */
            public static class InflightMealServiceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService
            {
                
                public InflightMealServiceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected InflightMealServiceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName REPEATINDEX$0 = 
                    new javax.xml.namespace.QName("", "RepeatIndex");
                
                
                /**
                 * Gets the "RepeatIndex" attribute
                 */
                public int getRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RepeatIndex" attribute
                 */
                public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.Numeric1To99 target = null;
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "RepeatIndex" attribute
                 */
                public boolean isSetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REPEATINDEX$0) != null;
                    }
                }
                
                /**
                 * Sets the "RepeatIndex" attribute
                 */
                public void setRepeatIndex(int repeatIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$0);
                      }
                      target.setIntValue(repeatIndex);
                    }
                }
                
                /**
                 * Sets (as xml) the "RepeatIndex" attribute
                 */
                public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.Numeric1To99 target = null;
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$0);
                      }
                      target.set(repeatIndex);
                    }
                }
                
                /**
                 * Unsets the "RepeatIndex" attribute
                 */
                public void unsetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REPEATINDEX$0);
                    }
                }
            }
            /**
             * An XML PaxCount(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$CabinClass$PaxCount.
             */
            public static class PaxCountImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount
            {
                
                public PaxCountImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected PaxCountImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName QUALIFIER$0 = 
                    new javax.xml.namespace.QName("", "Qualifier");
                private static final javax.xml.namespace.QName USAGE$2 = 
                    new javax.xml.namespace.QName("", "Usage");
                private static final javax.xml.namespace.QName REPEATINDEX$4 = 
                    new javax.xml.namespace.QName("", "RepeatIndex");
                private static final javax.xml.namespace.QName DESTINATIONTYPE$6 = 
                    new javax.xml.namespace.QName("", "DestinationType");
                
                
                /**
                 * Gets the "Qualifier" attribute
                 */
                public java.lang.String getQualifier()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Qualifier" attribute
                 */
                public org.iata.iata.x2007.x00.IATACodeType xgetQualifier()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.IATACodeType target = null;
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Qualifier" attribute
                 */
                public void setQualifier(java.lang.String qualifier)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUALIFIER$0);
                      }
                      target.setStringValue(qualifier);
                    }
                }
                
                /**
                 * Sets (as xml) the "Qualifier" attribute
                 */
                public void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.IATACodeType target = null;
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(QUALIFIER$0);
                      }
                      target.set(qualifier);
                    }
                }
                
                /**
                 * Gets the "Usage" attribute
                 */
                public org.iata.iata.x2007.x00.UsageType.Enum getUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return (org.iata.iata.x2007.x00.UsageType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Usage" attribute
                 */
                public org.iata.iata.x2007.x00.UsageType xgetUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.UsageType target = null;
                      target = (org.iata.iata.x2007.x00.UsageType)get_store().find_attribute_user(USAGE$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Usage" attribute
                 */
                public void setUsage(org.iata.iata.x2007.x00.UsageType.Enum usage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USAGE$2);
                      }
                      target.setEnumValue(usage);
                    }
                }
                
                /**
                 * Sets (as xml) the "Usage" attribute
                 */
                public void xsetUsage(org.iata.iata.x2007.x00.UsageType usage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.UsageType target = null;
                      target = (org.iata.iata.x2007.x00.UsageType)get_store().find_attribute_user(USAGE$2);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.UsageType)get_store().add_attribute_user(USAGE$2);
                      }
                      target.set(usage);
                    }
                }
                
                /**
                 * Gets the "RepeatIndex" attribute
                 */
                public int getRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RepeatIndex" attribute
                 */
                public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.Numeric1To99 target = null;
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "RepeatIndex" attribute
                 */
                public boolean isSetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REPEATINDEX$4) != null;
                    }
                }
                
                /**
                 * Sets the "RepeatIndex" attribute
                 */
                public void setRepeatIndex(int repeatIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$4);
                      }
                      target.setIntValue(repeatIndex);
                    }
                }
                
                /**
                 * Sets (as xml) the "RepeatIndex" attribute
                 */
                public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.Numeric1To99 target = null;
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$4);
                      }
                      target.set(repeatIndex);
                    }
                }
                
                /**
                 * Unsets the "RepeatIndex" attribute
                 */
                public void unsetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REPEATINDEX$4);
                    }
                }
                
                /**
                 * Gets the "DestinationType" attribute
                 */
                public org.iata.iata.x2007.x00.DestinationType.Enum getDestinationType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATIONTYPE$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return (org.iata.iata.x2007.x00.DestinationType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DestinationType" attribute
                 */
                public org.iata.iata.x2007.x00.DestinationType xgetDestinationType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.DestinationType target = null;
                      target = (org.iata.iata.x2007.x00.DestinationType)get_store().find_attribute_user(DESTINATIONTYPE$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "DestinationType" attribute
                 */
                public boolean isSetDestinationType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESTINATIONTYPE$6) != null;
                    }
                }
                
                /**
                 * Sets the "DestinationType" attribute
                 */
                public void setDestinationType(org.iata.iata.x2007.x00.DestinationType.Enum destinationType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATIONTYPE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESTINATIONTYPE$6);
                      }
                      target.setEnumValue(destinationType);
                    }
                }
                
                /**
                 * Sets (as xml) the "DestinationType" attribute
                 */
                public void xsetDestinationType(org.iata.iata.x2007.x00.DestinationType destinationType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.DestinationType target = null;
                      target = (org.iata.iata.x2007.x00.DestinationType)get_store().find_attribute_user(DESTINATIONTYPE$6);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.DestinationType)get_store().add_attribute_user(DESTINATIONTYPE$6);
                      }
                      target.set(destinationType);
                    }
                }
                
                /**
                 * Unsets the "DestinationType" attribute
                 */
                public void unsetDestinationType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESTINATIONTYPE$6);
                    }
                }
            }
            /**
             * An XML SeatCapacity(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$CabinClass$SeatCapacity.
             */
            public static class SeatCapacityImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity
            {
                
                public SeatCapacityImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected SeatCapacityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                
            }
        }
        /**
         * An XML SpecialCargo(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$SpecialCargo.
         */
        public static class SpecialCargoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo
        {
            
            public SpecialCargoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected SpecialCargoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName REPEATINDEX$0 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$0) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$0);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$0);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$0);
                }
            }
        }
        /**
         * An XML CodeShareInfo(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public static class CodeShareInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo
        {
            
            public CodeShareInfoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AIRLINE$0 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Airline");
            private static final javax.xml.namespace.QName FLIGHTNUMBER$2 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "FlightNumber");
            private static final javax.xml.namespace.QName ORIGINATIONDATE$4 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "OriginationDate");
            private static final javax.xml.namespace.QName SHAREDALLIANCE$6 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "SharedAlliance");
            private static final javax.xml.namespace.QName REPEATINDEX$8 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            
            
            /**
             * Gets the "Airline" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline getAirline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline)get_store().find_element_user(AIRLINE$0, 0);
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
            public void setAirline(org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline airline)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline)get_store().find_element_user(AIRLINE$0, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline)get_store().add_element_user(AIRLINE$0);
                    }
                    target.set(airline);
                }
            }
            
            /**
             * Appends and returns a new empty "Airline" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline addNewAirline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline)get_store().add_element_user(AIRLINE$0);
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
             * True if has "FlightNumber" element
             */
            public boolean isSetFlightNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FLIGHTNUMBER$2) != 0;
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
             * Unsets the "FlightNumber" element
             */
            public void unsetFlightNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FLIGHTNUMBER$2, 0);
                }
            }
            
            /**
             * Gets the "OriginationDate" element
             */
            public java.util.Calendar getOriginationDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATIONDATE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "OriginationDate" element
             */
            public org.apache.xmlbeans.XmlDate xgetOriginationDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ORIGINATIONDATE$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "OriginationDate" element
             */
            public boolean isSetOriginationDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORIGINATIONDATE$4) != 0;
                }
            }
            
            /**
             * Sets the "OriginationDate" element
             */
            public void setOriginationDate(java.util.Calendar originationDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATIONDATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINATIONDATE$4);
                    }
                    target.setCalendarValue(originationDate);
                }
            }
            
            /**
             * Sets (as xml) the "OriginationDate" element
             */
            public void xsetOriginationDate(org.apache.xmlbeans.XmlDate originationDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ORIGINATIONDATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ORIGINATIONDATE$4);
                    }
                    target.set(originationDate);
                }
            }
            
            /**
             * Unsets the "OriginationDate" element
             */
            public void unsetOriginationDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORIGINATIONDATE$4, 0);
                }
            }
            
            /**
             * Gets the "SharedAlliance" element
             */
            public java.util.List getSharedAlliance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDALLIANCE$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getListValue();
                }
            }
            
            /**
             * Gets (as xml) the "SharedAlliance" element
             */
            public org.iata.iata.x2007.x00.ListOfIATACodeType xgetSharedAlliance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.ListOfIATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.ListOfIATACodeType)get_store().find_element_user(SHAREDALLIANCE$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SharedAlliance" element
             */
            public boolean isSetSharedAlliance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SHAREDALLIANCE$6) != 0;
                }
            }
            
            /**
             * Sets the "SharedAlliance" element
             */
            public void setSharedAlliance(java.util.List sharedAlliance)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDALLIANCE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREDALLIANCE$6);
                    }
                    target.setListValue(sharedAlliance);
                }
            }
            
            /**
             * Sets (as xml) the "SharedAlliance" element
             */
            public void xsetSharedAlliance(org.iata.iata.x2007.x00.ListOfIATACodeType sharedAlliance)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.ListOfIATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.ListOfIATACodeType)get_store().find_element_user(SHAREDALLIANCE$6, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.ListOfIATACodeType)get_store().add_element_user(SHAREDALLIANCE$6);
                    }
                    target.set(sharedAlliance);
                }
            }
            
            /**
             * Unsets the "SharedAlliance" element
             */
            public void unsetSharedAlliance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SHAREDALLIANCE$6, 0);
                }
            }
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$8);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$8);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$8) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$8);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$8);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$8);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$8);
                }
            }
            /**
             * An XML Airline(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$CodeShareInfo$Airline.
             */
            public static class AirlineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline
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
        }
        /**
         * An XML AssociatedFlightLegAircraft(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public static class AssociatedFlightLegAircraftImpl extends org.iata.iata.x2007.x00.impl.FlightLegIdentifierTypeImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft
        {
            
            public AssociatedFlightLegAircraftImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REPEATINDEX$0 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$0) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$0);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$0);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$0);
                }
            }
        }
        /**
         * An XML AssociatedFlightLegSchedule(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public static class AssociatedFlightLegScheduleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule
        {
            
            public AssociatedFlightLegScheduleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DEPARTUREAIRPORT$0 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "DepartureAirport");
            private static final javax.xml.namespace.QName ARRIVALAIRPORT$2 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "ArrivalAirport");
            private static final javax.xml.namespace.QName REPEATINDEX$4 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            
            
            /**
             * Gets the "DepartureAirport" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport getDepartureAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$0, 0);
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
            public void setDepartureAirport(org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport departureAirport)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$0, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$0);
                    }
                    target.set(departureAirport);
                }
            }
            
            /**
             * Appends and returns a new empty "DepartureAirport" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport addNewDepartureAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$0);
                    return target;
                }
            }
            
            /**
             * Gets the "ArrivalAirport" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport getArrivalAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$2, 0);
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
            public void setArrivalAirport(org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport arrivalAirport)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$2, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$2);
                    }
                    target.set(arrivalAirport);
                }
            }
            
            /**
             * Appends and returns a new empty "ArrivalAirport" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport addNewArrivalAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$2);
                    return target;
                }
            }
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$4) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$4);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$4);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$4);
                }
            }
            /**
             * An XML DepartureAirport(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AssociatedFlightLegSchedule$DepartureAirport.
             */
            public static class DepartureAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport
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
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AssociatedFlightLegSchedule$ArrivalAirport.
             */
            public static class ArrivalAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport
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
        }
        /**
         * An XML RemarkTextCode(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$RemarkTextCode.
         */
        public static class RemarkTextCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode
        {
            
            public RemarkTextCodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected RemarkTextCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName QUALIFIER$0 = 
                new javax.xml.namespace.QName("", "Qualifier");
            private static final javax.xml.namespace.QName CODECONTEXT$2 = 
                new javax.xml.namespace.QName("", "CodeContext");
            private static final javax.xml.namespace.QName REPEATINDEX$4 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            
            
            /**
             * Gets the "Qualifier" attribute
             */
            public java.lang.String getQualifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Qualifier" attribute
             */
            public org.iata.iata.x2007.x00.IATACodeType xgetQualifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$0);
                    return target;
                }
            }
            
            /**
             * Sets the "Qualifier" attribute
             */
            public void setQualifier(java.lang.String qualifier)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUALIFIER$0);
                    }
                    target.setStringValue(qualifier);
                }
            }
            
            /**
             * Sets (as xml) the "Qualifier" attribute
             */
            public void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(QUALIFIER$0);
                    }
                    target.set(qualifier);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$2);
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
            public org.apache.xmlbeans.XmlString xgetCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECONTEXT$2);
                    return target;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$2);
                    }
                    target.setStringValue(codeContext);
                }
            }
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            public void xsetCodeContext(org.apache.xmlbeans.XmlString codeContext)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECONTEXT$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODECONTEXT$2);
                    }
                    target.set(codeContext);
                }
            }
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$4) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$4);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$4);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$4);
                }
            }
        }
        /**
         * An XML AirportResources(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public static class AirportResourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources
        {
            
            public AirportResourcesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RESOURCE$0 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Resource");
            private static final javax.xml.namespace.QName USAGE$2 = 
                new javax.xml.namespace.QName("", "Usage");
            
            
            /**
             * Gets array of all "Resource" elements
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource[] getResourceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RESOURCE$0, targetList);
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Resource" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource getResourceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource)get_store().find_element_user(RESOURCE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Resource" element
             */
            public int sizeOfResourceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESOURCE$0);
                }
            }
            
            /**
             * Sets array of all "Resource" element
             */
            public void setResourceArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource[] resourceArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(resourceArray, RESOURCE$0);
                }
            }
            
            /**
             * Sets ith "Resource" element
             */
            public void setResourceArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource resource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource)get_store().find_element_user(RESOURCE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(resource);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Resource" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource insertNewResource(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource)get_store().insert_element_user(RESOURCE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Resource" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource addNewResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource)get_store().add_element_user(RESOURCE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Resource" element
             */
            public void removeResource(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESOURCE$0, i);
                }
            }
            
            /**
             * Gets the "Usage" attribute
             */
            public org.iata.iata.x2007.x00.UsageType.Enum getUsage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.iata.iata.x2007.x00.UsageType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Usage" attribute
             */
            public org.iata.iata.x2007.x00.UsageType xgetUsage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.UsageType target = null;
                    target = (org.iata.iata.x2007.x00.UsageType)get_store().find_attribute_user(USAGE$2);
                    return target;
                }
            }
            
            /**
             * Sets the "Usage" attribute
             */
            public void setUsage(org.iata.iata.x2007.x00.UsageType.Enum usage)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USAGE$2);
                    }
                    target.setEnumValue(usage);
                }
            }
            
            /**
             * Sets (as xml) the "Usage" attribute
             */
            public void xsetUsage(org.iata.iata.x2007.x00.UsageType usage)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.UsageType target = null;
                    target = (org.iata.iata.x2007.x00.UsageType)get_store().find_attribute_user(USAGE$2);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.UsageType)get_store().add_attribute_user(USAGE$2);
                    }
                    target.set(usage);
                }
            }
            /**
             * An XML Resource(@http://www.iata.org/IATA/2007/00).
             *
             * This is a complex type.
             */
            public static class ResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource
            {
                
                public ResourceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName AIRPORTZONE$0 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AirportZone");
                private static final javax.xml.namespace.QName AIRCRAFTPARKINGPOSITION$2 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AircraftParkingPosition");
                private static final javax.xml.namespace.QName PASSENGERGATE$4 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PassengerGate");
                private static final javax.xml.namespace.QName REMOTEOPERATIONALGATE$6 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "RemoteOperationalGate");
                private static final javax.xml.namespace.QName RUNWAY$8 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Runway");
                private static final javax.xml.namespace.QName AIRCRAFTTERMINAL$10 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AircraftTerminal");
                private static final javax.xml.namespace.QName PUBLICTERMINAL$12 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PublicTerminal");
                private static final javax.xml.namespace.QName CREWBUSIND$14 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CrewBusInd");
                private static final javax.xml.namespace.QName PAXBUSIND$16 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PaxBusInd");
                private static final javax.xml.namespace.QName BAGGAGECLAIMUNIT$18 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "BaggageClaimUnit");
                private static final javax.xml.namespace.QName BAGGAGEMAKEUPBELT$20 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "BaggageMakeupBelt");
                private static final javax.xml.namespace.QName CHECKININFO$22 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CheckInInfo");
                private static final javax.xml.namespace.QName PRECLEAREDGATEIND$24 = 
                    new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PreClearedGateInd");
                private static final javax.xml.namespace.QName DEPARTUREORARRIVAL$26 = 
                    new javax.xml.namespace.QName("", "DepartureOrArrival");
                private static final javax.xml.namespace.QName CHARGETYPE$28 = 
                    new javax.xml.namespace.QName("", "ChargeType");
                
                
                /**
                 * Gets the "AirportZone" element
                 */
                public java.lang.String getAirportZone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRPORTZONE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "AirportZone" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone xgetAirportZone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone)get_store().find_element_user(AIRPORTZONE$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Tests for nil "AirportZone" element
                 */
                public boolean isNilAirportZone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone)get_store().find_element_user(AIRPORTZONE$0, 0);
                      if (target == null) return false;
                      return target.isNil();
                    }
                }
                
                /**
                 * True if has "AirportZone" element
                 */
                public boolean isSetAirportZone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(AIRPORTZONE$0) != 0;
                    }
                }
                
                /**
                 * Sets the "AirportZone" element
                 */
                public void setAirportZone(java.lang.String airportZone)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRPORTZONE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRPORTZONE$0);
                      }
                      target.setStringValue(airportZone);
                    }
                }
                
                /**
                 * Sets (as xml) the "AirportZone" element
                 */
                public void xsetAirportZone(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone airportZone)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone)get_store().find_element_user(AIRPORTZONE$0, 0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone)get_store().add_element_user(AIRPORTZONE$0);
                      }
                      target.set(airportZone);
                    }
                }
                
                /**
                 * Nils the "AirportZone" element
                 */
                public void setNilAirportZone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone)get_store().find_element_user(AIRPORTZONE$0, 0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone)get_store().add_element_user(AIRPORTZONE$0);
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Unsets the "AirportZone" element
                 */
                public void unsetAirportZone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(AIRPORTZONE$0, 0);
                    }
                }
                
                /**
                 * Gets the "AircraftParkingPosition" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition getAircraftParkingPosition()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition)get_store().find_element_user(AIRCRAFTPARKINGPOSITION$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Tests for nil "AircraftParkingPosition" element
                 */
                public boolean isNilAircraftParkingPosition()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition)get_store().find_element_user(AIRCRAFTPARKINGPOSITION$2, 0);
                      if (target == null) return false;
                      return target.isNil();
                    }
                }
                
                /**
                 * True if has "AircraftParkingPosition" element
                 */
                public boolean isSetAircraftParkingPosition()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(AIRCRAFTPARKINGPOSITION$2) != 0;
                    }
                }
                
                /**
                 * Sets the "AircraftParkingPosition" element
                 */
                public void setAircraftParkingPosition(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition aircraftParkingPosition)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition)get_store().find_element_user(AIRCRAFTPARKINGPOSITION$2, 0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition)get_store().add_element_user(AIRCRAFTPARKINGPOSITION$2);
                      }
                      target.set(aircraftParkingPosition);
                    }
                }
                
                /**
                 * Appends and returns a new empty "AircraftParkingPosition" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition addNewAircraftParkingPosition()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition)get_store().add_element_user(AIRCRAFTPARKINGPOSITION$2);
                      return target;
                    }
                }
                
                /**
                 * Nils the "AircraftParkingPosition" element
                 */
                public void setNilAircraftParkingPosition()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition)get_store().find_element_user(AIRCRAFTPARKINGPOSITION$2, 0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition)get_store().add_element_user(AIRCRAFTPARKINGPOSITION$2);
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Unsets the "AircraftParkingPosition" element
                 */
                public void unsetAircraftParkingPosition()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(AIRCRAFTPARKINGPOSITION$2, 0);
                    }
                }
                
                /**
                 * Gets array of all "PassengerGate" elements
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate[] getPassengerGateArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(PASSENGERGATE$4, targetList);
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "PassengerGate" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate getPassengerGateArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate)get_store().find_element_user(PASSENGERGATE$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Tests for nil ith "PassengerGate" element
                 */
                public boolean isNilPassengerGateArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate)get_store().find_element_user(PASSENGERGATE$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.isNil();
                    }
                }
                
                /**
                 * Returns number of "PassengerGate" element
                 */
                public int sizeOfPassengerGateArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PASSENGERGATE$4);
                    }
                }
                
                /**
                 * Sets array of all "PassengerGate" element
                 */
                public void setPassengerGateArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate[] passengerGateArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(passengerGateArray, PASSENGERGATE$4);
                    }
                }
                
                /**
                 * Sets ith "PassengerGate" element
                 */
                public void setPassengerGateArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate passengerGate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate)get_store().find_element_user(PASSENGERGATE$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(passengerGate);
                    }
                }
                
                /**
                 * Nils the ith "PassengerGate" element
                 */
                public void setNilPassengerGateArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate)get_store().find_element_user(PASSENGERGATE$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "PassengerGate" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate insertNewPassengerGate(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate)get_store().insert_element_user(PASSENGERGATE$4, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "PassengerGate" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate addNewPassengerGate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate)get_store().add_element_user(PASSENGERGATE$4);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "PassengerGate" element
                 */
                public void removePassengerGate(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PASSENGERGATE$4, i);
                    }
                }
                
                /**
                 * Gets array of all "RemoteOperationalGate" elements
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate[] getRemoteOperationalGateArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(REMOTEOPERATIONALGATE$6, targetList);
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "RemoteOperationalGate" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate getRemoteOperationalGateArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate)get_store().find_element_user(REMOTEOPERATIONALGATE$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Tests for nil ith "RemoteOperationalGate" element
                 */
                public boolean isNilRemoteOperationalGateArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate)get_store().find_element_user(REMOTEOPERATIONALGATE$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.isNil();
                    }
                }
                
                /**
                 * Returns number of "RemoteOperationalGate" element
                 */
                public int sizeOfRemoteOperationalGateArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(REMOTEOPERATIONALGATE$6);
                    }
                }
                
                /**
                 * Sets array of all "RemoteOperationalGate" element
                 */
                public void setRemoteOperationalGateArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate[] remoteOperationalGateArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(remoteOperationalGateArray, REMOTEOPERATIONALGATE$6);
                    }
                }
                
                /**
                 * Sets ith "RemoteOperationalGate" element
                 */
                public void setRemoteOperationalGateArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate remoteOperationalGate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate)get_store().find_element_user(REMOTEOPERATIONALGATE$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(remoteOperationalGate);
                    }
                }
                
                /**
                 * Nils the ith "RemoteOperationalGate" element
                 */
                public void setNilRemoteOperationalGateArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate)get_store().find_element_user(REMOTEOPERATIONALGATE$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "RemoteOperationalGate" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate insertNewRemoteOperationalGate(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate)get_store().insert_element_user(REMOTEOPERATIONALGATE$6, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "RemoteOperationalGate" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate addNewRemoteOperationalGate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate)get_store().add_element_user(REMOTEOPERATIONALGATE$6);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "RemoteOperationalGate" element
                 */
                public void removeRemoteOperationalGate(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(REMOTEOPERATIONALGATE$6, i);
                    }
                }
                
                /**
                 * Gets the "Runway" element
                 */
                public java.lang.String getRunway()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNWAY$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Runway" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway xgetRunway()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway)get_store().find_element_user(RUNWAY$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Tests for nil "Runway" element
                 */
                public boolean isNilRunway()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway)get_store().find_element_user(RUNWAY$8, 0);
                      if (target == null) return false;
                      return target.isNil();
                    }
                }
                
                /**
                 * True if has "Runway" element
                 */
                public boolean isSetRunway()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RUNWAY$8) != 0;
                    }
                }
                
                /**
                 * Sets the "Runway" element
                 */
                public void setRunway(java.lang.String runway)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNWAY$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNWAY$8);
                      }
                      target.setStringValue(runway);
                    }
                }
                
                /**
                 * Sets (as xml) the "Runway" element
                 */
                public void xsetRunway(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway runway)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway)get_store().find_element_user(RUNWAY$8, 0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway)get_store().add_element_user(RUNWAY$8);
                      }
                      target.set(runway);
                    }
                }
                
                /**
                 * Nils the "Runway" element
                 */
                public void setNilRunway()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway)get_store().find_element_user(RUNWAY$8, 0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway)get_store().add_element_user(RUNWAY$8);
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Unsets the "Runway" element
                 */
                public void unsetRunway()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RUNWAY$8, 0);
                    }
                }
                
                /**
                 * Gets the "AircraftTerminal" element
                 */
                public java.lang.String getAircraftTerminal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTTERMINAL$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "AircraftTerminal" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal xgetAircraftTerminal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal)get_store().find_element_user(AIRCRAFTTERMINAL$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Tests for nil "AircraftTerminal" element
                 */
                public boolean isNilAircraftTerminal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal)get_store().find_element_user(AIRCRAFTTERMINAL$10, 0);
                      if (target == null) return false;
                      return target.isNil();
                    }
                }
                
                /**
                 * True if has "AircraftTerminal" element
                 */
                public boolean isSetAircraftTerminal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(AIRCRAFTTERMINAL$10) != 0;
                    }
                }
                
                /**
                 * Sets the "AircraftTerminal" element
                 */
                public void setAircraftTerminal(java.lang.String aircraftTerminal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTTERMINAL$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRCRAFTTERMINAL$10);
                      }
                      target.setStringValue(aircraftTerminal);
                    }
                }
                
                /**
                 * Sets (as xml) the "AircraftTerminal" element
                 */
                public void xsetAircraftTerminal(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal aircraftTerminal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal)get_store().find_element_user(AIRCRAFTTERMINAL$10, 0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal)get_store().add_element_user(AIRCRAFTTERMINAL$10);
                      }
                      target.set(aircraftTerminal);
                    }
                }
                
                /**
                 * Nils the "AircraftTerminal" element
                 */
                public void setNilAircraftTerminal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal)get_store().find_element_user(AIRCRAFTTERMINAL$10, 0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal)get_store().add_element_user(AIRCRAFTTERMINAL$10);
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Unsets the "AircraftTerminal" element
                 */
                public void unsetAircraftTerminal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(AIRCRAFTTERMINAL$10, 0);
                    }
                }
                
                /**
                 * Gets array of all "PublicTerminal" elements
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal[] getPublicTerminalArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(PUBLICTERMINAL$12, targetList);
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "PublicTerminal" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal getPublicTerminalArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal)get_store().find_element_user(PUBLICTERMINAL$12, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Tests for nil ith "PublicTerminal" element
                 */
                public boolean isNilPublicTerminalArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal)get_store().find_element_user(PUBLICTERMINAL$12, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.isNil();
                    }
                }
                
                /**
                 * Returns number of "PublicTerminal" element
                 */
                public int sizeOfPublicTerminalArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PUBLICTERMINAL$12);
                    }
                }
                
                /**
                 * Sets array of all "PublicTerminal" element
                 */
                public void setPublicTerminalArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal[] publicTerminalArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(publicTerminalArray, PUBLICTERMINAL$12);
                    }
                }
                
                /**
                 * Sets ith "PublicTerminal" element
                 */
                public void setPublicTerminalArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal publicTerminal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal)get_store().find_element_user(PUBLICTERMINAL$12, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(publicTerminal);
                    }
                }
                
                /**
                 * Nils the ith "PublicTerminal" element
                 */
                public void setNilPublicTerminalArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal)get_store().find_element_user(PUBLICTERMINAL$12, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "PublicTerminal" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal insertNewPublicTerminal(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal)get_store().insert_element_user(PUBLICTERMINAL$12, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "PublicTerminal" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal addNewPublicTerminal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal)get_store().add_element_user(PUBLICTERMINAL$12);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "PublicTerminal" element
                 */
                public void removePublicTerminal(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PUBLICTERMINAL$12, i);
                    }
                }
                
                /**
                 * Gets the "CrewBusInd" element
                 */
                public boolean getCrewBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREWBUSIND$14, 0);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CrewBusInd" element
                 */
                public org.apache.xmlbeans.XmlBoolean xgetCrewBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CREWBUSIND$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Tests for nil "CrewBusInd" element
                 */
                public boolean isNilCrewBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CREWBUSIND$14, 0);
                      if (target == null) return false;
                      return target.isNil();
                    }
                }
                
                /**
                 * True if has "CrewBusInd" element
                 */
                public boolean isSetCrewBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CREWBUSIND$14) != 0;
                    }
                }
                
                /**
                 * Sets the "CrewBusInd" element
                 */
                public void setCrewBusInd(boolean crewBusInd)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREWBUSIND$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREWBUSIND$14);
                      }
                      target.setBooleanValue(crewBusInd);
                    }
                }
                
                /**
                 * Sets (as xml) the "CrewBusInd" element
                 */
                public void xsetCrewBusInd(org.apache.xmlbeans.XmlBoolean crewBusInd)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CREWBUSIND$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CREWBUSIND$14);
                      }
                      target.set(crewBusInd);
                    }
                }
                
                /**
                 * Nils the "CrewBusInd" element
                 */
                public void setNilCrewBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CREWBUSIND$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CREWBUSIND$14);
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Unsets the "CrewBusInd" element
                 */
                public void unsetCrewBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CREWBUSIND$14, 0);
                    }
                }
                
                /**
                 * Gets the "PaxBusInd" element
                 */
                public boolean getPaxBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAXBUSIND$16, 0);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "PaxBusInd" element
                 */
                public org.apache.xmlbeans.XmlBoolean xgetPaxBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PAXBUSIND$16, 0);
                      return target;
                    }
                }
                
                /**
                 * Tests for nil "PaxBusInd" element
                 */
                public boolean isNilPaxBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PAXBUSIND$16, 0);
                      if (target == null) return false;
                      return target.isNil();
                    }
                }
                
                /**
                 * True if has "PaxBusInd" element
                 */
                public boolean isSetPaxBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PAXBUSIND$16) != 0;
                    }
                }
                
                /**
                 * Sets the "PaxBusInd" element
                 */
                public void setPaxBusInd(boolean paxBusInd)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAXBUSIND$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAXBUSIND$16);
                      }
                      target.setBooleanValue(paxBusInd);
                    }
                }
                
                /**
                 * Sets (as xml) the "PaxBusInd" element
                 */
                public void xsetPaxBusInd(org.apache.xmlbeans.XmlBoolean paxBusInd)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PAXBUSIND$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PAXBUSIND$16);
                      }
                      target.set(paxBusInd);
                    }
                }
                
                /**
                 * Nils the "PaxBusInd" element
                 */
                public void setNilPaxBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PAXBUSIND$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PAXBUSIND$16);
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Unsets the "PaxBusInd" element
                 */
                public void unsetPaxBusInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PAXBUSIND$16, 0);
                    }
                }
                
                /**
                 * Gets array of all "BaggageClaimUnit" elements
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit[] getBaggageClaimUnitArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(BAGGAGECLAIMUNIT$18, targetList);
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "BaggageClaimUnit" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit getBaggageClaimUnitArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit)get_store().find_element_user(BAGGAGECLAIMUNIT$18, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Tests for nil ith "BaggageClaimUnit" element
                 */
                public boolean isNilBaggageClaimUnitArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit)get_store().find_element_user(BAGGAGECLAIMUNIT$18, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.isNil();
                    }
                }
                
                /**
                 * Returns number of "BaggageClaimUnit" element
                 */
                public int sizeOfBaggageClaimUnitArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(BAGGAGECLAIMUNIT$18);
                    }
                }
                
                /**
                 * Sets array of all "BaggageClaimUnit" element
                 */
                public void setBaggageClaimUnitArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit[] baggageClaimUnitArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(baggageClaimUnitArray, BAGGAGECLAIMUNIT$18);
                    }
                }
                
                /**
                 * Sets ith "BaggageClaimUnit" element
                 */
                public void setBaggageClaimUnitArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit baggageClaimUnit)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit)get_store().find_element_user(BAGGAGECLAIMUNIT$18, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(baggageClaimUnit);
                    }
                }
                
                /**
                 * Nils the ith "BaggageClaimUnit" element
                 */
                public void setNilBaggageClaimUnitArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit)get_store().find_element_user(BAGGAGECLAIMUNIT$18, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "BaggageClaimUnit" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit insertNewBaggageClaimUnit(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit)get_store().insert_element_user(BAGGAGECLAIMUNIT$18, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "BaggageClaimUnit" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit addNewBaggageClaimUnit()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit)get_store().add_element_user(BAGGAGECLAIMUNIT$18);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "BaggageClaimUnit" element
                 */
                public void removeBaggageClaimUnit(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(BAGGAGECLAIMUNIT$18, i);
                    }
                }
                
                /**
                 * Gets array of all "BaggageMakeupBelt" elements
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt[] getBaggageMakeupBeltArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(BAGGAGEMAKEUPBELT$20, targetList);
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "BaggageMakeupBelt" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt getBaggageMakeupBeltArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt)get_store().find_element_user(BAGGAGEMAKEUPBELT$20, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Tests for nil ith "BaggageMakeupBelt" element
                 */
                public boolean isNilBaggageMakeupBeltArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt)get_store().find_element_user(BAGGAGEMAKEUPBELT$20, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.isNil();
                    }
                }
                
                /**
                 * Returns number of "BaggageMakeupBelt" element
                 */
                public int sizeOfBaggageMakeupBeltArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(BAGGAGEMAKEUPBELT$20);
                    }
                }
                
                /**
                 * Sets array of all "BaggageMakeupBelt" element
                 */
                public void setBaggageMakeupBeltArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt[] baggageMakeupBeltArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(baggageMakeupBeltArray, BAGGAGEMAKEUPBELT$20);
                    }
                }
                
                /**
                 * Sets ith "BaggageMakeupBelt" element
                 */
                public void setBaggageMakeupBeltArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt baggageMakeupBelt)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt)get_store().find_element_user(BAGGAGEMAKEUPBELT$20, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(baggageMakeupBelt);
                    }
                }
                
                /**
                 * Nils the ith "BaggageMakeupBelt" element
                 */
                public void setNilBaggageMakeupBeltArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt)get_store().find_element_user(BAGGAGEMAKEUPBELT$20, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "BaggageMakeupBelt" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt insertNewBaggageMakeupBelt(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt)get_store().insert_element_user(BAGGAGEMAKEUPBELT$20, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "BaggageMakeupBelt" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt addNewBaggageMakeupBelt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt)get_store().add_element_user(BAGGAGEMAKEUPBELT$20);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "BaggageMakeupBelt" element
                 */
                public void removeBaggageMakeupBelt(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(BAGGAGEMAKEUPBELT$20, i);
                    }
                }
                
                /**
                 * Gets array of all "CheckInInfo" elements
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo[] getCheckInInfoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(CHECKININFO$22, targetList);
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "CheckInInfo" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo getCheckInInfoArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo)get_store().find_element_user(CHECKININFO$22, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Tests for nil ith "CheckInInfo" element
                 */
                public boolean isNilCheckInInfoArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo)get_store().find_element_user(CHECKININFO$22, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.isNil();
                    }
                }
                
                /**
                 * Returns number of "CheckInInfo" element
                 */
                public int sizeOfCheckInInfoArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CHECKININFO$22);
                    }
                }
                
                /**
                 * Sets array of all "CheckInInfo" element
                 */
                public void setCheckInInfoArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo[] checkInInfoArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(checkInInfoArray, CHECKININFO$22);
                    }
                }
                
                /**
                 * Sets ith "CheckInInfo" element
                 */
                public void setCheckInInfoArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo checkInInfo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo)get_store().find_element_user(CHECKININFO$22, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(checkInInfo);
                    }
                }
                
                /**
                 * Nils the ith "CheckInInfo" element
                 */
                public void setNilCheckInInfoArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo)get_store().find_element_user(CHECKININFO$22, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "CheckInInfo" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo insertNewCheckInInfo(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo)get_store().insert_element_user(CHECKININFO$22, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "CheckInInfo" element
                 */
                public org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo addNewCheckInInfo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo target = null;
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo)get_store().add_element_user(CHECKININFO$22);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "CheckInInfo" element
                 */
                public void removeCheckInInfo(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CHECKININFO$22, i);
                    }
                }
                
                /**
                 * Gets the "PreClearedGateInd" element
                 */
                public boolean getPreClearedGateInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECLEAREDGATEIND$24, 0);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "PreClearedGateInd" element
                 */
                public org.apache.xmlbeans.XmlBoolean xgetPreClearedGateInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRECLEAREDGATEIND$24, 0);
                      return target;
                    }
                }
                
                /**
                 * Tests for nil "PreClearedGateInd" element
                 */
                public boolean isNilPreClearedGateInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRECLEAREDGATEIND$24, 0);
                      if (target == null) return false;
                      return target.isNil();
                    }
                }
                
                /**
                 * True if has "PreClearedGateInd" element
                 */
                public boolean isSetPreClearedGateInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PRECLEAREDGATEIND$24) != 0;
                    }
                }
                
                /**
                 * Sets the "PreClearedGateInd" element
                 */
                public void setPreClearedGateInd(boolean preClearedGateInd)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECLEAREDGATEIND$24, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECLEAREDGATEIND$24);
                      }
                      target.setBooleanValue(preClearedGateInd);
                    }
                }
                
                /**
                 * Sets (as xml) the "PreClearedGateInd" element
                 */
                public void xsetPreClearedGateInd(org.apache.xmlbeans.XmlBoolean preClearedGateInd)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRECLEAREDGATEIND$24, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PRECLEAREDGATEIND$24);
                      }
                      target.set(preClearedGateInd);
                    }
                }
                
                /**
                 * Nils the "PreClearedGateInd" element
                 */
                public void setNilPreClearedGateInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRECLEAREDGATEIND$24, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PRECLEAREDGATEIND$24);
                      }
                      target.setNil();
                    }
                }
                
                /**
                 * Unsets the "PreClearedGateInd" element
                 */
                public void unsetPreClearedGateInd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PRECLEAREDGATEIND$24, 0);
                    }
                }
                
                /**
                 * Gets the "DepartureOrArrival" attribute
                 */
                public org.iata.iata.x2007.x00.DepartureArrivalType.Enum getDepartureOrArrival()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPARTUREORARRIVAL$26);
                      if (target == null)
                      {
                        return null;
                      }
                      return (org.iata.iata.x2007.x00.DepartureArrivalType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DepartureOrArrival" attribute
                 */
                public org.iata.iata.x2007.x00.DepartureArrivalType xgetDepartureOrArrival()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.DepartureArrivalType target = null;
                      target = (org.iata.iata.x2007.x00.DepartureArrivalType)get_store().find_attribute_user(DEPARTUREORARRIVAL$26);
                      return target;
                    }
                }
                
                /**
                 * Sets the "DepartureOrArrival" attribute
                 */
                public void setDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType.Enum departureOrArrival)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPARTUREORARRIVAL$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPARTUREORARRIVAL$26);
                      }
                      target.setEnumValue(departureOrArrival);
                    }
                }
                
                /**
                 * Sets (as xml) the "DepartureOrArrival" attribute
                 */
                public void xsetDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType departureOrArrival)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.DepartureArrivalType target = null;
                      target = (org.iata.iata.x2007.x00.DepartureArrivalType)get_store().find_attribute_user(DEPARTUREORARRIVAL$26);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.DepartureArrivalType)get_store().add_attribute_user(DEPARTUREORARRIVAL$26);
                      }
                      target.set(departureOrArrival);
                    }
                }
                
                /**
                 * Gets the "ChargeType" attribute
                 */
                public java.lang.String getChargeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARGETYPE$28);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ChargeType" attribute
                 */
                public org.iata.iata.x2007.x00.IATACodeType xgetChargeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.IATACodeType target = null;
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CHARGETYPE$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "ChargeType" attribute
                 */
                public boolean isSetChargeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CHARGETYPE$28) != null;
                    }
                }
                
                /**
                 * Sets the "ChargeType" attribute
                 */
                public void setChargeType(java.lang.String chargeType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARGETYPE$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHARGETYPE$28);
                      }
                      target.setStringValue(chargeType);
                    }
                }
                
                /**
                 * Sets (as xml) the "ChargeType" attribute
                 */
                public void xsetChargeType(org.iata.iata.x2007.x00.IATACodeType chargeType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.IATACodeType target = null;
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CHARGETYPE$28);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CHARGETYPE$28);
                      }
                      target.set(chargeType);
                    }
                }
                
                /**
                 * Unsets the "ChargeType" attribute
                 */
                public void unsetChargeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CHARGETYPE$28);
                    }
                }
                /**
                 * An XML AirportZone(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$AirportZone.
                 */
                public static class AirportZoneImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone
                {
                    
                    public AirportZoneImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected AirportZoneImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML AircraftParkingPosition(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$AircraftParkingPosition.
                 */
                public static class AircraftParkingPositionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition
                {
                    
                    public AircraftParkingPositionImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected AircraftParkingPositionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    private static final javax.xml.namespace.QName QUALIFIER$0 = 
                      new javax.xml.namespace.QName("", "Qualifier");
                    
                    
                    /**
                     * Gets the "Qualifier" attribute
                     */
                    public java.lang.String getQualifier()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Qualifier" attribute
                     */
                    public org.apache.xmlbeans.XmlNMTOKEN xgetQualifier()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlNMTOKEN target = null;
                        target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(QUALIFIER$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Qualifier" attribute
                     */
                    public void setQualifier(java.lang.String qualifier)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUALIFIER$0);
                        }
                        target.setStringValue(qualifier);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Qualifier" attribute
                     */
                    public void xsetQualifier(org.apache.xmlbeans.XmlNMTOKEN qualifier)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlNMTOKEN target = null;
                        target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(QUALIFIER$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(QUALIFIER$0);
                        }
                        target.set(qualifier);
                      }
                    }
                }
                /**
                 * An XML PassengerGate(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$PassengerGate.
                 */
                public static class PassengerGateImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate
                {
                    
                    public PassengerGateImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected PassengerGateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    private static final javax.xml.namespace.QName REPEATINDEX$0 = 
                      new javax.xml.namespace.QName("", "RepeatIndex");
                    
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    public int getRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    public boolean isSetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(REPEATINDEX$0) != null;
                      }
                    }
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    public void setRepeatIndex(int repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$0);
                        }
                        target.setIntValue(repeatIndex);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$0);
                        }
                        target.set(repeatIndex);
                      }
                    }
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    public void unsetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(REPEATINDEX$0);
                      }
                    }
                }
                /**
                 * An XML RemoteOperationalGate(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$RemoteOperationalGate.
                 */
                public static class RemoteOperationalGateImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate
                {
                    
                    public RemoteOperationalGateImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected RemoteOperationalGateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    private static final javax.xml.namespace.QName REPEATINDEX$0 = 
                      new javax.xml.namespace.QName("", "RepeatIndex");
                    
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    public int getRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    public boolean isSetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(REPEATINDEX$0) != null;
                      }
                    }
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    public void setRepeatIndex(int repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$0);
                        }
                        target.setIntValue(repeatIndex);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$0);
                        }
                        target.set(repeatIndex);
                      }
                    }
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    public void unsetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(REPEATINDEX$0);
                      }
                    }
                }
                /**
                 * An XML Runway(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$Runway.
                 */
                public static class RunwayImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway
                {
                    
                    public RunwayImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected RunwayImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML AircraftTerminal(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$AircraftTerminal.
                 */
                public static class AircraftTerminalImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal
                {
                    
                    public AircraftTerminalImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected AircraftTerminalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML PublicTerminal(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$PublicTerminal.
                 */
                public static class PublicTerminalImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal
                {
                    
                    public PublicTerminalImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected PublicTerminalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    private static final javax.xml.namespace.QName REPEATINDEX$0 = 
                      new javax.xml.namespace.QName("", "RepeatIndex");
                    
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    public int getRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    public boolean isSetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(REPEATINDEX$0) != null;
                      }
                    }
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    public void setRepeatIndex(int repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$0);
                        }
                        target.setIntValue(repeatIndex);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$0);
                        }
                        target.set(repeatIndex);
                      }
                    }
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    public void unsetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(REPEATINDEX$0);
                      }
                    }
                }
                /**
                 * An XML BaggageClaimUnit(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$BaggageClaimUnit.
                 */
                public static class BaggageClaimUnitImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit
                {
                    
                    public BaggageClaimUnitImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected BaggageClaimUnitImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    private static final javax.xml.namespace.QName QUALIFIER$0 = 
                      new javax.xml.namespace.QName("", "Qualifier");
                    private static final javax.xml.namespace.QName AREALOCATION$2 = 
                      new javax.xml.namespace.QName("", "AreaLocation");
                    private static final javax.xml.namespace.QName REPEATINDEX$4 = 
                      new javax.xml.namespace.QName("", "RepeatIndex");
                    private static final javax.xml.namespace.QName SERVICECLASS$6 = 
                      new javax.xml.namespace.QName("", "ServiceClass");
                    
                    
                    /**
                     * Gets the "Qualifier" attribute
                     */
                    public java.lang.String getQualifier()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Qualifier" attribute
                     */
                    public org.iata.iata.x2007.x00.IATACodeType xgetQualifier()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Qualifier" attribute
                     */
                    public boolean isSetQualifier()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(QUALIFIER$0) != null;
                      }
                    }
                    
                    /**
                     * Sets the "Qualifier" attribute
                     */
                    public void setQualifier(java.lang.String qualifier)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUALIFIER$0);
                        }
                        target.setStringValue(qualifier);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Qualifier" attribute
                     */
                    public void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$0);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(QUALIFIER$0);
                        }
                        target.set(qualifier);
                      }
                    }
                    
                    /**
                     * Unsets the "Qualifier" attribute
                     */
                    public void unsetQualifier()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(QUALIFIER$0);
                      }
                    }
                    
                    /**
                     * Gets the "AreaLocation" attribute
                     */
                    public java.lang.String getAreaLocation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREALOCATION$2);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "AreaLocation" attribute
                     */
                    public org.iata.iata.x2007.x00.IATACodeType xgetAreaLocation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(AREALOCATION$2);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "AreaLocation" attribute
                     */
                    public boolean isSetAreaLocation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(AREALOCATION$2) != null;
                      }
                    }
                    
                    /**
                     * Sets the "AreaLocation" attribute
                     */
                    public void setAreaLocation(java.lang.String areaLocation)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREALOCATION$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREALOCATION$2);
                        }
                        target.setStringValue(areaLocation);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "AreaLocation" attribute
                     */
                    public void xsetAreaLocation(org.iata.iata.x2007.x00.IATACodeType areaLocation)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(AREALOCATION$2);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(AREALOCATION$2);
                        }
                        target.set(areaLocation);
                      }
                    }
                    
                    /**
                     * Unsets the "AreaLocation" attribute
                     */
                    public void unsetAreaLocation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(AREALOCATION$2);
                      }
                    }
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    public int getRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    public boolean isSetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(REPEATINDEX$4) != null;
                      }
                    }
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    public void setRepeatIndex(int repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$4);
                        }
                        target.setIntValue(repeatIndex);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$4);
                        }
                        target.set(repeatIndex);
                      }
                    }
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    public void unsetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(REPEATINDEX$4);
                      }
                    }
                    
                    /**
                     * Gets the "ServiceClass" attribute
                     */
                    public java.lang.String getServiceClass()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICECLASS$6);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "ServiceClass" attribute
                     */
                    public org.iata.iata.x2007.x00.IATACodeType xgetServiceClass()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(SERVICECLASS$6);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "ServiceClass" attribute
                     */
                    public boolean isSetServiceClass()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(SERVICECLASS$6) != null;
                      }
                    }
                    
                    /**
                     * Sets the "ServiceClass" attribute
                     */
                    public void setServiceClass(java.lang.String serviceClass)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICECLASS$6);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICECLASS$6);
                        }
                        target.setStringValue(serviceClass);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "ServiceClass" attribute
                     */
                    public void xsetServiceClass(org.iata.iata.x2007.x00.IATACodeType serviceClass)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(SERVICECLASS$6);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(SERVICECLASS$6);
                        }
                        target.set(serviceClass);
                      }
                    }
                    
                    /**
                     * Unsets the "ServiceClass" attribute
                     */
                    public void unsetServiceClass()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(SERVICECLASS$6);
                      }
                    }
                }
                /**
                 * An XML BaggageMakeupBelt(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$BaggageMakeupBelt.
                 */
                public static class BaggageMakeupBeltImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt
                {
                    
                    public BaggageMakeupBeltImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected BaggageMakeupBeltImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    private static final javax.xml.namespace.QName REPEATINDEX$0 = 
                      new javax.xml.namespace.QName("", "RepeatIndex");
                    
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    public int getRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    public boolean isSetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(REPEATINDEX$0) != null;
                      }
                    }
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    public void setRepeatIndex(int repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$0);
                        }
                        target.setIntValue(repeatIndex);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$0);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$0);
                        }
                        target.set(repeatIndex);
                      }
                    }
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    public void unsetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(REPEATINDEX$0);
                      }
                    }
                }
                /**
                 * An XML CheckInInfo(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is a complex type.
                 */
                public static class CheckInInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo
                {
                    
                    public CheckInInfoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName FIRSTPOSITION$0 = 
                      new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "FirstPosition");
                    private static final javax.xml.namespace.QName LASTPOSITION$2 = 
                      new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "LastPosition");
                    private static final javax.xml.namespace.QName QUALIFIER$4 = 
                      new javax.xml.namespace.QName("", "Qualifier");
                    private static final javax.xml.namespace.QName LOCATION$6 = 
                      new javax.xml.namespace.QName("", "Location");
                    private static final javax.xml.namespace.QName CLASS1$8 = 
                      new javax.xml.namespace.QName("", "Class");
                    private static final javax.xml.namespace.QName REPEATINDEX$10 = 
                      new javax.xml.namespace.QName("", "RepeatIndex");
                    
                    
                    /**
                     * Gets the "FirstPosition" element
                     */
                    public java.lang.String getFirstPosition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTPOSITION$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "FirstPosition" element
                     */
                    public org.iata.iata.x2007.x00.StringLength0To15 xgetFirstPosition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.StringLength0To15 target = null;
                        target = (org.iata.iata.x2007.x00.StringLength0To15)get_store().find_element_user(FIRSTPOSITION$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "FirstPosition" element
                     */
                    public boolean isSetFirstPosition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(FIRSTPOSITION$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "FirstPosition" element
                     */
                    public void setFirstPosition(java.lang.String firstPosition)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTPOSITION$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTPOSITION$0);
                        }
                        target.setStringValue(firstPosition);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "FirstPosition" element
                     */
                    public void xsetFirstPosition(org.iata.iata.x2007.x00.StringLength0To15 firstPosition)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.StringLength0To15 target = null;
                        target = (org.iata.iata.x2007.x00.StringLength0To15)get_store().find_element_user(FIRSTPOSITION$0, 0);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.StringLength0To15)get_store().add_element_user(FIRSTPOSITION$0);
                        }
                        target.set(firstPosition);
                      }
                    }
                    
                    /**
                     * Unsets the "FirstPosition" element
                     */
                    public void unsetFirstPosition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(FIRSTPOSITION$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "LastPosition" element
                     */
                    public java.lang.String getLastPosition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTPOSITION$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "LastPosition" element
                     */
                    public org.iata.iata.x2007.x00.StringLength0To15 xgetLastPosition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.StringLength0To15 target = null;
                        target = (org.iata.iata.x2007.x00.StringLength0To15)get_store().find_element_user(LASTPOSITION$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "LastPosition" element
                     */
                    public boolean isSetLastPosition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(LASTPOSITION$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "LastPosition" element
                     */
                    public void setLastPosition(java.lang.String lastPosition)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTPOSITION$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTPOSITION$2);
                        }
                        target.setStringValue(lastPosition);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "LastPosition" element
                     */
                    public void xsetLastPosition(org.iata.iata.x2007.x00.StringLength0To15 lastPosition)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.StringLength0To15 target = null;
                        target = (org.iata.iata.x2007.x00.StringLength0To15)get_store().find_element_user(LASTPOSITION$2, 0);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.StringLength0To15)get_store().add_element_user(LASTPOSITION$2);
                        }
                        target.set(lastPosition);
                      }
                    }
                    
                    /**
                     * Unsets the "LastPosition" element
                     */
                    public void unsetLastPosition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(LASTPOSITION$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Qualifier" attribute
                     */
                    public java.lang.String getQualifier()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$4);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Qualifier" attribute
                     */
                    public org.iata.iata.x2007.x00.IATACodeType xgetQualifier()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$4);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Qualifier" attribute
                     */
                    public boolean isSetQualifier()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(QUALIFIER$4) != null;
                      }
                    }
                    
                    /**
                     * Sets the "Qualifier" attribute
                     */
                    public void setQualifier(java.lang.String qualifier)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$4);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUALIFIER$4);
                        }
                        target.setStringValue(qualifier);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Qualifier" attribute
                     */
                    public void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$4);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(QUALIFIER$4);
                        }
                        target.set(qualifier);
                      }
                    }
                    
                    /**
                     * Unsets the "Qualifier" attribute
                     */
                    public void unsetQualifier()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(QUALIFIER$4);
                      }
                    }
                    
                    /**
                     * Gets the "Location" attribute
                     */
                    public java.lang.String getLocation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$6);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Location" attribute
                     */
                    public org.iata.iata.x2007.x00.IATACodeType xgetLocation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(LOCATION$6);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Location" attribute
                     */
                    public boolean isSetLocation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(LOCATION$6) != null;
                      }
                    }
                    
                    /**
                     * Sets the "Location" attribute
                     */
                    public void setLocation(java.lang.String location)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$6);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$6);
                        }
                        target.setStringValue(location);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Location" attribute
                     */
                    public void xsetLocation(org.iata.iata.x2007.x00.IATACodeType location)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(LOCATION$6);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(LOCATION$6);
                        }
                        target.set(location);
                      }
                    }
                    
                    /**
                     * Unsets the "Location" attribute
                     */
                    public void unsetLocation()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(LOCATION$6);
                      }
                    }
                    
                    /**
                     * Gets the "Class" attribute
                     */
                    public java.lang.String getClass1()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$8);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Class" attribute
                     */
                    public org.iata.iata.x2007.x00.IATACodeType xgetClass1()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CLASS1$8);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Class" attribute
                     */
                    public boolean isSetClass1()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(CLASS1$8) != null;
                      }
                    }
                    
                    /**
                     * Sets the "Class" attribute
                     */
                    public void setClass1(java.lang.String class1)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$8);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$8);
                        }
                        target.setStringValue(class1);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Class" attribute
                     */
                    public void xsetClass1(org.iata.iata.x2007.x00.IATACodeType class1)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.IATACodeType target = null;
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CLASS1$8);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CLASS1$8);
                        }
                        target.set(class1);
                      }
                    }
                    
                    /**
                     * Unsets the "Class" attribute
                     */
                    public void unsetClass1()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(CLASS1$8);
                      }
                    }
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    public int getRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$10);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$10);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    public boolean isSetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(REPEATINDEX$10) != null;
                      }
                    }
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    public void setRepeatIndex(int repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$10);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$10);
                        }
                        target.setIntValue(repeatIndex);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.iata.iata.x2007.x00.Numeric1To99 target = null;
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$10);
                        if (target == null)
                        {
                          target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$10);
                        }
                        target.set(repeatIndex);
                      }
                    }
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    public void unsetRepeatIndex()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(REPEATINDEX$10);
                      }
                    }
                }
            }
        }
        /**
         * An XML OperationTime(@http://www.iata.org/IATA/2007/00).
         *
         * This is a union type. Instances are of one of the following types:
         *     org.apache.xmlbeans.XmlDate
         *     org.apache.xmlbeans.XmlDateTime
         *     org.apache.xmlbeans.XmlTime
         */
        public static class OperationTimeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime, org.apache.xmlbeans.XmlDate, org.apache.xmlbeans.XmlDateTime, org.apache.xmlbeans.XmlTime
        {
            
            public OperationTimeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected OperationTimeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName OPERATIONQUALIFIER$0 = 
                new javax.xml.namespace.QName("", "OperationQualifier");
            private static final javax.xml.namespace.QName CODECONTEXT$2 = 
                new javax.xml.namespace.QName("", "CodeContext");
            private static final javax.xml.namespace.QName REPEATINDEX$4 = 
                new javax.xml.namespace.QName("", "RepeatIndex");
            private static final javax.xml.namespace.QName TIMETYPE$6 = 
                new javax.xml.namespace.QName("", "TimeType");
            
            
            /**
             * Gets the "OperationQualifier" attribute
             */
            public java.lang.String getOperationQualifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATIONQUALIFIER$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "OperationQualifier" attribute
             */
            public org.iata.iata.x2007.x00.IATACodeType xgetOperationQualifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(OPERATIONQUALIFIER$0);
                    return target;
                }
            }
            
            /**
             * Sets the "OperationQualifier" attribute
             */
            public void setOperationQualifier(java.lang.String operationQualifier)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATIONQUALIFIER$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATIONQUALIFIER$0);
                    }
                    target.setStringValue(operationQualifier);
                }
            }
            
            /**
             * Sets (as xml) the "OperationQualifier" attribute
             */
            public void xsetOperationQualifier(org.iata.iata.x2007.x00.IATACodeType operationQualifier)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(OPERATIONQUALIFIER$0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(OPERATIONQUALIFIER$0);
                    }
                    target.set(operationQualifier);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$2);
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
            public org.apache.xmlbeans.XmlString xgetCodeContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECONTEXT$2);
                    return target;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$2);
                    }
                    target.setStringValue(codeContext);
                }
            }
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            public void xsetCodeContext(org.apache.xmlbeans.XmlString codeContext)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECONTEXT$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODECONTEXT$2);
                    }
                    target.set(codeContext);
                }
            }
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            public int getRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                    return target;
                }
            }
            
            /**
             * True if has "RepeatIndex" attribute
             */
            public boolean isSetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REPEATINDEX$4) != null;
                }
            }
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            public void setRepeatIndex(int repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$4);
                    }
                    target.setIntValue(repeatIndex);
                }
            }
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.Numeric1To99 target = null;
                    target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$4);
                    }
                    target.set(repeatIndex);
                }
            }
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            public void unsetRepeatIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REPEATINDEX$4);
                }
            }
            
            /**
             * Gets the "TimeType" attribute
             */
            public java.lang.String getTimeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETYPE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "TimeType" attribute
             */
            public org.iata.iata.x2007.x00.IATACodeType xgetTimeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TIMETYPE$6);
                    return target;
                }
            }
            
            /**
             * True if has "TimeType" attribute
             */
            public boolean isSetTimeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TIMETYPE$6) != null;
                }
            }
            
            /**
             * Sets the "TimeType" attribute
             */
            public void setTimeType(java.lang.String timeType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETYPE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMETYPE$6);
                    }
                    target.setStringValue(timeType);
                }
            }
            
            /**
             * Sets (as xml) the "TimeType" attribute
             */
            public void xsetTimeType(org.iata.iata.x2007.x00.IATACodeType timeType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.IATACodeType target = null;
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TIMETYPE$6);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(TIMETYPE$6);
                    }
                    target.set(timeType);
                }
            }
            
            /**
             * Unsets the "TimeType" attribute
             */
            public void unsetTimeType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TIMETYPE$6);
                }
            }
        }
        /**
         * An XML AircraftInfo(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public static class AircraftInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo
        {
            
            public AircraftInfoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AIRCRAFTTYPE$0 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AircraftType");
            private static final javax.xml.namespace.QName AIRCRAFTSUBTYPE$2 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AircraftSubType");
            private static final javax.xml.namespace.QName REGISTRATION$4 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Registration");
            private static final javax.xml.namespace.QName TAILNUMBER$6 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "TailNumber");
            private static final javax.xml.namespace.QName CREWINFO$8 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CrewInfo");
            private static final javax.xml.namespace.QName AGENTINFO$10 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AgentInfo");
            private static final javax.xml.namespace.QName FLEETNUMBER$12 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "FleetNumber");
            private static final javax.xml.namespace.QName CALLSIGN$14 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CallSign");
            private static final javax.xml.namespace.QName DEADLOAD$16 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "DeadLoad");
            private static final javax.xml.namespace.QName BAGGAGE$18 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Baggage");
            private static final javax.xml.namespace.QName FUEL$20 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Fuel");
            
            
            /**
             * Gets the "AircraftType" element
             */
            public java.lang.String getAircraftType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "AircraftType" element
             */
            public org.iata.iata.x2007.x00.AirEquipType xgetAircraftType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.AirEquipType target = null;
                    target = (org.iata.iata.x2007.x00.AirEquipType)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                    return target;
                }
            }
            
            /**
             * Tests for nil "AircraftType" element
             */
            public boolean isNilAircraftType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.AirEquipType target = null;
                    target = (org.iata.iata.x2007.x00.AirEquipType)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                    if (target == null) return false;
                    return target.isNil();
                }
            }
            
            /**
             * True if has "AircraftType" element
             */
            public boolean isSetAircraftType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AIRCRAFTTYPE$0) != 0;
                }
            }
            
            /**
             * Sets the "AircraftType" element
             */
            public void setAircraftType(java.lang.String aircraftType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRCRAFTTYPE$0);
                    }
                    target.setStringValue(aircraftType);
                }
            }
            
            /**
             * Sets (as xml) the "AircraftType" element
             */
            public void xsetAircraftType(org.iata.iata.x2007.x00.AirEquipType aircraftType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.AirEquipType target = null;
                    target = (org.iata.iata.x2007.x00.AirEquipType)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.AirEquipType)get_store().add_element_user(AIRCRAFTTYPE$0);
                    }
                    target.set(aircraftType);
                }
            }
            
            /**
             * Nils the "AircraftType" element
             */
            public void setNilAircraftType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.AirEquipType target = null;
                    target = (org.iata.iata.x2007.x00.AirEquipType)get_store().find_element_user(AIRCRAFTTYPE$0, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.AirEquipType)get_store().add_element_user(AIRCRAFTTYPE$0);
                    }
                    target.setNil();
                }
            }
            
            /**
             * Unsets the "AircraftType" element
             */
            public void unsetAircraftType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AIRCRAFTTYPE$0, 0);
                }
            }
            
            /**
             * Gets the "AircraftSubType" element
             */
            public java.lang.String getAircraftSubType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "AircraftSubType" element
             */
            public org.iata.iata.x2007.x00.StringLength3 xgetAircraftSubType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.StringLength3 target = null;
                    target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                    return target;
                }
            }
            
            /**
             * Tests for nil "AircraftSubType" element
             */
            public boolean isNilAircraftSubType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.StringLength3 target = null;
                    target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                    if (target == null) return false;
                    return target.isNil();
                }
            }
            
            /**
             * True if has "AircraftSubType" element
             */
            public boolean isSetAircraftSubType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AIRCRAFTSUBTYPE$2) != 0;
                }
            }
            
            /**
             * Sets the "AircraftSubType" element
             */
            public void setAircraftSubType(java.lang.String aircraftSubType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRCRAFTSUBTYPE$2);
                    }
                    target.setStringValue(aircraftSubType);
                }
            }
            
            /**
             * Sets (as xml) the "AircraftSubType" element
             */
            public void xsetAircraftSubType(org.iata.iata.x2007.x00.StringLength3 aircraftSubType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.StringLength3 target = null;
                    target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.StringLength3)get_store().add_element_user(AIRCRAFTSUBTYPE$2);
                    }
                    target.set(aircraftSubType);
                }
            }
            
            /**
             * Nils the "AircraftSubType" element
             */
            public void setNilAircraftSubType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.StringLength3 target = null;
                    target = (org.iata.iata.x2007.x00.StringLength3)get_store().find_element_user(AIRCRAFTSUBTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.StringLength3)get_store().add_element_user(AIRCRAFTSUBTYPE$2);
                    }
                    target.setNil();
                }
            }
            
            /**
             * Unsets the "AircraftSubType" element
             */
            public void unsetAircraftSubType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AIRCRAFTSUBTYPE$2, 0);
                }
            }
            
            /**
             * Gets the "Registration" element
             */
            public java.lang.String getRegistration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATION$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Registration" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration xgetRegistration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                    return target;
                }
            }
            
            /**
             * Tests for nil "Registration" element
             */
            public boolean isNilRegistration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                    if (target == null) return false;
                    return target.isNil();
                }
            }
            
            /**
             * True if has "Registration" element
             */
            public boolean isSetRegistration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REGISTRATION$4) != 0;
                }
            }
            
            /**
             * Sets the "Registration" element
             */
            public void setRegistration(java.lang.String registration)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATION$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRATION$4);
                    }
                    target.setStringValue(registration);
                }
            }
            
            /**
             * Sets (as xml) the "Registration" element
             */
            public void xsetRegistration(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration registration)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration)get_store().add_element_user(REGISTRATION$4);
                    }
                    target.set(registration);
                }
            }
            
            /**
             * Nils the "Registration" element
             */
            public void setNilRegistration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration)get_store().find_element_user(REGISTRATION$4, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration)get_store().add_element_user(REGISTRATION$4);
                    }
                    target.setNil();
                }
            }
            
            /**
             * Unsets the "Registration" element
             */
            public void unsetRegistration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REGISTRATION$4, 0);
                }
            }
            
            /**
             * Gets the "TailNumber" element
             */
            public java.lang.String getTailNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAILNUMBER$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "TailNumber" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber xgetTailNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber)get_store().find_element_user(TAILNUMBER$6, 0);
                    return target;
                }
            }
            
            /**
             * Tests for nil "TailNumber" element
             */
            public boolean isNilTailNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber)get_store().find_element_user(TAILNUMBER$6, 0);
                    if (target == null) return false;
                    return target.isNil();
                }
            }
            
            /**
             * True if has "TailNumber" element
             */
            public boolean isSetTailNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TAILNUMBER$6) != 0;
                }
            }
            
            /**
             * Sets the "TailNumber" element
             */
            public void setTailNumber(java.lang.String tailNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAILNUMBER$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAILNUMBER$6);
                    }
                    target.setStringValue(tailNumber);
                }
            }
            
            /**
             * Sets (as xml) the "TailNumber" element
             */
            public void xsetTailNumber(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber tailNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber)get_store().find_element_user(TAILNUMBER$6, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber)get_store().add_element_user(TAILNUMBER$6);
                    }
                    target.set(tailNumber);
                }
            }
            
            /**
             * Nils the "TailNumber" element
             */
            public void setNilTailNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber)get_store().find_element_user(TAILNUMBER$6, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber)get_store().add_element_user(TAILNUMBER$6);
                    }
                    target.setNil();
                }
            }
            
            /**
             * Unsets the "TailNumber" element
             */
            public void unsetTailNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TAILNUMBER$6, 0);
                }
            }
            
            /**
             * Gets array of all "CrewInfo" elements
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo[] getCrewInfoArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CREWINFO$8, targetList);
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "CrewInfo" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo getCrewInfoArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo)get_store().find_element_user(CREWINFO$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Tests for nil ith "CrewInfo" element
             */
            public boolean isNilCrewInfoArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo)get_store().find_element_user(CREWINFO$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.isNil();
                }
            }
            
            /**
             * Returns number of "CrewInfo" element
             */
            public int sizeOfCrewInfoArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CREWINFO$8);
                }
            }
            
            /**
             * Sets array of all "CrewInfo" element
             */
            public void setCrewInfoArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo[] crewInfoArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(crewInfoArray, CREWINFO$8);
                }
            }
            
            /**
             * Sets ith "CrewInfo" element
             */
            public void setCrewInfoArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo crewInfo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo)get_store().find_element_user(CREWINFO$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(crewInfo);
                }
            }
            
            /**
             * Nils the ith "CrewInfo" element
             */
            public void setNilCrewInfoArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo)get_store().find_element_user(CREWINFO$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setNil();
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "CrewInfo" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo insertNewCrewInfo(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo)get_store().insert_element_user(CREWINFO$8, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "CrewInfo" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo addNewCrewInfo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo)get_store().add_element_user(CREWINFO$8);
                    return target;
                }
            }
            
            /**
             * Removes the ith "CrewInfo" element
             */
            public void removeCrewInfo(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CREWINFO$8, i);
                }
            }
            
            /**
             * Gets array of all "AgentInfo" elements
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo[] getAgentInfoArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(AGENTINFO$10, targetList);
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo[] result = new org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "AgentInfo" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo getAgentInfoArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo)get_store().find_element_user(AGENTINFO$10, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Tests for nil ith "AgentInfo" element
             */
            public boolean isNilAgentInfoArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo)get_store().find_element_user(AGENTINFO$10, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.isNil();
                }
            }
            
            /**
             * Returns number of "AgentInfo" element
             */
            public int sizeOfAgentInfoArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AGENTINFO$10);
                }
            }
            
            /**
             * Sets array of all "AgentInfo" element
             */
            public void setAgentInfoArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo[] agentInfoArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(agentInfoArray, AGENTINFO$10);
                }
            }
            
            /**
             * Sets ith "AgentInfo" element
             */
            public void setAgentInfoArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo agentInfo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo)get_store().find_element_user(AGENTINFO$10, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(agentInfo);
                }
            }
            
            /**
             * Nils the ith "AgentInfo" element
             */
            public void setNilAgentInfoArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo)get_store().find_element_user(AGENTINFO$10, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setNil();
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "AgentInfo" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo insertNewAgentInfo(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo)get_store().insert_element_user(AGENTINFO$10, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "AgentInfo" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo addNewAgentInfo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo)get_store().add_element_user(AGENTINFO$10);
                    return target;
                }
            }
            
            /**
             * Removes the ith "AgentInfo" element
             */
            public void removeAgentInfo(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AGENTINFO$10, i);
                }
            }
            
            /**
             * Gets the "FleetNumber" element
             */
            public java.lang.String getFleetNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLEETNUMBER$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "FleetNumber" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber xgetFleetNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber)get_store().find_element_user(FLEETNUMBER$12, 0);
                    return target;
                }
            }
            
            /**
             * Tests for nil "FleetNumber" element
             */
            public boolean isNilFleetNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber)get_store().find_element_user(FLEETNUMBER$12, 0);
                    if (target == null) return false;
                    return target.isNil();
                }
            }
            
            /**
             * True if has "FleetNumber" element
             */
            public boolean isSetFleetNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FLEETNUMBER$12) != 0;
                }
            }
            
            /**
             * Sets the "FleetNumber" element
             */
            public void setFleetNumber(java.lang.String fleetNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLEETNUMBER$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLEETNUMBER$12);
                    }
                    target.setStringValue(fleetNumber);
                }
            }
            
            /**
             * Sets (as xml) the "FleetNumber" element
             */
            public void xsetFleetNumber(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber fleetNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber)get_store().find_element_user(FLEETNUMBER$12, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber)get_store().add_element_user(FLEETNUMBER$12);
                    }
                    target.set(fleetNumber);
                }
            }
            
            /**
             * Nils the "FleetNumber" element
             */
            public void setNilFleetNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber)get_store().find_element_user(FLEETNUMBER$12, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber)get_store().add_element_user(FLEETNUMBER$12);
                    }
                    target.setNil();
                }
            }
            
            /**
             * Unsets the "FleetNumber" element
             */
            public void unsetFleetNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FLEETNUMBER$12, 0);
                }
            }
            
            /**
             * Gets the "CallSign" element
             */
            public java.lang.String getCallSign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLSIGN$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "CallSign" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign xgetCallSign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign)get_store().find_element_user(CALLSIGN$14, 0);
                    return target;
                }
            }
            
            /**
             * Tests for nil "CallSign" element
             */
            public boolean isNilCallSign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign)get_store().find_element_user(CALLSIGN$14, 0);
                    if (target == null) return false;
                    return target.isNil();
                }
            }
            
            /**
             * True if has "CallSign" element
             */
            public boolean isSetCallSign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CALLSIGN$14) != 0;
                }
            }
            
            /**
             * Sets the "CallSign" element
             */
            public void setCallSign(java.lang.String callSign)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLSIGN$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLSIGN$14);
                    }
                    target.setStringValue(callSign);
                }
            }
            
            /**
             * Sets (as xml) the "CallSign" element
             */
            public void xsetCallSign(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign callSign)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign)get_store().find_element_user(CALLSIGN$14, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign)get_store().add_element_user(CALLSIGN$14);
                    }
                    target.set(callSign);
                }
            }
            
            /**
             * Nils the "CallSign" element
             */
            public void setNilCallSign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign)get_store().find_element_user(CALLSIGN$14, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign)get_store().add_element_user(CALLSIGN$14);
                    }
                    target.setNil();
                }
            }
            
            /**
             * Unsets the "CallSign" element
             */
            public void unsetCallSign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CALLSIGN$14, 0);
                }
            }
            
            /**
             * Gets array of all "DeadLoad" elements
             */
            public org.iata.iata.x2007.x00.DeadLoadType[] getDeadLoadArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DEADLOAD$16, targetList);
                    org.iata.iata.x2007.x00.DeadLoadType[] result = new org.iata.iata.x2007.x00.DeadLoadType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "DeadLoad" element
             */
            public org.iata.iata.x2007.x00.DeadLoadType getDeadLoadArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.DeadLoadType target = null;
                    target = (org.iata.iata.x2007.x00.DeadLoadType)get_store().find_element_user(DEADLOAD$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "DeadLoad" element
             */
            public int sizeOfDeadLoadArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DEADLOAD$16);
                }
            }
            
            /**
             * Sets array of all "DeadLoad" element
             */
            public void setDeadLoadArray(org.iata.iata.x2007.x00.DeadLoadType[] deadLoadArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(deadLoadArray, DEADLOAD$16);
                }
            }
            
            /**
             * Sets ith "DeadLoad" element
             */
            public void setDeadLoadArray(int i, org.iata.iata.x2007.x00.DeadLoadType deadLoad)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.DeadLoadType target = null;
                    target = (org.iata.iata.x2007.x00.DeadLoadType)get_store().find_element_user(DEADLOAD$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(deadLoad);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DeadLoad" element
             */
            public org.iata.iata.x2007.x00.DeadLoadType insertNewDeadLoad(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.DeadLoadType target = null;
                    target = (org.iata.iata.x2007.x00.DeadLoadType)get_store().insert_element_user(DEADLOAD$16, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DeadLoad" element
             */
            public org.iata.iata.x2007.x00.DeadLoadType addNewDeadLoad()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.DeadLoadType target = null;
                    target = (org.iata.iata.x2007.x00.DeadLoadType)get_store().add_element_user(DEADLOAD$16);
                    return target;
                }
            }
            
            /**
             * Removes the ith "DeadLoad" element
             */
            public void removeDeadLoad(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DEADLOAD$16, i);
                }
            }
            
            /**
             * Gets array of all "Baggage" elements
             */
            public org.iata.iata.x2007.x00.BaggageLoadType[] getBaggageArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BAGGAGE$18, targetList);
                    org.iata.iata.x2007.x00.BaggageLoadType[] result = new org.iata.iata.x2007.x00.BaggageLoadType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Baggage" element
             */
            public org.iata.iata.x2007.x00.BaggageLoadType getBaggageArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.BaggageLoadType target = null;
                    target = (org.iata.iata.x2007.x00.BaggageLoadType)get_store().find_element_user(BAGGAGE$18, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Baggage" element
             */
            public int sizeOfBaggageArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BAGGAGE$18);
                }
            }
            
            /**
             * Sets array of all "Baggage" element
             */
            public void setBaggageArray(org.iata.iata.x2007.x00.BaggageLoadType[] baggageArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(baggageArray, BAGGAGE$18);
                }
            }
            
            /**
             * Sets ith "Baggage" element
             */
            public void setBaggageArray(int i, org.iata.iata.x2007.x00.BaggageLoadType baggage)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.BaggageLoadType target = null;
                    target = (org.iata.iata.x2007.x00.BaggageLoadType)get_store().find_element_user(BAGGAGE$18, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(baggage);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Baggage" element
             */
            public org.iata.iata.x2007.x00.BaggageLoadType insertNewBaggage(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.BaggageLoadType target = null;
                    target = (org.iata.iata.x2007.x00.BaggageLoadType)get_store().insert_element_user(BAGGAGE$18, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Baggage" element
             */
            public org.iata.iata.x2007.x00.BaggageLoadType addNewBaggage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.BaggageLoadType target = null;
                    target = (org.iata.iata.x2007.x00.BaggageLoadType)get_store().add_element_user(BAGGAGE$18);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Baggage" element
             */
            public void removeBaggage(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BAGGAGE$18, i);
                }
            }
            
            /**
             * Gets array of all "Fuel" elements
             */
            public org.iata.iata.x2007.x00.FuelDataType[] getFuelArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(FUEL$20, targetList);
                    org.iata.iata.x2007.x00.FuelDataType[] result = new org.iata.iata.x2007.x00.FuelDataType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Fuel" element
             */
            public org.iata.iata.x2007.x00.FuelDataType getFuelArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FuelDataType target = null;
                    target = (org.iata.iata.x2007.x00.FuelDataType)get_store().find_element_user(FUEL$20, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Fuel" element
             */
            public int sizeOfFuelArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FUEL$20);
                }
            }
            
            /**
             * Sets array of all "Fuel" element
             */
            public void setFuelArray(org.iata.iata.x2007.x00.FuelDataType[] fuelArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(fuelArray, FUEL$20);
                }
            }
            
            /**
             * Sets ith "Fuel" element
             */
            public void setFuelArray(int i, org.iata.iata.x2007.x00.FuelDataType fuel)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FuelDataType target = null;
                    target = (org.iata.iata.x2007.x00.FuelDataType)get_store().find_element_user(FUEL$20, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(fuel);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Fuel" element
             */
            public org.iata.iata.x2007.x00.FuelDataType insertNewFuel(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FuelDataType target = null;
                    target = (org.iata.iata.x2007.x00.FuelDataType)get_store().insert_element_user(FUEL$20, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Fuel" element
             */
            public org.iata.iata.x2007.x00.FuelDataType addNewFuel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FuelDataType target = null;
                    target = (org.iata.iata.x2007.x00.FuelDataType)get_store().add_element_user(FUEL$20);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Fuel" element
             */
            public void removeFuel(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FUEL$20, i);
                }
            }
            /**
             * An XML Registration(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$Registration.
             */
            public static class RegistrationImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration
            {
                
                public RegistrationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected RegistrationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML TailNumber(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$TailNumber.
             */
            public static class TailNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber
            {
                
                public TailNumberImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected TailNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML CrewInfo(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$CrewInfo.
             */
            public static class CrewInfoImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo
            {
                
                public CrewInfoImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected CrewInfoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName QUALIFIER$0 = 
                    new javax.xml.namespace.QName("", "Qualifier");
                private static final javax.xml.namespace.QName REPEATINDEX$2 = 
                    new javax.xml.namespace.QName("", "RepeatIndex");
                private static final javax.xml.namespace.QName AIRLINE$4 = 
                    new javax.xml.namespace.QName("", "Airline");
                private static final javax.xml.namespace.QName CODECONTEXT$6 = 
                    new javax.xml.namespace.QName("", "CodeContext");
                
                
                /**
                 * Gets the "Qualifier" attribute
                 */
                public java.lang.String getQualifier()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Qualifier" attribute
                 */
                public org.iata.iata.x2007.x00.IATACodeType xgetQualifier()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.IATACodeType target = null;
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Qualifier" attribute
                 */
                public void setQualifier(java.lang.String qualifier)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUALIFIER$0);
                      }
                      target.setStringValue(qualifier);
                    }
                }
                
                /**
                 * Sets (as xml) the "Qualifier" attribute
                 */
                public void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.IATACodeType target = null;
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(QUALIFIER$0);
                      }
                      target.set(qualifier);
                    }
                }
                
                /**
                 * Gets the "RepeatIndex" attribute
                 */
                public int getRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$2);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RepeatIndex" attribute
                 */
                public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.Numeric1To99 target = null;
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "RepeatIndex" attribute
                 */
                public boolean isSetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REPEATINDEX$2) != null;
                    }
                }
                
                /**
                 * Sets the "RepeatIndex" attribute
                 */
                public void setRepeatIndex(int repeatIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$2);
                      }
                      target.setIntValue(repeatIndex);
                    }
                }
                
                /**
                 * Sets (as xml) the "RepeatIndex" attribute
                 */
                public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.Numeric1To99 target = null;
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$2);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$2);
                      }
                      target.set(repeatIndex);
                    }
                }
                
                /**
                 * Unsets the "RepeatIndex" attribute
                 */
                public void unsetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REPEATINDEX$2);
                    }
                }
                
                /**
                 * Gets the "Airline" attribute
                 */
                public java.lang.String getAirline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AIRLINE$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Airline" attribute
                 */
                public org.iata.iata.x2007.x00.AirlineType xgetAirline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.AirlineType target = null;
                      target = (org.iata.iata.x2007.x00.AirlineType)get_store().find_attribute_user(AIRLINE$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "Airline" attribute
                 */
                public boolean isSetAirline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AIRLINE$4) != null;
                    }
                }
                
                /**
                 * Sets the "Airline" attribute
                 */
                public void setAirline(java.lang.String airline)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AIRLINE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AIRLINE$4);
                      }
                      target.setStringValue(airline);
                    }
                }
                
                /**
                 * Sets (as xml) the "Airline" attribute
                 */
                public void xsetAirline(org.iata.iata.x2007.x00.AirlineType airline)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.AirlineType target = null;
                      target = (org.iata.iata.x2007.x00.AirlineType)get_store().find_attribute_user(AIRLINE$4);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.AirlineType)get_store().add_attribute_user(AIRLINE$4);
                      }
                      target.set(airline);
                    }
                }
                
                /**
                 * Unsets the "Airline" attribute
                 */
                public void unsetAirline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AIRLINE$4);
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
                public org.iata.iata.x2007.x00.IATACodeType xgetCodeContext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.IATACodeType target = null;
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$6);
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
                public void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.IATACodeType target = null;
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(CODECONTEXT$6);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(CODECONTEXT$6);
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
            }
            /**
             * An XML AgentInfo(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$AgentInfo.
             */
            public static class AgentInfoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo
            {
                
                public AgentInfoImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected AgentInfoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName QUALIFIER$0 = 
                    new javax.xml.namespace.QName("", "Qualifier");
                private static final javax.xml.namespace.QName DEPARTUREORARRIVAL$2 = 
                    new javax.xml.namespace.QName("", "DepartureOrArrival");
                private static final javax.xml.namespace.QName REPEATINDEX$4 = 
                    new javax.xml.namespace.QName("", "RepeatIndex");
                
                
                /**
                 * Gets the "Qualifier" attribute
                 */
                public java.lang.String getQualifier()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Qualifier" attribute
                 */
                public org.iata.iata.x2007.x00.IATACodeType xgetQualifier()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.IATACodeType target = null;
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Qualifier" attribute
                 */
                public void setQualifier(java.lang.String qualifier)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUALIFIER$0);
                      }
                      target.setStringValue(qualifier);
                    }
                }
                
                /**
                 * Sets (as xml) the "Qualifier" attribute
                 */
                public void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.IATACodeType target = null;
                      target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(QUALIFIER$0);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(QUALIFIER$0);
                      }
                      target.set(qualifier);
                    }
                }
                
                /**
                 * Gets the "DepartureOrArrival" attribute
                 */
                public org.iata.iata.x2007.x00.DepartureArrivalType.Enum getDepartureOrArrival()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPARTUREORARRIVAL$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return (org.iata.iata.x2007.x00.DepartureArrivalType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DepartureOrArrival" attribute
                 */
                public org.iata.iata.x2007.x00.DepartureArrivalType xgetDepartureOrArrival()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.DepartureArrivalType target = null;
                      target = (org.iata.iata.x2007.x00.DepartureArrivalType)get_store().find_attribute_user(DEPARTUREORARRIVAL$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "DepartureOrArrival" attribute
                 */
                public void setDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType.Enum departureOrArrival)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPARTUREORARRIVAL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPARTUREORARRIVAL$2);
                      }
                      target.setEnumValue(departureOrArrival);
                    }
                }
                
                /**
                 * Sets (as xml) the "DepartureOrArrival" attribute
                 */
                public void xsetDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType departureOrArrival)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.DepartureArrivalType target = null;
                      target = (org.iata.iata.x2007.x00.DepartureArrivalType)get_store().find_attribute_user(DEPARTUREORARRIVAL$2);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.DepartureArrivalType)get_store().add_attribute_user(DEPARTUREORARRIVAL$2);
                      }
                      target.set(departureOrArrival);
                    }
                }
                
                /**
                 * Gets the "RepeatIndex" attribute
                 */
                public int getRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RepeatIndex" attribute
                 */
                public org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.Numeric1To99 target = null;
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "RepeatIndex" attribute
                 */
                public boolean isSetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REPEATINDEX$4) != null;
                    }
                }
                
                /**
                 * Sets the "RepeatIndex" attribute
                 */
                public void setRepeatIndex(int repeatIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATINDEX$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATINDEX$4);
                      }
                      target.setIntValue(repeatIndex);
                    }
                }
                
                /**
                 * Sets (as xml) the "RepeatIndex" attribute
                 */
                public void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.iata.iata.x2007.x00.Numeric1To99 target = null;
                      target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().find_attribute_user(REPEATINDEX$4);
                      if (target == null)
                      {
                        target = (org.iata.iata.x2007.x00.Numeric1To99)get_store().add_attribute_user(REPEATINDEX$4);
                      }
                      target.set(repeatIndex);
                    }
                }
                
                /**
                 * Unsets the "RepeatIndex" attribute
                 */
                public void unsetRepeatIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REPEATINDEX$4);
                    }
                }
            }
            /**
             * An XML FleetNumber(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$FleetNumber.
             */
            public static class FleetNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber
            {
                
                public FleetNumberImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected FleetNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML CallSign(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$CallSign.
             */
            public static class CallSignImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign
            {
                
                public CallSignImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected CallSignImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML PublicFlightDisplay(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public static class PublicFlightDisplayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay
        {
            
            public PublicFlightDisplayImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AIRLINETYPE$0 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AirlineType");
            private static final javax.xml.namespace.QName FLIGHTNUMBER$2 = 
                new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "FlightNumber");
            
            
            /**
             * Gets the "AirlineType" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType getAirlineType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType)get_store().find_element_user(AIRLINETYPE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "AirlineType" element
             */
            public void setAirlineType(org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType airlineType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType)get_store().find_element_user(AIRLINETYPE$0, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType)get_store().add_element_user(AIRLINETYPE$0);
                    }
                    target.set(airlineType);
                }
            }
            
            /**
             * Appends and returns a new empty "AirlineType" element
             */
            public org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType addNewAirlineType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType target = null;
                    target = (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType)get_store().add_element_user(AIRLINETYPE$0);
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
             * An XML AirlineType(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$PublicFlightDisplay$AirlineType.
             */
            public static class AirlineTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType
            {
                
                public AirlineTypeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected AirlineTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
        }
        /**
         * An XML FlightClassification(@).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$FlightClassification.
         */
        public static class FlightClassificationImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification
        {
            
            public FlightClassificationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FlightClassificationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML InternationalStatus(@).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$InternationalStatus.
         */
        public static class InternationalStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus
        {
            
            public InternationalStatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected InternationalStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
