/*
 * XML Type:  AirportType
 * Namespace: urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1
 * Java type: comSchemaCdmFlightnetworkAirportV1.qantas.AirportType
 *
 * Automatically generated - do not modify.
 */
package comSchemaCdmFlightnetworkAirportV1.qantas.impl;
/**
 * An XML AirportType(@urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1).
 *
 * This is a complex type.
 */
public class AirportTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements comSchemaCdmFlightnetworkAirportV1.qantas.AirportType
{
    
    public AirportTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRPORTCODE$0 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "airportCode");
    private static final javax.xml.namespace.QName CODECONTEXT$2 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "codeContext");
    private static final javax.xml.namespace.QName TERMINAL$4 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "terminal");
    private static final javax.xml.namespace.QName GATE$6 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "gate");
    private static final javax.xml.namespace.QName AIRPORTDISPLAYNAME$8 = 
        new javax.xml.namespace.QName("urn:www.qantas.com:schema:cdm:flightnetwork:Airport:v1", "airportDisplayName");
    
    
    /**
     * Gets the "airportCode" element
     */
    public java.lang.String getAirportCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRPORTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "airportCode" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeType xgetAirportCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeType)get_store().find_element_user(AIRPORTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "airportCode" element
     */
    public void setAirportCode(java.lang.String airportCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRPORTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRPORTCODE$0);
            }
            target.setStringValue(airportCode);
        }
    }
    
    /**
     * Sets (as xml) the "airportCode" element
     */
    public void xsetAirportCode(comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeType airportCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeType)get_store().find_element_user(AIRPORTCODE$0, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeType)get_store().add_element_user(AIRPORTCODE$0);
            }
            target.set(airportCode);
        }
    }
    
    /**
     * Gets the "codeContext" element
     */
    public java.lang.String getCodeContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODECONTEXT$2, 0);
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
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeContextType xgetCodeContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeContextType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeContextType)get_store().find_element_user(CODECONTEXT$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODECONTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODECONTEXT$2);
            }
            target.setStringValue(codeContext);
        }
    }
    
    /**
     * Sets (as xml) the "codeContext" element
     */
    public void xsetCodeContext(comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeContextType codeContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeContextType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeContextType)get_store().find_element_user(CODECONTEXT$2, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportCodeContextType)get_store().add_element_user(CODECONTEXT$2);
            }
            target.set(codeContext);
        }
    }
    
    /**
     * Gets the "terminal" element
     */
    public java.lang.String getTerminal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMINAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "terminal" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.TerminalType xgetTerminal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.TerminalType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.TerminalType)get_store().find_element_user(TERMINAL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "terminal" element
     */
    public boolean isSetTerminal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TERMINAL$4) != 0;
        }
    }
    
    /**
     * Sets the "terminal" element
     */
    public void setTerminal(java.lang.String terminal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMINAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERMINAL$4);
            }
            target.setStringValue(terminal);
        }
    }
    
    /**
     * Sets (as xml) the "terminal" element
     */
    public void xsetTerminal(comSchemaCdmFlightnetworkAirportV1.qantas.TerminalType terminal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.TerminalType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.TerminalType)get_store().find_element_user(TERMINAL$4, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.TerminalType)get_store().add_element_user(TERMINAL$4);
            }
            target.set(terminal);
        }
    }
    
    /**
     * Unsets the "terminal" element
     */
    public void unsetTerminal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TERMINAL$4, 0);
        }
    }
    
    /**
     * Gets the "gate" element
     */
    public java.lang.String getGate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gate" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.GateType xgetGate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.GateType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.GateType)get_store().find_element_user(GATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "gate" element
     */
    public boolean isSetGate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GATE$6) != 0;
        }
    }
    
    /**
     * Sets the "gate" element
     */
    public void setGate(java.lang.String gate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GATE$6);
            }
            target.setStringValue(gate);
        }
    }
    
    /**
     * Sets (as xml) the "gate" element
     */
    public void xsetGate(comSchemaCdmFlightnetworkAirportV1.qantas.GateType gate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.GateType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.GateType)get_store().find_element_user(GATE$6, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.GateType)get_store().add_element_user(GATE$6);
            }
            target.set(gate);
        }
    }
    
    /**
     * Unsets the "gate" element
     */
    public void unsetGate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GATE$6, 0);
        }
    }
    
    /**
     * Gets the "airportDisplayName" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType getAirportDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType)get_store().find_element_user(AIRPORTDISPLAYNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "airportDisplayName" element
     */
    public boolean isSetAirportDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AIRPORTDISPLAYNAME$8) != 0;
        }
    }
    
    /**
     * Sets the "airportDisplayName" element
     */
    public void setAirportDisplayName(comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType airportDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType)get_store().find_element_user(AIRPORTDISPLAYNAME$8, 0);
            if (target == null)
            {
                target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType)get_store().add_element_user(AIRPORTDISPLAYNAME$8);
            }
            target.set(airportDisplayName);
        }
    }
    
    /**
     * Appends and returns a new empty "airportDisplayName" element
     */
    public comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType addNewAirportDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType target = null;
            target = (comSchemaCdmFlightnetworkAirportV1.qantas.AirportDisplayNameType)get_store().add_element_user(AIRPORTDISPLAYNAME$8);
            return target;
        }
    }
    
    /**
     * Unsets the "airportDisplayName" element
     */
    public void unsetAirportDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AIRPORTDISPLAYNAME$8, 0);
        }
    }
}
