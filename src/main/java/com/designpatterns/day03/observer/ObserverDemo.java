package com.designpatterns.day03.observer;

public final class ObserverDemo {
    private ObserverDemo() {
    }

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("--- Observer ---");
        StockMarket market = new StockMarket();
        market.subscribe(new Investor("Alice"));
        market.subscribe(new Investor("Bob"));
        market.setPrice("ACME", 142.50);
    }
}
