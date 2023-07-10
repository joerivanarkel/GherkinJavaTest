# Gherkin Java Test

This is a simple project to demonstrate how to use Gherkin with Java.

# Structure

```
└───src
    ├───main
    │   └───java
    │       └───com
    │           └───gherkintest
    │                   Calculator.java
    │
    └───test
        ├───java
        │   └───com
        │       └───gherkintest
        │           │   CucumberConfig.java
        │           │
        │           └───Steps
        │                   CalculatorSteps.java
        │
        └───resources
            └───com
                └───gherkintest
                        calculator.feature
```

The `Calculator.java` class is the class that contains the methods that will be called by the steps. The `calculator.feature` file contains the Gherkin code that will be executed by Cucumber. The `CalculatorSteps.java` class contains the steps that will be executed by Cucumber. The `CucumberConfig.java` class contains the configuration for Cucumber.

# Running

To run the tests, just run the `CucumberConfig.java` class as a JUnit test.

# Dependencies

| groupId | artifactId | version |
| --- | --- | --- |
| io.cucumber | cucumber-java | 6.10.4 |
| io.cucumber | cucumber-junit | 6.10.4 |
| junit | junit | 4.12 |
