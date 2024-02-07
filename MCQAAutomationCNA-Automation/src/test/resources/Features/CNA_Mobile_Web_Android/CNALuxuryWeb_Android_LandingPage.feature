@CNALuxuryWeb_LandingPageScenarios
Feature: Luxury Landing Page scenarios

  @CNA_Mobile_Web_Android_95 @CNA_Mobile_Web_Android_96 @CNA_Mobile_Web_Android_100 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLuxury @Regression_Web
  @Web_CNAB-1128 @Web_CNAB-1122 @Web_CNAB-1117
  Scenario: Luxury Login with Valid credentials scenario in Android Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in Android Mobile Web
    And I validate if all the Luxury landing Page components are present in Android Mobile Web
    When I click on People Main Menu link in Android Mobile Web
    And I validate if People Landing Page is displayed in Android Mobile Web
    Then I validate if SignIN option and Search option is available in Android Mobile Web
    When I click on Experiences Main Menu link in Android Mobile Web
    And I validate if Experiences Landing Page is displayed in Android Mobile Web
    Then I validate if SignIN option and Search option is available in Android Mobile Web
    Then I validate if infinite scroll or fetching  more news functionality is working in Android Mobile Web