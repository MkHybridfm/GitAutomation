@CNALuxuryWeb_SearchScenarios
Feature: Luxury Search page scenarios

  @CNA_Web_105 @CNA_Web_106 @Sanity_Web @Sanity_WebLuxury @Regression_Web
    @Web_CNAB-1127 @Web_CNAB-1128
  Scenario Outline: Luxury Search Overlay Page validation
    Given I launch the CNA Luxury web application and check HomePage
    When I Click on Search Option in Primary Links section from Home Page
    And I validate Search Overlay Page is displayed
    Then I enter the content to search in Search Text field "<Search_text>"
    And I Validate if Search results are displayed
    Then I validate the Filter, Sort and Category sections in search results page
    When I Click on Search Option in Primary Links section from Home Page
    Then I validate if Recent search section with topics is displayed
    And I Click on the clear link in Recent Searches section
    And I validate if the recent Search history is reset
    Then I enter the content to search in Search Text field "<Search_text_random>"
    And I validate if Empty search results are displayed

    Examples:
      | Search_text     |Search_text_random |
      | Watches         |  123TestJHjhjhjh  |
