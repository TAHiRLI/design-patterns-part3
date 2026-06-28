package com.designpatterns.day03.practice.homework.chain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupportChainTest {
    @Test void chainRoutesToCorrectLevel() {
        SupportHandler chain = new SupportChainBuilder().buildChain();
        assertTrue(chain.handle(new SupportTicket("T-1", "PASSWORD_RESET", "x")).contains("L1 resolved"));
        assertTrue(chain.handle(new SupportTicket("T-2", "BILLING", "x")).contains("L2 resolved"));
        assertTrue(chain.handle(new SupportTicket("T-3", "OUTAGE", "x")).contains("L3 resolved"));
    }
}
