Feature: Demo of thedemosite
	Scenario Outline: client will launch the demo site and enter user ID, passward and perform validation
	When Client will launch the demo site
	When Enter username "<UserNameValue>"
	When Enter password "<PasswordValue>"
	When Click on Save button
	Then Validate username "<UserNameValue>" & password "<PasswordValue>"
	Then Close the firefox window
	
Examples:
|UserNameValue|PasswordValue|
|Nagesh|password|