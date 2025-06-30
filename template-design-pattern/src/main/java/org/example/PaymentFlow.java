package org.example;

/*
When you require all classes to follow specific steps to complete a task but also need to provide flexibility
that each class can have their own logic in that specific steps
 */
public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    public final void sendMoney() {
        //Step 1
        validateRequest();

        //Step 2
        debitAmount();

        //Step 3
        calculateFees();

        //Step 4
        creditAmount();
    }
}
