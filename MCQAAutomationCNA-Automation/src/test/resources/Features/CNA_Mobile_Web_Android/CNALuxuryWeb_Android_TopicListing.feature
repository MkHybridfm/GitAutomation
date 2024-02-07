@CNALuxuryTopicListingPageScenarios
Feature: Luxury Topic Listing Page scenarios

  @CNA_Mobile_Web_Android_101 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLuxury @Regression_Web
  @Web_CNAB-1123
  Scenario: Luxury Article Listing Page validation from Landing Page in Android Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in Android Mobile Web
    When I click on a article link from Luxury Landing Page in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    Then I validate if Related Topics section is present in Article Page in Android Mobile Web
    And I click on a topic from Related topics section in Android Mobile Web
    Then I validate if user is navigated to Topic Listing screen in Android Mobile Web
    And I validate Topic Name,Follow button,Title sections in Android Mobile Web

  @CNA_Mobile_Web_Android_102 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLuxury @Regression_Web
    @Web_CNAB-1124
  Scenario: Luxury Article Listing Page validation from Lifestyle Menu section in Android Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in Android Mobile Web
    When I click on People Main Menu link in Android Mobile Web
    And I validate if People Landing Page is displayed in Android Mobile Web
    Then I click on the submenu from People Landing Page in Android Mobile Web
    Then I validate if user is navigated to Topic Listing screen in Android Mobile Web
    And I validate Topic Name,Follow button,Title sections in Android Mobile Web