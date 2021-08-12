package com.qa.cucumber_selenium.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.qa.cucumber_selenium.calculator.Calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions {
	
	private Calculator calculator;
	private List<Integer> integerNums;
	
	@Before
	public void setup() {
		this.integerNums = new ArrayList<Integer>();
	}
	
	@Given("a Calculator")
	public void aCalculator() {
		this.calculator = new Calculator();
	}

	@Given("the number {int}")
	public void theNumber(Integer int1) {
		integerNums.add(int1);
	}

	@When("the results are added")
	public void theResultsAreAdded() {
	    calculator.addNumbers(integerNums);
	}
	
	@When("the results are subtracted")
	public void theResultsAreSubtracted() {
	    calculator.subtractNumbers(integerNums);
	}

	@Then("the result should be {int}")
	public void theResultShouldBe(Integer int1) {
	    Integer actualResult = calculator.getIntResult();
	    assertEquals(actualResult, int1);
	}


}
