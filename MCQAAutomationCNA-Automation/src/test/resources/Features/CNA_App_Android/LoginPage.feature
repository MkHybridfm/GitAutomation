@LoginScenarios @SSO
Feature: Login scenarios

  @CNA_Android_010 @CNA_Android_059  @Sanity_Android  @ProdSanity_Android @Sanity_Android_SSO
    @Android_Mobile_CNAB-903 @Android_Mobile_CNAB-954
  Scenario: Login with valid meConnect user name and password in Android App with SSO Do it later
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on settings icon in Android App
    When I click on login from Settings in Android App
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Mobile
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Mobile
    Then I enter valid credentials in Username and Password fields
    And I Click "Sign In" Button on "CNA SignIn Screen" in Android Mobile
    Then I validate the account section on settings page in Android App
    Then I validate the general section on settings page in Android App
    Then I validate the contact section on settings page in Android App
    Then I validate the about section on settings page in Android App

  @Sanity_Android_SSO
  Scenario: Login with valid meConnect user name and password in Android App with Get Started
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    And I Click "Get Started" Button on "CNA Onboarding Screen" in Android Mobile
    Then I validate if CNA Save preferences page is displayed in Android App
    When I Select Trending Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Mobile
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Mobile
    Then I enter valid credentials in Username and Password fields
    And I Click "Sign In" Button on "CNA SignIn Screen" in Android Mobile
    Then I validate the Home Page section landing header in Android App
    And I click on settings icon in Android App
    Then I validate the account section on settings page in Android App
    Then I validate the general section on settings page in Android App
    Then I validate the contact section on settings page in Android App
    Then I validate the about section on settings page in Android App
    And I click on back arrow in Android App
    And I should logout from Android App