@CNALifestyleWeb_HeaderMenuScenarios
Feature: Lifestyle Header Menu Validation scenarios

  @CNA_Web_PreProd_88 @Sanity_Web_PreProd @Sanity_Web_PreProdLifestyle @Regression_Web
  @Web_CNAB-1133
  Scenario: Lifestyle Header Menu Brand Swtich validation in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    When I click on Go to Luxury link from Header Menu in PreProd
    Then I validate if Lifestyle Luxury Page header is displayed in PreProd
