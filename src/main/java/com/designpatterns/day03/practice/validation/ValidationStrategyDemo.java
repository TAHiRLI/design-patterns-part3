package com.designpatterns.day03.practice.validation;

public final class ValidationStrategyDemo {
    private ValidationStrategyDemo() {}
    public static void main(String[] args) { run(); }
    public static void run() {
        System.out.println("--- Practice: Validation Strategy ---");
        FormValidator validator = new FormValidator();
        try {
            validator.setStrategy(new CreditCardValidationStrategy());
            System.out.println("  " + validator.validate("4111111111111111"));
            validator.setStrategy(new EmailValidationStrategy());
            System.out.println("  " + validator.validate("qa@example.com"));
        } catch (UnsupportedOperationException e) {
            System.out.println("  ⏳ " + e.getMessage());
            System.out.println("  → Run: ./gradlew test --tests \"*.practice.validation.*\"");
        }
    }
}
