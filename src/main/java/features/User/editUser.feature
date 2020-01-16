Feature: Management page

#  Background:


  Scenario Outline: Edit user name successfully
    Given I open website http://localhost:8080/demo/#!/
    And I verify login successfully with username as admin password as admin
    When I scroll to management tab
    And I click Login Account tab
    When I click button edit as <username>
    When I edit first name as <firstname>, last name as <lastname>, user as <role>, user name as <username>,  password as <password>
    And I click updated button
    Then I verify edit element first name as <firstname> and last name as <lastname> and role as <role> and user name as <username>
    And I log out
    And I verify login successfully with username as <username> password as <password>
    When I scroll to management tab
    And I click Login Account tab
#    And I log out

    Examples:
      | firstname | lastname | role  | password | username   |
      | thuys     | nguyen   | Basic | 12345    | thuynguyen |

  Scenario Outline: Edit user unsuccessfully with blank first name
    When I click button edit as <username>
    When I edit first name as <firstname>, last name as <lastname>, user as <role>, user name as <username>,  password as <password>
    Then I verify can not edit element with blank first name
    Examples:
      | firstname | lastname | role  | password | username   |
      | null      | nguyen   | Basic | 12345    | thuynguyen |