Feature: User Authentication

  Scenario Outline: Verify user can login and logout successfully

    Given user is on the Demo Web Shop login page

    When user logs in with "<email>" and "<password>"

    Then user should be logged in successfully

    When user logs out

    Then user should be logged out successfully

    Examples:
      | email              	| password           |
      | Demon123@gmail.com  | Demon123@gmail.com |