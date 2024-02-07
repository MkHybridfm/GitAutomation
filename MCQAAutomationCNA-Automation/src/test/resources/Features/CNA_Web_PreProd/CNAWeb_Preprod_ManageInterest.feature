@CNAWeb_ManageInterestsPage
Feature: Manage Interest Page scenarios

  @CNA_Web_PreProd_045 @Sanity_Web_PreProd @CNA_Web @Regression_Web
    @Web_CNAB-1068
  Scenario: Validation of Manage Interest Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    When I Validate SignIn Boarding page is displayed in PreProd
    And I log into web application with username and  password in PreProd
    When I click on the User Profile Photo in PreProd
    And I validate the Profile PopUp Information Page in PreProd
    Then I click on Manage Interest Button in PreProd
    Then I validate if Manage Feed page header is displayed in PreProd
    Then I validate if My Topics and Add Topics tabs are displayed in PreProd
    Then I validate if Topics List is displayed in Manage feed list in PreProd
    And I validate if Cancel and Save Preferences button is displayed in Manage Feed page in PreProd
    Then I click on Add Topics List Tab in PreProd
    Then I validate if Trending Topics section is displayed in PreProd
    And I Select a topics from Trending Topics at Add Topics Page in PreProd
    Then I click on Save Preferences button at Add Topics Page in PreProd
    And I validate if user is navigated to My Feed Page in PreProd
