package com.tw.academy.basic.$7_long_method;

import java.util.List;

public class Order {
    private final Customer customer;
    List<LineItem> lineItems;

    public Order(Customer customer, List<LineItem> lineItems) {
        this.customer = customer;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return this.customer.getCustomerName();
    }

    public String getCustomerAddress() {
        return this.customer.getAddress();
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
