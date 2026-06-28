package com.designpatterns.day03.practice.homework.chain;

public class Level1Handler extends SupportHandler {
    @Override protected boolean canHandle(SupportTicket ticket) {
        return "PASSWORD_RESET".equals(ticket.category());
    }
    @Override protected String resolve(SupportTicket ticket) {
        return "L1 resolved " + ticket.id() + ": password reset sent";
    }
}
