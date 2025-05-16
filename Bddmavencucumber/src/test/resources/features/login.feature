Feature: Login page automation for shopperstack app

Scenario: check login is successful with valid creds

Given User is on login page
When User enters username and password
And clicks on login button
Then User is navigated to home page
And close the browser