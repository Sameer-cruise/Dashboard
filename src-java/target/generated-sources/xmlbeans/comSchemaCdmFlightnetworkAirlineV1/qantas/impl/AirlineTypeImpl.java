/*
 * XML Type:  AirlineType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Airline:v1
 * Java type: comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkAirlineV1.qantas.impl;
/**
 * An XML AirlineType(@urn:www.qantas.com:schema:cdm:flightnetwork:Airline:v1).
 *
 * This is a complex type.
 */
public class AirlineTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineType
{
    
    public AirlineTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODECONTEXT$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airline:v1", "codeContext");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airline:v1", "code");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airline:v1", "name");
    
    
    /**
     * Gets the "codeContext" element
     */
    public java.lang.String getCodeContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODECONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeContext" element
     */
    public comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeContextType xgetCodeContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeContextType target = null;
            target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeContextType)get_store().find_element_user(CODECONTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "codeContext" element
     */
    public void setCodeContext(java.lang.String codeContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODECONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODECONTEXT$0);
            }
            target.setStringValue(codeContext);
        }
    }
    
    /**
     * Sets (as xml) the "codeContext" element
     */
    public void xsetCodeContext(comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeContextType codeContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeContextType target = null;
            target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeContextType)get_store().find_element_user(CODECONTEXT$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeContextType)get_store().add_element_user(CODECONTEXT$0);
            }
            target.set(codeContext);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
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
    public comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeType xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeType target = null;
            target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeType)get_store().find_element_user(CODE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$2);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeType target = null;
            target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeType)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineCodeType)get_store().add_element_user(CODE$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
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
    public comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineNameType xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineNameType target = null;
            target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineNameType)get_store().find_element_user(NAME$4, 0);
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
            return get_store().count_elements(NAME$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineNameType target = null;
            target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineNameType)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirlineV1.qantas.AirlineNameType)get_store().add_element_user(NAME$4);
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
            get_store().remove_element(NAME$4, 0);
        }
    }
}
