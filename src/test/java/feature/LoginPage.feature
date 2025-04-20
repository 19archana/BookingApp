Feature: Validation the login page
Scenario: Validate username and password

Given  Launch the url
When Enter the username "archana"
And  enter the password "arch123"
And Click login button
Then Validate the home page