@CNALuxuryTopicListingPageScenarios
Feature: Luxury Topic Listing Page scenarios

  @CNA_Web_PreProd_101 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
  @Web_CNAB-1123
  Scenario: Luxury Article Listing Page validation from Landing Page in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I click on a article link from Luxury Landing Page in PreProd
    And I validate article page Title in PreProd
    Then I validate if Related Topics section is present in Article Page in PreProd
    And I click on a topic from Related topics section in PreProd
    Then I validate if user is navigated to Topic Listing screen in PreProd
    And I validate Topic Name,Follow button,Title sections in PreProd

  @CNA_Web_PreProd_102 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
    @Web_CNAB-1124
  Scenario: Luxury Article Listing Page validation from Lifestyle Menu section in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I click on People Main Menu link in PreProd
    And I validate if People Landing Page is displayed in PreProd
    When I click on a article link from Luxury Landing Page in PreProd
    And I validate article page Title in PreProd
    Then I click on the submenu from People Landing Page in PreProd
    Then I validate if user is navigated to Topic Listing screen in PreProd
    And I validate Topic Name,Follow button,Title sections in PreProd