Feature: Register
  As a user i can register account
  So that i can be a registered user

Background:
  Given the shopping application is opened
  When I click "door out" button
  And I am on login page
  And I click "register" Button

  @RegisterValid
  Scenario: As a user i want to register using valid credential that's never used before
    When the registration page is open
    And I enter a username that has not been registered before
    And I enter a password that complies with security policies
    And I enter a valid email address
    And I click the "Register" button
    Then the user should be redirected to the login page


  @RegisterUsed
  Scenario: As a user i want to register using username that's used before
    Given the registration page is open
    When a username that is already registered is entered
    And I enter a password that complies with security policies
    And I enter a valid email address
    And I click the "Register" button
    Then I should receive error message

  @RegisterInvalidEmail
  Scenario: As a user i want to register using invalid email
    Given the registration page is open
    When I enter a username that has not been registered before
    And I enter a password that complies with security policies
    And I enter an invalid email address (with incorrect email format)
    And I click the "Register" button
    Then I should receive error message

  @RegisterBlank
  Scenario: As a user i want to register without filling credential form
    Given the registration page is open
    When one or more fields (username, password, password confirmation, or email address) are left empty
    And I click the "Register" button
    Then I should receive error message