@ListenScenarios_Android_Tab @SSO_Tab
Feature: Listen scenarios

  @CNA_Android_Tab_045 @CNA_Android_Tab_046  @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-940 @Android_Tab_CNAB-941
  Scenario: Validation of Listen landing page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click listen on menu page in Android App in Tab
    Then I validate the header as "Listen" in Android App in Tab
    Then I validate the live content on the listen page in Android App in Tab
    And I click on view full schedule link in Android App in Tab
    Then I validate the schedule page in web view in Android App in Tab
    And I click on back arrow in Android App in Tab

  @CNA_Android_Tab_047 @CNA_Android_Tab_050 @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-942 @Android_Tab_CNAB-945
  Scenario: Validation of three dots and podcast play on Listen landing page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click listen on menu page in Android App in Tab
    Then I validate the header as "Listen" in Android App in Tab
    Then I click on three dots on listen page in Android App in Tab
    Then I validate the bookmark and share options in Android App in Tab
    And I click on article on listen page in Android App in Tab
    Then I play the podcast in Android App in Tab
