@CNALuxuryWeb_HeaderMenuScenarios
Feature: Luxury Header Menu Validation scenarios

  @CNA_Web_PreProd_107 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
  @Web_CNAB-1134
  Scenario: Luxury Header Menu Brand Switch validation in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I click on Go to Lifestyle link from Header Menu in PreProd
    Then I validate if Lifestyle Page header is displayed in PreProd