@ArticleScenarios_Android_Tab @SSO_Tab
Feature: Article scenarios Android Tab

  @CNA_Android_Tab_016 @CNA_Android_Tab_017  @Sanity_Android_Tab
    @Android_Tab_CNAB-911 @Android_Tab_CNAB-912
  Scenario: Validation article and toast message from section landing page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on article on homepage in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab

  @CNA_Android_Tab_018 @CNA_Android_Tab_019 @CNA_Android_Tab_020 @CNA_Android_Tab_021  @Sanity_Android_Tab
    @Android_Tab_CNAB-913 @Android_Tab_CNAB-914 @Android_Tab_CNAB-915 @Android_Tab_CNAB-916
  Scenario: Validation swiping functionality and article section headers on Article page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on article on homepage in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    And I scroll to top of the Page
    Then I Verify "Related Topics" info is visible on "Article detail page" in Android Tablet
    Then I validate the "Also worth reading" section in Android App in Tab
    Then I validate the "Outbrain" section in Android App in Tab
    Then I Verify "← Swipe for more articles →" info is displayed on "Article detail page" in Android Tablet
    Then I verify scroll functionality on Home page in Android App in Tab

  @CNA_Android_Tab_023 @CNA_Android_Tab_024  @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-918 @Android_Tab_CNAB-919
  Scenario: Validation of share button on CNA article page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on article on homepage in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    Then I verify share button in Android App in Tab
   # Then I verify share external link in Android App in Tab
   # And I click on close button share info page in Android App in Tab

  @CNA_Android_Tab_025  @Sanity_Android_Tab @iOS-issue
    @Android_Tab_CNAB-920
  Scenario: Validation of font size on article page
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on article on homepage in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    And I click on font size button in Android App in Tab
    Then I validate different font size buttons in Android App in Tab

  @CNA_Android_Tab_022 @Sanity_Android_Tab @ProdSanity_Android_Tab
    @Android_Tab_CNAB-917
  Scenario: Validation of Author details on article page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on commentary section header in Android App in Tab
    And I click on article in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the author name on article page in Android App in Tab
    And I click on author link in Android App in Tab
    Then I navigate to the article page in web view in Android App in Tab
    And I click on Done button on web view page in Android App in Tab

  @CNA_Android_Tab_032  @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-927
  Scenario: Validation of topic listing under the homepage in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on article on homepage in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    Then I Verify "Related Topics" text is displayed on "Article Detail Page" in Android Tablet
    And I click on one related topic in Android App in Tab
    Then I validate the header title of the topic in Android App in Tab

  @CNA_Android_Tab_033  @Sanity_Android_Tab
    @Android_Tab_CNAB-928
  Scenario: Validation of topic listing under the menu section in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    Then I validate the list of topics in menu section in Android App in Tab
    And I click on one of the topic in Android App in Tab
    Then I validate the header title of the topic in Android App in Tab

  @CNA_Android_Tab_034  @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-929
  Scenario: Validation of topic listing under the my feed section in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I click on Get Started button in Android App in Tab
    Then I validate if CNA Save preferences page is displayed in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed
    Then I click on Sign In with meConnect Link from Sign up page
    And I validate if Sign In Page is displayed
    Then I enter valid credentials in Username and Password fields
    When I click on Log In button
    Then I validate the Home Page section landing header in Android App in Tab
    When I click on My Feed menu option in Android App in Tab
    Then I validate if My feed page is displayed in Android App in Tab
    Then I validate if My feeds article list is displayed in Android App in Tab
    When I Click on Manage Feed Button My Feed Screen in Android App in Tab
    Then I Verify "Manage Feed" Screen in Android App in Tab
    Then I Verify "My Topics" Tab in Manage Feed Screen in Android App in Tab
    Then I Verify "Add Topics" Tab in Manage Feed Screen in Android App in Tab

  @CNA_Android_Tab_018_a  @CNA_Android_Tab_096 @CNA_Android_Tab_097 @CNA_Android_Tab_035a  @Sanity_Android_Tab
    @Android_Tab_CNAB-913 @Android_Tab_CNAB-992 @Android_Tab_CNAB-993 @Android_Tab_CNAB-930
  Scenario: Validation swiping functionality and article section headers on CNA luxury Article page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA luxury in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    And I click on article on luxury page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    And I scroll to top of the Page
    Then I Verify "< RELATED TOPICS >" info is visible on "Article detail page" in Android Tablet
    Then I validate the "Outbrain" section in Android App in Tab
    Then I Verify "← Swipe for more articles →" info is displayed on "Article detail page" in Android Tablet
    Then I verify scroll functionality on Home page in Android App in Tab

  @CNA_Android_Tab_018_b  @Sanity_Android_Tab
    @Android_Tab_CNAB-913
  Scenario: Validation swiping functionality and article section headers on CNA life style Article page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA lifeStyle in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    And I click on article on life style page in Android App in Tab
  #  And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    And I scroll to top of the Page
    Then I Verify "RELATED TOPICS" info is visible on "Article detail page" in Android Tablet
    Then I validate the "Outbrain" section in Android App in Tab
    Then I verify scroll functionality on Home page in Android App in Tab

  @CNA_Android_Tab_091  @Sanity_Android_Tab
    @Android_Tab_CNAB-987
  Scenario: Validation of topic listing under the life style article detail page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA lifeStyle in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    And I click on article on life style page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    And I scroll to top of the Page
    Then I Verify "RELATED TOPICS" info is visible on "Article detail page" in Android Tablet
    And I click on one related topic on life style article in Android App in Tab
    Then I validate the header title of the topic in Android App in Tab

  @CNA_Android_Tab_102  @Sanity_Android_Tab
    @Android_Tab_CNAB-998
  Scenario: Validation of topic listing under the luxury article detail page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA luxury in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    And I click on article on luxury page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    Then I validate the "RELATED TOPICS" section on CNA life style in Android App in Tab
