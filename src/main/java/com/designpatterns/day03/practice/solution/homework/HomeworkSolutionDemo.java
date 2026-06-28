package com.designpatterns.day03.practice.solution.homework;

import com.designpatterns.day03.practice.homework.chain.SupportTicket;
import com.designpatterns.day03.practice.homework.command.TypeTextCommand;
import com.designpatterns.day03.practice.solution.homework.chain.SupportChainBuilderSolution;
import com.designpatterns.day03.practice.solution.homework.command.TestCommandQueueSolution;

public final class HomeworkSolutionDemo {
    private HomeworkSolutionDemo() {}
    public static void main(String[] args) { run(); }
    public static void run() {
        System.out.println("--- HW1 Solution: Command Queue ---");
        StringBuilder screen = new StringBuilder();
        TestCommandQueueSolution queue = new TestCommandQueueSolution();
        queue.run(new TypeTextCommand(screen, "hello"));
        queue.run(new TypeTextCommand(screen, " world"));
        System.out.println("  Screen: " + screen);
        queue.undoLast();
        System.out.println("  After undo: " + screen);

        System.out.println();
        System.out.println("--- HW2 Solution: Support Chain ---");
        var chain = new SupportChainBuilderSolution().buildChain();
        System.out.println("  " + chain.handle(new SupportTicket("T-101", "PASSWORD_RESET", "Forgot")));
        System.out.println("  " + chain.handle(new SupportTicket("T-202", "BILLING", "Double charge")));
    }
}
