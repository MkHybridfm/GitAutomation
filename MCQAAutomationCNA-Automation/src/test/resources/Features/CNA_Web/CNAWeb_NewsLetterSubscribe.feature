@CNAWeb_NewsLetterSubscriptionScenario
Feature: Newsletter Subscription Scenario

  @CNA_Web_069 @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1092
  Scenario: Validation of Newsletter Subscription Scenario
    Given I launch the CNA web application and check HomePage
    Then I scroll down to Footer Section
    And I click on Subscribe button
    Then I validate if error message is displayed
    And I select a newsletter Category from drop down
    Then I provide invalid email ID
    And I click on Subscribe button
    And I validate if Please enter valid email address message is displayed
    And I select a newsletter Category from drop down
    Then I provide valid email ID
    And I click on Subscribe button
    Then I validate if Thank you for Subscribing success message is displayed