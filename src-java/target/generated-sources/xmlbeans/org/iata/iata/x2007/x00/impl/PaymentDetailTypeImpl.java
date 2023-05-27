/*
 * XML Type:  PaymentDetailType
 * Namespace: http://www.iata.org/IATA/2007/00
 * Java type: org.iata.iata.x2007.x00.PaymentDetailType
 *
 * Automatically generated - do not modify.
 */
package org.iata.iata.x2007.x00.impl;
/**
 * An XML PaymentDetailType(@http://www.iata.org/IATA/2007/00).
 *
 * This is a complex type.
 */
public class PaymentDetailTypeImpl extends org.iata.iata.x2007.x00.impl.PaymentFormTypeImpl implements org.iata.iata.x2007.x00.PaymentDetailType
{
    
    public PaymentDetailTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENTAMOUNT$0 = 
        new javax.xml.namespace.QName("http://www.iata.org/IATA/2007/00", "PaymentAmount");
    
    
    /**
     * Gets the "PaymentAmount" element
     */
    public org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount getPaymentAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount target = null;
            target = (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount)get_store().find_element_user(PAYMENTAMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PaymentAmount" element
     */
    public boolean isSetPaymentAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTAMOUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "PaymentAmount" element
     */
    public void setPaymentAmount(org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount paymentAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount target = null;
            target = (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount)get_store().find_element_user(PAYMENTAMOUNT$0, 0);
            if (target == null)
            {
                target = (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount)get_store().add_element_user(PAYMENTAMOUNT$0);
            }
            target.set(paymentAmount);
        }
    }
    
