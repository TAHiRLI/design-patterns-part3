# Day 3 Hands-On Checklist

Complete these exercises during the workshop session.

Each exercise maps to a **real production scenario** — see [DAY03-Behavioral-Patterns.md](../../../docs/DAY03-Behavioral-Patterns.md) for full context.

---

## Exercise A — Validation Strategy (`practice/validation/`)

**Scenario:** Your checkout form validates credit cards, emails, and phone numbers differently. Product keeps adding new field types — a giant `switch` in one validator class is unmaintainable.

Implement pluggable validation strategies.

| TODO | File | Method |
|------|------|--------|
| 1 | `CreditCardValidationStrategy.java` | `validate(...)` — 16 digits |
| 2 | `CreditCardValidationStrategy.java` | `name()` — return `"CreditCard"` |
| 3 | `EmailValidationStrategy.java` | `validate(...)` — contains `@` and `.` after `@` |
| 4 | `EmailValidationStrategy.java` | `name()` — return `"Email"` |

**Real-world parallels:** Payment gateway validators, Spring `Validator` implementations, input sanitization pipelines.

**Verify:**
```bash
./gradlew test --tests "*.practice.validation.*"
./gradlew runValidationStrategy
```

---

## Exercise B — Bug Tracker Observer (`practice/observer/`)

**Scenario:** When QA files a bug, multiple channels must react: email the on-call engineer, post to Slack `#bugs`, and later maybe open a Jira ticket — without the `BugTracker` knowing each channel's details.

Implement observer notifications.

| TODO | File | Method |
|------|------|--------|
| 5 | `EmailBugObserver.java` | `onBugReported(...)` — print `[Email] BUG-xxx (SEVERITY): title` |
| 6 | `SlackBugObserver.java` | `onBugReported(...)` — print `[Slack] BUG-xxx (SEVERITY): title` |

**Real-world parallels:** Spring `ApplicationEventPublisher`, JUnit `@ExtendWith` listeners, CI webhooks.

**Verify:**
```bash
./gradlew test --tests "*.practice.observer.*"
./gradlew runBugObserver
```

---

## Instructor Reference

```bash
./gradlew runPracticeSolution
```

---

## Homework (after Day 3)

See [docs/DAY03-HOMEWORK.md](../../../docs/DAY03-HOMEWORK.md)

| HW | Pattern | Real-world parallel |
|----|---------|---------------------|
| 1 | Command | Selenium step replay + undo, macro recorders |
| 2 | Chain of Responsibility | Support tiers, servlet filters, retry pipelines |

> The Order Lifecycle **State** machine homework moved to [Day 4 (design-patterns-part4)](../../../../../../../README.md) along with the State pattern.

```bash
./gradlew runHomeworkSolution   # instructor only
```
