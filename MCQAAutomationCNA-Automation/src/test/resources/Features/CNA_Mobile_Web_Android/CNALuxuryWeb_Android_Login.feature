@CNALuxuryWeb_LoginLogoutScenarios
Feature: Luxury Page Login and Logout scenarios

  @CNA_Mobile_Web_Android_89 @CNA_Mobile_Web_Android_90 @CNA_Mobile_Web_Android_91 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLuxury @Regression_Web
  @Web_CNAB-1111 @Web_CNAB-1112 @Web_CNAB-1113
  Scenario: Luxury Login with Valid credentials scenario in Android Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in Android Mobile Web
    When I Click on SignIn option from Luxury HomePage in Android Mobile Web
    And I Validate SignIn Boarding page is displayed in Android Mobile Web
    Then I Validate Login options in SignIn Page in Android Mobile Web
    Then I log into web application with username and  password in Android Mobile Web
    Then I validate if user is LoggedIN to CNA Luxury Application in Android Mobile Web

    #@Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLuxury @Regression_Web
  @CNA_Mobile_Web_Android_92 @Sanity_Mobile_Web_Android @Web_CNAB-1114
  Scenario: Luxury Create new MeConnect Account Validation in Android Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in Android Mobile Web
    When I Click on SignIn option from Luxury HomePage in Android Mobile Web
    And I Validate SignIn Boarding page is displayed in Android Mobile Web
    When I create a new MeConnect account from SignIn Page in Android Mobile Web
    Then I validate the account got created success message in Android Mobile Web

    @CNA_Mobile_Web_Android_94 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLuxury @Regression_Web @Web_CNAB-1116
  Scenario: Luxury Logout Account Validation in Android Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in Android Mobile Web
    When I Click on SignIn option from Luxury HomePage in Android Mobile Web
    And I Validate SignIn Boarding page is displayed in Android Mobile Web
    And I log into web application with username and  password in Android Mobile Web
    When I click on the User Profile Photo in Android Mobile Web
    Then Popup screen should be displayed in Android Mobile Web
    And I validate the Profile PopUp Information Page in Android Mobile Web
    And I SignOut of the Application and validate HomePage in Android Mobile Web

