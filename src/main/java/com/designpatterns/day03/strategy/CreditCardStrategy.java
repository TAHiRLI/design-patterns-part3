package com.designpatterns.day03.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private final String lastFour;
    public CreditCardStrategy(String lastFour) { this.lastFour = lastFour; }
    @Override public String pay(double amount) {
        return "Charged $" + amount + " to card ending " + lastFour;
    }
}
