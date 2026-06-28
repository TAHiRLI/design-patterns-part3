package com.designpatterns.day03.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public String checkout(double total) {
        return paymentStrategy.pay(total);
    }
}
