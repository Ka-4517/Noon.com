Feature: Demo Feature
  Scenario: user logged-in to website
    Given user is on logged page
    And username and password enter
    When click on login button
    Then user is on Home page