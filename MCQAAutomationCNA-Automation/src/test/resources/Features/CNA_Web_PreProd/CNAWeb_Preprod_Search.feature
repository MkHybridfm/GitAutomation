@CNAWeb_SearchPage
Feature: Search functionality scenarios

  @CNA_Web_PreProd_046 @CNA_Web_PreProd_047 @Sanity_Web_PreProd @CNA_Web @Regression_Web
    @Web_CNAB-1069 @Web_CNAB-1070
  Scenario Outline: Validation of Search functionality in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I Click on Search Option in Primary Links section from Home Page in PreProd
    And I validate Search Overlay Page is displayed in PreProd
    And I Validate if Trending Topics, Search Text box and CNA Logo is displayed in PreProd
   # Then I enter three characters in Search Text field in PreProd
   # And I validate if Search Auto suggestions are displayed in PreProd
    Then I enter the content to search in Search Text field "<Search_text>" in PreProd
    And I Validate if Search results are displayed in PreProd
    And I validate if Search results are displayed with Sort Functionality and Trending Topics option in PreProd
    Then I validate if maximum15 stories are displayed in each page in PreProd
    And I validate if pagination functionality is available in PreProd
    When I Click on Search Option in Primary Links section from Home Page in PreProd
    Then I enter the content to search in Search Text field "<Search_text_random>" in PreProd
    And I validate if Empty search results are displayed in PreProd

    Examples:
      | Search_text    | Search_text_random |
      | Ukraine        |  123TestJHjhjhjh   |


  @CNA_Web_PreProd_048 @CNA_Web_PreProd_049 @CNA_Web_PreProd_050  @Sanity_Web_PreProd @CNA_Web @Regression_Web
    @Web_CNAB-1071  @Web_CNAB-1072  @Web_CNAB-1073
  Scenario Outline: Validation of recent search topics section from Watch Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on Watch section in PreProd
    And I validate Watch Page header in PreProd
    When I Click on Search Option in Primary Links section from Home Page in PreProd
    And I validate Search Overlay Page is displayed in PreProd
    Then I enter the content to search in Search Text field "<Search_text>" in PreProd
    And I Validate if Search results are displayed in PreProd
    Then I validate the Filter, Sort and Category sections in search results page in PreProd
    And I Click on Search Option in Primary Links section from Home Page in PreProd
    Then I validate if Recent search section with topics is displayed in PreProd
    And I Click on the clear link in Recent Searches section in PreProd
    And I validate if the recent Search history is reset in PreProd

    Examples:
      | Search_text |
      | SriLanka    |


  @CNA_Web_PreProd_117 @Regression_Web @CNA_Web @Sanity_Web_PreProd
  Scenario: Validation of Trending topics from Search Overlay Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I Click on Search Option in Primary Links section from Home Page in PreProd
    And I validate Search Overlay Page is displayed in PreProd
    And I Validate if Trending Topics, Search Text box and CNA Logo is displayed in PreProd
    Then I click on one of the trending Topics from Sugesstion in PreProd
    Then I validate if user is navigated to Topic Listing screen in PreProd
