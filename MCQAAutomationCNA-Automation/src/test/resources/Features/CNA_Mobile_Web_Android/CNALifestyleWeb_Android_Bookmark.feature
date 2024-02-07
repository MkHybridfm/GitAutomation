@CNALifestyleWeb_BookmarkScenarios_Android_MobileWeb
Feature: Lifestyle Bookmark scenarios

  @CNA_Mobile_Web_Android_80 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLifestyle @Regression_Web
    @Web_CNAB-1103
  Scenario: Bookmark Feature validation for anonymous user in Android Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in Android Mobile Web
    When I click on three dots of a article from Lifestyle Landing Page in Android Mobile Web
    Then I click on Bookmark option for a Top Story for Anonymous User in Android Mobile Web
    And I validate if user is redirected to Login Page in Android Mobile Web

  @CNA_Mobile_Web_Android_79 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLifestyle @Regression_Web
  @Web_CNAB-1102
  Scenario: Validation of Bookmark feature for LoggedIN user in HomePage via 3dots in Android Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in Android Mobile Web
    When I Click on SignIn option from Lifestyle HomePage in Android Mobile Web
    And I Validate SignIn Boarding page is displayed in Android Mobile Web
    Then I log into web application with username and  password in Android Mobile Web
    When I click on three dots of a article from Lifestyle Landing Page in Android Mobile Web
    Then I click on Bookmark option for a Top Story for loggedIn user in Android Mobile Web
    And I validate if "Added to your bookmarks." toast message is displayed in Android Mobile Web
    And I validate if Bookmark button is changed to "Bookmarked" in Android Mobile Web
    Then I click on Bookmarked option in Android Mobile Web
    And I validate if "Removed from your bookmarks." toast message is displayed in Android Mobile Web
    And I validate if Bookmark button is changed to "Bookmark" in Android Mobile Web