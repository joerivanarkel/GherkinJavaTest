package com.gherkintest.Steps;

import static org.junit.Assert.assertEquals;

import com.gherkintest.Calculator;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given.Givens;

public class CalculatorSteps {
    public double firstNumber;
    public double secondNumber;
    public double result;

    @Given("^The first number is (.+)$")
    public void the_first_number_is(double firstNumber) throws Throwable {
        this.firstNumber = firstNumber;
    }

    @Given("^The second number is (.+)$")
    public void the_second_number_is(double secondNumber) throws Throwable {
        this.secondNumber = secondNumber;
    }


    @When("^The two numbers are added$")
    public void the_two_numbers_are_added() throws Throwable {
        Calculator calculator = new Calculator();
        result = calculator.add(firstNumber, secondNumber);
    }

    @When("^The two numbers are subtracted$")
    public void the_two_numbers_are_subtracted() throws Throwable {
        Calculator calculator = new Calculator();
        result = calculator.subtract(firstNumber, secondNumber);
    }

    @When("^The two numbers are multiplied$")
    public void the_two_numbers_are_multiplied() throws Throwable {
        Calculator calculator = new Calculator();
        result = calculator.multiply(firstNumber, secondNumber);
    }

    @When("^The two numbers are divided$")
    public void the_two_numbers_are_divided() throws Throwable {
        Calculator calculator = new Calculator();
        result = calculator.divide(firstNumber, secondNumber);
    }


    @Then("^The result should be (.+)$")
    public void the_result_should_be(double result) throws Throwable {
        assertEquals(this.result, result, 0.0001);
    }
}
