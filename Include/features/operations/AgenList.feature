@admin @agentlist
Feature: ADMIN:-Automation Test for Agent List Functionality
  As an Agency Connect user
  I want to login into my account
  So that user can test the features

  @details
  Scenario: ADMIN:-Verify Agent Personal Information details
    When verify and click Agent list grid data displaying or not22
    Then user click on22 "Personal Information"
    Then verify22 "Personal Information" of agent
    When user click on22 "Account Information"
    Then verify22 "Account Information" of agent
    When user click22 on "Spouse Information"
    Then verify22 "Spouse Information" of agent
    When user22 click on "Agent Information"
    Then verify22 "Agent Information" of agent
    When user click22 on "License Information"
    Then verify22 "License Information" of agent
    When user click22 on "Hierarchy Information"
    Then verify22 "Hierarchy Information" of agent
