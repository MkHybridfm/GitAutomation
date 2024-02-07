@iPad_CNA_MenuScenarios
@iPad_QA
Feature: menu scenarios

  @iPad_CNAB-975
  @iPad_CNA_0301 @Sanity_iPad
  Scenario: Validation of CNA Menu Section in iPad
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
    Then I validate the Home Screen section landing header in iPad
    When I click on Menu in iPad
    When I Verify "Downloaded Videos" from menu in iPad
    Then I Verify "Top Stories" from menu in iPad
    When I Verify "Singapore" from menu in iPad
    When I Verify "Asia" from menu in iPad
    Then I Verify "World" from menu in iPad
    Then I Verify "Commentary" from menu in iPad
    Then I Verify "Sustainability" from menu in iPad
    Then I Verify "Business" from menu in iPad
    Then I Verify "Sport" from menu in iPad
    Then I Verify "COVID-19" from menu in iPad
    Then I Verify "Latest News" from menu in iPad
    Then I Verify "Discover" from menu in iPad
    Then I Verify "CNA Insider" from menu in iPad
    Then I Verify "Watch" from menu in iPad
    When I Verify "Live TV" from menu in iPad
    When I Verify "News Reports" from menu in iPad
    When I Verify "Documentaries & Shows" from menu in iPad
    When I Verify "TV Schedule" from menu in iPad
    When I Verify "Listen" from menu in iPad
    When I Verify "CNA938 Live" from menu in iPad
    Then I Verify "Listen" from menu in iPad
    When I Verify "Podcasts" from menu in iPad
    When I Verify "Special Reports" from menu in iPad
    When I Verify "Singapore Parliament" from menu in iPad
    Then I Verify "Radio Schedule" from menu in iPad
    Then I Verify "Mental Health" from menu in iPad
    When I Verify "Interactives" from menu in iPad
    Then I Verify "World Cup" from menu in iPad
    When I Verify "CNA Eyewitness" from menu in iPad
    When I Verify "Send us a news tip" from menu in iPad
    When I Verify "Events & Partnerships" from menu in iPad
    When I Verify "Branded Content" from menu in iPad
    When I Verify "Business Blueprint" from menu in iPad
    When I Verify "Health Matters" from menu in iPad
    When I Verify "The Asian Traveller" from menu in iPad
    When I Verify "Weather" from menu in iPad

  @iPad_CNA_CNAB-928
  @iPad_CNA_0302 @iPad_CNA_Regression
  Scenario: Validation of CNA Menu Section in iPad
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
    Then I validate the Home Screen section landing header in iPad
    When I click on Menu in iPad
    When I Select "Downloaded Videos" from menu in iPad
    Then I Verify "Downloaded Videos" Screen in iPad
    When I click on back arrow in iPad
    Then I Verify "Top Stories" from menu in iPad
    When I Select "Top Stories" from menu in iPad
    Then I validate the Home Screen section landing header in iPad
    When I click on Menu in iPad
    When I Select "Latest News" from menu in iPad
    Then I Verify "Latest News" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Discover" from menu in iPad
    Then I Verify "Discover" Screen in iPad
    When I click on back arrow in iPad
    When I Select "CNA Insider" from menu in iPad
    Then I Verify "CNA Insider" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Watch" from menu in iPad
    Then I Verify "Watch" Screen in iPad
    When I click on Menu in iPad
    When I Select "Listen" from menu in iPad
    Then I Verify "Listen" Screen in iPad
    When I click on Menu in iPad
    When I Select "Special Reports" from menu in iPad
    Then I Verify "Special Reports" Screen in iPad
    When I click on Menu in iPad
    When I Select "CNA Eyewitness" from menu in iPad
    Then I Verify "CNA Eyewitness" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Events & Partnerships" from menu in iPad
    Then I Verify "Events & Partnerships" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Branded Content" from menu in iPad
    Then I Verify "Branded Content" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Weather" from menu in iPad
    Then I Verify "Weather" Screen in iPad

  @iPad_CNA_0303 @iPad_CNA_Regression
  Scenario: Validation of CNA Menu Section in iPad
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
    Then I validate the Home Screen section landing header in iPad
    When I click on Menu in iPad
    When I Select "Downloaded Videos" from menu in iPad
    Then I Verify "Downloaded Videos" Screen in iPad
    When I click on back arrow in iPad
    Then I Verify "Top Stories" from menu in iPad
    When I Select "Top Stories" from menu in iPad
    Then I validate the Home Screen section landing header in iPad
    When I click on Menu in iPad
    When I Select "Singapore" from menu in iPad
    Then I Verify "Singapore " Screen in iPad
    When I click on Menu in iPad
    When I Select "Asia" from menu in iPad
    Then I Verify "Asia" Screen in iPad
    When I click on Menu in iPad
    When I Select "World" from menu in iPad
    Then I Verify "World" Screen in iPad
    When I click on Menu in iPad
    When I Select "Commentary" from menu in iPad
    Then I Verify "Commentary" Screen in iPad
    When I click on Menu in iPad
    When I Select "Sustainability" from menu in iPad
    Then I Verify "Sustainability" Screen in iPad
    When I click on Menu in iPad
    When I Select "Business" from menu in iPad
    Then I Verify "Business" Screen in iPad
    When I click on Menu in iPad
    When I Select "Sport" from menu in iPad
    Then I Verify "Sport" Screen in iPad
    When I click on Menu in iPad
    When I Select "Latest News" from menu in iPad
    Then I Verify "Latest News" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Discover" from menu in iPad
    Then I Verify "Discover" Screen in iPad
    When I click on back arrow in iPad
    When I Select "CNA Insider" from menu in iPad
    Then I Verify "CNA Insider" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Watch" from menu in iPad
    Then I Verify "Watch" Screen in iPad
    When I click on Menu in iPad
    When I Select "Live TV" from menu in iPad
    Then I Verify "Watch" Screen in iPad
    When I click on Menu in iPad
    When I Select "News Reports" from menu in iPad
    Then I Verify "All Videos" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Documentaries & Shows" from menu in iPad
    Then I Verify "Video on Demand" Screen in iPad
    When I click on back arrow in iPad
    When I Select "TV Schedule" from menu in iPad
    Then I Verify "LIVE TV International schedule" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Listen" from menu in iPad
    Then I Verify "Listen" Screen in iPad
    When I click on Menu in iPad
    When I Select "CNA938 Live" from menu in iPad
    Then I Verify "Listen" Screen in iPad
    When I click on Menu in iPad
    When I Select "Podcasts" from menu in iPad
    Then I Verify "All Podcasts" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Special Reports" from menu in iPad
    Then I Verify "Special Reports" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Singapore Parliament" from menu in iPad
    Then I Verify "Parliament" Screen in iPad
    When I click on back arrow in iPad
    Then I Verify "Radio Schedule" from menu in iPad
    Then I Verify "Mental Health" from menu in iPad
    When I Select "Interactives" from menu in iPad
    Then I Verify "Interactives" Screen in iPad
    When I click on back arrow in iPad
    Then I Verify "World Cup" from menu in iPad
    When I Select "CNA Eyewitness" from menu in iPad
    Then I Verify "CNA Eyewitness" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Send us a news tip" from menu in iPad
    Then I Verify "CNA Eyewitness" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Events & Partnerships" from menu in iPad
    Then I Verify "Events & Partnerships" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Branded Content" from menu in iPad
    Then I Verify "Branded Content" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Business Blueprint" from menu in iPad
    Then I Verify "Business Blueprint" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Health Matters" from menu in iPad
    Then I Verify "Health Matters" Screen in iPad
    When I click on back arrow in iPad
    When I Select "The Asian Traveller" from menu in iPad
    Then I Verify "The Asian Traveller" Screen in iPad
    When I click on back arrow in iPad
    When I Select "Weather" from menu in iPad
    Then I Verify "Weather" Screen in iPad