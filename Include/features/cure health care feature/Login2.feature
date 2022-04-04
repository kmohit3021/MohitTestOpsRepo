@Login2
Feature: Validate Login functionality for the application
  As a user 
  I want to test the login page.
  So that i can validate the login functionality.

  @Regression
  Scenario: Login into application with invalid credentials
    Given Open Test application on the browser
    When User click in make appointment
    And User enter the invalid username as "From Login 2"
    And User Enter the password
    And User click on login
    Then Verify user should be login successfully
