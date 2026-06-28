package com.designpatterns.day03.qa.strategy;

import java.util.ArrayList;
import java.util.List;

public class SoftAssertStrategy implements AssertionStrategy {
    private final List<String> failures = new ArrayList<>();
    @Override public void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) failures.add("Soft fail: expected " + expected + " but was " + actual);
    }
    public List<String> failures() { return failures; }
}
