/*
 * XML Type:  FlightNumberType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.FlightNumberType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML FlightNumberType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.iata.iata.x2007.x00.FlightNumberType$Member
 *     org.iata.iata.x2007.x00.FlightNumberType$Member2
 */
public class FlightNumberTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.iata.iata.x2007.x00.FlightNumberType, org.iata.iata.x2007.x00.FlightNumberType.Member, org.iata.iata.x2007.x00.FlightNumberType.Member2
{
    
    public FlightNumberTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected FlightNumberTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightNumberType$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.FlightNumberType.Member
    {
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.FlightNumberType$Member2.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.FlightNumberType.Member2
    {
        
        public MemberImpl2(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl2(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
