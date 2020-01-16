# new feature
# Tags: optional

Feature: Delete Application

  Background:
    Given I open website http://localhost:8080/demo/#!/
    And   I verify login successfully with username as admin password as admin
    When  I scroll to management tab
    And  I click application on menu select

  Scenario Outline: Delete Application successfully

    And  I click application on menu select
    And  I click delete button with name as <name>
    And  I click alert delete button
    Then Verify user able delete successfully with name as <name>


    Examples:
      | name   |
      | Fusion |