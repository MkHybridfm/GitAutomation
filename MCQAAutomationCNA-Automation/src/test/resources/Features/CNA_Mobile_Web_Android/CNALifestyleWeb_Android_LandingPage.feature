@CNALifestyleWeb_LandingPageScenarios_MobileWeb_Android
Feature: Lifestyle Landing Page scenarios_Mobile Web Android

  @CNA_Mobile_Web_Android_77 @CNA_Mobile_Web_Android_78 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLifestyle @Regression_Web
  @Web_CNAB-1100 @Web_CNAB-1101
  Scenario: Lifestyle Landing Page validation in Android Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in Android Mobile Web
    And I validate if all the landing Page components are present in Android Mobile Web
    When I click on Entertainment Main Menu link in Android Mobile Web
    And I validate if Entertainment Landing Page is displayed in Android Mobile Web
    Then I validate if SignIN option and Search option is available in Android Mobile Web
    When I click on Living Main Menu link in Android Mobile Web
    And I validate if Living Landing Page is displayed in Android Mobile Web
    Then I validate if SignIN option and Search option is available in Android Mobile Web
    When I click on Travel Main Menu link in Android Mobile Web
    And I validate if Travel Landing Page is displayed in Android Mobile Web
    Then I validate if SignIN option and Search option is available in Android Mobile Web
