/*
 * XML Type:  FlightLegType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FlightLegType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00;


/**
 * An XML FlightLegType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public interface FlightLegType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightLegType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flightlegtypeaadctype");
    
    /**
     * Gets the "LegIdentifier" element
     */
    org.iata.iata.x2007.x00.FlightLegIdentifierType getLegIdentifier();
    
    /**
     * Sets the "LegIdentifier" element
     */
    void setLegIdentifier(org.iata.iata.x2007.x00.FlightLegIdentifierType legIdentifier);
    
    /**
     * Appends and returns a new empty "LegIdentifier" element
     */
    org.iata.iata.x2007.x00.FlightLegIdentifierType addNewLegIdentifier();
    
    /**
     * Gets the "SpecialAction" element
     */
    org.iata.iata.x2007.x00.FlightLegType.SpecialAction.Enum getSpecialAction();
    
    /**
     * Gets (as xml) the "SpecialAction" element
     */
    org.iata.iata.x2007.x00.FlightLegType.SpecialAction xgetSpecialAction();
    
    /**
     * Tests for nil "SpecialAction" element
     */
    boolean isNilSpecialAction();
    
    /**
     * True if has "SpecialAction" element
     */
    boolean isSetSpecialAction();
    
    /**
     * Sets the "SpecialAction" element
     */
    void setSpecialAction(org.iata.iata.x2007.x00.FlightLegType.SpecialAction.Enum specialAction);
    
    /**
     * Sets (as xml) the "SpecialAction" element
     */
    void xsetSpecialAction(org.iata.iata.x2007.x00.FlightLegType.SpecialAction specialAction);
    
    /**
     * Nils the "SpecialAction" element
     */
    void setNilSpecialAction();
    
    /**
     * Unsets the "SpecialAction" element
     */
    void unsetSpecialAction();
    
    /**
     * Gets the "LegData" element
     */
    org.iata.iata.x2007.x00.FlightLegType.LegData getLegData();
    
    /**
     * Sets the "LegData" element
     */
    void setLegData(org.iata.iata.x2007.x00.FlightLegType.LegData legData);
    
    /**
     * Appends and returns a new empty "LegData" element
     */
    org.iata.iata.x2007.x00.FlightLegType.LegData addNewLegData();
    
    /**
     * Gets the "TPA_Extension" element
     */
    org.iata.iata.x2007.x00.TPAExtensionsType getTPAExtension();
    
    /**
     * True if has "TPA_Extension" element
     */
    boolean isSetTPAExtension();
    
    /**
     * Sets the "TPA_Extension" element
     */
    void setTPAExtension(org.iata.iata.x2007.x00.TPAExtensionsType tpaExtension);
    
    /**
     * Appends and returns a new empty "TPA_Extension" element
     */
    org.iata.iata.x2007.x00.TPAExtensionsType addNewTPAExtension();
    
    /**
     * Unsets the "TPA_Extension" element
     */
    void unsetTPAExtension();
    
    /**
     * An XML SpecialAction(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$SpecialAction.
     */
    public interface SpecialAction extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpecialAction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("specialaction25a1elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum DELETE = Enum.forString("Delete");
        static final Enum LOCK_DOWN = Enum.forString("LockDown");
        static final Enum DO_NOT_DISPLAY = Enum.forString("DoNotDisplay");
        
        static final int INT_DELETE = Enum.INT_DELETE;
        static final int INT_LOCK_DOWN = Enum.INT_LOCK_DOWN;
        static final int INT_DO_NOT_DISPLAY = Enum.INT_DO_NOT_DISPLAY;
        
        /**
         * Enumeration value class for org.iata.iata.x2007.x00.FlightLegType$SpecialAction.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_DELETE
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
            
            static final int INT_DELETE = 1;
            static final int INT_LOCK_DOWN = 2;
            static final int INT_DO_NOT_DISPLAY = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Delete", INT_DELETE),
                    new Enum("LockDown", INT_LOCK_DOWN),
                    new Enum("DoNotDisplay", INT_DO_NOT_DISPLAY),
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
            public static org.iata.iata.x2007.x00.FlightLegType.SpecialAction newValue(java.lang.Object obj) {
              return (org.iata.iata.x2007.x00.FlightLegType.SpecialAction) type.newValue( obj ); }
            
            public static org.iata.iata.x2007.x00.FlightLegType.SpecialAction newInstance() {
              return (org.iata.iata.x2007.x00.FlightLegType.SpecialAction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightLegType.SpecialAction newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightLegType.SpecialAction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML LegData(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public interface LegData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LegData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("legdatae438elemtype");
        
        /**
         * Gets array of all "OperationalStatus" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus[] getOperationalStatusArray();
        
        /**
         * Gets ith "OperationalStatus" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus getOperationalStatusArray(int i);
        
        /**
         * Tests for nil ith "OperationalStatus" element
         */
        boolean isNilOperationalStatusArray(int i);
        
        /**
         * Returns number of "OperationalStatus" element
         */
        int sizeOfOperationalStatusArray();
        
        /**
         * Sets array of all "OperationalStatus" element
         */
        void setOperationalStatusArray(org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus[] operationalStatusArray);
        
        /**
         * Sets ith "OperationalStatus" element
         */
        void setOperationalStatusArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus operationalStatus);
        
        /**
         * Nils the ith "OperationalStatus" element
         */
        void setNilOperationalStatusArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OperationalStatus" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus insertNewOperationalStatus(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OperationalStatus" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus addNewOperationalStatus();
        
        /**
         * Removes the ith "OperationalStatus" element
         */
        void removeOperationalStatus(int i);
        
        /**
         * Gets the "PublicStatus" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus getPublicStatus();
        
        /**
         * Tests for nil "PublicStatus" element
         */
        boolean isNilPublicStatus();
        
        /**
         * True if has "PublicStatus" element
         */
        boolean isSetPublicStatus();
        
        /**
         * Sets the "PublicStatus" element
         */
        void setPublicStatus(org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus publicStatus);
        
        /**
         * Appends and returns a new empty "PublicStatus" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus addNewPublicStatus();
        
        /**
         * Nils the "PublicStatus" element
         */
        void setNilPublicStatus();
        
        /**
         * Unsets the "PublicStatus" element
         */
        void unsetPublicStatus();
        
        /**
         * Gets the "OperatingAlliance" element
         */
        java.lang.String getOperatingAlliance();
        
        /**
         * Gets (as xml) the "OperatingAlliance" element
         */
        org.iata.iata.x2007.x00.IATACodeType xgetOperatingAlliance();
        
        /**
         * Tests for nil "OperatingAlliance" element
         */
        boolean isNilOperatingAlliance();
        
        /**
         * True if has "OperatingAlliance" element
         */
        boolean isSetOperatingAlliance();
        
        /**
         * Sets the "OperatingAlliance" element
         */
        void setOperatingAlliance(java.lang.String operatingAlliance);
        
        /**
         * Sets (as xml) the "OperatingAlliance" element
         */
        void xsetOperatingAlliance(org.iata.iata.x2007.x00.IATACodeType operatingAlliance);
        
        /**
         * Nils the "OperatingAlliance" element
         */
        void setNilOperatingAlliance();
        
        /**
         * Unsets the "OperatingAlliance" element
         */
        void unsetOperatingAlliance();
        
        /**
         * Gets the "ServiceType" element
         */
        java.lang.String getServiceType();
        
        /**
         * Gets (as xml) the "ServiceType" element
         */
        org.iata.iata.x2007.x00.ServiceType xgetServiceType();
        
        /**
         * Tests for nil "ServiceType" element
         */
        boolean isNilServiceType();
        
        /**
         * True if has "ServiceType" element
         */
        boolean isSetServiceType();
        
        /**
         * Sets the "ServiceType" element
         */
        void setServiceType(java.lang.String serviceType);
        
        /**
         * Sets (as xml) the "ServiceType" element
         */
        void xsetServiceType(org.iata.iata.x2007.x00.ServiceType serviceType);
        
        /**
         * Nils the "ServiceType" element
         */
        void setNilServiceType();
        
        /**
         * Unsets the "ServiceType" element
         */
        void unsetServiceType();
        
        /**
         * Gets the "TechnicalStopInd" element
         */
        boolean getTechnicalStopInd();
        
        /**
         * Gets (as xml) the "TechnicalStopInd" element
         */
        org.apache.xmlbeans.XmlBoolean xgetTechnicalStopInd();
        
        /**
         * Tests for nil "TechnicalStopInd" element
         */
        boolean isNilTechnicalStopInd();
        
        /**
         * True if has "TechnicalStopInd" element
         */
        boolean isSetTechnicalStopInd();
        
        /**
         * Sets the "TechnicalStopInd" element
         */
        void setTechnicalStopInd(boolean technicalStopInd);
        
        /**
         * Sets (as xml) the "TechnicalStopInd" element
         */
        void xsetTechnicalStopInd(org.apache.xmlbeans.XmlBoolean technicalStopInd);
        
        /**
         * Nils the "TechnicalStopInd" element
         */
        void setNilTechnicalStopInd();
        
        /**
         * Unsets the "TechnicalStopInd" element
         */
        void unsetTechnicalStopInd();
        
        /**
         * Gets the "DepSecurityCheckInd" element
         */
        boolean getDepSecurityCheckInd();
        
        /**
         * Gets (as xml) the "DepSecurityCheckInd" element
         */
        org.apache.xmlbeans.XmlBoolean xgetDepSecurityCheckInd();
        
        /**
         * Tests for nil "DepSecurityCheckInd" element
         */
        boolean isNilDepSecurityCheckInd();
        
        /**
         * True if has "DepSecurityCheckInd" element
         */
        boolean isSetDepSecurityCheckInd();
        
        /**
         * Sets the "DepSecurityCheckInd" element
         */
        void setDepSecurityCheckInd(boolean depSecurityCheckInd);
        
        /**
         * Sets (as xml) the "DepSecurityCheckInd" element
         */
        void xsetDepSecurityCheckInd(org.apache.xmlbeans.XmlBoolean depSecurityCheckInd);
        
        /**
         * Nils the "DepSecurityCheckInd" element
         */
        void setNilDepSecurityCheckInd();
        
        /**
         * Unsets the "DepSecurityCheckInd" element
         */
        void unsetDepSecurityCheckInd();
        
        /**
         * Gets the "ArrSecurityCheckInd" element
         */
        boolean getArrSecurityCheckInd();
        
        /**
         * Gets (as xml) the "ArrSecurityCheckInd" element
         */
        org.apache.xmlbeans.XmlBoolean xgetArrSecurityCheckInd();
        
        /**
         * Tests for nil "ArrSecurityCheckInd" element
         */
        boolean isNilArrSecurityCheckInd();
        
        /**
         * True if has "ArrSecurityCheckInd" element
         */
        boolean isSetArrSecurityCheckInd();
        
        /**
         * Sets the "ArrSecurityCheckInd" element
         */
        void setArrSecurityCheckInd(boolean arrSecurityCheckInd);
        
        /**
         * Sets (as xml) the "ArrSecurityCheckInd" element
         */
        void xsetArrSecurityCheckInd(org.apache.xmlbeans.XmlBoolean arrSecurityCheckInd);
        
        /**
         * Nils the "ArrSecurityCheckInd" element
         */
        void setNilArrSecurityCheckInd();
        
        /**
         * Unsets the "ArrSecurityCheckInd" element
         */
        void unsetArrSecurityCheckInd();
        
        /**
         * Gets the "EstFlightDuration" element
         */
        org.apache.xmlbeans.GDuration getEstFlightDuration();
        
        /**
         * Gets (as xml) the "EstFlightDuration" element
         */
        org.apache.xmlbeans.XmlDuration xgetEstFlightDuration();
        
        /**
         * Tests for nil "EstFlightDuration" element
         */
        boolean isNilEstFlightDuration();
        
        /**
         * True if has "EstFlightDuration" element
         */
        boolean isSetEstFlightDuration();
        
        /**
         * Sets the "EstFlightDuration" element
         */
        void setEstFlightDuration(org.apache.xmlbeans.GDuration estFlightDuration);
        
        /**
         * Sets (as xml) the "EstFlightDuration" element
         */
        void xsetEstFlightDuration(org.apache.xmlbeans.XmlDuration estFlightDuration);
        
        /**
         * Nils the "EstFlightDuration" element
         */
        void setNilEstFlightDuration();
        
        /**
         * Unsets the "EstFlightDuration" element
         */
        void unsetEstFlightDuration();
        
        /**
         * Gets the "OwnerAirline" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline getOwnerAirline();
        
        /**
         * Tests for nil "OwnerAirline" element
         */
        boolean isNilOwnerAirline();
        
        /**
         * True if has "OwnerAirline" element
         */
        boolean isSetOwnerAirline();
        
        /**
         * Sets the "OwnerAirline" element
         */
        void setOwnerAirline(org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline ownerAirline);
        
        /**
         * Appends and returns a new empty "OwnerAirline" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline addNewOwnerAirline();
        
        /**
         * Nils the "OwnerAirline" element
         */
        void setNilOwnerAirline();
        
        /**
         * Unsets the "OwnerAirline" element
         */
        void unsetOwnerAirline();
        
        /**
         * Gets array of all "PlannedArrivalAptHistory" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory[] getPlannedArrivalAptHistoryArray();
        
        /**
         * Gets ith "PlannedArrivalAptHistory" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory getPlannedArrivalAptHistoryArray(int i);
        
        /**
         * Tests for nil ith "PlannedArrivalAptHistory" element
         */
        boolean isNilPlannedArrivalAptHistoryArray(int i);
        
        /**
         * Returns number of "PlannedArrivalAptHistory" element
         */
        int sizeOfPlannedArrivalAptHistoryArray();
        
        /**
         * Sets array of all "PlannedArrivalAptHistory" element
         */
        void setPlannedArrivalAptHistoryArray(org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory[] plannedArrivalAptHistoryArray);
        
        /**
         * Sets ith "PlannedArrivalAptHistory" element
         */
        void setPlannedArrivalAptHistoryArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory plannedArrivalAptHistory);
        
        /**
         * Nils the ith "PlannedArrivalAptHistory" element
         */
        void setNilPlannedArrivalAptHistoryArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PlannedArrivalAptHistory" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory insertNewPlannedArrivalAptHistory(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PlannedArrivalAptHistory" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory addNewPlannedArrivalAptHistory();
        
        /**
         * Removes the ith "PlannedArrivalAptHistory" element
         */
        void removePlannedArrivalAptHistory(int i);
        
        /**
         * Gets array of all "SpecialEmphasis" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis[] getSpecialEmphasisArray();
        
        /**
         * Gets ith "SpecialEmphasis" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis getSpecialEmphasisArray(int i);
        
        /**
         * Tests for nil ith "SpecialEmphasis" element
         */
        boolean isNilSpecialEmphasisArray(int i);
        
        /**
         * Returns number of "SpecialEmphasis" element
         */
        int sizeOfSpecialEmphasisArray();
        
        /**
         * Sets array of all "SpecialEmphasis" element
         */
        void setSpecialEmphasisArray(org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis[] specialEmphasisArray);
        
        /**
         * Sets ith "SpecialEmphasis" element
         */
        void setSpecialEmphasisArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis specialEmphasis);
        
        /**
         * Nils the ith "SpecialEmphasis" element
         */
        void setNilSpecialEmphasisArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SpecialEmphasis" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis insertNewSpecialEmphasis(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SpecialEmphasis" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis addNewSpecialEmphasis();
        
        /**
         * Removes the ith "SpecialEmphasis" element
         */
        void removeSpecialEmphasis(int i);
        
        /**
         * Gets array of all "IrregularityDelay" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay[] getIrregularityDelayArray();
        
        /**
         * Gets ith "IrregularityDelay" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay getIrregularityDelayArray(int i);
        
        /**
         * Tests for nil ith "IrregularityDelay" element
         */
        boolean isNilIrregularityDelayArray(int i);
        
        /**
         * Returns number of "IrregularityDelay" element
         */
        int sizeOfIrregularityDelayArray();
        
        /**
         * Sets array of all "IrregularityDelay" element
         */
        void setIrregularityDelayArray(org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay[] irregularityDelayArray);
        
        /**
         * Sets ith "IrregularityDelay" element
         */
        void setIrregularityDelayArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay irregularityDelay);
        
        /**
         * Nils the ith "IrregularityDelay" element
         */
        void setNilIrregularityDelayArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IrregularityDelay" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay insertNewIrregularityDelay(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IrregularityDelay" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay addNewIrregularityDelay();
        
        /**
         * Removes the ith "IrregularityDelay" element
         */
        void removeIrregularityDelay(int i);
        
        /**
         * Gets array of all "CabinClass" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass[] getCabinClassArray();
        
        /**
         * Gets ith "CabinClass" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass getCabinClassArray(int i);
        
        /**
         * Returns number of "CabinClass" element
         */
        int sizeOfCabinClassArray();
        
        /**
         * Sets array of all "CabinClass" element
         */
        void setCabinClassArray(org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass[] cabinClassArray);
        
        /**
         * Sets ith "CabinClass" element
         */
        void setCabinClassArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass cabinClass);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CabinClass" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass insertNewCabinClass(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CabinClass" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass addNewCabinClass();
        
        /**
         * Removes the ith "CabinClass" element
         */
        void removeCabinClass(int i);
        
        /**
         * Gets array of all "SpecialCargo" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo[] getSpecialCargoArray();
        
        /**
         * Gets ith "SpecialCargo" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo getSpecialCargoArray(int i);
        
        /**
         * Tests for nil ith "SpecialCargo" element
         */
        boolean isNilSpecialCargoArray(int i);
        
        /**
         * Returns number of "SpecialCargo" element
         */
        int sizeOfSpecialCargoArray();
        
        /**
         * Sets array of all "SpecialCargo" element
         */
        void setSpecialCargoArray(org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo[] specialCargoArray);
        
        /**
         * Sets ith "SpecialCargo" element
         */
        void setSpecialCargoArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo specialCargo);
        
        /**
         * Nils the ith "SpecialCargo" element
         */
        void setNilSpecialCargoArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SpecialCargo" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo insertNewSpecialCargo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SpecialCargo" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo addNewSpecialCargo();
        
        /**
         * Removes the ith "SpecialCargo" element
         */
        void removeSpecialCargo(int i);
        
        /**
         * Gets array of all "CodeShareInfo" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo[] getCodeShareInfoArray();
        
        /**
         * Gets ith "CodeShareInfo" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo getCodeShareInfoArray(int i);
        
        /**
         * Tests for nil ith "CodeShareInfo" element
         */
        boolean isNilCodeShareInfoArray(int i);
        
        /**
         * Returns number of "CodeShareInfo" element
         */
        int sizeOfCodeShareInfoArray();
        
        /**
         * Sets array of all "CodeShareInfo" element
         */
        void setCodeShareInfoArray(org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo[] codeShareInfoArray);
        
        /**
         * Sets ith "CodeShareInfo" element
         */
        void setCodeShareInfoArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo codeShareInfo);
        
        /**
         * Nils the ith "CodeShareInfo" element
         */
        void setNilCodeShareInfoArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CodeShareInfo" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo insertNewCodeShareInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CodeShareInfo" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo addNewCodeShareInfo();
        
        /**
         * Removes the ith "CodeShareInfo" element
         */
        void removeCodeShareInfo(int i);
        
        /**
         * Gets array of all "AssociatedFlightLegAircraft" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft[] getAssociatedFlightLegAircraftArray();
        
        /**
         * Gets ith "AssociatedFlightLegAircraft" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft getAssociatedFlightLegAircraftArray(int i);
        
        /**
         * Tests for nil ith "AssociatedFlightLegAircraft" element
         */
        boolean isNilAssociatedFlightLegAircraftArray(int i);
        
        /**
         * Returns number of "AssociatedFlightLegAircraft" element
         */
        int sizeOfAssociatedFlightLegAircraftArray();
        
        /**
         * Sets array of all "AssociatedFlightLegAircraft" element
         */
        void setAssociatedFlightLegAircraftArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft[] associatedFlightLegAircraftArray);
        
        /**
         * Sets ith "AssociatedFlightLegAircraft" element
         */
        void setAssociatedFlightLegAircraftArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft associatedFlightLegAircraft);
        
        /**
         * Nils the ith "AssociatedFlightLegAircraft" element
         */
        void setNilAssociatedFlightLegAircraftArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AssociatedFlightLegAircraft" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft insertNewAssociatedFlightLegAircraft(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AssociatedFlightLegAircraft" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft addNewAssociatedFlightLegAircraft();
        
        /**
         * Removes the ith "AssociatedFlightLegAircraft" element
         */
        void removeAssociatedFlightLegAircraft(int i);
        
        /**
         * Gets array of all "AssociatedFlightLegSchedule" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule[] getAssociatedFlightLegScheduleArray();
        
        /**
         * Gets ith "AssociatedFlightLegSchedule" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule getAssociatedFlightLegScheduleArray(int i);
        
        /**
         * Tests for nil ith "AssociatedFlightLegSchedule" element
         */
        boolean isNilAssociatedFlightLegScheduleArray(int i);
        
        /**
         * Returns number of "AssociatedFlightLegSchedule" element
         */
        int sizeOfAssociatedFlightLegScheduleArray();
        
        /**
         * Sets array of all "AssociatedFlightLegSchedule" element
         */
        void setAssociatedFlightLegScheduleArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule[] associatedFlightLegScheduleArray);
        
        /**
         * Sets ith "AssociatedFlightLegSchedule" element
         */
        void setAssociatedFlightLegScheduleArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule associatedFlightLegSchedule);
        
        /**
         * Nils the ith "AssociatedFlightLegSchedule" element
         */
        void setNilAssociatedFlightLegScheduleArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AssociatedFlightLegSchedule" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule insertNewAssociatedFlightLegSchedule(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AssociatedFlightLegSchedule" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule addNewAssociatedFlightLegSchedule();
        
        /**
         * Removes the ith "AssociatedFlightLegSchedule" element
         */
        void removeAssociatedFlightLegSchedule(int i);
        
        /**
         * Gets array of all "RemarkTextCode" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode[] getRemarkTextCodeArray();
        
        /**
         * Gets ith "RemarkTextCode" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode getRemarkTextCodeArray(int i);
        
        /**
         * Tests for nil ith "RemarkTextCode" element
         */
        boolean isNilRemarkTextCodeArray(int i);
        
        /**
         * Returns number of "RemarkTextCode" element
         */
        int sizeOfRemarkTextCodeArray();
        
        /**
         * Sets array of all "RemarkTextCode" element
         */
        void setRemarkTextCodeArray(org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode[] remarkTextCodeArray);
        
        /**
         * Sets ith "RemarkTextCode" element
         */
        void setRemarkTextCodeArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode remarkTextCode);
        
        /**
         * Nils the ith "RemarkTextCode" element
         */
        void setNilRemarkTextCodeArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RemarkTextCode" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode insertNewRemarkTextCode(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RemarkTextCode" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode addNewRemarkTextCode();
        
        /**
         * Removes the ith "RemarkTextCode" element
         */
        void removeRemarkTextCode(int i);
        
        /**
         * Gets the "RemarkFreeText" element
         */
        java.lang.String getRemarkFreeText();
        
        /**
         * Gets (as xml) the "RemarkFreeText" element
         */
        org.apache.xmlbeans.XmlString xgetRemarkFreeText();
        
        /**
         * Tests for nil "RemarkFreeText" element
         */
        boolean isNilRemarkFreeText();
        
        /**
         * True if has "RemarkFreeText" element
         */
        boolean isSetRemarkFreeText();
        
        /**
         * Sets the "RemarkFreeText" element
         */
        void setRemarkFreeText(java.lang.String remarkFreeText);
        
        /**
         * Sets (as xml) the "RemarkFreeText" element
         */
        void xsetRemarkFreeText(org.apache.xmlbeans.XmlString remarkFreeText);
        
        /**
         * Nils the "RemarkFreeText" element
         */
        void setNilRemarkFreeText();
        
        /**
         * Unsets the "RemarkFreeText" element
         */
        void unsetRemarkFreeText();
        
        /**
         * Gets array of all "AirportResources" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources[] getAirportResourcesArray();
        
        /**
         * Gets ith "AirportResources" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources getAirportResourcesArray(int i);
        
        /**
         * Returns number of "AirportResources" element
         */
        int sizeOfAirportResourcesArray();
        
        /**
         * Sets array of all "AirportResources" element
         */
        void setAirportResourcesArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources[] airportResourcesArray);
        
        /**
         * Sets ith "AirportResources" element
         */
        void setAirportResourcesArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources airportResources);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AirportResources" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources insertNewAirportResources(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AirportResources" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources addNewAirportResources();
        
        /**
         * Removes the ith "AirportResources" element
         */
        void removeAirportResources(int i);
        
        /**
         * Gets array of all "OperationTime" elements
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime[] getOperationTimeArray();
        
        /**
         * Gets ith "OperationTime" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime getOperationTimeArray(int i);
        
        /**
         * Tests for nil ith "OperationTime" element
         */
        boolean isNilOperationTimeArray(int i);
        
        /**
         * Returns number of "OperationTime" element
         */
        int sizeOfOperationTimeArray();
        
        /**
         * Sets array of all "OperationTime" element
         */
        void setOperationTimeArray(org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime[] operationTimeArray);
        
        /**
         * Sets ith "OperationTime" element
         */
        void setOperationTimeArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime operationTime);
        
        /**
         * Nils the ith "OperationTime" element
         */
        void setNilOperationTimeArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OperationTime" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime insertNewOperationTime(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OperationTime" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime addNewOperationTime();
        
        /**
         * Removes the ith "OperationTime" element
         */
        void removeOperationTime(int i);
        
        /**
         * Gets the "AircraftInfo" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo getAircraftInfo();
        
        /**
         * True if has "AircraftInfo" element
         */
        boolean isSetAircraftInfo();
        
        /**
         * Sets the "AircraftInfo" element
         */
        void setAircraftInfo(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo aircraftInfo);
        
        /**
         * Appends and returns a new empty "AircraftInfo" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo addNewAircraftInfo();
        
        /**
         * Unsets the "AircraftInfo" element
         */
        void unsetAircraftInfo();
        
        /**
         * Gets the "ClearanceAgreement" element
         */
        java.lang.String getClearanceAgreement();
        
        /**
         * Gets (as xml) the "ClearanceAgreement" element
         */
        org.iata.iata.x2007.x00.IATACodeType xgetClearanceAgreement();
        
        /**
         * True if has "ClearanceAgreement" element
         */
        boolean isSetClearanceAgreement();
        
        /**
         * Sets the "ClearanceAgreement" element
         */
        void setClearanceAgreement(java.lang.String clearanceAgreement);
        
        /**
         * Sets (as xml) the "ClearanceAgreement" element
         */
        void xsetClearanceAgreement(org.iata.iata.x2007.x00.IATACodeType clearanceAgreement);
        
        /**
         * Unsets the "ClearanceAgreement" element
         */
        void unsetClearanceAgreement();
        
        /**
         * Gets the "PublicFlightDisplay" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay getPublicFlightDisplay();
        
        /**
         * True if has "PublicFlightDisplay" element
         */
        boolean isSetPublicFlightDisplay();
        
        /**
         * Sets the "PublicFlightDisplay" element
         */
        void setPublicFlightDisplay(org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay publicFlightDisplay);
        
        /**
         * Appends and returns a new empty "PublicFlightDisplay" element
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay addNewPublicFlightDisplay();
        
        /**
         * Unsets the "PublicFlightDisplay" element
         */
        void unsetPublicFlightDisplay();
        
        /**
         * Gets the "FlightClassification" attribute
         */
        java.lang.String getFlightClassification();
        
        /**
         * Gets (as xml) the "FlightClassification" attribute
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification xgetFlightClassification();
        
        /**
         * True if has "FlightClassification" attribute
         */
        boolean isSetFlightClassification();
        
        /**
         * Sets the "FlightClassification" attribute
         */
        void setFlightClassification(java.lang.String flightClassification);
        
        /**
         * Sets (as xml) the "FlightClassification" attribute
         */
        void xsetFlightClassification(org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification flightClassification);
        
        /**
         * Unsets the "FlightClassification" attribute
         */
        void unsetFlightClassification();
        
        /**
         * Gets the "InternationalStatus" attribute
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus.Enum getInternationalStatus();
        
        /**
         * Gets (as xml) the "InternationalStatus" attribute
         */
        org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus xgetInternationalStatus();
        
        /**
         * True if has "InternationalStatus" attribute
         */
        boolean isSetInternationalStatus();
        
        /**
         * Sets the "InternationalStatus" attribute
         */
        void setInternationalStatus(org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus.Enum internationalStatus);
        
        /**
         * Sets (as xml) the "InternationalStatus" attribute
         */
        void xsetInternationalStatus(org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus internationalStatus);
        
        /**
         * Unsets the "InternationalStatus" attribute
         */
        void unsetInternationalStatus();
        
        /**
         * An XML OperationalStatus(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$OperationalStatus.
         */
        public interface OperationalStatus extends org.iata.iata.x2007.x00.IATACodeType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationalStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("operationalstatus8188elemtype");
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * Gets the "CodeContext" attribute
             */
            java.lang.String getCodeContext();
            
            /**
             * Gets (as xml) the "CodeContext" attribute
             */
            org.apache.xmlbeans.XmlString xgetCodeContext();
            
            /**
             * True if has "CodeContext" attribute
             */
            boolean isSetCodeContext();
            
            /**
             * Sets the "CodeContext" attribute
             */
            void setCodeContext(java.lang.String codeContext);
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            void xsetCodeContext(org.apache.xmlbeans.XmlString codeContext);
            
            /**
             * Unsets the "CodeContext" attribute
             */
            void unsetCodeContext();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML PublicStatus(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$PublicStatus.
         */
        public interface PublicStatus extends org.iata.iata.x2007.x00.IATACodeType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PublicStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("publicstatus7961elemtype");
            
            /**
             * Gets the "CodeContext" attribute
             */
            java.lang.String getCodeContext();
            
            /**
             * Gets (as xml) the "CodeContext" attribute
             */
            org.apache.xmlbeans.XmlString xgetCodeContext();
            
            /**
             * True if has "CodeContext" attribute
             */
            boolean isSetCodeContext();
            
            /**
             * Sets the "CodeContext" attribute
             */
            void setCodeContext(java.lang.String codeContext);
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            void xsetCodeContext(org.apache.xmlbeans.XmlString codeContext);
            
            /**
             * Unsets the "CodeContext" attribute
             */
            void unsetCodeContext();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML OwnerAirline(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public interface OwnerAirline extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OwnerAirline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("ownerairline4911elemtype");
            
            /**
             * Gets the "Airline" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline getAirline();
            
            /**
             * Sets the "Airline" element
             */
            void setAirline(org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline airline);
            
            /**
             * Appends and returns a new empty "Airline" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline addNewAirline();
            
            /**
             * Gets the "FlightNumber" element
             */
            java.lang.String getFlightNumber();
            
            /**
             * Gets (as xml) the "FlightNumber" element
             */
            org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumber();
            
            /**
             * True if has "FlightNumber" element
             */
            boolean isSetFlightNumber();
            
            /**
             * Sets the "FlightNumber" element
             */
            void setFlightNumber(java.lang.String flightNumber);
            
            /**
             * Sets (as xml) the "FlightNumber" element
             */
            void xsetFlightNumber(org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber);
            
            /**
             * Unsets the "FlightNumber" element
             */
            void unsetFlightNumber();
            
            /**
             * Gets the "OperationalSuffix" element
             */
            java.lang.String getOperationalSuffix();
            
            /**
             * Gets (as xml) the "OperationalSuffix" element
             */
            org.iata.iata.x2007.x00.OperationalSuffixType xgetOperationalSuffix();
            
            /**
             * Tests for nil "OperationalSuffix" element
             */
            boolean isNilOperationalSuffix();
            
            /**
             * True if has "OperationalSuffix" element
             */
            boolean isSetOperationalSuffix();
            
            /**
             * Sets the "OperationalSuffix" element
             */
            void setOperationalSuffix(java.lang.String operationalSuffix);
            
            /**
             * Sets (as xml) the "OperationalSuffix" element
             */
            void xsetOperationalSuffix(org.iata.iata.x2007.x00.OperationalSuffixType operationalSuffix);
            
            /**
             * Nils the "OperationalSuffix" element
             */
            void setNilOperationalSuffix();
            
            /**
             * Unsets the "OperationalSuffix" element
             */
            void unsetOperationalSuffix();
            
            /**
             * An XML Airline(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$OwnerAirline$Airline.
             */
            public interface Airline extends org.iata.iata.x2007.x00.AirlineType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Airline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airlinefd1belemtype");
                
                /**
                 * Gets the "CodeContext" attribute
                 */
                java.lang.String getCodeContext();
                
                /**
                 * Gets (as xml) the "CodeContext" attribute
                 */
                org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
                
                /**
                 * True if has "CodeContext" attribute
                 */
                boolean isSetCodeContext();
                
                /**
                 * Sets the "CodeContext" attribute
                 */
                void setCodeContext(java.lang.String codeContext);
                
                /**
                 * Sets (as xml) the "CodeContext" attribute
                 */
                void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
                
                /**
                 * Unsets the "CodeContext" attribute
                 */
                void unsetCodeContext();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.OwnerAirline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML PlannedArrivalAptHistory(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$PlannedArrivalAptHistory.
         */
        public interface PlannedArrivalAptHistory extends org.iata.iata.x2007.x00.StationType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PlannedArrivalAptHistory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("plannedarrivalapthistory7958elemtype");
            
            /**
             * Gets the "CodeContext" attribute
             */
            java.lang.String getCodeContext();
            
            /**
             * Gets (as xml) the "CodeContext" attribute
             */
            org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
            
            /**
             * True if has "CodeContext" attribute
             */
            boolean isSetCodeContext();
            
            /**
             * Sets the "CodeContext" attribute
             */
            void setCodeContext(java.lang.String codeContext);
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
            
            /**
             * Unsets the "CodeContext" attribute
             */
            void unsetCodeContext();
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.PlannedArrivalAptHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML SpecialEmphasis(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$SpecialEmphasis.
         */
        public interface SpecialEmphasis extends org.iata.iata.x2007.x00.IATACodeType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpecialEmphasis.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("specialemphasis4df7elemtype");
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialEmphasis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML IrregularityDelay(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public interface IrregularityDelay extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IrregularityDelay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("irregularitydelaye0a4elemtype");
            
            /**
             * Gets the "ReasonCode" element
             */
            java.lang.String getReasonCode();
            
            /**
             * Gets (as xml) the "ReasonCode" element
             */
            org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 xgetReasonCode();
            
            /**
             * Sets the "ReasonCode" element
             */
            void setReasonCode(java.lang.String reasonCode);
            
            /**
             * Sets (as xml) the "ReasonCode" element
             */
            void xsetReasonCode(org.iata.iata.x2007.x00.AlphaNumericStringLength1To3 reasonCode);
            
            /**
             * Gets the "Duration" element
             */
            org.apache.xmlbeans.GDuration getDuration();
            
            /**
             * Gets (as xml) the "Duration" element
             */
            org.apache.xmlbeans.XmlDuration xgetDuration();
            
            /**
             * True if has "Duration" element
             */
            boolean isSetDuration();
            
            /**
             * Sets the "Duration" element
             */
            void setDuration(org.apache.xmlbeans.GDuration duration);
            
            /**
             * Sets (as xml) the "Duration" element
             */
            void xsetDuration(org.apache.xmlbeans.XmlDuration duration);
            
            /**
             * Unsets the "Duration" element
             */
            void unsetDuration();
            
            /**
             * Gets the "DepartureOrArrival" attribute
             */
            org.iata.iata.x2007.x00.DepartureArrivalType.Enum getDepartureOrArrival();
            
            /**
             * Gets (as xml) the "DepartureOrArrival" attribute
             */
            org.iata.iata.x2007.x00.DepartureArrivalType xgetDepartureOrArrival();
            
            /**
             * Sets the "DepartureOrArrival" attribute
             */
            void setDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType.Enum departureOrArrival);
            
            /**
             * Sets (as xml) the "DepartureOrArrival" attribute
             */
            void xsetDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType departureOrArrival);
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.IrregularityDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML CabinClass(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public interface CabinClass extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CabinClass.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("cabinclasseb8delemtype");
            
            /**
             * Gets array of all "InflightService" elements
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService[] getInflightServiceArray();
            
            /**
             * Gets ith "InflightService" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService getInflightServiceArray(int i);
            
            /**
             * Tests for nil ith "InflightService" element
             */
            boolean isNilInflightServiceArray(int i);
            
            /**
             * Returns number of "InflightService" element
             */
            int sizeOfInflightServiceArray();
            
            /**
             * Sets array of all "InflightService" element
             */
            void setInflightServiceArray(org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService[] inflightServiceArray);
            
            /**
             * Sets ith "InflightService" element
             */
            void setInflightServiceArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService inflightService);
            
            /**
             * Nils the ith "InflightService" element
             */
            void setNilInflightServiceArray(int i);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "InflightService" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService insertNewInflightService(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "InflightService" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService addNewInflightService();
            
            /**
             * Removes the ith "InflightService" element
             */
            void removeInflightService(int i);
            
            /**
             * Gets array of all "InflightMealService" elements
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService[] getInflightMealServiceArray();
            
            /**
             * Gets ith "InflightMealService" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService getInflightMealServiceArray(int i);
            
            /**
             * Tests for nil ith "InflightMealService" element
             */
            boolean isNilInflightMealServiceArray(int i);
            
            /**
             * Returns number of "InflightMealService" element
             */
            int sizeOfInflightMealServiceArray();
            
            /**
             * Sets array of all "InflightMealService" element
             */
            void setInflightMealServiceArray(org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService[] inflightMealServiceArray);
            
            /**
             * Sets ith "InflightMealService" element
             */
            void setInflightMealServiceArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService inflightMealService);
            
            /**
             * Nils the ith "InflightMealService" element
             */
            void setNilInflightMealServiceArray(int i);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "InflightMealService" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService insertNewInflightMealService(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "InflightMealService" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService addNewInflightMealService();
            
            /**
             * Removes the ith "InflightMealService" element
             */
            void removeInflightMealService(int i);
            
            /**
             * Gets array of all "PaxCount" elements
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount[] getPaxCountArray();
            
            /**
             * Gets ith "PaxCount" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount getPaxCountArray(int i);
            
            /**
             * Tests for nil ith "PaxCount" element
             */
            boolean isNilPaxCountArray(int i);
            
            /**
             * Returns number of "PaxCount" element
             */
            int sizeOfPaxCountArray();
            
            /**
             * Sets array of all "PaxCount" element
             */
            void setPaxCountArray(org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount[] paxCountArray);
            
            /**
             * Sets ith "PaxCount" element
             */
            void setPaxCountArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount paxCount);
            
            /**
             * Nils the ith "PaxCount" element
             */
            void setNilPaxCountArray(int i);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "PaxCount" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount insertNewPaxCount(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "PaxCount" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount addNewPaxCount();
            
            /**
             * Removes the ith "PaxCount" element
             */
            void removePaxCount(int i);
            
            /**
             * Gets the "SeatCapacity" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity getSeatCapacity();
            
            /**
             * Tests for nil "SeatCapacity" element
             */
            boolean isNilSeatCapacity();
            
            /**
             * True if has "SeatCapacity" element
             */
            boolean isSetSeatCapacity();
            
            /**
             * Sets the "SeatCapacity" element
             */
            void setSeatCapacity(org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity seatCapacity);
            
            /**
             * Appends and returns a new empty "SeatCapacity" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity addNewSeatCapacity();
            
            /**
             * Nils the "SeatCapacity" element
             */
            void setNilSeatCapacity();
            
            /**
             * Unsets the "SeatCapacity" element
             */
            void unsetSeatCapacity();
            
            /**
             * Gets the "Class" attribute
             */
            java.lang.String getClass1();
            
            /**
             * Gets (as xml) the "Class" attribute
             */
            org.iata.iata.x2007.x00.IATACodeType xgetClass1();
            
            /**
             * True if has "Class" attribute
             */
            boolean isSetClass1();
            
            /**
             * Sets the "Class" attribute
             */
            void setClass1(java.lang.String class1);
            
            /**
             * Sets (as xml) the "Class" attribute
             */
            void xsetClass1(org.iata.iata.x2007.x00.IATACodeType class1);
            
            /**
             * Unsets the "Class" attribute
             */
            void unsetClass1();
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * An XML InflightService(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$CabinClass$InflightService.
             */
            public interface InflightService extends org.iata.iata.x2007.x00.IATACodeType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InflightService.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("inflightservicefef9elemtype");
                
                /**
                 * Gets the "RepeatIndex" attribute
                 */
                int getRepeatIndex();
                
                /**
                 * Gets (as xml) the "RepeatIndex" attribute
                 */
                org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                
                /**
                 * True if has "RepeatIndex" attribute
                 */
                boolean isSetRepeatIndex();
                
                /**
                 * Sets the "RepeatIndex" attribute
                 */
                void setRepeatIndex(int repeatIndex);
                
                /**
                 * Sets (as xml) the "RepeatIndex" attribute
                 */
                void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                
                /**
                 * Unsets the "RepeatIndex" attribute
                 */
                void unsetRepeatIndex();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML InflightMealService(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$CabinClass$InflightMealService.
             */
            public interface InflightMealService extends org.iata.iata.x2007.x00.IATACodeType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InflightMealService.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("inflightmealservicecb36elemtype");
                
                /**
                 * Gets the "RepeatIndex" attribute
                 */
                int getRepeatIndex();
                
                /**
                 * Gets (as xml) the "RepeatIndex" attribute
                 */
                org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                
                /**
                 * True if has "RepeatIndex" attribute
                 */
                boolean isSetRepeatIndex();
                
                /**
                 * Sets the "RepeatIndex" attribute
                 */
                void setRepeatIndex(int repeatIndex);
                
                /**
                 * Sets (as xml) the "RepeatIndex" attribute
                 */
                void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                
                /**
                 * Unsets the "RepeatIndex" attribute
                 */
                void unsetRepeatIndex();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.InflightMealService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML PaxCount(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$CabinClass$PaxCount.
             */
            public interface PaxCount extends org.iata.iata.x2007.x00.Numeric0To999
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaxCount.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("paxcount7cf1elemtype");
                
                /**
                 * Gets the "Qualifier" attribute
                 */
                java.lang.String getQualifier();
                
                /**
                 * Gets (as xml) the "Qualifier" attribute
                 */
                org.iata.iata.x2007.x00.IATACodeType xgetQualifier();
                
                /**
                 * Sets the "Qualifier" attribute
                 */
                void setQualifier(java.lang.String qualifier);
                
                /**
                 * Sets (as xml) the "Qualifier" attribute
                 */
                void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier);
                
                /**
                 * Gets the "Usage" attribute
                 */
                org.iata.iata.x2007.x00.UsageType.Enum getUsage();
                
                /**
                 * Gets (as xml) the "Usage" attribute
                 */
                org.iata.iata.x2007.x00.UsageType xgetUsage();
                
                /**
                 * Sets the "Usage" attribute
                 */
                void setUsage(org.iata.iata.x2007.x00.UsageType.Enum usage);
                
                /**
                 * Sets (as xml) the "Usage" attribute
                 */
                void xsetUsage(org.iata.iata.x2007.x00.UsageType usage);
                
                /**
                 * Gets the "RepeatIndex" attribute
                 */
                int getRepeatIndex();
                
                /**
                 * Gets (as xml) the "RepeatIndex" attribute
                 */
                org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                
                /**
                 * True if has "RepeatIndex" attribute
                 */
                boolean isSetRepeatIndex();
                
                /**
                 * Sets the "RepeatIndex" attribute
                 */
                void setRepeatIndex(int repeatIndex);
                
                /**
                 * Sets (as xml) the "RepeatIndex" attribute
                 */
                void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                
                /**
                 * Unsets the "RepeatIndex" attribute
                 */
                void unsetRepeatIndex();
                
                /**
                 * Gets the "DestinationType" attribute
                 */
                org.iata.iata.x2007.x00.DestinationType.Enum getDestinationType();
                
                /**
                 * Gets (as xml) the "DestinationType" attribute
                 */
                org.iata.iata.x2007.x00.DestinationType xgetDestinationType();
                
                /**
                 * True if has "DestinationType" attribute
                 */
                boolean isSetDestinationType();
                
                /**
                 * Sets the "DestinationType" attribute
                 */
                void setDestinationType(org.iata.iata.x2007.x00.DestinationType.Enum destinationType);
                
                /**
                 * Sets (as xml) the "DestinationType" attribute
                 */
                void xsetDestinationType(org.iata.iata.x2007.x00.DestinationType destinationType);
                
                /**
                 * Unsets the "DestinationType" attribute
                 */
                void unsetDestinationType();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.PaxCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML SeatCapacity(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$CabinClass$SeatCapacity.
             */
            public interface SeatCapacity extends org.iata.iata.x2007.x00.Numeric0To999
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeatCapacity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("seatcapacity7328elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass.SeatCapacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.CabinClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML SpecialCargo(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$SpecialCargo.
         */
        public interface SpecialCargo extends org.iata.iata.x2007.x00.IATACodeType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpecialCargo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("specialcargo9599elemtype");
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.SpecialCargo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML CodeShareInfo(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public interface CodeShareInfo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodeShareInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("codeshareinfo20acelemtype");
            
            /**
             * Gets the "Airline" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline getAirline();
            
            /**
             * Sets the "Airline" element
             */
            void setAirline(org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline airline);
            
            /**
             * Appends and returns a new empty "Airline" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline addNewAirline();
            
            /**
             * Gets the "FlightNumber" element
             */
            java.lang.String getFlightNumber();
            
            /**
             * Gets (as xml) the "FlightNumber" element
             */
            org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumber();
            
            /**
             * True if has "FlightNumber" element
             */
            boolean isSetFlightNumber();
            
            /**
             * Sets the "FlightNumber" element
             */
            void setFlightNumber(java.lang.String flightNumber);
            
            /**
             * Sets (as xml) the "FlightNumber" element
             */
            void xsetFlightNumber(org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber);
            
            /**
             * Unsets the "FlightNumber" element
             */
            void unsetFlightNumber();
            
            /**
             * Gets the "OriginationDate" element
             */
            java.util.Calendar getOriginationDate();
            
            /**
             * Gets (as xml) the "OriginationDate" element
             */
            org.apache.xmlbeans.XmlDate xgetOriginationDate();
            
            /**
             * True if has "OriginationDate" element
             */
            boolean isSetOriginationDate();
            
            /**
             * Sets the "OriginationDate" element
             */
            void setOriginationDate(java.util.Calendar originationDate);
            
            /**
             * Sets (as xml) the "OriginationDate" element
             */
            void xsetOriginationDate(org.apache.xmlbeans.XmlDate originationDate);
            
            /**
             * Unsets the "OriginationDate" element
             */
            void unsetOriginationDate();
            
            /**
             * Gets the "SharedAlliance" element
             */
            java.util.List getSharedAlliance();
            
            /**
             * Gets (as xml) the "SharedAlliance" element
             */
            org.iata.iata.x2007.x00.ListOfIATACodeType xgetSharedAlliance();
            
            /**
             * True if has "SharedAlliance" element
             */
            boolean isSetSharedAlliance();
            
            /**
             * Sets the "SharedAlliance" element
             */
            void setSharedAlliance(java.util.List sharedAlliance);
            
            /**
             * Sets (as xml) the "SharedAlliance" element
             */
            void xsetSharedAlliance(org.iata.iata.x2007.x00.ListOfIATACodeType sharedAlliance);
            
            /**
             * Unsets the "SharedAlliance" element
             */
            void unsetSharedAlliance();
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * An XML Airline(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$CodeShareInfo$Airline.
             */
            public interface Airline extends org.iata.iata.x2007.x00.AirlineType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Airline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airlineede2elemtype");
                
                /**
                 * Gets the "CodeContext" attribute
                 */
                java.lang.String getCodeContext();
                
                /**
                 * Gets (as xml) the "CodeContext" attribute
                 */
                org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
                
                /**
                 * True if has "CodeContext" attribute
                 */
                boolean isSetCodeContext();
                
                /**
                 * Sets the "CodeContext" attribute
                 */
                void setCodeContext(java.lang.String codeContext);
                
                /**
                 * Sets (as xml) the "CodeContext" attribute
                 */
                void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
                
                /**
                 * Unsets the "CodeContext" attribute
                 */
                void unsetCodeContext();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo.Airline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.CodeShareInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML AssociatedFlightLegAircraft(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public interface AssociatedFlightLegAircraft extends org.iata.iata.x2007.x00.FlightLegIdentifierType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssociatedFlightLegAircraft.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("associatedflightlegaircrafte75eelemtype");
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegAircraft) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML AssociatedFlightLegSchedule(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public interface AssociatedFlightLegSchedule extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssociatedFlightLegSchedule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("associatedflightlegschedule173delemtype");
            
            /**
             * Gets the "DepartureAirport" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport getDepartureAirport();
            
            /**
             * Sets the "DepartureAirport" element
             */
            void setDepartureAirport(org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport departureAirport);
            
            /**
             * Appends and returns a new empty "DepartureAirport" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport addNewDepartureAirport();
            
            /**
             * Gets the "ArrivalAirport" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport getArrivalAirport();
            
            /**
             * Sets the "ArrivalAirport" element
             */
            void setArrivalAirport(org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport arrivalAirport);
            
            /**
             * Appends and returns a new empty "ArrivalAirport" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport addNewArrivalAirport();
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * An XML DepartureAirport(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AssociatedFlightLegSchedule$DepartureAirport.
             */
            public interface DepartureAirport extends org.iata.iata.x2007.x00.StationType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DepartureAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("departureairporte8aaelemtype");
                
                /**
                 * Gets the "CodeContext" attribute
                 */
                java.lang.String getCodeContext();
                
                /**
                 * Gets (as xml) the "CodeContext" attribute
                 */
                org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
                
                /**
                 * True if has "CodeContext" attribute
                 */
                boolean isSetCodeContext();
                
                /**
                 * Sets the "CodeContext" attribute
                 */
                void setCodeContext(java.lang.String codeContext);
                
                /**
                 * Sets (as xml) the "CodeContext" attribute
                 */
                void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
                
                /**
                 * Unsets the "CodeContext" attribute
                 */
                void unsetCodeContext();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ArrivalAirport(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AssociatedFlightLegSchedule$ArrivalAirport.
             */
            public interface ArrivalAirport extends org.iata.iata.x2007.x00.StationType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrivalAirport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("arrivalairportb9afelemtype");
                
                /**
                 * Gets the "CodeContext" attribute
                 */
                java.lang.String getCodeContext();
                
                /**
                 * Gets (as xml) the "CodeContext" attribute
                 */
                org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
                
                /**
                 * True if has "CodeContext" attribute
                 */
                boolean isSetCodeContext();
                
                /**
                 * Sets the "CodeContext" attribute
                 */
                void setCodeContext(java.lang.String codeContext);
                
                /**
                 * Sets (as xml) the "CodeContext" attribute
                 */
                void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
                
                /**
                 * Unsets the "CodeContext" attribute
                 */
                void unsetCodeContext();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.AssociatedFlightLegSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML RemarkTextCode(@http://www.iata.org/IATA/2007/00).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$RemarkTextCode.
         */
        public interface RemarkTextCode extends org.iata.iata.x2007.x00.IATACodeType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RemarkTextCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("remarktextcodee362elemtype");
            
            /**
             * Gets the "Qualifier" attribute
             */
            java.lang.String getQualifier();
            
            /**
             * Gets (as xml) the "Qualifier" attribute
             */
            org.iata.iata.x2007.x00.IATACodeType xgetQualifier();
            
            /**
             * Sets the "Qualifier" attribute
             */
            void setQualifier(java.lang.String qualifier);
            
            /**
             * Sets (as xml) the "Qualifier" attribute
             */
            void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier);
            
            /**
             * Gets the "CodeContext" attribute
             */
            java.lang.String getCodeContext();
            
            /**
             * Gets (as xml) the "CodeContext" attribute
             */
            org.apache.xmlbeans.XmlString xgetCodeContext();
            
            /**
             * Sets the "CodeContext" attribute
             */
            void setCodeContext(java.lang.String codeContext);
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            void xsetCodeContext(org.apache.xmlbeans.XmlString codeContext);
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.RemarkTextCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML AirportResources(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public interface AirportResources extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AirportResources.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airportresources2422elemtype");
            
            /**
             * Gets array of all "Resource" elements
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource[] getResourceArray();
            
            /**
             * Gets ith "Resource" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource getResourceArray(int i);
            
            /**
             * Returns number of "Resource" element
             */
            int sizeOfResourceArray();
            
            /**
             * Sets array of all "Resource" element
             */
            void setResourceArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource[] resourceArray);
            
            /**
             * Sets ith "Resource" element
             */
            void setResourceArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource resource);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Resource" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource insertNewResource(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Resource" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource addNewResource();
            
            /**
             * Removes the ith "Resource" element
             */
            void removeResource(int i);
            
            /**
             * Gets the "Usage" attribute
             */
            org.iata.iata.x2007.x00.UsageType.Enum getUsage();
            
            /**
             * Gets (as xml) the "Usage" attribute
             */
            org.iata.iata.x2007.x00.UsageType xgetUsage();
            
            /**
             * Sets the "Usage" attribute
             */
            void setUsage(org.iata.iata.x2007.x00.UsageType.Enum usage);
            
            /**
             * Sets (as xml) the "Usage" attribute
             */
            void xsetUsage(org.iata.iata.x2007.x00.UsageType usage);
            
            /**
             * An XML Resource(@http://www.iata.org/IATA/2007/00).
             *
             * This is a complex type.
             */
            public interface Resource extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("resourcec36celemtype");
                
                /**
                 * Gets the "AirportZone" element
                 */
                java.lang.String getAirportZone();
                
                /**
                 * Gets (as xml) the "AirportZone" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone xgetAirportZone();
                
                /**
                 * Tests for nil "AirportZone" element
                 */
                boolean isNilAirportZone();
                
                /**
                 * True if has "AirportZone" element
                 */
                boolean isSetAirportZone();
                
                /**
                 * Sets the "AirportZone" element
                 */
                void setAirportZone(java.lang.String airportZone);
                
                /**
                 * Sets (as xml) the "AirportZone" element
                 */
                void xsetAirportZone(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone airportZone);
                
                /**
                 * Nils the "AirportZone" element
                 */
                void setNilAirportZone();
                
                /**
                 * Unsets the "AirportZone" element
                 */
                void unsetAirportZone();
                
                /**
                 * Gets the "AircraftParkingPosition" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition getAircraftParkingPosition();
                
                /**
                 * Tests for nil "AircraftParkingPosition" element
                 */
                boolean isNilAircraftParkingPosition();
                
                /**
                 * True if has "AircraftParkingPosition" element
                 */
                boolean isSetAircraftParkingPosition();
                
                /**
                 * Sets the "AircraftParkingPosition" element
                 */
                void setAircraftParkingPosition(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition aircraftParkingPosition);
                
                /**
                 * Appends and returns a new empty "AircraftParkingPosition" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition addNewAircraftParkingPosition();
                
                /**
                 * Nils the "AircraftParkingPosition" element
                 */
                void setNilAircraftParkingPosition();
                
                /**
                 * Unsets the "AircraftParkingPosition" element
                 */
                void unsetAircraftParkingPosition();
                
                /**
                 * Gets array of all "PassengerGate" elements
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate[] getPassengerGateArray();
                
                /**
                 * Gets ith "PassengerGate" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate getPassengerGateArray(int i);
                
                /**
                 * Tests for nil ith "PassengerGate" element
                 */
                boolean isNilPassengerGateArray(int i);
                
                /**
                 * Returns number of "PassengerGate" element
                 */
                int sizeOfPassengerGateArray();
                
                /**
                 * Sets array of all "PassengerGate" element
                 */
                void setPassengerGateArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate[] passengerGateArray);
                
                /**
                 * Sets ith "PassengerGate" element
                 */
                void setPassengerGateArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate passengerGate);
                
                /**
                 * Nils the ith "PassengerGate" element
                 */
                void setNilPassengerGateArray(int i);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "PassengerGate" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate insertNewPassengerGate(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "PassengerGate" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate addNewPassengerGate();
                
                /**
                 * Removes the ith "PassengerGate" element
                 */
                void removePassengerGate(int i);
                
                /**
                 * Gets array of all "RemoteOperationalGate" elements
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate[] getRemoteOperationalGateArray();
                
                /**
                 * Gets ith "RemoteOperationalGate" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate getRemoteOperationalGateArray(int i);
                
                /**
                 * Tests for nil ith "RemoteOperationalGate" element
                 */
                boolean isNilRemoteOperationalGateArray(int i);
                
                /**
                 * Returns number of "RemoteOperationalGate" element
                 */
                int sizeOfRemoteOperationalGateArray();
                
                /**
                 * Sets array of all "RemoteOperationalGate" element
                 */
                void setRemoteOperationalGateArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate[] remoteOperationalGateArray);
                
                /**
                 * Sets ith "RemoteOperationalGate" element
                 */
                void setRemoteOperationalGateArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate remoteOperationalGate);
                
                /**
                 * Nils the ith "RemoteOperationalGate" element
                 */
                void setNilRemoteOperationalGateArray(int i);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "RemoteOperationalGate" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate insertNewRemoteOperationalGate(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "RemoteOperationalGate" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate addNewRemoteOperationalGate();
                
                /**
                 * Removes the ith "RemoteOperationalGate" element
                 */
                void removeRemoteOperationalGate(int i);
                
                /**
                 * Gets the "Runway" element
                 */
                java.lang.String getRunway();
                
                /**
                 * Gets (as xml) the "Runway" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway xgetRunway();
                
                /**
                 * Tests for nil "Runway" element
                 */
                boolean isNilRunway();
                
                /**
                 * True if has "Runway" element
                 */
                boolean isSetRunway();
                
                /**
                 * Sets the "Runway" element
                 */
                void setRunway(java.lang.String runway);
                
                /**
                 * Sets (as xml) the "Runway" element
                 */
                void xsetRunway(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway runway);
                
                /**
                 * Nils the "Runway" element
                 */
                void setNilRunway();
                
                /**
                 * Unsets the "Runway" element
                 */
                void unsetRunway();
                
                /**
                 * Gets the "AircraftTerminal" element
                 */
                java.lang.String getAircraftTerminal();
                
                /**
                 * Gets (as xml) the "AircraftTerminal" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal xgetAircraftTerminal();
                
                /**
                 * Tests for nil "AircraftTerminal" element
                 */
                boolean isNilAircraftTerminal();
                
                /**
                 * True if has "AircraftTerminal" element
                 */
                boolean isSetAircraftTerminal();
                
                /**
                 * Sets the "AircraftTerminal" element
                 */
                void setAircraftTerminal(java.lang.String aircraftTerminal);
                
                /**
                 * Sets (as xml) the "AircraftTerminal" element
                 */
                void xsetAircraftTerminal(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal aircraftTerminal);
                
                /**
                 * Nils the "AircraftTerminal" element
                 */
                void setNilAircraftTerminal();
                
                /**
                 * Unsets the "AircraftTerminal" element
                 */
                void unsetAircraftTerminal();
                
                /**
                 * Gets array of all "PublicTerminal" elements
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal[] getPublicTerminalArray();
                
                /**
                 * Gets ith "PublicTerminal" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal getPublicTerminalArray(int i);
                
                /**
                 * Tests for nil ith "PublicTerminal" element
                 */
                boolean isNilPublicTerminalArray(int i);
                
                /**
                 * Returns number of "PublicTerminal" element
                 */
                int sizeOfPublicTerminalArray();
                
                /**
                 * Sets array of all "PublicTerminal" element
                 */
                void setPublicTerminalArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal[] publicTerminalArray);
                
                /**
                 * Sets ith "PublicTerminal" element
                 */
                void setPublicTerminalArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal publicTerminal);
                
                /**
                 * Nils the ith "PublicTerminal" element
                 */
                void setNilPublicTerminalArray(int i);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "PublicTerminal" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal insertNewPublicTerminal(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "PublicTerminal" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal addNewPublicTerminal();
                
                /**
                 * Removes the ith "PublicTerminal" element
                 */
                void removePublicTerminal(int i);
                
                /**
                 * Gets the "CrewBusInd" element
                 */
                boolean getCrewBusInd();
                
                /**
                 * Gets (as xml) the "CrewBusInd" element
                 */
                org.apache.xmlbeans.XmlBoolean xgetCrewBusInd();
                
                /**
                 * Tests for nil "CrewBusInd" element
                 */
                boolean isNilCrewBusInd();
                
                /**
                 * True if has "CrewBusInd" element
                 */
                boolean isSetCrewBusInd();
                
                /**
                 * Sets the "CrewBusInd" element
                 */
                void setCrewBusInd(boolean crewBusInd);
                
                /**
                 * Sets (as xml) the "CrewBusInd" element
                 */
                void xsetCrewBusInd(org.apache.xmlbeans.XmlBoolean crewBusInd);
                
                /**
                 * Nils the "CrewBusInd" element
                 */
                void setNilCrewBusInd();
                
                /**
                 * Unsets the "CrewBusInd" element
                 */
                void unsetCrewBusInd();
                
                /**
                 * Gets the "PaxBusInd" element
                 */
                boolean getPaxBusInd();
                
                /**
                 * Gets (as xml) the "PaxBusInd" element
                 */
                org.apache.xmlbeans.XmlBoolean xgetPaxBusInd();
                
                /**
                 * Tests for nil "PaxBusInd" element
                 */
                boolean isNilPaxBusInd();
                
                /**
                 * True if has "PaxBusInd" element
                 */
                boolean isSetPaxBusInd();
                
                /**
                 * Sets the "PaxBusInd" element
                 */
                void setPaxBusInd(boolean paxBusInd);
                
                /**
                 * Sets (as xml) the "PaxBusInd" element
                 */
                void xsetPaxBusInd(org.apache.xmlbeans.XmlBoolean paxBusInd);
                
                /**
                 * Nils the "PaxBusInd" element
                 */
                void setNilPaxBusInd();
                
                /**
                 * Unsets the "PaxBusInd" element
                 */
                void unsetPaxBusInd();
                
                /**
                 * Gets array of all "BaggageClaimUnit" elements
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit[] getBaggageClaimUnitArray();
                
                /**
                 * Gets ith "BaggageClaimUnit" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit getBaggageClaimUnitArray(int i);
                
                /**
                 * Tests for nil ith "BaggageClaimUnit" element
                 */
                boolean isNilBaggageClaimUnitArray(int i);
                
                /**
                 * Returns number of "BaggageClaimUnit" element
                 */
                int sizeOfBaggageClaimUnitArray();
                
                /**
                 * Sets array of all "BaggageClaimUnit" element
                 */
                void setBaggageClaimUnitArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit[] baggageClaimUnitArray);
                
                /**
                 * Sets ith "BaggageClaimUnit" element
                 */
                void setBaggageClaimUnitArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit baggageClaimUnit);
                
                /**
                 * Nils the ith "BaggageClaimUnit" element
                 */
                void setNilBaggageClaimUnitArray(int i);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "BaggageClaimUnit" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit insertNewBaggageClaimUnit(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "BaggageClaimUnit" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit addNewBaggageClaimUnit();
                
                /**
                 * Removes the ith "BaggageClaimUnit" element
                 */
                void removeBaggageClaimUnit(int i);
                
                /**
                 * Gets array of all "BaggageMakeupBelt" elements
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt[] getBaggageMakeupBeltArray();
                
                /**
                 * Gets ith "BaggageMakeupBelt" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt getBaggageMakeupBeltArray(int i);
                
                /**
                 * Tests for nil ith "BaggageMakeupBelt" element
                 */
                boolean isNilBaggageMakeupBeltArray(int i);
                
                /**
                 * Returns number of "BaggageMakeupBelt" element
                 */
                int sizeOfBaggageMakeupBeltArray();
                
                /**
                 * Sets array of all "BaggageMakeupBelt" element
                 */
                void setBaggageMakeupBeltArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt[] baggageMakeupBeltArray);
                
                /**
                 * Sets ith "BaggageMakeupBelt" element
                 */
                void setBaggageMakeupBeltArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt baggageMakeupBelt);
                
                /**
                 * Nils the ith "BaggageMakeupBelt" element
                 */
                void setNilBaggageMakeupBeltArray(int i);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "BaggageMakeupBelt" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt insertNewBaggageMakeupBelt(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "BaggageMakeupBelt" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt addNewBaggageMakeupBelt();
                
                /**
                 * Removes the ith "BaggageMakeupBelt" element
                 */
                void removeBaggageMakeupBelt(int i);
                
                /**
                 * Gets array of all "CheckInInfo" elements
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo[] getCheckInInfoArray();
                
                /**
                 * Gets ith "CheckInInfo" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo getCheckInInfoArray(int i);
                
                /**
                 * Tests for nil ith "CheckInInfo" element
                 */
                boolean isNilCheckInInfoArray(int i);
                
                /**
                 * Returns number of "CheckInInfo" element
                 */
                int sizeOfCheckInInfoArray();
                
                /**
                 * Sets array of all "CheckInInfo" element
                 */
                void setCheckInInfoArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo[] checkInInfoArray);
                
                /**
                 * Sets ith "CheckInInfo" element
                 */
                void setCheckInInfoArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo checkInInfo);
                
                /**
                 * Nils the ith "CheckInInfo" element
                 */
                void setNilCheckInInfoArray(int i);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "CheckInInfo" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo insertNewCheckInInfo(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "CheckInInfo" element
                 */
                org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo addNewCheckInInfo();
                
                /**
                 * Removes the ith "CheckInInfo" element
                 */
                void removeCheckInInfo(int i);
                
                /**
                 * Gets the "PreClearedGateInd" element
                 */
                boolean getPreClearedGateInd();
                
                /**
                 * Gets (as xml) the "PreClearedGateInd" element
                 */
                org.apache.xmlbeans.XmlBoolean xgetPreClearedGateInd();
                
                /**
                 * Tests for nil "PreClearedGateInd" element
                 */
                boolean isNilPreClearedGateInd();
                
                /**
                 * True if has "PreClearedGateInd" element
                 */
                boolean isSetPreClearedGateInd();
                
                /**
                 * Sets the "PreClearedGateInd" element
                 */
                void setPreClearedGateInd(boolean preClearedGateInd);
                
                /**
                 * Sets (as xml) the "PreClearedGateInd" element
                 */
                void xsetPreClearedGateInd(org.apache.xmlbeans.XmlBoolean preClearedGateInd);
                
                /**
                 * Nils the "PreClearedGateInd" element
                 */
                void setNilPreClearedGateInd();
                
                /**
                 * Unsets the "PreClearedGateInd" element
                 */
                void unsetPreClearedGateInd();
                
                /**
                 * Gets the "DepartureOrArrival" attribute
                 */
                org.iata.iata.x2007.x00.DepartureArrivalType.Enum getDepartureOrArrival();
                
                /**
                 * Gets (as xml) the "DepartureOrArrival" attribute
                 */
                org.iata.iata.x2007.x00.DepartureArrivalType xgetDepartureOrArrival();
                
                /**
                 * Sets the "DepartureOrArrival" attribute
                 */
                void setDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType.Enum departureOrArrival);
                
                /**
                 * Sets (as xml) the "DepartureOrArrival" attribute
                 */
                void xsetDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType departureOrArrival);
                
                /**
                 * Gets the "ChargeType" attribute
                 */
                java.lang.String getChargeType();
                
                /**
                 * Gets (as xml) the "ChargeType" attribute
                 */
                org.iata.iata.x2007.x00.IATACodeType xgetChargeType();
                
                /**
                 * True if has "ChargeType" attribute
                 */
                boolean isSetChargeType();
                
                /**
                 * Sets the "ChargeType" attribute
                 */
                void setChargeType(java.lang.String chargeType);
                
                /**
                 * Sets (as xml) the "ChargeType" attribute
                 */
                void xsetChargeType(org.iata.iata.x2007.x00.IATACodeType chargeType);
                
                /**
                 * Unsets the "ChargeType" attribute
                 */
                void unsetChargeType();
                
                /**
                 * An XML AirportZone(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$AirportZone.
                 */
                public interface AirportZone extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AirportZone.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airportzonef969elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone newValue(java.lang.Object obj) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone) type.newValue( obj ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone newInstance() {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AirportZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML AircraftParkingPosition(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$AircraftParkingPosition.
                 */
                public interface AircraftParkingPosition extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AircraftParkingPosition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("aircraftparkingposition3bf5elemtype");
                    
                    /**
                     * Gets the "Qualifier" attribute
                     */
                    java.lang.String getQualifier();
                    
                    /**
                     * Gets (as xml) the "Qualifier" attribute
                     */
                    org.apache.xmlbeans.XmlNMTOKEN xgetQualifier();
                    
                    /**
                     * Sets the "Qualifier" attribute
                     */
                    void setQualifier(java.lang.String qualifier);
                    
                    /**
                     * Sets (as xml) the "Qualifier" attribute
                     */
                    void xsetQualifier(org.apache.xmlbeans.XmlNMTOKEN qualifier);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition newInstance() {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML PassengerGate(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$PassengerGate.
                 */
                public interface PassengerGate extends org.iata.iata.x2007.x00.StringLength0To5
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PassengerGate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("passengergate51bbelemtype");
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    int getRepeatIndex();
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    boolean isSetRepeatIndex();
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    void setRepeatIndex(int repeatIndex);
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    void unsetRepeatIndex();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate newInstance() {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PassengerGate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML RemoteOperationalGate(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$RemoteOperationalGate.
                 */
                public interface RemoteOperationalGate extends org.iata.iata.x2007.x00.StringLength0To5
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RemoteOperationalGate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("remoteoperationalgate63e9elemtype");
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    int getRepeatIndex();
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    boolean isSetRepeatIndex();
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    void setRepeatIndex(int repeatIndex);
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    void unsetRepeatIndex();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate newInstance() {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Runway(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$Runway.
                 */
                public interface Runway extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Runway.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("runwayc82celemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway newValue(java.lang.Object obj) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway) type.newValue( obj ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway newInstance() {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.Runway) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML AircraftTerminal(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$AircraftTerminal.
                 */
                public interface AircraftTerminal extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AircraftTerminal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("aircraftterminala6beelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal newValue(java.lang.Object obj) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal) type.newValue( obj ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal newInstance() {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.AircraftTerminal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML PublicTerminal(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$PublicTerminal.
                 */
                public interface PublicTerminal extends org.iata.iata.x2007.x00.StringLength0To2
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PublicTerminal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("publicterminal1bcbelemtype");
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    int getRepeatIndex();
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    boolean isSetRepeatIndex();
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    void setRepeatIndex(int repeatIndex);
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    void unsetRepeatIndex();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal newInstance() {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.PublicTerminal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML BaggageClaimUnit(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$BaggageClaimUnit.
                 */
                public interface BaggageClaimUnit extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaggageClaimUnit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("baggageclaimunit65b0elemtype");
                    
                    /**
                     * Gets the "Qualifier" attribute
                     */
                    java.lang.String getQualifier();
                    
                    /**
                     * Gets (as xml) the "Qualifier" attribute
                     */
                    org.iata.iata.x2007.x00.IATACodeType xgetQualifier();
                    
                    /**
                     * True if has "Qualifier" attribute
                     */
                    boolean isSetQualifier();
                    
                    /**
                     * Sets the "Qualifier" attribute
                     */
                    void setQualifier(java.lang.String qualifier);
                    
                    /**
                     * Sets (as xml) the "Qualifier" attribute
                     */
                    void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier);
                    
                    /**
                     * Unsets the "Qualifier" attribute
                     */
                    void unsetQualifier();
                    
                    /**
                     * Gets the "AreaLocation" attribute
                     */
                    java.lang.String getAreaLocation();
                    
                    /**
                     * Gets (as xml) the "AreaLocation" attribute
                     */
                    org.iata.iata.x2007.x00.IATACodeType xgetAreaLocation();
                    
                    /**
                     * True if has "AreaLocation" attribute
                     */
                    boolean isSetAreaLocation();
                    
                    /**
                     * Sets the "AreaLocation" attribute
                     */
                    void setAreaLocation(java.lang.String areaLocation);
                    
                    /**
                     * Sets (as xml) the "AreaLocation" attribute
                     */
                    void xsetAreaLocation(org.iata.iata.x2007.x00.IATACodeType areaLocation);
                    
                    /**
                     * Unsets the "AreaLocation" attribute
                     */
                    void unsetAreaLocation();
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    int getRepeatIndex();
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    boolean isSetRepeatIndex();
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    void setRepeatIndex(int repeatIndex);
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    void unsetRepeatIndex();
                    
                    /**
                     * Gets the "ServiceClass" attribute
                     */
                    java.lang.String getServiceClass();
                    
                    /**
                     * Gets (as xml) the "ServiceClass" attribute
                     */
                    org.iata.iata.x2007.x00.IATACodeType xgetServiceClass();
                    
                    /**
                     * True if has "ServiceClass" attribute
                     */
                    boolean isSetServiceClass();
                    
                    /**
                     * Sets the "ServiceClass" attribute
                     */
                    void setServiceClass(java.lang.String serviceClass);
                    
                    /**
                     * Sets (as xml) the "ServiceClass" attribute
                     */
                    void xsetServiceClass(org.iata.iata.x2007.x00.IATACodeType serviceClass);
                    
                    /**
                     * Unsets the "ServiceClass" attribute
                     */
                    void unsetServiceClass();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit newInstance() {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML BaggageMakeupBelt(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AirportResources$Resource$BaggageMakeupBelt.
                 */
                public interface BaggageMakeupBelt extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaggageMakeupBelt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("baggagemakeupbeltd80celemtype");
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    int getRepeatIndex();
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    boolean isSetRepeatIndex();
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    void setRepeatIndex(int repeatIndex);
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    void unsetRepeatIndex();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt newInstance() {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CheckInInfo(@http://www.iata.org/IATA/2007/00).
                 *
                 * This is a complex type.
                 */
                public interface CheckInInfo extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckInInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("checkininfob665elemtype");
                    
                    /**
                     * Gets the "FirstPosition" element
                     */
                    java.lang.String getFirstPosition();
                    
                    /**
                     * Gets (as xml) the "FirstPosition" element
                     */
                    org.iata.iata.x2007.x00.StringLength0To15 xgetFirstPosition();
                    
                    /**
                     * True if has "FirstPosition" element
                     */
                    boolean isSetFirstPosition();
                    
                    /**
                     * Sets the "FirstPosition" element
                     */
                    void setFirstPosition(java.lang.String firstPosition);
                    
                    /**
                     * Sets (as xml) the "FirstPosition" element
                     */
                    void xsetFirstPosition(org.iata.iata.x2007.x00.StringLength0To15 firstPosition);
                    
                    /**
                     * Unsets the "FirstPosition" element
                     */
                    void unsetFirstPosition();
                    
                    /**
                     * Gets the "LastPosition" element
                     */
                    java.lang.String getLastPosition();
                    
                    /**
                     * Gets (as xml) the "LastPosition" element
                     */
                    org.iata.iata.x2007.x00.StringLength0To15 xgetLastPosition();
                    
                    /**
                     * True if has "LastPosition" element
                     */
                    boolean isSetLastPosition();
                    
                    /**
                     * Sets the "LastPosition" element
                     */
                    void setLastPosition(java.lang.String lastPosition);
                    
                    /**
                     * Sets (as xml) the "LastPosition" element
                     */
                    void xsetLastPosition(org.iata.iata.x2007.x00.StringLength0To15 lastPosition);
                    
                    /**
                     * Unsets the "LastPosition" element
                     */
                    void unsetLastPosition();
                    
                    /**
                     * Gets the "Qualifier" attribute
                     */
                    java.lang.String getQualifier();
                    
                    /**
                     * Gets (as xml) the "Qualifier" attribute
                     */
                    org.iata.iata.x2007.x00.IATACodeType xgetQualifier();
                    
                    /**
                     * True if has "Qualifier" attribute
                     */
                    boolean isSetQualifier();
                    
                    /**
                     * Sets the "Qualifier" attribute
                     */
                    void setQualifier(java.lang.String qualifier);
                    
                    /**
                     * Sets (as xml) the "Qualifier" attribute
                     */
                    void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier);
                    
                    /**
                     * Unsets the "Qualifier" attribute
                     */
                    void unsetQualifier();
                    
                    /**
                     * Gets the "Location" attribute
                     */
                    java.lang.String getLocation();
                    
                    /**
                     * Gets (as xml) the "Location" attribute
                     */
                    org.iata.iata.x2007.x00.IATACodeType xgetLocation();
                    
                    /**
                     * True if has "Location" attribute
                     */
                    boolean isSetLocation();
                    
                    /**
                     * Sets the "Location" attribute
                     */
                    void setLocation(java.lang.String location);
                    
                    /**
                     * Sets (as xml) the "Location" attribute
                     */
                    void xsetLocation(org.iata.iata.x2007.x00.IATACodeType location);
                    
                    /**
                     * Unsets the "Location" attribute
                     */
                    void unsetLocation();
                    
                    /**
                     * Gets the "Class" attribute
                     */
                    java.lang.String getClass1();
                    
                    /**
                     * Gets (as xml) the "Class" attribute
                     */
                    org.iata.iata.x2007.x00.IATACodeType xgetClass1();
                    
                    /**
                     * True if has "Class" attribute
                     */
                    boolean isSetClass1();
                    
                    /**
                     * Sets the "Class" attribute
                     */
                    void setClass1(java.lang.String class1);
                    
                    /**
                     * Sets (as xml) the "Class" attribute
                     */
                    void xsetClass1(org.iata.iata.x2007.x00.IATACodeType class1);
                    
                    /**
                     * Unsets the "Class" attribute
                     */
                    void unsetClass1();
                    
                    /**
                     * Gets the "RepeatIndex" attribute
                     */
                    int getRepeatIndex();
                    
                    /**
                     * Gets (as xml) the "RepeatIndex" attribute
                     */
                    org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                    
                    /**
                     * True if has "RepeatIndex" attribute
                     */
                    boolean isSetRepeatIndex();
                    
                    /**
                     * Sets the "RepeatIndex" attribute
                     */
                    void setRepeatIndex(int repeatIndex);
                    
                    /**
                     * Sets (as xml) the "RepeatIndex" attribute
                     */
                    void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                    
                    /**
                     * Unsets the "RepeatIndex" attribute
                     */
                    void unsetRepeatIndex();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo newInstance() {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource.CheckInInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.AirportResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
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
        public interface OperationTime extends org.iata.iata.x2007.x00.DateOrTimeOrDateTimeType
        {
            java.lang.Object getObjectValue();
            void setObjectValue(java.lang.Object val);
            /** @deprecated */
            java.lang.Object objectValue();
            /** @deprecated */
            void objectSet(java.lang.Object val);
            org.apache.xmlbeans.SchemaType instanceType();
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationTime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("operationtime8118elemtype");
            
            /**
             * Gets the "OperationQualifier" attribute
             */
            java.lang.String getOperationQualifier();
            
            /**
             * Gets (as xml) the "OperationQualifier" attribute
             */
            org.iata.iata.x2007.x00.IATACodeType xgetOperationQualifier();
            
            /**
             * Sets the "OperationQualifier" attribute
             */
            void setOperationQualifier(java.lang.String operationQualifier);
            
            /**
             * Sets (as xml) the "OperationQualifier" attribute
             */
            void xsetOperationQualifier(org.iata.iata.x2007.x00.IATACodeType operationQualifier);
            
            /**
             * Gets the "CodeContext" attribute
             */
            java.lang.String getCodeContext();
            
            /**
             * Gets (as xml) the "CodeContext" attribute
             */
            org.apache.xmlbeans.XmlString xgetCodeContext();
            
            /**
             * Sets the "CodeContext" attribute
             */
            void setCodeContext(java.lang.String codeContext);
            
            /**
             * Sets (as xml) the "CodeContext" attribute
             */
            void xsetCodeContext(org.apache.xmlbeans.XmlString codeContext);
            
            /**
             * Gets the "RepeatIndex" attribute
             */
            int getRepeatIndex();
            
            /**
             * Gets (as xml) the "RepeatIndex" attribute
             */
            org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
            
            /**
             * True if has "RepeatIndex" attribute
             */
            boolean isSetRepeatIndex();
            
            /**
             * Sets the "RepeatIndex" attribute
             */
            void setRepeatIndex(int repeatIndex);
            
            /**
             * Sets (as xml) the "RepeatIndex" attribute
             */
            void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
            
            /**
             * Unsets the "RepeatIndex" attribute
             */
            void unsetRepeatIndex();
            
            /**
             * Gets the "TimeType" attribute
             */
            java.lang.String getTimeType();
            
            /**
             * Gets (as xml) the "TimeType" attribute
             */
            org.iata.iata.x2007.x00.IATACodeType xgetTimeType();
            
            /**
             * True if has "TimeType" attribute
             */
            boolean isSetTimeType();
            
            /**
             * Sets the "TimeType" attribute
             */
            void setTimeType(java.lang.String timeType);
            
            /**
             * Sets (as xml) the "TimeType" attribute
             */
            void xsetTimeType(org.iata.iata.x2007.x00.IATACodeType timeType);
            
            /**
             * Unsets the "TimeType" attribute
             */
            void unsetTimeType();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML AircraftInfo(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public interface AircraftInfo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AircraftInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("aircraftinfo2298elemtype");
            
            /**
             * Gets the "AircraftType" element
             */
            java.lang.String getAircraftType();
            
            /**
             * Gets (as xml) the "AircraftType" element
             */
            org.iata.iata.x2007.x00.AirEquipType xgetAircraftType();
            
            /**
             * Tests for nil "AircraftType" element
             */
            boolean isNilAircraftType();
            
            /**
             * True if has "AircraftType" element
             */
            boolean isSetAircraftType();
            
            /**
             * Sets the "AircraftType" element
             */
            void setAircraftType(java.lang.String aircraftType);
            
            /**
             * Sets (as xml) the "AircraftType" element
             */
            void xsetAircraftType(org.iata.iata.x2007.x00.AirEquipType aircraftType);
            
            /**
             * Nils the "AircraftType" element
             */
            void setNilAircraftType();
            
            /**
             * Unsets the "AircraftType" element
             */
            void unsetAircraftType();
            
            /**
             * Gets the "AircraftSubType" element
             */
            java.lang.String getAircraftSubType();
            
            /**
             * Gets (as xml) the "AircraftSubType" element
             */
            org.iata.iata.x2007.x00.StringLength3 xgetAircraftSubType();
            
            /**
             * Tests for nil "AircraftSubType" element
             */
            boolean isNilAircraftSubType();
            
            /**
             * True if has "AircraftSubType" element
             */
            boolean isSetAircraftSubType();
            
            /**
             * Sets the "AircraftSubType" element
             */
            void setAircraftSubType(java.lang.String aircraftSubType);
            
            /**
             * Sets (as xml) the "AircraftSubType" element
             */
            void xsetAircraftSubType(org.iata.iata.x2007.x00.StringLength3 aircraftSubType);
            
            /**
             * Nils the "AircraftSubType" element
             */
            void setNilAircraftSubType();
            
            /**
             * Unsets the "AircraftSubType" element
             */
            void unsetAircraftSubType();
            
            /**
             * Gets the "Registration" element
             */
            java.lang.String getRegistration();
            
            /**
             * Gets (as xml) the "Registration" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration xgetRegistration();
            
            /**
             * Tests for nil "Registration" element
             */
            boolean isNilRegistration();
            
            /**
             * True if has "Registration" element
             */
            boolean isSetRegistration();
            
            /**
             * Sets the "Registration" element
             */
            void setRegistration(java.lang.String registration);
            
            /**
             * Sets (as xml) the "Registration" element
             */
            void xsetRegistration(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration registration);
            
            /**
             * Nils the "Registration" element
             */
            void setNilRegistration();
            
            /**
             * Unsets the "Registration" element
             */
            void unsetRegistration();
            
            /**
             * Gets the "TailNumber" element
             */
            java.lang.String getTailNumber();
            
            /**
             * Gets (as xml) the "TailNumber" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber xgetTailNumber();
            
            /**
             * Tests for nil "TailNumber" element
             */
            boolean isNilTailNumber();
            
            /**
             * True if has "TailNumber" element
             */
            boolean isSetTailNumber();
            
            /**
             * Sets the "TailNumber" element
             */
            void setTailNumber(java.lang.String tailNumber);
            
            /**
             * Sets (as xml) the "TailNumber" element
             */
            void xsetTailNumber(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber tailNumber);
            
            /**
             * Nils the "TailNumber" element
             */
            void setNilTailNumber();
            
            /**
             * Unsets the "TailNumber" element
             */
            void unsetTailNumber();
            
            /**
             * Gets array of all "CrewInfo" elements
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo[] getCrewInfoArray();
            
            /**
             * Gets ith "CrewInfo" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo getCrewInfoArray(int i);
            
            /**
             * Tests for nil ith "CrewInfo" element
             */
            boolean isNilCrewInfoArray(int i);
            
            /**
             * Returns number of "CrewInfo" element
             */
            int sizeOfCrewInfoArray();
            
            /**
             * Sets array of all "CrewInfo" element
             */
            void setCrewInfoArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo[] crewInfoArray);
            
            /**
             * Sets ith "CrewInfo" element
             */
            void setCrewInfoArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo crewInfo);
            
            /**
             * Nils the ith "CrewInfo" element
             */
            void setNilCrewInfoArray(int i);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "CrewInfo" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo insertNewCrewInfo(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "CrewInfo" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo addNewCrewInfo();
            
            /**
             * Removes the ith "CrewInfo" element
             */
            void removeCrewInfo(int i);
            
            /**
             * Gets array of all "AgentInfo" elements
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo[] getAgentInfoArray();
            
            /**
             * Gets ith "AgentInfo" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo getAgentInfoArray(int i);
            
            /**
             * Tests for nil ith "AgentInfo" element
             */
            boolean isNilAgentInfoArray(int i);
            
            /**
             * Returns number of "AgentInfo" element
             */
            int sizeOfAgentInfoArray();
            
            /**
             * Sets array of all "AgentInfo" element
             */
            void setAgentInfoArray(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo[] agentInfoArray);
            
            /**
             * Sets ith "AgentInfo" element
             */
            void setAgentInfoArray(int i, org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo agentInfo);
            
            /**
             * Nils the ith "AgentInfo" element
             */
            void setNilAgentInfoArray(int i);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "AgentInfo" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo insertNewAgentInfo(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "AgentInfo" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo addNewAgentInfo();
            
            /**
             * Removes the ith "AgentInfo" element
             */
            void removeAgentInfo(int i);
            
            /**
             * Gets the "FleetNumber" element
             */
            java.lang.String getFleetNumber();
            
            /**
             * Gets (as xml) the "FleetNumber" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber xgetFleetNumber();
            
            /**
             * Tests for nil "FleetNumber" element
             */
            boolean isNilFleetNumber();
            
            /**
             * True if has "FleetNumber" element
             */
            boolean isSetFleetNumber();
            
            /**
             * Sets the "FleetNumber" element
             */
            void setFleetNumber(java.lang.String fleetNumber);
            
            /**
             * Sets (as xml) the "FleetNumber" element
             */
            void xsetFleetNumber(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber fleetNumber);
            
            /**
             * Nils the "FleetNumber" element
             */
            void setNilFleetNumber();
            
            /**
             * Unsets the "FleetNumber" element
             */
            void unsetFleetNumber();
            
            /**
             * Gets the "CallSign" element
             */
            java.lang.String getCallSign();
            
            /**
             * Gets (as xml) the "CallSign" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign xgetCallSign();
            
            /**
             * Tests for nil "CallSign" element
             */
            boolean isNilCallSign();
            
            /**
             * True if has "CallSign" element
             */
            boolean isSetCallSign();
            
            /**
             * Sets the "CallSign" element
             */
            void setCallSign(java.lang.String callSign);
            
            /**
             * Sets (as xml) the "CallSign" element
             */
            void xsetCallSign(org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign callSign);
            
            /**
             * Nils the "CallSign" element
             */
            void setNilCallSign();
            
            /**
             * Unsets the "CallSign" element
             */
            void unsetCallSign();
            
            /**
             * Gets array of all "DeadLoad" elements
             */
            org.iata.iata.x2007.x00.DeadLoadType[] getDeadLoadArray();
            
            /**
             * Gets ith "DeadLoad" element
             */
            org.iata.iata.x2007.x00.DeadLoadType getDeadLoadArray(int i);
            
            /**
             * Returns number of "DeadLoad" element
             */
            int sizeOfDeadLoadArray();
            
            /**
             * Sets array of all "DeadLoad" element
             */
            void setDeadLoadArray(org.iata.iata.x2007.x00.DeadLoadType[] deadLoadArray);
            
            /**
             * Sets ith "DeadLoad" element
             */
            void setDeadLoadArray(int i, org.iata.iata.x2007.x00.DeadLoadType deadLoad);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DeadLoad" element
             */
            org.iata.iata.x2007.x00.DeadLoadType insertNewDeadLoad(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DeadLoad" element
             */
            org.iata.iata.x2007.x00.DeadLoadType addNewDeadLoad();
            
            /**
             * Removes the ith "DeadLoad" element
             */
            void removeDeadLoad(int i);
            
            /**
             * Gets array of all "Baggage" elements
             */
            org.iata.iata.x2007.x00.BaggageLoadType[] getBaggageArray();
            
            /**
             * Gets ith "Baggage" element
             */
            org.iata.iata.x2007.x00.BaggageLoadType getBaggageArray(int i);
            
            /**
             * Returns number of "Baggage" element
             */
            int sizeOfBaggageArray();
            
            /**
             * Sets array of all "Baggage" element
             */
            void setBaggageArray(org.iata.iata.x2007.x00.BaggageLoadType[] baggageArray);
            
            /**
             * Sets ith "Baggage" element
             */
            void setBaggageArray(int i, org.iata.iata.x2007.x00.BaggageLoadType baggage);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Baggage" element
             */
            org.iata.iata.x2007.x00.BaggageLoadType insertNewBaggage(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Baggage" element
             */
            org.iata.iata.x2007.x00.BaggageLoadType addNewBaggage();
            
            /**
             * Removes the ith "Baggage" element
             */
            void removeBaggage(int i);
            
            /**
             * Gets array of all "Fuel" elements
             */
            org.iata.iata.x2007.x00.FuelDataType[] getFuelArray();
            
            /**
             * Gets ith "Fuel" element
             */
            org.iata.iata.x2007.x00.FuelDataType getFuelArray(int i);
            
            /**
             * Returns number of "Fuel" element
             */
            int sizeOfFuelArray();
            
            /**
             * Sets array of all "Fuel" element
             */
            void setFuelArray(org.iata.iata.x2007.x00.FuelDataType[] fuelArray);
            
            /**
             * Sets ith "Fuel" element
             */
            void setFuelArray(int i, org.iata.iata.x2007.x00.FuelDataType fuel);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Fuel" element
             */
            org.iata.iata.x2007.x00.FuelDataType insertNewFuel(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Fuel" element
             */
            org.iata.iata.x2007.x00.FuelDataType addNewFuel();
            
            /**
             * Removes the ith "Fuel" element
             */
            void removeFuel(int i);
            
            /**
             * An XML Registration(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$Registration.
             */
            public interface Registration extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Registration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("registration8dcdelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration newValue(java.lang.Object obj) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration) type.newValue( obj ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.Registration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML TailNumber(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$TailNumber.
             */
            public interface TailNumber extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TailNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("tailnumberb2cdelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber newValue(java.lang.Object obj) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber) type.newValue( obj ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.TailNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML CrewInfo(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$CrewInfo.
             */
            public interface CrewInfo extends org.iata.iata.x2007.x00.Numeric0To99
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrewInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("crewinfocf43elemtype");
                
                /**
                 * Gets the "Qualifier" attribute
                 */
                java.lang.String getQualifier();
                
                /**
                 * Gets (as xml) the "Qualifier" attribute
                 */
                org.iata.iata.x2007.x00.IATACodeType xgetQualifier();
                
                /**
                 * Sets the "Qualifier" attribute
                 */
                void setQualifier(java.lang.String qualifier);
                
                /**
                 * Sets (as xml) the "Qualifier" attribute
                 */
                void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier);
                
                /**
                 * Gets the "RepeatIndex" attribute
                 */
                int getRepeatIndex();
                
                /**
                 * Gets (as xml) the "RepeatIndex" attribute
                 */
                org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                
                /**
                 * True if has "RepeatIndex" attribute
                 */
                boolean isSetRepeatIndex();
                
                /**
                 * Sets the "RepeatIndex" attribute
                 */
                void setRepeatIndex(int repeatIndex);
                
                /**
                 * Sets (as xml) the "RepeatIndex" attribute
                 */
                void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                
                /**
                 * Unsets the "RepeatIndex" attribute
                 */
                void unsetRepeatIndex();
                
                /**
                 * Gets the "Airline" attribute
                 */
                java.lang.String getAirline();
                
                /**
                 * Gets (as xml) the "Airline" attribute
                 */
                org.iata.iata.x2007.x00.AirlineType xgetAirline();
                
                /**
                 * True if has "Airline" attribute
                 */
                boolean isSetAirline();
                
                /**
                 * Sets the "Airline" attribute
                 */
                void setAirline(java.lang.String airline);
                
                /**
                 * Sets (as xml) the "Airline" attribute
                 */
                void xsetAirline(org.iata.iata.x2007.x00.AirlineType airline);
                
                /**
                 * Unsets the "Airline" attribute
                 */
                void unsetAirline();
                
                /**
                 * Gets the "CodeContext" attribute
                 */
                java.lang.String getCodeContext();
                
                /**
                 * Gets (as xml) the "CodeContext" attribute
                 */
                org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
                
                /**
                 * True if has "CodeContext" attribute
                 */
                boolean isSetCodeContext();
                
                /**
                 * Sets the "CodeContext" attribute
                 */
                void setCodeContext(java.lang.String codeContext);
                
                /**
                 * Sets (as xml) the "CodeContext" attribute
                 */
                void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
                
                /**
                 * Unsets the "CodeContext" attribute
                 */
                void unsetCodeContext();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CrewInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML AgentInfo(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$AgentInfo.
             */
            public interface AgentInfo extends org.iata.iata.x2007.x00.IATACodeType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AgentInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("agentinfo4377elemtype");
                
                /**
                 * Gets the "Qualifier" attribute
                 */
                java.lang.String getQualifier();
                
                /**
                 * Gets (as xml) the "Qualifier" attribute
                 */
                org.iata.iata.x2007.x00.IATACodeType xgetQualifier();
                
                /**
                 * Sets the "Qualifier" attribute
                 */
                void setQualifier(java.lang.String qualifier);
                
                /**
                 * Sets (as xml) the "Qualifier" attribute
                 */
                void xsetQualifier(org.iata.iata.x2007.x00.IATACodeType qualifier);
                
                /**
                 * Gets the "DepartureOrArrival" attribute
                 */
                org.iata.iata.x2007.x00.DepartureArrivalType.Enum getDepartureOrArrival();
                
                /**
                 * Gets (as xml) the "DepartureOrArrival" attribute
                 */
                org.iata.iata.x2007.x00.DepartureArrivalType xgetDepartureOrArrival();
                
                /**
                 * Sets the "DepartureOrArrival" attribute
                 */
                void setDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType.Enum departureOrArrival);
                
                /**
                 * Sets (as xml) the "DepartureOrArrival" attribute
                 */
                void xsetDepartureOrArrival(org.iata.iata.x2007.x00.DepartureArrivalType departureOrArrival);
                
                /**
                 * Gets the "RepeatIndex" attribute
                 */
                int getRepeatIndex();
                
                /**
                 * Gets (as xml) the "RepeatIndex" attribute
                 */
                org.iata.iata.x2007.x00.Numeric1To99 xgetRepeatIndex();
                
                /**
                 * True if has "RepeatIndex" attribute
                 */
                boolean isSetRepeatIndex();
                
                /**
                 * Sets the "RepeatIndex" attribute
                 */
                void setRepeatIndex(int repeatIndex);
                
                /**
                 * Sets (as xml) the "RepeatIndex" attribute
                 */
                void xsetRepeatIndex(org.iata.iata.x2007.x00.Numeric1To99 repeatIndex);
                
                /**
                 * Unsets the "RepeatIndex" attribute
                 */
                void unsetRepeatIndex();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.AgentInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML FleetNumber(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$FleetNumber.
             */
            public interface FleetNumber extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FleetNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("fleetnumber655belemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber newValue(java.lang.Object obj) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber) type.newValue( obj ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.FleetNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML CallSign(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$AircraftInfo$CallSign.
             */
            public interface CallSign extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallSign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("callsigne3cfelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign newValue(java.lang.Object obj) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign) type.newValue( obj ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo.CallSign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.AircraftInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML PublicFlightDisplay(@http://www.iata.org/IATA/2007/00).
         *
         * This is a complex type.
         */
        public interface PublicFlightDisplay extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PublicFlightDisplay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("publicflightdisplaybc83elemtype");
            
            /**
             * Gets the "AirlineType" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType getAirlineType();
            
            /**
             * Sets the "AirlineType" element
             */
            void setAirlineType(org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType airlineType);
            
            /**
             * Appends and returns a new empty "AirlineType" element
             */
            org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType addNewAirlineType();
            
            /**
             * Gets the "FlightNumber" element
             */
            java.lang.String getFlightNumber();
            
            /**
             * Gets (as xml) the "FlightNumber" element
             */
            org.iata.iata.x2007.x00.NumericStringLength1To4 xgetFlightNumber();
            
            /**
             * Sets the "FlightNumber" element
             */
            void setFlightNumber(java.lang.String flightNumber);
            
            /**
             * Sets (as xml) the "FlightNumber" element
             */
            void xsetFlightNumber(org.iata.iata.x2007.x00.NumericStringLength1To4 flightNumber);
            
            /**
             * An XML AirlineType(@http://www.iata.org/IATA/2007/00).
             *
             * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$PublicFlightDisplay$AirlineType.
             */
            public interface AirlineType extends org.iata.iata.x2007.x00.AirlineType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AirlineType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("airlinetype481felemtype");
                
                /**
                 * Gets the "CodeContext" attribute
                 */
                java.lang.String getCodeContext();
                
                /**
                 * Gets (as xml) the "CodeContext" attribute
                 */
                org.iata.iata.x2007.x00.IATACodeType xgetCodeContext();
                
                /**
                 * True if has "CodeContext" attribute
                 */
                boolean isSetCodeContext();
                
                /**
                 * Sets the "CodeContext" attribute
                 */
                void setCodeContext(java.lang.String codeContext);
                
                /**
                 * Sets (as xml) the "CodeContext" attribute
                 */
                void xsetCodeContext(org.iata.iata.x2007.x00.IATACodeType codeContext);
                
                /**
                 * Unsets the "CodeContext" attribute
                 */
                void unsetCodeContext();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType newInstance() {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay.AirlineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.PublicFlightDisplay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML FlightClassification(@).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$FlightClassification.
         */
        public interface FlightClassification extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightClassification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flightclassificationa3c2attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification newValue(java.lang.Object obj) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification) type.newValue( obj ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.FlightClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML InternationalStatus(@).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightLegType$LegData$InternationalStatus.
         */
        public interface InternationalStatus extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InternationalStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("internationalstatus88d0attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum INTERNATIONAL = Enum.forString("International");
            static final Enum DOMESTIC = Enum.forString("Domestic");
            
            static final int INT_INTERNATIONAL = Enum.INT_INTERNATIONAL;
            static final int INT_DOMESTIC = Enum.INT_DOMESTIC;
            
            /**
             * Enumeration value class for org.iata.iata.x2007.x00.FlightLegType$LegData$InternationalStatus.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INTERNATIONAL
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
                
                static final int INT_INTERNATIONAL = 1;
                static final int INT_DOMESTIC = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("International", INT_INTERNATIONAL),
                      new Enum("Domestic", INT_DOMESTIC),
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
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus newValue(java.lang.Object obj) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus) type.newValue( obj ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus newInstance() {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.iata.iata.x2007.x00.FlightLegType.LegData.InternationalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.iata.iata.x2007.x00.FlightLegType.LegData newInstance() {
              return (org.iata.iata.x2007.x00.FlightLegType.LegData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.iata.iata.x2007.x00.FlightLegType.LegData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.iata.iata.x2007.x00.FlightLegType.LegData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.iata.iata.x2007.x00.FlightLegType newInstance() {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.iata.iata.x2007.x00.FlightLegType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.iata.iata.x2007.x00.FlightLegType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.iata.iata.x2007.x00.FlightLegType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FlightLegType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.iata.iata.x2007.x00.FlightLegType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.iata.iata.x2007.x00.FlightLegType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
