@CNAWeb_BookmarkScenarios
Feature: Validation of Bookmark scenarios

  @CNA_Web_028 @CNA_Web_029 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1052 @Web_CNAB-1053
  Scenario: Validation of Bookmark feature for annonymous user
    Given I launch the CNA web application and check HomePage
    And I click on My feed section and validate My Feed page
    Then I validate if Trending Topics section is displayed
    And I Select a topics from Trending Topics
    Then I click on Save Preferences button
    And I validate if user is redirected to Login Page

  @CNA_Web_030 @CNA_Web_031 @CNA_Web_032 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1055 @Web_CNAB-1056 @Web_CNAB-1057
  Scenario: Validation of Bookmark feature for LoggedIN user in HomePage via 3dots
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    When I Validate SignIn Boarding page is displayed
    And I log into web application with username and  password
    Then I click on Bookmark option for a Top Story
    And I validate if "Added to your bookmarks." toast message is displayed
    And I validate if Bookmark button is changed to "Bookmarked"
    Then I click on Bookmarked option
    And I validate if "Removed from your bookmarks." toast message is displayed
    And I validate if Bookmark button is changed to "Bookmark"

  @CNA_Web_033 @CNA_Web_034 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1058 @Web_CNAB-1059
  Scenario: Validation of Bookmark feature for LoggedIN user from My Feed Page
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    When I Validate SignIn Boarding page is displayed
    And I log into web application with username and  password
    Then I click on Bookmark option for a Top Story
    And I validate if "Added to your bookmarks." toast message is displayed
    When I click on the User Profile Photo in PreProd
    And I validate the Profile PopUp Information Page in PreProd
    Then I click on Bookmark Link from Profile popup screen in PreProd
    Then I validate if bookmarked articles are present in Bookmark Page
    And I click on three dots of Article in bookmarks
    And I validate the status of Bookmark Option is "Bookmarked"
    Then I Click on unBookmark option
    And I validate if "Removed from your bookmarks." toast message is displayed
    And I validate the status of Bookmark Option is "Bookmark"


  @CNA_Web_036 @CNA_Web_037 @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1132 @Web_CNAB-1160
  Scenario: Validation of Bookmark feature for LoggedIN user from article detail Page
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    When I Validate SignIn Boarding page is displayed
    And I log into web application with username and  password
    Then I click on a article from top stories
    And I validate article page Title
    And I click on article bookmark icon from article detail page
    And I validate if "Added to your bookmarks." toast message is displayed
    When I click on the User Profile Photo in PreProd
    And I validate the Profile PopUp Information Page in PreProd
    Then I click on Bookmark Link from Profile popup screen in PreProd
    Then I validate if bookmarked articles are present in Bookmark Page
    And I click on three dots of Article in bookmarks
    And I validate the status of Bookmark Option is "Bookmarked"
    Then I Click on unBookmark option
    And I validate if "Removed from your bookmarks." toast message is displayed
    And I validate the status of Bookmark Option is "Bookmark"


  @CNA_Web_035 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1131
  Scenario: Validation of Bookmark feature from LoggedIn User information Page
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    When I Validate SignIn Boarding page is displayed
    And I log into web application with username and  password
    Then I click on a article from top stories
    And I validate article page Title
    And I click on article bookmark icon from article detail page
    And I validate if "Added to your bookmarks." toast message is displayed
    When I click on the User Profile Photo in PreProd
    And I validate the Profile PopUp Information Page in PreProd
    Then I click on Bookmark Link from Profile popup screen in PreProd
    Then I validate if bookmarked articles are present in Bookmark Page
    And I click on three dots of Article in bookmarks
    And I validate the status of Bookmark Option is "Bookmarked"
    Then I Click on unBookmark option
    And I validate if "Removed from your bookmarks." toast message is displayed
    And I validate the status of Bookmark Option is "Bookmark"