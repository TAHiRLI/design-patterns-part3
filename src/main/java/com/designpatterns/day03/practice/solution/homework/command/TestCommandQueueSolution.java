package com.designpatterns.day03.practice.solution.homework.command;

import com.designpatterns.day03.practice.homework.command.AutomationCommand;
import java.util.ArrayDeque;
import java.util.Deque;

public class TestCommandQueueSolution {
    private final Deque<AutomationCommand> history = new ArrayDeque<>();
    public void run(AutomationCommand command) { command.execute(); history.push(command); }
    public void undoLast() { if (!history.isEmpty()) history.pop().undo(); }
    public int historySize() { return history.size(); }
}
