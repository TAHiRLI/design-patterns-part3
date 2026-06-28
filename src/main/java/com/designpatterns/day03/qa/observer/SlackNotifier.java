package com.designpatterns.day03.qa.observer;

public class SlackNotifier implements TestResultListener {
    @Override public void onResult(String testName, boolean passed) {
        System.out.println("  [Slack] " + testName + " → " + (passed ? "PASS" : "FAIL"));
    }
}
