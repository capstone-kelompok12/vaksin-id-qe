Feature: Manage vaccination bookings
  As an admin
  I want to manage vaccination bookings
  So that I can approve and reject vaccination booking requests

  Scenario: Approve a vaccination booking
    Given I am on landing page
    And I have logged in
    When I go to Book Vaksinasi page
    And I select a session
    And I click check button
    Then the booking will be approved

  Scenario: Approve all vaccination bookings
    Given I am on landing page
    And I have logged in
    When I go to Book Vaksinasi page
    And I select a session
    And I select all bookings
    And I click Terima Semua button
    Then the booking will be approved

  Scenario: Reject a vaccination booking
    Given I am on landing page
    And I have logged in
    When I go to Book Vaksinasi page
    And I select a session
    And I click X button
    Then the booking will be rejected

  Scenario: Reject all vaccination bookings
    Given I am on landing page
    And I have logged in
    When I go to Book Vaksinasi page
    And I select a session
    And I select all bookings
    And I click Tolak Semua button
    Then the booking will be rejected
