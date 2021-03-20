Feature: User Registration

Scenario: User registration with different data
Given User is on registration page
When User enters following user details
	|Suraj|Mishra|mishrask@gmail.com|9769226186|Thane|
	|Niraj|Mishra|Nirajk@gmail.com|9820086949|Thane|
	|Mummy|Mishra|Mummyk@gmail.com|7718086949|Thane|
Then User registration should be successful





Scenario: User registration with different data with columns
Given User is on registration page
When User enters following user details with columns
	|First|Last|Email|Mobile|Location|
	|Suraj|Mishra|mishrask@gmail.com|9769226186|Thane|
	|Niraj|Mishra|Nirajk@gmail.com|9820086949|Thane|
	|Mummy|Mishra|Mummyk@gmail.com|7718086949|Thane|
Then User registration should be successful