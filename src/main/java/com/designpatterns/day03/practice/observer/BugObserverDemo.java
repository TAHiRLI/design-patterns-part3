package com.designpatterns.day03.practice.observer;

public final class BugObserverDemo {
    private BugObserverDemo() {}
    public static void main(String[] args) { run(); }
    public static void run() {
        System.out.println("--- Practice: Bug Tracker Observer ---");
        BugTracker tracker = new BugTracker();
        tracker.subscribe(new EmailBugObserver());
        tracker.subscribe(new SlackBugObserver());
        try {
            tracker.reportBug("BUG-42", "CRITICAL", "Checkout button unresponsive");
        } catch (UnsupportedOperationException e) {
            System.out.println("  ⏳ " + e.getMessage());
            System.out.println("  → Run: ./gradlew test --tests \"*.practice.observer.*\"");
        }
    }
}
