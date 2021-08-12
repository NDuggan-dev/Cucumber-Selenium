@selenium
Feature: Search bing
  

	Background: Set up webpage
		Given the Bing Webpage
		
	  Scenario: Search doge
	    When the user searches for doge
	    Then the page title should have doge
	    