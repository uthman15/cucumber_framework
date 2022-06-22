@Google
  #Each feature file must have a Feature name
  #To declare all scenarios in the feature file with a tag, we can put a tag on the top of Feature
Feature: Google Search Functionality

  @Regression
  Scenario: Validate Google search
    Given user navigates to "https://www.google.com/"
    When user searches for "Tesla" on Google
    Then user should see "Tesla" in the url
    And user should see "Tesla" in the title

    @Smoke
  Scenario: Validate Google search results
    Given user navigates to "https://www.google.com/"
    When user searches for "Apple" on Google
    Then user should see results are more than 0


