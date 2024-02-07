@CNALifestyleWeb_HeaderMenuScenarios
Feature: Lifestyle Header Menu Validation scenarios

  @CNA_Web_88 @Sanity_Web @Sanity_WebLifestyle @Regression_Web
  @Web_CNAB-1133
  Scenario: Lifestyle Header Menu Brand Swtich validation
    Given I launch the CNA Lifestyle web application and check HomePage
    When I click on Go to Luxury link from Header Menu
    Then I validate if Lifestyle Luxury Page header is displayed
