/*
 * XML Type:  RetriveFlightEventType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1
 * Java type: comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.impl;
/**
 * An XML RetriveFlightEventType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1).
 *
 * This is a complex type.
 */
public class RetriveFlightEventTypeImpl extends comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.impl.RetrieveFlightLegTypeImpl implements comSchemaCdmOperationsFlightOperationsRetrieveFlightEventV1.qantas.RetriveFlightEventType
{
    
    public RetriveFlightEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPARTURELEGEVENTID$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1", "DepartureLegEventId");
    private static final javax.xml.namespace.QName ARRIVALLEGEVENTID$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:RetrieveFlightEvent:v1", "ArrivalLegEventId");
    
    
    /**
     * Gets the "DepartureLegEventId" element
     */
    public java.math.BigInteger getDepartureLegEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTURELEGEVENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepartureLegEventId" element
     */
    public org.apache.xmlbeans.XmlInteger xgetDepartureLegEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DEPARTURELEGEVENTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "DepartureLegEventId" element
     */
    public boolean isSetDepartureLegEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTURELEGEVENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "DepartureLegEventId" element
     */
    public void setDepartureLegEventId(java.math.BigInteger departureLegEventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTURELEGEVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPARTURELEGEVENTID$0);
            }
            target.setBigIntegerValue(departureLegEventId);
        }
    }
    
    /**
     * Sets (as xml) the "DepartureLegEventId" element
     */
    public void xsetDepartureLegEventId(org.apache.xmlbeans.XmlInteger departureLegEventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DEPARTURELEGEVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DEPARTURELEGEVENTID$0);
            }
            target.set(departureLegEventId);
        }
    }
    
    /**
     * Unsets the "DepartureLegEventId" element
     */
    public void unsetDepartureLegEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTURELEGEVENTID$0, 0);
        }
    }
    
    /**
     * Gets the "ArrivalLegEventId" element
     */
    public java.math.BigInteger getArrivalLegEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALLEGEVENTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ArrivalLegEventId" element
     */
    public org.apache.xmlbeans.XmlInteger xgetArrivalLegEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ARRIVALLEGEVENTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ArrivalLegEventId" element
     */
    public void setArrivalLegEventId(java.math.BigInteger arrivalLegEventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALLEGEVENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARRIVALLEGEVENTID$2);
            }
            target.setBigIntegerValue(arrivalLegEventId);
        }
    }
    
    /**
     * Sets (as xml) the "ArrivalLegEventId" element
     */
    public void xsetArrivalLegEventId(org.apache.xmlbeans.XmlInteger arrivalLegEventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ARRIVALLEGEVENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ARRIVALLEGEVENTID$2);
            }
            target.set(arrivalLegEventId);
        }
    }
}
