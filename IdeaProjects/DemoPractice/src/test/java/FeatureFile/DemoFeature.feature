Feature: Demo Practice
  Scenario Outline: Logged in
    Given user should have to launch browser
    And I enter Username as "<username>" and Password as "<password>"
    When User click on login button
    Then user is at Home page
    And Close
    Examples:
      | standard_user | secret_sauce |