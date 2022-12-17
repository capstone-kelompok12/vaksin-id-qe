@tag
Feature: Register By Using NIK
  User registers an account on Vaccine.ID

  @tag1
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

  @tag1
  Scenario: User register with valid data
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag2
  Scenario: User register without NIK
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag3
  Scenario: User register without email
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag4
  Scenario: User register without password
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag5
  Scenario: User register without fullname
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag6
  Scenario: User register without phone number
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag7
  Scenario: User register without gender
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag8
  Scenario: User register without birthdate
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag9
  Scenario: User register with invalid NIK
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag10
  Scenario: User register with invalid email
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag11
  Scenario: User register with invalid password
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag12
  Scenario: User register with invalid phonenumber
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag13
  Scenario: User register with invalid gender
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message

  @tag14
  Scenario: User register with invalid birthdate
    Given User set method post and endpoint register
    When User set body parameter using data
    And User send request
    Then User received respon message
