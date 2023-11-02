@HelloGreetings
Feature: Hello
  As a user
  I want receive Hello greetings
  So That i can get "200 OK" response

  Scenario: As a user i want to receive hello greetings
    Given I set API endpoint to get hello greetings
    When I send request to get hello
    Then I receive status code 200
    And I receive hello greetings