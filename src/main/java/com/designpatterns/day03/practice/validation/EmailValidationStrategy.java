package com.designpatterns.day03.practice.validation;

/**
 * TODO 3 — return true when input contains @ and a dot after @.
 * TODO 4 — name() returns "Email".
 */
public class EmailValidationStrategy implements ValidationStrategy {
    @Override public boolean validate(String input) {
        throw new UnsupportedOperationException("TODO 3: validate email format");
    }
    @Override public String name() {
        throw new UnsupportedOperationException("TODO 4: return strategy name");
    }
}
