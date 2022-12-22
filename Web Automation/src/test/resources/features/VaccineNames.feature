Feature: Vaccine names
  As an admin
  I want to access vaccine names
  So that I can see the list of registered vaccines in Indonesia

  Scenario: View vaccine names in Indonesia
    Given I am on landing page
    And I have logged in
    When I go to Daftar Vaksin page
    Then vaccine names will be displayed