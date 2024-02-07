@iPhone_CNA_ListenScenarios
@iPhone_QA
Feature: Listen scenarios

  @iPhone_CNAB-945 @iPhone_CNAB-944 @iPhone_CNAB-942 @iPhone_CNAB-941 @iPhone_CNAB-940
  @iPhone_CNA_1001 @iPhone_CNA_Sanity
  Scenario: Verify Listen landing page in iPhone
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
    When I Select "Listen" from Bottom Tab in iPhone
    When I wait sometime for refresh the screen in iPhone
    Then I Verify "Listen" Screen in iPhone
    Then I Verify "search" Button is displayed on "Listen Screen" in iPhone
    Then I Verify "settings" Button is displayed on "Listen Screen" in iPhone
    Then I Verify "Listen now" Button is displayed on "Listen Screen" in iPhone
    Then I Verify List of Podcast in Listen Screen in iPhone
    #Then I validate the live content on the listen page in iPhone
    And I click on view full schedule link in iPhone
    Then I validate the schedule page in web view in iPhone
    Then I Verify "Monday" info is displayed on "View Full Schedule - Listen Screen" in iPhone
    Then I Verify "Tuesday" info is displayed on "View Full Schedule - Listen Screen" in iPhone
    Then I Verify "Wednesday" info is displayed on "View Full Schedule - Listen Screen" in iPhone
    Then I Verify "Thursday" info is displayed on "View Full Schedule - Listen Screen" in iPhone
    Then I Verify "Friday" info is displayed on "View Full Schedule - Listen Screen" in iPhone
    Then I Verify "Saturday" info is displayed on "View Full Schedule - Listen Screen" in iPhone
    Then I Verify "Sunday" info is displayed on "View Full Schedule - Listen Screen" in iPhone
    Then I Verify "Morning 6:00am - 12:00pm" info is displayed on "View Full Schedule - Listen Screen" in iPhone
    And I click on back arrow in iPhone
    Then I click on three dots on listen page in iPhone
    Then I validate the bookmark options in iPhone
    Then I validate the share options in iPhone
    Then I click on three dots on listen page in iPhone
    When I Click "CNA Headline News" on "Article on listen page" in iPhone
    #And I click on article on listen page in iPhone
    Then I Verify "Latest Episodes" info is displayed on "Listen Screen" in iPhone
    Then I Verify List of Latest Episode in iPhone
    And I Select one Podcast to play in iPhone
    When I play the podcast in iPhone
    Then I Verify Podcast Player Podcast Details in iPhone
    Then I Verify Podcast Player Pause Button in iPhone
    Then I Verify Podcast Player Rewind Button in iPhone
    Then I Verify Podcast Player Forward Button in iPhone
    Then I Verify Podcast Player Slider in iPhone
    Then I Verify Podcast Player Start Time in iPhone
    Then I Verify Podcast Player End Time in iPhone
    When I Close Podcast Player in iPhone