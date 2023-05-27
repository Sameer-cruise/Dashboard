/*
 * XML Type:  POS_Type
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.POSType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML POS_Type(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class POSTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.POSType
{
    
    public POSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Source");
    
    
    /**
     * Gets array of all "Source" elements
     */
    public org.iata.iata.x2007.x00.SourceType[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$0, targetList);
            org.iata.iata.x2007.x00.SourceType[] result = new org.iata.iata.x2007.x00.SourceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Source" element
     */
    public org.iata.iata.x2007.x00.SourceType getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType target = null;
            target = (org.iata.iata.x2007.x00.SourceType)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Source" element
     */
    public int sizeOfSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$0);
        }
    }
    
    /**
     * Sets array of all "Source" element
     */
    public void setSourceArray(org.iata.iata.x2007.x00.SourceType[] sourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceArray, SOURCE$0);
        }
    }
    
    /**
     * Sets ith "Source" element
     */
    public void setSourceArray(int i, org.iata.iata.x2007.x00.SourceType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType target = null;
            target = (org.iata.iata.x2007.x00.SourceType)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    public org.iata.iata.x2007.x00.SourceType insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType target = null;
            target = (org.iata.iata.x2007.x00.SourceType)get_store().insert_element_user(SOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    public org.iata.iata.x2007.x00.SourceType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.SourceType target = null;
            target = (org.iata.iata.x2007.x00.SourceType)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Source" element
     */
    public void removeSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$0, i);
        }
    }
}
