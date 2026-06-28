package com.designpatterns.day03.practice.validation;

public interface ValidationStrategy {
    boolean validate(String input);
    String name();
}
