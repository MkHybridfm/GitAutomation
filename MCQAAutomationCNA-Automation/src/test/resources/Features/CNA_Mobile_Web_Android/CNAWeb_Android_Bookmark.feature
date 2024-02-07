@CNAWeb_BookmarkScenarios
Feature: Validation of Bookmark scenarios

  @CNA_Mobile_Web_Android_028 @CNA_Mobile_Web_Android_029 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1052 @Web_CNAB-1053
  Scenario: Validation of Bookmark feature for annonymous user in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on My feed section and validate My Feed page in Android Mobile Web
    Then I validate if Trending Topics section is displayed in Android Mobile Web
    And I Select a topics from Trending Topics in Android Mobile Web
    Then I click on Save Preferences button in Android Mobile Web
    And I validate if user is redirected to Login Page in Android Mobile Web

  @CNA_Mobile_Web_Android_030 @CNA_Mobile_Web_Android_031 @CNA_Mobile_Web_Android_032 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1055 @Web_CNAB-1056 @Web_CNAB-1057
  Scenario: Validation of Bookmark feature for LoggedIN user in HomePage via 3dots in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    When I Validate SignIn Boarding page is displayed in Android Mobile Web
    And I log into web application with username and  password in Android Mobile Web
    When I click on three dots of a article from CNA Landing Page in Android Mobile Web
    Then I click on Bookmark option for a Top Story in Android Mobile Web
    And I validate if "Added to your bookmarks." toast message is displayed in Android Mobile Web
    And I validate if Bookmark button is changed to "Bookmarked" in Android Mobile Web
    Then I click on Bookmarked option in Android Mobile Web
    And I validate if "Removed from your bookmarks." toast message is displayed in Android Mobile Web
    And I validate if Bookmark button is changed to "Bookmark" in Android Mobile Web

  @CNA_Mobile_Web_Android_033 @CNA_Mobile_Web_Android_034 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1058 @Web_CNAB-1059
  Scenario: Validation of Bookmark feature for LoggedIN user from My Feed Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    When I Validate SignIn Boarding page is displayed in Android Mobile Web
    And I log into web application with username and  password in Android Mobile Web
    When I click on three dots of a article from CNA Landing Page in Android Mobile Web
    Then I click on Bookmark option for a Top Story in Android Mobile Web
    And I validate if "Added to your bookmarks." toast message is displayed in Android Mobile Web
    When I click on the User Profile Photo in Android Mobile Web
    And I validate the Profile PopUp Information Page in Android Mobile Web
    Then I click on Bookmark Link from Profile popup screen in Android Mobile Web
    Then I validate if bookmarked articles are present in Bookmark Page in Android Mobile Web
    And I click on three dots of Article in bookmarks in Android Mobile Web
    And I validate the status of Bookmark Option is "Bookmarked" in Android Mobile Web
    Then I Click on unBookmark option in Android Mobile Web
    And I validate if "Removed from your bookmarks." toast message is displayed in Android Mobile Web
    And I validate the status of Bookmark Option is "Bookmark" in Android Mobile Web


  @CNA_Mobile_Web_Android_036 @CNA_Mobile_Web_Android_037 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
    @Web_CNAB-1132 @Web_CNAB-1160
  Scenario: Validation of Bookmark feature for LoggedIN user from article detail Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    When I Validate SignIn Boarding page is displayed in Android Mobile Web
    And I log into web application with username and  password in Android Mobile Web
    Then I click on a article from top stories in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    And I click on article bookmark icon from article detail page in Android Mobile Web
    And I validate if "Added to your bookmarks." toast message is displayed in Android Mobile Web
    When I click on the User Profile Photo in Android Mobile Web
    And I validate the Profile PopUp Information Page in Android Mobile Web
    Then I click on Bookmark Link from Profile popup screen in Android Mobile Web
    Then I validate if bookmarked articles are present in Bookmark Page in Android Mobile Web
    And I click on three dots of Article in bookmarks in Android Mobile Web
    And I validate the status of Bookmark Option is "Bookmarked" in Android Mobile Web
    Then I Click on unBookmark option in Android Mobile Web
    And I validate if "Removed from your bookmarks." toast message is displayed in Android Mobile Web
    And I validate the status of Bookmark Option is "Bookmark" in Android Mobile Web


  @CNA_Mobile_Web_Android_035 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1131
  Scenario: Validation of Bookmark feature from LoggedIn User information Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    When I Validate SignIn Boarding page is displayed in Android Mobile Web
    And I log into web application with username and  password in Android Mobile Web
    Then I click on a article from top stories in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    And I click on article bookmark icon from article detail page in Android Mobile Web
    And I validate if "Added to your bookmarks." toast message is displayed in Android Mobile Web
    When I click on the User Profile Photo in Android Mobile Web
    And I validate the Profile PopUp Information Page in Android Mobile Web
    Then I click on Bookmark Link from Profile popup screen in Android Mobile Web
    Then I validate if bookmarked articles are present in Bookmark Page in Android Mobile Web
    And I click on three dots of Article in bookmarks in Android Mobile Web
    And I validate the status of Bookmark Option is "Bookmarked" in Android Mobile Web
    Then I Click on unBookmark option in Android Mobile Web
    And I validate if "Removed from your bookmarks." toast message is displayed in Android Mobile Web
    And I validate the status of Bookmark Option is "Bookmark" in Android Mobile Web