    /**
     * Appends and returns a new empty "PaymentAmount" element
     */
    public org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount addNewPaymentAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount target = null;
            target = (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount)get_store().add_element_user(PAYMENTAMOUNT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "PaymentAmount" element
     */
    public void unsetPaymentAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTAMOUNT$0, 0);
        }
    }
    /**
     * An XML PaymentAmount(@http://www.iata.org/IATA/2007/00).
     *
     * This is a complex type.
     */
    public static class PaymentAmountImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount
    {
        
        public PaymentAmountImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AMOUNT$0 = 
            new javax.xml.namespace.QName("", "Amount");
        private static final javax.xml.namespace.QName CURRENCYCODE$2 = 
            new javax.xml.namespace.QName("", "CurrencyCode");
        private static final javax.xml.namespace.QName DECIMALPLACES$4 = 
            new javax.xml.namespace.QName("", "DecimalPlaces");
        private static final javax.xml.namespace.QName APPROVALCODE$6 = 
            new javax.xml.namespace.QName("", "ApprovalCode");
        private static final javax.xml.namespace.QName REFUNDCALCMETHOD$8 = 
            new javax.xml.namespace.QName("", "RefundCalcMethod");
        
        
        /**
         * Gets the "Amount" attribute
         */
        public java.math.BigDecimal getAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMOUNT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "Amount" attribute
         */
        public org.iata.iata.x2007.x00.Money xgetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.Money target = null;
                target = (org.iata.iata.x2007.x00.Money)get_store().find_attribute_user(AMOUNT$0);
                return target;
            }
        }
        
        /**
         * True if has "Amount" attribute
         */
        public boolean isSetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AMOUNT$0) != null;
            }
        }
        
        /**
         * Sets the "Amount" attribute
         */
        public void setAmount(java.math.BigDecimal amount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMOUNT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMOUNT$0);
                }
                target.setBigDecimalValue(amount);
            }
        }
        
        /**
         * Sets (as xml) the "Amount" attribute
         */
        public void xsetAmount(org.iata.iata.x2007.x00.Money amount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.Money target = null;
                target = (org.iata.iata.x2007.x00.Money)get_store().find_attribute_user(AMOUNT$0);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.Money)get_store().add_attribute_user(AMOUNT$0);
                }
                target.set(amount);
            }
        }
        
        /**
         * Unsets the "Amount" attribute
         */
        public void unsetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AMOUNT$0);
            }
        }
        
        /**
         * Gets the "CurrencyCode" attribute
         */
        public java.lang.String getCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCYCODE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CurrencyCode" attribute
         */
        public org.iata.iata.x2007.x00.AlphaLength3 xgetCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.AlphaLength3 target = null;
                target = (org.iata.iata.x2007.x00.AlphaLength3)get_store().find_attribute_user(CURRENCYCODE$2);
                return target;
            }
        }
        
        /**
         * True if has "CurrencyCode" attribute
         */
        public boolean isSetCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CURRENCYCODE$2) != null;
            }
        }
        
        /**
         * Sets the "CurrencyCode" attribute
         */
        public void setCurrencyCode(java.lang.String currencyCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCYCODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENCYCODE$2);
                }
                target.setStringValue(currencyCode);
            }
        }
        
        /**
         * Sets (as xml) the "CurrencyCode" attribute
         */
        public void xsetCurrencyCode(org.iata.iata.x2007.x00.AlphaLength3 currencyCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.AlphaLength3 target = null;
                target = (org.iata.iata.x2007.x00.AlphaLength3)get_store().find_attribute_user(CURRENCYCODE$2);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.AlphaLength3)get_store().add_attribute_user(CURRENCYCODE$2);
                }
                target.set(currencyCode);
            }
        }
        
        /**
         * Unsets the "CurrencyCode" attribute
         */
        public void unsetCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CURRENCYCODE$2);
            }
        }
        
        /**
         * Gets the "DecimalPlaces" attribute
         */
        public java.math.BigInteger getDecimalPlaces()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALPLACES$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "DecimalPlaces" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetDecimalPlaces()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(DECIMALPLACES$4);
                return target;
            }
        }
        
        /**
         * True if has "DecimalPlaces" attribute
         */
        public boolean isSetDecimalPlaces()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DECIMALPLACES$4) != null;
            }
        }
        
        /**
         * Sets the "DecimalPlaces" attribute
         */
        public void setDecimalPlaces(java.math.BigInteger decimalPlaces)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALPLACES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECIMALPLACES$4);
                }
                target.setBigIntegerValue(decimalPlaces);
            }
        }
        
        /**
         * Sets (as xml) the "DecimalPlaces" attribute
         */
        public void xsetDecimalPlaces(org.apache.xmlbeans.XmlNonNegativeInteger decimalPlaces)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(DECIMALPLACES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(DECIMALPLACES$4);
                }
                target.set(decimalPlaces);
            }
        }
        
        /**
         * Unsets the "DecimalPlaces" attribute
         */
        public void unsetDecimalPlaces()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DECIMALPLACES$4);
            }
        }
        
        /**
         * Gets the "ApprovalCode" attribute
         */
        public java.lang.String getApprovalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPROVALCODE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ApprovalCode" attribute
         */
        public org.iata.iata.x2007.x00.StringLength1To16 xgetApprovalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(APPROVALCODE$6);
                return target;
            }
        }
        
        /**
         * True if has "ApprovalCode" attribute
         */
        public boolean isSetApprovalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPROVALCODE$6) != null;
            }
        }
        
        /**
         * Sets the "ApprovalCode" attribute
         */
        public void setApprovalCode(java.lang.String approvalCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPROVALCODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPROVALCODE$6);
                }
                target.setStringValue(approvalCode);
            }
        }
        
        /**
         * Sets (as xml) the "ApprovalCode" attribute
         */
        public void xsetApprovalCode(org.iata.iata.x2007.x00.StringLength1To16 approvalCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.StringLength1To16 target = null;
                target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().find_attribute_user(APPROVALCODE$6);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.StringLength1To16)get_store().add_attribute_user(APPROVALCODE$6);
                }
                target.set(approvalCode);
            }
        }
        
        /**
         * Unsets the "ApprovalCode" attribute
         */
        public void unsetApprovalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPROVALCODE$6);
            }
        }
        
        /**
         * Gets the "RefundCalcMethod" attribute
         */
        public org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod.Enum getRefundCalcMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFUNDCALCMETHOD$8);
                if (target == null)
                {
                    return null;
                }
                return (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "RefundCalcMethod" attribute
         */
        public org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod xgetRefundCalcMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod target = null;
                target = (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod)get_store().find_attribute_user(REFUNDCALCMETHOD$8);
                return target;
            }
        }
        
        /**
         * True if has "RefundCalcMethod" attribute
         */
        public boolean isSetRefundCalcMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REFUNDCALCMETHOD$8) != null;
            }
        }
        
        /**
         * Sets the "RefundCalcMethod" attribute
         */
        public void setRefundCalcMethod(org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod.Enum refundCalcMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFUNDCALCMETHOD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFUNDCALCMETHOD$8);
                }
                target.setEnumValue(refundCalcMethod);
            }
        }
        
        /**
         * Sets (as xml) the "RefundCalcMethod" attribute
         */
        public void xsetRefundCalcMethod(org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod refundCalcMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod target = null;
                target = (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod)get_store().find_attribute_user(REFUNDCALCMETHOD$8);
                if (target == null)
                {
                    target = (org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod)get_store().add_attribute_user(REFUNDCALCMETHOD$8);
                }
                target.set(refundCalcMethod);
            }
        }
        
        /**
         * Unsets the "RefundCalcMethod" attribute
         */
        public void unsetRefundCalcMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REFUNDCALCMETHOD$8);
            }
        }
        /**
         * An XML RefundCalcMethod(@).
         *
         * This is an atomic type that is a restriction of org.iata.iata.x2007.x00.PaymentDetailType$PaymentAmount$RefundCalcMethod.
         */
        public static class RefundCalcMethodImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.iata.iata.x2007.x00.PaymentDetailType.PaymentAmount.RefundCalcMethod
        {
            
            public RefundCalcMethodImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RefundCalcMethodImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
