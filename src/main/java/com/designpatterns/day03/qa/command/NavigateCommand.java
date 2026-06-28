package com.designpatterns.day03.qa.command;

public class NavigateCommand implements TestStepCommand {
    private final String url;
    private String previousUrl;
    public NavigateCommand(String url) { this.url = url; }
    @Override public void execute() { previousUrl = "about:blank"; System.out.println("  Navigate → " + url); }
    @Override public void undo() { System.out.println("  Undo navigate → " + previousUrl); }
}
