package com.designpatterns.day03.practice.observer;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class BugObserverTest {
    @Test void observersNotifiedOnBugReport() {
        PrintStream original = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        try {
            BugTracker tracker = new BugTracker();
            tracker.subscribe(new EmailBugObserver());
            tracker.subscribe(new SlackBugObserver());
            tracker.reportBug("BUG-99", "HIGH", "Login fails");
            String output = out.toString();
            assertTrue(output.contains("[Email] BUG-99 (HIGH): Login fails"));
            assertTrue(output.contains("[Slack] BUG-99 (HIGH): Login fails"));
        } finally {
            System.setOut(original);
        }
    }
}
