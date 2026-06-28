package com.designpatterns.day03.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private final List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void setPrice(String symbol, double price) {
        for (Observer observer : observers) {
            observer.update(symbol, price);
        }
    }
}
