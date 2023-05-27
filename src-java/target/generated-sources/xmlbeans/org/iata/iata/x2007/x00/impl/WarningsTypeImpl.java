/*
 * XML Type:  WarningsType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.WarningsType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML WarningsType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class WarningsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.WarningsType
{
    
    public WarningsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WARNING$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Warning");
    
    
    /**
     * Gets array of all "Warning" elements
     */
    public org.iata.iata.x2007.x00.WarningType[] getWarningArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WARNING$0, targetList);
            org.iata.iata.x2007.x00.WarningType[] result = new org.iata.iata.x2007.x00.WarningType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Warning" element
     */
    public org.iata.iata.x2007.x00.WarningType getWarningArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.WarningType target = null;
            target = (org.iata.iata.x2007.x00.WarningType)get_store().find_element_user(WARNING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Warning" element
     */
    public int sizeOfWarningArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WARNING$0);
        }
    }
    
    /**
     * Sets array of all "Warning" element
     */
    public void setWarningArray(org.iata.iata.x2007.x00.WarningType[] warningArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(warningArray, WARNING$0);
        }
    }
    
    /**
     * Sets ith "Warning" element
     */
    public void setWarningArray(int i, org.iata.iata.x2007.x00.WarningType warning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.WarningType target = null;
            target = (org.iata.iata.x2007.x00.WarningType)get_store().find_element_user(WARNING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(warning);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Warning" element
     */
    public org.iata.iata.x2007.x00.WarningType insertNewWarning(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.WarningType target = null;
            target = (org.iata.iata.x2007.x00.WarningType)get_store().insert_element_user(WARNING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Warning" element
     */
    public org.iata.iata.x2007.x00.WarningType addNewWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.WarningType target = null;
            target = (org.iata.iata.x2007.x00.WarningType)get_store().add_element_user(WARNING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Warning" element
     */
    public void removeWarning(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WARNING$0, i);
        }
    }
}
