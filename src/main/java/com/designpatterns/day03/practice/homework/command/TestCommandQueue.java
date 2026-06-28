package com.designpatterns.day03.practice.homework.command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Homework 1 — implement a command queue with undo support.
 * TODO 1 — store commands in history when run
 * TODO 2 — undoLast() reverses the most recent command
 */
public class TestCommandQueue {
    private final Deque<AutomationCommand> history = new ArrayDeque<>();

    public void run(AutomationCommand command) {
        throw new UnsupportedOperationException("TODO 1: execute and push to history");
    }

    public void undoLast() {
        throw new UnsupportedOperationException("TODO 2: pop and undo last command");
    }

    public int historySize() { return history.size(); }
}
