Feature: Add data to registration field

  Scenario Outline: Registration page scenario
    Given browser with url
    When Add full name <Firstname> and <Lastname> in register
    And Fill <address> in address field
    And Add <emailaddress> in register
    And add <phone> inthe register
    And choose gender
    And choose hobbies
    And select multi-languages in the dropdown
    And select skill from the skills
    And choose a country from dropdown
    And choose date of birth from dropdown
    And add <password> to the field
    And add <confirmpassword> to the field
    Then click on the refersh button

    Examples: 
      | Firstname | Lastname | address             | emailaddress      | phone | password | confirmpassword |
      | bharath   | Krishan  | Pakala,peddagorpadu | krishna@gmail.com |  9866 |     9441 |            9441 |
