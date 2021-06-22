package com.tw.academy.basic.$3_feature_envy.practiceOne;

public class Phone {
    private final String areaCode;
    private final String prefix;
    private final String number;

    public Phone(String unformattedNumber) {
        this.areaCode = unformattedNumber.substring(0, 3);
        this.prefix = unformattedNumber.substring(3, 6);
        this.number = unformattedNumber.substring(6, 10);
    }

    public String getMobilePhoneNumber() {
        return String.format("(%s) %s-%s", this.areaCode, this.prefix, this.number);
    }
}
