@regression
Feature: Add Education Test

  Background:
    Given The user is on the login page
    When The user enters valid credentials email: "muhammed.mustafa.68@gmail.com" and password: "SDETtester68"
    Then The user should be able to see "Mustafa O" on the dashboard


    Scenario: Check Add Education Form Labels
      When The user navigates to tab "Mustafa O" and module "My Profile"
      Then The user verifies that the page title "User Profile"
      When The user navigates user profile tabs "Add Education"
      Then The user verifies that the Add Education tab is displayed
      And The user should be able to see form labels as follows
        | School or Bootcamp *    |
        | Degree or Certificate * |
        | Study                   |
        | From Date               |
        | To Date                 |
        | Program Description     |


  Scenario: Check Add Education Form Labels -2
    When The user navigates to tab "Mustafa O" and module "My Profile"
    Then The user verifies that the page title "User Profile"
    When The user navigates user profile tabs "Add Education"
    Then The user verifies that the Add Education tab is displayed
    And The user should be able to see form labels as follows with empty label
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      |                         |
      | To Date                 |
      | Program Description     |