@BookmarkSce2narios_CNA_iPhone @BookmarkScenarios_lifeStyle_iphone
Feature: Bookmark scenarios

  @CNA_iOS_Bookmark01 @CNA_iOS_Bookmark02 @CNA_iOS_Bookmark04  @Sanity_iOS  @ProdSanity_iOS @iPhone_CNA_Sanity @reio
  Scenario: Validation article and toast message from section landing page in iOS App
    Given I Launch "CNA iPhone" Mobile App in iPhone
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPhone
    And I Click "Get Started" Button on "CNA Onboarding Screen" in iPhone
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in iPhone
    When I Select Trending Topics in iPhone
    And I Click "Save Preferences" on "CNA Onboarding Screen" in iPhone
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in iPhone
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in iPhone
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in iPhone
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPhone
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPhone
    Then I click on login in iPhone
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPhone
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPhone
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPhone
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPhone
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPhone
    When I Handle App Tracking Popup "CNA" Mobile App in iPhone
    Then I validate the Home Screen section landing header in iPhone
    And I Click "icon menu grey" Button on "Bookmark Page- Three Dots" in iPhone
    And I Click "Bookmark" Button on "Home Page" in iPhone
   # Then I Verify "Added to your bookmarks." info is displayed on "Bookmarks screen- Add Bookmark Message" in iPhone
    Then I Click "icon settings" Button on "CNA Home Screen" in iPhone
    Then I Verify "Bookmarks" info is displayed on "Settings screen" in iPhone
    And I Click "Bookmarks" on "Settings Screen" in iPhone
    Then I Verify "Bookmarks" info is displayed on "Bookmarks Header - Bookmark Page" in iPhone
    Then I validate if Bookmarked articles list is displayed in Bookmarks Page in iPhone
    And I Click Back Button on "Article Screen" in iPhone
    Then I Verify "Settings" info is displayed on "Settings Screen" in iPhone


  @CNA_iOS_Bookmark03 @CNA_iOS_Bookmark05 @CNA_iOS_Bookmark10 @Sanity_iOS  @ProdSanity_iOS @iPhone_CNA_Sanity
  Scenario: Validation article detail page from Bookmarks Page
    Given I Launch "CNA iPhone" Mobile App in iPhone
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPhone
    And I Click "Get Started" Button on "CNA Onboarding Screen" in iPhone
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in iPhone
    When I Select Trending Topics in iPhone
    And I Click "Save Preferences" on "CNA Onboarding Screen" in iPhone
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in iPhone
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in iPhone
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in iPhone
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPhone
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPhone
    Then I click on login in iPhone
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPhone
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPhone
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPhone
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPhone
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPhone
    When I Handle App Tracking Popup "CNA" Mobile App in iPhone
    Then I validate the Home Screen section landing header in iPhone
    Then I Click "icon settings" Button on "CNA Home Screen" in iPhone
    Then I Verify "Bookmarks" info is displayed on "Settings screen" in iPhone
    And I Click "Bookmarks" on "Settings Screen" in iPhone
    Then I Verify "Bookmarks" info is displayed on "Bookmarks Header - Bookmark Page" in iPhone
    Then I Verify "Bookmarks" info is displayed on "Settings screen" in iPhone
    And I Click "icon menu grey" Button on "Bookmark Page- Three Dots" in iPhone
    And I Click "Bookmarked" on "Bookmark Page- Bookmarked article" in iPhone
    Then I Verify "Removed from your bookmarks." info is displayed on "Bookmarks screen- Remove Bookmark Message" in iPhone
   # Then I Verify "You don't have any bookmarks right now." info is displayed on "Blank Bookmark Screen" in iPhone
   # Then I Verify "Start to bookmark stories so you can read them across devices, at your convenience." info is displayed on "Blank Bookmark Screen" in iPhone

  @CNA_iOS_Bookmark06 @CNA_iOS_Bookmark08 @Sanity_iOS  @ProdSanity_iOS @iPhone_CNA_Sanity
  Scenario: Validation Bookmark and Unbookmark through 3 dots
    Given I Launch "CNA iPhone" Mobile App in iPhone
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPhone
    And I Click "Get Started" Button on "CNA Onboarding Screen" in iPhone
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in iPhone
    When I Select Trending Topics in iPhone
    And I Click "Save Preferences" on "CNA Onboarding Screen" in iPhone
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in iPhone
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in iPhone
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in iPhone
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPhone
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPhone
    Then I click on login in iPhone
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPhone
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPhone
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPhone
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPhone
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPhone
    When I Handle App Tracking Popup "CNA" Mobile App in iPhone
    Then I validate the Home Screen section landing header in iPhone
    When I click on Menu in iPhone
    When I Select "Singapore" from menu in iPhone
    Then I Verify "Singapore " Screen in iPhone
    And I Click "icon menu grey" Button on "Bookmark Page- Three Dots" in iPhone
    And I Click "Bookmark" on "Bookmark Page- Bookmarked article" in iPhone
    Then I Verify "Added to your bookmarks." info is displayed on "Bookmarks screen- Add Bookmark Message" in iPhone
    And I Click "icon menu grey" Button on "Bookmark Page- Three Dots" in iPhone
    And I Click "Bookmarked" on "Bookmark Page- Bookmarked article" in iPhone
    Then I Verify "Removed from your bookmarks." info is displayed on "Bookmarks screen- Remove Bookmark Message" in iPhone

  @CNA_iOS_Bookmark07 @CNA_iOS_Bookmark09 @Sanity_iOS  @ProdSanity_iOS @iPhone_CNA_Sanity
  Scenario: Validation Bookmark and Unbookmark from article detail Page
    Given I Launch "CNA iPhone" Mobile App in iPhone
    Then I Verify "Welcome to" info is displayed on "CNA OnBoarding Screen" in iPhone
    And I Click "Get Started" Button on "CNA Onboarding Screen" in iPhone
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in iPhone
    When I Select Trending Topics in iPhone
    And I Click "Save Preferences" on "CNA Onboarding Screen" in iPhone
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in iPhone
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in iPhone
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in iPhone
    When I Enter Valid User Name on "Sign in with meconnect Screen" in iPhone
    When I Enter Valid Password Name on "Sign in with meconnect Screen" in iPhone
    Then I click on login in iPhone
    Then I Verify "Manage Notifications" Button is displayed on "Manage Notifications Screen" in iPhone
    Then I Click "Manage Notifications" Button on "Manage Notifications Screen" in iPhone
    Then I Click "Allow" Button on "CNA OnBoarding Screen" in iPhone
    Then I Verify "permission_tracking" Image is displayed on "Manage Tracking Screen" in iPhone
    Then I Click "Manage Tracking" Button on "Manage Tracking Screen" in iPhone
    When I Handle App Tracking Popup "CNA" Mobile App in iPhone
    Then I validate the Home Screen section landing header in iPhone
    And I click on article on homepage in iPhone
    And I validate toast message on the article page in iPhone
    Then I validate the article page in iPhone
    And I Click "icon bookmark outline" Button on "Bookmark Icon - Article Page" in iPhone
    Then I Verify "Added to your bookmarks." info is displayed on "Bookmarks screen- Add Bookmark Message" in iPhone
    And I Click "icon bookmark outline" Button on "Bookmark Icon - Article Page" in iPhone
    Then I Verify "Removed from your bookmarks." info is displayed on "Bookmarks screen- Remove Bookmark Message" in iPhone

