@Register
Feature: Register by using NIK
  User registers an account on Vaccine.ID

  @tag1
  Scenario Outline: User register with valid data
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |