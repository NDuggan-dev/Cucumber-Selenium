@selenium
Feature: Login Demosite
  As a user, I want to login into thedemosite.co.uk to confirm my account was successfully registered.

Steps include:
- Registering
- Logging in
- Asserting successful login

You must use the Page Object Model (POM).
	Background: On the demosite register
	Given the demosite register page

	  Scenario: Register and log in on demosite
	    Given a username "nialld123"
	    And a password "pass123"
	    When the user registers
	    And goes to the login page
	    And logs in
	    Then verify user is logged in
	

