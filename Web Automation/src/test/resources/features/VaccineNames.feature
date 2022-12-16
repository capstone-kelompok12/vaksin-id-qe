Feature: Vaccine names
  As an admin
  I want to access vaccine names
  So that I can see the list of registered vaccines in Indonesia

  Scenario:
    Given I have logged in
    When I go to Daftar Vaksin page
    Then vaccine names will be displayed