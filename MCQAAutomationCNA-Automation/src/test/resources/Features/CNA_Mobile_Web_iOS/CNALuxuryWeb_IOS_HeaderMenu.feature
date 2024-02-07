@CNALuxuryWeb_HeaderMenuScenarios
Feature: Luxury Header Menu Validation scenarios

  @CNA_Mobile_Web_IOS_107 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLuxury @Regression_Web
  @Web_CNAB-1134
  Scenario: Luxury Header Menu Brand Switch validation in IOS Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in IOS Mobile Web
    When I click on Go to Lifestyle link from Header Menu in IOS Mobile Web
    Then I validate if Lifestyle Page header is displayed in IOS Mobile Web