/*
 * XML Type:  EquipmentType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas.impl;
/**
 * An XML EquipmentType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public class EquipmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType
{
    
    public EquipmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "code");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "name");
    private static final javax.xml.namespace.QName AIRCRAFTTYPE$4 = 
        new javax.xml.namespace.QName("", "AircraftType");
    
    
    /**
     * Gets the "code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.CodeType xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CodeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CodeType)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(comSchemaCdmFlightnetworkFlightV2.qantas.CodeType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.CodeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.CodeType)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.CodeType)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentNameType xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentNameType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentNameType)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentNameType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentNameType)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentNameType)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "AircraftType" attribute
     */
    public java.lang.String getAircraftType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AIRCRAFTTYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AircraftType" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.AircraftTypeType xgetAircraftType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.AircraftTypeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.AircraftTypeType)get_store().find_attribute_user(AIRCRAFTTYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "AircraftType" attribute
     */
    public boolean isSetAircraftType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AIRCRAFTTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "AircraftType" attribute
     */
    public void setAircraftType(java.lang.String aircraftType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AIRCRAFTTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AIRCRAFTTYPE$4);
            }
            target.setStringValue(aircraftType);
        }
    }
    
    /**
     * Sets (as xml) the "AircraftType" attribute
     */
    public void xsetAircraftType(comSchemaCdmFlightnetworkFlightV2.qantas.AircraftTypeType aircraftType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.AircraftTypeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.AircraftTypeType)get_store().find_attribute_user(AIRCRAFTTYPE$4);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.AircraftTypeType)get_store().add_attribute_user(AIRCRAFTTYPE$4);
            }
            target.set(aircraftType);
        }
    }
    
    /**
     * Unsets the "AircraftType" attribute
     */
    public void unsetAircraftType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AIRCRAFTTYPE$4);
        }
    }
}
