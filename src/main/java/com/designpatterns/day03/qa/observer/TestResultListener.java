package com.designpatterns.day03.qa.observer;

public interface TestResultListener {
    void onResult(String testName, boolean passed);
}
