@MyFeedScenarios_Android_Tab @SSO_Tab
Feature: myFeed scenarios

  @Sanity_Android_Tab_SSO @MyFeed01_Tab @Sanity_Android_Tab
  Scenario: Validation of My Feed Page for Logged In user through Do it later in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I validate if My Feed menu option is displayed in Android App in Tab
    When I click on My Feed menu option in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab
    Then I validate "Set up your personal news feed by telling us what interests you" info in My Feed Screen in Android App in Tab
    Then I validate My Feed topic Lists and Options in Android App in Tab
    Then I Verify CNA OnBoarding Save Preference Trending Topics List in Android App in Tab
    Then I Verify CNA OnBoarding Save Preference More Topics Section in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    And I Select More Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed in Android App in Tab
    Then I click on Sign In with meConnect Link from Sign up page
    And I validate if Sign In Page is displayed in Android App in Tab
    Then I enter valid credentials in Username and Password fields
    When I click on Log In button in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab
    And I validate if Manage Feed button is displayed in My feed page in Android App in Tab
    Then I validate if search and settings Icon is displayed in My feed page in Android App in Tab
    And I validate Filter option in My My feed page in Android App in Tab
    Then I validate if My feeds article list is displayed in Android App in Tab
    When I Click on three dots in Feed in My Feed Screen in Android App in Tab
    Then I validate the bookmark options in Android App in Tab
    Then I validate the share options in Android App in Tab
    When I Click on Manage Feed Button My Feed Screen in Android App in Tab
    Then I Verify "Manage Feed" Screen in Android App in Tab
    Then I Verify "My Topics" Tab in Manage Feed Screen in Android App in Tab
    Then I Verify "Add Topics" Tab in Manage Feed Screen in Android App in Tab
    When I Click "Add Topics" Tab in Manage Feed Screen in Android App in Tab
    When I Click "My Topics" Tab in Manage Feed Screen in Android App in Tab
    And I validate My Topics List in Manage Feed section in Android App in Tab
    When I Click "Add Topics" Tab in Manage Feed Screen in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    And I Select More Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab
    When I Click on Manage Feed Button My Feed Screen in Android App in Tab
    Then I Verify "Manage Feed" Screen in Android App in Tab
    Then I Verify "My Topics" Tab in Manage Feed Screen in Android App in Tab
    Then I Verify New Topic is Added under My Topics Tab in Manage Feed Screen in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I Verify New Topic is Displayed in My Feed Screen in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the logout button in Android App in Tab

  @Sanity_Android_Tab_SSO @MyFeed02_Tab @Sanity_Android_Tab
  Scenario: Validation of My Feed Page for Logged In user through Get Started in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I click on Get Started button in Android App in Tab
    Then I validate if CNA Save preferences page is displayed in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed in Android App in Tab
    Then I click on Sign In with meConnect Link from Sign up page in Android App in Tab
    And I validate if Sign In Page is displayed in Android App in Tab
    Then I enter valid credentials in Username and Password fields in Android App in Tab
    When I click on Log In button in Android App in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    When I click on My Feed menu option in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab
    And I validate if Manage Feed button is displayed in My feed page in Android App in Tab
    Then I validate if search and settings Icon is displayed in My feed page in Android App in Tab
    And I validate Filter option in My My feed page in Android App in Tab
    Then I validate if My feeds article list is displayed in Android App in Tab
    When I Click on three dots in Feed in My Feed Screen in Android App in Tab
    Then I validate the bookmark options in Android App in Tab
    Then I validate the share options in Android App in Tab
    When I Click on Manage Feed Button My Feed Screen in Android App in Tab
    Then I Verify "Manage Feed" Screen in Android App in Tab
    Then I Verify "My Topics" Tab in Manage Feed Screen in Android App in Tab
    Then I Verify "Add Topics" Tab in Manage Feed Screen in Android App in Tab
    When I Click "Add Topics" Tab in Manage Feed Screen in Android App in Tab
    When I Click "My Topics" Tab in Manage Feed Screen in Android App in Tab
    And I validate My Topics List in Manage Feed section in Android App in Tab
    When I Click "Add Topics" Tab in Manage Feed Screen in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    And I Select More Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab
    When I Click on Manage Feed Button My Feed Screen in Android App in Tab
    Then I Verify "Manage Feed" Screen in Android App in Tab
    And I click on back arrow in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab
    When I Click on Manage Feed Button My Feed Screen in Android App in Tab
    Then I Verify "My Topics" Tab in Manage Feed Screen in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I Verify New Topic is Displayed in My Feed Screen in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I validate the logout button in Android App in Tab

  @CNA_Android_Tab_MyFeedSSO_01 @CNA_Android_Tab_MyFeedSSO_06 @CNA_Android_Tab_MyFeedSSO_07
  @CNA_Android_Tab_MyFeedSSO_08 @CNA_Android_Tab_MyFeedSSO_09 @CNA_Android_Tab_MyFeedSSO_10 @Sanity_Android_Tab_SSO @Sanity_Android_Tab
  Scenario: Validation of My Feed section in Home Page for anonymous user
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I validate if My Feed menu option is displayed in Android App in Tab
    Then I scroll to My feed section under Top Stories in Android App in Tab
    And I validate if Topics Title and Add Topics context is displayed for My Feed in Home page in Android App in Tab
    Then I validate if List of Topics is displayed with 5 trending topics in Android App in Tab
    And I validate if Create my Feed and View More Topics button is displayed in Android App in Tab
    Then I select Topics from the List in Android App in Tab
    And I click on Create My feed Button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed

  @CNA_Android_Tab_MyFeedSSO_11 @CNA_Android_Tab_MyFeedSSO_12 @Sanity_Android_Tab_SSO @Sanity_Android_Tab
  Scenario: Validation of View More Topics Button for anonymous user and LoggedInUser And validate my feed for signIn user with No feed
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I validate if My Feed menu option is displayed in Android App in Tab
    Then I scroll to My feed section under Top Stories in Android App in Tab
    And I click on View more Topics Button in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I click on Login option from Settings menu in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed in Android App in Tab
    Then I click on Sign In with meConnect Link from Sign up page in Android App in Tab
    And I validate if Sign In Page is displayed in Android App in Tab
    Then I enter valid credentials in Username and Password fields in Android App in Tab
    When I click on Log In button in Android App in Tab
    And I click on back button in Android App in Tab
    When I click on My Feed menu option in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab
    When I Click on Manage Feed Button My Feed Screen in Android App in Tab
    Then I unselect all the selected Topics from My Topics section
    When I Click on Save Preference button in Android App in Tab
    And I click on home button in Android App in Tab
    Then I scroll to My feed section under Top Stories in Android App in Tab
    And I validate if Topics Title and Add Topics context is displayed for My Feed in Home page in Android App in Tab
    Then I validate if List of Topics is displayed with 5 trending topics in Android App in Tab
    And I validate if Create my Feed and View More Topics button is displayed in Android App in Tab
    And I click on View more Topics Button in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab

  @CNA_Android_Tab_MyFeedSSO_13 @Sanity_Android_Tab_SSO @Sanity_Android_Tab
  Scenario: Validate Create My feed section in Home Page for signIn user with No feed
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I click on Login option from Settings menu in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed in Android App in Tab
    Then I click on Sign In with meConnect Link from Sign up page in Android App in Tab
    And I validate if Sign In Page is displayed in Android App in Tab
    Then I enter valid credentials in Username and Password fields in Android App in Tab
    When I click on Log In button in Android App in Tab
    And I click on back button in Android App in Tab
    And I click on home button in Android App in Tab
    Then I scroll to My feed section under Top Stories in Android App in Tab
    Then I select Topics from the List in Android App in Tab
    And I click on Create My feed Button in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab

  @CNA_Android_Tab_MyFeedSSO_14 @CNA_Android_Tab_MyFeedSSO_15 @CNA_Android_Tab_MyFeedSSO_16
  @CNA_Android_Tab_MyFeedSSO_17 @CNA_Android_Tab_MyFeedSSO_19 @Sanity_Android_Tab_SSO  @Sanity_Android_Tab
  Scenario: Validate From my feed section in Home Page for signIn user with feed
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on settings icon in Android App in Tab
    Then I click on Login option from Settings menu in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed in Android App in Tab
    Then I click on Sign In with meConnect Link from Sign up page in Android App in Tab
    And I validate if Sign In Page is displayed in Android App in Tab
    Then I enter valid credentials in Username and Password fields in Android App in Tab
    When I click on Log In button in Android App in Tab
    And I click on back button in Android App in Tab
    And I click on home button in Android App in Tab
    Then I scroll to From My feed section under Top Stories in Android App in Tab
    Then I Verify "From My Feed" info is displayed on "Home Page" in Android Tablet
    Then I validate if Latest content list is displayed in From My feed scetion in Android App in Tab
    And I validate if Go to My Feed Button is displayed in Android App in Tab
    Then I validate timestamp for articles in From My Feed section in Android App in Tab
    And I click on Go to My Feed Button in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab
    When I Click on Manage Feed Button My Feed Screen in Android App in Tab
    Then I Verify "Manage Feed" Screen in Android App in Tab
    And I click on back button in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab

