package com.designpatterns.day03.qa.observer;

import java.util.ArrayList;
import java.util.List;

public class TestRunPublisher {
    private final List<TestResultListener> listeners = new ArrayList<>();
    public void subscribe(TestResultListener listener) { listeners.add(listener); }
    public void publish(String testName, boolean passed) {
        for (TestResultListener listener : listeners) {
            listener.onResult(testName, passed);
        }
    }
}
