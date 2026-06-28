package com.designpatterns.day03.chain;

public class ErrorHandler extends LogHandler {
    @Override protected boolean canHandle(LogLevel level) { return level == LogLevel.ERROR; }
    @Override protected void write(String message) { System.out.println("[ERROR] " + message); }
}
