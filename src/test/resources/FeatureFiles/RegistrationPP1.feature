Feature: Open Bank Account

Scenario: Validate Bank Account Should be Opened
Given User should be on Acccount page
When User enters the following data
| Erin | Smith | erin.smith@gmail.com | 8907654325 |
| Robert | Jackson | robert.jackson1112@gmail.com | 94385798435 |
And User clicks on submit button
Then Bank Account should get opened by user
