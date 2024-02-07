@BookmarkScenarios_AndroidTab @BookmarkScenarios_lifeStyle @BookmarkScenarios_Luxury
Feature: Bookmark scenarios

  @CNA_Android_Bookmark01 @CNA_Android_Bookmark02 @CNA_Android_Bookmark04  @Sanity_Android_Tab  @ProdSanity_Android
  Scenario: Validation article and toast message from section landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Tablet
    And I Click "Get Started" Button on "CNA Onboarding Screen" in Android Tablet
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in Android Tablet
    When I Select Trending Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Tablet
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Tablet
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Tablet
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Tablet
    Then I enter valid credentials in Username and Password fields
    And I Click "Sign In" Button on "CNA SignIn Screen" in Android Tablet
    Then I validate the Home Page section landing header in Android App
    And I Click "iv_options" Image on "Bookmark Page- Three Dots" in Android Tablet
    And I Click "Bookmark" on "Bookmark Page- Bookmarked article" in Android Tablet
    Then I Verify "Added to your bookmarks." info is displayed on "Bookmarks screen- Add Bookmark Message" in Android Tablet
    And I click on settings icon in Android App
    Then I Verify "Bookmarks" info is displayed on "Settings screen" in Android Tablet
    And I Click "Bookmarks" on "Settings Screen" in Android Tablet
    Then I Verify "Bookmarks" info is displayed on "Bookmarks Header - Bookmark Page" in Android Tablet
    Then I Verify "iv_logo" Image is displayed on "CNA Logo - Bookmark Page" in Android Tablet
    Then I Verify "iv_back" Image is displayed on "Back Button - Bookmark Page" in Android Tablet
    Then I validate if Bookmarked articles list is displayed in Bookmarks Page


  @CNA_Android_Bookmark03 @CNA_Android_Bookmark05 @CNA_Android_Bookmark10 @Sanity_Android_Tab  @ProdSanity_Android
  Scenario: Validation article detail page from Bookmarks Page
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Tablet
    And I Click "Get Started" Button on "CNA Onboarding Screen" in Android Tablet
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in Android Tablet
    When I Select Trending Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Tablet
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Tablet
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Tablet
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Tablet
    Then I enter valid credentials in Username and Password fields
    And I Click "Sign In" Button on "CNA SignIn Screen" in Android Tablet
    Then I validate the Home Page section landing header in Android App
    And I click on settings icon in Android App
    Then I Verify "Bookmarks" info is displayed on "Settings screen" in Android Tablet
    And I Click "Bookmarks" on "Settings Screen" in Android Tablet
    Then I Verify "Bookmarks" info is displayed on "Bookmarks Header - Bookmark Page" in Android Tablet
    And I click on article link from Bookmark List
    Then I validate the article page in Android App
    And I Click "iv_back" Image on "Bookmarks Screen" in Android Tablet
    Then I Verify "Bookmarks" info is displayed on "Settings screen" in Android Tablet
    And I Click "iv_options" Image on "Bookmark Page- Three Dots" in Android Tablet
    And I Click "Bookmarked" on "Bookmark Page- Bookmarked article" in Android Tablet
    Then I Verify "Removed from your bookmarks." info is displayed on "Bookmarks screen- Remove Bookmark Message" in Android Tablet
    Then I Verify "You don't have any bookmarks right now." info is displayed on "Blank Bookmark Screen" in Android Tablet
    Then I Verify "Start to bookmark stories so you can read them across devices, at your convenience." info is displayed on "Blank Bookmark Screen" in Android Tablet

  @CNA_Android_Bookmark06 @CNA_Android_Bookmark08 @Sanity_Android_Tab  @ProdSanity_Android
  Scenario: Validation Bookmark and Unbookmark through 3 dots
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Tablet
    And I Click "Get Started" Button on "CNA Onboarding Screen" in Android Tablet
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in Android Tablet
    When I Select Trending Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Tablet
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Tablet
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Tablet
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Tablet
    Then I enter valid credentials in Username and Password fields
    And I Click "Sign In" Button on "CNA SignIn Screen" in Android Tablet
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on commentary section header in Android App
    And I Click "iv_options" Image on "Bookmark Page- Three Dots" in Android Tablet
    And I Click "Bookmark" on "Bookmark Page- Bookmarked article" in Android Tablet
    Then I Verify "Added to your bookmarks." info is displayed on "Bookmarks screen- Add Bookmark Message" in Android Tablet
    And I Click "iv_options" Image on "Bookmark Page- Three Dots" in Android Tablet
    And I Click "Bookmarked" on "Bookmark Page- Bookmarked article" in Android Tablet
    Then I Verify "Removed from your bookmarks." info is displayed on "Bookmarks screen- Remove Bookmark Message" in Android Tablet

  @CNA_Android_Bookmark07 @CNA_Android_Bookmark09 @Sanity_Android_Tab  @ProdSanity_Android
  Scenario: Validation Bookmark and Unbookmark from article detail Page
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Tablet
    And I Click "Get Started" Button on "CNA Onboarding Screen" in Android Tablet
    Then I Verify "Add topics to create your personal news feed" info is displayed on "CNA Preference Screen" in Android Tablet
    When I Select Trending Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Tablet
    Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Tablet
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Tablet
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Tablet
    Then I enter valid credentials in Username and Password fields
    And I Click "Sign In" Button on "CNA SignIn Screen" in Android Tablet
    Then I validate the Home Page section landing header in Android App
    And I click on article on homepage in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    And I Click "iv_bookmark" Image on "Bookmark Icon - Article Page" in Android Tablet
    Then I Verify "Added to your bookmarks." info is displayed on "Bookmarks screen- Add Bookmark Message" in Android Tablet
    And I Click "iv_bookmark" Image on "Bookmark Icon - Article Page" in Android Tablet
    Then I Verify "Removed from your bookmarks." info is displayed on "Bookmarks screen- Remove Bookmark Message" in Android Tablet

