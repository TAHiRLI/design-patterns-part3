package com.designpatterns.day03.practice.observer;

/**
 * TODO 5 — onBugReported prints: [Email] BUG-xxx (SEVERITY): title
 */
public class EmailBugObserver implements BugObserver {
    @Override public void onBugReported(String bugId, String severity, String title) {
        throw new UnsupportedOperationException("TODO 5: notify via email format");
    }
}
