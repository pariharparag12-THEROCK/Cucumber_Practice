Feature: Login Functionality

Scenario: Validate Logged into the Application
Given User at login page
When User enters username
And User enters password
And User clicked on login button
Then User should be logged into the application



Scenario: Validate Title of the homepage
Given User at homepage
Then User should see the title