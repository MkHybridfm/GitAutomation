@ArticleScenarios_Android @shareScenarios @fontSize @topicListing @CNA_Luxury @CNA_lifeStyle @SSO
Feature: Article scenarios

  @CNA_Android_016 @CNA_Android_017  @Sanity_Android
    @Android_Mobile_CNAB-911 @Android_Mobile_CNAB-912
  Scenario: Validation article and toast message from section landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on article on homepage in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App

  @CNA_Android_018 @CNA_Android_019 @CNA_Android_020 @CNA_Android_021  @Sanity_Android
    @Android_Mobile_CNAB-913 @Android_Mobile_CNAB-914
  Scenario: Validation swiping functionality and article section headers on Article page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on article on homepage in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    Then I verify scroll functionality on Home page in Android App
    And I validate the the context with "Swipe for more articles" in Android App
    Then I validate the "Related topics" section in Android App
    Then I validate the "Also worth reading" section in Android App
    Then I validate the "Outbrain" section in Android App

  @CNA_Android_023 @CNA_Android_024  @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-918 @Android_Mobile_CNAB-919
  Scenario: Validation of share button on CNA article page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on article on homepage in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    Then I verify share button in Android App
   # Then I verify share external link in Android App
   # And I click on close button share info page in Android App

  @CNA_Android_025  @Sanity_Android @iOS-issue
    @Android_Mobile_CNAB-920
  Scenario: Validation of font size on article page
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on article on homepage in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    And I click on font size button in Android App
    Then I validate different font size buttons in Android App

  @CNA_Android_022 @Sanity_Android @ProdSanity_Android
    @Android_Mobile_CNAB-917
  Scenario: Validation of Author details on article page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on commentary section header in Android App
    And I click on article in Android App
    And I validate toast message on the article page in Android App
    Then I validate the author name on article page in Android App
    And I click on author link in Android App
    Then I navigate to the article page in web view in Android App
    And I click on Done button on web view page in Android App

  @CNA_Android_032  @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-927
  Scenario: Validation of topic listing under the homepage in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on article on homepage in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    Then I verify scroll functionality on Home page in Android App
    And I validate the the context with "Swipe for more articles" in Android App
    Then I validate the "Related topics" section in Android App
    And I click on one related topic in Android App
    Then I validate the header title of the topic in Android App

  @CNA_Android_033  @Sanity_Android @Android_Mobile_CNAB-928
  Scenario: Validation of topic listing under the menu section in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    Then I validate the list of topics in menu section in Android App
    And I click on one of the topic in Android App
    Then I validate the header title of the topic in Android App

  @CNA_Android_034  @Sanity_Android  @ProdSanity_Android @Android_Mobile_CNAB-929
  Scenario: Validation of topic listing under the my feed section in Android App
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
    Then I validate if My feeds article list is displayed in Android App
    When I Click on Manage Feed Button My Feed Screen in Android App
    Then I Verify "Manage Feed" Screen in Android App
    Then I Verify "My Topics" Tab in Manage Feed Screen in Android App
    Then I Verify "Add Topics" Tab in Manage Feed Screen in Android App

  @CNA_Android_018_a  @CNA_Android_096 @CNA_Android_097 @CNA_Android_034a  @Sanity_Android
    @Android_Mobile_CNAB-913 @Android_Mobile_CNAB-962 @Android_Mobile_CNAB-963
  Scenario: Validation swiping functionality and article section headers on CNA luxury Article page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA luxury in Android App
    Then I validate search button and settings icon in Android App
    And I click on article on luxury page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    Then I verify scroll functionality on Home page in Android App
    And I validate the the context with "Swipe for more articles" in Android App
    Then I validate the "RELATED TOPICS" section on CNA luxury in Android App
#    And I validate the "RELATED STORIES" ON CNA luxury in Android App
    Then I validate the "Outbrain" section in Android App

  @CNA_Android_018_b  @Sanity_Android  @Android_Mobile_CNAB-913
  Scenario: Validation swiping functionality and article section headers on CNA life style Article page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA lifeStyle in Android App
    Then I validate search button and settings icon in Android App
    And I click on article on life style page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    Then I verify scroll functionality on Home page in Android App
    And I validate the the context with "Swipe for more articles" in Android App
    Then I validate the "RELATED TOPICS" section on CNA life style in Android App
    Then I validate the "Outbrain" section in Android App

  @CNA_Android_091  @Sanity_Android @Android_Mobile_CNAB-958
  Scenario: Validation of topic listing under the life style article detail page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA lifeStyle in Android App
    Then I validate search button and settings icon in Android App
    And I click on article on life style page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    Then I verify scroll functionality on Home page in Android App
    And I validate the the context with "Swipe for more articles" in Android App
    Then I validate the "RELATED TOPICS" section on CNA life style in Android App
    And I click on one related topic on life style article in Android App
    Then I validate the header title of the topic in Android App

  @CNA_Android_102  @Sanity_Android @Android_Mobile_CNAB-998
  Scenario: Validation of topic listing under the luxury article detail page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA luxury in Android App
    Then I validate search button and settings icon in Android App
    And I click on article on luxury page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    Then I verify scroll functionality on Home page in Android App
    And I validate the the context with "Swipe for more articles" in Android App
    Then I validate the "RELATED TOPICS" section on CNA life style in Android App
#    And I click on one related topic on luxury article in Android App
    And I click on one related topic on life style article in Android App
    Then I validate the header title of the topic in Android App

  @CNA_Android_023_a @CNA_Android_024_b  @Sanity_Android
    @Android_Mobile_CNAB-918 @Android_Mobile_CNAB-919
  Scenario: Validation of share button on life style article page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA lifeStyle in Android App
    And I click on article on life style page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    Then I verify share button in Android App
   # Then I verify share external link
   # And I click on close button share info page

  @CNA_Android_023_b @CNA_Android_024_b  @Sanity_Android
  @Android_Mobile_CNAB-918 @Android_Mobile_CNAB-919
  Scenario: Validation of share button on luxury article page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA luxury in Android App
    Then I validate search button and settings icon in Android App
    And I click on article on luxury page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    Then I verify share button in Android App
   # Then I verify share external link in Android App
   # And I click on close button share info page in Android App

  @CNA_Android_022_a @Sanity_Android @iOS-issue @Android_Mobile_CNAB-917
  Scenario: Validation of Author details on article page(CNA life style) in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA lifeStyle in Android App
    And I click on article on life style page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the author name on life style article page in Android App
    And I click on author link on life style in Android App
    Then I navigate to the article page in web view in Android App
    And I click on Done button on web view page in Android App

  @CNA_Android_022_b @Sanity_Android @iOS-issue @Android_Mobile_CNAB-917
  Scenario: Validation of Author details on article page(CNA luxury) in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA luxury in Android App
    And I click on article on luxury page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the author name on life style article page in Android App
    And I click on author link on life style in Android App
    Then I navigate to the article page in web view in Android App
    And I click on Done button on web view page in Android App

  @CNA_Android_025_a @Sanity_Android @iOS-issue @ProdSanity_Android
    @Android_Mobile_CNAB-920
  Scenario: Validation of font size on article page (CNA lifeStyle) in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA lifeStyle in Android App
    And I click on article on life style page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    And I click on font size button in Android App
    Then I validate different font size buttons in Android App

  @CNA_Android_025_b @Sanity_Android @iOS-issue
    @Android_Mobile_CNAB-920
  Scenario: Validation of font size on article page (CNA luxury)
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA luxury in Android App
    And I click on article on luxury page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App
    And I click on font size button in Android App
    Then I validate different font size buttons in Android App
