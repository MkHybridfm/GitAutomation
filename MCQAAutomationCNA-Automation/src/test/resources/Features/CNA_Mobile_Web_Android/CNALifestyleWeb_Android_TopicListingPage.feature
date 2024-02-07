@CNALifestyleTopicListingPageScenarios
Feature: Lifestyle Topic Listing Page scenarios

  @CNA_Mobile_Web_Android_84 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLifestyle
  @Web_CNAB-1107
  Scenario: Lifestyle Article Listing Page validation from Landing Page in Android Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in Android Mobile Web
    When I click on a article link from top stories in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    Then I validate if Related Topics section is present in Article Page in Android Mobile Web
    And I click on a topic from Related topics section in Android Mobile Web
    Then I validate if user is navigated to Topic Listing screen in Android Mobile Web
    And I validate Topic Name,Follow button,Title sections in Android Mobile Web

  @CCNA_Mobile_Web_Android_85 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLifestyle
  @Web_CNAB-1108
  Scenario: Lifestyle Article Listing Page validation from Lifestyle Menu section in Android Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in Android Mobile Web
    When I click on Living Main Menu link in Android Mobile Web
    And I validate if Living Landing Page is displayed in Android Mobile Web
    Then I click on the related Topics sub menu from Living Landing Page in Android Mobile Web
    Then I validate if user is navigated to Topic Listing screen in Android Mobile Web
    And I validate Topic Name,Follow button,Title sections in Android Mobile Web