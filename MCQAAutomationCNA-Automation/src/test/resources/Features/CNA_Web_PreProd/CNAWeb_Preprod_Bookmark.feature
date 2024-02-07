@CNAWeb_BookmarkScenarios
Feature: Validation of Bookmark scenarios

  @CNA_Web_PreProd_028 @CNA_Web_PreProd_029 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1052 @Web_CNAB-1053
  Scenario: Validation of Bookmark feature for annonymous user in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on My feed section and validate My Feed page in PreProd
    Then I validate if Trending Topics section is displayed in PreProd
    And I Select a topics from Trending Topics in PreProd
    Then I click on Save Preferences button in PreProd
    And I validate if user is redirected to Login Page in PreProd

  @CNA_Web_PreProd_030 @CNA_Web_PreProd_031 @CNA_Web_PreProd_032 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1055 @Web_CNAB-1056 @Web_CNAB-1057
  Scenario: Validation of Bookmark feature for LoggedIN user in HomePage via 3dots in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    When I Validate SignIn Boarding page is displayed in PreProd
    And I log into web application with username and  password in PreProd
    Then I click on Bookmark option for a Top Story in PreProd
    And I validate if "Added to your bookmarks." toast message is displayed in PreProd
    And I validate if Bookmark button is changed to "Bookmarked" in PreProd
    Then I click on Bookmarked option in PreProd
    And I validate if "Removed from your bookmarks." toast message is displayed in PreProd
    And I validate if Bookmark button is changed to "Bookmark" in PreProd

  @CNA_Web_PreProd_033 @CNA_Web_PreProd_034 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1058 @Web_CNAB-1059
  Scenario: Validation of Bookmark feature for LoggedIN user from My Feed Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    When I Validate SignIn Boarding page is displayed in PreProd
    And I log into web application with username and  password in PreProd
    Then I click on Bookmark option for a Top Story in PreProd
    And I validate if "Added to your bookmarks." toast message is displayed in PreProd
    When I click on the User Profile Photo in PreProd
    And I validate the Profile PopUp Information Page in PreProd
    Then I click on Bookmark Link from Profile popup screen in PreProd
    Then I validate if bookmarked articles are present in Bookmark Page in PreProd
    And I click on three dots of Article in bookmarks in PreProd
    And I validate the status of Bookmark Option is "Bookmarked" in PreProd
    Then I Click on unBookmark option in PreProd
    And I validate if "Removed from your bookmarks." toast message is displayed in PreProd
    And I validate the status of Bookmark Option is "Bookmark" in PreProd


  @CNA_Web_PreProd_035 @CNA_Web_PreProd_036 @CNA_Web_PreProd_037 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1131 @Web_CNAB-1132 @Web_CNAB-1160
  Scenario: Validation of Bookmark feature for LoggedIN user from article detail Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    When I Validate SignIn Boarding page is displayed in PreProd
    And I log into web application with username and  password in PreProd
    Then I click on a article from top stories in PreProd
    And I validate article page Title in PreProd
    And I click on article bookmark icon from article detail page in PreProd
    And I validate if "Added to your bookmarks." toast message is displayed in PreProd
    When I click on the User Profile Photo in PreProd
    And I validate the Profile PopUp Information Page in PreProd
    Then I click on Bookmark Link from Profile popup screen in PreProd
    Then I validate if bookmarked articles are present in Bookmark Page in PreProd
    And I click on three dots of Article in bookmarks in PreProd
    And I validate the status of Bookmark Option is "Bookmarked" in PreProd
    Then I Click on unBookmark option in PreProd
    And I validate if "Removed from your bookmarks." toast message is displayed in PreProd
    And I validate the status of Bookmark Option is "Bookmark" in PreProd


