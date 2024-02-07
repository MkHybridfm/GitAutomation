@CNAWeb_ListenPageScenarios_MobileWeb_Android
Feature: Listen Page scenarios in Android Mobile Web

  @CNA_Mobile_Web_Android_64 @CNA_Mobile_Web_Android_65 @Sanity_Mobile_Web_Android @Regression_Web @CNA_Mobile_Web_Android
    @Web_CNAB-1087 @Web_CNAB-1088
  Scenario: Validate Listen Landing Page and View Full Schedule Option in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    When I Click on Listen Menu Link in Android Mobile Web
    And I validate Listen Landing Page Header in Android Mobile Web
    Then I Validate OnAir section, View full Schedule Link, Editors Picks, CNA Program, On Demand and View more CTA sections in Android Mobile Web
    And I click on View Full schedule link from Listen Page in Android Mobile Web
    Then I validate if weekday schedule List is displayed in Android Mobile Web

  @CNA_Mobile_Web_Android_66 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1089
  Scenario: Validate Listen Podcast Page Play Control sections in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    When I Click on Listen Menu Link in Android Mobile Web
    And I validate Listen Landing Page Header in Android Mobile Web
    Then I click on a Podcast Link from Listen Page in Android Mobile Web
    And I validate if Podcast Page Header is displayed in Android Mobile Web
    Then I click on Play Podcast button in Android Mobile Web
    And I validate if Play control area is displayed in Android Mobile Web
    Then I click on Pause button in Android Mobile Web
    And I validate if Play button is displayed in Android Mobile Web

  @CNA_Mobile_Web_Android_67 @Sanity_Mobile_Web_Android_1
  @Web_CNAB-1090
  Scenario: Validate All Podcast page Filter/Pagination/showing count features in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    When I Click on Listen Menu Link in Android Mobile Web
    And I validate Listen Landing Page Header in Android Mobile Web
    Then I click on View all link from More Podcasts Section in Android Mobile Web
    And I validate if All Podcasts Page is displayed in Android Mobile Web
    Then I validate if Search Text box is displayed in Android Mobile Web
    And I validate if Sorting filter is displayed in Android Mobile Web
    Then I validate if Pagination is displayed at bottom of the page in Android Mobile Web
    And I validate if showing count is increased on moving to next Page in Android Mobile Web


