# Builder Design Pattern - Car Manufacturing

## Product Description
The product being built in this project is a `Car`. Because cars have numerous optional and required components (engine, seats, suspension), the Builder pattern is ideal for assembling them step-by-step without cluttering the constructor.

## Representations
This project uses two concrete builders to create meaningfully different representations of a Car:
1. **SportsCarBuilder:** Enforces a strict 2-seat maximum and automatically applies a stiff track suspension.
2. **FamilyCarBuilder:** Enforces a minimum of 4 seats and automatically applies a soft comfort suspension.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Navigate to `src/Main.java`.
3. Run the `Main` class. The console will output the step-by-step construction of a Dodge Demon, a Hyundai Santa Fe, and demonstrate validation errors (Clean Code principles).
