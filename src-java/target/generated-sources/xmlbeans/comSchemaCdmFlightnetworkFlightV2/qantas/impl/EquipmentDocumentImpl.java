/*
 * An XML document type.
 * Localname: equipment
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas.impl;
/**
 * A document containing one equipment(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2) element.
 *
 * This is a complex type.
 */
public class EquipmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentDocument
{
    
    public EquipmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EQUIPMENT$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "equipment");
    
    
    /**
     * Gets the "equipment" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType getEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().find_element_user(EQUIPMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "equipment" element
     */
    public void setEquipment(comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType equipment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().find_element_user(EQUIPMENT$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().add_element_user(EQUIPMENT$0);
            }
            target.set(equipment);
        }
    }
    
    /**
     * Appends and returns a new empty "equipment" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType addNewEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.EquipmentType)get_store().add_element_user(EQUIPMENT$0);
            return target;
        }
    }
}
