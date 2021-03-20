#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab Sedan
Given User wants to select a cab type "sedan" from uber app
When User selects car "sedan" and  pickup point "Mumbai" and drop location "Thane"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 USD

@Regression 
Scenario: Booking Cab SUV
Given User wants to select a cab type "SUv" from uber app
When User selects car "SUV" and  pickup point "Mulund" and drop location "Thane"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 USD

@Prod
Scenario: Booking Cab for Mini
Given User wants to select a cab type "Mini" from uber app
When User selects car "Mini" and  pickup point "Airoli" and drop location "Thane"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 USD

