@iPad_CNA_HomePageScenarios
@iPad_QA
Feature: HomePage scenarios

  @iPad_CNA_0701 @Sanity_iPad
  Scenario: Validate Home Page and swipe functionality on Home page in iPad
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
    When I Swipe Left to view other section on Home Page in iPad
    Then I Verify "Latest News" Section on Home Page in iPad
    When I Swipe Left to view other section on Home Page in iPad
    Then I Verify "Trending" Section on Home Page in iPad
    When I Swipe Left to view other section on Home Page in iPad
    Then I Verify "Singapore " Section on Home Page in iPad
    When I Swipe Left to view other section on Home Page in iPad
    Then I Verify "Asia" Section on Home Page in iPad
    When I Swipe Left to view other section on Home Page in iPad
    Then I Verify "Commentary" Section on Home Page in iPad
    When I Swipe Left to view other section on Home Page in iPad
    Then I Verify "Sustainability" Section on Home Page in iPad
    When I Swipe Left to view other section on Home Page in iPad
    Then I Verify "CNA Insider" Section on Home Page in iPad
    When I Swipe Right to view other section on Home Page in iPad
    Then I Verify "Sustainability" Section on Home Page in iPad
    When I Swipe Right to view other section on Home Page in iPad
    Then I Verify "Commentary" Section on Home Page in iPad
    When I Swipe Right to view other section on Home Page in iPad
    Then I Verify "Asia" Section on Home Page in iPad
    When I Swipe Right to view other section on Home Page in iPad
    Then I Verify "Singapore " Section on Home Page in iPad
    When I Swipe Right to view other section on Home Page in iPad
    Then I Verify "Trending" Section on Home Page in iPad
    When I Swipe Right to view other section on Home Page in iPad
    Then I Verify "Latest News" Section on Home Page in iPad
    When I Swipe Right to view other section on Home Page in iPad
    Then I validate the Home Screen section landing header in iPad
    When I validate swipe functionality on Home page in iPad
