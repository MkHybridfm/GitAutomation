@iPhone_CNA_SignupScenarios
@iPhone_QA
Feature: Signup scenarios
  @iPhone_CNAB-902 @iPhone_CNAB-901 @iPhone_CNAB-900 @iPhone_CNAB-899 @iPhone_CNAB-898
  @iPhone_CNA_1201 @iPhone_CNA_Sanity
  Scenario: Verification of create new meConnect Account in iPhone
    Given I Launch "CNA iPhone" Mobile App in iPhone
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPhone
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPhone
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPhone
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPhone
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPhone
    When I Select Trending Topics in iPhone
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPhone
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPhone
    Then I Click "Save Preferences" on "OnBoarding Save Preferences Screen" in iPhone
    Then I Verify "cna-logo" Image is displayed on "OnBoarding Sign in Screen" in iPhone
    Then I Verify "You are signing in to" info is displayed on "OnBoarding Sign in Screen" in iPhone
    Then I Verify "meconnect-logo" Image is displayed on "OnBoarding Sign in Screen" in iPhone
    Then I Verify "For personalised and seamless access across Mediacorp's digital services" info is displayed on "OnBoarding Sign in Screen" in iPhone
    Then I Verify "Sign in with meconnect" Button is displayed on "OnBoarding Sign in Screen" in iPhone
    Then I Verify "Don’t have an account yet? Create one now" Button is displayed on "OnBoarding Sign in Screen" in iPhone
    Then I Verify "OR" info is displayed on "OnBoarding Sign in Screen" in iPhone
    Then I Verify "Continue with Apple" Button is displayed on "OnBoarding Sign in Screen" in iPhone
    Then I Verify "Continue with Facebook" Button is displayed on "OnBoarding Sign in Screen" in iPhone
    Then I Verify "Continue with Apple" Button is displayed on "OnBoarding Sign in Screen" in iPhone
    And I click on signUp button in iPhone
    Then I validate create meConnect account first page in iPhone
    And I provide the user login credentials to log into the application in iPhone
    Then I validate create meConnect account second page in iPhone
    And I provide the user details of second page in iPhone
    Then I validate create meConnect account third page in iPhone
    And I provide the user details of third page in iPhone
    Then I validate the account got created successFull message in iPhone
    When I click on OK Button in Signup Screen in iPhone
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPhone
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPhone
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPhone
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPhone
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPhone
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPhone
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPhone
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPhone
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPhone
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPhone
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPhone
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPhone
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPhone
    When I Handle App Tracking Popup "CNA" Mobile App in iPhone
    Then I Click "settings" Button on "CNA Screen" in iPhone
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPhone
    Then I Verify "Account" info is displayed on "CNA Settings Screen" in iPhone
    When I Click "Log out" Button on "CNA Settings Screen" in iPhone
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPhone
    When I Select OK from Logout Popup in iPhone