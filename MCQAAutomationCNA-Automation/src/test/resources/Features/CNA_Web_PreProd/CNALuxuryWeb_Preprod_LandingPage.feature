@CNALuxuryWeb_LandingPageScenarios
Feature: Luxury Landing Page scenarios

  @CNA_Web_PreProd_95 @CNA_Web_PreProd_96 @CNA_Web_PreProd_100 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
  @Web_CNAB-1128 @Web_CNAB-1122 @Web_CNAB-1117
  Scenario: Luxury Login with Valid credentials scenario in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    And I validate if all the Luxury landing Page components are present in PreProd
    When I click on People Main Menu link in PreProd
    And I validate if People Landing Page is displayed in PreProd
    Then I validate if SignIN option and Search option is available in PreProd
    When I click on Experiences Main Menu link in PreProd
    And I validate if Experiences Landing Page is displayed in PreProd
    Then I validate if SignIN option and Search option is available in PreProd
    Then I validate if infinite scroll or fetching  more news functionality is working in PreProd