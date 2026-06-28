package com.designpatterns.day03.practice.homework.chain;

public final class SupportChainDemo {
    private SupportChainDemo() {}
    public static void main(String[] args) { run(); }
    public static void run() {
        System.out.println("--- Homework 3: Support Chain ---");
        SupportHandler chain = new SupportChainBuilder().buildChain();
        System.out.println("  " + chain.handle(new SupportTicket("T-101", "PASSWORD_RESET", "Forgot password")));
        System.out.println("  " + chain.handle(new SupportTicket("T-202", "BILLING", "Double charge")));
        System.out.println("  " + chain.handle(new SupportTicket("T-303", "OUTAGE", "Site down")));
    }
}
