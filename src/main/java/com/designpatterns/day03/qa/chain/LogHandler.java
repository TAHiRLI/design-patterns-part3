package com.designpatterns.day03.qa.chain;

public class LogHandler extends FailureHandler {
    @Override protected boolean canHandle(TestFailure failure) { return "API".equals(failure.severity()); }
    @Override protected void process(TestFailure failure) {
        System.out.println("  [Log] " + failure.testName() + ": " + failure.message());
    }
}
