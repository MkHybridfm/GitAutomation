@LoginScenarios_Android_Tab @SSO_Tab
Feature: Login scenarios

  @CNA_Android_Tab_010 @CNA_Android_Tab_059  @Sanity_Android_Tab  @ProdSanity_Android_Tab @Sanity_Android_Tab_SSO
    @Android_Tab_CNAB-903 @Android_Tab_CNAB-954
  Scenario: Login with valid meConnect user name and password in Android App in Tab with SSO Do it later
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    When I click on login from Settings in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed
    Then I click on Sign In with meConnect Link from Sign up page
    And I validate if Sign In Page is displayed
    Then I enter valid credentials in Username and Password fields
    When I click on Log In button
    Then I validate the account section on settings page in Android App in Tab
    Then I validate the general section on settings page in Android App in Tab
    Then I validate the contact section on settings page in Android App in Tab
    Then I validate the about section on settings page in Android App in Tab
    And I click on back arrow in Android App in Tab
    And I should logout from Android App in Tab

  @Sanity_Android_Tab_SSO
  Scenario: Login with valid meConnect user name and password in Android App in Tab with Get Started
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
    Then I validate the general section on settings page in Android App in Tab
    Then I validate the contact section on settings page in Android App in Tab
    Then I validate the about section on settings page in Android App in Tab
    And I click on back arrow in Android App in Tab
    And I should logout from Android App in Tab