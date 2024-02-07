@CNAWeb_NewsLetterSubscriptionScenario
Feature: Newsletter Subscription Scenario

  @CNA_Web_PreProd_069 @Sanity_Web_PreProd @CNA_Web @Regression_Web
    @Web_CNAB-1092
  Scenario: Validation of Newsletter Subscription Scenario in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    Then I scroll down to Footer Section in PreProd
    And I click on Subscribe button in PreProd
    Then I validate if error message is displayed in PreProd
    And I select a newsletter Category from drop down in PreProd
    Then I provide invalid email ID in PreProd
    And I click on Subscribe button in PreProd
    And I validate if Please enter valid email address message is displayed in PreProd
    And I select a newsletter Category from drop down in PreProd
    Then I provide valid email ID in PreProd
    And I click on Subscribe button in PreProd
    Then I validate if Thank you for Subscribing success message is displayed in PreProd