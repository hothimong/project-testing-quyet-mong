Feature: Management page

  Background:
    Given I open website http://localhost:8080/demo/#!/
    And I verify login successfully with username as admin password as admin
    When I scroll to management tab
    And I click Login Account tab

  Scenario Outline: Delete user name successfully

    When I click delete user button <username>
    Then I verify user able delete successfully with <username>


    Examples:
      | username   |
      | thuynguyen |