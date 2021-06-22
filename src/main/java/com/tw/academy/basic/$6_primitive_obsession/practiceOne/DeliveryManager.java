package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    Address toAddress;
    Address fromAddress;

    public DeliveryManager(String toAddress, String fromAddress) {
        this.toAddress = new Address(toAddress);
        this.fromAddress = new Address(fromAddress);
    }

    public DeliverCenter allocate(){
        if (toAddress.getProvince().equals(fromAddress.getProvince()) && toAddress.getCity().equals(fromAddress.getCity())){
            return DeliverCenter.LOCAL;
        }
        if (toAddress.getProvince().equals(fromAddress.getProvince())) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

}
