@CNALuxuryWeb_HeaderMenuScenarios
Feature: Luxury Header Menu Validation scenarios

  @CNA_Web_107 @Sanity_Web @Sanity_WebLuxury @Regression_Web
  @Web_CNAB-1134
  Scenario: Luxury Header Menu Brand Switch validation
    Given I launch the CNA Luxury web application and check HomePage
    When I click on Go to Lifestyle link from Header Menu
    Then I validate if Lifestyle Page header is displayed