/*
 * XML Type:  AddressType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.AddressType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML AddressType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class AddressTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.AddressType
{
    
    public AddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETNMBR$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "StreetNmbr");
    private static final javax.xml.namespace.QName BLDGROOM$2 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "BldgRoom");
    private static final javax.xml.namespace.QName ADDRESSLINE$4 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "AddressLine");
    private static final javax.xml.namespace.QName CITYNAME$6 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CityName");
    private static final javax.xml.namespace.QName POSTALCODE$8 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PostalCode");
    private static final javax.xml.namespace.QName COUNTY$10 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "County");
    private static final javax.xml.namespace.QName STATEPROV$12 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "StateProv");
    private static final javax.xml.namespace.QName COUNTRYNAME$14 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "CountryName");
    private static final javax.xml.namespace.QName FORMATTEDIND$16 = 
        new javax.xml.namespace.QName("", "FormattedInd");
    private static final javax.xml.namespace.QName DEFAULTIND$18 = 
        new javax.xml.namespace.QName("", "DefaultInd");
    private static final javax.xml.namespace.QName USETYPE$20 = 
        new javax.xml.namespace.QName("", "UseType");
    private static final javax.xml.namespace.QName RPH$22 = 
        new javax.xml.namespace.QName("", "RPH");
    private static final javax.xml.namespace.QName TYPE$24 = 
        new javax.xml.namespace.QName("", "Type");
    
    
    /**
     * Gets the "StreetNmbr" element
     */
    public org.iata.iata.x2007.x00.AddressType.StreetNmbr getStreetNmbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AddressType.StreetNmbr target = null;
            target = (org.iata.iata.x2007.x00.AddressType.StreetNmbr)get_store().find_element_user(STREETNMBR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StreetNmbr" element
     */
    public boolean isSetStreetNmbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNMBR$0) != 0;
        }
    }
    
    /**
     * Sets the "StreetNmbr" element
     */
    public void setStreetNmbr(org.iata.iata.x2007.x00.AddressType.StreetNmbr streetNmbr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AddressType.StreetNmbr target = null;
            target = (org.iata.iata.x2007.x00.AddressType.StreetNmbr)get_store().find_element_user(STREETNMBR$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.AddressType.StreetNmbr)get_store().add_element_user(STREETNMBR$0);
            }
            target.set(streetNmbr);
        }
    }
    
    /**
     * Appends and returns a new empty "StreetNmbr" element
     */
    public org.iata.iata.x2007.x00.AddressType.StreetNmbr addNewStreetNmbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.AddressType.StreetNmbr target = null;
            target = (org.iata.iata.x2007.x00.AddressType.StreetNmbr)get_store().add_element_user(STREETNMBR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "StreetNmbr" element
     */
    public void unsetStreetNmbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNMBR$0, 0);
        }
    }
    
    /**
     * Gets the "BldgRoom" element
     */
    public java.lang.String getBldgRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLDGROOM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BldgRoom" element
     */
    public org.iata.iata.x2007.x00.StringLength0To64 xgetBldgRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength0To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength0To64)get_store().find_element_user(BLDGROOM$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "BldgRoom" element
     */
    public boolean isSetBldgRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLDGROOM$2) != 0;
        }
    }
    
    /**
     * Sets the "BldgRoom" element
     */
    public void setBldgRoom(java.lang.String bldgRoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLDGROOM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLDGROOM$2);
            }
            target.setStringValue(bldgRoom);
        }
    }
    
    /**
     * Sets (as xml) the "BldgRoom" element
     */
    public void xsetBldgRoom(org.iata.iata.x2007.x00.StringLength0To64 bldgRoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength0To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength0To64)get_store().find_element_user(BLDGROOM$2, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength0To64)get_store().add_element_user(BLDGROOM$2);
            }
            target.set(bldgRoom);
        }
    }
    
    /**
     * Unsets the "BldgRoom" element
     */
    public void unsetBldgRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLDGROOM$2, 0);
        }
    }
    
    /**
     * Gets array of all "AddressLine" elements
     */
    public java.lang.String[] getAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSLINE$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AddressLine" element
     */
    public java.lang.String getAddressLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AddressLine" elements
     */
    public org.iata.iata.x2007.x00.StringLength1To255[] xgetAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSLINE$4, targetList);
            org.iata.iata.x2007.x00.StringLength1To255[] result = new org.iata.iata.x2007.x00.StringLength1To255[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AddressLine" element
     */
    public org.iata.iata.x2007.x00.StringLength1To255 xgetAddressLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To255 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To255)get_store().find_element_user(ADDRESSLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.iata.iata.x2007.x00.StringLength1To255)target;
        }
    }
    
    /**
     * Returns number of "AddressLine" element
     */
    public int sizeOfAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE$4);
        }
    }
    
    /**
     * Sets array of all "AddressLine" element
     */
    public void setAddressLineArray(java.lang.String[] addressLineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressLineArray, ADDRESSLINE$4);
        }
    }
    
    /**
     * Sets ith "AddressLine" element
     */
    public void setAddressLineArray(int i, java.lang.String addressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(addressLine);
        }
    }
    
    /**
     * Sets (as xml) array of all "AddressLine" element
     */
    public void xsetAddressLineArray(org.iata.iata.x2007.x00.StringLength1To255[]addressLineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressLineArray, ADDRESSLINE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "AddressLine" element
     */
    public void xsetAddressLineArray(int i, org.iata.iata.x2007.x00.StringLength1To255 addressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To255 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To255)get_store().find_element_user(ADDRESSLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(addressLine);
        }
    }
    
    /**
     * Inserts the value as the ith "AddressLine" element
     */
    public void insertAddressLine(int i, java.lang.String addressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ADDRESSLINE$4, i);
            target.setStringValue(addressLine);
        }
    }
    
    /**
     * Appends the value as the last "AddressLine" element
     */
    public void addAddressLine(java.lang.String addressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE$4);
            target.setStringValue(addressLine);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AddressLine" element
     */
    public org.iata.iata.x2007.x00.StringLength1To255 insertNewAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To255 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To255)get_store().insert_element_user(ADDRESSLINE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AddressLine" element
     */
    public org.iata.iata.x2007.x00.StringLength1To255 addNewAddressLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To255 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To255)get_store().add_element_user(ADDRESSLINE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "AddressLine" element
     */
    public void removeAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE$4, i);
        }
    }
    
    /**
     * Gets the "CityName" element
     */
    public java.lang.String getCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CityName" element
     */
    public org.iata.iata.x2007.x00.StringLength1To64 xgetCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(CITYNAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CityName" element
     */
    public boolean isSetCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITYNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "CityName" element
     */
    public void setCityName(java.lang.String cityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITYNAME$6);
            }
            target.setStringValue(cityName);
        }
    }
    
    /**
     * Sets (as xml) the "CityName" element
     */
    public void xsetCityName(org.iata.iata.x2007.x00.StringLength1To64 cityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To64 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().find_element_user(CITYNAME$6, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To64)get_store().add_element_user(CITYNAME$6);
            }
            target.set(cityName);
        }
    }
    
    /**
     * Unsets the "CityName" element
     */
    public void unsetCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITYNAME$6, 0);
        }
    }
    
    /**
     * Gets the "PostalCode" element
     */
    public java.lang.String getPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostalCode" element
     */
    public org.iata.iata.x2007.x00.StringLength1To16 xgetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_element_user(POSTALCODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "PostalCode" element
     */
    public boolean isSetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTALCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "PostalCode" element
     */
    public void setPostalCode(java.lang.String postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTALCODE$8);
            }
            target.setStringValue(postalCode);
        }
    }
    
    /**
     * Sets (as xml) the "PostalCode" element
     */
    public void xsetPostalCode(org.iata.iata.x2007.x00.StringLength1To16 postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To16 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_element_user(POSTALCODE$8, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_element_user(POSTALCODE$8);
            }
            target.set(postalCode);
        }
    }
    
    /**
     * Unsets the "PostalCode" element
     */
    public void unsetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTALCODE$8, 0);
        }
    }
    
    /**
     * Gets the "County" element
     */
    public java.lang.String getCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "County" element
     */
    public org.iata.iata.x2007.x00.StringLength1To32 xgetCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_element_user(COUNTY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "County" element
     */
    public boolean isSetCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTY$10) != 0;
        }
    }
    
    /**
     * Sets the "County" element
     */
    public void setCounty(java.lang.String county)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTY$10);
            }
            target.setStringValue(county);
        }
    }
    
    /**
     * Sets (as xml) the "County" element
     */
    public void xsetCounty(org.iata.iata.x2007.x00.StringLength1To32 county)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StringLength1To32 target = null;
            target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().find_element_user(COUNTY$10, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StringLength1To32)get_store().add_element_user(COUNTY$10);
            }
            target.set(county);
        }
    }
    
    /**
     * Unsets the "County" element
     */
    public void unsetCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTY$10, 0);
        }
    }
    
    /**
     * Gets the "StateProv" element
     */
    public org.iata.iata.x2007.x00.StateProvType getStateProv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StateProvType target = null;
            target = (org.iata.iata.x2007.x00.StateProvType)get_store().find_element_user(STATEPROV$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StateProv" element
     */
    public boolean isSetStateProv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATEPROV$12) != 0;
        }
    }
    
    /**
     * Sets the "StateProv" element
     */
    public void setStateProv(org.iata.iata.x2007.x00.StateProvType stateProv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StateProvType target = null;
            target = (org.iata.iata.x2007.x00.StateProvType)get_store().find_element_user(STATEPROV$12, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.StateProvType)get_store().add_element_user(STATEPROV$12);
            }
            target.set(stateProv);
        }
    }
    
    /**
     * Appends and returns a new empty "StateProv" element
     */
    public org.iata.iata.x2007.x00.StateProvType addNewStateProv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.StateProvType target = null;
            target = (org.iata.iata.x2007.x00.StateProvType)get_store().add_element_user(STATEPROV$12);
            return target;
        }
    }
    
    /**
     * Unsets the "StateProv" element
     */
    public void unsetStateProv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATEPROV$12, 0);
        }
    }
    
    /**
     * Gets the "CountryName" element
     */
    public org.iata.iata.x2007.x00.CountryNameType getCountryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.CountryNameType target = null;
            target = (org.iata.iata.x2007.x00.CountryNameType)get_store().find_element_user(COUNTRYNAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CountryName" element
     */
    public boolean isSetCountryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRYNAME$14) != 0;
        }
    }
    
    /**
     * Sets the "CountryName" element
     */
    public void setCountryName(org.iata.iata.x2007.x00.CountryNameType countryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.CountryNameType target = null;
            target = (org.iata.iata.x2007.x00.CountryNameType)get_store().find_element_user(COUNTRYNAME$14, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.CountryNameType)get_store().add_element_user(COUNTRYNAME$14);
            }
            target.set(countryName);
        }
    }
    
    /**
     * Appends and returns a new empty "CountryName" element
     */
    public org.iata.iata.x2007.x00.CountryNameType addNewCountryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.CountryNameType target = null;
            target = (org.iata.iata.x2007.x00.CountryNameType)get_store().add_element_user(COUNTRYNAME$14);
            return target;
        }
    }
    
    /**
     * Unsets the "CountryName" element
     */
    public void unsetCountryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRYNAME$14, 0);
        }
    }
    
    /**
     * Gets the "FormattedInd" attribute
     */
    public boolean getFormattedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATTEDIND$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FORMATTEDIND$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "FormattedInd" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFormattedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMATTEDIND$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FORMATTEDIND$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "FormattedInd" attribute
     */
    public boolean isSetFormattedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMATTEDIND$16) != null;
        }
    }
    
    /**
     * Sets the "FormattedInd" attribute
     */
    public void setFormattedInd(boolean formattedInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATTEDIND$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATTEDIND$16);
            }
            target.setBooleanValue(formattedInd);
        }
    }
    
    /**
     * Sets (as xml) the "FormattedInd" attribute
     */
    public void xsetFormattedInd(org.apache.xmlbeans.XmlBoolean formattedInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMATTEDIND$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FORMATTEDIND$16);
            }
            target.set(formattedInd);
        }
    }
    
    /**
     * Unsets the "FormattedInd" attribute
     */
    public void unsetFormattedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMATTEDIND$16);
        }
    }
    
    /**
     * Gets the "DefaultInd" attribute
     */
    public boolean getDefaultInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTIND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTIND$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultInd" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDefaultInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTIND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEFAULTIND$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "DefaultInd" attribute
     */
    public boolean isSetDefaultInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTIND$18) != null;
        }
    }
    
    /**
     * Sets the "DefaultInd" attribute
     */
    public void setDefaultInd(boolean defaultInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTIND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTIND$18);
            }
            target.setBooleanValue(defaultInd);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultInd" attribute
     */
    public void xsetDefaultInd(org.apache.xmlbeans.XmlBoolean defaultInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTIND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEFAULTIND$18);
            }
            target.set(defaultInd);
        }
    }
    
    /**
     * Unsets the "DefaultInd" attribute
     */
    public void unsetDefaultInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTIND$18);
        }
    }
    
    /**
     * Gets the "UseType" attribute
     */
    public java.lang.String getUseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USETYPE$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UseType" attribute
     */
    public org.iata.iata.x2007.x00.IATACodeType xgetUseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(USETYPE$20);
            return target;
        }
    }
    
    /**
     * True if has "UseType" attribute
     */
    public boolean isSetUseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USETYPE$20) != null;
        }
    }
    
    /**
     * Sets the "UseType" attribute
     */
    public void setUseType(java.lang.String useType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USETYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USETYPE$20);
            }
            target.setStringValue(useType);
        }
    }
    
    /**
     * Sets (as xml) the "UseType" attribute
     */
    public void xsetUseType(org.iata.iata.x2007.x00.IATACodeType useType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(USETYPE$20);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(USETYPE$20);
            }
            target.set(useType);
        }
    }
    
    /**
     * Unsets the "UseType" attribute
     */
    public void unsetUseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USETYPE$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RPH$22);
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
            target = (org.iata.iata.x2007.x00.RPHType)get_store().find_attribute_user(RPH$22);
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
            return get_store().find_attribute_user(RPH$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RPH$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RPH$22);
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
            target = (org.iata.iata.x2007.x00.RPHType)get_store().find_attribute_user(RPH$22);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.RPHType)get_store().add_attribute_user(RPH$22);
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
            get_store().remove_attribute(RPH$22);
        }
    }
    
    /**
     * Gets the "Type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public org.iata.iata.x2007.x00.IATACodeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TYPE$24);
            return target;
        }
    }
    
    /**
     * True if has "Type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$24) != null;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$24);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(org.iata.iata.x2007.x00.IATACodeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.IATACodeType target = null;
            target = (org.iata.iata.x2007.x00.IATACodeType)get_store().find_attribute_user(TYPE$24);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.IATACodeType)get_store().add_attribute_user(TYPE$24);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$24);
        }
    }
    /**
     * An XML StreetNmbr(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class StreetNmbrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.AddressType.StreetNmbr
    {
        
        public StreetNmbrImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POBOX$0 = 
            new javax.xml.namespace.QName("", "POBox");
        private static final javax.xml.namespace.QName STREETNMBRSUFFIX$2 = 
            new javax.xml.namespace.QName("", "StreetNmbrSuffix");
        private static final javax.xml.namespace.QName STREETDIRECTION$4 = 
            new javax.xml.namespace.QName("", "StreetDirection");
        private static final javax.xml.namespace.QName RURALROUTENMBR$6 = 
            new javax.xml.namespace.QName("", "RuralRouteNmbr");
        
        
        /**
         * Gets the "POBox" attribute
         */
        public java.lang.String getPOBox()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POBOX$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "POBox" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetPOBox()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(POBOX$0);
                return target;
            }
        }
        
        /**
         * True if has "POBox" attribute
         */
        public boolean isSetPOBox()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POBOX$0) != null;
            }
        }
        
        /**
         * Sets the "POBox" attribute
         */
        public void setPOBox(java.lang.String poBox)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POBOX$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POBOX$0);
                }
                target.setStringValue(poBox);
            }
        }
        
        /**
         * Sets (as xml) the "POBox" attribute
         */
        public void xsetPOBox(org.iata.iata.x2007.x00.StringLength1To16 poBox)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(POBOX$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(POBOX$0);
                }
                target.set(poBox);
            }
        }
        
        /**
         * Unsets the "POBox" attribute
         */
        public void unsetPOBox()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POBOX$0);
            }
        }
        
        /**
         * Gets the "StreetNmbrSuffix" attribute
         */
        public java.lang.String getStreetNmbrSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STREETNMBRSUFFIX$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "StreetNmbrSuffix" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To8 xgetStreetNmbrSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To8 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().find_attribute_user(STREETNMBRSUFFIX$2);
                return target;
            }
        }
        
        /**
         * True if has "StreetNmbrSuffix" attribute
         */
        public boolean isSetStreetNmbrSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STREETNMBRSUFFIX$2) != null;
            }
        }
        
        /**
         * Sets the "StreetNmbrSuffix" attribute
         */
        public void setStreetNmbrSuffix(java.lang.String streetNmbrSuffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STREETNMBRSUFFIX$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STREETNMBRSUFFIX$2);
                }
                target.setStringValue(streetNmbrSuffix);
            }
        }
        
        /**
         * Sets (as xml) the "StreetNmbrSuffix" attribute
         */
        public void xsetStreetNmbrSuffix(org.iata.iata.x2007.x00.StringLength1To8 streetNmbrSuffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To8 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().find_attribute_user(STREETNMBRSUFFIX$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().add_attribute_user(STREETNMBRSUFFIX$2);
                }
                target.set(streetNmbrSuffix);
            }
        }
        
        /**
         * Unsets the "StreetNmbrSuffix" attribute
         */
        public void unsetStreetNmbrSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STREETNMBRSUFFIX$2);
            }
        }
        
        /**
         * Gets the "StreetDirection" attribute
         */
        public java.lang.String getStreetDirection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STREETDIRECTION$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "StreetDirection" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To8 xgetStreetDirection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To8 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().find_attribute_user(STREETDIRECTION$4);
                return target;
            }
        }
        
        /**
         * True if has "StreetDirection" attribute
         */
        public boolean isSetStreetDirection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STREETDIRECTION$4) != null;
            }
        }
        
        /**
         * Sets the "StreetDirection" attribute
         */
        public void setStreetDirection(java.lang.String streetDirection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STREETDIRECTION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STREETDIRECTION$4);
                }
                target.setStringValue(streetDirection);
            }
        }
        
        /**
         * Sets (as xml) the "StreetDirection" attribute
         */
        public void xsetStreetDirection(org.iata.iata.x2007.x00.StringLength1To8 streetDirection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To8 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().find_attribute_user(STREETDIRECTION$4);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To8)get_store().add_attribute_user(STREETDIRECTION$4);
                }
                target.set(streetDirection);
            }
        }
        
        /**
         * Unsets the "StreetDirection" attribute
         */
        public void unsetStreetDirection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STREETDIRECTION$4);
            }
        }
        
        /**
         * Gets the "RuralRouteNmbr" attribute
         */
        public java.lang.String getRuralRouteNmbr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RURALROUTENMBR$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RuralRouteNmbr" attribute
         */
        public org.iata.iata.x2007.x00.NumericStringLength1To5 xgetRuralRouteNmbr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.NumericStringLength1To5 target = null;
                target = (org.iata.iata.x2007.x00.NumericStringLength1To5)get_store().find_attribute_user(RURALROUTENMBR$6);
                return target;
            }
        }
        
        /**
         * True if has "RuralRouteNmbr" attribute
         */
        public boolean isSetRuralRouteNmbr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RURALROUTENMBR$6) != null;
            }
        }
        
        /**
         * Sets the "RuralRouteNmbr" attribute
         */
        public void setRuralRouteNmbr(java.lang.String ruralRouteNmbr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RURALROUTENMBR$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RURALROUTENMBR$6);
                }
                target.setStringValue(ruralRouteNmbr);
            }
        }
        
        /**
         * Sets (as xml) the "RuralRouteNmbr" attribute
         */
        public void xsetRuralRouteNmbr(org.iata.iata.x2007.x00.NumericStringLength1To5 ruralRouteNmbr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.NumericStringLength1To5 target = null;
                target = (org.iata.iata.x2007.x00.NumericStringLength1To5)get_store().find_attribute_user(RURALROUTENMBR$6);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.NumericStringLength1To5)get_store().add_attribute_user(RURALROUTENMBR$6);
                }
                target.set(ruralRouteNmbr);
            }
        }
        
        /**
         * Unsets the "RuralRouteNmbr" attribute
         */
        public void unsetRuralRouteNmbr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RURALROUTENMBR$6);
            }
        }
    }
}
