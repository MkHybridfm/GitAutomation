@CNAWeb_ProfileInformationScenarios
Feature: Profile Information PopUp Validation scenarios

  @CNA_Mobile_Web_Android_010 @CNA_Mobile_Web_Android_011 @CNA_Mobile_Web_Android_012 @Web_CNAB-1035 @Web_CNAB-1036 @Web_CNAB-1037
  @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  Scenario: Profile Information PopUp validation and SignOut Validation in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    And I log into web application with username and  password in Android Mobile Web
    When I click on the User Profile Image in Android Mobile Web
    Then Pop up screen should be displayed in Android Mobile Web
    And I validate the Profile Pop Up Information Page in Android Mobile Web
    And I SignOut of the Application and validate Home Page in Android Mobile Web

  @CNA_Mobile_Web_Android_112 @Regression_Web @CNA_Mobile_Web_Android @Sanity_Mobile_Web_Android
  Scenario: Manage meConnect account validation in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    And I log into web application with username and  password in Android Mobile Web
    When I click on the User Profile Image in Android Mobile Web
    Then Popup screen should be displayed in Android Mobile Web
    And I validate if Manage meConnect Account button in Android Mobile Web
    Then I click on Manage meConnect Account button in Android Mobile Web
    And I validate if MeConnect Profile setup page is displayed in Android Mobile Web