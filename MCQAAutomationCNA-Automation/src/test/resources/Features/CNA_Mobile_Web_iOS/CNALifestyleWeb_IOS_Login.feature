@CNALifestyleWeb_LoginLogoutScenarios
Feature: Lifestyle Page Login and Logout scenarios

  @CNA_Mobile_Web_IOS_71 @CNA_Mobile_Web_IOS_72 @CNA_Mobile_Web_IOS_73 @Sanity_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1095 @Web_CNAB-1096 @Web_CNAB-1094
  Scenario: Lifestyle Login with Valid credentials scenario in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    When I Click on SignIn option from Lifestyle HomePage in IOS Mobile Web
    And I Validate SignIn Boarding page is displayed in IOS Mobile Web
    Then I Validate Login options in SignIn Page in IOS Mobile Web
    Then I log into web application with username and  password in IOS Mobile Web
    Then I validate if user is LoggedIN to CNA Lifestyle Application in IOS Mobile Web

   # @Sanity_Mobile_Web_IOSLifestyle @Sanity_Mobile_Web_IOSLifestyleLifestyle @Regression_Web
  @CNA_Mobile_Web_IOS_74 @Sanity_Mobile_Web_IOS @Web_CNAB-1097 @res
  Scenario: Lifestyle Create new MeConnect Account Validation in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    When I Click on SignIn option from Lifestyle HomePage in IOS Mobile Web
    And I Validate SignIn Boarding page is displayed in IOS Mobile Web
    When I create a new MeConnect account from SignIn Page in IOS Mobile Web
    Then I validate the account got created success message in IOS Mobile Web

  @CNA_Mobile_Web_IOS_76 @Sanity_Mobile_Web_IOSLifestyle @Sanity_Mobile_Web_IOS @Web_CNAB-1099
  Scenario: Lifestyle Logout Account Validation
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    When I Click on SignIn option from Lifestyle HomePage in IOS Mobile Web
    And I Validate SignIn Boarding page is displayed in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    When I click on the User Profile Photo in IOS Mobile Web
    Then Popup screen should be displayed in IOS Mobile Web
    And I validate the Profile PopUp Information Page in IOS Mobile Web
    And I SignOut of the Application and validate HomePage in IOS Mobile Web


