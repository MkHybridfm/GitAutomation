@WatchScenarios_Android_SSO @SSO_Tab
Feature: Watch scenarios

  @CNA_Android_Tab_039  @Sanity_Android_Tab
    @Android_Tab_CNAB-934
  Scenario: Validation of watch landing page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on watch page from menu sec in Android App in Tab
    Then I validate the header of watch page in Android App in Tab
#    Then I validate the live status displayed on the video in Android App in Tab

  @CNA_Android_Tab_040  @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-935
  Scenario: Validation of full tv schedule page on watch landing page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on watch page from menu sec in Android App in Tab
    Then I validate the header of watch page in Android App in Tab
    And I click on full tv schedule in Android App in Tab
    Then I validate the label displayed with "LIVE TV International schedule" in Android App in Tab

  @CNA_Android_Tab_041  @Sanity_Android_Tab
    @Android_Tab_CNAB-936
  Scenario: Validation of three dots on Recommended section and other sections of watch landing page
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on watch page from menu sec in Android App in Tab
    Then I validate the header of watch page in Android App in Tab
    And I click on three dots under the recommended section in Android App in Tab
    Then I validate the share button in Android App in Tab
    And I click on three dots under the latest section in Android App in Tab
    Then I validate the bookmark and share options in Android App in Tab

  @CNA_Android_Tab_043  @Sanity_Android_Tab
    @Android_Tab_CNAB-938
  Scenario: Validation of video detail page on watch landing page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on watch page from menu sec in Android App in Tab
    Then I validate the header of watch page in Android App in Tab
    And I click on latest episode in Android App in Tab
    Then I verify the fields with "You May Also Like" and "Popular Shows" in Android App in Tab

  @CNA_Android_Tab_044 @Sanity_Android_Tab
    @Android_Tab_CNAB-939
  Scenario: Validation of video player controls on watch landing page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on watch page from menu sec in Android App in Tab
    Then I validate the header of watch page in Android App in Tab
    And I click on latest episode in Android App in Tab
    Then I validate the player controls on video in Android App in Tab
