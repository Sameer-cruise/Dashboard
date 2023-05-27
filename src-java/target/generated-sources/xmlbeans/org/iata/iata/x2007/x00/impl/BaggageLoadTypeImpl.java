/*
 * XML Type:  BaggageLoadType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.BaggageLoadType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML BaggageLoadType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class BaggageLoadTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.BaggageLoadType
{
    
    public BaggageLoadTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BAGCOUNT$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "BagCount");
    private static final javax.xml.namespace.QName WEIGHT$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Weight");
    private static final javax.xml.namespace.QName SERVICECLASS$4 = 
        new javax.xml.namespace.QName("", "ServiceClass");
    private static final javax.xml.namespace.QName DESTINATIONTYPE$6 = 
        new javax.xml.namespace.QName("", "DestinationType");
    private static final javax.xml.namespace.QName REPEATINDEX$8 = 
        new javax.xml.namespace.QName("", "RepeatIndex");
    
    
    /**
     * Gets array of all "BagCount" elements
     */
    public org.iata.iata.x2007.x00.BaggageLoadType.BagCount[] getBagCountArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BAGCOUNT$0, targetList);
            org.iata.iata.x2007.x00.BaggageLoadType.BagCount[] result = new org.iata.iata.x2007.x00.BaggageLoadType.BagCount[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BagCount" element
     */
    public org.iata.iata.x2007.x00.BaggageLoadType.BagCount getBagCountArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BaggageLoadType.BagCount target = null;
            target = (org.iata.iata.x2007.x00.BaggageLoadType.BagCount)get_store().find_element_user(BAGCOUNT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BagCount" element
     */
    public int sizeOfBagCountArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BAGCOUNT$0);
        }
    }
    
    /**
     * Sets array of all "BagCount" element
     */
    public void setBagCountArray(org.iata.iata.x2007.x00.BaggageLoadType.BagCount[] bagCountArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bagCountArray, BAGCOUNT$0);
        }
    }
    
    /**
     * Sets ith "BagCount" element
     */
    public void setBagCountArray(int i, org.iata.iata.x2007.x00.BaggageLoadType.BagCount bagCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BaggageLoadType.BagCount target = null;
            target = (org.iata.iata.x2007.x00.BaggageLoadType.BagCount)get_store().find_element_user(BAGCOUNT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bagCount);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BagCount" element
     */
    public org.iata.iata.x2007.x00.BaggageLoadType.BagCount insertNewBagCount(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BaggageLoadType.BagCount target = null;
            target = (org.iata.iata.x2007.x00.BaggageLoadType.BagCount)get_store().insert_element_user(BAGCOUNT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BagCount" element
     */
    public org.iata.iata.x2007.x00.BaggageLoadType.BagCount addNewBagCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.BaggageLoadType.BagCount target = null;
            target = (org.iata.iata.x2007.x00.BaggageLoadType.BagCount)get_store().add_element_user(BAGCOUNT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "BagCount" element
     */
    public void removeBagCount(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BAGCOUNT$0, i);
        }
    }
    
    /**
     * Gets the "Weight" element
     */
    public org.iata.iata.x2007.x00.MeasurementType getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementType)get_store().find_element_user(WEIGHT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Weight" element
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEIGHT$2) != 0;
        }
    }
    
    /**
     * Sets the "Weight" element
     */
    public void setWeight(org.iata.iata.x2007.x00.MeasurementType weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementType)get_store().find_element_user(WEIGHT$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.MeasurementType)get_store().add_element_user(WEIGHT$2);
            }
            target.set(weight);
        }
    }
    
    /**
     * Appends and returns a new empty "Weight" element
     */
    public org.iata.iata.x2007.x00.MeasurementType addNewWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.MeasurementType target = null;
            target = (org.iata.iata.x2007.x00.MeasurementType)get_store().add_element_user(WEIGHT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Weight" element
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEIGHT$2, 0);
        }
    }
    
    /**
     * Gets the "ServiceClass" attribute
     */
    public java.lang.String getServiceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICECLASS$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ServiceClass" attribute
     */
    public org.iata.iata.x2007.x00.IATACodeType xgetServiceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(SERVICECLASS$4);
            return target;
        }
    }
    
    /**
     * True if has "ServiceClass" attribute
     */
    public boolean isSetServiceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVICECLASS$4) != null;
        }
    }
    
    /**
     * Sets the "ServiceClass" attribute
     */
    public void setServiceClass(java.lang.String serviceClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICECLASS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICECLASS$4);
            }
            target.setStringValue(serviceClass);
        }
    }
    
    /**
     * Sets (as xml) the "ServiceClass" attribute
     */
    public void xsetServiceClass(org.iata.iata.x2007.x00.IATACodeType serviceClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(SERVICECLASS$4);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(SERVICECLASS$4);
            }
            target.set(serviceClass);
        }
    }
    
    /**
     * Unsets the "ServiceClass" attribute
     */
    public void unsetServiceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVICECLASS$4);
        }
    }
    
    /**
     * Gets the "DestinationType" attribute
     */
    public org.iata.iata.x2007.x00.DestinationType.Enum getDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATIONTYPE$6);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.DestinationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DestinationType" attribute
     */
    public org.iata.iata.x2007.x00.DestinationType xgetDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DestinationType target = null;
            target = (org.iata.iata.x2007.x00.DestinationType)get_store().find_attribute_user(DESTINATIONTYPE$6);
            return target;
        }
    }
    
    /**
     * True if has "DestinationType" attribute
     */
    public boolean isSetDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESTINATIONTYPE$6) != null;
        }
    }
    
    /**
     * Sets the "DestinationType" attribute
     */
    public void setDestinationType(org.iata.iata.x2007.x00.DestinationType.Enum destinationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATIONTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESTINATIONTYPE$6);
            }
            target.setEnumValue(destinationType);
        }
    }
    
    /**
     * Sets (as xml) the "DestinationType" attribute
     */
    public void xsetDestinationType(org.iata.iata.x2007.x00.DestinationType destinationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.DestinationType target = null;
            target = (org.iata.iata.x2007.x00.DestinationType)get_store().find_attribute_user(DESTINATIONTYPE$6);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.DestinationType)get_store().add_attribute_user(DESTINATIONTYPE$6);
            }
            target.set(destinationType);
        }
    }
    
    /**
     * Unsets the "DestinationType" attribute
     */
    public void unsetDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESTINATIONTYPE$6);
        }
    }
    
    /**
     * Gets the "RepeatIndex" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getRepeatIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(REPEATINDEX$8);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RepeatIndex" attribute
     */
    public boolean isSetRepeatIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPEATINDEX$8) != null;
        }
    }
    
    /**
     * Sets the "RepeatIndex" attribute
     */
    public void setRepeatIndex(org.apache.xmlbeans.XmlAnySimpleType repeatIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(REPEATINDEX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(REPEATINDEX$8);
            }
            target.set(repeatIndex);
        }
    }
    
    /**
     * Appends and returns a new empty "RepeatIndex" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewRepeatIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(REPEATINDEX$8);
            return target;
        }
    }
    
    /**
     * Unsets the "RepeatIndex" attribute
     */
    public void unsetRepeatIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPEATINDEX$8);
        }
    }
    /**
     * An XML BagCount(@http://www.iata.org/IATA/2007/00).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.BaggageLoadType$BagCount.
     */
    public static class BagCountImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements org.iata.iata.x2007.x00.BaggageLoadType.BagCount
    {
        
        public BagCountImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected BagCountImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LOCATION$0 = 
            new javax.xml.namespace.QName("", "Location");
        
        
        /**
         * Gets the "Location" attribute
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Location" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$0);
                return target;
            }
        }
        
        /**
         * Sets the "Location" attribute
         */
        public void setLocation(java.lang.String location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$0);
                }
                target.setStringValue(location);
            }
        }
        
        /**
         * Sets (as xml) the "Location" attribute
         */
        public void xsetLocation(org.apache.xmlbeans.XmlString location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATION$0);
                }
                target.set(location);
            }
        }
    }
}
