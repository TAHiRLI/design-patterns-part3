package com.designpatterns.day03.practice.homework.chain;

public abstract class SupportHandler {
    private SupportHandler next;
    public SupportHandler linkWith(SupportHandler next) { this.next = next; return next; }
    public String handle(SupportTicket ticket) {
        if (canHandle(ticket)) return resolve(ticket);
        if (next != null) return next.handle(ticket);
        return "UNRESOLVED: " + ticket.id();
    }
    protected abstract boolean canHandle(SupportTicket ticket);
    protected abstract String resolve(SupportTicket ticket);
}
