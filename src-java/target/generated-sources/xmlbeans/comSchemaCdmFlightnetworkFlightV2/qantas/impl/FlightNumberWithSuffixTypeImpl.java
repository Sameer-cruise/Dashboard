/*
 * XML Type:  FlightNumberWithSuffixType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2
 * Java type: comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkFlightV2.qantas.impl;
/**
 * An XML FlightNumberWithSuffixType(@urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2).
 *
 * This is a complex type.
 */
public class FlightNumberWithSuffixTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberWithSuffixType
{
    
    public FlightNumberWithSuffixTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLIGHTNUMBER$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Flight:v2", "flightNumber");
    private static final javax.xml.namespace.QName SUFFIX$2 = 
        new javax.xml.namespace.QName("", "Suffix");
    
    
    /**
     * Gets the "flightNumber" element
     */
    public int getFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTNUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "flightNumber" element
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberTypeType xgetFlightNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberTypeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberTypeType)get_store().find_element_user(FLIGHTNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "flightNumber" element
     */
    public void setFlightNumber(int flightNumber)
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
            target.setIntValue(flightNumber);
        }
    }
    
    /**
     * Sets (as xml) the "flightNumber" element
     */
    public void xsetFlightNumber(comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberTypeType flightNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberTypeType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberTypeType)get_store().find_element_user(FLIGHTNUMBER$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.FlightNumberTypeType)get_store().add_element_user(FLIGHTNUMBER$0);
            }
            target.set(flightNumber);
        }
    }
    
    /**
     * Gets the "Suffix" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.SuffixType.Enum getSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUFFIX$2);
            if (target == null)
            {
                return null;
            }
            return (comSchemaCdmFlightnetworkFlightV2.qantas.SuffixType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Suffix" attribute
     */
    public comSchemaCdmFlightnetworkFlightV2.qantas.SuffixType xgetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.SuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.SuffixType)get_store().find_attribute_user(SUFFIX$2);
            return target;
        }
    }
    
    /**
     * True if has "Suffix" attribute
     */
    public boolean isSetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUFFIX$2) != null;
        }
    }
    
    /**
     * Sets the "Suffix" attribute
     */
    public void setSuffix(comSchemaCdmFlightnetworkFlightV2.qantas.SuffixType.Enum suffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUFFIX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUFFIX$2);
            }
            target.setEnumValue(suffix);
        }
    }
    
    /**
     * Sets (as xml) the "Suffix" attribute
     */
    public void xsetSuffix(comSchemaCdmFlightnetworkFlightV2.qantas.SuffixType suffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkFlightV2.qantas.SuffixType target = null;
            target = (comSchemaCdmFlightnetworkFlightV2.qantas.SuffixType)get_store().find_attribute_user(SUFFIX$2);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkFlightV2.qantas.SuffixType)get_store().add_attribute_user(SUFFIX$2);
            }
            target.set(suffix);
        }
    }
    
    /**
     * Unsets the "Suffix" attribute
     */
    public void unsetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUFFIX$2);
        }
    }
}
