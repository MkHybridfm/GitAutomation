@CNALifestyleWeb_BookmarkScenarios
Feature: Lifestyle Bookmark scenarios

  @CNA_Web_80 @Sanity_Web @Sanity_WebLifestyle @Regression_Web
    @Web_CNAB-1103
  Scenario: Bookmark Feature validation for anonymous user
    Given I launch the CNA Lifestyle web application and check HomePage
    When I click on three dots of a article from Lifestyle Landing Page
    Then I click on Bookmark option for a Top Story for Anonymous User
    And I validate if user is redirected to Login Page

  @CNA_Web_79 @Sanity_Web @Sanity_WebLifestyle @Regression_Web
  @Web_CNAB-1102
  Scenario: Validation of Bookmark feature for LoggedIN user in HomePage via 3dots
    Given I launch the CNA Lifestyle web application and check HomePage
    When I Click on SignIn option from Lifestyle HomePage
    And I Validate SignIn Boarding page is displayed
    Then I log into web application with username and  password
    When I click on three dots of a article from Lifestyle Landing Page
    Then I click on Bookmark option for a Top Story for loggedIn user
    And I validate if "Added to your bookmarks." toast message is displayed
    And I validate if Bookmark button is changed to "Bookmarked"
    Then I click on Bookmarked option
    And I validate if "Removed from your bookmarks." toast message is displayed
    And I validate if Bookmark button is changed to "Bookmark"