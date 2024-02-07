@CNALifestyleTopicListingPageScenarios
Feature: Lifestyle Topic Listing Page scenarios

  @CNA_Mobile_Web_IOS_84 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLifestyle
  @Web_CNAB-1107
  Scenario: Lifestyle Article Listing Page validation from Landing Page in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    And I click on menu icon in IOS Mobile Web
    Then I click on a submenu from the menu in IOS Mobile Web
    Then I validate if user is navigated to Topic Listing screen in IOS Mobile Web
    And I validate Topic Name,Follow button,Title sections in IOS Mobile Web

  @CCNA_Mobile_Web_IOS_85 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLifestyle
  @Web_CNAB-1108
  Scenario: Lifestyle Article Listing Page validation from Lifestyle Menu section in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    And I click on menu icon in IOS Mobile Web
    Then I click on a submenu from the menu in IOS Mobile Web
    Then I validate if user is navigated to Topic Listing screen in IOS Mobile Web
    And I validate Topic Name,Follow button,Title sections in IOS Mobile Web