@BookmarkScenarios_CNA_iPad @BookmarkScenarios_lifeStyle_iPad @BookmarkScenarios_Luxury_iPad
Feature: Bookmark scenarios iPad

  @CNA_iPad_Bookmark01 @CNA_iPad_Bookmark02 @CNA_iPad_Bookmark04  @Sanity_iPad  @Sanity_iPad
  Scenario: Validation article and toast message from section landing page in iOS App
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    And I Click "Get Started" Button on "CNA Onboarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in iPad
    When I Select Trending Topics in iPad
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in iPad
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in iPad
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    And I Click "Sign In" Button on "CNA SignIn Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I validate the Home Screen section landing header in iPad
    And I Click "icon menu grey" Button on "Bookmark Page- Three Dots" in iPad
    And I Click "Bookmark" Button on "Bookmark Page- Bookmarked article" in iPad
    Then I Verify "Added to your bookmarks." info is displayed on "Bookmarks screen- Add Bookmark Message" in iPad
    Then I Click "icon settings" Button on "CNA Home Screen" in iPad
    Then I Verify "Bookmarks" info is displayed on "Settings screen" in iPad
    And I Click "Bookmarks" on "Settings Screen" in iPad
    Then I Verify "Bookmarks" info is displayed on "Bookmarks Header - Bookmark Page" in iPad
    Then I validate if Bookmarked articles list is displayed in Bookmarks Page in iPad


  @CNA_iPad_Bookmark03 @CNA_iPad_Bookmark05 @CNA_iPad_Bookmark10  @Sanity_iPad  @Sanity_iPad
  Scenario: Validation article detail page from Bookmarks Page
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    And I Click "Get Started" Button on "CNA Onboarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in iPad
    When I Select Trending Topics in iPad
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in iPad
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in iPad
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    And I Click "Sign In" Button on "CNA SignIn Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I validate the Home Screen section landing header in iPad
    Then I Click "icon settings" Button on "CNA Home Screen" in iPad
    Then I Verify "Bookmarks" info is displayed on "Settings screen" in iPad
    And I Click "Bookmarks" on "Settings Screen" in iPad
    Then I Verify "Bookmarks" info is displayed on "Bookmarks Header - Bookmark Page" in iPad
    And I click on article link from Bookmark List in iPad
    Then I validate the article page in iPad
    And I Click Back Button on "Article Screen" in iPad
    Then I Verify "Bookmarks" info is displayed on "Settings screen" in iPad
    And I Click "icon menu grey" Button on "Bookmark Page- Three Dots" in iPad
    And I Click "Bookmarked" on "Bookmark Page- Bookmarked article" in iPad
    Then I Verify "Removed from your bookmarks." info is displayed on "Bookmarks screen- Remove Bookmark Message" in iPad
    Then I Verify "You don't have any bookmarks right now." info is displayed on "Blank Bookmark Screen" in iPad
    Then I Verify "Start to bookmark stories so you can read them across devices, at your convenience." info is displayed on "Blank Bookmark Screen" in iPad

  @CNA_iPad_Bookmark06 @CNA_iPad_Bookmark08  @Sanity_iPad  @Sanity_iPad
  Scenario: Validation Bookmark and Unbookmark through 3 dots
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    And I Click "Get Started" Button on "CNA Onboarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in iPad
    When I Select Trending Topics in iPad
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in iPad
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in iPad
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    And I Click "Sign In" Button on "CNA SignIn Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I validate the Home Screen section landing header in iPad
    When I click on Menu in iPad
    When I Select "Singapore" from menu in iPad
    Then I Verify "Singapore " Screen in iPad
    And I Click "icon menu grey" Button on "Bookmark Page- Three Dots" in iPad
    And I Click "Bookmark" on "Bookmark Page- Bookmarked article" in iPad
    Then I Verify "Added to your bookmarks." info is displayed on "Bookmarks screen- Add Bookmark Message" in iPad
    And I Click "icon menu grey" Button on "Bookmark Page- Three Dots" in iPad
    And I Click "Bookmarked" on "Bookmark Page- Bookmarked article" in iPad
    Then I Verify "Removed from your bookmarks." info is displayed on "Bookmarks screen- Remove Bookmark Message" in iPad

  @CNA_iPad_Bookmark07 @CNA_iPad_Bookmark09  @Sanity_iPad  @Sanity_iPad
  Scenario: Validation Bookmark and Unbookmark from article detail Page
    Given I Launch "CNA iPad" Mobile App in iPad
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPad
    And I Click "Get Started" Button on "CNA Onboarding Screen" in iPad
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in iPad
    When I Select Trending Topics in iPad
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in iPad
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in iPad
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in iPad
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in iPad
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPad
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPad
    And I Click "Sign In" Button on "CNA SignIn Screen" in iPad
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPad
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPad
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPad
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPad
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPad
    When I Handle App Tracking Popup "CNA" Mobile App in iPad
    Then I validate the Home Screen section landing header in iPad
    And I click on article on homepage in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    And I Click "icon bookmark outline" Button on "Bookmark Icon - Article Page" in iPad
    Then I Verify "Added to your bookmarks." info is displayed on "Bookmarks screen- Add Bookmark Message" in iPad
    And I Click "icon bookmark outline" Button on "Bookmark Icon - Article Page" in iPad
    Then I Verify "Removed from your bookmarks." info is displayed on "Bookmarks screen- Remove Bookmark Message" in iPad

