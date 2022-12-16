Feature: Manage vaccination bookings
  As an admin
  I want to manage vaccination bookings
  So that I can approve or reject vaccination booking requests

  Scenario: Approve a vaccination booking
    Given I have logged in
    And I go to Book Vaksinasi page
    When I select a session
    And I click check button
    Then the booking will be approved

  Scenario: Approve all vaccination bookings
    Given I have logged in
    And I go to Book Vaksinasi page
    When I click Terima Semua button
    Then the booking will be approved

  Scenario: Reject a vaccination booking
    Given I have logged in
    And I go to Book Vaksinasi page
    When I select a session
    And I click X button
    Then the booking will be rejected

  Scenario: Reject all vaccination bookings
    Given I have logged in
    And I go to Book Vaksinasi page
    When I click Tolak Semua button
    Then the booking will be rejected

  Scenario: Sort vaccination bookings by vaccine
    Given I have logged in
    And I go to Book Vaksinasi page
    When I click the arrow button on vaccine field
    And I select vaccine
    Then bookings will be sorted by vaccine

  Scenario: Sort vaccination bookings by status
    Given I have logged in
    And I go to Book Vaksinasi page
    When I click the arrow button on status field
    And I select status
    Then bookings will be sorted by status

  Scenario: Sort vaccination bookings by time
    Given I have logged in
    And I go to Book Vaksinasi page
    When I click the dots on the top right of page
    And I click Waktu button
    And I select time
    Then bookings will be sorted by time

  Scenario: Sort vaccination bookings by dose
    Given I have logged in
    And I go to Book Vaksinasi page
    When I click the dots on the top right of page
    And I click Dosis button
    And I select dose
    Then bookings will be sorted by dose
