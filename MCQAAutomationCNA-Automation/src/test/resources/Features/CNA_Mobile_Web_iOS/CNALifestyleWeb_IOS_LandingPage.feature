@CNALifestyleWeb_LandingPageScenarios
Feature: Lifestyle Landing Page scenarios

  @CNA_Mobile_Web_IOS_77 @CNA_Mobile_Web_IOS_78 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLifestyle @Regression_Web
  @Web_CNAB-1100 @Web_CNAB-1101
  Scenario: Lifestyle Landing Page validation in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    And I validate if all the landing Page components are present in IOS Mobile Web
    When I click on Entertainment Main Menu link in IOS Mobile Web
    And I validate if Entertainment Landing Page is displayed in IOS Mobile Web
    Then I validate if SignIN option and Search option is available in IOS Mobile Web
    When I click on Living Main Menu link in IOS Mobile Web
    And I validate if Living Landing Page is displayed in IOS Mobile Web
    Then I validate if SignIN option and Search option is available in IOS Mobile Web
    When I click on Travel Main Menu link in IOS Mobile Web
    And I validate if Travel Landing Page is displayed in IOS Mobile Web
    Then I validate if SignIN option and Search option is available in IOS Mobile Web
