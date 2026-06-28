package com.designpatterns.day03.practice.homework.chain;

public class Level3Handler extends SupportHandler {
    @Override protected boolean canHandle(SupportTicket ticket) {
        return "OUTAGE".equals(ticket.category());
    }
    @Override protected String resolve(SupportTicket ticket) {
        return "L3 resolved " + ticket.id() + ": incident bridge opened";
    }
}
