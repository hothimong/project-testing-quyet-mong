# new feature
# Tags: optional


Feature: Login Account

  Background:
    Given I open website http://localhost:8080/demo/

  Scenario Outline:  Login Account successfully
    When I input username as <username> and password as <password>
    And  I click submit
    Then Verify if a user will be able to login with a valid username and valid password
    And I log out
    Examples:
      |username | password  |
      |admin    | admin     |

  Scenario Outline:  Login Account unsuccessfully with invalid password
    When I input username as <username> and password as <password>
    And  I click submit
    Then Verify user can not login with invalid username and invalid password

    Examples:
      |username | password  |
      |admin    | admin1     |
