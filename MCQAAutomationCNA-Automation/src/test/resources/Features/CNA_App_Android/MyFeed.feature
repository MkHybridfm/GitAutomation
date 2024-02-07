@MyFeedScenarios_Android @SSO
Feature: myFeed scenarios

  @Sanity_Android_SSO @MyFeed01 @Sanity_Android @rete
  Scenario: Validation of My Feed Page for Logged In user through Do it later in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I validate if My Feed menu option is displayed in Android App
    When I click on My Feed menu option in Android App
    Then I validate if My feed page is displayed in Android App
    Then I validate "Set up your personal news feed by telling us what interests you" info in My Feed Screen in Android App
    Then I validate My Feed topic Lists and Options
    When I Select Trending Topics in Android App
    And I Select More Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
     Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Mobile
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Mobile
    Then I enter valid credentials in Username and Password fields
   And I Click "Sign In" Button on "CNA SignIn Screen" in Android Mobile
    Then I validate if My feed page is displayed in Android App
    And I validate if Manage Feed button is displayed in My feed page in Android app
    Then I validate if search and settings Icon is displayed in My feed page in Android app
    And I validate Filter option in My My feed page in Android App
    Then I validate if My feeds article list is displayed in Android App
    When I Click on three dots in Feed in My Feed Screen in Android App
    Then I validate the bookmark options in Android App
    Then I validate the share options in Android App
    When I Click on Manage Feed Button My Feed Screen in Android App
    Then I Verify "Manage Feed" Screen in Android App
    Then I Verify "My Topics" Tab in Manage Feed Screen in Android App
    Then I Verify "Add Topics" Tab in Manage Feed Screen in Android App
    When I Click "Add Topics" Tab in Manage Feed Screen in Android App
    When I Click "My Topics" Tab in Manage Feed Screen in Android App
    And I validate My Topics List in Manage Feed section in Android App
    When I Click "Add Topics" Tab in Manage Feed Screen in Android App
    When I Select Trending Topics in Android App
    And I Select More Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
    Then I validate if My feed page is displayed in Android App
    When I Click on Manage Feed Button My Feed Screen in Android App
    Then I Verify "Manage Feed" Screen in Android App
    Then I Verify "My Topics" Tab in Manage Feed Screen in Android App
    Then I Verify New Topic is Added under My Topics Tab in Manage Feed Screen in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
    Then I Verify New Topic is Displayed in My Feed Screen in Android App
    And I click on settings icon in Android App
    Then I validate the logout button in Android App

  @Sanity_Android_SSO @MyFeed02 @Sanity_Android
  Scenario: Validation of My Feed Page for Logged In user through Get Started in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    And I Click "Get Started" Button on "CNA Onboarding Screen" in Android Mobile
    Then I validate if CNA Save preferences page is displayed in Android App
    When I Select Trending Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
     Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Mobile
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Mobile
    Then I enter valid credentials in Username and Password fields
   And I Click "Sign In" Button on "CNA SignIn Screen" in Android Mobile
    Then I validate the Home Page section landing header in Android App
    When I click on My Feed menu option in Android App
    Then I validate if My feed page is displayed in Android App
    And I validate if Manage Feed button is displayed in My feed page in Android app
    Then I validate if search and settings Icon is displayed in My feed page in Android app
    And I validate Filter option in My My feed page in Android App
    Then I validate if My feeds article list is displayed in Android App
    When I Click on three dots in Feed in My Feed Screen in Android App
    Then I validate the bookmark options in Android App
    Then I validate the share options in Android App
    When I Click on Manage Feed Button My Feed Screen in Android App
    Then I Verify "Manage Feed" Screen in Android App
    Then I Verify "My Topics" Tab in Manage Feed Screen in Android App
    Then I Verify "Add Topics" Tab in Manage Feed Screen in Android App
    When I Click "Add Topics" Tab in Manage Feed Screen in Android App
    When I Click "My Topics" Tab in Manage Feed Screen in Android App
    And I validate My Topics List in Manage Feed section in Android App
    When I Click "Add Topics" Tab in Manage Feed Screen in Android App
    When I Select Trending Topics in Android App
    And I Select More Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
    Then I validate if My feed page is displayed in Android App
    When I Click on Manage Feed Button My Feed Screen in Android App
    Then I Verify "Manage Feed" Screen in Android App
    And I click on back arrow in Android App
    Then I validate if My feed page is displayed in Android App
    When I Click on Manage Feed Button My Feed Screen in Android App
    Then I Verify "My Topics" Tab in Manage Feed Screen in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
    Then I Verify New Topic is Displayed in My Feed Screen in Android App
    And I click on settings icon in Android App
    Then I validate the logout button in Android App


  @CNA_Android_MyFeedSSO_01 @CNA_Android_MyFeedSSO_06 @CNA_Android_MyFeedSSO_07
  @CNA_Android_MyFeedSSO_08 @CNA_Android_MyFeedSSO_09 @CNA_Android_MyFeedSSO_10 @Sanity_Android_SSO @Sanity_Android @rete
  Scenario: Validation of My Feed section in Home Page for anonymous user
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I validate if My Feed menu option is displayed in Android App
    Then I scroll to My feed section under Top Stories in Android App
    And I validate if Topics Title and Add Topics context is displayed for My Feed in Home page in Android App
    Then I validate if List of Topics is displayed with 5 trending topics in Android App
    And I validate if Create my Feed and View More Topics button is displayed in Android App
    Then I select Topics from the List in Android App
    And I click on Create My feed Button
     Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile

  @CNA_Android_MyFeedSSO_11 @CNA_Android_MyFeedSSO_12 @Sanity_Android_SSO @Sanity_Android @rete
  Scenario: Validation of View More Topics Button for anonymous user and LoggedInUser And validate my feed for signIn user with No feed
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I validate if My Feed menu option is displayed in Android App
    Then I scroll to My feed section under Top Stories in Android App
    And I click on View more Topics Button
    Then I validate if My feed page is displayed in Android App
    And I click on settings icon in Android App
    Then I click on Login option from Settings menu
     Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Mobile
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Mobile
    Then I enter valid credentials in Username and Password fields
   And I Click "Sign In" Button on "CNA SignIn Screen" in Android Mobile
    And I click on back button in Android App
    When I click on My Feed menu option in Android App
    Then I validate if My feed page is displayed in Android App
    When I Click on Manage Feed Button My Feed Screen in Android App
    Then I unselect all the selected Topics from My Topics section
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
    And I click on home button in Android App
    Then I scroll to My feed section under Top Stories in Android App
    And I validate if Topics Title and Add Topics context is displayed for My Feed in Home page in Android App
    Then I validate if List of Topics is displayed with 5 trending topics in Android App
    And I validate if Create my Feed and View More Topics button is displayed in Android App
    And I click on View more Topics Button
    Then I validate if My feed page is displayed in Android App

  @CNA_Android_MyFeedSSO_13 @Sanity_Android_SSO @Sanity_Android @rete
  Scenario: Validate Create My feed section in Home Page for signIn user with No feed
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on settings icon in Android App
    Then I click on Login option from Settings menu
     Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Mobile
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Mobile
    Then I enter valid credentials in Username and Password fields
   And I Click "Sign In" Button on "CNA SignIn Screen" in Android Mobile
    And I click on back button in Android App
    And I click on home button in Android App
    Then I scroll to My feed section under Top Stories in Android App
    Then I select Topics from the List in Android App
    And I click on Create My feed Button
    Then I validate if My feed page is displayed in Android App

  @CNA_Android_MyFeedSSO_14 @CNA_Android_MyFeedSSO_15 @CNA_Android_MyFeedSSO_16
  @CNA_Android_MyFeedSSO_17 @CNA_Android_MyFeedSSO_19 @Sanity_Android_SSO  @Sanity_Android
  Scenario: Validate From my feed section in Home Page for signIn user with feed
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on settings icon in Android App
    Then I click on Login option from Settings menu
     Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile
    And I Click "Sign in with meconnect" Button on "CNA SignUp Screen" in Android Mobile
    Then I Verify "Sign in to CNA with meconnect" info is displayed on "CNA SignIn Screen" in Android Mobile
    Then I enter valid credentials in Username and Password fields
   And I Click "Sign In" Button on "CNA SignIn Screen" in Android Mobile
    And I click on back button in Android App
    And I click on home button in Android App
    Then I scroll to From My feed section under Top Stories in Android App
    And I validate From My Feed Title in Andriod App
   # Then I validate if Latest content list is displayed in From My feed scetion in Android App
    And I validate if Go to My Feed Button is displayed in Android App
    Then I validate timestamp for articles in From My Feed section in Android App
    And I click on Go to My Feed Button
    Then I validate if My feed page is displayed in Android App
    When I Click on Manage Feed Button My Feed Screen in Android App
    Then I Verify "Manage Feed" Screen in Android App
    And I click on back button in Android App
    Then I validate if My feed page is displayed in Android App

