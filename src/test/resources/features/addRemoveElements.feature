# new feature
# Tags: optional
@wip
Feature: Add/Remove Elements Test
    As a user, when I am on the Add/Remove Elements page,
    whenever I click Add Element button, Delete button should display,
    and Delete button should remove when I click the delete button

  Scenario: Delete button display functionality
    Given user is on the Add/Remove Elements Page
    Then user should click the Add Element button
    When Delete button should display whenever user click to the button

  Scenario: Delete button remove functionality
      Given user is on the Add/Remove Elements Page
      Then user should click the Add Element button
      Given user should see the delete button
      Then user should click to the delete button
      When delete should disappear after the click