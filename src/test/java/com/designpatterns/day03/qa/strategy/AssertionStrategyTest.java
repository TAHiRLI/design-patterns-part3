package com.designpatterns.day03.qa.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AssertionStrategyTest {
    @Test void hardAssertThrowsOnMismatch() {
        HardAssertStrategy hard = new HardAssertStrategy();
        assertThrows(AssertionError.class, () -> hard.assertEquals("a", "b"));
    }
    @Test void softAssertCollectsFailures() {
        SoftAssertStrategy soft = new SoftAssertStrategy();
        soft.assertEquals("a", "b");
        assertEquals(1, soft.failures().size());
    }
}
