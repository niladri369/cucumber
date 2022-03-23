Feature: Home page 
	in order to check the order details page as a registered user I want to specify the feature of order details page
	
	
Background:
Given A registered user exists
Given User is on the login page
Then User enters user name 
And User enters password
And User clicks on login button
Then User navigates to order page

Scenario: Check previous order details
When User clicks on previous order link
Then User checks the previous order details

	Scenario: Check order details
When User clicks on  order link
Then User checks the open order details

	Scenario: Check cancled order details
When User clicks on cancled order link
Then User checks the cancled order details