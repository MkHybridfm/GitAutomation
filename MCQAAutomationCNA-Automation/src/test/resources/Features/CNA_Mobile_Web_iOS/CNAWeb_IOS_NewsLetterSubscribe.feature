@CNAWeb_NewsLetterSubscriptionScenario
Feature: Newsletter Subscription Scenario

  @CNA_Mobile_Web_IOS_069 @Sanity_Mobile_Web_IOS1 @CNA_Mobile_Web_IOS @Regression_Web
    @Web_CNAB-1092
  Scenario: Validation of Newsletter Subscription Scenario in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    Then I scroll down to Footer Section in IOS Mobile Web
    And I click on Subscribe button in IOS Mobile Web
    Then I validate if error message is displayed in IOS Mobile Web
    And I select a newsletter Category from drop down in IOS Mobile Web
    Then I provide invalid email ID in IOS Mobile Web
    And I click on Subscribe button in IOS Mobile Web
    And I validate if Please enter valid email address message is displayed in IOS Mobile Web
    And I select a newsletter Category from drop down in IOS Mobile Web
    Then I provide valid email ID in IOS Mobile Web
    And I click on Subscribe button in IOS Mobile Web
    Then I validate if Thank you for Subscribing success message is displayed in IOS Mobile Web