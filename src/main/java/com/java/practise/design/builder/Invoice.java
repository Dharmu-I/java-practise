package com.java.practise.design.builder;

/**
 * dharmu.i on 13/03/19
 */

public class Invoice implements InvoiceContent {
    @Override
    public Integer setTotalAmount() {
        return 100;
    }

    @Override
    public String setInvoiceType() {
        return "SalesInvoice";
    }

    @Override
    public String setCustomerName() {
        return "Dharmu";
    }

    @Override
    public String setItem() {
        return "Mac Book Pro";
    }
}
