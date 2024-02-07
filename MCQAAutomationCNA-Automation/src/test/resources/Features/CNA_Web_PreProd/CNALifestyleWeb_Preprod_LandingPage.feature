@CNALifestyleWeb_LandingPageScenarios
Feature: Lifestyle Landing Page scenarios

  @CNA_Web_PreProd_77 @CNA_Web_PreProd_78 @Sanity_Web_PreProd @Sanity_Web_PreProdLifestyle @Regression_Web
  @Web_CNAB-1100 @Web_CNAB-1101
  Scenario: Lifestyle Landing Page validation in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    And I validate if all the landing Page components are present in PreProd
    When I click on Entertainment Main Menu link in PreProd
    And I validate if Entertainment Landing Page is displayed in PreProd
    Then I validate if SignIN option and Search option is available in PreProd
    When I click on Living Main Menu link in PreProd
    And I validate if Living Landing Page is displayed in PreProd
    Then I validate if SignIN option and Search option is available in PreProd
    When I click on Travel Main Menu link in PreProd
    And I validate if Travel Landing Page is displayed in PreProd
    Then I validate if SignIN option and Search option is available in PreProd
