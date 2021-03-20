Feature: Amazon order page

Background: 
Given a registered user exists
Given user is on Amazon login page
When User enters username
And User enters passowrd
And User clicks on login button
Then user navigates to order page



Scenario: Check previous order details
When User clicks on orders link
Then user checks the previous order details


Scenario: Check Open order details
When User clicks on open order link
Then user checks the Open order details



Scenario: Check Canceled order details
When user clicks on cancelled orders link
Then user checks the Cancelled order details
