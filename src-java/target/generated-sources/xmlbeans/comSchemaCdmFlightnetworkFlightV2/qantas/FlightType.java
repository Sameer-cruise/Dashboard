/*
 * XML Type:  FlightType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.FlightType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas;


/**
 * An XML FlightType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public interface FlightType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FlightType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("flighttype54b5type");
    
    /**
     * Gets the "elementNumber" element
     */
    java.lang.String getElementNumber();
    
    /**
     * Gets (as xml) the "elementNumber" element
     */
    comSchemaCdmCommonCommonV1.qantas.ElementNumberType xgetElementNumber();
    
    /**
     * True if has "elementNumber" element
     */
    boolean isSetElementNumber();
    
    /**
     * Sets the "elementNumber" element
     */
    void setElementNumber(java.lang.String elementNumber);
    
    /**
     * Sets (as xml) the "elementNumber" element
     */
    void xsetElementNumber(comSchemaCdmCommonCommonV1.qantas.ElementNumberType elementNumber);
    
    /**
     * Unsets the "elementNumber" element
     */
    void unsetElementNumber();
    
    /**
     * Gets the "marketingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getMarketingCarrier();
    
    /**
     * True if has "marketingCarrier" element
     */
    boolean isSetMarketingCarrier();
    
    /**
     * Sets the "marketingCarrier" element
     */
    void setMarketingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType marketingCarrier);
    
    /**
     * Appends and returns a new empty "marketingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewMarketingCarrier();
    
    /**
     * Unsets the "marketingCarrier" element
     */
    void unsetMarketingCarrier();
    
    /**
     * Gets the "operatingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType getOperatingCarrier();
    
    /**
     * True if has "operatingCarrier" element
     */
    boolean isSetOperatingCarrier();
    
    /**
     * Sets the "operatingCarrier" element
     */
    void setOperatingCarrier(comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType operatingCarrier);
    
    /**
     * Appends and returns a new empty "operatingCarrier" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CarrierType addNewOperatingCarrier();
    
    /**
     * Unsets the "operatingCarrier" element
     */
    void unsetOperatingCarrier();
    
    /**
     * Gets the "equipment" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType getEquipment();
    
    /**
     * True if has "equipment" element
     */
    boolean isSetEquipment();
    
    /**
     * Sets the "equipment" element
     */
    void setEquipment(comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType equipment);
    
    /**
     * Appends and returns a new empty "equipment" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType addNewEquipment();
    
    /**
     * Unsets the "equipment" element
     */
    void unsetEquipment();
    
    /**
     * Gets the "departure" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType getDeparture();
    
    /**
     * True if has "departure" element
     */
    boolean isSetDeparture();
    
    /**
     * Sets the "departure" element
     */
    void setDeparture(comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType departure);
    
    /**
     * Appends and returns a new empty "departure" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType addNewDeparture();
    
    /**
     * Unsets the "departure" element
     */
    void unsetDeparture();
    
    /**
     * Gets the "arrival" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType getArrival();
    
    /**
     * True if has "arrival" element
     */
    boolean isSetArrival();
    
    /**
     * Sets the "arrival" element
     */
    void setArrival(comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType arrival);
    
    /**
     * Appends and returns a new empty "arrival" element
     */
    comSchemaCdmFlightnetworkAirportV1.qantas.FlightGroupType addNewArrival();
    
    /**
     * Unsets the "arrival" element
     */
    void unsetArrival();
    
    /**
     * Gets the "flightDuration" element
     */
    java.lang.String getFlightDuration();
    
    /**
     * Gets (as xml) the "flightDuration" element
     */
    comSchemaCdmCommonCommonV1.qantas.TimeType xgetFlightDuration();
    
    /**
     * True if has "flightDuration" element
     */
    boolean isSetFlightDuration();
    
    /**
     * Sets the "flightDuration" element
     */
    void setFlightDuration(java.lang.String flightDuration);
    
    /**
     * Sets (as xml) the "flightDuration" element
     */
    void xsetFlightDuration(comSchemaCdmCommonCommonV1.qantas.TimeType flightDuration);
    
    /**
     * Unsets the "flightDuration" element
     */
    void unsetFlightDuration();
    
    /**
     * Gets the "electronicTicketingIndicator" element
     */
    java.lang.String getElectronicTicketingIndicator();
    
    /**
     * Gets (as xml) the "electronicTicketingIndicator" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ElectronicTicketingIndicatorType xgetElectronicTicketingIndicator();
    
    /**
     * True if has "electronicTicketingIndicator" element
     */
    boolean isSetElectronicTicketingIndicator();
    
    /**
     * Sets the "electronicTicketingIndicator" element
     */
    void setElectronicTicketingIndicator(java.lang.String electronicTicketingIndicator);
    
    /**
     * Sets (as xml) the "electronicTicketingIndicator" element
     */
    void xsetElectronicTicketingIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.ElectronicTicketingIndicatorType electronicTicketingIndicator);
    
    /**
     * Unsets the "electronicTicketingIndicator" element
     */
    void unsetElectronicTicketingIndicator();
    
    /**
     * Gets the "ticketlessIndicator" element
     */
    java.lang.String getTicketlessIndicator();
    
    /**
     * Gets (as xml) the "ticketlessIndicator" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.TicketlessIndicatorType xgetTicketlessIndicator();
    
    /**
     * True if has "ticketlessIndicator" element
     */
    boolean isSetTicketlessIndicator();
    
    /**
     * Sets the "ticketlessIndicator" element
     */
    void setTicketlessIndicator(java.lang.String ticketlessIndicator);
    
    /**
     * Sets (as xml) the "ticketlessIndicator" element
     */
    void xsetTicketlessIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.TicketlessIndicatorType ticketlessIndicator);
    
    /**
     * Unsets the "ticketlessIndicator" element
     */
    void unsetTicketlessIndicator();
    
    /**
     * Gets the "instantPurchaseIndicator" element
     */
    java.lang.String getInstantPurchaseIndicator();
    
    /**
     * Gets (as xml) the "instantPurchaseIndicator" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.InstantPurchaseIndicatorType xgetInstantPurchaseIndicator();
    
    /**
     * True if has "instantPurchaseIndicator" element
     */
    boolean isSetInstantPurchaseIndicator();
    
    /**
     * Sets the "instantPurchaseIndicator" element
     */
    void setInstantPurchaseIndicator(java.lang.String instantPurchaseIndicator);
    
    /**
     * Sets (as xml) the "instantPurchaseIndicator" element
     */
    void xsetInstantPurchaseIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.InstantPurchaseIndicatorType instantPurchaseIndicator);
    
    /**
     * Unsets the "instantPurchaseIndicator" element
     */
    void unsetInstantPurchaseIndicator();
    
    /**
     * Gets array of all "information" elements
     */
    java.lang.String[] getInformationArray();
    
    /**
     * Gets ith "information" element
     */
    java.lang.String getInformationArray(int i);
    
    /**
     * Gets (as xml) array of all "information" elements
     */
    comSchemaCdmCommonCommonV1.qantas.TextType[] xgetInformationArray();
    
    /**
     * Gets (as xml) ith "information" element
     */
    comSchemaCdmCommonCommonV1.qantas.TextType xgetInformationArray(int i);
    
    /**
     * Returns number of "information" element
     */
    int sizeOfInformationArray();
    
    /**
     * Sets array of all "information" element
     */
    void setInformationArray(java.lang.String[] informationArray);
    
    /**
     * Sets ith "information" element
     */
    void setInformationArray(int i, java.lang.String information);
    
    /**
     * Sets (as xml) array of all "information" element
     */
    void xsetInformationArray(comSchemaCdmCommonCommonV1.qantas.TextType[] informationArray);
    
    /**
     * Sets (as xml) ith "information" element
     */
    void xsetInformationArray(int i, comSchemaCdmCommonCommonV1.qantas.TextType information);
    
    /**
     * Inserts the value as the ith "information" element
     */
    void insertInformation(int i, java.lang.String information);
    
    /**
     * Appends the value as the last "information" element
     */
    void addInformation(java.lang.String information);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "information" element
     */
    comSchemaCdmCommonCommonV1.qantas.TextType insertNewInformation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "information" element
     */
    comSchemaCdmCommonCommonV1.qantas.TextType addNewInformation();
    
    /**
     * Removes the ith "information" element
     */
    void removeInformation(int i);
    
    /**
     * Gets array of all "stops" elements
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.StopType[] getStopsArray();
    
    /**
     * Gets ith "stops" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.StopType getStopsArray(int i);
    
    /**
     * Returns number of "stops" element
     */
    int sizeOfStopsArray();
    
    /**
     * Sets array of all "stops" element
     */
    void setStopsArray(comSchemaCdmFlightnetworkFlightV2.qantas.StopType[] stopsArray);
    
    /**
     * Sets ith "stops" element
     */
    void setStopsArray(int i, comSchemaCdmFlightnetworkFlightV2.qantas.StopType stops);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stops" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.StopType insertNewStops(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stops" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.StopType addNewStops();
    
    /**
     * Removes the ith "stops" element
     */
    void removeStops(int i);
    
    /**
     * Gets the "actionCode" element
     */
    java.lang.String getActionCode();
    
    /**
     * Gets (as xml) the "actionCode" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType xgetActionCode();
    
    /**
     * True if has "actionCode" element
     */
    boolean isSetActionCode();
    
    /**
     * Sets the "actionCode" element
     */
    void setActionCode(java.lang.String actionCode);
    
    /**
     * Sets (as xml) the "actionCode" element
     */
    void xsetActionCode(comSchemaCdmFlightnetworkFlightV2.qantas.ActionCodeType actionCode);
    
    /**
     * Unsets the "actionCode" element
     */
    void unsetActionCode();
    
    /**
     * Gets the "flightNumber" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType getFlightNumber();
    
    /**
     * True if has "flightNumber" element
     */
    boolean isSetFlightNumber();
    
    /**
     * Sets the "flightNumber" element
     */
    void setFlightNumber(comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType flightNumber);
    
    /**
     * Appends and returns a new empty "flightNumber" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType addNewFlightNumber();
    
    /**
     * Unsets the "flightNumber" element
     */
    void unsetFlightNumber();
    
    /**
     * Gets array of all "classes" elements
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[] getClassesArray();
    
    /**
     * Gets ith "classes" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType getClassesArray(int i);
    
    /**
     * Returns number of "classes" element
     */
    int sizeOfClassesArray();
    
    /**
     * Sets array of all "classes" element
     */
    void setClassesArray(comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType[] classesArray);
    
    /**
     * Sets ith "classes" element
     */
    void setClassesArray(int i, comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType classes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "classes" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType insertNewClasses(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "classes" element
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.ClassesType addNewClasses();
    
    /**
     * Removes the ith "classes" element
     */
    void removeClasses(int i);
    
    /**
     * Gets the "originDestinationID" attribute
     */
    java.lang.String getOriginDestinationID();
    
    /**
     * Gets (as xml) the "originDestinationID" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.OriginDestinationIDType xgetOriginDestinationID();
    
    /**
     * True if has "originDestinationID" attribute
     */
    boolean isSetOriginDestinationID();
    
    /**
     * Sets the "originDestinationID" attribute
     */
    void setOriginDestinationID(java.lang.String originDestinationID);
    
    /**
     * Sets (as xml) the "originDestinationID" attribute
     */
    void xsetOriginDestinationID(comSchemaCdmFlightnetworkFlightV2.qantas.OriginDestinationIDType originDestinationID);
    
    /**
     * Unsets the "originDestinationID" attribute
     */
    void unsetOriginDestinationID();
    
    /**
     * Gets the "flownIndicator" attribute
     */
    java.lang.String getFlownIndicator();
    
    /**
     * Gets (as xml) the "flownIndicator" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.FlownIndicatorType xgetFlownIndicator();
    
    /**
     * True if has "flownIndicator" attribute
     */
    boolean isSetFlownIndicator();
    
    /**
     * Sets the "flownIndicator" attribute
     */
    void setFlownIndicator(java.lang.String flownIndicator);
    
    /**
     * Sets (as xml) the "flownIndicator" attribute
     */
    void xsetFlownIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.FlownIndicatorType flownIndicator);
    
    /**
     * Unsets the "flownIndicator" attribute
     */
    void unsetFlownIndicator();
    
    /**
     * Gets the "marriedSegment" attribute
     */
    java.lang.String getMarriedSegment();
    
    /**
     * Gets (as xml) the "marriedSegment" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.MarriedSegmentType xgetMarriedSegment();
    
    /**
     * True if has "marriedSegment" attribute
     */
    boolean isSetMarriedSegment();
    
    /**
     * Sets the "marriedSegment" attribute
     */
    void setMarriedSegment(java.lang.String marriedSegment);
    
    /**
     * Sets (as xml) the "marriedSegment" attribute
     */
    void xsetMarriedSegment(comSchemaCdmFlightnetworkFlightV2.qantas.MarriedSegmentType marriedSegment);
    
    /**
     * Unsets the "marriedSegment" attribute
     */
    void unsetMarriedSegment();
    
    /**
     * Gets the "marriedRef" attribute
     */
    java.lang.String getMarriedRef();
    
    /**
     * Gets (as xml) the "marriedRef" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.MarriedRefType xgetMarriedRef();
    
    /**
     * True if has "marriedRef" attribute
     */
    boolean isSetMarriedRef();
    
    /**
     * Sets the "marriedRef" attribute
     */
    void setMarriedRef(java.lang.String marriedRef);
    
    /**
     * Sets (as xml) the "marriedRef" attribute
     */
    void xsetMarriedRef(comSchemaCdmFlightnetworkFlightV2.qantas.MarriedRefType marriedRef);
    
    /**
     * Unsets the "marriedRef" attribute
     */
    void unsetMarriedRef();
    
    /**
     * Gets the "optionalFlightType" attribute
     */
    java.lang.String getOptionalFlightType();
    
    /**
     * Gets (as xml) the "optionalFlightType" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.OptionalFlightType xgetOptionalFlightType();
    
    /**
     * True if has "optionalFlightType" attribute
     */
    boolean isSetOptionalFlightType();
    
    /**
     * Sets the "optionalFlightType" attribute
     */
    void setOptionalFlightType(java.lang.String optionalFlightType);
    
    /**
     * Sets (as xml) the "optionalFlightType" attribute
     */
    void xsetOptionalFlightType(comSchemaCdmFlightnetworkFlightV2.qantas.OptionalFlightType optionalFlightType);
    
    /**
     * Unsets the "optionalFlightType" attribute
     */
    void unsetOptionalFlightType();
    
    /**
     * Gets the "connectionIndicator" attribute
     */
    java.lang.String getConnectionIndicator();
    
    /**
     * Gets (as xml) the "connectionIndicator" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CnxxIndicatorType xgetConnectionIndicator();
    
    /**
     * True if has "connectionIndicator" attribute
     */
    boolean isSetConnectionIndicator();
    
    /**
     * Sets the "connectionIndicator" attribute
     */
    void setConnectionIndicator(java.lang.String connectionIndicator);
    
    /**
     * Sets (as xml) the "connectionIndicator" attribute
     */
    void xsetConnectionIndicator(comSchemaCdmFlightnetworkFlightV2.qantas.CnxxIndicatorType connectionIndicator);
    
    /**
     * Unsets the "connectionIndicator" attribute
     */
    void unsetConnectionIndicator();
    
    /**
     * Gets the "checkInFlag" attribute
     */
    java.lang.String getCheckInFlag();
    
    /**
     * Gets (as xml) the "checkInFlag" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.CheckInFlagIndicatorType xgetCheckInFlag();
    
    /**
     * True if has "checkInFlag" attribute
     */
    boolean isSetCheckInFlag();
    
    /**
     * Sets the "checkInFlag" attribute
     */
    void setCheckInFlag(java.lang.String checkInFlag);
    
    /**
     * Sets (as xml) the "checkInFlag" attribute
     */
    void xsetCheckInFlag(comSchemaCdmFlightnetworkFlightV2.qantas.CheckInFlagIndicatorType checkInFlag);
    
    /**
     * Unsets the "checkInFlag" attribute
     */
    void unsetCheckInFlag();
    
    /**
     * Gets the "flightRefKey" attribute
     */
    java.lang.String getFlightRefKey();
    
    /**
     * Gets (as xml) the "flightRefKey" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.FlightRefKeyType xgetFlightRefKey();
    
    /**
     * True if has "flightRefKey" attribute
     */
    boolean isSetFlightRefKey();
    
    /**
     * Sets the "flightRefKey" attribute
     */
    void setFlightRefKey(java.lang.String flightRefKey);
    
    /**
     * Sets (as xml) the "flightRefKey" attribute
     */
    void xsetFlightRefKey(comSchemaCdmFlightnetworkFlightV2.qantas.FlightRefKeyType flightRefKey);
    
    /**
     * Unsets the "flightRefKey" attribute
     */
    void unsetFlightRefKey();
    
    /**
     * Gets the "secureFlight" attribute
     */
    java.lang.String getSecureFlight();
    
    /**
     * Gets (as xml) the "secureFlight" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.SecureFlightType xgetSecureFlight();
    
    /**
     * True if has "secureFlight" attribute
     */
    boolean isSetSecureFlight();
    
    /**
     * Sets the "secureFlight" attribute
     */
    void setSecureFlight(java.lang.String secureFlight);
    
    /**
     * Sets (as xml) the "secureFlight" attribute
     */
    void xsetSecureFlight(comSchemaCdmFlightnetworkFlightV2.qantas.SecureFlightType secureFlight);
    
    /**
     * Unsets the "secureFlight" attribute
     */
    void unsetSecureFlight();
    
    /**
     * Gets the "bookingDate" attribute
     */
    java.util.Calendar getBookingDate();
    
    /**
     * Gets (as xml) the "bookingDate" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingDateType xgetBookingDate();
    
    /**
     * True if has "bookingDate" attribute
     */
    boolean isSetBookingDate();
    
    /**
     * Sets the "bookingDate" attribute
     */
    void setBookingDate(java.util.Calendar bookingDate);
    
    /**
     * Sets (as xml) the "bookingDate" attribute
     */
    void xsetBookingDate(comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingDateType bookingDate);
    
    /**
     * Unsets the "bookingDate" attribute
     */
    void unsetBookingDate();
    
    /**
     * Gets the "bookingTime" attribute
     */
    java.lang.String getBookingTime();
    
    /**
     * Gets (as xml) the "bookingTime" attribute
     */
    comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingTimeType xgetBookingTime();
    
    /**
     * True if has "bookingTime" attribute
     */
    boolean isSetBookingTime();
    
    /**
     * Sets the "bookingTime" attribute
     */
    void setBookingTime(java.lang.String bookingTime);
    
    /**
     * Sets (as xml) the "bookingTime" attribute
     */
    void xsetBookingTime(comSchemaCdmFlightnetworkFlightV2.qantas.FlightBookingTimeType bookingTime);
    
    /**
     * Unsets the "bookingTime" attribute
     */
    void unsetBookingTime();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType newInstance() {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmFlightnetworkFlightV2.qantas.FlightType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmFlightnetworkFlightV2.qantas.FlightType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
