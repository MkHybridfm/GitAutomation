@CNALifestyleTopicListingPageScenarios
Feature: Lifestyle Topic Listing Page scenarios

  @CNA_Web_84 @Sanity_Web @Sanity_WebLifestyle @Regression_Web
  @Web_CNAB-1107
  Scenario: Lifestyle Article Listing Page validation from Landing Page
    Given I launch the CNA Lifestyle web application and check HomePage
    When I click on a article link from top stories
    And I validate article page Title
    Then I validate if Related Topics section is present in Article Page
    And I click on a topic from Related topics section
    Then I validate if user is navigated to Topic Listing screen
    And I validate Topic Name,Follow button,Title sections

  @CNA_Web_85 @Sanity_Web @Sanity_WebLifestyle @Regression_Web
  @Web_CNAB-1108
  Scenario: Lifestyle Article Listing Page validation from Lifestyle Menu section
    Given I launch the CNA Lifestyle web application and check HomePage
    When I click on Living Main Menu link
    And I validate if Living Landing Page is displayed
    Then I click on the related Topics sub menu from Living Landing Page
    Then I validate if user is navigated to Topic Listing screen
    And I validate Topic Name,Follow button,Title sections