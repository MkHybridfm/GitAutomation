@CNAWeb_TopicListingPageScenarios
Feature: Topic Listing Page scenarios

  @CNA_Web_039 @CNA_Web_040 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1062 @Web_CNAB-1063
  Scenario: Validate Topic Listing Page and Follow button for Anonymous user
    Given I launch the CNA web application and check HomePage
    When I click on article from homepage
    And I validate article page Title
    Then I validate if Related Topics section is present
    And I click on a topic from Related topics section
    Then I validate if user is navigated to Topic Listing screen
    And I validate Topic Name,Follow button,Title sections
    And I validate article list in topic listing screen
    And I validate Published date, Sort Option, Filter and Pagination option
    Then I click on Follow button for Anonymous user
    And I validate if user is redirected to Login Page

  @CNA_Web_041 @CNA_Web_042 @CNA_Web_043 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1064 @Web_CNAB-1065 @Web_CNAB-1066
  Scenario: Validation of Follow feature for LoggedIN user from Topic Listing Page
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    When I Validate SignIn Boarding page is displayed
    And I log into web application with username and  password
    When I click on article from homepage
    And I validate article page Title
    Then I validate if Related Topics section is present
    And I click on a topic from Related topics section
    Then I validate if user is navigated to Topic Listing screen
    Then I click on Follow button for LoggedIn user
    And I validate button name is changed to "Following"
    And I click on Following button and Unfollow the Topic
    And I validate button name is changed to "Follow"

  @CNA_Web_044 @Sanity @CNA_Web @Regression_Web
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




