@CNALifestyleWeb_HeaderMenuScenarios
Feature: Lifestyle Header Menu Validation scenarios

  @CNA_Mobile_Web_IOS_88 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLifestyle @Regression_Web
  @Web_CNAB-1133
  Scenario: Lifestyle Header Menu Brand Swtich validation in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    When I click on Go to Luxury link from Header Menu in IOS Mobile Web
    Then I validate if Lifestyle Luxury Page header is displayed in IOS Mobile Web
