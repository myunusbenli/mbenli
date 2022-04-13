# new feature
# Tags: optional

Feature: Google search functionality
    Agile story: As a user, when I am on the google
    search page, I should be able to search whatever
    I want, and see relevant information

  Scenario: Search page title verification
      Given user is on google home page
      Then user should see title is Google

  Scenario: user search title verification
      Given user is on google home page
      When User searches for "apple"
      Then user should see "apple" in the title