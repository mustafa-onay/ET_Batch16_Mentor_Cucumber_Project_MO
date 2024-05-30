@regression
Feature: Login Tests with parameters

  # User Story = Feature
  # Test Case = Scenario:
  # Test Steps = Given, When, Then, etc...

#  Background:
#    Given The user is on the login page

  @selim @login @smoke
  Scenario: Positive Login Test with parameter
    Given The user is on the login page
    When The user enters valid credentials email: "muhammed.mustafa.68@gmail.com" and password: "SDETtester68"
    Then The user should be able to login
    And The user should be able to see "Mustafa O" on the dashboard
    And The username should have 9 characters

