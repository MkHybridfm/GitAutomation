@iPhone_CNA_LoginScenarios
@iPhone_QA
Feature: Login scenarios

  @iPhone_CNA_0101 @iPhone_CNA_Regression
  Scenario: Login with valid meConnect user name and password in iPhone New SSO With Do it Later
    Given I Launch "CNA iPhone" Mobile App in iPhone
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPhone
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Click "Do it later" Button on "CNA OnBoarding Screen" in iPhone
    Then I Verify "Are you sure you want to do it later?" info is displayed on "Do it later Alert - CNA OnBoarding Screen" in iPhone
    Then I Verify "If you choose to exit now, your preferences will not be saved." info is displayed on "Do it later Alert - CNA OnBoarding Screen" in iPhone
    Then I Verify "Yes, I’ll do it later" Button is displayed on "Do it later Alert - CNA OnBoarding Screen" in iPhone
    Then I Verify "No, I’ll continue" Button is displayed on "Do it later Alert - CNA OnBoarding Screen" in iPhone
    Then I Click "Yes, I’ll do it later" Button on "Do it later Alert - CNA OnBoarding Screen" in iPhone
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
    Then I Verify "Log in" Button is displayed on "CNA Settings Screen" in iPhone
    Then I Click "Log in" Button on "CNA Screen" in iPhone
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPhone
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPhone
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPhone
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPhone
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPhone
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPhone
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPhone
   Then I click on login in iPhone
    When I Click Back Button on "CNA Settings Screen" in iPhone
    Then I Click "settings" Button on "CNA Screen" in iPhone
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPhone
    Then I Verify "Account" info is displayed on "CNA Settings Screen" in iPhone
    When I Click "Log out" Button on "CNA Settings Screen" in iPhone
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPhone
    When I Select OK from Logout Popup in iPhone

  @iPhone_CNAB-903
  @iPhone_CNA_0102 @iPhone_CNA_Sanity
  Scenario: Login with valid meConnect user name and password in iPhone New SSO With Get Started
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
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPhone
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPhone
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPhone
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPhone
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPhone
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPhone
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPhone
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPhone
   Then I click on login in iPhone
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
    Then I Verify "meRewards" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Manage meconnect account" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "To change password, update your personal details or delete account" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "General" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Notifications" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Display" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Edition" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Contact" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "CNA Eyewitness" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Help and feedback" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Advertise with us" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "About" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Mediacorp Digital Network" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "App version" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Channel Id" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Terms of Service" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Privacy Policy" info is displayed on "CNA Settings Screen" in iPhone
    Then I Verify "Log out" Button is displayed on "CNA Settings Screen" in iPhone

