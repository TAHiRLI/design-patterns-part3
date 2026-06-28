package com.designpatterns.day03.chain;

public abstract class LogHandler {
    private LogHandler next;

    public LogHandler linkWith(LogHandler next) {
        this.next = next;
        return next;
    }

    public void handle(LogLevel level, String message) {
        if (canHandle(level)) {
            write(message);
        } else if (next != null) {
            next.handle(level, message);
        }
    }

    protected abstract boolean canHandle(LogLevel level);
    protected abstract void write(String message);
}
