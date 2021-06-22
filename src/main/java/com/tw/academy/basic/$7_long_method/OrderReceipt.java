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
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append(TAB);
            output.append(lineItem.getPrice());
            output.append(TAB);
            output.append(lineItem.getQuantity());
            output.append(TAB);
            output.append(lineItem.totalAmount());
            output.append(LINE_BREAK);

            // calculate sales tax @ rate of 10%
            double salesTax = lineItem.totalAmount() * TAX_RATE;
            totSalesTx += salesTax;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            tot += lineItem.totalAmount() + salesTax;
        }

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
}