@WatchScenarios_Android @SSO
Feature: Watch scenarios

  @CNA_Android_039  @Sanity_Android
    @Android_Mobile_CNAB-934
  Scenario: Validation of watch landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on watch page from menu sec in Android App
    Then I validate the header of watch page in Android App
#    Then I validate the live status displayed on the video in Android App

  @CNA_Android_040  @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-935
  Scenario: Validation of full tv schedule page on watch landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on watch page from menu sec in Android App
    Then I validate the header of watch page in Android App
    And I click on full tv schedule in Android App
    Then I validate the label displayed with "LIVE TV International schedule" in Android App

  @CNA_Android_041  @Sanity_Android
    @Android_Mobile_CNAB-936
  Scenario: Validation of three dots on Recommended section and other sections of watch landing page
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on watch page from menu sec in Android App
    Then I validate the header of watch page in Android App
    And I click on three dots under the recommended section in Android App
    Then I validate the share button in Android App
    And I click on three dots under the latest section in Android App
    Then I validate the bookmark and share options in Android App

  @CNA_Android_043  @Sanity_Android
    @Android_Mobile_CNAB-938
  Scenario: Validation of video detail page on watch landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on watch page from menu sec in Android App
    Then I validate the header of watch page in Android App
    And I click on latest episode in Android App
    Then I verify the fields with "You May Also Like" and "Popular Shows" in Android App

  @CNA_Android_044 @Sanity_Android
    @Android_Mobile_CNAB-939
  Scenario: Validation of video player controls on watch landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on watch page from menu sec in Android App
    Then I validate the header of watch page in Android App
    And I click on latest episode in Android App
    Then I validate the player controls on video in Android App
