Feature: TestMeApp Validations

  Background: Launching of TestMeApp
    Given User launches the TestMeApp

  Scenario Outline: User Login in TestMeApp for three people
   
    Given User clicks on SignIn button
    And  User provides the valid Username "<uname>"
    Then User provides valid password "<password>"
    When User clicks in login button at the end of the form
    And User clicks on AllCategories
    Then User clicks on Electronics
    Then User clicks on Headphone
    Then User clicks on cart
    Then User clicks on remove

    Examples: 
      | uname |  | password |
      | Lalitha   |  |      password123 |
      | def   |  |      456 |
      | efh   |  |      789 |
