package com.designpatterns.day03.practice.observer;

public interface BugObserver {
    void onBugReported(String bugId, String severity, String title);
}
