@CNALuxuryTopicListingPageScenarios
Feature: Luxury Topic Listing Page scenarios

  @CNA_Web_101 @Sanity_Web @Sanity_WebLuxury @Regression_Web
  @Web_CNAB-1123
  Scenario: Luxury Article Listing Page validation from Landing Page
    Given I launch the CNA Luxury web application and check HomePage
    When I click on a article link from Luxury Landing Page
    And I validate article page Title
    Then I validate if Related Topics section is present in Article Page
    And I click on a topic from Related topics section
    Then I validate if user is navigated to Topic Listing screen
    And I validate Topic Name,Follow button,Title sections

  @CNA_Web_102 @Sanity_Web @Sanity_WebLuxury @Regression_Web
    @Web_CNAB-1124
  Scenario: Luxury Article Listing Page validation from Lifestyle Menu section
    Given I launch the CNA Luxury web application and check HomePage
    When I click on People Main Menu link
    And I validate if People Landing Page is displayed
    Then I click on the submenu from People Landing Page
    Then I validate if user is navigated to Topic Listing screen
    And I validate Topic Name,Follow button,Title sections