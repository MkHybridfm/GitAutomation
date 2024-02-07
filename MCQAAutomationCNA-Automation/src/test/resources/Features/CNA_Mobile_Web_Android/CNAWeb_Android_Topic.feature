@CNAWeb_TopicListingPageScenarios
Feature: Topic Listing Page scenarios

  @CNA_Mobile_Web_Android_039 @CNA_Mobile_Web_Android_040 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1062 @Web_CNAB-1063
  Scenario: Validate Topic Listing Page and Follow button for Anonymous user in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    When I click on article from homepage in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    Then I validate if Related Topics section is present in Android Mobile Web
    And I click on a topic from Related topics section in Android Mobile Web
    Then I validate if user is navigated to Topic Listing screen in Android Mobile Web
    And I validate Topic Name,Follow button,Title sections in Android Mobile Web
    And I validate article list in topic listing screen in Android Mobile Web
    And I validate Published date, Sort Option, Filter and Pagination option in Android Mobile Web
    Then I click on Follow button for Anonymous user in Android Mobile Web
    And I validate if user is redirected to Login Page in Android Mobile Web

  @CNA_Mobile_Web_Android_041 @CNA_Mobile_Web_Android_042 @CNA_Mobile_Web_Android_043 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1064 @Web_CNAB-1065 @Web_CNAB-1066
  Scenario: Validation of Follow feature for LoggedIN user from Topic Listing Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    When I Validate SignIn Boarding page is displayed in Android Mobile Web
    And I log into web application with username and  password in Android Mobile Web
    When I click on article from homepage in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    Then I validate if Related Topics section is present in Android Mobile Web
    And I click on a topic from Related topics section in Android Mobile Web
    Then I validate if user is navigated to Topic Listing screen in Android Mobile Web
    Then I click on Follow button for LoggedIn user in Android Mobile Web
    And I validate button name is changed to "Following" in Android Mobile Web
    And I click on Following button and Unfollow the Topic in Android Mobile Web
    And I validate button name is changed to "Follow" in Android Mobile Web

  @CNA_Mobile_Web_Android_044 @Sanity @CNA_Mobile_Web_Android @Regression_Web
    @Web_CNAB-1067
  Scenario: Validation of My Feed Page if user does not follow any topic in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    When I Validate SignIn Boarding page is displayed in Android Mobile Web
    And I log into web application with username and  password in Android Mobile Web
    When I click on the User Profile Photo in Android Mobile Web
    And I validate the Profile PopUp Information Page in Android Mobile Web
    Then I click on Manage Interest Button in Android Mobile Web
    Then I validate if Manage Feed page header is displayed in Android Mobile Web
