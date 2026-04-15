# Robot Competition 🤖

A Java application built as part of my backend bootcamp at IT Academy Barcelona.
It simulates an autonomous robot competition system across three categories:
land, water, and air — each with unique capabilities and competition rules.

---

## 🗂️ Project Structure
````
src/
├── domain/         → Robot (abstract), LandRobot, WaterRobot, AirRobot
│                     ResistanceEvaluable, TractionType, PropulsionType
├── service/        → RobotService (registration + queries)
├── report/         → ResistanceReportPrinter
└── app/            → Main
````
---

## ⚙️ Features

- Register land, water, and air robots with their specific attributes
- List all robots with their technical descriptions
- Filter land robots by maximum speed
- Search robots by manufacturer (any type)
- Generate resistance competition reports for eligible robots only

---

## 🤖 Robot Types

| Type | Specific Attributes | Resistance Eligible |
|------|-------------------|-------------------|
| 🦾 Land | Max speed (km/h), Traction (TRACK/WHEEL) | ✅ if TRACK |
| 🌊 Water | Max depth (m), Propulsion (PROPELLER/JET) | ❌ |
| ✈️ Air | Max altitude (m), Flight autonomy (min) | ✅ if ≥ 60 min |

---

## 💻 Output Example

```bash
=== List of Robots ===
Optimus manufactured by TESLA in 2026, uses TRACK traction and reaches up to 60km/h.
A2 flies up to 200m for 120 minutes. Manufactured in 2025 by Agibot.
BlueROV2 reaches a depth of 150m with JET propulsion. Manufactured by BlueRobotics in 2024.

=== Resilience Test Reports ===
Optimus: TRACK traction confirmed. Fit for competition.
A2: Flight autonomy minimum 60 minutes confirmed. Fit for competition.
T71: WHEEL traction. Does not meet requirements.
```

---

## 🛠️ Tech Stack

Java 21 · Maven · JUnit 5 · IntelliJ IDEA

---

## 🧠 Concepts Applied

Object-oriented programming · Inheritance · Polymorphism · Interfaces ·
Enums · Java Streams · Pattern Matching · JUnit 5 · java.time API

---

## 🚀 How to Run

Open in IntelliJ IDEA and run `Main.java` in the `app/` package.

## 🧪 Tests

```bash
src/
└── test/
    └── java/
        └── level_exam_test/
            └── RobotServiceTest.java
```

| Test | Description |
|------|-------------|
| `filterByMaxSpeed()` | Asserts only robots with speed > threshold are returned |
| `filterByTypeAndFuel()` | Asserts filtering by class type and fuel returns correct results |

Run tests in IntelliJ with the green ▶️ button on `RobotServiceTest.java`.

---
