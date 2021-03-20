Feature: Login Feature
Scenario Outline: Login fail - possible combinations
Given user is on application landing page
When user clicks on signin button
Then user is displayed login screen
When user enters "<UserName>" in username field
And user enters "<Password>" in passord field
And user clicks on signin button
Then user gets login failed error

Examples:
	|UserName|Password|
	|Wrong|123456|
	|Suraj|IncorretPassword|
	|Incorrect|IncorretPassword|
	