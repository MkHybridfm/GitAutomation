@CNALuxuryTopicListingPageScenarios
Feature: Luxury Topic Listing Page scenarios

  @CNA_Mobile_Web_IOS_101 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLuxury @Regression_Web
  @Web_CNAB-1123
  Scenario: Luxury Article Listing Page validation from Landing Page in IOS Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in IOS Mobile Web
    And I click on menu icon in Luxury application in IOS Mobile Web
    Then I click on a submenu from the menu in Luxury application in IOS Mobile Web
    Then I validate if user is navigated to Topic Listing screen in IOS Mobile Web
    And I validate Topic Name,Follow button,Title sections in IOS Mobile Web

  @CNA_Mobile_Web_IOS_102 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLuxury @Regression_Web
    @Web_CNAB-1124
  Scenario: Luxury Article Listing Page validation from Lifestyle Menu section in IOS Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in IOS Mobile Web
    And I click on menu icon in Luxury application in IOS Mobile Web
    Then I click on a submenu from the menu in Luxury application in IOS Mobile Web
    Then I validate if user is navigated to Topic Listing screen in IOS Mobile Web
    And I validate Topic Name,Follow button,Title sections in IOS Mobile Web