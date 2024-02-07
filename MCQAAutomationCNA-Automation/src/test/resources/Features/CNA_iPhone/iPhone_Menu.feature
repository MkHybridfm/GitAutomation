@iPhone_CNA_MenuScenarios
@iPhone_QA
Feature: menu scenarios
  @iPhone_CNAB-975
  @iPhone_CNA_0301 @iPhone_CNA_Sanity @reio
  Scenario: Validation of CNA Menu Section in iPhone
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
    When I click on Menu in iPhone
    When I Verify "Downloaded Videos" from menu in iPhone
    Then I Verify "Top Stories" from menu in iPhone
    When I Verify "Singapore" from menu in iPhone
    When I Verify "Asia" from menu in iPhone
    Then I Verify "World" from menu in iPhone
    Then I Verify "Commentary" from menu in iPhone
    Then I Verify "Sustainability" from menu in iPhone
    Then I Verify "Business" from menu in iPhone
    Then I Verify "Sport" from menu in iPhone
#    Then I Verify "COVID-19" from menu in iPhone
    Then I Verify "Latest News" from menu in iPhone
    Then I Verify "Discover" from menu in iPhone
    Then I Verify "CNA Insider" from menu in iPhone
    Then I Verify "Watch" from menu in iPhone
    When I Verify "Live TV" from menu in iPhone
    When I Verify "News Reports" from menu in iPhone
    When I Verify "Documentaries & Shows" from menu in iPhone
    When I Verify "TV Schedule" from menu in iPhone
    When I Verify "Listen" from menu in iPhone
    When I Verify "CNA938 Live" from menu in iPhone
    Then I Verify "Listen" from menu in iPhone
    When I Verify "Podcasts" from menu in iPhone
    When I Verify "Special Reports" from menu in iPhone
    When I Verify "Singapore Parliament" from menu in iPhone
    Then I Verify "Radio Schedule" from menu in iPhone
    Then I Verify "Mental Health" from menu in iPhone
    When I Verify "Interactives" from menu in iPhone
    #Then I Verify "World Cup" from menu in iPhone
    When I Verify "CNA Eyewitness" from menu in iPhone
    When I Verify "Send us a news tip" from menu in iPhone
    When I Verify "Events & Partnerships" from menu in iPhone
    When I Verify "Branded Content" from menu in iPhone
    When I Verify "Business Blueprint" from menu in iPhone
    When I Verify "Health Matters" from menu in iPhone
    When I Verify "The Asian Traveller" from menu in iPhone
    When I Verify "Weather" from menu in iPhone

  @iPhone_CNA_CNAB-928
  @iPhone_CNA_0302 @iPhone_CNA_Sanity1
  Scenario: Validation of CNA Menu Section in iPhone
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
    When I click on Menu in iPhone
    When I Select "Downloaded Videos" from menu in iPhone
    Then I Verify "Downloaded Videos" Screen in iPhone
    When I click on back arrow in iPhone
    Then I Verify "Top Stories" from menu in iPhone
    When I Select "Top Stories" from menu in iPhone
    Then I validate the Home Screen section landing header in iPhone
    When I click on Menu in iPhone
    When I Select "Latest News" from menu in iPhone
    Then I Verify "Latest News" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Discover" from menu in iPhone
    Then I Verify "Discover" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "CNA Insider" from menu in iPhone
    Then I Verify "CNA Insider" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Watch" from menu in iPhone
    Then I Verify "Watch" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "Listen" from menu in iPhone
    Then I Verify "Listen" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "Special Reports" from menu in iPhone
    Then I Verify "Special Reports" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "CNA Eyewitness" from menu in iPhone
    Then I Verify "CNA Eyewitness" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Events & Partnerships" from menu in iPhone
    Then I Verify "Events & Partnerships" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Branded Content" from menu in iPhone
    Then I Verify "Branded Content" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Weather" from menu in iPhone
    Then I Verify "Weather" Screen in iPhone

  @iPhone_CNA_0303 @iPhone_CNA_Regression
  Scenario: Validation of CNA Menu Section in iPhone
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
    When I click on Menu in iPhone
    When I Select "Downloaded Videos" from menu in iPhone
    Then I Verify "Downloaded Videos" Screen in iPhone
    When I click on back arrow in iPhone
    Then I Verify "Top Stories" from menu in iPhone
    When I Select "Top Stories" from menu in iPhone
    Then I validate the Home Screen section landing header in iPhone
    When I click on Menu in iPhone
    When I Select "Singapore" from menu in iPhone
    Then I Verify "Singapore " Screen in iPhone
    When I click on Menu in iPhone
    When I Select "Asia" from menu in iPhone
    Then I Verify "Asia" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "World" from menu in iPhone
    Then I Verify "World" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "Commentary" from menu in iPhone
    Then I Verify "Commentary" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "Sustainability" from menu in iPhone
    Then I Verify "Sustainability" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "Business" from menu in iPhone
    Then I Verify "Business" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "Sport" from menu in iPhone
    Then I Verify "Sport" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "Latest News" from menu in iPhone
    Then I Verify "Latest News" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Discover" from menu in iPhone
    Then I Verify "Discover" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "CNA Insider" from menu in iPhone
    Then I Verify "CNA Insider" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Watch" from menu in iPhone
    Then I Verify "Watch" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "Live TV" from menu in iPhone
    Then I Verify "Watch" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "News Reports" from menu in iPhone
    Then I Verify "All Videos" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Documentaries & Shows" from menu in iPhone
    Then I Verify "Video on Demand" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "TV Schedule" from menu in iPhone
    Then I Verify "LIVE TV International schedule" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Listen" from menu in iPhone
    Then I Verify "Listen" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "CNA938 Live" from menu in iPhone
    Then I Verify "Listen" Screen in iPhone
    When I click on Menu in iPhone
    When I Select "Podcasts" from menu in iPhone
    Then I Verify "All Podcasts" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Special Reports" from menu in iPhone
    Then I Verify "Special Reports" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Singapore Parliament" from menu in iPhone
    Then I Verify "Parliament" Screen in iPhone
    When I click on back arrow in iPhone
    Then I Verify "Radio Schedule" from menu in iPhone
    Then I Verify "Mental Health" from menu in iPhone
    When I Select "Interactives" from menu in iPhone
    Then I Verify "Interactives" Screen in iPhone
    When I click on back arrow in iPhone
    #Then I Verify "World Cup" from menu in iPhone
    When I Select "CNA Eyewitness" from menu in iPhone
    Then I Verify "CNA Eyewitness" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Send us a news tip" from menu in iPhone
    Then I Verify "CNA Eyewitness" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Events & Partnerships" from menu in iPhone
    Then I Verify "Events & Partnerships" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Branded Content" from menu in iPhone
    Then I Verify "Branded Content" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Business Blueprint" from menu in iPhone
    Then I Verify "Business Blueprint" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Health Matters" from menu in iPhone
    Then I Verify "Health Matters" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "The Asian Traveller" from menu in iPhone
    Then I Verify "The Asian Traveller" Screen in iPhone
    When I click on back arrow in iPhone
    When I Select "Weather" from menu in iPhone
    Then I Verify "Weather" Screen in iPhone


