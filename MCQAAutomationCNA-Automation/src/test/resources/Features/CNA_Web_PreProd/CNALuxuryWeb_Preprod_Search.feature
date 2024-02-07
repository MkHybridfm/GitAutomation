@CNALuxuryWeb_SearchScenarios
Feature: Luxury Search page scenarios

  @CNA_Web_PreProd_105 @CNA_Web_PreProd_106 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
    @Web_CNAB-1127 @Web_CNAB-1128
  Scenario Outline: Luxury Search Overlay Page validation in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I Click on Search Option in Primary Links section from Home Page in PreProd
    And I validate Search Overlay Page is displayed in PreProd
    Then I enter the content to search in Search Text field "<Search_text>" in PreProd
    And I Validate if Search results are displayed in PreProd
    Then I validate the Filter, Sort and Category sections in search results page in PreProd
    When I Click on Search Option in Primary Links section from Home Page in PreProd
    Then I validate if Recent search section with topics is displayed in PreProd
    And I Click on the clear link in Recent Searches section in PreProd
    And I validate if the recent Search history is reset in PreProd
    Then I enter the content to search in Search Text field "<Search_text_random>" in PreProd
    And I validate if Empty search results are displayed in PreProd

    Examples:
      | Search_text     |Search_text_random |
      | Watches         |  123TestJHjhjhjh  |
