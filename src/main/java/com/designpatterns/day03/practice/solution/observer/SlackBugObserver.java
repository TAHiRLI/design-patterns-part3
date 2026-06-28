package com.designpatterns.day03.practice.solution.observer;

import com.designpatterns.day03.practice.observer.BugObserver;

public class SlackBugObserver implements BugObserver {
    @Override public void onBugReported(String bugId, String severity, String title) {
        System.out.println("  [Slack] " + bugId + " (" + severity + "): " + title);
    }
}
