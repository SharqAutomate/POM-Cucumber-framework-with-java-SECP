Feature: Name Reservation

  Scenario:  reserve compnay name

Feature: Name Reservation

  Background:
    Given I am in the login page of the SECP Application
    When I enter valid credentials
    Then I should be taken to the Overview page

  Scenario: Navigate to Name Reservation and choose Name Reserve option
    Given the user clicks on the "Name Reservation" tab
    When the user clicks on the "Let's Start" button
    And the user chooses the "Name Reserve" option
    Then the user should see the "Name Reserve" form
