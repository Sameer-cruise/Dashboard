/*
 * XML Type:  DateOrTimeOrDateTimeType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.DateOrTimeOrDateTimeType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML DateOrTimeOrDateTimeType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlDateTime
 *     org.apache.xmlbeans.XmlTime
 */
public class DateOrTimeOrDateTimeTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.iata.iata.x2007.x00.DateOrTimeOrDateTimeType, org.apache.xmlbeans.XmlDate, org.apache.xmlbeans.XmlDateTime, org.apache.xmlbeans.XmlTime
{
    
    public DateOrTimeOrDateTimeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected DateOrTimeOrDateTimeTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
