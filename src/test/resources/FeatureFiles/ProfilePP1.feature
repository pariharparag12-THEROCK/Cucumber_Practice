@Profile
Feature: Profile Functionality

@Sanity
Scenario: validation of Add Profile
Given User should be on home page
When User clicks on Add button
And User enters the profile details
Then Profile should get Added

@Regression
Scenario: validation of Edit Profile
Given User should be on home page
When User clicks on Edit button
And User update the profile details
Then Profile should get Updated


@Functional @Sanity  @Regression 
Scenario: validation of Delete Profile
Given User should be on home page
When User clicks on Delete button
And User delete the profile details
Then Profile should get Deleted