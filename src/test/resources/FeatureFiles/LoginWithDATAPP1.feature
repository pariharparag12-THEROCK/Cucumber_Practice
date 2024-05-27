Feature: Login Functionality

Scenario: Validate User able to login with valid credentials
Given user must be on login page
When user enters a username as "test@gmail.com"
And user enters a password as "8282PP1"
And user clicks on submit button
Then user should be logged in successfully