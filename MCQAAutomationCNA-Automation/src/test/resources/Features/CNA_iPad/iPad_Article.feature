@iPad_CNA_ArticleScenarios @shareScenarios @fontSize @topicListing @CNA_Luxury @CNA_lifeStyle
@iPad_QA
Feature: Article scenarios

  @iPad_CNA_0601 @Sanity_iPad
  Scenario: Validation article and toast message from section landing page in iPad
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
    And I click on article on homepage in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    And I Click Back Button on "Article Screen" in iPad

  @iPad_CNA_CNAB-915 @iPad_CNA_CNAB-912 @iPad_CNA_CNAB-913 @iPad_CNA_CNAB-916 @iPad_CNA_CNAB-927
  @iPad_CNA_0602 @Sanity_iPad
  Scenario: Validation Related topics, Swipe for more articles,Also worth reading, Outbrain on Article page in iPad
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
    And I click on article on homepage in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    Then I verify scroll functionality on Home page in iPad
    And I validate the the context with "Swipe for more articles" in iPad
    Then I validate the "Related topics" section in iPad
    Then I Verify Related topics List on the article page in iPad
    When I Select One Related topics on the article page in iPad
    Then I Verify Related topics Header on the article page in iPad
    Then I click on back arrow in iPad
    Then I validate the "Also worth reading" section in iPad
    Then I validate the "Outbrain" section in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0603 @Sanity_iPad
  Scenario: Validation of share button on CNA article page in iPad
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
    And I click on article on homepage in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    Then I verify share button in iPad
   # Then I verify share external link in iPad
   # And I click on close button share info page in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0604 @Sanity_iPad
  Scenario: Validation of font size on article page in iPad
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
    And I click on article on homepage in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    And I click on font size button in iPad
    Then I validate different font size buttons in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0605 @Sanity_iPad
  Scenario: Validation of Author details on article page in iPad
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
    When I click on Menu in iPad
    And I Select "Commentary" from menu in iPad
    And I click on article in iPad
    And I validate toast message on the article page in iPad
    Then I validate the author name on article page in iPad
    And I click on author link in iPad
    And I wait for sometime to load Auther Screen from Article Detail Page in iPad
    And I Verify Author Follow Button in Web View iPad
    And I Verify Author Name in Web View iPad
    And I Verify Author Image in Web View iPad
    And I click on Done button on web view page in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0606 @Sanity_iPad
  Scenario: Validation of topic listing under the homepage in iPad
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
    And I click on article on homepage in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    Then I verify scroll functionality on Home page in iPad
    And I validate the the context with "Swipe for more articles" in iPad
    Then I validate the "Related topics" section in iPad
    And I click on one related topic in iPad
    Then I validate the header title of the topic in iPad
    And I Click Back Button on "Article Screen" in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0607 @Sanity_iPad
  Scenario: Validation of topic listing under the menu section in iPad
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
    And I click on Menu in iPad
    Then I validate the list of topics in menu section in iPad
    And I click on one of the topic in iPad
    Then I validate the header title in topic listing screen in iPad
    And I validate sort & filter in topic listing screen in iPad
    And I validate result count in topic listing screen in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0608 @Sanity_iPad
  Scenario: Validation of topic listing under the my feed section in iPad
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
    And I click on my feed section in iPad
    Then I validate the list of topics on my feed section in iPad
    And I validate the topics details on my feed section in iPad
    And I validate the topics publish time on my feed section in iPad
    And I validate the topics bookmark and share icon on my feed section in iPad
    And I click on one of the topic on my feed section in iPad
    And I click on Menu in iPad



  @iPad_CNA_0609 @Sanity_iPad
  Scenario: Validation swiping functionality and article section headers on CNA luxury Article page
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
    And I click on Menu in iPad
    And I click on CNA luxury in iPad
    Then I validate search button and settings icon in iPad
    And I click on article on luxury page in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    Then I verify scroll functionality on Home page in iPad
    And I validate the the context with "Swipe for more articles" in iPad
    Then I validate the "RELATED TOPICS" section on CNA luxury in iPad
    And I validate the "RELATED STORIES" ON CNA luxury in iPad
    Then I validate the "Outbrain" section in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0610 @Sanity_iPad
  Scenario: Validation swiping functionality and article section headers on CNA life style Article page in iPad
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
    And I click on Menu in iPad
    And I click on CNA lifeStyle in iPad
    Then I validate search button and settings icon in iPad
    And I click on article on life style page in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    Then I verify scroll functionality on Home page in iPad
    And I validate the the context with "Swipe for more articles" in iPad
    Then I validate the "RELATED TOPICS" section on CNA life style in iPad
    Then I validate the "Outbrain" section in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0611 @Sanity_iPad
  Scenario: Validation of topic listing under the life style article detail page in iPad
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
    And I click on Menu in iPad
    And I click on CNA lifeStyle in iPad
    Then I validate search button and settings icon in iPad
    And I click on article on life style page in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    Then I verify scroll functionality on Home page in iPad
    And I validate the the context with "Swipe for more articles" in iPad
    Then I validate the "RELATED TOPICS" section on CNA life style in iPad
    And I click on one related topic on life style article in iPad
    Then I validate the header title of the topic in iPad
    And I Click Back Button on "Article Screen" in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0612 @Sanity_iPad
  Scenario: Validation of topic listing under the luxury article detail page in iPad
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
    And I click on Menu in iPad
    And I click on CNA luxury in iPad
    Then I validate search button and settings icon in iPad
    And I click on article on luxury page in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    Then I verify scroll functionality on Home page in iPad
    And I validate the the context with "Swipe for more articles" in iPad
    Then I validate the "RELATED TOPICS" section on CNA life style in iPad
    And I click on one related topic on CNA luxury article in iPad
    Then I validate the header title of the topic in iPad
    And I Click Back Button on "Article Screen" in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0613 @Sanity_iPad
  Scenario: Validation of share button on life style article page in iPad
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
    And I click on Menu in iPad
    And I click on CNA lifeStyle in iPad
    And I click on article on life style page in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    Then I verify share button in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0614 @Sanity_iPad
  Scenario: Validation of share button on luxury article page in iPad
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
    And I click on Menu in iPad
    And I click on CNA luxury in iPad
    Then I validate search button and settings icon in iPad
    And I click on article on luxury page in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    Then I verify share button in iPad
   # Then I verify share external link in iPad
   # And I click on close button share info page in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0615 @iPad_CNA_Regression
  Scenario: Validation of Author details on article page(CNA life style) in iPad
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
    And I click on Menu in iPad
    And I click on CNA lifeStyle in iPad
    And I click on article on life style page in iPad
    And I validate toast message on the article page in iPad
    Then I validate the author name on life style article page in iPad
    And I click on author link on life style in iPad
    Then I wait for sometime to load Auther Screen from Article Detail Page in iPad
    And I Verify Article Auther Image in iPad
    And I Verify Article Auther Name in iPad
    And I Verify Article Result Details in iPad
    And I Verify Article Sort & Filter Details in iPad
    And I click on Done button on web view page in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0616 @Sanity_iPad
  Scenario: Validation of Author details on article page(CNA luxury) in iPad
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
    And I click on Menu in iPad
    And I click on CNA luxury in iPad
    And I click on article on luxury page in iPad
    And I validate toast message on the article page in iPad
    Then I validate the author name on life style article page in iPad
    And I click on author link on life style in iPad
    Then I wait for sometime to load Auther Screen from Article Detail Page in iPad
    And I Verify Article Auther Image in iPad
    And I Verify Article Auther Name in iPad
    And I Verify Article Result Details in iPad
    And I Verify Article Sort & Filter Details in iPad
    And I click on Done button on web view page in iPad


  @iPad_CNA_0617 @Sanity_iPad
  Scenario: Validation of font size on article page (CNA lifeStyle) in iPad
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
    And I click on Menu in iPad
    And I click on CNA lifeStyle in iPad
    And I click on article on life style page in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    And I click on font size button in iPad
    Then I validate different font size buttons in iPad
    And I Click Back Button on "Article Screen" in iPad


  @iPad_CNA_0618 @Sanity_iPad
  Scenario: Validation of font size on article page (CNA luxury) in iPad
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
    And I click on Menu in iPad
    And I click on CNA luxury in iPad
    And I click on article on luxury page in iPad
    And I validate toast message on the article page in iPad
    Then I validate the article page in iPad
    And I click on font size button in iPad
    Then I validate different font size buttons in iPad
    And I Click Back Button on "Article Screen" in iPad