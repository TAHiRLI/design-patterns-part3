package com.designpatterns.day03.practice.homework.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestCommandQueueTest {
    @Test void undoReversesLastCommand() {
        StringBuilder screen = new StringBuilder();
        TestCommandQueue queue = new TestCommandQueue();
        queue.run(new TypeTextCommand(screen, "hello"));
        queue.run(new TypeTextCommand(screen, " world"));
        assertEquals("hello world", screen.toString());
        queue.undoLast();
        assertEquals("hello", screen.toString());
        assertEquals(1, queue.historySize());
    }
}
