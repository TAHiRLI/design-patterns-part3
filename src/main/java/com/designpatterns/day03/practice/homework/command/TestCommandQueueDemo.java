package com.designpatterns.day03.practice.homework.command;

public final class TestCommandQueueDemo {
    private TestCommandQueueDemo() {}
    public static void main(String[] args) { run(); }
    public static void run() {
        System.out.println("--- Homework 1: Test Command Queue ---");
        StringBuilder screen = new StringBuilder();
        TestCommandQueue queue = new TestCommandQueue();
        queue.run(new TypeTextCommand(screen, "hello"));
        queue.run(new TypeTextCommand(screen, " world"));
        System.out.println("  Screen: " + screen);
        queue.undoLast();
        System.out.println("  After undo: " + screen);
    }
}
