Feature: Login in Pirani

  Scenario: User succesfully login in Pirani with valid credentials
    Given The user is in the login page
    When User enters valid credential and click on login button
    Then User should see the home page and welcome message