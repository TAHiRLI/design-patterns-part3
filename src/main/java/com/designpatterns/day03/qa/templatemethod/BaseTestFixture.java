package com.designpatterns.day03.qa.templatemethod;

public abstract class BaseTestFixture {
    public final void runTest(String name) {
        setUp();
        execute(name);
        tearDown();
    }
    protected void setUp() { System.out.println("  [Setup] Browser ready"); }
    protected abstract void execute(String name);
    protected void tearDown() { System.out.println("  [Teardown] Browser closed"); }
}
