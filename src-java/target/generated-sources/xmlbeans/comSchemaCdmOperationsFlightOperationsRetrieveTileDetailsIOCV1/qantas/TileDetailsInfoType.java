/*
 * XML Type:  TileDetailsInfoType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas;


/**
 * An XML TileDetailsInfoType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
 *
 * This is a complex type.
 */
public interface TileDetailsInfoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TileDetailsInfoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("tiledetailsinfotype6d0btype");
    
    /**
     * Gets the "current_station" element
     */
    java.lang.String getCurrentStation();
    
    /**
     * Gets (as xml) the "current_station" element
     */
    org.iata.iata.x2007.x00.IATACodeType xgetCurrentStation();
    
    /**
     * True if has "current_station" element
     */
    boolean isSetCurrentStation();
    
    /**
     * Sets the "current_station" element
     */
    void setCurrentStation(java.lang.String currentStation);
    
    /**
     * Sets (as xml) the "current_station" element
     */
    void xsetCurrentStation(org.iata.iata.x2007.x00.IATACodeType currentStation);
    
    /**
     * Unsets the "current_station" element
     */
    void unsetCurrentStation();
    
    /**
     * Gets the "current_bool" element
     */
    boolean getCurrentBool();
    
    /**
     * Gets (as xml) the "current_bool" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCurrentBool();
    
    /**
     * True if has "current_bool" element
     */
    boolean isSetCurrentBool();
    
    /**
     * Sets the "current_bool" element
     */
    void setCurrentBool(boolean currentBool);
    
    /**
     * Sets (as xml) the "current_bool" element
     */
    void xsetCurrentBool(org.apache.xmlbeans.XmlBoolean currentBool);
    
    /**
     * Unsets the "current_bool" element
     */
    void unsetCurrentBool();
    
    /**
     * Gets the "last_comment" element
     */
    java.lang.String getLastComment();
    
    /**
     * Gets (as xml) the "last_comment" element
     */
    org.apache.xmlbeans.XmlString xgetLastComment();
    
    /**
     * True if has "last_comment" element
     */
    boolean isSetLastComment();
    
    /**
     * Sets the "last_comment" element
     */
    void setLastComment(java.lang.String lastComment);
    
    /**
     * Sets (as xml) the "last_comment" element
     */
    void xsetLastComment(org.apache.xmlbeans.XmlString lastComment);
    
    /**
     * Unsets the "last_comment" element
     */
    void unsetLastComment();
    
    /**
     * Gets the "last_comment_time" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.LastCommentTime getLastCommentTime();
    
    /**
     * True if has "last_comment_time" element
     */
    boolean isSetLastCommentTime();
    
    /**
     * Sets the "last_comment_time" element
     */
    void setLastCommentTime(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.LastCommentTime lastCommentTime);
    
    /**
     * Appends and returns a new empty "last_comment_time" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.LastCommentTime addNewLastCommentTime();
    
    /**
     * Unsets the "last_comment_time" element
     */
    void unsetLastCommentTime();
    
    /**
     * Gets the "last_comment_user" element
     */
    java.lang.String getLastCommentUser();
    
    /**
     * Gets (as xml) the "last_comment_user" element
     */
    org.apache.xmlbeans.XmlString xgetLastCommentUser();
    
    /**
     * True if has "last_comment_user" element
     */
    boolean isSetLastCommentUser();
    
    /**
     * Sets the "last_comment_user" element
     */
    void setLastCommentUser(java.lang.String lastCommentUser);
    
    /**
     * Sets (as xml) the "last_comment_user" element
     */
    void xsetLastCommentUser(org.apache.xmlbeans.XmlString lastCommentUser);
    
    /**
     * Unsets the "last_comment_user" element
     */
    void unsetLastCommentUser();
    
    /**
     * Gets the "event_id" element
     */
    java.lang.String getEventId();
    
    /**
     * Gets (as xml) the "event_id" element
     */
    org.apache.xmlbeans.XmlString xgetEventId();
    
    /**
     * True if has "event_id" element
     */
    boolean isSetEventId();
    
    /**
     * Sets the "event_id" element
     */
    void setEventId(java.lang.String eventId);
    
    /**
     * Sets (as xml) the "event_id" element
     */
    void xsetEventId(org.apache.xmlbeans.XmlString eventId);
    
    /**
     * Unsets the "event_id" element
     */
    void unsetEventId();
    
    /**
     * Gets the "event_status" element
     */
    java.lang.String getEventStatus();
    
    /**
     * Gets (as xml) the "event_status" element
     */
    org.apache.xmlbeans.XmlString xgetEventStatus();
    
    /**
     * True if has "event_status" element
     */
    boolean isSetEventStatus();
    
    /**
     * Sets the "event_status" element
     */
    void setEventStatus(java.lang.String eventStatus);
    
    /**
     * Sets (as xml) the "event_status" element
     */
    void xsetEventStatus(org.apache.xmlbeans.XmlString eventStatus);
    
    /**
     * Unsets the "event_status" element
     */
    void unsetEventStatus();
    
    /**
     * Gets the "event_owner" element
     */
    java.lang.String getEventOwner();
    
    /**
     * Gets (as xml) the "event_owner" element
     */
    org.apache.xmlbeans.XmlString xgetEventOwner();
    
    /**
     * True if has "event_owner" element
     */
    boolean isSetEventOwner();
    
    /**
     * Sets the "event_owner" element
     */
    void setEventOwner(java.lang.String eventOwner);
    
    /**
     * Sets (as xml) the "event_owner" element
     */
    void xsetEventOwner(org.apache.xmlbeans.XmlString eventOwner);
    
    /**
     * Unsets the "event_owner" element
     */
    void unsetEventOwner();
    
    /**
     * Gets the "event_coordinator" element
     */
    java.lang.String getEventCoordinator();
    
    /**
     * Gets (as xml) the "event_coordinator" element
     */
    org.apache.xmlbeans.XmlString xgetEventCoordinator();
    
    /**
     * True if has "event_coordinator" element
     */
    boolean isSetEventCoordinator();
    
    /**
     * Sets the "event_coordinator" element
     */
    void setEventCoordinator(java.lang.String eventCoordinator);
    
    /**
     * Sets (as xml) the "event_coordinator" element
     */
    void xsetEventCoordinator(org.apache.xmlbeans.XmlString eventCoordinator);
    
    /**
     * Unsets the "event_coordinator" element
     */
    void unsetEventCoordinator();
    
    /**
     * Gets array of all "IOCSubEvent" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.IOCSubEvent[] getIOCSubEventArray();
    
    /**
     * Gets ith "IOCSubEvent" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.IOCSubEvent getIOCSubEventArray(int i);
    
    /**
     * Returns number of "IOCSubEvent" element
     */
    int sizeOfIOCSubEventArray();
    
    /**
     * Sets array of all "IOCSubEvent" element
     */
    void setIOCSubEventArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.IOCSubEvent[] iocSubEventArray);
    
    /**
     * Sets ith "IOCSubEvent" element
     */
    void setIOCSubEventArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.IOCSubEvent iocSubEvent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IOCSubEvent" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.IOCSubEvent insertNewIOCSubEvent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IOCSubEvent" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.IOCSubEvent addNewIOCSubEvent();
    
    /**
     * Removes the ith "IOCSubEvent" element
     */
    void removeIOCSubEvent(int i);
    
    /**
     * Gets array of all "LegDetails" elements
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType[] getLegDetailsArray();
    
    /**
     * Gets ith "LegDetails" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType getLegDetailsArray(int i);
    
    /**
     * Returns number of "LegDetails" element
     */
    int sizeOfLegDetailsArray();
    
    /**
     * Sets array of all "LegDetails" element
     */
    void setLegDetailsArray(comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType[] legDetailsArray);
    
    /**
     * Sets ith "LegDetails" element
     */
    void setLegDetailsArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType legDetails);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LegDetails" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType insertNewLegDetails(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LegDetails" element
     */
    comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.CustomFlightLegType addNewLegDetails();
    
    /**
     * Removes the ith "LegDetails" element
     */
    void removeLegDetails(int i);
    
    /**
     * An XML last_comment_time(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is a union type. Instances are of one of the following types:
     *     org.apache.xmlbeans.XmlDate
     *     org.apache.xmlbeans.XmlDateTime
     */
    public interface LastCommentTime extends org.iata.iata.x2007.x00.DateOrDateTimeType
    {
        java.lang.Object getObjectValue();
        void setObjectValue(java.lang.Object val);
        /** @deprecated */
        java.lang.Object objectValue();
        /** @deprecated */
        void objectSet(java.lang.Object val);
        org.apache.xmlbeans.SchemaType instanceType();
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LastCommentTime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("lastcommenttime48adelemtype");
        
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
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.LastCommentTime newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.LastCommentTime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.LastCommentTime newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.LastCommentTime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML IOCSubEvent(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveTileDetailsIOC:v1).
     *
     * This is a complex type.
     */
    public interface IOCSubEvent extends comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.IOCSubEventType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IOCSubEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC98ADE309492A68688F451BAA1A8F18E").resolveHandle("iocsubeventc0eeelemtype");
        
        /**
         * Gets the "EventType" attribute
         */
        java.lang.String getEventType();
        
        /**
         * Gets (as xml) the "EventType" attribute
         */
        org.apache.xmlbeans.XmlString xgetEventType();
        
        /**
         * True if has "EventType" attribute
         */
        boolean isSetEventType();
        
        /**
         * Sets the "EventType" attribute
         */
        void setEventType(java.lang.String eventType);
        
        /**
         * Sets (as xml) the "EventType" attribute
         */
        void xsetEventType(org.apache.xmlbeans.XmlString eventType);
        
        /**
         * Unsets the "EventType" attribute
         */
        void unsetEventType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.IOCSubEvent newInstance() {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.IOCSubEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.IOCSubEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType.IOCSubEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType newInstance() {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (comSchemaCdmOperationsFlightOperationsRetrieveTileDetailsIOCV1.qantas.TileDetailsInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
