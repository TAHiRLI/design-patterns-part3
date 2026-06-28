package com.designpatterns.day03.qa.templatemethod;

public class UiTestFixture extends BaseTestFixture {
    @Override protected void execute(String name) { System.out.println("  [UI] Running " + name); }
}
