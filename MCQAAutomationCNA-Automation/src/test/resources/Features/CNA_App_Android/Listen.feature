@ListenScenarios_Android @SSO
Feature: Listen scenarios

  @CNA_Android_045 @CNA_Android_046  @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-940 @Android_Mobile_CNAB-941
  Scenario: Validation of Listen landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click listen on menu page in Android App
    Then I validate the header as "Listen" in Android App
    Then I validate the live content on the listen page in Android App
    And I click on view full schedule link in Android App
    Then I validate the schedule page in web view in Android App
    And I click on back arrow in Android App

  @CNA_Android_047 @CNA_Android_050 @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-942 @Android_Mobile_CNAB-945
  Scenario: Validation of three dots and podcast play on Listen landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click listen on menu page in Android App
    Then I validate the header as "Listen" in Android App
    Then I click on three dots on listen page in Android App
    Then I validate the bookmark and share options in Android App
    And I click on article on listen page in Android App
    Then I play the podcast in Android App
