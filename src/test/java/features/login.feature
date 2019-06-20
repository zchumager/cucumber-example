Feature: Login Feature
this feature verifies the functionality of the login page

	Scenario Outline: check login functionality
		Given I open login form
		When I write a valid user name <username>
		And I write a valid user password <password>
		And I click submit button
		Then Welcome message is displayed
		
	Examples:
		| username	| password	|
   		| admin 	| 12345 	|