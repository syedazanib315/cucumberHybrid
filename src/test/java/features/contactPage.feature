Feature: As a user I want add customer       
#    Scenario : Valid users should be able to login 
#	Given I am on techFios site
#	When  I enter username and password 
#	And   I click on sign in button
#	Then Dashboard page should display   
Scenario Outline: User should be able to Add Contact
	Given A user logged in
	When User goes to CRM Add Contact Page
	Then Contact Page should display
	When  User fill in the Add Contact "<fullName>" "<company>" "<email>" "<phoneNum>" "<address>" "<city>" "<state>""<zip>"
	Then Created contact will be dispalyed
Examples: 
|fullName|company|email|phoneNum|address|city|state|zip|
|Syeda Zanib|Techfios|sz@techfios.com|2013334456|33 Williams Ave|Jersey City|NJ|07307|