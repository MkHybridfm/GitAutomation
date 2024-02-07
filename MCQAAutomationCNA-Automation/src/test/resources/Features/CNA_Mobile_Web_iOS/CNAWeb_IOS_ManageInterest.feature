@CNAWeb_ManageInterestsPage
Feature: Manage Interest Page scenarios

  @CNA_Mobile_Web_IOS_045 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
    @Web_CNAB-1068
  Scenario: Validation of Manage Interest Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    When I Validate SignIn Boarding page is displayed in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    When I click on the User Profile Photo in IOS Mobile Web
    And I validate the Profile PopUp Information Page in IOS Mobile Web
    Then I click on Manage Interest Button in IOS Mobile Web
    Then I validate if Manage Feed page header is displayed in IOS Mobile Web
    Then I validate if My Topics and Add Topics tabs are displayed in IOS Mobile Web
    Then I validate if Topics List is displayed in Manage feed list in IOS Mobile Web
    And I validate if Cancel and Save Preferences button is displayed in Manage Feed page in IOS Mobile Web
    Then I click on Add Topics List Tab in IOS Mobile Web
    Then I validate if Trending Topics section is displayed in IOS Mobile Web
    And I Select a topics from Trending Topics at Add Topics Page in IOS Mobile Web
    Then I click on Save Preferences button at Add Topics Page in IOS Mobile Web