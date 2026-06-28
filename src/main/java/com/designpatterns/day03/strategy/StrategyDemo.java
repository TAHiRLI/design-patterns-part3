package com.designpatterns.day03.strategy;

public final class StrategyDemo {
    private StrategyDemo() {}
    public static void main(String[] args) { run(); }
    public static void run() {
        System.out.println("--- Strategy ---");
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardStrategy("4242"));
        System.out.println("  " + cart.checkout(99.99));
        cart.setPaymentStrategy(new PayPalStrategy("user@example.com"));
        System.out.println("  " + cart.checkout(49.50));
    }
}
