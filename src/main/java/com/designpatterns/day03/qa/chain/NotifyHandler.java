package com.designpatterns.day03.qa.chain;

public class NotifyHandler extends FailureHandler {
    @Override protected boolean canHandle(TestFailure failure) { return "CRITICAL".equals(failure.severity()); }
    @Override protected void process(TestFailure failure) {
        System.out.println("  [PagerDuty] Escalated " + failure.testName());
    }
}
