package com.designpatterns.day03.chain;

public final class ChainDemo {
    private ChainDemo() {}
    public static void main(String[] args) { run(); }
    public static void run() {
        System.out.println("--- Chain of Responsibility ---");
        LogHandler chain = new DebugHandler();
        chain.linkWith(new InfoHandler()).linkWith(new ErrorHandler());
        chain.handle(LogLevel.INFO, "User logged in");
        chain.handle(LogLevel.DEBUG, "Cache hit for session-42");
        chain.handle(LogLevel.ERROR, "Payment gateway timeout");
    }
}
