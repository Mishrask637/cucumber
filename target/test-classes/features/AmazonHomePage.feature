Feature: Amazon Home Page
In order to test amazon home page of application
As a registered user
I want to specify the features of home page

Scenario: Home Panel Top Panel Section
	Given user is on amazon's home page
	Then user gets a amazon search field
	And username is also displayed next to search field
	And Amazon logo is also displayed
	And Cart link is also displayed
	
Scenario: Amaaon Today's Deals Secation
	Given user is on amazon home page
	When user scrolls down to todays deals section
	Then user gets the list of multiple products
	And user gets product image and price details
	And user can see more products by clicking on carousel
	
Scenario: Amazon Footer Links section
	Given user is on amazon home page
	When user scrolls down to footer of the page
	Then user gets all country links
	|Australia|
	|Brazil|
	|China|	
	And user gets all amazon services links
	|Amazon Business|
	|Amazon Web Services|
	And user gets all privacy policy links
	|Privacy Notice|
	|Use & Sale|