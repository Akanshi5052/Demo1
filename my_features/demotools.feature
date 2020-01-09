Feature: TestMeApp validations

Scenario: Login
Given application is up and running and is launched
Then User clicks on SignIn link
And User provides valid creds
Then user clicks on submit button
