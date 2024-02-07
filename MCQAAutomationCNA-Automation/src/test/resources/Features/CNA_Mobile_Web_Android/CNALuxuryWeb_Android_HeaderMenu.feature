@CNALuxuryWeb_HeaderMenuScenarios
Feature: Luxury Header Menu Validation scenarios

  @CNA_Mobile_Web_Android_107 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLuxury
  @Web_CNAB-1134
  Scenario: Luxury Header Menu Brand Switch validation in Android Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in Android Mobile Web
    When I click on Go to Lifestyle link from Header Menu in Android Mobile Web
    Then I validate if Lifestyle Page header is displayed in Android Mobile Web