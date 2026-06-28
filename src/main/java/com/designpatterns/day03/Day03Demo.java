package com.designpatterns.day03;

import com.designpatterns.day03.chain.ChainDemo;
import com.designpatterns.day03.command.CommandDemo;
import com.designpatterns.day03.observer.ObserverDemo;
import com.designpatterns.day03.practice.observer.BugObserverDemo;
import com.designpatterns.day03.practice.validation.ValidationStrategyDemo;
import com.designpatterns.day03.qa.QADemo;
import com.designpatterns.day03.strategy.StrategyDemo;
import com.designpatterns.day03.templatemethod.TemplateMethodDemo;

public class Day03Demo {
    public static void main(String[] args) {
        StrategyDemo.run(); System.out.println();
        TemplateMethodDemo.run(); System.out.println();
        ObserverDemo.run(); System.out.println();
        CommandDemo.run(); System.out.println();
        ChainDemo.run(); System.out.println();
        ValidationStrategyDemo.run(); System.out.println();
        BugObserverDemo.run(); System.out.println();
        QADemo.run();
    }
}
