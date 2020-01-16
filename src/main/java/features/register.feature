Feature: Register page

  Background:
    Given I open website http://localhost:8080/demo/#!/login

  Scenario Outline: Register successfully
    When I click register button
    When I input information are first name as <firstname>, last name as <lastname>, user name as <username>, password as <password>
    And  I click submit register
    Then I verify register successfully
    And  I verify login successfully with username as <firstname> password as <password>
    When I scroll to management tab
    And  I click Login Account tab
    And I log out

    Examples:
      | firstname | lastname | username | password |
      | Lam       | tran     | lamtran  | lam      |

  Scenario Outline: Register unsuccessfully with blank field lastname
    When I click register button
    When I input information are first name as <firstname>, last name as <lastname>, user name as <username>, password as <password>
    Then I verify register unsuccessfully with invalid information

    Examples:
      | firstname | lastname | username | password |
      | Lam       | null     | lamtran  | lam      |

  Scenario Outline: Register unsuccessfully with account already exit
    When I click register button
    When I input information are first name as <firstname>, last name as <lastname>, user name as <username>, password as <password>
    And  I click submit register
    Then I verify account already exit

    Examples:
      | firstname | lastname | username | password |
      | Lam       | tran     | lamtran  | lam      |


