Feature: Browse the site pages

  @web
  Scenario Outline: User Login
    Given  the user is browsing
    When   the user enters the "<username>" and "<password>"
    And    Clicks the login button

    Examples:
      |username |password          |
      |tutorial |tutorial          |