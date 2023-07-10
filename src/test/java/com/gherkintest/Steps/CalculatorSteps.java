package com.gherkintest.Steps;

import static org.junit.Assert.assertEquals;

import com.gherkintest.Calculator;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given.Givens;

public class CalculatorSteps {
    public int firstNumber;
    public int secondNumber;
    public int result;

    @Given("^The first number is (\\d+)$")
    public void the_first_number_is(int firstNumber) throws Throwable {
        this.firstNumber = firstNumber;
    }

    @Given("^The second number is (\\d+)$")
    public void the_second_number_is(int secondNumber) throws Throwable {
        this.secondNumber = secondNumber;
    }

    @When("^The two numbers are added$")
    public void the_two_numbers_are_added() throws Throwable {
        Calculator calculator = new Calculator();
        result = calculator.add(firstNumber, secondNumber);
    }

    @Then("^The result should be (\\d+)$")
    public void the_result_should_be(int result) throws Throwable {
        assertEquals(this.result, result);
    }
}
