@CNAWeb_ProfileInformationScenarios
Feature: Profile Information PopUp Validation scenarios

  @CNA_Web_010 @CNA_Web_011 @CNA_Web_012 @Web_CNAB-1035 @Web_CNAB-1036 @Web_CNAB-1037
  @Sanity_Web @CNA_Web @Regression_Web
  Scenario: Profile Information PopUp validation and SignOut Validation
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    And I log into web application with username and  password
    When I click on the User Profile Photo
    Then Popup screen should be displayed
    And I validate the Profile PopUp Information Page
    And I SignOut of the Application and validate HomePage

  @CNA_Web_112 @Regression_Web @CNA_Web
  Scenario: Manage meConnect account validation
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    And I log into web application with username and  password
    When I click on the User Profile Photo
    Then Popup screen should be displayed
    And I validate if Manage meConnect Account button
    Then I click on Manage meConnect Account button
    And I validate if MeConnect Profile setup page is displayed