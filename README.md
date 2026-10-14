# Sprint 1 - Generics

## About

This project contains exercises about Java Generics.
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

### Level 1 - Exercise 1: NoGenericMethods

A class that stores three String values.
It has no generics. The type is fixed to String.

Discovery:
The order of the arguments in the constructor matters.
The class does not reorder anything.
`getElement1()` returns the first argument, `getElement2()` the second, and so on.

### Level 1 - Exercise 2: Person + GenericMethods

`Person` is a normal class (no generics) with `name`, `surname` and `age`.
It overrides `toString()` for debugging.

`GenericMethods` has a generic method with three independent generics:

```java
public <T, U, V> void printElements(T element1, U element2, V element3)
```

Usage example from the Main:

```java
gm.printElements(person, "Hey", 44);
gm.printElements("See you later alligator ", 39, person);
```

Discovery:
Three independent generics allow three different types in one call.
Generics solve the **type** problem, not the **order** problem.

### Level 2 - Exercise 1: partially generic method

One argument becomes a fixed `String`. The other two stay generic.

Before:

```java
public <T, U, V> void printElements(T element1, U element2, V element3)
```

After:

```java
public <U, V> void printElements(String element1, U element2, V element3)
```

Usage example from the Main:

```java
gm.printElements("Hey", person, 44);
gm.printElements("See you later alligator ", 39, person);
```

Discovery:
A fixed type must **NOT** be written inside `<...>`.

At first, the method was written as `<String, U, V>`. This was a mistake.
`String` inside `<...>` would create a generic type named "String",
not the real String type. The correct version takes `String`
out of the angle brackets and puts it directly in the parameter.

### Level 2 - Exercise 2: generic varargs

The method changes to accept a variable number of arguments.

Before:

```java
public <U, V> void printElements(String element1, U element2, V element3)
```

After:

```java
public <T> void printAll(T... elements) {
    for (T element : elements) {
        System.out.println(element);
    }
}
```

Discovery:
All arguments in one call must be the **same type**.
Mixing types does not compile.
The compiler shows a warning:

```text
Possible heap pollution from parameterized vararg type T
```

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
   The method is safe anyway because it only reads the varargs, it does not modify them.

## Lessons learned

- Generics give **type** flexibility, not **order** flexibility.
- A fixed type must not be inside `<...>`.
- Generic varargs need all arguments to be of the same type.
- Tests should be small, independent, and test one thing.
- Not all code needs a test.

## Tests

Tested classes:

- `NoGenericMethods` (3 tests):
   - `getElement1ReturnsFirstArgument`
   - `getElement2ReturnsSecondArgument`
   - `getElement3ReturnsThirdArgument`

- `Person` (3 tests):
   - `getNameReturnsName`
   - `getSurnameReturnsSurname`
   - `getAgeReturnsAge`

Not tested:

- `GenericMethods`: it only prints, returns `void`.
- `Person.toString()`: it is for debugging, not part of the contract.