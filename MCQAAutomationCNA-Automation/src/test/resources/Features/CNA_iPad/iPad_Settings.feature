@iPad_CNA_SettingsScenarios
@iPad_QA
Feature: Settings Screen scenarios
  @iPad_CNA_CNAB-953
  @iPad_CNA_0401 @Sanity_iPad
  Scenario: Verify Settings Screen for Guest User in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Do it later" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Are you sure you want to do it later?" info is displayed on "Do it later Alert - CNA OnBoarding Screen" in iPad
    Then I Verify "If you choose to exit now, your preferences will not be saved." info is displayed on "Do it later Alert - CNA OnBoarding Screen" in iPad
    Then I Verify "Yes, I’ll do it later" Button is displayed on "Do it later Alert - CNA OnBoarding Screen" in iPad
    Then I Verify "No, I’ll continue" Button is displayed on "Do it later Alert - CNA OnBoarding Screen" in iPad
    Then I Click "Yes, I’ll do it later" Button on "Do it later Alert - CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "General" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Notifications" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Display" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Edition" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Contact" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "CNA Eyewitness" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Help and feedback" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Advertise with us" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "About" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Mediacorp Digital Network" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "App version" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Channel Id" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Terms of Service" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Privacy Policy" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Log in" Button is displayed on "CNA Settings Screen" in iPad

  @iPad_CNA_CNAB-954
  @iPad_CNA_0402 @Sanity_iPad
  Scenario: Verify Settings Screen for Loged In User in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Account" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "meRewards" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Manage meconnect account" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "To change password, update your personal details or delete account" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "General" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Notifications" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Display" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Edition" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Contact" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "CNA Eyewitness" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Help and feedback" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Advertise with us" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "About" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Mediacorp Digital Network" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "App version" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Channel Id" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Terms of Service" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Privacy Policy" info is displayed on "CNA Settings Screen" in iPad
    Then I Verify "Log out" Button is displayed on "CNA Settings Screen" in iPad

  @iPad_CNA_0403 @Sanity_iPad
  Scenario: Verify Loged In User Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Account" info is displayed on "CNA Settings Screen" in iPad
    And I Verify Loged In User Details in iPad
    When I Click "Log out" Button on "CNA Settings Screen" in iPad
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPad
    When I Select OK from Logout Popup in iPad

  @iPad_CNA_CNAB-955
  @iPad_CNA_0404 @Sanity_iPad
  Scenario: Verify meRewards Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "meRewards" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "meRewards" on "CNA Settings Screen" in iPad
    Then I Verify Navigation Bar "meRewards" info is visible on "meRewards CNA Settings Screen" in iPad
    Then I Verify "CashBack:" info is displayed on "meRewards CNA Settings Screen" in iPad
    Then I Verify "Coupons:" info is displayed on "meRewards CNA Settings Screen" in iPad
    Then I Verify "Surveys:" info is displayed on "meRewards CNA Settings Screen" in iPad
    And I Click Back Button on "meRewards" in iPad
    When I Click "Log out" Button on "CNA Settings Screen" in iPad
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPad
    When I Select OK from Logout Popup in iPad

  @iPad_CNA_CNAB-956
  @iPad_CNA_0405 @Sanity_iPad
  Scenario: Verify Manage meconnect account under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Manage meconnect account" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "Manage meconnect account" on "CNA Settings Screen" in iPad
    Then I Verify "Do you want to change password, update personal details and more?" info is displayed on "Manage meconnect account - Popup" in iPad
    Then I Verify "No" Button is displayed on "Manage meconnect account - Popup" in iPad
    Then I Verify "Yes" Button is displayed on "Manage meconnect account - Popup" in iPad
    Then I Click "Yes" Button on "Manage meconnect account - Popup" in iPad
    When I wait sometime for load webpage in iPad
    Then I Verify "PROFILE" info is displayed on "Manage meconnect account - Web Page" in iPad
    Then I Verify "Welcome" info is displayed on "Manage meconnect account - Web Page" in iPad
    Then I Verify "What would you like to do today?" info is displayed on "Manage meconnect account - Web Page" in iPad
    Then I Verify "DELETE ACCOUNT" info is displayed on "Manage meconnect account - Web Page" in iPad

  @iPad_CNA_CNAB-957
  @iPad_CNA_0406 @Sanity_iPad
  Scenario: Verify Notifications Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Notifications" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "Notifications" on "CNA Settings Screen" in iPad
    Then I Verify Navigation Bar "Notifications" info is visible on "Notifications CNA Settings Screen" in iPad
    Then I Verify "Alerts" info is displayed on "Notifications CNA Settings Screen" in iPad
    Then I Verify "Receive push notifications for breaking news and exclusive stories." info is displayed on "Notifications CNA Settings Screen" in iPad
    And I Verify "Receive push notifications for breaking news and exclusive stories." Alert Option in Notification Screen from Settings in iPad
    When I Select "Receive push notifications for breaking news and exclusive stories." Alert Option as "ON" in Notification Screen from Settings in iPad
    Then I Verify "Receive push notifications for breaking news and exclusive stories." Alert Option as "ON" in Notification Screen from Settings in iPad
    Then I Verify "Alert me on:" info is displayed on "Notifications CNA Settings Screen" in iPad
    Then I Verify "Asia" info is displayed on "Notifications CNA Settings Screen" in iPad
    And I Verify "Asia" Alert Option in Notification Screen from Settings in iPad
    When I Select "Asia" Alert Option as "OFF" in Notification Screen from Settings in iPad
    Then I Verify "Asia" Alert Option as "OFF" in Notification Screen from Settings in iPad
    When I Select "Asia" Alert Option as "ON" in Notification Screen from Settings in iPad
    Then I Verify "Asia" Alert Option as "ON" in Notification Screen from Settings in iPad
    Then I Verify "Singapore" info is displayed on "Notifications CNA Settings Screen" in iPad
    And I Verify "Singapore" Alert Option in Notification Screen from Settings in iPad
    When I Select "Singapore" Alert Option as "OFF" in Notification Screen from Settings in iPad
    Then I Verify "Singapore" Alert Option as "OFF" in Notification Screen from Settings in iPad
    When I Select "Singapore" Alert Option as "ON" in Notification Screen from Settings in iPad
    Then I Verify "Singapore" Alert Option as "ON" in Notification Screen from Settings in iPad
    Then I Verify "World" info is displayed on "Notifications CNA Settings Screen" in iPad
    And I Verify "World" Alert Option in Notification Screen from Settings in iPad
    When I Select "World" Alert Option as "OFF" in Notification Screen from Settings in iPad
    Then I Verify "World" Alert Option as "OFF" in Notification Screen from Settings in iPad
    When I Select "World" Alert Option as "ON" in Notification Screen from Settings in iPad
    Then I Verify "World" Alert Option as "ON" in Notification Screen from Settings in iPad
    And I Click Back Button on "Notifications" in iPad
    When I Click "Log out" Button on "CNA Settings Screen" in iPad
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPad
    When I Select OK from Logout Popup in iPad

  @iPad_CNA_CNAB-958
  @iPad_CNA_0407 @Sanity_iPad
  Scenario: Verify Display Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Display" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "Display" on "CNA Settings Screen" in iPad
    Then I Verify Navigation Bar "Display" info is visible on "Display CNA Settings Screen" in iPad
    Then I Verify "Text size" info is displayed on "Display CNA Settings Screen" in iPad
    And I Verify Text Size Option in Display Screen in iPad
    Then I Verify "Select a default text size to display." info is displayed on "Display CNA Settings Screen" in iPad
    Then I Verify "Sample text:" info is displayed on "Display CNA Settings Screen" in iPad
    Then I Verify "This is how the text will look as you read our stories." info is displayed on "Display CNA Settings Screen" in iPad
    Then I Verify "Video autoplay" info is displayed on "Display CNA Settings Screen" in iPad
    And I Verify "Never" Option in "Video autoplay" under Display Screen from Settings in iPad
    And I Verify "Only on Wi-Fi" Option in "Video autoplay" under Display Screen from Settings in iPad
    And I Verify "Always" Option in "Video autoplay" under Display Screen from Settings in iPad
    Then I Verify "Theme" info is displayed on "Display CNA Settings Screen" in iPad
    And I Verify "System Default" Option in "Theme" under Display Screen from Settings in iPad
    And I Verify "Light" Option in "Theme" under Display Screen from Settings in iPad
    And I Verify "Dark" Option in "Theme" under Display Screen from Settings in iPad
    And I Click Back Button on "Display" in iPad
    When I Click "Log out" Button on "CNA Settings Screen" in iPad
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPad
    When I Select OK from Logout Popup in iPad

  @iPad_CNA_0408 @Sanity_iPad
  Scenario: Verify Edition Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Edition" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "Edition" on "CNA Settings Screen" in iPad
    Then I Verify Navigation Bar "Edition" info is visible on "Edition - CNA Settings Screen" in iPad
    Then I Verify "Edition" info is displayed on "Edition - CNA Settings Screen" in iPad
    Then I Verify "Asia" info is displayed on "Edition - CNA Settings Screen" in iPad
    Then I Verify "Singapore" info is displayed on "Edition - CNA Settings Screen" in iPad
    Then I Click "Asia" on "Edition - CNA Settings Screen" in iPad
    Then I Click "Singapore" on "Edition - CNA Settings Screen" in iPad
    And I Click Back Button on "Display" in iPad
    When I Click "Log out" Button on "CNA Settings Screen" in iPad
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPad
    When I Select OK from Logout Popup in iPad

  @iPad_CNA_CNAB-959
  @iPad_CNA_0409 @Sanity_iPad
  Scenario: Verify CNA Eyewitness Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "CNA Eyewitness" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "CNA Eyewitness" on "CNA Settings Screen" in iPad
    Then I Verify Navigation Bar "CNA Eyewitness" info is visible on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "See something newsworthy? Get in touch with CNA and send us your photos or videos through the form below." info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "FACEBOOK" Button is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "TWITTER" Button is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "Whatsapp" Button is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "telegram" Button is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "WEB" Button is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "FACEBOOK" Button is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "FACEBOOK" Button is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "Submit Your News Tip" info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "What did you see?" info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "Upload your photos or videos" info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "Attached files should not exceed 250mb each." info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "I took the photos and videos submitted." info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "How do we address you?" info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "How do we contact you?" info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "Where did you see it?" info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "Find my location" Button is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "When did you see it?" info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "How would you like to be credited in our news reports?" info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "Use my name" info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "Anonymous" info is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    Then I Verify "Submit my news tip" Button is displayed on "CNA Eyewitness CNA Settings Screen" in iPad
    And I Click Back Button on "CNA Eyewitness" in iPad
    When I Click "Log out" Button on "CNA Settings Screen" in iPad
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPad
    When I Select OK from Logout Popup in iPad

  @iPad_CNA_CNAB-960
  @iPad_CNA_0410 @Sanity_iPad
  Scenario: Verify Help and feedback Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Help and feedback" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "Help and feedback" on "CNA Settings Screen" in iPad
    Then I wait sometime for load webpage in iPad
    Then I Verify "Contact Us" info is displayed on "CNA Help and feedback Screen" in iPad
    Then I Verify "Contact Information" info is displayed on "CNA Help and feedback Screen" in iPad
    Then I Verify "First name" info is displayed on "CNA Help and feedback Screen" in iPad
    Then I Verify "Last name" info is displayed on "CNA Help and feedback Screen" in iPad
    Then I Verify "Contact Number" info is displayed on "CNA Help and feedback Screen" in iPad
    Then I Verify "Email Address" info is displayed on "CNA Help and feedback Screen" in iPad
    Then I Verify "Type of Query" info is displayed on "CNA Help and feedback Screen" in iPad
    Then I Verify "Subject" info is displayed on "CNA Help and feedback Screen" in iPad
    Then I Verify "Comments" info is displayed on "CNA Help and feedback Screen" in iPad
    Then I Verify "Submit my feedback" Button is displayed on "CNA Help and feedback Screen" in iPad
    Then I Verify "Done" Button is displayed on "CNA Help and feedback Screen" in iPad

  @iPad_CNA_CNAB-961
  @iPad_CNA_0411 @Sanity_iPad
  Scenario: Verify Advertise with us Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Advertise with us" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "Advertise with us" on "CNA Settings Screen" in iPad
    Then I wait sometime for load webpage in iPad
    And I Verify "Advertise With Us" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "One of the most popular and comprehensive news sites in Singapore and is most sought after by advertisers." info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Benefit from our trusted reputation on the website and different platforms which provides rich video content and real-time updates." info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Ad Type" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Online Advertising - Ad Options" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Banner Ads" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Leaderboard" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Interactive Marketing Unit (IMU)" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Newsletter Banners" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Microsites" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "TV Advertising" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Contact Sales" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Sales Hotline" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "General Advertising Sales Enquiry" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Distribution of CNA" info is displayed on "CNA - Advertise with us - Screen" in iPad
    And I Verify "Terms and Conditions" info is displayed on "CNA - Advertise with us - Screen" in iPad
    Then I Verify "Done" Button is displayed on "CNA - Advertise with us - Screen" in iPad

  @iPad_CNA_CNAB-962
  @iPad_CNA_0412 @Sanity_iPad
  Scenario: Verify Mediacorp Digital Network Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Mediacorp Digital Network" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "Mediacorp Digital Network" on "CNA Settings Screen" in iPad
    Then I wait sometime for load webpage in iPad
    And I Verify "Best News Website or Mobile Service" info is displayed on "CNA Mediacorp Digital Network Screen" in iPad
    And I Verify "Digital Media Awards Worldwide" info is displayed on "CNA Mediacorp Digital Network Screen" in iPad
    And I Verify "Top Stories" info is displayed on "CNA Mediacorp Digital Network Screen" in iPad
    And I Verify "Latest News" info is displayed on "CNA Mediacorp Digital Network Screen" in iPad
    And I Verify "Discover" info is displayed on "CNA Mediacorp Digital Network Screen" in iPad
    And I Verify "Singapore" info is displayed on "CNA Mediacorp Digital Network Screen" in iPad
    And I Verify "Mediacorp O&O Platforms" info is displayed on "CNA Mediacorp Digital Network Screen" in iPad
    And I Verify "Mediacorp Partner Network" info is displayed on "CNA Mediacorp Digital Network Screen" in iPad
    Then I Verify "Done" Button is displayed on "CNA Mediacorp Digital Network Screen" in iPad

  @iPad_CNA_CNAB-963
  @iPad_CNA_0413 @Sanity_iPad
  Scenario: Verify App version Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "App version" info is displayed on "CNA Settings Screen" in iPad
    And I Verify the CNA App Version Details in iPad
    When I Click "Log out" Button on "CNA Settings Screen" in iPad
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPad
    When I Select OK from Logout Popup in iPad

  @iPad_CNA_CNAB-964
  @iPad_CNA_0414 @Sanity_iPad
  Scenario: Verify Channel ID  Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Channel Id" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "Channel Id" on "CNA Settings Screen" in iPad
    Then I Verify the Channel ID Popup details in iPad
    Then I Verify "Cancel" Button is displayed on "Channel ID- Popup" in iPad
    Then I Verify "Copy" Button is displayed on "Channel ID- Popup" in iPad
    Then I Click "Cancel" Button on "Channel ID- Popup" in iPad
    When I Click "Log out" Button on "CNA Settings Screen" in iPad
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPad
    When I Select OK from Logout Popup in iPad

  @iPad_CNA_CNAB-965
  @iPad_CNA_0415 @Sanity_iPad
  Scenario: Verify Terms of Service Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Terms of Service" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "Terms of Service" on "CNA Settings Screen" in iPad
    Then I wait sometime for load webpage in iPad
    Then I Verify Terms of Service Screen opened in web view in iPad
    Then I Verify "Done" Button is displayed on "CNA Mediacorp Digital Network Screen" in iPad

  @iPad_CNA_CNAB-966
  @iPad_CNA_0416 @Sanity_iPad
  Scenario: Verify Privacy Policy Details under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Privacy Policy" info is displayed on "CNA Settings Screen" in iPad
    Then I Click "Privacy Policy" on "CNA Settings Screen" in iPad
    Then I wait sometime for load webpage in iPad
    Then I Verify "PRIVACY POLICY" info is displayed on "CNA Privacy Policy Screen" in iPad
    And I Verify "Mediacorp respects your privacy. This document outlines our privacy policy for the Mediacorp group of companies." info is displayed on "CNA Privacy Policy Screen" in iPad
    And I Verify "What this Privacy Policy covers" info is displayed on "CNA Privacy Policy Screen" in iPad
    Then I Verify "Done" Button is displayed on "CNA Mediacorp Digital Network Screen" in iPad

  @iPad_CNA_CNAB-967
  @iPad_CNA_0417 @Sanity_iPad
  Scenario: Verify Logout under Settings Screen in iPad
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "logo-cna-new" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Tell us what you like and we will recommend content to you based on your preferences." info is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Get Started" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Do it later" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Click "Get Started" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Please select at least one topic." info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    When I Select Trending Topics in iPad
    Then I Verify "More Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "I want to follow news on:" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Save Preferences" Button on "OnBoarding Save Preferences Screen" in iPad
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPad
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "OnBoarding Save Preferences Screen" in iPad
    Then I Verify "Back" Button is displayed on "CNA OnBoarding Screen" in iPad
    Then I Verify "Sign In" Button is displayed on "CNA OnBoarding Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    When I Click "Sign In" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_notification" Image is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Stay In The Loop" info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Enable notifications so that we can keep you updated on the latest stories, videos and podcasts." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "These notifications can be configured under Settings at any time." info is displayed on "Manage Notifications Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Keep CNA Free" info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences." info is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "Manage Tracking" Button is displayed on "Manage Tracking Screen" in iPad
    Then I Verify "By tapping this, you are granting the CNA app permission to track your activity." info is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I Click "settings" Button on "CNA Screen" in iPad
    Then I Verify Navigation Bar "Settings" info is visible on "CNA Settings Screen" in iPad
    Then I Verify "Log out" Button is displayed on "Manage Tracking Screen" in iPad
    When I Click "Log out" Button on "CNA Settings Screen" in iPad
    Then I Verify "Are you sure you want to log out?" info is displayed on "CNA Settings Screen" in iPad
    When I Select OK from Logout Popup in iPad
