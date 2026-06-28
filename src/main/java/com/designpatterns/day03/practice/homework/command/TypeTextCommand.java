package com.designpatterns.day03.practice.homework.command;

public class TypeTextCommand implements AutomationCommand {
    private final StringBuilder screen;
    private final String text;
    private String previous;
    public TypeTextCommand(StringBuilder screen, String text) {
        this.screen = screen; this.text = text;
    }
    @Override public void execute() { previous = screen.toString(); screen.append(text); }
    @Override public void undo() { screen.setLength(0); screen.append(previous); }
    @Override public String label() { return "Type: " + text; }
}
