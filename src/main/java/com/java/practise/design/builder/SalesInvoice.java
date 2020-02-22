package com.java.practise.design.builder;

/**
 * dharmu.i on 13/03/19
 */

public class SalesInvoice implements InvoiceBuilder {

    private Invoice invoice;

    private SalesInvoice(){
        this.invoice = new Invoice();
    }

    @Override
    public void buildTotalAmount() {
        this.invoice.setTotalAmount();
    }

    @Override
    public void buildItem() {
        this.invoice.setItem();
    }

    @Override
    public void buildCustomerName() {
        this.invoice.setCustomerName();
    }

    @Override
    public void buildInvoiceType() {
        this.invoice.setInvoiceType();
    }

    public Invoice getInvoice(){
        return this.invoice;
    }
}
