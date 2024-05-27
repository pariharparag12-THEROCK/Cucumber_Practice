Feature: SignUp Functionality

Scenario Outline: Validate User Signed-Up to application
Given user should be on login page
When user enters the "<name>" in the form
And user enters age as <age>
And user confirms the "<gender>" button
Then user accounts should get created

Examples:

| name | | age | | gender |
|Parag| |29| |Male|
|Dhananjay| |27| |Male|
|Shivani| |29| |Female|
|Mamta| |27| |Female|