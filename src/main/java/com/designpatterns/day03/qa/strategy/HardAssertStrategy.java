package com.designpatterns.day03.qa.strategy;

public class HardAssertStrategy implements AssertionStrategy {
    @Override public void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) throw new AssertionError("Hard fail: expected " + expected + " but was " + actual);
    }
}
