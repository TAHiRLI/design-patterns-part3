package com.designpatterns.day03.practice.validation;

/**
 * TODO 1 — return true when input is 16 digits.
 * TODO 2 — name() returns "CreditCard".
 */
public class CreditCardValidationStrategy implements ValidationStrategy {
    @Override public boolean validate(String input) {
        throw new UnsupportedOperationException("TODO 1: validate 16-digit card number");
    }
    @Override public String name() {
        throw new UnsupportedOperationException("TODO 2: return strategy name");
    }
}
