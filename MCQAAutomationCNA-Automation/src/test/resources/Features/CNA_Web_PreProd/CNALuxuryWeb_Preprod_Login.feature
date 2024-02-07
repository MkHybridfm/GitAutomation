@CNALuxuryWeb_LoginLogoutScenarios
Feature: Luxury Page Login and Logout scenarios

  @CNA_Web_PreProd_89 @CNA_Web_PreProd_90 @CNA_Web_PreProd_91 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
  @Web_CNAB-1111 @Web_CNAB-1112 @Web_CNAB-1113
  Scenario: Luxury Login with Valid credentials scenario in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I Click on SignIn option from Luxury HomePage in PreProd
    And I Validate SignIn Boarding page is displayed in PreProd
    Then I Validate Login options in SignIn Page in PreProd
    Then I log into web application with username and  password in PreProd
    Then I validate if user is LoggedIN to CNA Luxury Application in PreProd

    #@Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
  @CNA_Web_PreProd_92 @Sanity_Web_PreProd @Web_CNAB-1114 @rew
  Scenario: Luxury Create new MeConnect Account Validation in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I Click on SignIn option from Luxury HomePage in PreProd
    And I Validate SignIn Boarding page is displayed in PreProd
    When I create a new MeConnect account from SignIn Page in PreProd
    Then I validate the account got created success message in PreProd

    @CNA_Web_PreProd_94 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web @Web_CNAB-1116
  Scenario: Luxury Logout Account Validation in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I Click on SignIn option from Luxury HomePage in PreProd
    And I Validate SignIn Boarding page is displayed in PreProd
    And I log into web application with username and  password in PreProd
    When I click on the User Profile Photo in PreProd
    Then Popup screen should be displayed in PreProd
    And I validate the Profile PopUp Information Page in PreProd
    And I SignOut of the Application and validate HomePage in PreProd

