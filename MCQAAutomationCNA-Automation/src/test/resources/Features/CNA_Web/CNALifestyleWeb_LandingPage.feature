@CNALifestyleWeb_LandingPageScenarios
Feature: Lifestyle Landing Page scenarios

  @CNA_Web_77 @CNA_Web_78 @Sanity_Web @Sanity_WebLifestyle @Regression_Web
  @Web_CNAB-1100 @Web_CNAB-1101 @roy
  Scenario: Lifestyle Landing Page validation
    Given I launch the CNA Lifestyle web application and check HomePage
    And I validate if all the landing Page components are present
    When I click on Entertainment Main Menu link
    And I validate if Entertainment Landing Page is displayed
    Then I validate if SignIN option and Search option is available
    When I click on Living Main Menu link
    And I validate if Living Landing Page is displayed
    Then I validate if SignIN option and Search option is available
    When I click on Travel Main Menu link
    And I validate if Travel Landing Page is displayed
    Then I validate if SignIN option and Search option is available
