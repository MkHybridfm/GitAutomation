@CNAWeb_ListenPageScenarios
Feature: Listen Page scenarios

  @CNA_Web_64 @CNA_Web_65 @CNA_Web_122 @Sanity_Web @Regression_Web @CNA_Web
    @Web_CNAB-1087 @Web_CNAB-1088
  Scenario: Validate Listen Landing Page and View Full Schedule Option
    Given I launch the CNA web application and check HomePage
    When I Click on Listen Menu Link
    And I validate Listen Landing Page Header
    Then I Validate OnAir section, View full Schedule Link, Editors Picks, CNA Program, On Demand and View more CTA sections
    And I click on View Full schedule link from Listen Page
    Then I validate if weekday schedule List is displayed
    And I click on Find out more Link from Schedule List page
    Then I validate the share option and Podcast description

  @CNA_Web_66 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1089
  Scenario: Validate Listen Podcast Page Play Control sections
    Given I launch the CNA web application and check HomePage
    When I Click on Listen Menu Link
    And I validate Listen Landing Page Header
    Then I click on a Podcast Link from Listen Page
    And I validate if Podcast Page Header is displayed
    Then I click on Play Podcast button
    And I validate if Play control area is displayed
    Then I click on Pause button
    And I validate if Play button is displayed

  @CNA_Web_67 @Sanity_Web_1
  @Web_CNAB-1090
  Scenario: Validate All Podcast page Filter/Pagination/showing count features
    Given I launch the CNA web application and check HomePage
    When I Click on Listen Menu Link
    And I validate Listen Landing Page Header
    Then I click on View all link from More Podcasts Section
    And I validate if All Podcasts Page is displayed
    Then I validate if Search Text box is displayed
    And I validate if Sorting filter is displayed
    Then I validate if Pagination is displayed at bottom of the page
    And I validate if showing count is increased on moving to next Page

  @CNA_Web_119 @CNA_Web_121 @Regression_Web @CNA_Web
  Scenario: Validate Bookmark and Share options in Listen Page
    Given I launch the CNA web application and check HomePage
    When I Click on Listen Menu Link
    And I validate Listen Landing Page Header
    And I click on three dots of article from Listen Page
    Then I validate the bookmark and share options from three dots
    And I click on three dots of article from Listen Page
    Then I click on Listen Now button
    And I validate Pause and Play functionality

  @CNA_Web_120 @Regression_Web @CNA_Web
  Scenario: Validate Load more episodes button in Listen Page
    Given I launch the CNA web application and check HomePage
    When I Click on Listen Menu Link
    And I validate Listen Landing Page Header
    Then I click on a Podcast Link from Listen Page
    And I validate if Podcast Page Header is displayed
    Then I click on Load More episodes button
    And I validate if all the episodes are loaded
