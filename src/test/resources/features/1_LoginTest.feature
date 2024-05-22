@login
Feature: Login Tests

@loginSelim @selim
  Scenario: Positive Login Test as Selim
    Given The user is on the login page
    When The user enters valid credentials for Selim
    Then The user should be able to login

@loginRosa
  Scenario: Positive Login Test as Rosa
    Given The user is on the login page
    When The user enters valid credentials for Rosa
    Then The user should be able to login
