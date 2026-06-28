package com.designpatterns.day03.practice.homework.command;

public class ClearScreenCommand implements AutomationCommand {
    private final StringBuilder screen;
    private String previous;
    public ClearScreenCommand(StringBuilder screen) { this.screen = screen; }
    @Override public void execute() { previous = screen.toString(); screen.setLength(0); }
    @Override public void undo() { screen.setLength(0); screen.append(previous); }
    @Override public String label() { return "Clear"; }
}
