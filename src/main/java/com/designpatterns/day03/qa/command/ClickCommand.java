package com.designpatterns.day03.qa.command;

public class ClickCommand implements TestStepCommand {
    private final String selector;
    public ClickCommand(String selector) { this.selector = selector; }
    @Override public void execute() { System.out.println("  Click " + selector); }
    @Override public void undo() { System.out.println("  Undo click " + selector); }
}
