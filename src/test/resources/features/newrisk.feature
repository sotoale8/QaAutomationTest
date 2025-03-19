Feature: Create a new Risk

  Background:
    Given The user is in the login page
    And User enters valid credential and click on login button

  Scenario: User successfully create a new Risk with minimal information
    Given User click on create a new risk
    When User enters the minimal information to create a new risk
    Then User should see the new risk created in the list