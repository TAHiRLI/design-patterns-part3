package com.designpatterns.day03.practice.homework.chain;

/**
 * Homework 3 — build the support handler chain L1 → L2 → L3.
 * TODO 5 — create and link Level1Handler, Level2Handler, Level3Handler
 * TODO 6 — return the head of the chain (Level1Handler)
 */
public class SupportChainBuilder {
    public SupportHandler buildChain() {
        Level1Handler level1Handler = new Level1Handler();
        Level2Handler level2Handler = new Level2Handler();
        Level3Handler level3Handler = new Level3Handler();

        level1Handler.linkWith(level2Handler);
        level2Handler.linkWith(level3Handler);

        return level1Handler;
    }
}
