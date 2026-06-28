package com.designpatterns.day03.practice.observer;

/**
 * TODO 6 — onBugReported prints: [Slack] BUG-xxx (SEVERITY): title
 */
public class SlackBugObserver implements BugObserver {
    @Override public void onBugReported(String bugId, String severity, String title) {
        throw new UnsupportedOperationException("TODO 6: notify via slack format");
    }
}
