@CNAWeb_NewsLetterSubscriptionScenario
Feature: Newsletter Subscription Scenario

  @CNA_Mobile_Web_Android_069 @Sanity_Mobile_Web_Android1 @CNA_Mobile_Web_Android @Regression_Web
    @Web_CNAB-1092
  Scenario: Validation of Newsletter Subscription Scenario in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    Then I scroll down to Footer Section in Android Mobile Web
    And I click on Subscribe button in Android Mobile Web
    Then I validate if error message is displayed in Android Mobile Web
    And I select a newsletter Category from drop down in Android Mobile Web
    Then I provide invalid email ID in Android Mobile Web
    And I click on Subscribe button in Android Mobile Web
    And I validate if Please enter valid email address message is displayed in Android Mobile Web
    And I select a newsletter Category from drop down in Android Mobile Web
    Then I provide valid email ID in Android Mobile Web
    And I click on Subscribe button in Android Mobile Web
    Then I validate if Thank you for Subscribing success message is displayed in Android Mobile Web