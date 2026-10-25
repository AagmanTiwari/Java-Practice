# Java Assignment 5 — Problem 2: Vehicle Manufacturing and Electric Vehicle Management

**Topic:** Multilevel Inheritance (`Vehicle → MotorVehicle → ElectricVehicle`)

## Objective
Create a Java application with three levels of inheritance. Accept user input, display inherited vehicle details, calculate vehicle age, and estimate electric energy consumption in kWh/km.

## Actual File Structure

```text
Assignment_5/
└── VehicleManufacturing/
    ├── Vehicle.java
    ├── MotorVehicle.java
    ├── ElectricVehicle.java
    ├── VehicleMain.java
    ├── README.md
    └── diagrams/
        ├── class-diagram.png
        ├── execution-flow.png
        └── object-memory.png
```

## Classes

| File | Responsibility |
| --- | --- |
| `Vehicle.java` | Stores ID, brand and manufacturing year; calculates age; prints common details. |
| `MotorVehicle.java` | Extends Vehicle and adds engine capacity and fuel type. |
| `ElectricVehicle.java` | Extends MotorVehicle and adds battery, driving range and charging time; calculates energy use. |
| `VehicleMain.java` | Reads input, constructs one ElectricVehicle, and displays all details. |

## Class Diagram

![Class diagram](diagrams/class-diagram.png)

## Execution Flow

![Execution flow](diagrams/execution-flow.png)

## Object/Memory Diagram

![Object memory](diagrams/object-memory.png)

## Execution Explained

1. `VehicleMain.main()` creates a `Scanner` and reads eight inputs.
2. `new ElectricVehicle(...)` starts the subclass constructor.
3. `super(...)` invokes `MotorVehicle(...)`, whose `super(...)` invokes `Vehicle(...)`.
4. `Vehicle(...)` initializes ID, brand, and year. Execution returns to `MotorVehicle(...)` to initialize CC and fuel, then to `ElectricVehicle(...)` to initialize the EV fields.
5. `ev.displayElectricVehicle()` calls `displayMotorVehicle()`, which calls `displayVehicle()`.
6. `displayVehicle()` calculates age from the **current year** using `Year.now().getValue()`.
7. The program prints engine/fuel and EV data, then calculates energy consumption if driving range is above zero.

**Important:** There is one `ElectricVehicle` object containing inherited fields, not three separate Vehicle/MotorVehicle/ElectricVehicle objects.

## Calculation Formulas

- Vehicle age = current calendar year − manufacturing year.
- Energy consumption (kWh/km) = battery capacity (kWh) ÷ driving range (km).

The assignment explicitly requests an engine CC and fuel type in the `MotorVehicle` superclass even for an electric vehicle. For this exercise, `0` CC and `Electric` can be entered to describe an EV without a combustion engine.

## Sample Run

Example input: vehicle ID `501`, brand `Tata Motors`, year `2022`, engine CC `0`, fuel type `Electric`, battery `60` kWh, range `400` km, charge time `8` hours.

On **26 October 2026**, this yields vehicle age **4 years** and energy consumption **0.15 kWh/km**. The displayed age updates automatically with the computer's calendar year.

## Compile and Run

From the `Assignment_5` directory:

```bash
javac VehicleManufacturing/*.java
java VehicleManufacturing.VehicleMain
```

## Python Connection

- `class MotorVehicle extends Vehicle` in Java is similar to `class MotorVehicle(Vehicle):` in Python.
- `super(...)` calls the parent constructor, similar to `super().__init__(...)`.
- A child can reuse accessible inherited fields and methods without rewriting them.

## Faculty Viva — Quick Answers

1. **Multilevel inheritance:** One class inherits from a class that already inherits from another class.
2. **Hierarchy:** `Vehicle → MotorVehicle → ElectricVehicle`.
3. **What does `extends` do?** Establishes inheritance.
4. **What does `super(...)` do?** Invokes the immediate parent constructor.
5. **Does creating an EV create three objects?** No, one ElectricVehicle object has inherited fields.
6. **How is energy use calculated?** Battery capacity divided by driving range; units are kWh/km.
7. **Why use `Year.now()`?** To compute vehicle age without hardcoding the current year.

## Important Note

This beginner-friendly version assumes sensible nonnegative numbers. If range is zero, it displays an explanation instead of dividing by zero. An input year later than the current year would produce a negative age; validation for future years can be added separately.
