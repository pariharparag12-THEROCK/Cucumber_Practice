Feature: Order Information


Background:
Given User should be logged into application
When User Clicked on Order button
Then User should be redirected to order page

Scenario: validate current order details
When User clicks on currentOrder button
Then User should fetch current order information

Scenario: validate Past order details
When User clicks on PastOrder button
Then User should fetch Past order information

Scenario: validate Cancelled order details
When User clicks on CancelledOrder button
Then User should fetch Cancelled order information 