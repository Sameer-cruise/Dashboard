/*
 * XML Type:  PaymentCardCodeType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.PaymentCardCodeType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML PaymentCardCodeType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.iata.iata.x2007.x00.PaymentCardCodeType$Member
 *     org.iata.iata.x2007.x00.PaymentCardCodeType$Member2
 */
public class PaymentCardCodeTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.iata.iata.x2007.x00.PaymentCardCodeType, org.iata.iata.x2007.x00.PaymentCardCodeType.Member, org.iata.iata.x2007.x00.PaymentCardCodeType.Member2
{
    
    public PaymentCardCodeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected PaymentCardCodeTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentCardCodeType$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.PaymentCardCodeType.Member
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
     * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentCardCodeType$Member2.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.iata.iata.x2007.x00.PaymentCardCodeType.Member2
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
