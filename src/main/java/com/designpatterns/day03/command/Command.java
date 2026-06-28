package com.designpatterns.day03.command;

public interface Command {
    void execute();
    void undo();
    String describe();
}
