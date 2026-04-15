# Robot Competition

### **Context**

An engineering company organizes an **autonomous robot competition** every year
across different categories: land, water, and air robots.

Each robot has unique characteristics and competes in tests that require
analyzing its capabilities.

---

### 👀 **Objective**

Implement a system in **Java** that allows **registering competitor robots**
and **consulting their capabilities and performance**.

> 💡 No database or graphical interface is required.
> The system can be demonstrated in `main()` or better yet with **unit tests**.
> You are expected to apply **OOP**: inheritance, polymorphism,
> encapsulation and behavior-oriented design.

---

### 📌 1 - Robot Registration

Robots share these **general attributes**:
- **Name**
- **Manufacturer**
- **Manufacturing year**
- **Competition registration date**

Each robot type has **specific attributes:**

| Robot Type | Specific Attributes |
| --- | --- |
| **Land** | Max speed (km/h), traction type (TRACK, WHEEL) |
| **Water** | Max depth (m), propulsion system (PROPELLER, JET) |
| **Air** | Max altitude (m), flight autonomy (minutes) |

---

### 📌 2 - Technical Description

Each robot must have a `getTechnicalDescription()` method that **returns**
a description based on its characteristics.

Examples:
- 🤖 **Land Robot**
  "TankBot, manufactured by RoboCorp in 2022, uses TRACK traction and reaches up to 40 km/h."

- 🌊 **Water Robot**
  "AquaRunner reaches a depth of 500 m with PROPELLER propulsion. Manufactured by AquaTech in 2021."

- ✈️ **Air Robot**
  "SkyDancer flies up to 3000 m for 90 minutes. Manufactured in 2023 by AeroDynamics."

---

### 📌 3 - Queries

Implement a system that allows:
1. **List all registered robots** with their technical description.
2. **Filter land robots with speed greater than X km/h**.
3. **Search robots by manufacturer** (regardless of type).

> 💡 Use of streams, helper methods and separation of responsibilities will be valued.

---

### 📌 4 - Extreme Resistance Competition

An **exclusive competition** is organized for **land** and **air** robots
prepared to operate in extreme conditions.

To participate, a robot must meet one of the following criteria:

| Robot Type | Participation Requirement |
| --- | --- |
| Land | Must have TRACK traction |
| Air | Must have flight autonomy of **at least 60 minutes** |

> **REMEMBER**: Only land and air robots can be evaluated for this competition.
> Other types are not valid candidates and must be excluded from the report.

The following helper class is provided to print reports for multiple robots:

```java
public class ResistanceReportPrinter {
    public void printReport(List<ResistanceEvaluable> robots) {
        System.out.println("=== Resilience Test Reports ===");
        for (ResistanceEvaluable robot : robots) {
            System.out.println(robot.getResistanceReport());
            System.out.println();
        }
    }
}
```

**Expected output examples:**
````
=== Resilience Test Reports ===
SkyX-1: flight autonomy of 75 minutes. Fit for competition.
FlyBot-3: flight autonomy of 45 minutes. Does not meet requirements.
T-1000: TRACK traction confirmed. Fit for competition.
````
**🎯 Your Goal**
Implement a solution that generates a report with the participation
evaluation from a list of evaluable robots.