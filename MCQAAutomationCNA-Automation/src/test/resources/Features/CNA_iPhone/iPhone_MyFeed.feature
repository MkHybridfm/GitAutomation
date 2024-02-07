@iPhone_CNA_MyFeedScenarios
@iPhone_QA
Feature: myFeed scenarios

  @iPhone_CNA_1301 @iPhone_CNA_Sanity @rep
  Scenario: Validation of my feed with Preferences Do it later for logged user in iPhone
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
    Then I validate the Home Screen section landing header in iPhone
    Then I click on my feed section in iPhone
    Then I Verify "My Feed" Screen in iPhone
    Then I Verify the Search Button in iPhone
    Then I Verify the Settings Icon in iPhone
    Then I Verify "Set up your personal news feed by telling us what interests you" info is displayed on "My Feed" in iPhone
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPhone
    When I Select Trending Topics in iPhone
    Then I Verify "More Topics" info is displayed on "My Feed Screen" in iPhone
    Then I Verify "I want to follow news on:" info is displayed on "My Feed Screen" in iPhone
    When I Select More Topics in iPhone
    Then I Click "Save Preferences" on "My Feed Screen" in iPhone
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPhone
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPhone
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPhone
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA Login Screen" in iPhone
    Then I Verify "Back" Button is displayed on "CNA Login Screen" in iPhone
    Then I Verify "Sign In" Button is displayed on "CNA Login Screen" in iPhone
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPhone
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPhone
   Then I click on login in iPhone
    When I wait sometime for refresh the screen in iPhone
    Then I Verify "Filter" info in My Feed Screen in iPhone
    Then I Verify the List of Feed in My Feed Screen in iPhone
    When I Click on three dots in Feed in My Feed Screen in iPhone
    Then I validate the bookmark options in iPhone
    Then I validate the share options in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    When I Reset My Topic List in Manage Feed Screen in iPhone
    When I Click on Save Preference in iPad
    When I Select Trending Topics in iPhone
    When I Click on Save Preference in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    Then I Verify "Manage Feed" Screen in iPhone
    Then I Verify "My Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify "Add Topics" Tab in Manage Feed Screen in iPhone
    When I Click "Add Topics" Tab in Manage Feed Screen in iPhone
    When I Click "My Topics" Tab in Manage Feed Screen in iPhone
    #Then I Verify My Topic List in Manage Feed Screen in iPhone
    When I Click "Add Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify "Trending Topics" info in Manage Feed Screen in iPhone
    Then I Verify "More Topics" info in Manage Feed Screen in iPhone
    When I Select Trending Topics in iPhone
    When I Select More Topics in iPhone
    When I Click on Save Preference in iPhone
    Then I Verify "My Feed" Screen in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    Then I Verify "Manage Feed" Screen in iPhone
    Then I Verify "My Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify New Topic is Added under My Topics Tab in Manage Feed Screen in iPhone
    When I Click on Save Preference in iPhone
    Then I Verify New Topic is Displayed in My Feed Screen in iPhone

  @iPhone_CNA_1302 @iPhone_CNA_Sanity
  Scenario: Validation of my feed with Preferences Get Started for logged user in IOS App
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
    When I Select More Topics in iPhone
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
    Then I click on my feed section in iPhone
    Then I Verify "My Feed" Screen in iPhone
    Then I Verify Manage Feed Button My Feed Screen in iPhone
    Then I Verify the Search Button in iPhone
    Then I Verify the Settings Icon in iPhone
    Then I Verify "Filter" info in My Feed Screen in iPhone
    Then I Verify the List of Feed in My Feed Screen in iPhone
    When I Click on three dots in Feed in My Feed Screen in iPhone
    Then I validate the bookmark options in iPhone
    Then I validate the share options in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    When I Reset My Topic List in Manage Feed Screen in iPhone
    When I Click on Save Preference in iPad
    When I Select Trending Topics in iPhone
    When I Click on Save Preference in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    Then I Verify "Manage Feed" Screen in iPhone
    Then I Verify "My Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify "Add Topics" Tab in Manage Feed Screen in iPhone
    When I Click "Add Topics" Tab in Manage Feed Screen in iPhone
    When I Click "My Topics" Tab in Manage Feed Screen in iPhone
   # Then I Verify My Topic List in Manage Feed Screen in iPhone
    When I Click "Add Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify "Trending Topics" info in Manage Feed Screen in iPhone
    Then I Verify "More Topics" info in Manage Feed Screen in iPhone
    When I Select Trending Topics in iPhone
    When I Select More Topics in iPhone
    When I Click on Save Preference in iPhone
    Then I Verify "My Feed" Screen in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    Then I Verify "Manage Feed" Screen in iPhone
    Then I Verify "My Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify New Topic is Added under My Topics Tab in Manage Feed Screen in iPhone
    When I Click on Save Preference in iPhone
    Then I Verify New Topic is Displayed in My Feed Screen in iPhone

  @iPhone_CNA_1303 @iPhone_CNA_Sanity
  Scenario: Validation of Create My Feed - Home Screen for un logged user in iPhone
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
    Then I validate the Home Screen section landing header in iPhone
    Then I Verify "Topics" info is displayed on "CNA Home Screen" in iPhone
    Then I Verify "Add topics to create your personal news feed." info is displayed on "CNA Home Screen" in iPhone
    Then I Verify "Create My Feed" Button is displayed on "CNA Home Screen" in iPhone
    Then I Verify "View More Topics" Button is displayed on "CNA Home Screen" in iPhone
    Then I Verify List of Topics for My Feed in Home Screen in iPhone
    When I Select List of Topics for My Feed under Home Screen in iPhone
    When I Click on Create My Feed Button in Home Screen in iPhone
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPhone
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPhone
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPhone
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA Login Screen" in iPhone
    Then I Verify "Back" Button is displayed on "CNA Login Screen" in iPhone
    Then I Verify "Sign In" Button is displayed on "CNA Login Screen" in iPhone
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPhone
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPhone
   Then I click on login in iPhone
    When I wait sometime for refresh the screen in iPhone
    Then I Verify "Filter" info in My Feed Screen in iPhone
    Then I Verify the List of Feed in My Feed Screen in iPhone
    When I Click on three dots in Feed in My Feed Screen in iPhone
    Then I validate the bookmark options in iPhone
    Then I validate the share options in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    Then I Verify "Manage Feed" Screen in iPhone
    Then I Verify "My Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify "Add Topics" Tab in Manage Feed Screen in iPhone
    When I Click "Add Topics" Tab in Manage Feed Screen in iPhone
    When I Click "My Topics" Tab in Manage Feed Screen in iPhone
   # Then I Verify My Topic List in Manage Feed Screen in iPhone
    When I Click "Add Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify "Trending Topics" info in Manage Feed Screen in iPhone
    Then I Verify "More Topics" info in Manage Feed Screen in iPhone
    When I Select Trending Topics in iPhone
    When I Select More Topics in iPhone
    When I Click on Save Preference in iPhone
    Then I Verify "My Feed" Screen in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    Then I Verify "Manage Feed" Screen in iPhone
    Then I Verify "My Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify New Topic is Added under My Topics Tab in Manage Feed Screen in iPhone
    When I Click on Save Preference in iPhone
    Then I Verify New Topic is Displayed in My Feed Screen in iPhone

  @iPhone_CNA_1304 @iPhone_CNA_Sanity
  Scenario: Validation of my feed for un logged user in iPhone
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
    Then I validate the Home Screen section landing header in iPhone
    Then I Verify "Topics" info is displayed on "CNA Home Screen" in iPhone
    Then I Verify "Add topics to create your personal news feed." info is displayed on "CNA Home Screen" in iPhone
    Then I Verify "Create My Feed" Button is displayed on "CNA Home Screen" in iPhone
    Then I Verify "View More Topics" Button is displayed on "CNA Home Screen" in iPhone
    Then I Click "View More Topics" Button on "CNA Home Screen" in iPhone
    Then I Verify "My Feed" Screen in iPhone
    Then I Verify the Search Button in iPhone
    Then I Verify the Settings Icon in iPhone
    Then I Verify "Set up your personal news feed by telling us what interests you" info is displayed on "My Feed" in iPhone
    Then I Verify "Trending Topics" info is displayed on "OnBoarding Save Preferences Screen" in iPhone
    When I Select Trending Topics in iPhone
    Then I Verify "More Topics" info is displayed on "My Feed Screen" in iPhone
    Then I Verify "I want to follow news on:" info is displayed on "My Feed Screen" in iPhone
    When I Select More Topics in iPhone
    Then I Click "Save Preferences" on "My Feed Screen" in iPhone
    Then I Click "Sign in with meconnect" Button on "CNA Login Screen" in iPhone
    Then I Verify "cna-logo" Image is displayed on "Sign in with meconnect Screen" in iPhone
    Then I Verify "meconnect-logo" Image is displayed on "Sign in with meconnect Screen" in iPhone
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA Login Screen" in iPhone
    Then I Verify "Back" Button is displayed on "CNA Login Screen" in iPhone
    Then I Verify "Sign In" Button is displayed on "CNA Login Screen" in iPhone
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPhone
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPhone
   Then I click on login in iPhone
    When I wait sometime for refresh the screen in iPhone
    Then I Verify "Filter" info in My Feed Screen in iPhone
    Then I Verify the List of Feed in My Feed Screen in iPhone
    When I Click on three dots in Feed in My Feed Screen in iPhone
    Then I validate the bookmark options in iPhone
    Then I validate the share options in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    When I Reset My Topic List in Manage Feed Screen in iPhone
    When I Click on Save Preference in iPad
    When I Select Trending Topics in iPhone
    When I Click on Save Preference in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    Then I Verify "Manage Feed" Screen in iPhone
    Then I Verify "My Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify "Add Topics" Tab in Manage Feed Screen in iPhone
    When I Click "Add Topics" Tab in Manage Feed Screen in iPhone
    When I Click "My Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify My Topic List in Manage Feed Screen in iPhone
    When I Click "Add Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify "Trending Topics" info in Manage Feed Screen in iPhone
    Then I Verify "More Topics" info in Manage Feed Screen in iPhone
    When I Select Trending Topics in iPhone
    When I Select More Topics in iPhone
    When I Click on Save Preference in iPhone
    Then I Verify "My Feed" Screen in iPhone
    When I Click on Manage Feed Button My Feed Screen in iPhone
    Then I Verify "Manage Feed" Screen in iPhone
    Then I Verify "My Topics" Tab in Manage Feed Screen in iPhone
    Then I Verify New Topic is Added under My Topics Tab in Manage Feed Screen in iPhone
    When I Click on Save Preference in iPhone
    Then I Verify New Topic is Displayed in My Feed Screen in iPhone