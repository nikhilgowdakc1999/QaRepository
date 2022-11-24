# Feature Name
# Author
# Date Created 
@Nik @sam
Feature: Login,Create user,Modify user,Delete user and Logout functionality
Description this features validates Login,Create user,Modify user,Delete user and Logout functionalities

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

Scenario Outline: Verify the Create User functionality
Given I find the home page2
When I click on users
And I click on Add user
And I enter "<Fname>" in FirstName text field
And I enter "<Mname>" in MiddleName text field
And I enter "<Lname>" in LastName text field
And I enter "<mail>" in email text field
And I enter "<Uname>" in Username text field
And I enter "<pwd>" in Password text field
And I enter "<rpwd>" in Re-Password text field
And I click on create user
Examples:
|Fname|Mname|Lname|mail|Uname|pwd|rpwd|
|UserDemo|M|1|UserDemo@gmail.com|User95|Demo1|Demo1|

Scenario Outline:Verify the Modify User functionality
When I click on user created
And I enter "<Fname>" in Firstname text field
And I click on save changes  
Examples:
|Fname|
|Samarth|

Scenario: Verify the Delete User functionality
Given I find the home page3
When I click on Created user
And I click on delete user


Scenario: Verify the Logout functionality
Given I find the home page4
When I click on Logout link
Then I find the login page
And I close the application
