package com.designpatterns.day03.qa.observer;

public class EmailNotifier implements TestResultListener {
    @Override public void onResult(String testName, boolean passed) {
        if (!passed) System.out.println("  [Email] Alert for failed test: " + testName);
    }
}
