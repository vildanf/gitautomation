Feature: Portal login

Background:
Given validate the browser
When Browser is rtiggerd
Then check if browser is started
@PortalTest
Scenario: Hoem page default login
Given User is on NetBanking landing page
When User login int application with "jin" and password "1234"
Then Home page is populate
And Cards displayed are "true"

@PortalTest
Scenario: Hoem page default login
Given User is on NetBanking landing page
When User login int application with "john" and password "4321"
Then Home page is populate
And Cards displayed are "false"

@PortalTest
Scenario: Hoem page default login
Given User is on NetBanking landing page
When User sign up with following details
| jenny | abcd | john@abcd.com | Australia | 3234343 |
Then Home page is populate
And Cards displayed are "false"
@PortalTest
Scenario Outline: Hoem page default login
Given User is on NetBanking landing page
When User login in to application with <Username> and password <password>
Then Home page is populate
And Cards displayed are "true"

Examples:
|Username |password |
|user1 |pass1		|
|user2 |pass2 		|
|user3 |pass3 		|
|user4 |pass4 		|
