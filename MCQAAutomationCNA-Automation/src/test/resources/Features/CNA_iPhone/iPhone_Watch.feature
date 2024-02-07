@iPhone_CNA_WatchScenarios
@iPhone_QA
Feature: Watch scenarios

  @iPhone_CNAB-939 @iPhone_CNAB-938 @iPhone_CNAB-936 @iPhone_CNAB-935 @iPhone_CNAB-934
  @iPhone_CNA_1101 @iPhone_CNA_Sanity
  Scenario: Validation of watch landing page in iPhone
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
    Then I validate the Home Screen section landing header in iPhone
    When I Select "Watch" from Bottom Tab in iPad
    Then I Verify "Watch" Screen in iPhone
    Then I validate the live status displayed on the video in iPhone
    And I click on three dots under the recommended section in iPhone
    And I validate the share options in iPhone
    And I validate the bookmark options in iPhone
    And I click on three dots under the recommended section in iPhone
    And I click on full tv schedule in iPhone
    Then I Verify "LIVE TV International schedule" Screen in iPhone
    When I click on back arrow in iPhone
    And I click on latest episode in iPhone
    And I validate toast message on the article page in iPhone
    Then I validate the player controls on video in iPhone
    Then I validate the player controls sound on video in iPhone
    Then I verify the fields with "You May Also Like" and "Popular Shows" in iPhone

  @iPhone_CNA_1102 @iPhone_CNA_Regression
  Scenario: Validation of full tv schedule page on watch landing page in iPhone
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
    Then I validate the Home Screen section landing header in iPhone
    And I click on Menu in iPhone
    When I Select "Watch" from menu in iPhone
    Then I Verify "Watch" Screen in iPhone
    And I click on full tv schedule in iPhone
    Then I Verify "LIVE TV International schedule" Screen in iPhone
    And I click on settings icon in iPhone
    And I Select "Log out" from Settings in iPhone
    And I Select OK from Logout Popup in iPhone

  @iPhone_CNA_1103 @iPhone_CNA_Regression
  Scenario: Validation of three dots on Recommended section and other sections of watch landing page in iPhone
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
    Then I validate the Home Screen section landing header in iPhone
    And I click on Menu in iPhone
    When I Select "Watch" from menu in iPhone
    Then I Verify "Watch" Screen in iPhone
    And I click on three dots under the recommended section in iPhone
    And I validate the share options in iPhone
    And I validate the bookmark options in iPhone
    When I click on settings icon in iPhone
    And I Select "Log out" from Settings in iPhone
    And I Select OK from Logout Popup in iPhone


  @iPhone_CNA_1104 @iPhone_CNA_Regression
  Scenario: Validation of video detail page on watch landing page in iPhone
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
    Then I validate the Home Screen section landing header in iPhone
    And I click on Menu in iPhone
    When I Select "Watch" from menu in iPhone
    Then I Verify "Watch" Screen in iPhone
    And I click on latest episode in iPhone
    Then I verify the fields with "You May Also Like" and "Popular Shows" in iPhone

  @iPhone_CNA_1105 @iPhone_CNA_Regression
  Scenario: Validation of video player controls on watch landing page in iPhone
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
    Then I validate the Home Screen section landing header in iPhone
    And I click on Menu in iPhone
    When I Select "Watch" from menu in iPhone
    Then I Verify "Watch" Screen in iPhone
    And I click on latest episode in iPhone
    And I validate toast message on the article page in iPhone
    Then I validate the player controls on video in iPhone
    #And I validate the player controls start time on video in iPhone
    #And I validate the player controls end time on video in iPhone
    Then I validate the player controls sound on video in iPhone
