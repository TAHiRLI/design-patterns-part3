package com.designpatterns.day03.qa.templatemethod;

public class ApiTestFixture extends BaseTestFixture {
    @Override protected void setUp() { System.out.println("  [Setup] API client ready"); }
    @Override protected void execute(String name) { System.out.println("  [API] Running " + name); }
    @Override protected void tearDown() { System.out.println("  [Teardown] Connection pool released"); }
}
