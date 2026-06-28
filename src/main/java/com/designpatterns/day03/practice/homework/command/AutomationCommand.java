package com.designpatterns.day03.practice.homework.command;

public interface AutomationCommand {
    void execute();
    void undo();
    String label();
}
