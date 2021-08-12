package com.qa.cucumber_selenium.calculator;

import java.util.List;

public class Calculator {
	private Integer intResult = 0;
	private Double doubleResult = 0.0;
	
	public void addNumbers(List<Integer> numbers) {
		for(Integer number : numbers) intResult += number;
	}
	
	public void subtractNumbers(List<Integer> numbers) {
		intResult += numbers.get(0);
		for(int i = 1; i < numbers.size(); i ++) {
			intResult -= numbers.get(i);
		}
	}
	public void addNumbersDouble(List<Double> numbers) {
		for(Double number : numbers) doubleResult += number;
	}
	
	public void subtractNumbersDouble(List<Double> numbers) {
		doubleResult += numbers.get(0);
		for(int i = 1; i < numbers.size(); i ++) {
			doubleResult -= numbers.get(i);
		}
	}
	
	
	public Integer getIntResult() {
		return intResult;
	}
	public Double getDoubleResult() {
		return doubleResult;
	}

}
