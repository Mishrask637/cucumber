Feature: Amazon Login feature

Scenario: Amazon login page

Given User is on amazon landing page
And Sign in button is present on screen
When user clicks on sign in button
Then Login screen is displayed
When user enters "mishrask637@gmail.com" in username field
And user enters "Mishrask637" in password field
And User clicks on Login in button
Then user is on home page
And title of the home page is "Amazon"
But sign in button is not available
