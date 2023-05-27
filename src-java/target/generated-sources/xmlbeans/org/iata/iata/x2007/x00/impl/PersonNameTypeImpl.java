/*
 * XML Type:  PersonNameType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.PersonNameType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML PersonNameType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class PersonNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PersonNameType
{
    
    public PersonNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEPREFIX$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "NamePrefix");
    private static final javax.xml.namespace.QName GIVENNAME$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "GivenName");
    private static final javax.xml.namespace.QName MIDDLENAME$4 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "MiddleName");
    private static final javax.xml.namespace.QName SURNAMEPREFIX$6 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "SurnamePrefix");
    private static final javax.xml.namespace.QName SURNAME$8 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "Surname");
    private static final javax.xml.namespace.QName NAMESUFFIX$10 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "NameSuffix");
    private static final javax.xml.namespace.QName NAMETITLE$12 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "NameTitle");
    private static final javax.xml.namespace.QName SHARESYNCHIND$14 = 
        new javax.xml.namespace.QName("", "ShareSynchInd");
    private static final javax.xml.namespace.QName SHAREMARKETIND$16 = 
        new javax.xml.namespace.QName("", "ShareMarketInd");
    private static final javax.xml.namespace.QName NAMETYPE$18 = 
        new javax.xml.namespace.QName("", "NameType");
    
    
    /**
     * Gets array of all "NamePrefix" elements
     */
    public java.lang.String[] getNamePrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMEPREFIX$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "NamePrefix" element
     */
    public java.lang.String getNamePrefixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEPREFIX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "NamePrefix" elements
     */
    public org.iata.iata.x2007.x00.StringLength1To16[] xgetNamePrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMEPREFIX$0, targetList);
            org.iata.iata.x2007.x00.StringLength1To16[] result = new org.iata.iata.x2007.x00.StringLength1To16[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "NamePrefix" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 xgetNamePrefixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_element_user(NAMEPREFIX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.iata.iata.x2007.x00.StringLength1To16)target;
        }
    }
    
    /**
     * Returns number of "NamePrefix" element
     */
    public int sizeOfNamePrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEPREFIX$0);
        }
    }
    
    /**
     * Sets array of all "NamePrefix" element
     */
    public void setNamePrefixArray(java.lang.String[] namePrefixArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(namePrefixArray, NAMEPREFIX$0);
        }
    }
    
    /**
     * Sets ith "NamePrefix" element
     */
    public void setNamePrefixArray(int i, java.lang.String namePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEPREFIX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(namePrefix);
        }
    }
    
    /**
     * Sets (as xml) array of all "NamePrefix" element
     */
    public void xsetNamePrefixArray(org.iata.iata.x2007.x00.StringLength1To16[]namePrefixArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(namePrefixArray, NAMEPREFIX$0);
        }
    }
    
    /**
     * Sets (as xml) ith "NamePrefix" element
     */
    public void xsetNamePrefixArray(int i, org.iata.iata.x2007.x00.StringLength1To16 namePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_element_user(NAMEPREFIX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(namePrefix);
        }
    }
    
    /**
     * Inserts the value as the ith "NamePrefix" element
     */
    public void insertNamePrefix(int i, java.lang.String namePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAMEPREFIX$0, i);
            target.setStringValue(namePrefix);
        }
    }
    
    /**
     * Appends the value as the last "NamePrefix" element
     */
    public void addNamePrefix(java.lang.String namePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMEPREFIX$0);
            target.setStringValue(namePrefix);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NamePrefix" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 insertNewNamePrefix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().insert_element_user(NAMEPREFIX$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NamePrefix" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 addNewNamePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_element_user(NAMEPREFIX$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "NamePrefix" element
     */
    public void removeNamePrefix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEPREFIX$0, i);
        }
    }
    
    /**
     * Gets array of all "GivenName" elements
     */
    public java.lang.String[] getGivenNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GIVENNAME$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "GivenName" element
     */
    public java.lang.String getGivenNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "GivenName" elements
     */
    public org.iata.iata.x2007.x00.StringLength1To64[] xgetGivenNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GIVENNAME$2, targetList);
            org.iata.iata.x2007.x00.StringLength1To64[] result = new org.iata.iata.x2007.x00.StringLength1To64[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "GivenName" element
     */
    public org.iata.iata.x2007.x00.StringLength1To64 xgetGivenNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(GIVENNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.iata.iata.x2007.x00.StringLength1To64)target;
        }
    }
    
    /**
     * Returns number of "GivenName" element
     */
    public int sizeOfGivenNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GIVENNAME$2);
        }
    }
    
    /**
     * Sets array of all "GivenName" element
     */
    public void setGivenNameArray(java.lang.String[] givenNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(givenNameArray, GIVENNAME$2);
        }
    }
    
    /**
     * Sets ith "GivenName" element
     */
    public void setGivenNameArray(int i, java.lang.String givenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(givenName);
        }
    }
    
    /**
     * Sets (as xml) array of all "GivenName" element
     */
    public void xsetGivenNameArray(org.iata.iata.x2007.x00.StringLength1To64[]givenNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(givenNameArray, GIVENNAME$2);
        }
    }
    
    /**
     * Sets (as xml) ith "GivenName" element
     */
    public void xsetGivenNameArray(int i, org.iata.iata.x2007.x00.StringLength1To64 givenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(GIVENNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(givenName);
        }
    }
    
    /**
     * Inserts the value as the ith "GivenName" element
     */
    public void insertGivenName(int i, java.lang.String givenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GIVENNAME$2, i);
            target.setStringValue(givenName);
        }
    }
    
    /**
     * Appends the value as the last "GivenName" element
     */
    public void addGivenName(java.lang.String givenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIVENNAME$2);
            target.setStringValue(givenName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GivenName" element
     */
    public org.iata.iata.x2007.x00.StringLength1To64 insertNewGivenName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().insert_element_user(GIVENNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GivenName" element
     */
    public org.iata.iata.x2007.x00.StringLength1To64 addNewGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_element_user(GIVENNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "GivenName" element
     */
    public void removeGivenName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GIVENNAME$2, i);
        }
    }
    
    /**
     * Gets array of all "MiddleName" elements
     */
    public java.lang.String[] getMiddleNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MIDDLENAME$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "MiddleName" element
     */
    public java.lang.String getMiddleNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLENAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "MiddleName" elements
     */
    public org.iata.iata.x2007.x00.StringLength1To64[] xgetMiddleNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MIDDLENAME$4, targetList);
            org.iata.iata.x2007.x00.StringLength1To64[] result = new org.iata.iata.x2007.x00.StringLength1To64[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "MiddleName" element
     */
    public org.iata.iata.x2007.x00.StringLength1To64 xgetMiddleNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(MIDDLENAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.iata.iata.x2007.x00.StringLength1To64)target;
        }
    }
    
    /**
     * Returns number of "MiddleName" element
     */
    public int sizeOfMiddleNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIDDLENAME$4);
        }
    }
    
    /**
     * Sets array of all "MiddleName" element
     */
    public void setMiddleNameArray(java.lang.String[] middleNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(middleNameArray, MIDDLENAME$4);
        }
    }
    
    /**
     * Sets ith "MiddleName" element
     */
    public void setMiddleNameArray(int i, java.lang.String middleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLENAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(middleName);
        }
    }
    
    /**
     * Sets (as xml) array of all "MiddleName" element
     */
    public void xsetMiddleNameArray(org.iata.iata.x2007.x00.StringLength1To64[]middleNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(middleNameArray, MIDDLENAME$4);
        }
    }
    
    /**
     * Sets (as xml) ith "MiddleName" element
     */
    public void xsetMiddleNameArray(int i, org.iata.iata.x2007.x00.StringLength1To64 middleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(MIDDLENAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(middleName);
        }
    }
    
    /**
     * Inserts the value as the ith "MiddleName" element
     */
    public void insertMiddleName(int i, java.lang.String middleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MIDDLENAME$4, i);
            target.setStringValue(middleName);
        }
    }
    
    /**
     * Appends the value as the last "MiddleName" element
     */
    public void addMiddleName(java.lang.String middleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDDLENAME$4);
            target.setStringValue(middleName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MiddleName" element
     */
    public org.iata.iata.x2007.x00.StringLength1To64 insertNewMiddleName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().insert_element_user(MIDDLENAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MiddleName" element
     */
    public org.iata.iata.x2007.x00.StringLength1To64 addNewMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_element_user(MIDDLENAME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "MiddleName" element
     */
    public void removeMiddleName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIDDLENAME$4, i);
        }
    }
    
    /**
     * Gets the "SurnamePrefix" element
     */
    public java.lang.String getSurnamePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURNAMEPREFIX$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SurnamePrefix" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 xgetSurnamePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_element_user(SURNAMEPREFIX$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "SurnamePrefix" element
     */
    public boolean isSetSurnamePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURNAMEPREFIX$6) != 0;
        }
    }
    
    /**
     * Sets the "SurnamePrefix" element
     */
    public void setSurnamePrefix(java.lang.String surnamePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURNAMEPREFIX$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SURNAMEPREFIX$6);
            }
            target.setStringValue(surnamePrefix);
        }
    }
    
    /**
     * Sets (as xml) the "SurnamePrefix" element
     */
    public void xsetSurnamePrefix(org.iata.iata.x2007.x00.StringLength1To16 surnamePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_element_user(SURNAMEPREFIX$6, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_element_user(SURNAMEPREFIX$6);
            }
            target.set(surnamePrefix);
        }
    }
    
    /**
     * Unsets the "SurnamePrefix" element
     */
    public void unsetSurnamePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURNAMEPREFIX$6, 0);
        }
    }
    
    /**
     * Gets the "Surname" element
     */
    public java.lang.String getSurname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Surname" element
     */
    public org.iata.iata.x2007.x00.StringLength1To64 xgetSurname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(SURNAME$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Surname" element
     */
    public void setSurname(java.lang.String surname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SURNAME$8);
            }
            target.setStringValue(surname);
        }
    }
    
    /**
     * Sets (as xml) the "Surname" element
     */
    public void xsetSurname(org.iata.iata.x2007.x00.StringLength1To64 surname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(SURNAME$8, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_element_user(SURNAME$8);
            }
            target.set(surname);
        }
    }
    
    /**
     * Gets array of all "NameSuffix" elements
     */
    public java.lang.String[] getNameSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMESUFFIX$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "NameSuffix" element
     */
    public java.lang.String getNameSuffixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMESUFFIX$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "NameSuffix" elements
     */
    public org.iata.iata.x2007.x00.StringLength1To16[] xgetNameSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMESUFFIX$10, targetList);
            org.iata.iata.x2007.x00.StringLength1To16[] result = new org.iata.iata.x2007.x00.StringLength1To16[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "NameSuffix" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 xgetNameSuffixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_element_user(NAMESUFFIX$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.iata.iata.x2007.x00.StringLength1To16)target;
        }
    }
    
    /**
     * Returns number of "NameSuffix" element
     */
    public int sizeOfNameSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMESUFFIX$10);
        }
    }
    
    /**
     * Sets array of all "NameSuffix" element
     */
    public void setNameSuffixArray(java.lang.String[] nameSuffixArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameSuffixArray, NAMESUFFIX$10);
        }
    }
    
    /**
     * Sets ith "NameSuffix" element
     */
    public void setNameSuffixArray(int i, java.lang.String nameSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMESUFFIX$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(nameSuffix);
        }
    }
    
    /**
     * Sets (as xml) array of all "NameSuffix" element
     */
    public void xsetNameSuffixArray(org.iata.iata.x2007.x00.StringLength1To16[]nameSuffixArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameSuffixArray, NAMESUFFIX$10);
        }
    }
    
    /**
     * Sets (as xml) ith "NameSuffix" element
     */
    public void xsetNameSuffixArray(int i, org.iata.iata.x2007.x00.StringLength1To16 nameSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_element_user(NAMESUFFIX$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nameSuffix);
        }
    }
    
    /**
     * Inserts the value as the ith "NameSuffix" element
     */
    public void insertNameSuffix(int i, java.lang.String nameSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAMESUFFIX$10, i);
            target.setStringValue(nameSuffix);
        }
    }
    
    /**
     * Appends the value as the last "NameSuffix" element
     */
    public void addNameSuffix(java.lang.String nameSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMESUFFIX$10);
            target.setStringValue(nameSuffix);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameSuffix" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 insertNewNameSuffix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().insert_element_user(NAMESUFFIX$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameSuffix" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 addNewNameSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_element_user(NAMESUFFIX$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "NameSuffix" element
     */
    public void removeNameSuffix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMESUFFIX$10, i);
        }
    }
    
    /**
     * Gets array of all "NameTitle" elements
     */
    public java.lang.String[] getNameTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMETITLE$12, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "NameTitle" element
     */
    public java.lang.String getNameTitleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMETITLE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "NameTitle" elements
     */
    public org.iata.iata.x2007.x00.StringLength1To16[] xgetNameTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMETITLE$12, targetList);
            org.iata.iata.x2007.x00.StringLength1To16[] result = new org.iata.iata.x2007.x00.StringLength1To16[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "NameTitle" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 xgetNameTitleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_element_user(NAMETITLE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.iata.iata.x2007.x00.StringLength1To16)target;
        }
    }
    
    /**
     * Returns number of "NameTitle" element
     */
    public int sizeOfNameTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMETITLE$12);
        }
    }
    
    /**
     * Sets array of all "NameTitle" element
     */
    public void setNameTitleArray(java.lang.String[] nameTitleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameTitleArray, NAMETITLE$12);
        }
    }
    
    /**
     * Sets ith "NameTitle" element
     */
    public void setNameTitleArray(int i, java.lang.String nameTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMETITLE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(nameTitle);
        }
    }
    
    /**
     * Sets (as xml) array of all "NameTitle" element
     */
    public void xsetNameTitleArray(org.iata.iata.x2007.x00.StringLength1To16[]nameTitleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameTitleArray, NAMETITLE$12);
        }
    }
    
    /**
     * Sets (as xml) ith "NameTitle" element
     */
    public void xsetNameTitleArray(int i, org.iata.iata.x2007.x00.StringLength1To16 nameTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_element_user(NAMETITLE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nameTitle);
        }
    }
    
    /**
     * Inserts the value as the ith "NameTitle" element
     */
    public void insertNameTitle(int i, java.lang.String nameTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAMETITLE$12, i);
            target.setStringValue(nameTitle);
        }
    }
    
    /**
     * Appends the value as the last "NameTitle" element
     */
    public void addNameTitle(java.lang.String nameTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMETITLE$12);
            target.setStringValue(nameTitle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameTitle" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 insertNewNameTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().insert_element_user(NAMETITLE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameTitle" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 addNewNameTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_element_user(NAMETITLE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "NameTitle" element
     */
    public void removeNameTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMETITLE$12, i);
        }
    }
    
    /**
     * Gets the "ShareSynchInd" attribute
     */
    public org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd.Enum getShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESYNCHIND$14);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShareSynchInd" attribute
     */
    public org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd xgetShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd target = null;
            target = (org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd)get_store().find_attribute_user(SHARESYNCHIND$14);
            return target;
        }
    }
    
    /**
     * True if has "ShareSynchInd" attribute
     */
    public boolean isSetShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHARESYNCHIND$14) != null;
        }
    }
    
    /**
     * Sets the "ShareSynchInd" attribute
     */
    public void setShareSynchInd(org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd.Enum shareSynchInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESYNCHIND$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHARESYNCHIND$14);
            }
            target.setEnumValue(shareSynchInd);
        }
    }
    
    /**
     * Sets (as xml) the "ShareSynchInd" attribute
     */
    public void xsetShareSynchInd(org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd shareSynchInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd target = null;
            target = (org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd)get_store().find_attribute_user(SHARESYNCHIND$14);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd)get_store().add_attribute_user(SHARESYNCHIND$14);
            }
            target.set(shareSynchInd);
        }
    }
    
    /**
     * Unsets the "ShareSynchInd" attribute
     */
    public void unsetShareSynchInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHARESYNCHIND$14);
        }
    }
    
    /**
     * Gets the "ShareMarketInd" attribute
     */
    public org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd.Enum getShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREMARKETIND$16);
            if (target == null)
            {
                return null;
            }
            return (org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShareMarketInd" attribute
     */
    public org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd xgetShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd target = null;
            target = (org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd)get_store().find_attribute_user(SHAREMARKETIND$16);
            return target;
        }
    }
    
    /**
     * True if has "ShareMarketInd" attribute
     */
    public boolean isSetShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHAREMARKETIND$16) != null;
        }
    }
    
    /**
     * Sets the "ShareMarketInd" attribute
     */
    public void setShareMarketInd(org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd.Enum shareMarketInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREMARKETIND$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHAREMARKETIND$16);
            }
            target.setEnumValue(shareMarketInd);
        }
    }
    
    /**
     * Sets (as xml) the "ShareMarketInd" attribute
     */
    public void xsetShareMarketInd(org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd shareMarketInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd target = null;
            target = (org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd)get_store().find_attribute_user(SHAREMARKETIND$16);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd)get_store().add_attribute_user(SHAREMARKETIND$16);
            }
            target.set(shareMarketInd);
        }
    }
    
    /**
     * Unsets the "ShareMarketInd" attribute
     */
    public void unsetShareMarketInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHAREMARKETIND$16);
        }
    }
    
    /**
     * Gets the "NameType" attribute
     */
    public java.lang.String getNameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NameType" attribute
     */
    public org.iata.iata.x2007.x00.IATACodeType xgetNameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(NAMETYPE$18);
            return target;
        }
    }
    
    /**
     * True if has "NameType" attribute
     */
    public boolean isSetNameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMETYPE$18) != null;
        }
    }
    
    /**
     * Sets the "NameType" attribute
     */
    public void setNameType(java.lang.String nameType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMETYPE$18);
            }
            target.setStringValue(nameType);
        }
    }
    
    /**
     * Sets (as xml) the "NameType" attribute
     */
    public void xsetNameType(org.iata.iata.x2007.x00.IATACodeType nameType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(NAMETYPE$18);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(NAMETYPE$18);
            }
            target.set(nameType);
        }
    }
    
    /**
     * Unsets the "NameType" attribute
     */
    public void unsetNameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMETYPE$18);
        }
    }
    /**
     * An XML ShareSynchInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PersonNameType$ShareSynchInd.
     */
    public static class ShareSynchIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.PersonNameType.ShareSynchInd
    {
        
        public ShareSynchIndImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ShareSynchIndImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML ShareMarketInd(@).
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PersonNameType$ShareMarketInd.
     */
    public static class ShareMarketIndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.PersonNameType.ShareMarketInd
    {
        
        public ShareMarketIndImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ShareMarketIndImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
