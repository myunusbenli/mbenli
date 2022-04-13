# new feature
# Tags: optional

Feature: Library app login feature
    User story: As a user, I should be able to login with correct credentials to different accounts.
    and dashboard should be displayed.
    Accounts are: librarian, student, admin

    #this is how we comment in feature file


    Scenario: Log in as librarian
        Given user is on the login page
        When  user enters librarian username
        And user enters librarian password
        Then user should see the dashboard

    Scenario: Log in as student
        Given user is on the login page
        When  user enters student username
        And user enters student password
        Then user should see the dashboard

    Scenario: Log in as admin
        Given user is on the login page
        When  user enters admin username
        And user enters admin password
        Then user should see the dashboard