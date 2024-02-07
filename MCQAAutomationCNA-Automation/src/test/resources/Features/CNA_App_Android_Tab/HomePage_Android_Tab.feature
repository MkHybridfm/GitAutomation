@HomePageScenarios_Android_Tab @SSO_Tab
Feature: HomePage scenarios

  @CNA_Android_Tab_014  @CNA_Android_Tab_015  @Sanity_Android_Tab
    @Android_Tab_CNAB-907 @Android_Tab_CNAB-908
  Scenario: Validate Home Page and swipe functionality on Home page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I validate swipe functionality on Home page in Android App in Tab
