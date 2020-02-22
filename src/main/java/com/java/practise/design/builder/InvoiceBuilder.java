package com.java.practise.design.builder;

/**
 * dharmu.i on 13/03/19
 */

public interface InvoiceBuilder {

    void buildTotalAmount();
    void buildItem();
    void buildCustomerName();
    void buildInvoiceType();
}
