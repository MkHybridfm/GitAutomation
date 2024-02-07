@CNAWeb_ManageInterestsPage
Feature: Manage Interest Page scenarios

  @CNA_Web_045 @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1068
  Scenario: Validation of Manage Interest Page
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    When I Validate SignIn Boarding page is displayed
    And I log into web application with username and  password
    When I click on the User Profile Photo
    And I validate the Profile PopUp Information Page
    Then I click on Manage Interest Button
    Then I validate if Manage Feed page header is displayed
    Then I validate if My Topics and Add Topics tabs are displayed
    Then I validate if Topics List is displayed in Manage feed list
    And I validate if Cancel and Save Preferences button is displayed in Manage Feed page
    Then I click on Add Topics List Tab
    Then I validate if Trending Topics section is displayed
    And I Select a topics from Trending Topics at Add Topics Page
    Then I click on Save Preferences button at Add Topics Page