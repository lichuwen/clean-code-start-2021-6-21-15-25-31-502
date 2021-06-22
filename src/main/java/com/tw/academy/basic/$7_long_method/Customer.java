package com.tw.academy.basic.$7_long_method;

public class Customer {
    private final String customerName;
    private final String address;

    public Customer(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }
}
