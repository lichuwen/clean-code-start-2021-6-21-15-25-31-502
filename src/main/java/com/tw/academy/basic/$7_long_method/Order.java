package com.tw.academy.basic.$7_long_method;

import java.util.List;

public class Order {
    private static final double TAX_RATE = .10;

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

    public double calculateTotalSalesTax() {
        return this.lineItems.stream().map(LineItem::totalAmount).mapToDouble(item -> item * TAX_RATE).sum();
    }

    public double calculateTotal() {
        return this.lineItems.stream().mapToDouble(LineItem::totalAmount).sum() + calculateTotalSalesTax();
    }
}
