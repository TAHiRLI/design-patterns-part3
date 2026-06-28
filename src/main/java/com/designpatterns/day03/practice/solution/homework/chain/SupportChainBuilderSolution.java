package com.designpatterns.day03.practice.solution.homework.chain;

import com.designpatterns.day03.practice.homework.chain.Level1Handler;
import com.designpatterns.day03.practice.homework.chain.Level2Handler;
import com.designpatterns.day03.practice.homework.chain.Level3Handler;
import com.designpatterns.day03.practice.homework.chain.SupportHandler;

public class SupportChainBuilderSolution {
    public SupportHandler buildChain() {
        SupportHandler l1 = new Level1Handler();
        l1.linkWith(new Level2Handler()).linkWith(new Level3Handler());
        return l1;
    }
}
