@AddFamilyMembers
Feature: Add Family Members
  User adds his family members in the vaccination booking

  @tag1
  Scenario: User add family members with valid NIK
    Given User on form book vaccine
    When Click add button
    And Input NIK
    And Click search button
    Then Click Yes,add queue button

  @tag2
  Scenario: User add family members with invalid NIK
    Given User in form book vaccine
    When Click add
    And Input invalid NIK
    Then Click search

  @tag3
  Scenario: User add family members without NIK
    Given User form book vaccine
    When Click button add
    Then Click button search

  @tag4
  Scenario: User add family members without register
    Given On form book vaccine
    When Click add family members button
    And Input NIK without register
    Then Click search NIK button

  @tag5
  Scenario: User removes family members without register
    Given User success add family members
    Then Click the cross icon on the family member want to delete
