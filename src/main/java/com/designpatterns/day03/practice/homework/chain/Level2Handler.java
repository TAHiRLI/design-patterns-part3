package com.designpatterns.day03.practice.homework.chain;

public class Level2Handler extends SupportHandler {
    @Override protected boolean canHandle(SupportTicket ticket) {
        return "BILLING".equals(ticket.category());
    }
    @Override protected String resolve(SupportTicket ticket) {
        return "L2 resolved " + ticket.id() + ": billing adjustment applied";
    }
}
