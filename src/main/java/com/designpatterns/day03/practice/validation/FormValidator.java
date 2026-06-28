package com.designpatterns.day03.practice.validation;

public class FormValidator {
    private ValidationStrategy strategy;
    public void setStrategy(ValidationStrategy strategy) { this.strategy = strategy; }
    public String validate(String input) {
        boolean ok = strategy.validate(input);
        return strategy.name() + " → " + (ok ? "valid" : "invalid");
    }
}
