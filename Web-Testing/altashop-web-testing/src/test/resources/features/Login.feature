Feature: Login
  As a user
  I want to log in to my account

  @LoginValid
  Scenario: As a user i want to login using valid username and password
    Given the shopping application is opened
    When I click "door out" button
    And I am on login page
    And I enters a valid "email"
    And I enters a valid "password" that i used
    And I clicks the "Login" button
    Then the user should be redirected to the main application page

  @LoginInvalidEmail
  Scenario: As a user i want to login with invalid email address
    Given the shopping application is opened
    When I click "door out" button
    And I am on login page
    And I enter an invalid "email"
    And I enters a valid "password" that i used
    And I clicks the "Login" button
    Then I should receive an error message for invalid email


  @LoginWrongPassword
  Scenario: As a user i want to login with wrong password
    Given the shopping application is opened
    When I click "door out" button
    And I am on login page
    And I enters a valid "email"
    And I enters an incorrect "password"
    And I clicks the "Login" button
    Then I receives an error message for incorrect password

  @LoginBlank
  Scenario: User login without filling email and password form
    Given the shopping application is opened
    When I click "door out" button
    And I am on login page
    And both the email and password fields are left empty
    And I clicks the "Login" button
    Then I receives an error message because of empty form