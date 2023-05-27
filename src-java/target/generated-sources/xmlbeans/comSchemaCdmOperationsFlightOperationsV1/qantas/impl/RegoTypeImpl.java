/*
 * XML Type:  RegoType
 * Namespace: urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1
 * Java type: comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmOperationsFlightOperationsV1.qantas.impl;
/**
 * An XML RegoType(@urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1).
 *
 * This is a complex type.
 */
public class RegoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmOperationsFlightOperationsV1.qantas.RegoType
{
    
    public RegoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLDREGISTRATIONNUMBER$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "oldRegistrationNumber");
    private static final javax.xml.namespace.QName NEWREGISTRATIONNUMBER$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:operations:FlightOperations:v1", "newRegistrationNumber");
    
    
    /**
     * Gets the "oldRegistrationNumber" element
     */
    public java.lang.String getOldRegistrationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDREGISTRATIONNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldRegistrationNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOldRegistrationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OLDREGISTRATIONNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "oldRegistrationNumber" element
     */
    public void setOldRegistrationNumber(java.lang.String oldRegistrationNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDREGISTRATIONNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OLDREGISTRATIONNUMBER$0);
            }
            target.setStringValue(oldRegistrationNumber);
        }
    }
    
    /**
     * Sets (as xml) the "oldRegistrationNumber" element
     */
    public void xsetOldRegistrationNumber(org.apache.xmlbeans.XmlString oldRegistrationNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OLDREGISTRATIONNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OLDREGISTRATIONNUMBER$0);
            }
            target.set(oldRegistrationNumber);
        }
    }
    
    /**
     * Gets the "newRegistrationNumber" element
     */
    public java.lang.String getNewRegistrationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWREGISTRATIONNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "newRegistrationNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetNewRegistrationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWREGISTRATIONNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "newRegistrationNumber" element
     */
    public void setNewRegistrationNumber(java.lang.String newRegistrationNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWREGISTRATIONNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWREGISTRATIONNUMBER$2);
            }
            target.setStringValue(newRegistrationNumber);
        }
    }
    
    /**
     * Sets (as xml) the "newRegistrationNumber" element
     */
    public void xsetNewRegistrationNumber(org.apache.xmlbeans.XmlString newRegistrationNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWREGISTRATIONNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEWREGISTRATIONNUMBER$2);
            }
            target.set(newRegistrationNumber);
        }
    }
}
