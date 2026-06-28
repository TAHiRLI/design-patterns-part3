package com.designpatterns.day03.observer;

public class Investor implements Observer {
    private final String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String symbol, double price) {
        System.out.println("  " + name + " notified: " + symbol + " now $" + price);
    }
}
