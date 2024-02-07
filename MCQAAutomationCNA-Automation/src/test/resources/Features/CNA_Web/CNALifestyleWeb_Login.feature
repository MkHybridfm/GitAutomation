@CNALifestyleWeb_LoginLogoutScenarios
Feature: Lifestyle Page Login and Logout scenarios

  @CNA_Web_71 @CNA_Web_72 @CNA_Web_73 @Sanity_Web @Sanity_WebLifestyle @Regression_Web
  @Web_CNAB-1095 @Web_CNAB-1096 @Web_CNAB-1094
  Scenario: Lifestyle Login with Valid credentials scenario
    Given I launch the CNA Lifestyle web application and check HomePage
    When I Click on SignIn option from Lifestyle HomePage
    And I Validate SignIn Boarding page is displayed
    Then I Validate Login options in SignIn Page
    Then I log into web application with username and  password
    Then I validate if user is LoggedIN to CNA Lifestyle Application

   # @Sanity_Web @Sanity_WebLifestyle @Regression_Web
  @CNA_Web_74 @Sanity_Web @Web_CNAB-1097
  Scenario: Lifestyle Create new MeConnect Account Validation
    Given I launch the CNA Lifestyle web application and check HomePage
    When I Click on SignIn option from Lifestyle HomePage
    And I Validate SignIn Boarding page is displayed
    When I create a new MeConnect account from SignIn Page
    Then I validate the account got created success message

  @CNA_Web_76 @Sanity_Web @Sanity_WebLifestyle @Regression_Web @Web_CNAB-1099
  Scenario: Lifestyle Logout Account Validation
    Given I launch the CNA Lifestyle web application and check HomePage
    When I Click on SignIn option from Lifestyle HomePage
    And I Validate SignIn Boarding page is displayed
    And I log into web application with username and  password
    When I click on the User Profile Photo
    Then Popup screen should be displayed
    And I validate the Profile PopUp Information Page
    And I SignOut of the Application and validate HomePage

