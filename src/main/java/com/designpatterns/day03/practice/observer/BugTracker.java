package com.designpatterns.day03.practice.observer;

import java.util.ArrayList;
import java.util.List;

public class BugTracker {
    private final List<BugObserver> observers = new ArrayList<>();
    public void subscribe(BugObserver observer) { observers.add(observer); }
    public void reportBug(String bugId, String severity, String title) {
        for (BugObserver observer : observers) {
            observer.onBugReported(bugId, severity, title);
        }
    }
}
