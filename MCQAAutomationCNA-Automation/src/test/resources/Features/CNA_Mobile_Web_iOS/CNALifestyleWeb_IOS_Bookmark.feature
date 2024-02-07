@CNALifestyleWeb_BookmarkScenarios_IOS_MobileWeb
Feature: Lifestyle Bookmark scenarios

  @CNA_Mobile_Web_IOS_80 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLifestyle @Regression_Web
    @Web_CNAB-1103
  Scenario: Bookmark Feature validation for anonymous user in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    When I click on three dots of a article from Lifestyle Landing Page in IOS Mobile Web
    Then I click on Bookmark option for a Top Story for Anonymous User in IOS Mobile Web
    And I validate if user is redirected to Login Page in IOS Mobile Web

  @CNA_Mobile_Web_IOS_79 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLifestyle @Regression_Web
  @Web_CNAB-1102
  Scenario: Validation of Bookmark feature for LoggedIN user in HomePage via 3dots in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    When I Click on SignIn option from Lifestyle HomePage in IOS Mobile Web
    And I Validate SignIn Boarding page is displayed in IOS Mobile Web
    Then I log into web application with username and  password in IOS Mobile Web
    When I click on three dots of a article from Lifestyle Landing Page in IOS Mobile Web
    Then I click on Bookmark option for a Top Story for loggedIn user in IOS Mobile Web
    And I validate if "Added to your bookmarks." toast message is displayed in IOS Mobile Web
    And I validate if Bookmark button is changed to "Bookmarked" in IOS Mobile Web
    Then I click on Bookmarked option in IOS Mobile Web
    And I validate if "Removed from your bookmarks." toast message is displayed in IOS Mobile Web
    And I validate if Bookmark button is changed to "Bookmark" in IOS Mobile Web