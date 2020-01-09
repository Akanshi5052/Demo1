Feature: my demo on tags 

@smoke @regression
Scenario: Registration in amazon
Given I launch app
Then I register with valid data

@smoke
Scenario: Login in amazon
Given application is working
And I provide valid data

@regression
Scenario: ordering in amazon
Given I am placing the order for my selected Item

@uat @smoke
Scenario: cancellation in amazon
Given I cancel the order as it not meets my expectations