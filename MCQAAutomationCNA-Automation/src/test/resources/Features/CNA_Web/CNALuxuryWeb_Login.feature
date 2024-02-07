@CNALuxuryWeb_LoginLogoutScenarios
Feature: Luxury Page Login and Logout scenarios

  @CNA_Web_89 @CNA_Web_90 @CNA_Web_91 @Sanity_Web @Sanity_WebLuxury @Regression_Web
  @Web_CNAB-1111 @Web_CNAB-1112 @Web_CNAB-1113
  Scenario: Luxury Login with Valid credentials scenario
    Given I launch the CNA Luxury web application and check HomePage
    When I Click on SignIn option from Luxury HomePage
    And I Validate SignIn Boarding page is displayed
    Then I Validate Login options in SignIn Page
    Then I log into web application with username and  password
    Then I validate if user is LoggedIN to CNA Luxury Application

    #@Sanity_Web @Sanity_WebLuxury @Regression_Web
  @CNA_Web_92 @Sanity_Web @Web_CNAB-1114
  Scenario: Luxury Create new MeConnect Account Validation
    Given I launch the CNA Luxury web application and check HomePage
    When I Click on SignIn option from Luxury HomePage
    And I Validate SignIn Boarding page is displayed
    When I create a new MeConnect account from SignIn Page
    Then I validate the account got created success message

    @CNA_Web_94 @Sanity_Web @Sanity_WebLuxury @Regression_Web @Web_CNAB-1116
  Scenario: Luxury Logout Account Validation
    Given I launch the CNA Luxury web application and check HomePage
    When I Click on SignIn option from Luxury HomePage
    And I Validate SignIn Boarding page is displayed
    And I log into web application with username and  password
    When I click on the User Profile Photo
    Then Popup screen should be displayed
    And I validate the Profile PopUp Information Page
    And I SignOut of the Application and validate HomePage

