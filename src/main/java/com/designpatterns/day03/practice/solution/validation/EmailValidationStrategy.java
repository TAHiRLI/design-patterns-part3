package com.designpatterns.day03.practice.solution.validation;

import com.designpatterns.day03.practice.validation.ValidationStrategy;

public class EmailValidationStrategy implements ValidationStrategy {
    @Override public boolean validate(String input) {
        if (input == null) return false;
        int at = input.indexOf('@');
        return at > 0 && input.indexOf('.', at) > at;
    }
    @Override public String name() { return "Email"; }
}
