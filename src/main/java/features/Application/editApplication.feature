# new feature
# Tags: optional

Feature: Edit Application

  Background:
    Given I open website http://localhost:8080/demo/

  Scenario Outline: Edit Application successfully
    And   I verify login successfully with username as admin password as admin
    When  I scroll to management tab
    And  I click application on menu select
    And  I click edit button with name as <nameEdit>
    And  I input name as <name>, session expiration as <session>, user base as <user>
    And  I click update button
    Then I Verify if a user will be able to edit with a new application <name> and session expiration as <session> and user base <user>

    Examples:
      | nameEdit | name  | session | user                     |
      | Fusion   | demo2 | 22      | User By Location Sharing |

  Scenario Outline: Edit Application unsuccessfully
    When  I scroll to management tab
    And  I click application on menu select
    And  I click edit button with name as <nameEdit>
    And  I input name as <name>, session expiration as <session>, user base as <user>
    And  I click update button
    Then I Verify user can not edit with a new application <name> and session expiration as <session> and user base <user>

    Examples:
      | nameEdit | name | session | user                     |
      | Fusion   | null | 22      | User By Location Sharing |