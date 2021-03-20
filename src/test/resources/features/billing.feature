Feature: Calculate billing amount

Scenario Outline: billing amount
Given user is on billing page
When user enters billing amount "<BillingAmount>"
When user enters tax amount "<TaxAmount>"
And user clicks on calculate tax button
Then it gives the final amount "<FinalAmount>"


Examples:
		|BillingAmount|TaxAmount|FinalAmount|
		|1000         |10       |1010       |
		|500		  |20 	 	|520 	 	|
		|100 	 	  |5.5		|105.5		|