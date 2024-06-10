@regression
Feature: Login Test DDF


  Scenario Outline: Login Test with Different Users "<user_name>"
    Given The user is on the login page
    When The user enters valid credentials email: "<email>" and password: "<password>"
    Then The user should be able to login
    And The user should be able to see "<user_name>" on the dashboard
    And The username should have <usernameLenght> characters
    Examples:
      | email                         | password     | user_name | usernameLenght |
      | muhammed.mustafa.68@gmail.com | SDETtester68 | Mustafa O | 9              |
      | rosa@test.com                 | Test123456   | Rosa      | 4              |
      | mike@gmail.com                | mike1234     | mike      | 4              |


  Scenario Outline: Login With Map <"username">
    Given The user is on the login page
    When  The user should be able to login and verifies success login with following map
      | email    | <"email">    |
      | password | <"password"> |
      | username | <"username"> |
    Examples:
      | "email"                       | "password"   | "username" |
      | rosa@test.com                 | Test123456   | Rosa       |
      | muhammed.mustafa.68@gmail.com | SDETtester68 | Mustafa O  |
      | mike@gmail.com                | mike1234     | mike       |

  Scenario Outline: Login With List <"username">
    Given The user is on the login page
    When  The user should be able to login and verifies success login with follows
      | <"email">    |
      | <"password"> |
      | <"username"> |
    Examples:
      | "email"                       | "password"   | "username" |
      | mike@gmail.com                | mike1234     | mike       |
      | rosa@test.com                 | Test123456   | Rosa       |
      | muhammed.mustafa.68@gmail.com | SDETtester68 | Mustafa O  |