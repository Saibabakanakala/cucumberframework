Feature: login functionality
Scenario: login  with valid credentials

Given user navigate to login page
When user enters the following details                  
            |sainaidukanakala@gmail.com|   |Sainaidu@888|
            |saibabakanakala777@gmail.com| |123456|
And clicks on login button
Then user should get login scucess