@CNALuxuryWeb_LandingPageScenarios
Feature: Luxury Landing Page scenarios

  @CNA_Mobile_Web_IOS_95 @CNA_Mobile_Web_IOS_96 @CNA_Mobile_Web_IOS_100 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLuxury @Regression_Web
  @Web_CNAB-1128 @Web_CNAB-1122 @Web_CNAB-1117
  Scenario: Luxury Login with Valid credentials scenario in IOS Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in IOS Mobile Web
    And I validate if all the Luxury landing Page components are present in IOS Mobile Web
    When I click on People Main Menu link in IOS Mobile Web
    And I validate if People Landing Page is displayed in IOS Mobile Web
    Then I validate if SignIN option and Search option is available in IOS Mobile Web
    When I click on Experiences Main Menu link in IOS Mobile Web
    And I validate if Experiences Landing Page is displayed in IOS Mobile Web
    Then I validate if SignIN option and Search option is available in IOS Mobile Web
    Then I validate if infinite scroll or fetching  more news functionality is working in IOS Mobile Web