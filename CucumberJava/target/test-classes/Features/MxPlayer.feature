Feature: Automate Web Shows Element

  Background: crome open and close
    Given Open Chrome with mxplayer url
    Then close chrome browser

  Scenario: Goto Web Shows and get data frome it
    When move mouse to web show element
    And print sub-data from web show element

  Scenario: Goto Web Shows and click elements inside it
    When I click drama from web shows element
    And I click thriller from web shows element
    And I click reality from web shows element
    And I click crime from web shows element
    And I click comedy from web shows element
