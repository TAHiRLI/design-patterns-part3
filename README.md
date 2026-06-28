# Design Patterns — Day 3: Behavioral Patterns I

Java workshop project with runnable examples for developers **and QA engineers**.

> **Prerequisite:** Complete [Day 1 (Creational)](../design-patterns/) and [Day 2 (Structural)](../design-patterns-part2/) before this session.
> **Next:** [Day 4 — Behavioral Patterns II & Case Study](../design-patterns-part4/) covers State, Mediator, Memento, Iterator, Interpreter.

## Quick Start

All demos:

```bash
./gradlew run
```

All tests (QA pattern examples included; practice/homework tests fail until TODOs are complete):

```bash
./gradlew test
```

## Individual Demos

```bash
./gradlew runStrategy
./gradlew runTemplateMethod
./gradlew runObserver
./gradlew runCommand
./gradlew runChain
./gradlew runValidationStrategy
./gradlew runBugObserver
./gradlew runPracticeSolution   # instructor: completed practice answers
./gradlew runHomework1          # attendee TODO: Command queue
./gradlew runHomework2          # attendee TODO: Support ticket chain
./gradlew runHomeworkSolution   # instructor: completed homework answers
./gradlew runQA
```

Or run any `*Demo` class from your IDE.

## Documentation

Full theory, real-world examples, and **QA engineer guides**:

→ [docs/DAY03-Behavioral-Patterns.md](docs/DAY03-Behavioral-Patterns.md)

**Homework (Day 3 follow-up):**

→ [docs/DAY03-HOMEWORK.md](docs/DAY03-HOMEWORK.md)

### Real-World Highlights (by pattern)

| Pattern | Industry example | QA example |
|---------|------------------|------------|
| Strategy | Payment methods, sorting, pricing rules | Hard vs soft assertion strategies |
| Template Method | JUnit lifecycle, data import skeletons | Base test fixture (setup/run/teardown) |
| Observer | Event buses, reactive UI, webhooks | Test result listeners (Slack, email) |
| Command | Undo/redo, job queues, CQRS | Test step commands with undo |
| Chain of Responsibility | Servlet filters, logging pipelines | Failure handler chain (screenshot → log → notify) |

## Packages

```
com.designpatterns.day03
├── Day03Demo.java              # runs all demos
├── strategy/                   # Payment strategies
├── templatemethod/             # CSV vs JSON data miners
├── observer/                   # Stock market notifications
├── command/                    # Remote control + undo
├── chain/                      # Logging handler chain
├── qa/                         # QA automation pattern examples
│   ├── strategy/               # Hard vs soft assertions
│   ├── templatemethod/         # UI vs API test fixtures
│   ├── observer/               # Slack + email notifiers
│   ├── command/                # Test step replay + undo
│   └── chain/                  # Failure handler pipeline
└── practice/
    ├── PRACTICE-TODOS.md         attendee checklist
    ├── validation/               Exercise A — Strategy (TODO)
    ├── observer/                 Exercise B — Observer (TODO)
    ├── homework/                 HW1–HW2 (TODO)
    └── solution/                 instructor reference
```

## Patterns Covered

| Pattern | Dev example | QA example |
|---------|-------------|------------|
| Strategy | `CreditCardStrategy`, `PayPalStrategy` | `HardAssertStrategy`, `SoftAssertStrategy` |
| Template Method | `CsvDataMiner`, `JsonDataMiner` | `UiTestFixture`, `ApiTestFixture` |
| Observer | `StockMarket`, `Investor` | `TestRunPublisher`, `SlackNotifier` |
| Command | `LightOnCommand`, `RemoteControl` | `NavigateCommand`, `ClickCommand`, `TestRunner` |
| Chain of Responsibility | `DebugHandler` → `InfoHandler` → `ErrorHandler` | `ScreenshotHandler` → `LogHandler` → `NotifyHandler` |

## Workshop Agenda Mapping

| Time | Module | Code / Docs |
|------|--------|-------------|
| 09:30–10:30 | Module 8 — Behavioral Patterns I | `strategy/`, `templatemethod/`, `observer/` |
| 10:30–11:15 | Module 9 — Behavioral Patterns II | `command/`, `chain/` |
| 11:30–13:00 | Module 10 — Hands-On Practice | `practice/` TODOs — see [PRACTICE-TODOS.md](src/main/java/com/designpatterns/day03/practice/PRACTICE-TODOS.md) |
| Optional | QA deep dive | `qa/` + `./gradlew test --tests "*.qa.*"` |

## Course Progress

| Day | Category | Patterns | Repository |
|-----|----------|----------|------------|
| 1 | Creational | 5 | [design-patterns](../design-patterns/) |
| 2 | Structural | 7 | [design-patterns-part2](../design-patterns-part2/) |
| 3 | Behavioral I | Strategy, Template Method, Observer, Command, Chain | this repo |
| 4 | Behavioral II + Case Study | State, Mediator, Memento, Iterator, Interpreter (+ Visitor) | [design-patterns-part4](../design-patterns-part4/) |
