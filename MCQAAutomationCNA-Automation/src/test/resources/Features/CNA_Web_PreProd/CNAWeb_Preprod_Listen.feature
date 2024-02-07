@CNAWeb_ListenPageScenarios
Feature: Listen Page scenarios

  @CNA_Web_PreProd_64 @CNA_Web_PreProd_65 @CNA_Web_PreProd_122 @Sanity_Web_PreProd @Regression_Web @CNA_Web
    @Web_CNAB-1087 @Web_CNAB-1088
  Scenario: Validate Listen Landing Page and View Full Schedule Option in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I Click on Listen Menu Link in PreProd
    And I validate Listen Landing Page Header in PreProd
    Then I Validate OnAir section, View full Schedule Link, Editors Picks, CNA Program, On Demand and View more CTA sections in PreProd
    And I click on View Full schedule link from Listen Page in PreProd
    Then I validate if weekday schedule List is displayed in PreProd
    And I click on Find out more Link from Schedule List page in PreProd
    Then I validate the share option and Podcast description in PreProd

  @CNA_Web_PreProd_66 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1089
  Scenario: Validate Listen Podcast Page Play Control sections in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I Click on Listen Menu Link in PreProd
    And I validate Listen Landing Page Header in PreProd
    Then I click on a Podcast Link from Listen Page in PreProd
    And I validate if Podcast Page Header is displayed in PreProd
    Then I click on Play Podcast button in PreProd
    And I validate if Play control area is displayed in PreProd
    Then I click on Pause button in PreProd
    And I validate if Play button is displayed in PreProd

  @CNA_Web_PreProd_67 @Sanity_Web_PreProd @re
  @Web_CNAB-1090
  Scenario: Validate All Podcast page Filter/Pagination/showing count features in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I Click on Listen Menu Link in PreProd
    And I validate Listen Landing Page Header in PreProd
    Then I click on View all link from More Podcasts Section in PreProd
    And I validate if All Podcasts Page is displayed in PreProd
    Then I validate if Search Text box is displayed in PreProd
    And I validate if Sorting filter is displayed in PreProd
    Then I validate if Pagination is displayed at bottom of the page in PreProd
