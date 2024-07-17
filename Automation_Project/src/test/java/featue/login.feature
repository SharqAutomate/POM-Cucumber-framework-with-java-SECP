Feature: login feature

  Scenario:  successful login

    Given I am in the login page of the SECP Application
    When I enter valid credentials
    Then I should be taken to the Overview page
