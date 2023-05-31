@all
Feature: user Fields Registration


Background: 
Given user navigate the Register Account page 

@Register @manidatoryfields @Regression
Scenario: register with All fields
When user enters"saibaba"Firstname field
And user enters "kanakala"Lastname field
And user enters "sainaidukanakala@gmail.com"Email field
And user enters "8883494777"Telephone field
And user enters "Sainaidu@888"password field
And  user enters "Sainaidu@888"confirm password field
Then click on continue button

