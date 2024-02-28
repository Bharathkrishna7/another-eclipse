Feature: feature to test google dearch functionality

Scenario: Validate google search is working

Given Browser is open
And User is on google search page
When User enter  text in search field
And  hits enter
Then user is navigated to search results
