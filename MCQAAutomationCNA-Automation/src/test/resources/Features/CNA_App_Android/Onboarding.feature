@OnBoardingScenarios_Android @SSO
Feature: OnBoarding scenarios

  @CNA_Android_001 @CNA_Android_003 @CNA_Android_004  @Sanity_Android
    @Android_Mobile_CNAB-894 @Android_Mobile_CNAB-896 @Android_Mobile_CNAB-897
  Scenario: Verification of onBoarding screen in Android App
    Given I launch the Android App
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    Then I validate if CNA logo is displayed in CNA Onboarding Screen in Android Mobile
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    #Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is visible on "CNA OnBoarding Screen" in Android Mobile
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in Android Mobile
    Then I Verify "Do it later" info is displayed on "CNA OnBoarding Screen" in Android Mobile

  @CNA_AndroidSSO_001 @CNA_AndroidSSO_003 @CNA_AndroidSSO_006 @CNA_AndroidSSO_008 @CNA_AndroidSSO_009a @Sanity_Android_SSO @Sanity_Android
  Scenario: Verification of onBoarding screen and Do it Later option in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    And I validate if welcome screen with CNA Logo, Get Started Link, Do it Later Links is displayed
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App

  @CNA_AndroidSSO_009b @Sanity_Android_SSO @Sanity_Android
  Scenario: Verification of No I will continue option in Do It later flow
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    When I click on No I'll continue button
    Then I validate if CNA Save preferences page is displayed in Android App

  @CNA_AndroidSSO_007 @CNA_AndroidSSO_010 @CNA_AndroidSSO_011 @CNA_AndroidSSO_012 @Sanity_Android_SSO @Sanity_Android
  Scenario: Validation of Save Preferences Pages with Get Started in Android app
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    And I Click "Get Started" Button on "CNA Onboarding Screen" in Android Mobile
    Then I validate if CNA Save preferences page is displayed in Android App
    Then I validate if CNA Save preferences page topic Listing and Options
    Then I Verify CNA OnBoarding Save Preference Trending Topics List in Android App
    When I Select Trending Topics in Android App
    Then I Verify CNA OnBoarding Save Preference More Topics Section in Android App
    When I Select More Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
     Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile

  @CNA_AndroidSSO_013 @CNA_AndroidSSO_014 @CNA_AndroidSSO_015 @Sanity_Android_SSO @Sanity_Android
  Scenario: Validation of Login Flow with Get Started in Android app
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    And I Click "Get Started" Button on "CNA Onboarding Screen" in Android Mobile
    Then I validate if CNA Save preferences page is displayed in Android App
    When I Select Trending Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
     Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile
    And I validate if Cna Logo, meConnect Logo, SignIn Link, Create Account Button are displayed
    And I validate if SignIn with Apple, Facebook and Google options are displayed
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Mobile
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Mobile
    And I validate if Username, password fields are displayed
    Then I valdiate if Sign In, Cancel buttons and Forgot password link is displayed
    Then I enter valid credentials in Username and Password fields
   And I Click "Sign In" Button on "CNA SignIn Screen" in Android Mobile
    Then I validate the Home Page section landing header in Android App

  @CNA_AndroidSSO_016 @CNA_AndroidSSO_017 @Sanity_Android_SSO @Sanity_Android
  Scenario: Validation of Cancel Login and Forgot password options in Android app
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
    And I click on Back button in SignIn Page in Android App
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Mobile
    When I click on Forgot Your Password link in Android app
    Then I validate if Forgot you password page is displayed
    And I validate if enter email address text, email field and Submit button is displayed

