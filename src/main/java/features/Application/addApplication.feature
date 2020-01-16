# new feature
# Tags: optional

Feature: Add Application

  Scenario Outline: Add Application successfully with valid information
    Given I open website http://localhost:8080/demo/
    And   I verify login successfully with username as admin password as admin
    When  I scroll to management tab
    And  I click application on menu select
    And  I click add application button
    And  I input app name as <name> and session expiration as <session> and user base as <user>
    And  I click create button
    Then Verify if a user will be able to add with a new application <applicationName>

    Examples:
      | name | session | user            | applicationName |
      | demo | 20      | User By Session | demo            |


  Scenario Outline: Add Application unsuccessfully with blank session
    And  I click add application button
    And  I input app name as <name> and session expiration as <session> and user base as <user>
    And  I click create button
    Then Verify if a user will be able to add with a new application <applicationName>

    Examples:

      | name  | session | user            | applicationName |
      | demo1 | null    | User By Session | demo1           |


