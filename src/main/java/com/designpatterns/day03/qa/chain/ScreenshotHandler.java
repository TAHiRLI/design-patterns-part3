package com.designpatterns.day03.qa.chain;

public class ScreenshotHandler extends FailureHandler {
    @Override protected boolean canHandle(TestFailure failure) { return "UI".equals(failure.severity()); }
    @Override protected void process(TestFailure failure) {
        System.out.println("  [Screenshot] Captured for " + failure.testName());
    }
}
