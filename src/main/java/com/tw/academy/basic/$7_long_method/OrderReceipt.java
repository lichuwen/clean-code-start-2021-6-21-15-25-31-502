package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private final Order order;
    private static final char TAB = '\t';
    private static final char LINE_BREAK = '\n';
    public OrderReceipt(Order order) {
        this.order = order;
    }

    //Deprecated
    public String printCustomerName() {
        return order.getCustomerName();
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();
        appendReceiptHeader(output);
        appendCustomerInfo(output);
        appendLineItems(output);
        appendTaxAndTotalAmount(output);
        return output.toString();
    }

    private void appendReceiptHeader(StringBuilder builder) {
        builder.append("======Printing Orders======\n");
    }

    private void appendCustomerInfo(StringBuilder builder) {
        builder.append(order.getCustomerName()).append(order.getCustomerAddress()).append(LINE_BREAK);
    }



    private void appendLineItems(StringBuilder output) {
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription()).append(TAB);
            output.append(lineItem.getPrice()).append(TAB);
            output.append(lineItem.getQuantity()).append(TAB);
            output.append(lineItem.totalAmount()).append(LINE_BREAK);
        }
    }

    private void appendTaxAndTotalAmount(StringBuilder output) {
        output.append("Sales Tax").append(TAB).append(order.calculateTotalSalesTax());
        output.append("Total Amount").append(TAB).append(order.calculateTotal());
    }
}