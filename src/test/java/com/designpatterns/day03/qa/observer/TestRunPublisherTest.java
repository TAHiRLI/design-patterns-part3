package com.designpatterns.day03.qa.observer;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class TestRunPublisherTest {
    @Test void listenersReceiveResults() {
        PrintStream original = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        try {
            TestRunPublisher pub = new TestRunPublisher();
            pub.subscribe(new SlackNotifier());
            pub.publish("LoginTest", false);
            assertTrue(out.toString().contains("[Slack] LoginTest → FAIL"));
        } finally {
            System.setOut(original);
        }
    }
}
