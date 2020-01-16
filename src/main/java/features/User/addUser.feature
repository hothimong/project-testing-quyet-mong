Feature: Management page

#  Background:

  Scenario Outline: Add user name successfully
    Given I open website http://localhost:8080/demo/#!/
    And   I verify login successfully with username as admin password as admin
    When  I scroll to management tab
    And   I click Login Account tab
    And   I open add user button
    When  I input first name as <firstname>, last name as <lastname>, role as <role>, user name as <username>, password as <password>
    And   I click create add user button
    Then  I verify add user successfully with username as <username>
    And   I log out
    And   I verify login successfully with username as <username> password as <password>
    When  I scroll to management tab
    And   I click Login Account tab


    Examples:
      | firstname | lastname | role  | password | username  |
      | mong      | ho       | Basic | 12345    | hothimong |

  Scenario Outline: Add user name unsuccessfully with blank lastname
    And  I open add user button
    When I input first name as <firstname>, last name as <lastname>, role as <role>, user name as <username>, password as <password>
    Then I verify can not add user with blank last name


    Examples:
      | firstname | lastname | role  | password | username  |
      | linh      | null     | Basic | 12345    | hothilinh |
