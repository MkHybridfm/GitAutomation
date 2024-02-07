@CNAMobile_Web_SearchPage
Feature: Search functionality scenarios for Mobile Web IOS

  @CNA_Mobile_Web_IOS_046 @CNA_Mobile_Web_IOS_047 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS
    @Web_CNAB-1069 @Web_CNAB-1070
  Scenario Outline: Validation of Search functionality in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I Click on Search Option in Primary Links section from Home Page in IOS Mobile Web
    And I validate Search Overlay Page is displayed in IOS Mobile Web
    And I Validate if Trending Topics, Search Text box and CNA Logo is displayed in IOS Mobile Web
    Then I enter three characters in Search Text field in IOS Mobile Web
    And I validate if Search Auto suggestions are displayed in IOS Mobile Web
    Then I enter the content to search in Search Text field "<Search_text>" in IOS Mobile Web
    And I Validate if Search results are displayed in IOS Mobile Web
    And I validate if Search results are displayed with Sort Functionality and Trending Topics option in IOS Mobile Web
    Then I validate if maximum15 stories are displayed in each page in IOS Mobile Web
    And I validate if pagination functionality is available in IOS Mobile Web
    When I Click on Search Option in Primary Links section from Home Page in IOS Mobile Web
    Then I enter the content to search in Search Text field "<Search_text_random>" in IOS Mobile Web
    #And I validate if Empty search results are displayed in IOS Mobile Web

    Examples:
      | Search_text    | Search_text_random |
      | Ukraine        |  123TestJHjhjhjh   |


  @CNA_Mobile_Web_IOS_048 @CNA_Mobile_Web_IOS_049 @CNA_Mobile_Web_IOS_050  @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS
    @Web_CNAB-1071  @Web_CNAB-1072  @Web_CNAB-1073
  Scenario Outline: Validation of recent search topics section from Watch Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I click on Watch section in IOS Mobile Web
    And I validate Watch Page header in IOS Mobile Web
    When I Click on Search Option in Primary Links section from Home Page in IOS Mobile Web
    And I validate Search Overlay Page is displayed in IOS Mobile Web
    Then I enter the content to search in Search Text field "<Search_text>" in IOS Mobile Web
    And I Validate if Search results are displayed in IOS Mobile Web
    Then I validate the Filter, Sort and Category sections in search results page in IOS Mobile Web
    And I Click on Search Option in Primary Links section from Home Page in IOS Mobile Web
    Then I validate if Recent search section with topics is displayed in IOS Mobile Web
    And I Click on the clear link in Recent Searches section in IOS Mobile Web
    And I validate if the recent Search history is reset in IOS Mobile Web

    Examples:
      | Search_text |
      | SriLanka    |


