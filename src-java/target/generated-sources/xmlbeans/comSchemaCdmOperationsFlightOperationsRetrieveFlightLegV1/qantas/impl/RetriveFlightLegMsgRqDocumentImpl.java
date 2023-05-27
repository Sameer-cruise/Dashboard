/*
 * An XML document type.
 * Localname: retriveFlightLegMsgRq
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.impl;
/**
 * A document containing one retriveFlightLegMsgRq(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1) element.
 *
 * This is a complex type.
 */
public class RetriveFlightLegMsgRqDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument
{
    
    public RetriveFlightLegMsgRqDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIVEFLIGHTLEGMSGRQ$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "retriveFlightLegMsgRq");
    
    
    /**
     * Gets the "retriveFlightLegMsgRq" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq getRetriveFlightLegMsgRq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq)get_store().find_element_user(RETRIVEFLIGHTLEGMSGRQ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "retriveFlightLegMsgRq" element
     */
    public void setRetriveFlightLegMsgRq(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq retriveFlightLegMsgRq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq)get_store().find_element_user(RETRIVEFLIGHTLEGMSGRQ$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq)get_store().add_element_user(RETRIVEFLIGHTLEGMSGRQ$0);
            }
            target.set(retriveFlightLegMsgRq);
        }
    }
    
    /**
     * Appends and returns a new empty "retriveFlightLegMsgRq" element
     */
    public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq addNewRetriveFlightLegMsgRq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq target = null;
            target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq)get_store().add_element_user(RETRIVEFLIGHTLEGMSGRQ$0);
            return target;
        }
    }
    /**
     * An XML retriveFlightLegMsgRq(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
     *
     * This is a complex type.
     */
    public static class RetriveFlightLegMsgRqImpl extends comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.impl.RetrieveFlightLegTypeImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq
    {
        
        public RetriveFlightLegMsgRqImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTID$0 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "EventID");
        private static final javax.xml.namespace.QName LEGIDENTIFIER$2 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "LegIdentifier");
        private static final javax.xml.namespace.QName FILTERDATA$4 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "FilterData");
        private static final javax.xml.namespace.QName EXTERNALID$6 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "ExternalID");
        private static final javax.xml.namespace.QName ARVDEPINDICATOR$8 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "ArvDepIndicator");
        private static final javax.xml.namespace.QName AIRCRAFTREGO$10 = 
            new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "AircraftRego");
        
        
        /**
         * Gets the "EventID" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID getEventID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID)get_store().find_element_user(EVENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EventID" element
         */
        public boolean isSetEventID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENTID$0) != 0;
            }
        }
        
        /**
         * Sets the "EventID" element
         */
        public void setEventID(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID eventID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID)get_store().find_element_user(EVENTID$0, 0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID)get_store().add_element_user(EVENTID$0);
                }
                target.set(eventID);
            }
        }
        
        /**
         * Appends and returns a new empty "EventID" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID addNewEventID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID)get_store().add_element_user(EVENTID$0);
                return target;
            }
        }
        
        /**
         * Unsets the "EventID" element
         */
        public void unsetEventID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENTID$0, 0);
            }
        }
        
        /**
         * Gets array of all "LegIdentifier" elements
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1[] getLegIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LEGIDENTIFIER$2, targetList);
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1[] result = new comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "LegIdentifier" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 getLegIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1)get_store().find_element_user(LEGIDENTIFIER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "LegIdentifier" element
         */
        public int sizeOfLegIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEGIDENTIFIER$2);
            }
        }
        
        /**
         * Sets array of all "LegIdentifier" element
         */
        public void setLegIdentifierArray(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1[] legIdentifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(legIdentifierArray, LEGIDENTIFIER$2);
            }
        }
        
        /**
         * Sets ith "LegIdentifier" element
         */
        public void setLegIdentifierArray(int i, comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 legIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1)get_store().find_element_user(LEGIDENTIFIER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(legIdentifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "LegIdentifier" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 insertNewLegIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1)get_store().insert_element_user(LEGIDENTIFIER$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "LegIdentifier" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 addNewLegIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1 target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType1)get_store().add_element_user(LEGIDENTIFIER$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "LegIdentifier" element
         */
        public void removeLegIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEGIDENTIFIER$2, i);
            }
        }
        
        /**
         * Gets the "FilterData" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType getFilterData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType)get_store().find_element_user(FILTERDATA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "FilterData" element
         */
        public boolean isSetFilterData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILTERDATA$4) != 0;
            }
        }
        
        /**
         * Sets the "FilterData" element
         */
        public void setFilterData(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType filterData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType)get_store().find_element_user(FILTERDATA$4, 0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType)get_store().add_element_user(FILTERDATA$4);
                }
                target.set(filterData);
            }
        }
        
        /**
         * Appends and returns a new empty "FilterData" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType addNewFilterData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType)get_store().add_element_user(FILTERDATA$4);
                return target;
            }
        }
        
        /**
         * Unsets the "FilterData" element
         */
        public void unsetFilterData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILTERDATA$4, 0);
            }
        }
        
        /**
         * Gets the "ExternalID" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID getExternalID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID)get_store().find_element_user(EXTERNALID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ExternalID" element
         */
        public boolean isSetExternalID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTERNALID$6) != 0;
            }
        }
        
        /**
         * Sets the "ExternalID" element
         */
        public void setExternalID(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID externalID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID)get_store().find_element_user(EXTERNALID$6, 0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID)get_store().add_element_user(EXTERNALID$6);
                }
                target.set(externalID);
            }
        }
        
        /**
         * Appends and returns a new empty "ExternalID" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID addNewExternalID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID)get_store().add_element_user(EXTERNALID$6);
                return target;
            }
        }
        
        /**
         * Unsets the "ExternalID" element
         */
        public void unsetExternalID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTERNALID$6, 0);
            }
        }
        
        /**
         * Gets the "ArvDepIndicator" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType.Enum getArvDepIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARVDEPINDICATOR$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ArvDepIndicator" element
         */
        public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType xgetArvDepIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType)get_store().find_element_user(ARVDEPINDICATOR$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "ArvDepIndicator" element
         */
        public boolean isSetArvDepIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARVDEPINDICATOR$8) != 0;
            }
        }
        
        /**
         * Sets the "ArvDepIndicator" element
         */
        public void setArvDepIndicator(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType.Enum arvDepIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARVDEPINDICATOR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARVDEPINDICATOR$8);
                }
                target.setEnumValue(arvDepIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "ArvDepIndicator" element
         */
        public void xsetArvDepIndicator(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType arvDepIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType target = null;
                target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType)get_store().find_element_user(ARVDEPINDICATOR$8, 0);
                if (target == null)
                {
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType)get_store().add_element_user(ARVDEPINDICATOR$8);
                }
                target.set(arvDepIndicator);
            }
        }
        
        /**
         * Unsets the "ArvDepIndicator" element
         */
        public void unsetArvDepIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARVDEPINDICATOR$8, 0);
            }
        }
        
        /**
         * Gets the "AircraftRego" element
         */
        public java.lang.String getAircraftRego()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTREGO$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AircraftRego" element
         */
        public org.apache.xmlbeans.XmlString xgetAircraftRego()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRCRAFTREGO$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "AircraftRego" element
         */
        public boolean isSetAircraftRego()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AIRCRAFTREGO$10) != 0;
            }
        }
        
        /**
         * Sets the "AircraftRego" element
         */
        public void setAircraftRego(java.lang.String aircraftRego)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFTREGO$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRCRAFTREGO$10);
                }
                target.setStringValue(aircraftRego);
            }
        }
        
        /**
         * Sets (as xml) the "AircraftRego" element
         */
        public void xsetAircraftRego(org.apache.xmlbeans.XmlString aircraftRego)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRCRAFTREGO$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AIRCRAFTREGO$10);
                }
                target.set(aircraftRego);
            }
        }
        
        /**
         * Unsets the "AircraftRego" element
         */
        public void unsetAircraftRego()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AIRCRAFTREGO$10, 0);
            }
        }
        /**
         * An XML EventID(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
         *
         * This is a complex type.
         */
        public static class EventIDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID
        {
            
            public EventIDImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AIRLINE$0 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Airline");
            private static final javax.xml.namespace.QName FLIGHTNUMBER$2 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "FlightNumber");
            private static final javax.xml.namespace.QName DATE$4 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Date");
            private static final javax.xml.namespace.QName ARRIVALAIRPORT$6 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "ArrivalAirport");
            private static final javax.xml.namespace.QName DEPARTUREAIRPORT$8 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "DepartureAirport");
            private static final javax.xml.namespace.QName COMERCIALSUFFIX$10 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "ComercialSuffix");
            private static final javax.xml.namespace.QName EVENTSEQUENTID$12 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Event_SequentID");
            private static final javax.xml.namespace.QName SEQUENT$14 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Sequent");
            
            
            /**
             * Gets the "Airline" element
             */
            public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline getAirline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline)get_store().find_element_user(AIRLINE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Airline" element
             */
            public boolean isSetAirline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AIRLINE$0) != 0;
                }
            }
            
            /**
             * Sets the "Airline" element
             */
            public void setAirline(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline airline)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline)get_store().find_element_user(AIRLINE$0, 0);
                    if (target == null)
                    {
                      target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline)get_store().add_element_user(AIRLINE$0);
                    }
                    target.set(airline);
                }
            }
            
            /**
             * Appends and returns a new empty "Airline" element
             */
            public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline addNewAirline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline)get_store().add_element_user(AIRLINE$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "Airline" element
             */
            public void unsetAirline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AIRLINE$0, 0);
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
             * Gets the "Date" element
             */
            public java.util.Calendar getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "Date" element
             */
            public org.apache.xmlbeans.XmlDate xgetDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Date" element
             */
            public boolean isSetDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATE$4) != 0;
                }
            }
            
            /**
             * Sets the "Date" element
             */
            public void setDate(java.util.Calendar date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$4);
                    }
                    target.setCalendarValue(date);
                }
            }
            
            /**
             * Sets (as xml) the "Date" element
             */
            public void xsetDate(org.apache.xmlbeans.XmlDate date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATE$4);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Unsets the "Date" element
             */
            public void unsetDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATE$4, 0);
                }
            }
            
            /**
             * Gets the "ArrivalAirport" element
             */
            public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport getArrivalAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "ArrivalAirport" element
             */
            public boolean isSetArrivalAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ARRIVALAIRPORT$6) != 0;
                }
            }
            
            /**
             * Sets the "ArrivalAirport" element
             */
            public void setArrivalAirport(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport arrivalAirport)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$6, 0);
                    if (target == null)
                    {
                      target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$6);
                    }
                    target.set(arrivalAirport);
                }
            }
            
            /**
             * Appends and returns a new empty "ArrivalAirport" element
             */
            public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport addNewArrivalAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "ArrivalAirport" element
             */
            public void unsetArrivalAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ARRIVALAIRPORT$6, 0);
                }
            }
            
            /**
             * Gets the "DepartureAirport" element
             */
            public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport getDepartureAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "DepartureAirport" element
             */
            public boolean isSetDepartureAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DEPARTUREAIRPORT$8) != 0;
                }
            }
            
            /**
             * Sets the "DepartureAirport" element
             */
            public void setDepartureAirport(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport departureAirport)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$8, 0);
                    if (target == null)
                    {
                      target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$8);
                    }
                    target.set(departureAirport);
                }
            }
            
            /**
             * Appends and returns a new empty "DepartureAirport" element
             */
            public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport addNewDepartureAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$8);
                    return target;
                }
            }
            
            /**
             * Unsets the "DepartureAirport" element
             */
            public void unsetDepartureAirport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DEPARTUREAIRPORT$8, 0);
                }
            }
            
            /**
             * Gets the "ComercialSuffix" element
             */
            public java.lang.String getComercialSuffix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMERCIALSUFFIX$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ComercialSuffix" element
             */
            public org.apache.xmlbeans.XmlString xgetComercialSuffix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMERCIALSUFFIX$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ComercialSuffix" element
             */
            public boolean isSetComercialSuffix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(COMERCIALSUFFIX$10) != 0;
                }
            }
            
            /**
             * Sets the "ComercialSuffix" element
             */
            public void setComercialSuffix(java.lang.String comercialSuffix)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMERCIALSUFFIX$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMERCIALSUFFIX$10);
                    }
                    target.setStringValue(comercialSuffix);
                }
            }
            
            /**
             * Sets (as xml) the "ComercialSuffix" element
             */
            public void xsetComercialSuffix(org.apache.xmlbeans.XmlString comercialSuffix)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMERCIALSUFFIX$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMERCIALSUFFIX$10);
                    }
                    target.set(comercialSuffix);
                }
            }
            
            /**
             * Unsets the "ComercialSuffix" element
             */
            public void unsetComercialSuffix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(COMERCIALSUFFIX$10, 0);
                }
            }
            
            /**
             * Gets the "Event_SequentID" element
             */
            public int getEventSequentID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSEQUENTID$12, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "Event_SequentID" element
             */
            public org.apache.xmlbeans.XmlInt xgetEventSequentID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EVENTSEQUENTID$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Event_SequentID" element
             */
            public boolean isSetEventSequentID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EVENTSEQUENTID$12) != 0;
                }
            }
            
            /**
             * Sets the "Event_SequentID" element
             */
            public void setEventSequentID(int eventSequentID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSEQUENTID$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSEQUENTID$12);
                    }
                    target.setIntValue(eventSequentID);
                }
            }
            
            /**
             * Sets (as xml) the "Event_SequentID" element
             */
            public void xsetEventSequentID(org.apache.xmlbeans.XmlInt eventSequentID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EVENTSEQUENTID$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EVENTSEQUENTID$12);
                    }
                    target.set(eventSequentID);
                }
            }
            
            /**
             * Unsets the "Event_SequentID" element
             */
            public void unsetEventSequentID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EVENTSEQUENTID$12, 0);
                }
            }
            
            /**
             * Gets the "Sequent" element
             */
            public int getSequent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENT$14, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "Sequent" element
             */
            public org.apache.xmlbeans.XmlInt xgetSequent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUENT$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Sequent" element
             */
            public boolean isSetSequent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQUENT$14) != 0;
                }
            }
            
            /**
             * Sets the "Sequent" element
             */
            public void setSequent(int sequent)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENT$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQUENT$14);
                    }
                    target.setIntValue(sequent);
                }
            }
            
            /**
             * Sets (as xml) the "Sequent" element
             */
            public void xsetSequent(org.apache.xmlbeans.XmlInt sequent)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUENT$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SEQUENT$14);
                    }
                    target.set(sequent);
                }
            }
            
            /**
             * Unsets the "Sequent" element
             */
            public void unsetSequent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQUENT$14, 0);
                }
            }
            /**
             * An XML Airline(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
             *
             * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument$RetriveFlightLegMsgRq$EventID$Airline.
             */
            public static class AirlineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.Airline
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
             * An XML ArrivalAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
             *
             * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument$RetriveFlightLegMsgRq$EventID$ArrivalAirport.
             */
            public static class ArrivalAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.ArrivalAirport
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
             * An XML DepartureAirport(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
             *
             * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument$RetriveFlightLegMsgRq$EventID$DepartureAirport.
             */
            public static class DepartureAirportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.EventID.DepartureAirport
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
        }
        /**
         * An XML ExternalID(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
         *
         * This is a complex type.
         */
        public static class ExternalIDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID
        {
            
            public ExternalIDImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FLIGHTNUMBER$0 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "FlightNumber");
            private static final javax.xml.namespace.QName DATE$2 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Date");
            private static final javax.xml.namespace.QName PORT$4 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Port");
            private static final javax.xml.namespace.QName SEQUENT$6 = 
                new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1", "Sequent");
            
            
            /**
             * Gets the "FlightNumber" element
             */
            public java.lang.String getFlightNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$0, 0);
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
                    target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$0, 0);
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
                    return get_store().count_elements(FLIGHTNUMBER$0) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTNUMBER$0);
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
                    target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().find_element_user(FLIGHTNUMBER$0, 0);
                    if (target == null)
                    {
                      target = (org.iata.iata.x2007.x00.NumericStringLength1To4)get_store().add_element_user(FLIGHTNUMBER$0);
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
                    get_store().remove_element(FLIGHTNUMBER$0, 0);
                }
            }
            
            /**
             * Gets the "Date" element
             */
            public java.util.Calendar getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "Date" element
             */
            public org.apache.xmlbeans.XmlDate xgetDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Date" element
             */
            public boolean isSetDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATE$2) != 0;
                }
            }
            
            /**
             * Sets the "Date" element
             */
            public void setDate(java.util.Calendar date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$2);
                    }
                    target.setCalendarValue(date);
                }
            }
            
            /**
             * Sets (as xml) the "Date" element
             */
            public void xsetDate(org.apache.xmlbeans.XmlDate date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATE$2);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Unsets the "Date" element
             */
            public void unsetDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATE$2, 0);
                }
            }
            
            /**
             * Gets the "Port" element
             */
            public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port getPort()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port)get_store().find_element_user(PORT$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Port" element
             */
            public boolean isSetPort()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PORT$4) != 0;
                }
            }
            
            /**
             * Sets the "Port" element
             */
            public void setPort(comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port port)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port)get_store().find_element_user(PORT$4, 0);
                    if (target == null)
                    {
                      target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port)get_store().add_element_user(PORT$4);
                    }
                    target.set(port);
                }
            }
            
            /**
             * Appends and returns a new empty "Port" element
             */
            public comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port addNewPort()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port target = null;
                    target = (comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port)get_store().add_element_user(PORT$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "Port" element
             */
            public void unsetPort()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PORT$4, 0);
                }
            }
            
            /**
             * Gets the "Sequent" element
             */
            public int getSequent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENT$6, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "Sequent" element
             */
            public org.apache.xmlbeans.XmlInt xgetSequent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUENT$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Sequent" element
             */
            public boolean isSetSequent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQUENT$6) != 0;
                }
            }
            
            /**
             * Sets the "Sequent" element
             */
            public void setSequent(int sequent)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENT$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQUENT$6);
                    }
                    target.setIntValue(sequent);
                }
            }
            
            /**
             * Sets (as xml) the "Sequent" element
             */
            public void xsetSequent(org.apache.xmlbeans.XmlInt sequent)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUENT$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SEQUENT$6);
                    }
                    target.set(sequent);
                }
            }
            
            /**
             * Unsets the "Sequent" element
             */
            public void unsetSequent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQUENT$6, 0);
                }
            }
            /**
             * An XML Port(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightLeg:v1).
             *
             * This is an atomic type that is a restriction of comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument$RetriveFlightLegMsgRq$ExternalID$Port.
             */
            public static class PortImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq.ExternalID.Port
            {
                
                public PortImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected PortImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
    }
}
