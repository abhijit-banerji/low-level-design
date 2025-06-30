package org.example;

public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validation Logic of PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate Fees for PayToMerchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount for PayToMerchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount for PayToMerchant");
    }
}
