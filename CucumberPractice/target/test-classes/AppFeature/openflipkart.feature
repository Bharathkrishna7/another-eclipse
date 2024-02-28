Feature: flipkart search

  Scenario: Search a product in flipkart
    Given i open chrome browser
    When i enter "mobiles" in search field and hit enter
    Then validate mobiles on the header bar
