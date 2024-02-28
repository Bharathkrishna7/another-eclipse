Feature: Login into Automation Practice site

  Scenario Outline: Login into site with multipleData
    Given Open chromebrowser with url
    And Click on sign in button to reach loginPage
    When Enter valid <Emailaddress> and <Password>
    Then It navigates to My Account Page

    Examples: 
      | Emailaddress                | Password   |
      | bharathkrishna534@gmail.com  | 9441044154 |
      | bharathkrishna7777@gmail.com | 9441044154 |
