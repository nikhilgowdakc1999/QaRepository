# Feature Name
# Author
# Date Created 
@Nik @sam
Feature: Login,Create Customer,Create Project,Create Task,Delete task,Delete project,Delete customer and Logout functionality
Description this features validates Login,Create customer,Create Project,Create Task,Delete task,Delete project,Delete customer and Logout functionalities

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

Scenario Outline: Verify the Create Project functionality
When I click on Add New 
And I click on New project
And I enter "<Pname>" in Project name text field
And I click on Create Project

Examples:
|Pname|
|Acer Projects|

Scenario Outline: Verify the Create Task fuctionality
When I click on Add new Task
And I click on Create new Tasks
And I enter "<Tname>" in task name text field
And I click on create tasks
Examples:
|Tname|
|NewTask|

Scenario: Verify the delete Task functionality
When I click on Created task box
And I click on task delete 
And I click on task delete permanently 

Scenario: Verify the Delete Project functionality
When I click on Created project bar
When I click on Project Actions
And I click on Project delete
And I click on project delete permanently



Scenario: Verify the Delete Customer functionality

When I click on Created Customer Bar
When I click On Actions
And I click on delete
And I click on delete permanently


Scenario: Verify the Logout functionality
Given I find the home page4
When I click on Logout link
Then I find the login page
And I close the application