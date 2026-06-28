package com.designpatterns.day03.practice.solution.validation;

import com.designpatterns.day03.practice.validation.ValidationStrategy;

public class CreditCardValidationStrategy implements ValidationStrategy {
    @Override public boolean validate(String input) {
        return input != null && input.matches("\\d{16}");
    }
    @Override public String name() { return "CreditCard"; }
}
