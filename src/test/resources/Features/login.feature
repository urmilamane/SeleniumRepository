Feature: Login page Automation of saucedemo application
Scenario Outline: Check login is successful with valid creds
Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on Login button
Then User is navigated to home page
And Close the browser

Examples:
| username | password |
| standard_user | secret_sauce |
| problem_user |  secret_sauce |
| performance_glitch_user | secret_sauce |