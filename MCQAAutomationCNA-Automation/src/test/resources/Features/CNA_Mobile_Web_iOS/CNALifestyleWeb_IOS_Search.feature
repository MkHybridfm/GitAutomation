@CNALifestyleWeb_SearchScenarios_MobileWeb_IOS
Feature: Lifestyle Search page scenarios_Mobile Web IOS

  @CNA_Mobile_Web_IOS_86 @CNA_Mobile_Web_IOS_87 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLifestyle
    @Web_CNAB-1119 @Web_CNAB-1110
  Scenario Outline: Lifestyle Search Overlay Page validation in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    When I Click on Search Option in Primary Links section from Home Page in IOS Mobile Web
    And I validate Search Overlay Page is displayed in IOS Mobile Web
    Then I enter the content to search in Search Text field "<Search_text>" in IOS Mobile Web
    And I Validate if Search results are displayed in IOS Mobile Web
    Then I validate the Filter, Sort and Category sections in search results page in IOS Mobile Web
    When I Click on Search Option in Primary Links section from Home Page in IOS Mobile Web
    Then I validate if Recent search section with topics is displayed in IOS Mobile Web
    And I Click on the clear link in Recent Searches section in IOS Mobile Web
    And I validate if the recent Search history is reset in IOS Mobile Web
    Then I enter the content to search in Search Text field "<Search_text_random>" in IOS Mobile Web
   # And I validate if Empty search results are displayed in IOS Mobile Web

    Examples:
      | Search_text     |Search_text_random |
      | Ukraine         |  123TestJHjhjhjh  |


