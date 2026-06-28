package com.designpatterns.day03.strategy;

public class PayPalStrategy implements PaymentStrategy {
    private final String email;
    public PayPalStrategy(String email) { this.email = email; }
    @Override public String pay(double amount) {
        return "Paid $" + amount + " via PayPal (" + email + ")";
    }
}
