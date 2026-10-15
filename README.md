# Sprint 1 - Generics

## About

This project contains Java exercises about Generics.
It has two levels. Each level has small exercises that build on the previous ones.
The goal is to understand how generics work, what problems they solve,
and how to use them with fixed types and varargs.

## Project structure

```text
src/
├── main/java/nivel1/
│   ├── classWithoutGenerics/
│   │   ├── Main.java
│   │   └── NoGenericMethods.java
│   └── genericMethodsWithDifferentParameters/
│       ├── GenericMethods.java
│       ├── Main.java
│       └── Person.java
├── test/java/nivel1/
│   ├── classWithoutGenerics/
│   │   └── NoGenericMethodsTest.java
│   └── genericMethodsWithDifferentParameters/
│       └── PersonTest.java
└── pom.xml
```

## How to run

From IntelliJ:
Right click on a test class -> Run.

From Maven:
```bash
mvn test
```

## Evolution of the code

The evolution of the code can be followed through the Git history.

### Level 1 - Exercise 1: NoGenericMethods

A class that stores three String values, with no generics.
The type is fixed to String, so the class works only with Strings.

Key discovery: the order of the arguments in the constructor matters.
The class does not reorder anything. `getElement1()` returns the first
argument, `getElement2()` the second, and so on.

### Level 1 - Exercise 2: Person + GenericMethods

`Person` is a normal class (no generics) with `name`, `surname` and `age`.
It overrides `toString()` for debugging.

`GenericMethods` has a generic method with three independent generics,
so three different types can be passed in one call.

Key discovery: three independent generics allow mixing types.
Generics solve the **type** problem, not the **order** problem.

### Level 2 - Exercise 1: partially generic method

The method was changed to have one fixed `String` argument and two
generic arguments.

Key discovery: a fixed type must **not** be written inside `<...>`.
At first, an attempt was made with `<String, U, V>`. This was wrong:
`String` inside `<...>` would create a generic named "String", not the
real String type. The fix was to take `String` out of the angle brackets
and put it directly in the parameter.

### Level 2 - Exercise 2: generic varargs

The method was changed to accept a variable number of arguments:
`printAll` with `T... elements`.

Key discovery: all arguments in one call must be the **same type**.
Mixing types does not compile, because a vararg is an array and an
array can only hold one type.

The compiler shows a warning:
`Possible heap pollution from parameterized vararg type T`.

## Key decisions

1. `GenericMethods` is not tested.
   Reason: it prints to the console and returns `void`.
   Testing console output is out of scope for this exercise.

2. `Person.toString()` is not tested.
   Reason: it is for debugging, not part of the contract.
   Testing it would tie the test to a cosmetic format that can change.

3. The warning in `printAll` is left visible.
   Reason: `@SafeVarargs` cannot be applied here
   (the method is not `static`, `final` or `private`).
   The method is safe anyway because it only reads the varargs,
   it does not modify them.

## Lessons learned

- Generics give **type** flexibility, not **order** flexibility.
- A fixed type must not be inside `<...>`.
- Generic varargs need all arguments to be of the same type.
- Tests should be small, independent, and test one thing.
- Not all code needs a test.

## Tests

Tested classes:

- `NoGenericMethods`: 3 tests for the getters.
- `Person`: 3 tests for the getters.

Not tested:

- `GenericMethods`: it only prints, returns `void`.
- `Person.toString()`: it is for debugging, not part of the contract.

## Notes on Git history

This sprint was done as a learning exercise.
The Git history reflects that.

Some commits mix several changes, and some important steps are not
visible as separate commits. Examples:

- A failed attempt with `<String, U, V>` before the fix is not traceable
  as its own commit.
- A small refactor of Main output messages was left uncommitted for a
  while, and is not traceable as part of the sprint flow.
- A commit message refers to internal exercise numbers instead of
  describing the change.

Lessons for the next sprint:

- One commit = one change.
- Commit messages must be self-explanatory.
- Commit small and often.