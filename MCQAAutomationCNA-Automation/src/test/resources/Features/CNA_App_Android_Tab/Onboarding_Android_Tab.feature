@OnBoardingScenarios_Android_Tab @SSO_Tab
Feature: OnBoarding scenarios

  @CNA_Android_Tab_001 @CNA_Android_Tab_003 @CNA_Android_Tab_004  @Sanity_Android_Tab
    @Android_Tab_CNAB-894 @Android_Tab_CNAB-896 @Android_Tab_CNAB-897
  Scenario: Verification of onBoarding screen in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    And I validate if welcome screen with CNA Logo, Get Started Link, Do it Later Links is displayed in Android App in Tab

  @CNA_Android_TabSSO_001 @CNA_Android_TabSSO_003 @CNA_Android_TabSSO_006 @CNA_Android_TabSSO_008 @CNA_Android_TabSSO_009a @Sanity_Android_Tab_SSO @Sanity_Android_Tab
  Scenario: Verification of onBoarding screen and Do it later option in Tab in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    And I validate if welcome screen with CNA Logo, Get Started Link, Do it Later Links is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab

  @CNA_Android_TabSSO_009b @Sanity_Android_Tab_SSO @Sanity_Android_Tab
  Scenario: Verification of No I will continue option in Do It later flow
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    When I click on No I'll continue button in Android App in Tab
    Then I validate if CNA Save preferences page is displayed in Android App in Tab

  @CNA_Android_TabSSO_007 @CNA_Android_TabSSO_010 @CNA_Android_TabSSO_011 @CNA_Android_TabSSO_012 @Sanity_Android_Tab_SSO @Sanity_Android_Tab
  Scenario: Validation of Save Preferences Pages with Get Started in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I click on Get Started button in Android App in Tab
    Then I validate if CNA Save preferences page is displayed in Android App in Tab
    Then I validate if CNA Save preferences page topic Listing and Options
    Then I Verify CNA OnBoarding Save Preference Trending Topics List in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    Then I Verify CNA OnBoarding Save Preference More Topics Section in Android App in Tab
    When I Select More Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed in Android App in Tab

  @CNA_Android_TabSSO_013 @CNA_Android_TabSSO_014 @CNA_Android_TabSSO_015 @Sanity_Android_Tab_SSO @Sanity_Android_Tab
  Scenario: Validation of Login Flow with Get Started in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I click on Get Started button in Android App in Tab
    Then I validate if CNA Save preferences page is displayed in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed in Android App in Tab
    And I validate if Cna Logo, meConnect Logo, SignIn Link, Create Account Button are displayed in Android App in Tab
    And I validate if SignIn with Apple, Facebook and Google options are displayed in Android App in Tab
    Then I click on Sign In with meConnect Link from Sign up page in Android App in Tab
    And I validate if Sign In Page is displayed in Android App in Tab
    And I validate if Username, password fields are displayed in Android App in Tab
    Then I valdiate if Sign In, Cancel buttons and Forgot password link is displayed in Android App in Tab
    Then I enter valid credentials in Username and Password fields in Android App in Tab
    When I click on Log In button in Android App in Tab
    Then I validate the Home Page section landing header in Android App in Tab

  @CNA_Android_TabSSO_016 @CNA_Android_TabSSO_017 @Sanity_Android_Tab_SSO @Sanity_Android_Tab
  Scenario: Validation of Cancel Login and Forgot password options in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I click on Get Started button in Android App in Tab
    Then I validate if CNA Save preferences page is displayed in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed in Android App in Tab
    Then I click on Sign In with meConnect Link from Sign up page in Android App in Tab
    And I validate if Sign In Page is displayed in Android App in Tab
    Then I enter valid credentials in Username and Password fields in Android App in Tab
    And I click on Back button in SignIn Page in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed in Android App in Tab
    Then I click on Sign In with meConnect Link from Sign up page in Android App in Tab
    When I click on Forgot Your Password link in Android App in Tab
    Then I validate if Forgot you password page is displayed in Android App in Tab
    And I validate if enter email address text, email field and Submit button is displayed in Android App in Tab

