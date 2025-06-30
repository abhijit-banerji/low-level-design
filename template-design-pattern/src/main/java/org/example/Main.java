package org.example;

public class Main {
    public static void main(String[] args) {
        //PaymentFlow paymentFlow = new PayToFriend();
        PaymentFlow paymentFlow = new PayToMerchant();
        paymentFlow.sendMoney();
    }
}