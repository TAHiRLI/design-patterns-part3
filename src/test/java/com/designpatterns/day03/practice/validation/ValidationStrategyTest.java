package com.designpatterns.day03.practice.validation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidationStrategyTest {
    @Test void creditCardValidates16Digits() {
        FormValidator v = new FormValidator();
        v.setStrategy(new CreditCardValidationStrategy());
        assertTrue(v.validate("4111111111111111").contains("valid"));
        assertTrue(v.validate("1234").contains("invalid"));
    }
    @Test void emailValidatesFormat() {
        FormValidator v = new FormValidator();
        v.setStrategy(new EmailValidationStrategy());
        assertTrue(v.validate("qa@example.com").contains("valid"));
        assertTrue(v.validate("not-an-email").contains("invalid"));
    }
}