#    And I click on one related topic on luxury article in Android App in Tab
    And I click on one related topic on life style article in Android App in Tab
    Then I validate the header title of the topic in Android App in Tab

  @CNA_Android_Tab_023_a @CNA_Android_Tab_024_b  @Sanity_Android_Tab
    @Android_Tab_CNAB-918 @Android_Tab_CNAB-919
  Scenario: Validation of share button on life style article page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA lifeStyle in Android App in Tab
    And I click on article on life style page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    Then I verify share button in Android App in Tab
   # Then I verify share external link
   # And I click on close button share info page

  @CNA_Android_Tab_023_b @CNA_Android_Tab_024_b  @Sanity_Android_Tab
  @Android_Tab_CNAB-918 @Android_Tab_CNAB-919
  Scenario: Validation of share button on luxury article page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA luxury in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    And I click on article on luxury page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    Then I verify share button in Android App in Tab
   # Then I verify share external link in Android App in Tab
   # And I click on close button share info page in Android App in Tab

  @CNA_Android_Tab_022_a @Sanity_Android_Tab @iOS-issue
  @Android_Tab_CNAB-917
  Scenario: Validation of Author details on article page(CNA life style) in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA lifeStyle in Android App in Tab
    And I click on article on life style page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I scroll to top of the Page
    Then I validate the author name on life style article page in Android App in Tab
    And I click on author link on life style in Android App in Tab
    Then I navigate to the article page in web view in Android App in Tab
    And I click on Done button on web view page in Android App in Tab

  @CNA_Android_Tab_022_b @Sanity_Android_Tab @iOS-issue
  @Android_Tab_CNAB-917
  Scenario: Validation of Author details on article page(CNA luxury) in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA luxury in Android App in Tab
    And I click on article on luxury page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I scroll to top of the Page
    Then I validate the author name on life style article page in Android App in Tab
    And I click on author link on life style in Android App in Tab
    Then I navigate to the article page in web view in Android App in Tab
    And I click on Done button on web view page in Android App in Tab

  @CNA_Android_Tab_025_a @Sanity_Android_Tab @iOS-issue @ProdSanity_Android_Tab
    @Android_Tab_CNAB-920
  Scenario: Validation of font size on article page (CNA lifeStyle) in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA lifeStyle in Android App in Tab
    And I click on article on life style page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    And I click on font size button in Android App in Tab
    Then I validate different font size buttons in Android App in Tab

  @CNA_Android_Tab_025_b @Sanity_Android_Tab @iOS-issue
    @Android_Tab_CNAB-920
  Scenario: Validation of font size on article page (CNA luxury)
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA luxury in Android App in Tab
    And I click on article on luxury page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab
    And I click on font size button in Android App in Tab
    Then I validate different font size buttons in Android App in Tab
