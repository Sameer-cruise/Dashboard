/*
 * An XML document type.
 * Localname: FlightNumberType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberTypeDocument
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas.impl;
/**
 * A document containing one FlightNumberType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2) element.
 *
 * This is a complex type.
 */
public class FlightNumberTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberTypeDocument
{
    
    public FlightNumberTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLIGHTNUMBERTYPE$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "FlightNumberType");
    
    
    /**
     * Gets the "FlightNumberType" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType getFlightNumberType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().find_element_user(FLIGHTNUMBERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FlightNumberType" element
     */
    public void setFlightNumberType(comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType flightNumberType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().find_element_user(FLIGHTNUMBERTYPE$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().add_element_user(FLIGHTNUMBERTYPE$0);
            }
            target.set(flightNumberType);
        }
    }
    
    /**
     * Appends and returns a new empty "FlightNumberType" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType addNewFlightNumberType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType)get_store().add_element_user(FLIGHTNUMBERTYPE$0);
            return target;
        }
    }
}
