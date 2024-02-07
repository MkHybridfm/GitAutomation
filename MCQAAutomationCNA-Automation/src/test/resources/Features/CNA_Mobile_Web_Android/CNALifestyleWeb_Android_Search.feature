@CNALifestyleWeb_SearchScenarios
Feature: Lifestyle Search page scenarios

  @CNA_Mobile_Web_Android_86 @CNA_Mobile_Web_Android_87 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLifestyle
    @Web_CNAB-1119 @Web_CNAB-1110
  Scenario Outline: Lifestyle Search Overlay Page validation in Android Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in Android Mobile Web
    When I Click on Search Option in Primary Links section from Home Page in Android Mobile Web
    And I validate Search Overlay Page is displayed in Android Mobile Web
    Then I enter the content to search in Search Text field "<Search_text>" in Android Mobile Web
    And I Validate if Search results are displayed in Android Mobile Web
    Then I validate the Filter, Sort and Category sections in search results page in Android Mobile Web
    When I Click on Search Option in Primary Links section from Home Page in Android Mobile Web
    Then I validate if Recent search section with topics is displayed in Android Mobile Web
    And I Click on the clear link in Recent Searches section in Android Mobile Web
    And I validate if the recent Search history is reset in Android Mobile Web
    Then I enter the content to search in Search Text field "<Search_text_random>" in Android Mobile Web
    And I validate if Empty search results are displayed in Android Mobile Web

    Examples:
      | Search_text     |Search_text_random |
      | Ukraine         |  123TestJHjhjhjh  |


