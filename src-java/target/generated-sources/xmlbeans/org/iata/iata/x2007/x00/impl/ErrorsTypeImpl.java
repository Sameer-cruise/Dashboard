/*
 * XML Type:  ErrorsType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.ErrorsType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML ErrorsType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class ErrorsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.ErrorsType
{
    
    public ErrorsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Error");
    
    
    /**
     * Gets array of all "Error" elements
     */
    public org.iata.iata.x2007.x00.ErrorType[] getErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERROR$0, targetList);
            org.iata.iata.x2007.x00.ErrorType[] result = new org.iata.iata.x2007.x00.ErrorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Error" element
     */
    public org.iata.iata.x2007.x00.ErrorType getErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.ErrorType target = null;
            target = (org.iata.iata.x2007.x00.ErrorType)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Error" element
     */
    public int sizeOfErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$0);
        }
    }
    
    /**
     * Sets array of all "Error" element
     */
    public void setErrorArray(org.iata.iata.x2007.x00.ErrorType[] errorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorArray, ERROR$0);
        }
    }
    
    /**
     * Sets ith "Error" element
     */
    public void setErrorArray(int i, org.iata.iata.x2007.x00.ErrorType error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.ErrorType target = null;
            target = (org.iata.iata.x2007.x00.ErrorType)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(error);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Error" element
     */
    public org.iata.iata.x2007.x00.ErrorType insertNewError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.ErrorType target = null;
            target = (org.iata.iata.x2007.x00.ErrorType)get_store().insert_element_user(ERROR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Error" element
     */
    public org.iata.iata.x2007.x00.ErrorType addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.ErrorType target = null;
            target = (org.iata.iata.x2007.x00.ErrorType)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Error" element
     */
    public void removeError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$0, i);
        }
    }
}
