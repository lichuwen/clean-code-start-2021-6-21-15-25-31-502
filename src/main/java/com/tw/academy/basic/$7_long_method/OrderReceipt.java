package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private Order order;
    private static final double TAX_RATE = .10;
    private static final char TAB = '\t';
    private static final char LINE_BREAK = '\n';
    public OrderReceipt(Order order) {
        this.order = order;
    }

    //Deprecated
    public String printCustomerName() {
        return order.getCustomerName();
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        // print headers
        appendReceiptHeader(output);

        // print date, bill no, customer name
//        output.append("Date - " + order.getDate();
        appendCustomerInfo(output);
//        output.append(order.getCustomerLoyaltyNumber());

        // prints lineItems
        double totSalesTx = 0d;
        double tot = 0d;
        appendLineItems(output);

        totSalesTx = calculateTotalSalesTax();
        tot = calculateTotal();
        // prints the state tax
        output.append("Sales Tax").append(TAB).append(totSalesTx);

        // print total amount
        output.append("Total Amount").append(TAB).append(tot);
        return output.toString();
    }

    private void appendReceiptHeader(StringBuilder builder) {
        builder.append("======Printing Orders======\n");
    }

    private void appendCustomerInfo(StringBuilder builder) {
        builder.append(order.getCustomerName()).append(order.getCustomerAddress()).append(LINE_BREAK);
    }

    private double calculateTotalSalesTax() {
        return order.getLineItems().stream().map(LineItem::totalAmount).mapToDouble(item -> item * TAX_RATE).sum();
    }

    private double calculateTotal() {
        return order.getLineItems().stream().mapToDouble(LineItem::totalAmount).sum() + calculateTotalSalesTax();
    }

    private void appendLineItems(StringBuilder output) {
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription()).append(TAB);
            output.append(lineItem.getPrice()).append(TAB);
            output.append(lineItem.getQuantity()).append(TAB);
            output.append(lineItem.totalAmount()).append(LINE_BREAK);
        }
    }
}