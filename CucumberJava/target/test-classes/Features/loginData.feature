Feature: login with multiple data functionality

  Scenario Outline: Check loginPage with  multiple data
    Given opens browser
    And Enters in login page
    When Enters <userName> and <password>
    And clicked on login button
    Then Navigated to homepage

    Examples: 
      | userName                     | password   |
      | bharathkrishna534@gmail.com  | 9441044154 |
      | bharathkrishna7777@gmail.com | 9441044154 |
