# Feature Name
# Author
# Date Created 
@Nik @sam
Feature: Login,Create Customer,Modify customer,Delete customer and Logout functionality
Description this features validates Login,Create customer,Modify customer,Delete customer and Logout functionalities

Scenario Outline: Verify the Login functionality
Given I launch the chrome Browser
And I navigate the application url
When I enter "<username>" in username text field
When I enter "<password>" in password text field
And I click on Login button
Then I find the home page1
And I minimize the flyout window
Examples:
|username|password|
|admin|manager|


Scenario Outline: Verify the Create Customer functionality

When I click on Tasks
And I click on Add New
And I click on New Customer
And I enter "<Cname>" in Customer name text field
And I click on Create customer

Examples:
|Cname|
|Acer|

Scenario: Verify the Modify Customer functionality
When I click on Customer Created bar
And I click on Active
And I click on Archieved


Scenario: Verify the Delete Customer functionality


When I click On Actions
And I click on delete
And I click on delete permanently


Scenario: Verify the Logout functionality
Given I find the home page4
When I click on Logout link
Then I find the login page
And I close the application
