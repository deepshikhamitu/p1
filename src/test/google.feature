Feature: Search text on google
Scenario Outline: Search any text on google
Given user is on google search Page
When user entered <Keydata>
And click on serachButton
Then verify output result

Examples:
|Keydata|
|selenium|
 
