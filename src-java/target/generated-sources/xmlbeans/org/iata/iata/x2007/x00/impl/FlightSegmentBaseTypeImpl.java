/*
 * XML Type:  FlightSegmentBaseType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FlightSegmentBaseType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML FlightSegmentBaseType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class FlightSegmentBaseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightSegmentBaseType
{
    
    public FlightSegmentBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPARTUREAIRPORT$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "DepartureAirport");
    private static final javax.xml.namespace.QName ARRIVALAIRPORT$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "ArrivalAirport");
    private static final javax.xml.namespace.QName OPERATINGAIRLINE$4 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "OperatingAirline");
    private static final javax.xml.namespace.QName EQUIPMENT$6 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Equipment");
    private static final javax.xml.namespace.QName DEPARTUREDATETIME$8 = 
        new javax.xml.namespace.QName("", "DepartureDateTime");
    private static final javax.xml.namespace.QName ARRIVALDATETIME$10 = 
        new javax.xml.namespace.QName("", "ArrivalDateTime");
    private static final javax.xml.namespace.QName STOPQUANTITY$12 = 
        new javax.xml.namespace.QName("", "StopQuantity");
    private static final javax.xml.namespace.QName RPH$14 = 
        new javax.xml.namespace.QName("", "RPH");
    private static final javax.xml.namespace.QName INFOSOURCE$16 = 
        new javax.xml.namespace.QName("", "InfoSource");
    
    
    /**
     * Gets the "DepartureAirport" element
     */
    public org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport getDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$0, 0);
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
            return get_store().count_elements(DEPARTUREAIRPORT$0) != 0;
        }
    }
    
    /**
     * Sets the "DepartureAirport" element
     */
    public void setDepartureAirport(org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport departureAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport)get_store().find_element_user(DEPARTUREAIRPORT$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$0);
            }
            target.set(departureAirport);
        }
    }
    
    /**
     * Appends and returns a new empty "DepartureAirport" element
     */
    public org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport addNewDepartureAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport)get_store().add_element_user(DEPARTUREAIRPORT$0);
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
            get_store().remove_element(DEPARTUREAIRPORT$0, 0);
        }
    }
    
    /**
     * Gets the "ArrivalAirport" element
     */
    public org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport getArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$2, 0);
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
            return get_store().count_elements(ARRIVALAIRPORT$2) != 0;
        }
    }
    
    /**
     * Sets the "ArrivalAirport" element
     */
    public void setArrivalAirport(org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport arrivalAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport)get_store().find_element_user(ARRIVALAIRPORT$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$2);
            }
            target.set(arrivalAirport);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrivalAirport" element
     */
    public org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport addNewArrivalAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport)get_store().add_element_user(ARRIVALAIRPORT$2);
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
            get_store().remove_element(ARRIVALAIRPORT$2, 0);
        }
    }
    
    /**
     * Gets the "OperatingAirline" element
     */
    public org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline getOperatingAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline)get_store().find_element_user(OPERATINGAIRLINE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OperatingAirline" element
     */
    public boolean isSetOperatingAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATINGAIRLINE$4) != 0;
        }
    }
    
    /**
     * Sets the "OperatingAirline" element
     */
    public void setOperatingAirline(org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline operatingAirline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline)get_store().find_element_user(OPERATINGAIRLINE$4, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline)get_store().add_element_user(OPERATINGAIRLINE$4);
            }
            target.set(operatingAirline);
        }
    }
    
    /**
     * Appends and returns a new empty "OperatingAirline" element
     */
    public org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline addNewOperatingAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline target = null;
            target = (org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline)get_store().add_element_user(OPERATINGAIRLINE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "OperatingAirline" element
     */
    public void unsetOperatingAirline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATINGAIRLINE$4, 0);
        }
    }
    
    /**
     * Gets array of all "Equipment" elements
     */
    public org.iata.iata.x2007.x00.EquipmentType[] getEquipmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EQUIPMENT$6, targetList);
            org.iata.iata.x2007.x00.EquipmentType[] result = new org.iata.iata.x2007.x00.EquipmentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Equipment" element
     */
    public org.iata.iata.x2007.x00.EquipmentType getEquipmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.EquipmentType target = null;
            target = (org.iata.iata.x2007.x00.EquipmentType)get_store().find_element_user(EQUIPMENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Equipment" element
     */
    public int sizeOfEquipmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EQUIPMENT$6);
        }
    }
    
    /**
     * Sets array of all "Equipment" element
     */
    public void setEquipmentArray(org.iata.iata.x2007.x00.EquipmentType[] equipmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(equipmentArray, EQUIPMENT$6);
        }
    }
    
    /**
     * Sets ith "Equipment" element
     */
    public void setEquipmentArray(int i, org.iata.iata.x2007.x00.EquipmentType equipment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.EquipmentType target = null;
            target = (org.iata.iata.x2007.x00.EquipmentType)get_store().find_element_user(EQUIPMENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(equipment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Equipment" element
     */
    public org.iata.iata.x2007.x00.EquipmentType insertNewEquipment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.EquipmentType target = null;
            target = (org.iata.iata.x2007.x00.EquipmentType)get_store().insert_element_user(EQUIPMENT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Equipment" element
     */
    public org.iata.iata.x2007.x00.EquipmentType addNewEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.EquipmentType target = null;
            target = (org.iata.iata.x2007.x00.EquipmentType)get_store().add_element_user(EQUIPMENT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Equipment" element
     */
    public void removeEquipment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EQUIPMENT$6, i);
        }
    }
    
    /**
     * Gets the "DepartureDateTime" attribute
     */
    public java.util.Calendar getDepartureDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPARTUREDATETIME$8);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepartureDateTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetDepartureDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DEPARTUREDATETIME$8);
            return target;
        }
    }
    
    /**
     * True if has "DepartureDateTime" attribute
     */
    public boolean isSetDepartureDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEPARTUREDATETIME$8) != null;
        }
    }
    
    /**
     * Sets the "DepartureDateTime" attribute
     */
    public void setDepartureDateTime(java.util.Calendar departureDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPARTUREDATETIME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPARTUREDATETIME$8);
            }
            target.setCalendarValue(departureDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "DepartureDateTime" attribute
     */
    public void xsetDepartureDateTime(org.apache.xmlbeans.XmlDateTime departureDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DEPARTUREDATETIME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DEPARTUREDATETIME$8);
            }
            target.set(departureDateTime);
        }
    }
    
    /**
     * Unsets the "DepartureDateTime" attribute
     */
    public void unsetDepartureDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEPARTUREDATETIME$8);
        }
    }
    
    /**
     * Gets the "ArrivalDateTime" attribute
     */
    public java.util.Calendar getArrivalDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRIVALDATETIME$10);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ArrivalDateTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetArrivalDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ARRIVALDATETIME$10);
            return target;
        }
    }
    
    /**
     * True if has "ArrivalDateTime" attribute
     */
    public boolean isSetArrivalDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ARRIVALDATETIME$10) != null;
        }
    }
    
    /**
     * Sets the "ArrivalDateTime" attribute
     */
    public void setArrivalDateTime(java.util.Calendar arrivalDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRIVALDATETIME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARRIVALDATETIME$10);
            }
            target.setCalendarValue(arrivalDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "ArrivalDateTime" attribute
     */
    public void xsetArrivalDateTime(org.apache.xmlbeans.XmlDateTime arrivalDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ARRIVALDATETIME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(ARRIVALDATETIME$10);
            }
            target.set(arrivalDateTime);
        }
    }
    
    /**
     * Unsets the "ArrivalDateTime" attribute
     */
    public void unsetArrivalDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ARRIVALDATETIME$10);
        }
    }
    
    /**
     * Gets the "StopQuantity" attribute
     */
    public java.math.BigInteger getStopQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOPQUANTITY$12);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "StopQuantity" attribute
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetStopQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(STOPQUANTITY$12);
            return target;
        }
    }
    
    /**
     * True if has "StopQuantity" attribute
     */
    public boolean isSetStopQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STOPQUANTITY$12) != null;
        }
    }
    
    /**
     * Sets the "StopQuantity" attribute
     */
    public void setStopQuantity(java.math.BigInteger stopQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOPQUANTITY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STOPQUANTITY$12);
            }
            target.setBigIntegerValue(stopQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "StopQuantity" attribute
     */
    public void xsetStopQuantity(org.apache.xmlbeans.XmlNonNegativeInteger stopQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(STOPQUANTITY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(STOPQUANTITY$12);
            }
            target.set(stopQuantity);
        }
    }
    
    /**
     * Unsets the "StopQuantity" attribute
     */
    public void unsetStopQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STOPQUANTITY$12);
        }
    }
    
    /**
     * Gets the "RPH" attribute
     */
    public java.lang.String getRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RPH$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RPH" attribute
     */
    public org.iata.iata.x2007.x00.RPHType xgetRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.RPHType target = null;
            target = (org.iata.iata.x2007.x00.RPHType)get_store().find_attribute_user(RPH$14);
            return target;
        }
    }
    
    /**
     * True if has "RPH" attribute
     */
    public boolean isSetRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RPH$14) != null;
        }
    }
    
    /**
     * Sets the "RPH" attribute
     */
    public void setRPH(java.lang.String rph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RPH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RPH$14);
            }
            target.setStringValue(rph);
        }
    }
    
    /**
     * Sets (as xml) the "RPH" attribute
     */
    public void xsetRPH(org.iata.iata.x2007.x00.RPHType rph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.RPHType target = null;
            target = (org.iata.iata.x2007.x00.RPHType)get_store().find_attribute_user(RPH$14);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.RPHType)get_store().add_attribute_user(RPH$14);
            }
            target.set(rph);
        }
    }
    
    /**
     * Unsets the "RPH" attribute
     */
    public void unsetRPH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RPH$14);
        }
    }
    
    /**
     * Gets the "InfoSource" attribute
     */
    public java.lang.String getInfoSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INFOSOURCE$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InfoSource" attribute
     */
    public org.iata.iata.x2007.x00.InfoSourceType xgetInfoSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.InfoSourceType target = null;
            target = (org.iata.iata.x2007.x00.InfoSourceType)get_store().find_attribute_user(INFOSOURCE$16);
            return target;
        }
    }
    
    /**
     * True if has "InfoSource" attribute
     */
    public boolean isSetInfoSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INFOSOURCE$16) != null;
        }
    }
    
    /**
     * Sets the "InfoSource" attribute
     */
    public void setInfoSource(java.lang.String infoSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INFOSOURCE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INFOSOURCE$16);
            }
            target.setStringValue(infoSource);
        }
    }
    
    /**
     * Sets (as xml) the "InfoSource" attribute
     */
    public void xsetInfoSource(org.iata.iata.x2007.x00.InfoSourceType infoSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.InfoSourceType target = null;
            target = (org.iata.iata.x2007.x00.InfoSourceType)get_store().find_attribute_user(INFOSOURCE$16);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.InfoSourceType)get_store().add_attribute_user(INFOSOURCE$16);
            }
            target.set(infoSource);
        }
    }
    
    /**
     * Unsets the "InfoSource" attribute
     */
    public void unsetInfoSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INFOSOURCE$16);
        }
    }
    /**
     * An XML DepartureAirport(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class DepartureAirportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightSegmentBaseType.DepartureAirport
    {
        
        public DepartureAirportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATIONCODE$0 = 
            new javax.xml.namespace.QName("", "LocationCode");
        private static final javax.xml.namespace.QName CODECONTEXT$2 = 
            new javax.xml.namespace.QName("", "CodeContext");
        private static final javax.xml.namespace.QName TERMINAL$4 = 
            new javax.xml.namespace.QName("", "Terminal");
        private static final javax.xml.namespace.QName GATE$6 = 
            new javax.xml.namespace.QName("", "Gate");
        
        
        /**
         * Gets the "LocationCode" attribute
         */
        public java.lang.String getLocationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONCODE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LocationCode" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To8 xgetLocationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To8 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().find_attribute_user(LOCATIONCODE$0);
                return target;
            }
        }
        
        /**
         * True if has "LocationCode" attribute
         */
        public boolean isSetLocationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCATIONCODE$0) != null;
            }
        }
        
        /**
         * Sets the "LocationCode" attribute
         */
        public void setLocationCode(java.lang.String locationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONCODE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATIONCODE$0);
                }
                target.setStringValue(locationCode);
            }
        }
        
        /**
         * Sets (as xml) the "LocationCode" attribute
         */
        public void xsetLocationCode(org.iata.iata.x2007.x00.StringLength1To8 locationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To8 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().find_attribute_user(LOCATIONCODE$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().add_attribute_user(LOCATIONCODE$0);
                }
                target.set(locationCode);
            }
        }
        
        /**
         * Unsets the "LocationCode" attribute
         */
        public void unsetLocationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCATIONCODE$0);
            }
        }
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODECONTEXT$2);
                }
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
        public org.iata.iata.x2007.x00.StringLength1To32 xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CODECONTEXT$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_default_attribute_value(CODECONTEXT$2);
                }
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
                return get_store().find_attribute_user(CODECONTEXT$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$2);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.StringLength1To32 codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CODECONTEXT$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(CODECONTEXT$2);
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
                get_store().remove_attribute(CODECONTEXT$2);
            }
        }
        
        /**
         * Gets the "Terminal" attribute
         */
        public java.lang.String getTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMINAL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Terminal" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(TERMINAL$4);
                return target;
            }
        }
        
        /**
         * True if has "Terminal" attribute
         */
        public boolean isSetTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TERMINAL$4) != null;
            }
        }
        
        /**
         * Sets the "Terminal" attribute
         */
        public void setTerminal(java.lang.String terminal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMINAL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMINAL$4);
                }
                target.setStringValue(terminal);
            }
        }
        
        /**
         * Sets (as xml) the "Terminal" attribute
         */
        public void xsetTerminal(org.iata.iata.x2007.x00.StringLength1To16 terminal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(TERMINAL$4);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(TERMINAL$4);
                }
                target.set(terminal);
            }
        }
        
        /**
         * Unsets the "Terminal" attribute
         */
        public void unsetTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TERMINAL$4);
            }
        }
        
        /**
         * Gets the "Gate" attribute
         */
        public java.lang.String getGate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GATE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Gate" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetGate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(GATE$6);
                return target;
            }
        }
        
        /**
         * True if has "Gate" attribute
         */
        public boolean isSetGate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GATE$6) != null;
            }
        }
        
        /**
         * Sets the "Gate" attribute
         */
        public void setGate(java.lang.String gate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GATE$6);
                }
                target.setStringValue(gate);
            }
        }
        
        /**
         * Sets (as xml) the "Gate" attribute
         */
        public void xsetGate(org.iata.iata.x2007.x00.StringLength1To16 gate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(GATE$6);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(GATE$6);
                }
                target.set(gate);
            }
        }
        
        /**
         * Unsets the "Gate" attribute
         */
        public void unsetGate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GATE$6);
            }
        }
    }
    /**
     * An XML ArrivalAirport(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class ArrivalAirportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.FlightSegmentBaseType.ArrivalAirport
    {
        
        public ArrivalAirportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATIONCODE$0 = 
            new javax.xml.namespace.QName("", "LocationCode");
        private static final javax.xml.namespace.QName CODECONTEXT$2 = 
            new javax.xml.namespace.QName("", "CodeContext");
        private static final javax.xml.namespace.QName TERMINAL$4 = 
            new javax.xml.namespace.QName("", "Terminal");
        private static final javax.xml.namespace.QName GATE$6 = 
            new javax.xml.namespace.QName("", "Gate");
        
        
        /**
         * Gets the "LocationCode" attribute
         */
        public java.lang.String getLocationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONCODE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LocationCode" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To8 xgetLocationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To8 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().find_attribute_user(LOCATIONCODE$0);
                return target;
            }
        }
        
        /**
         * True if has "LocationCode" attribute
         */
        public boolean isSetLocationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCATIONCODE$0) != null;
            }
        }
        
        /**
         * Sets the "LocationCode" attribute
         */
        public void setLocationCode(java.lang.String locationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONCODE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATIONCODE$0);
                }
                target.setStringValue(locationCode);
            }
        }
        
        /**
         * Sets (as xml) the "LocationCode" attribute
         */
        public void xsetLocationCode(org.iata.iata.x2007.x00.StringLength1To8 locationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To8 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().find_attribute_user(LOCATIONCODE$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().add_attribute_user(LOCATIONCODE$0);
                }
                target.set(locationCode);
            }
        }
        
        /**
         * Unsets the "LocationCode" attribute
         */
        public void unsetLocationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCATIONCODE$0);
            }
        }
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODECONTEXT$2);
                }
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
        public org.iata.iata.x2007.x00.StringLength1To32 xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CODECONTEXT$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_default_attribute_value(CODECONTEXT$2);
                }
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
                return get_store().find_attribute_user(CODECONTEXT$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$2);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.StringLength1To32 codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CODECONTEXT$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(CODECONTEXT$2);
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
                get_store().remove_attribute(CODECONTEXT$2);
            }
        }
        
        /**
         * Gets the "Terminal" attribute
         */
        public java.lang.String getTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMINAL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Terminal" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(TERMINAL$4);
                return target;
            }
        }
        
        /**
         * True if has "Terminal" attribute
         */
        public boolean isSetTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TERMINAL$4) != null;
            }
        }
        
        /**
         * Sets the "Terminal" attribute
         */
        public void setTerminal(java.lang.String terminal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMINAL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMINAL$4);
                }
                target.setStringValue(terminal);
            }
        }
        
        /**
         * Sets (as xml) the "Terminal" attribute
         */
        public void xsetTerminal(org.iata.iata.x2007.x00.StringLength1To16 terminal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(TERMINAL$4);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(TERMINAL$4);
                }
                target.set(terminal);
            }
        }
        
        /**
         * Unsets the "Terminal" attribute
         */
        public void unsetTerminal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TERMINAL$4);
            }
        }
        
        /**
         * Gets the "Gate" attribute
         */
        public java.lang.String getGate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GATE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Gate" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetGate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(GATE$6);
                return target;
            }
        }
        
        /**
         * True if has "Gate" attribute
         */
        public boolean isSetGate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GATE$6) != null;
            }
        }
        
        /**
         * Sets the "Gate" attribute
         */
        public void setGate(java.lang.String gate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GATE$6);
                }
                target.setStringValue(gate);
            }
        }
        
        /**
         * Sets (as xml) the "Gate" attribute
         */
        public void xsetGate(org.iata.iata.x2007.x00.StringLength1To16 gate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(GATE$6);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(GATE$6);
                }
                target.set(gate);
            }
        }
        
        /**
         * Unsets the "Gate" attribute
         */
        public void unsetGate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GATE$6);
            }
        }
    }
    /**
     * An XML OperatingAirline(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightSegmentBaseType$OperatingAirline.
     */
    public static class OperatingAirlineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightSegmentBaseType.OperatingAirline
    {
        
        public OperatingAirlineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected OperatingAirlineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName COMPANYSHORTNAME$0 = 
            new javax.xml.namespace.QName("", "CompanyShortName");
        private static final javax.xml.namespace.QName TRAVELSECTOR$2 = 
            new javax.xml.namespace.QName("", "TravelSector");
        private static final javax.xml.namespace.QName CODE$4 = 
            new javax.xml.namespace.QName("", "Code");
        private static final javax.xml.namespace.QName CODECONTEXT$6 = 
            new javax.xml.namespace.QName("", "CodeContext");
        private static final javax.xml.namespace.QName FLIGHTNUMBER$8 = 
            new javax.xml.namespace.QName("", "FlightNumber");
        private static final javax.xml.namespace.QName RESBOOKDESIGCODE$10 = 
            new javax.xml.namespace.QName("", "ResBookDesigCode");
        private static final javax.xml.namespace.QName OPERATIONALSUFFIX$12 = 
            new javax.xml.namespace.QName("", "OperationalSuffix");
        
        
        /**
         * Gets the "CompanyShortName" attribute
         */
        public java.lang.String getCompanyShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANYSHORTNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CompanyShortName" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To32 xgetCompanyShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(COMPANYSHORTNAME$0);
                return target;
            }
        }
        
        /**
         * True if has "CompanyShortName" attribute
         */
        public boolean isSetCompanyShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMPANYSHORTNAME$0) != null;
            }
        }
        
        /**
         * Sets the "CompanyShortName" attribute
         */
        public void setCompanyShortName(java.lang.String companyShortName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANYSHORTNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPANYSHORTNAME$0);
                }
                target.setStringValue(companyShortName);
            }
        }
        
        /**
         * Sets (as xml) the "CompanyShortName" attribute
         */
        public void xsetCompanyShortName(org.iata.iata.x2007.x00.StringLength1To32 companyShortName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(COMPANYSHORTNAME$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(COMPANYSHORTNAME$0);
                }
                target.set(companyShortName);
            }
        }
        
        /**
         * Unsets the "CompanyShortName" attribute
         */
        public void unsetCompanyShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMPANYSHORTNAME$0);
            }
        }
        
        /**
         * Gets the "TravelSector" attribute
         */
        public java.lang.String getTravelSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRAVELSECTOR$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TravelSector" attribute
         */
        public org.iata.iata.x2007.x00.IATACodeType xgetTravelSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TRAVELSECTOR$2);
                return target;
            }
        }
        
        /**
         * True if has "TravelSector" attribute
         */
        public boolean isSetTravelSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRAVELSECTOR$2) != null;
            }
        }
        
        /**
         * Sets the "TravelSector" attribute
         */
        public void setTravelSector(java.lang.String travelSector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRAVELSECTOR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRAVELSECTOR$2);
                }
                target.setStringValue(travelSector);
            }
        }
        
        /**
         * Sets (as xml) the "TravelSector" attribute
         */
        public void xsetTravelSector(org.iata.iata.x2007.x00.IATACodeType travelSector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.IATACodeType target = null;
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TRAVELSECTOR$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(TRAVELSECTOR$2);
                }
                target.set(travelSector);
            }
        }
        
        /**
         * Unsets the "TravelSector" attribute
         */
        public void unsetTravelSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRAVELSECTOR$2);
            }
        }
        
        /**
         * Gets the "Code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Code" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(CODE$4);
                return target;
            }
        }
        
        /**
         * True if has "Code" attribute
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODE$4) != null;
            }
        }
        
        /**
         * Sets the "Code" attribute
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$4);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "Code" attribute
         */
        public void xsetCode(org.iata.iata.x2007.x00.StringLength1To16 code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(CODE$4);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(CODE$4);
                }
                target.set(code);
            }
        }
        
        /**
         * Unsets the "Code" attribute
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODE$4);
            }
        }
        
        /**
         * Gets the "CodeContext" attribute
         */
        public java.lang.String getCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$6);
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
        public org.iata.iata.x2007.x00.StringLength1To32 xgetCodeContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CODECONTEXT$6);
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
                return get_store().find_attribute_user(CODECONTEXT$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECONTEXT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECONTEXT$6);
                }
                target.setStringValue(codeContext);
            }
        }
        
        /**
         * Sets (as xml) the "CodeContext" attribute
         */
        public void xsetCodeContext(org.iata.iata.x2007.x00.StringLength1To32 codeContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To32 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_attribute_user(CODECONTEXT$6);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_attribute_user(CODECONTEXT$6);
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
                get_store().remove_attribute(CODECONTEXT$6);
            }
        }
        
        /**
         * Gets the "FlightNumber" attribute
         */
        public java.lang.String getFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIGHTNUMBER$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FlightNumber" attribute
         */
        public org.iata.iata.x2007.x00.FlightNumberType xgetFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightNumberType target = null;
                target = (org.iata.iata.x2007.x00.FlightNumberType)get_store().find_attribute_user(FLIGHTNUMBER$8);
                return target;
            }
        }
        
        /**
         * True if has "FlightNumber" attribute
         */
        public boolean isSetFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FLIGHTNUMBER$8) != null;
            }
        }
        
        /**
         * Sets the "FlightNumber" attribute
         */
        public void setFlightNumber(java.lang.String flightNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIGHTNUMBER$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLIGHTNUMBER$8);
                }
                target.setStringValue(flightNumber);
            }
        }
        
        /**
         * Sets (as xml) the "FlightNumber" attribute
         */
        public void xsetFlightNumber(org.iata.iata.x2007.x00.FlightNumberType flightNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.FlightNumberType target = null;
                target = (org.iata.iata.x2007.x00.FlightNumberType)get_store().find_attribute_user(FLIGHTNUMBER$8);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.FlightNumberType)get_store().add_attribute_user(FLIGHTNUMBER$8);
                }
                target.set(flightNumber);
            }
        }
        
        /**
         * Unsets the "FlightNumber" attribute
         */
        public void unsetFlightNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FLIGHTNUMBER$8);
            }
        }
        
        /**
         * Gets the "ResBookDesigCode" attribute
         */
        public java.lang.String getResBookDesigCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESBOOKDESIGCODE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ResBookDesigCode" attribute
         */
        public org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2 xgetResBookDesigCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2 target = null;
                target = (org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2)get_store().find_attribute_user(RESBOOKDESIGCODE$10);
                return target;
            }
        }
        
        /**
         * True if has "ResBookDesigCode" attribute
         */
        public boolean isSetResBookDesigCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESBOOKDESIGCODE$10) != null;
            }
        }
        
        /**
         * Sets the "ResBookDesigCode" attribute
         */
        public void setResBookDesigCode(java.lang.String resBookDesigCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESBOOKDESIGCODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESBOOKDESIGCODE$10);
                }
                target.setStringValue(resBookDesigCode);
            }
        }
        
        /**
         * Sets (as xml) the "ResBookDesigCode" attribute
         */
        public void xsetResBookDesigCode(org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2 resBookDesigCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2 target = null;
                target = (org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2)get_store().find_attribute_user(RESBOOKDESIGCODE$10);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.UpperCaseAlphaLength1To2)get_store().add_attribute_user(RESBOOKDESIGCODE$10);
                }
                target.set(resBookDesigCode);
            }
        }
        
        /**
         * Unsets the "ResBookDesigCode" attribute
         */
        public void unsetResBookDesigCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESBOOKDESIGCODE$10);
            }
        }
        
        /**
         * Gets the "OperationalSuffix" attribute
         */
        public java.lang.String getOperationalSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATIONALSUFFIX$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperationalSuffix" attribute
         */
        public org.iata.iata.x2007.x00.OperationalSuffixType xgetOperationalSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.OperationalSuffixType target = null;
                target = (org.iata.iata.x2007.x00.OperationalSuffixType)get_store().find_attribute_user(OPERATIONALSUFFIX$12);
                return target;
            }
        }
        
        /**
         * True if has "OperationalSuffix" attribute
         */
        public boolean isSetOperationalSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OPERATIONALSUFFIX$12) != null;
            }
        }
        
        /**
         * Sets the "OperationalSuffix" attribute
         */
        public void setOperationalSuffix(java.lang.String operationalSuffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATIONALSUFFIX$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATIONALSUFFIX$12);
                }
                target.setStringValue(operationalSuffix);
            }
        }
        
        /**
         * Sets (as xml) the "OperationalSuffix" attribute
         */
        public void xsetOperationalSuffix(org.iata.iata.x2007.x00.OperationalSuffixType operationalSuffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.OperationalSuffixType target = null;
                target = (org.iata.iata.x2007.x00.OperationalSuffixType)get_store().find_attribute_user(OPERATIONALSUFFIX$12);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.OperationalSuffixType)get_store().add_attribute_user(OPERATIONALSUFFIX$12);
                }
                target.set(operationalSuffix);
            }
        }
        
        /**
         * Unsets the "OperationalSuffix" attribute
         */
        public void unsetOperationalSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OPERATIONALSUFFIX$12);
            }
        }
    }
}
