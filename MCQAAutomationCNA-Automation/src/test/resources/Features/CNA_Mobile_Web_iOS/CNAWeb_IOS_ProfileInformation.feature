@CNAWeb_ProfileInformationScenarios
Feature: Profile Information PopUp Validation scenarios

  @CNA_Mobile_Web_IOS_010 @CNA_Mobile_Web_IOS_011 @CNA_Mobile_Web_IOS_012 @Web_CNAB-1035 @Web_CNAB-1036 @Web_CNAB-1037
  @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web @res
  Scenario: Profile Information PopUp validation and SignOut Validation in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    When I click on the User Profile Image in IOS Mobile Web
    Then Pop up screen should be displayed in IOS Mobile Web
    And I validate the Profile Pop Up Information Page in IOS Mobile Web
    And I SignOut of the Application and validate Home Page in IOS Mobile Web

  @CNA_Mobile_Web_IOS_112 @Regression_Web @CNA_Mobile_Web_IOS
  Scenario: Manage meConnect account validation in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    When I click on the User Profile Image in IOS Mobile Web
    Then Popup screen should be displayed in IOS Mobile Web
    And I validate if Manage meConnect Account button in IOS Mobile Web
    Then I click on Manage meConnect Account button in IOS Mobile Web
    And I validate if MeConnect Profile setup page is displayed in IOS Mobile Web