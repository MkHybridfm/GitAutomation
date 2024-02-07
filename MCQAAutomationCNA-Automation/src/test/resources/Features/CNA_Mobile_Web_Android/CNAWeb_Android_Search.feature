@CNAMobile_Web_SearchPage
Feature: Search functionality scenarios for Mobile Web Android

  @CNA_Mobile_Web_Android_046 @CNA_Mobile_Web_Android_047 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android
    @Web_CNAB-1069 @Web_CNAB-1070
  Scenario Outline: Validation of Search functionality in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    When I Click on Search Option in Primary Links section from Home Page in Android Mobile Web
    And I validate Search Overlay Page is displayed in Android Mobile Web
    And I Validate if Trending Topics, Search Text box and CNA Logo is displayed in Android Mobile Web
    Then I enter three characters in Search Text field in Android Mobile Web
    And I validate if Search Auto suggestions are displayed in Android Mobile Web
    Then I enter the content to search in Search Text field "<Search_text>" in Android Mobile Web
    And I Validate if Search results are displayed in Android Mobile Web
    And I validate if Search results are displayed with Sort Functionality and Trending Topics option in Android Mobile Web
    Then I validate if maximum15 stories are displayed in each page in Android Mobile Web
    And I validate if pagination functionality is available in Android Mobile Web
    When I Click on Search Option in Primary Links section from Home Page in Android Mobile Web
    Then I enter the content to search in Search Text field "<Search_text_random>" in Android Mobile Web
    And I validate if Empty search results are displayed in Android Mobile Web

    Examples:
      | Search_text    | Search_text_random |
      | Ukraine        |  123TestJHjhjhjh   |


  @CNA_Mobile_Web_Android_048 @CNA_Mobile_Web_Android_049 @CNA_Mobile_Web_Android_050  @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android
    @Web_CNAB-1071  @Web_CNAB-1072  @Web_CNAB-1073
  Scenario Outline: Validation of recent search topics section from Watch Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on Watch section in Android Mobile Web
    And I validate Watch Page header in Android Mobile Web
    When I Click on Search Option in Primary Links section from Home Page in Android Mobile Web
    And I validate Search Overlay Page is displayed in Android Mobile Web
    Then I enter the content to search in Search Text field "<Search_text>" in Android Mobile Web
    And I Validate if Search results are displayed in Android Mobile Web
    Then I validate the Filter, Sort and Category sections in search results page in Android Mobile Web
    And I Click on Search Option in Primary Links section from Home Page in Android Mobile Web
    Then I validate if Recent search section with topics is displayed in Android Mobile Web
    And I Click on the clear link in Recent Searches section in Android Mobile Web
    And I validate if the recent Search history is reset in Android Mobile Web

    Examples:
      | Search_text |
      | SriLanka    |


