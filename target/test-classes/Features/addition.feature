@calculator
Feature: Calculator addition
  Testing whether the application can successfully add two numbers.
  
  As a user, I want to add two or more numbers, so that i can use the sum in further
  calculations or data based decision making.

	Background: Setup Calculator
		Given a Calculator
		
	  Scenario: Integer addition
	    Given the number 2
			And the number 8
	    When the results are added
	    Then the result should be 10
	    
	  Scenario Outline: Integer addition varied values
	    Given the number <int1>
			And the number <int2>
	    When the results are added
	    Then the result should be <expected>
	    
	    
	    Examples:
	    		|int1 |int2 |expected |
	    		|2    |10   |12       |
	    		|3    |4    |7        |

