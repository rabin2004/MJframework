#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login functionality through sign-on page

  @tag2
  Scenario Outline: Positive login functionality test with multiple valid credentials
    Given user is in sign-on page
    When user provides valid "<username>" and valid "<password>"
    Then user should be able to login

    Examples: 
      | username  | password |
      | test123 | 123 |
      | test | 123 |
