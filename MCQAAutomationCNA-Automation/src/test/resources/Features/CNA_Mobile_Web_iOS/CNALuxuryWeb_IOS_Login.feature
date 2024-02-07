@CNALuxuryWeb_LoginLogoutScenarios
Feature: Luxury Page Login and Logout scenarios

  @CNA_Mobile_Web_IOS_89 @CNA_Mobile_Web_IOS_90 @CNA_Mobile_Web_IOS_91 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLuxury @Regression_Web
  @Web_CNAB-1111 @Web_CNAB-1112 @Web_CNAB-1113
  Scenario: Luxury Login with Valid credentials scenario in IOS Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in IOS Mobile Web
    When I Click on SignIn option from Luxury HomePage in IOS Mobile Web
    And I Validate SignIn Boarding page is displayed in IOS Mobile Web
    Then I Validate Login options in SignIn Page in IOS Mobile Web
    Then I log into web application with username and  password in IOS Mobile Web
    Then I validate if user is LoggedIN to CNA Luxury Application in IOS Mobile Web

    #@Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLuxury @Regression_Web
  @CNA_Mobile_Web_IOS_92 @Sanity_Mobile_Web_IOS @Web_CNAB-1114 @res
  Scenario: Luxury Create new MeConnect Account Validation in IOS Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in IOS Mobile Web
    When I Click on SignIn option from Luxury HomePage in IOS Mobile Web
    And I Validate SignIn Boarding page is displayed in IOS Mobile Web
    When I create a new MeConnect account from SignIn Page in IOS Mobile Web
    Then I validate the account got created success message in IOS Mobile Web

    @CNA_Mobile_Web_IOS_94 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLuxury @Regression_Web @Web_CNAB-1116
  Scenario: Luxury Logout Account Validation in IOS Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in IOS Mobile Web
    When I Click on SignIn option from Luxury HomePage in IOS Mobile Web
    And I Validate SignIn Boarding page is displayed in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    When I click on the User Profile Photo in IOS Mobile Web
    Then Popup screen should be displayed in IOS Mobile Web
    And I validate the Profile PopUp Information Page in IOS Mobile Web
    And I SignOut of the Application and validate HomePage in IOS Mobile Web

