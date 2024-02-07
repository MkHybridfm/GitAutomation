@CNAWeb_ListenPageScenarios_MobileWeb_IOS
Feature: Listen Page scenarios in IOS Mobile Web

  @CNA_Mobile_Web_IOS_64 @CNA_Mobile_Web_IOS_65 @Sanity_Mobile_Web_IOS @Regression_Web @CNA_Mobile_Web_IOS
    @Web_CNAB-1087 @Web_CNAB-1088
  Scenario: Validate Listen Landing Page and View Full Schedule Option in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I Click on Listen Menu Link in IOS Mobile Web
    And I validate Listen Landing Page Header in IOS Mobile Web
    Then I Validate OnAir section, View full Schedule Link, Editors Picks, CNA Program, On Demand and View more CTA sections in IOS Mobile Web
    And I click on View Full schedule link from Listen Page in IOS Mobile Web
    Then I validate if weekday schedule List is displayed in IOS Mobile Web

  @CNA_Mobile_Web_IOS_66 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1089
  Scenario: Validate Listen Podcast Page Play Control sections in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I Click on Listen Menu Link in IOS Mobile Web
    And I validate Listen Landing Page Header in IOS Mobile Web
    Then I click on a Podcast Link from Listen Page in IOS Mobile Web
    And I validate if Podcast Page Header is displayed in IOS Mobile Web
    Then I click on Play Podcast button in IOS Mobile Web
    And I validate if Play control area is displayed in IOS Mobile Web
    Then I click on Pause button in IOS Mobile Web
    And I validate if Play button is displayed in IOS Mobile Web

  @CNA_Mobile_Web_IOS_67 @Sanity_Mobile_Web_IOS_1
  @Web_CNAB-1090
  Scenario: Validate All Podcast page Filter/Pagination/showing count features in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I Click on Listen Menu Link in IOS Mobile Web
    And I validate Listen Landing Page Header in IOS Mobile Web
    Then I click on View all link from More Podcasts Section in IOS Mobile Web
    And I validate if All Podcasts Page is displayed in IOS Mobile Web
    Then I validate if Search Text box is displayed in IOS Mobile Web
    And I validate if Sorting filter is displayed in IOS Mobile Web
    Then I validate if Pagination is displayed at bottom of the page in IOS Mobile Web
    And I validate if showing count is increased on moving to next Page in IOS Mobile Web


