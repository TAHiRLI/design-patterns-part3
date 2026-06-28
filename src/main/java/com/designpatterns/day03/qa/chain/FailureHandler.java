package com.designpatterns.day03.qa.chain;

public abstract class FailureHandler {
    private FailureHandler next;
    public FailureHandler linkWith(FailureHandler next) { this.next = next; return next; }
    public void handle(TestFailure failure) {
        if (canHandle(failure)) { process(failure); }
        else if (next != null) { next.handle(failure); }
    }
    protected abstract boolean canHandle(TestFailure failure);
    protected abstract void process(TestFailure failure);
}
