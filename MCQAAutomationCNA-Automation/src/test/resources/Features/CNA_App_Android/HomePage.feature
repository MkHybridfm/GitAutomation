@HomePageScenarios_Android @SSO
Feature: HomePage scenarios

  @CNA_Android_014  @CNA_Android_015  @Sanity_Android
    @Android_Mobile_CNAB-907 @Android_Mobile_CNAB-908
  Scenario: Validate Home Page and swipe functionality on Home page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I validate swipe functionality on Home page in Android App
