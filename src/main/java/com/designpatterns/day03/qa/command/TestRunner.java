package com.designpatterns.day03.qa.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestRunner {
    private final Deque<TestStepCommand> history = new ArrayDeque<>();
    public void run(TestStepCommand command) { command.execute(); history.push(command); }
    public void undoLast() { if (!history.isEmpty()) history.pop().undo(); }
}
