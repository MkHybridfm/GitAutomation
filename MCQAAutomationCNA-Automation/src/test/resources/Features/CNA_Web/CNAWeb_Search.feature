@CNAWeb_SearchPage
Feature: Search functionality scenarios

  @CNA_Web_046 @CNA_Web_047 @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1069 @Web_CNAB-1070
  Scenario Outline: Validation of Search functionality
    Given I launch the CNA web application and check HomePage
    When I Click on Search Option in Primary Links section from Home Page
    And I validate Search Overlay Page is displayed
    And I Validate if Trending Topics, Search Text box and CNA Logo is displayed
    Then I enter three characters in Search Text field
    And I validate if Search Auto suggestions are displayed
    Then I enter the content to search in Search Text field "<Search_text>"
    And I Validate if Search results are displayed
    And I validate if Search results are displayed with Sort Functionality and Trending Topics option
    Then I validate if maximum15 stories are displayed in each page
    And I validate if pagination functionality is available
    When I Click on Search Option in Primary Links section from Home Page
    Then I enter the content to search in Search Text field "<Search_text_random>"
    And I validate if Empty search results are displayed

    Examples:
      | Search_text    | Search_text_random |
      | Ukraine        |  123TestJHjhjhjh   |


  @CNA_Web_048 @CNA_Web_049 @CNA_Web_050  @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1071  @Web_CNAB-1072  @Web_CNAB-1073
  Scenario Outline: Validation of recent search topics section from Watch Page
    Given I launch the CNA web application and check HomePage
    And I click on Watch section
    And I validate Watch Page header
    When I Click on Search Option in Primary Links section from Home Page
    And I validate Search Overlay Page is displayed
    Then I enter the content to search in Search Text field "<Search_text>"
    And I Validate if Search results are displayed
    Then I validate the Filter, Sort and Category sections in search results page
    And I Click on Search Option in Primary Links section from Home Page
    Then I validate if Recent search section with topics is displayed
    And I Click on the clear link in Recent Searches section
    And I validate if the recent Search history is reset

    Examples:
      | Search_text |
      | SriLanka    |


  @CNA_Web_117 @Regression_Web @CNA_Web
  Scenario: Validation of Trending topics from Search Overlay Page
    Given I launch the CNA web application and check HomePage
    When I Click on Search Option in Primary Links section from Home Page
    And I validate Search Overlay Page is displayed
    And I Validate if Trending Topics, Search Text box and CNA Logo is displayed
    Then I click on one of the trending Topics from Sugesstion
    Then I validate if user is navigated to Topic Listing screen
