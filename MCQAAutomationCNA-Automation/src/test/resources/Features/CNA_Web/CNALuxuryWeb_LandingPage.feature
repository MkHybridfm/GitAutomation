@CNALuxuryWeb_LandingPageScenarios
Feature: Luxury Landing Page scenarios

  @CNA_Web_95 @CNA_Web_96 @CNA_Web_100 @Sanity_Web @Sanity_WebLuxury @Regression_Web
  @Web_CNAB-1128 @Web_CNAB-1122 @Web_CNAB-1117
  Scenario: Luxury Login with Valid credentials scenario
    Given I launch the CNA Luxury web application and check HomePage
    And I validate if all the Luxury landing Page components are present
    When I click on People Main Menu link
    And I validate if People Landing Page is displayed
    Then I validate if SignIN option and Search option is available
    When I click on Experiences Main Menu link
    And I validate if Experiences Landing Page is displayed
    Then I validate if SignIN option and Search option is available
    Then I validate if infinite scroll or fetching  more news functionality is working