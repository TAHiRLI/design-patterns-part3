package com.designpatterns.day03.qa;

import com.designpatterns.day03.qa.chain.FailureHandler;
import com.designpatterns.day03.qa.chain.LogHandler;
import com.designpatterns.day03.qa.chain.NotifyHandler;
import com.designpatterns.day03.qa.chain.ScreenshotHandler;
import com.designpatterns.day03.qa.chain.TestFailure;
import com.designpatterns.day03.qa.command.ClickCommand;
import com.designpatterns.day03.qa.command.NavigateCommand;
import com.designpatterns.day03.qa.command.TestRunner;
import com.designpatterns.day03.qa.observer.EmailNotifier;
import com.designpatterns.day03.qa.observer.SlackNotifier;
import com.designpatterns.day03.qa.observer.TestRunPublisher;
import com.designpatterns.day03.qa.strategy.SoftAssertStrategy;
import com.designpatterns.day03.qa.templatemethod.ApiTestFixture;
import com.designpatterns.day03.qa.templatemethod.UiTestFixture;

public final class QADemo {
    private QADemo() {}
    public static void main(String[] args) { run(); }
    public static void run() {
        System.out.println("--- QA: Strategy (Assertions) ---");
        SoftAssertStrategy soft = new SoftAssertStrategy();
        soft.assertEquals("OK", "OK");
        soft.assertEquals("OK", "FAIL");
        System.out.println("  Soft failures: " + soft.failures().size());

        System.out.println();
        System.out.println("--- QA: Template Method (Fixtures) ---");
        new UiTestFixture().runTest("HomepageTest");
        new ApiTestFixture().runTest("UsersApiTest");

        System.out.println();
        System.out.println("--- QA: Observer (Test Results) ---");
        TestRunPublisher publisher = new TestRunPublisher();
        publisher.subscribe(new SlackNotifier());
        publisher.subscribe(new EmailNotifier());
        publisher.publish("LoginTest", true);
        publisher.publish("PaymentTest", false);

        System.out.println();
        System.out.println("--- QA: Command (Test Steps) ---");
        TestRunner runner = new TestRunner();
        runner.run(new NavigateCommand("https://staging.example.com"));
        runner.run(new ClickCommand("#login"));
        runner.undoLast();

        System.out.println();
        System.out.println("--- QA: Chain (Failure Handlers) ---");
        FailureHandler chain = new ScreenshotHandler();
        chain.linkWith(new LogHandler()).linkWith(new NotifyHandler());
        chain.handle(new TestFailure("CheckoutTest", "UI", "Button not clickable"));
    }
}
