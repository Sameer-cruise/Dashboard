/*
 * XML Type:  AirportDisplayNameType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1
 * Java type: comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkAirportV1.qantas.impl;
/**
 * An XML AirportDisplayNameType(@urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1).
 *
 * This is a complex type.
 */
public class AirportDisplayNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType
{
    
    public AirportDisplayNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRPORTNAME$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "airportName");
    private static final javax.xml.namespace.QName LANGUAGE$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "language");
    
    
    /**
     * Gets the "airportName" element
     */
    public java.lang.String getAirportName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRPORTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "airportName" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportNameType xgetAirportName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportNameType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportNameType)get_store().find_element_user(AIRPORTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "airportName" element
     */
    public void setAirportName(java.lang.String airportName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRPORTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRPORTNAME$0);
            }
            target.setStringValue(airportName);
        }
    }
    
    /**
     * Sets (as xml) the "airportName" element
     */
    public void xsetAirportName(comSchemaCdmFlightnetworkAirportV1.qantas.AirportNameType airportName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportNameType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportNameType)get_store().find_element_user(AIRPORTNAME$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportNameType)get_store().add_element_user(AIRPORTNAME$0);
            }
            target.set(airportName);
        }
    }
    
    /**
     * Gets the "language" element
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.LanguageType xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.LanguageType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.LanguageType)get_store().find_element_user(LANGUAGE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$2);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" element
     */
    public void xsetLanguage(comSchemaCdmFlightnetworkAirportV1.qantas.LanguageType language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.LanguageType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.LanguageType)get_store().find_element_user(LANGUAGE$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.LanguageType)get_store().add_element_user(LANGUAGE$2);
            }
            target.set(language);
        }
    }
}
