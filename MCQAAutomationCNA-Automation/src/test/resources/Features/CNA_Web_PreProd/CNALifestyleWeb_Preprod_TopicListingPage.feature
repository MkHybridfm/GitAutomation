@CNALifestyleTopicListingPageScenarios
Feature: Lifestyle Topic Listing Page scenarios

  @CNA_Web_PreProd_84 @Sanity_Web_PreProd @Sanity_Web_PreProdLifestyle @Regression_Web
  @Web_CNAB-1107
  Scenario: Lifestyle Article Listing Page validation from Landing Page in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    When I click on a article link from top stories in PreProd
    And I validate article page Title in PreProd
    Then I validate if Related Topics section is present in Article Page in PreProd
    And I click on a topic from Related topics section in PreProd
    Then I validate if user is navigated to Topic Listing screen in PreProd
    And I validate Topic Name,Follow button,Title sections in PreProd

  @CNA_Web_PreProd_85 @Sanity_Web_PreProd @Sanity_Web_PreProdLifestyle @Regression_Web
  @Web_CNAB-1108
  Scenario: Lifestyle Article Listing Page validation from Lifestyle Menu section in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    When I click on Living Main Menu link in PreProd
    And I validate if Living Landing Page is displayed in PreProd
    Then I click on the related Topics sub menu from Living Landing Page in PreProd
    Then I validate if user is navigated to Topic Listing screen in PreProd
    And I validate Topic Name,Follow button,Title sections in PreProd