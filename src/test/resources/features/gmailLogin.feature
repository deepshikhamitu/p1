#feature: List of Scenarios
Feature: User login on Gmail

  Scenario Outline: Login with Invalid credential
    Given Landing on Gmail login page
    When User enter <username> and <Password> and <status>
    Then I validate the outcomes

 

    Examples: 
      | username  | Password | status  |
      |deepshikha@gmail.com |     St1223 | fail |

