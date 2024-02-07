@CNAWeb_TopicListingPageScenarios
Feature: Topic Listing Page scenarios

  @CNA_Mobile_Web_IOS_039 @CNA_Mobile_Web_IOS_040 @Sanity_Mobile_Web_IOS1 @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1062 @Web_CNAB-1063
  Scenario: Validate Topic Listing Page and Follow button for Anonymous user in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I click on article from homepage in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    Then I validate if Related Topics section is present in IOS Mobile Web
    And I click on a topic from Related topics section in IOS Mobile Web
    Then I validate if user is navigated to Topic Listing screen in IOS Mobile Web
    And I validate Topic Name,Follow button,Title sections in IOS Mobile Web
    And I validate article list in topic listing screen in IOS Mobile Web
    And I validate Published date, Sort Option, Filter and Pagination option in IOS Mobile Web
    Then I click on Follow button for Anonymous user in IOS Mobile Web
    And I validate if user is redirected to Login Page in IOS Mobile Web

  @CNA_Mobile_Web_IOS_041 @CNA_Mobile_Web_IOS_042 @CNA_Mobile_Web_IOS_043 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1064 @Web_CNAB-1065 @Web_CNAB-1066 @res
  Scenario: Validation of Follow feature for LoggedIN user from Topic Listing Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    When I Validate SignIn Boarding page is displayed in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    When I click on article from homepage in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    Then I validate if Related Topics section is present in IOS Mobile Web
    And I click on a topic from Related topics section in IOS Mobile Web
    Then I validate if user is navigated to Topic Listing screen in IOS Mobile Web
    Then I click on Follow button for LoggedIn user in IOS Mobile Web
    And I validate button name is changed to "Following" in IOS Mobile Web
    And I click on Following button and Unfollow the Topic in IOS Mobile Web
    And I validate button name is changed to "Follow" in IOS Mobile Web

  @CNA_Mobile_Web_IOS_044 @Sanity @CNA_Mobile_Web_IOS @Regression_Web
    @Web_CNAB-1067
  Scenario: Validation of My Feed Page if user does not follow any topic
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    When I Validate SignIn Boarding page is displayed
    And I log into web application with username and  password
    When I click on the User Profile Photo in PreProd
    And I validate the Profile PopUp Information Page in PreProd
    Then I click on Manage Interest Button in PreProd
    Then I validate if Manage Feed page header is displayed in PreProd




