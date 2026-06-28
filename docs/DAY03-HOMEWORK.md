# Day 3 Homework — Behavioral Patterns

**Due:** After Day 3 session (optional stretch before Day 4 if applicable)  
**Verify all:** `./gradlew test --tests "*.homework.*"`

Instructor reference: `./gradlew runHomeworkSolution`

Each assignment mirrors a **real production scenario** discussed in [DAY03-Behavioral-Patterns.md](./DAY03-Behavioral-Patterns.md).

---

## HW1 — Test Automation Command Queue

**Pattern:** Command  
**Package:** `com.designpatterns.day03.practice.homework.command`

### Real-world context

Your QA team records UI automation steps for flaky-test debugging. Testers want to **replay** steps and **undo** the last action when a locator changes mid-run — similar to Photoshop history or Selenium IDE macro playback.

Without Command, undo logic lives inside every step class as giant `if/else`. With Command, each step encapsulates `execute()` + `undo()` and a queue manages history.

| Without Command | With Command |
|-----------------|--------------|
| Undo logic duplicated per step | Each command knows how to reverse itself |
| Cannot serialize/replay macro | Commands can be logged, queued, retried |
| Hard to add "macro recorder" | Push commands to history as they run |

### Your task

Implement `TestCommandQueue`:

1. `run(AutomationCommand)` — execute the command and push it onto history
2. `undoLast()` — pop the most recent command and call its `undo()`

Pre-built commands: `TypeTextCommand`, `ClearScreenCommand` (do not modify unless needed).

### Example flow

```java
StringBuilder screen = new StringBuilder();
TestCommandQueue queue = new TestCommandQueue();
queue.run(new TypeTextCommand(screen, "hello"));
queue.run(new TypeTextCommand(screen, " world"));
// screen → "hello world"
queue.undoLast();
// screen → "hello"
```

### QA angle

Map each Selenium action (`click`, `type`, `navigate`) to a Command. When a test fails at step 7, undo back to step 6 and retry with an updated locator — without restarting the browser.

### Verify

```bash
./gradlew test --tests "*.homework.command.*"
./gradlew runHomework1
```

---

> **Note:** The Order Lifecycle **State** machine homework moved to [Day 4 (design-patterns-part4)](../../design-patterns-part4/docs/DAY04-HOMEWORK.md) along with the State pattern.

---

## HW2 — Support Ticket Handler Chain

**Pattern:** Chain of Responsibility  
**Package:** `com.designpatterns.day03.practice.homework.chain`

### Real-world context

Your SaaS helpdesk routes tickets by category: **password resets** → L1, **billing disputes** → L2, **production outages** → L3. Without Chain, a central dispatcher `switch` grows every time a new category appears. With Chain, each handler decides "can I handle this?" or passes to `next`.

| Industry parallel | Same idea |
|-------------------|-----------|
| **Servlet filters** | Auth → CORS → Rate limit → Controller |
| **Logging pipelines** | Debug → Info → Error handlers |
| **Retry policies** | Network → Timeout → Fallback |

### Your task

Implement `SupportChainBuilder.buildChain()`:

1. Create `Level1Handler`, `Level2Handler`, `Level3Handler`
2. Link them: L1 → L2 → L3
3. Return the head (`Level1Handler`)

Handler logic is pre-implemented — you wire the chain.

### Example output

```
L1 resolved T-101: password reset sent
L2 resolved T-202: billing adjustment applied
L3 resolved T-303: incident bridge opened
```

### QA angle

Build a test-failure pipeline: UI failures → screenshot handler; API failures → log handler; critical → PagerDuty handler. Each handler is independently testable.

### Verify

```bash
./gradlew test --tests "*.homework.chain.*"
./gradlew runHomework2
```

---

## Stretch Goals (Optional)

| Stretch | Pattern | Idea |
|---------|---------|------|
| S1 | Command | Add `redo()` (re-run the last undone command) to the queue |
| S2 | Observer | Notify Teams channel when nightly suite fails |
| S3 | Strategy | Swap `WaitStrategy` (explicit vs fluent) per environment |

---

## Submission Checklist

- [ ] Both homework test suites pass
- [ ] No changes to pre-implemented handler classes unless required
- [ ] Code follows the same naming/style as Day 1–2 homework
- [ ] (Bonus) Write one sentence per HW explaining where you've seen this pattern in production

---

## Reflection Questions

1. **HW1:** How is Selenium IDE "record & playback" related to Command?  
2. **HW2:** Where have you seen servlet filters or middleware chains in web frameworks?
