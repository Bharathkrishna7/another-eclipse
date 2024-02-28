Feature: feature to demo tags

@smoke
Scenario: Demo1
Given enetr into chromebrowser
When  Open amazon application
And   search for mobile
Then  close the browser

@regression
Scenario: Demo2
Given enetr into firefoxbrowser
When  Open flipkart application
And   search for laptop
Then close browser 