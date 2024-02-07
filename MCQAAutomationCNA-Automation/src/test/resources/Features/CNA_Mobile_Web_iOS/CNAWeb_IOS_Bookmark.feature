@CNAWeb_BookmarkScenarios
Feature: Validation of Bookmark scenarios

  @CNA_Mobile_Web_IOS_028 @CNA_Mobile_Web_IOS_029 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1052 @Web_CNAB-1053
  Scenario: Validation of Bookmark feature for annonymous user in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I click on My feed section and validate My Feed page in IOS Mobile Web
    Then I validate if Trending Topics section is displayed in IOS Mobile Web
    And I Select a topics from Trending Topics in IOS Mobile Web
    Then I click on Save Preferences button in IOS Mobile Web
    And I validate if user is redirected to Login Page in IOS Mobile Web

  @CNA_Mobile_Web_IOS_030 @CNA_Mobile_Web_IOS_031 @CNA_Mobile_Web_IOS_032 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1055 @Web_CNAB-1056 @Web_CNAB-1057 @res
  Scenario: Validation of Bookmark feature for LoggedIN user in HomePage via 3dots in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    When I Validate SignIn Boarding page is displayed in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    When I click on three dots of a article from CNA Landing Page in IOS Mobile Web
    Then I click on Bookmark option for a Top Story in IOS Mobile Web
    And I validate if "Added to your bookmarks." toast message is displayed in IOS Mobile Web
    And I validate if Bookmark button is changed to "Bookmarked" in IOS Mobile Web
    Then I click on Bookmarked option in IOS Mobile Web
    And I validate if "Removed from your bookmarks." toast message is displayed in IOS Mobile Web
    And I validate if Bookmark button is changed to "Bookmark" in IOS Mobile Web

  @CNA_Mobile_Web_IOS_033 @CNA_Mobile_Web_IOS_034 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1058 @Web_CNAB-1059 @res
  Scenario: Validation of Bookmark feature for LoggedIN user from My Feed Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    When I Validate SignIn Boarding page is displayed in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    When I click on three dots of a article from CNA Landing Page in IOS Mobile Web
    Then I click on Bookmark option for a Top Story in IOS Mobile Web
    And I validate if "Added to your bookmarks." toast message is displayed in IOS Mobile Web
    When I click on the User Profile Photo in IOS Mobile Web
    And I validate the Profile PopUp Information Page in IOS Mobile Web
    Then I click on Bookmark Link from Profile popup screen in IOS Mobile Web
    Then I validate if bookmarked articles are present in Bookmark Page in IOS Mobile Web
    And I click on three dots of Article in bookmarks in IOS Mobile Web
    And I validate the status of Bookmark Option is "Bookmarked" in IOS Mobile Web
    Then I Click on unBookmark option in IOS Mobile Web
    And I validate if "Removed from your bookmarks." toast message is displayed in IOS Mobile Web
    And I validate the status of Bookmark Option is "Bookmark" in IOS Mobile Web


  @CNA_Mobile_Web_IOS_036 @CNA_Mobile_Web_IOS_037 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
    @Web_CNAB-1132 @Web_CNAB-1160 @res
  Scenario: Validation of Bookmark feature for LoggedIN user from article detail Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    When I Validate SignIn Boarding page is displayed in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    Then I click on a article from top stories in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    And I click on article bookmark icon from article detail page in IOS Mobile Web
    And I validate if "Added to your bookmarks." toast message is displayed in IOS Mobile Web
    When I click on the User Profile Photo in IOS Mobile Web
    And I validate the Profile PopUp Information Page in IOS Mobile Web
    Then I click on Bookmark Link from Profile popup screen in IOS Mobile Web
    Then I validate if bookmarked articles are present in Bookmark Page in IOS Mobile Web
    And I click on three dots of Article in bookmarks in IOS Mobile Web
    And I validate the status of Bookmark Option is "Bookmarked" in IOS Mobile Web
    Then I Click on unBookmark option in IOS Mobile Web
    And I validate if "Removed from your bookmarks." toast message is displayed in IOS Mobile Web
    And I validate the status of Bookmark Option is "Bookmark" in IOS Mobile Web


  @CNA_Mobile_Web_IOS_035 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web @res
  @Web_CNAB-1131
  Scenario: Validation of Bookmark feature from LoggedIn User information Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    When I Validate SignIn Boarding page is displayed in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    Then I click on a article from top stories in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    And I click on article bookmark icon from article detail page in IOS Mobile Web
    And I validate if "Added to your bookmarks." toast message is displayed in IOS Mobile Web
    When I click on the User Profile Photo in IOS Mobile Web
    And I validate the Profile PopUp Information Page in IOS Mobile Web
    Then I click on Bookmark Link from Profile popup screen in IOS Mobile Web
    Then I validate if bookmarked articles are present in Bookmark Page in IOS Mobile Web
    And I click on three dots of Article in bookmarks in IOS Mobile Web
    And I validate the status of Bookmark Option is "Bookmarked" in IOS Mobile Web
    Then I Click on unBookmark option in IOS Mobile Web
    And I validate if "Removed from your bookmarks." toast message is displayed in IOS Mobile Web
    And I validate the status of Bookmark Option is "Bookmark" in IOS Mobile Web