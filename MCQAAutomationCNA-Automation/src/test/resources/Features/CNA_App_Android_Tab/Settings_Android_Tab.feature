@SettingsScenarios_Android @SSO_Tab
Feature: Settings Page scenarios

  @CNA_Android_Tab_058  @Sanity_Android_Tab
    @Android_Tab_CNAB-953
  Scenario: Validation of settings page for un logged user in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    Then I click on settings icon in Android App in Tab
    Then I validate the general section on settings page in Android App in Tab
    Then I validate the contact section on settings page in Android App in Tab
    Then I validate the about section on settings page in Android App in Tab
    Then I validate the login button on settings page in Android App in Tab

#   @CNA_059  @Sanity_Android_Tab
#  Scenario:Validation of settings page for logged user // covered in login page scenario as @CNA_010 //

  @CNA_Android_Tab_060  @Sanity_Android_Tab
    @Android_Tab_CNAB-955
  Scenario: Validation of me Rewards on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I click on Get Started button in Android App in Tab
    Then I validate if CNA Save preferences page is displayed in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed
    Then I click on Sign In with meConnect Link from Sign up page
    And I validate if Sign In Page is displayed
    Then I enter valid credentials in Username and Password fields
    When I click on Log In button
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the account section on settings page in Android App in Tab
    And I click on meRewards on account section in Android App in Tab
    Then I validate the meRewards section page in Android App in Tab

  @CNA_Android_Tab_061  @Sanity_Android_Tab
  @Android_Tab_CNAB-956
  Scenario: Validation of manage meCONNECT account on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I click on Get Started button in Android App in Tab
    Then I validate if CNA Save preferences page is displayed in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed
    Then I click on Sign In with meConnect Link from Sign up page
    And I validate if Sign In Page is displayed
    Then I enter valid credentials in Username and Password fields
    When I click on Log In button
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the account section on settings page in Android App in Tab
    And I click on manage meConnect account on account section in Android App in Tab
    Then I validate the conformation message to access account on section page in Android App in Tab
    And I click No button on conformation message in Android App in Tab

  @CNA_Android_Tab_062  @Sanity_Android_Tab
    @Android_Tab_CNAB-957
  Scenario: Validation of notifications on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the general section on settings page in Android App in Tab
    And I click on notifications on general section in Android App in Tab
    Then I validate the notifications page in Android App in Tab

  @CNA_Android_Tab_063  @Sanity_Android_Tab
    @Android_Tab_CNAB-958
  Scenario: Validation of Display on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the general section on settings page in Android App in Tab
    And I click on display on general section in Android App in Tab
    Then I validate the display page in Android App in Tab

  @CNA_Android_Tab_063_a  @Sanity_Android_Tab
    @Android_Tab_CNAB-958
  Scenario: Validation of Edition on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the general section on settings page in Android App in Tab
    And I click on edition on general section in Android App in Tab
    Then I validate the edition page in Android App in Tab

  @CNA_Android_Tab_064  @Sanity_Android_Tab
    @Android_Tab_CNAB-959
  Scenario: Validation of eye witness on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the contact section on settings page in Android App in Tab
    And I click on eye witness on contact section in Android App in Tab
    Then I validate the eye witness page in Android App in Tab


  @CNA_Android_Tab_065  @Sanity_Android_Tab
    @Android_Tab_CNAB-960
  Scenario: Validation of help and feedback on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the contact section on settings page in Android App in Tab
    And I click on help & feedback on contact section in Android App in Tab
    Then I validate the help & feedback page opened in web view in Android App in Tab
    And I click on Done button on web view page in Android App in Tab

  @CNA_Android_Tab_066  @Sanity_Android_Tab
    @Android_Tab_CNAB-961
  Scenario: Validation of Advertisement sec on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the contact section on settings page in Android App in Tab
    And I click on advertisement sec on contact section in Android App in Tab
    Then I validate the advertisement sec opened in web view in Android App in Tab
    And I click on Done button on web view page in Android App in Tab

  @CNA_Android_Tab_067  @Sanity_Android_Tab
    @Android_Tab_CNAB-962
  Scenario: Validation of Mediacorp digital network sec on settings page
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the about section on settings page in Android App in Tab
    And I click on mediaCorp digital filed on contact section in Android App in Tab
    Then I validate the mediaCorp digital page opened in web view in Android App in Tab
    And I click on Done button on web view page in Android App in Tab

  @CNA_Android_Tab_068  @Sanity_Android_Tab
    @Android_Tab_CNAB-963
  Scenario: Validation of app version on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the about section on settings page in Android App in Tab
    Then I validate the app version details on settings page in Android App in Tab

  @CNA_Android_Tab_069  @Sanity_Android_Tab
    @Android_Tab_CNAB-964
  Scenario: Validation of channelId on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the about section on settings page in Android App in Tab
    And I click on channel id in Android App in Tab
    Then I validate the conformation message on about page in Android App in Tab
    And I click on cancel button in Android App in Tab

  @CNA_Android_Tab_070  @Sanity_Android_Tab
    @Android_Tab_CNAB-965
  Scenario: Validation of Terms of service on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the about section on settings page in Android App in Tab
    And I click on terms of service filed on contact section in Android App in Tab
    Then I validate the terms of service page opened in web view in Android App in Tab
    And I click on Done button on web view page in Android App in Tab

  @CNA_Android_Tab_071  @Sanity_Android_Tab
  @Android_Tab_CNAB-966
  Scenario: Validation of privacy policy on settings page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the about section on settings page in Android App in Tab
    And I click on privacy policy filed on contact section in Android App in Tab
    Then I validate the privacy policy page opened in web view in Android App in Tab
    And I click on Done button on web view page in Android App in Tab

  @CNA_Android_Tab_072  @Sanity_Android_Tab
  @Android_Tab_CNAB-967
  Scenario: Validation of Logout button on settings page
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I click on Get Started button in Android App in Tab
    Then I validate if CNA Save preferences page is displayed in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed
    Then I click on Sign In with meConnect Link from Sign up page
    And I validate if Sign In Page is displayed
    Then I enter valid credentials in Username and Password fields
    When I click on Log In button
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the logout button in Android App in Tab

