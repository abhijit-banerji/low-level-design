package org.example;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validation Logic of PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate Fees for PayToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount for PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount for PayToFriend");
    }
}
