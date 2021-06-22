package com.tw.academy.basic.$7_long_method;

import java.util.List;

public class Order {
    private final Customer customer;
    private final String customerName;
    private final String address;
    List<LineItem> lineItems;

    public Order(Customer customer, List<LineItem> lineItems) {
        this.customer = customer;
        this.customerName = this.customer.getCustomerName();
        this.address = this.customer.getAddress();
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
