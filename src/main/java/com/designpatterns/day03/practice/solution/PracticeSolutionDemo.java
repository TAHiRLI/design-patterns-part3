package com.designpatterns.day03.practice.solution;

import com.designpatterns.day03.practice.observer.BugTracker;
import com.designpatterns.day03.practice.solution.observer.EmailBugObserver;
import com.designpatterns.day03.practice.solution.observer.SlackBugObserver;
import com.designpatterns.day03.practice.solution.validation.CreditCardValidationStrategy;
import com.designpatterns.day03.practice.solution.validation.EmailValidationStrategy;
import com.designpatterns.day03.practice.validation.FormValidator;

public final class PracticeSolutionDemo {
    private PracticeSolutionDemo() {}
    public static void main(String[] args) { run(); }
    public static void run() {
        System.out.println("--- Solution: Validation Strategy ---");
        FormValidator validator = new FormValidator();
        validator.setStrategy(new CreditCardValidationStrategy());
        System.out.println("  " + validator.validate("4111111111111111"));
        validator.setStrategy(new EmailValidationStrategy());
        System.out.println("  " + validator.validate("qa@example.com"));

        System.out.println();
        System.out.println("--- Solution: Bug Tracker Observer ---");
        BugTracker tracker = new BugTracker();
        tracker.subscribe(new EmailBugObserver());
        tracker.subscribe(new SlackBugObserver());
        tracker.reportBug("BUG-42", "CRITICAL", "Checkout button unresponsive");
    }
}
