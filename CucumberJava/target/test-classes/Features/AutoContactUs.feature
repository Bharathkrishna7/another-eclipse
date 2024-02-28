Feature: Fill contact us field and choose file

  Scenario Outline: customer care contact us scenario
    Given open browser with url
    And click on contact us button
    And choose WebMaster from subject handling dropdown
    When Add <email>and<orderRef>
    And choose a file
    And enter a <message> and click on send button
    Then refresh the page

    Examples: 
      | email                       | orderRef | message                          |
      | bahrathkrishna534@gmail.com | order 2  | File is uploaded|
