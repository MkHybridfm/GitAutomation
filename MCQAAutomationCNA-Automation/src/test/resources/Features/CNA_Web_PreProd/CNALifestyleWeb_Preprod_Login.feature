@CNALifestyleWeb_LoginLogoutScenarios
Feature: Lifestyle Page Login and Logout scenarios

  @CNA_Web_PreProd_71 @CNA_Web_PreProd_72 @CNA_Web_PreProd_73 @Sanity_Web_PreProd @Sanity_Web_PreProdLifestyle @Regression_Web
  @Web_CNAB-1095 @Web_CNAB-1096 @Web_CNAB-1094
  Scenario: Lifestyle Login with Valid credentials scenario in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    When I Click on SignIn option from Lifestyle HomePage in PreProd
    And I Validate SignIn Boarding page is displayed in PreProd
    Then I Validate Login options in SignIn Page in PreProd
    Then I log into web application with username and  password in PreProd
    Then I validate if user is LoggedIN to CNA Lifestyle Application in PreProd

   # @Sanity_Web_PreProd @Sanity_Web_PreProdLifestyle @Regression_Web
  @CNA_Web_PreProd_74 @Sanity_Web_PreProd @Web_CNAB-1097
  Scenario: Lifestyle Create new MeConnect Account Validation in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    When I Click on SignIn option from Lifestyle HomePage in PreProd
    And I Validate SignIn Boarding page is displayed in PreProd
    When I create a new MeConnect account from SignIn Page in PreProd
    Then I validate the account got created success message in PreProd

  @CNA_Web_PreProd_76 @Sanity_Web_PreProd @Sanity_Web_PreProdLifestyle @Regression_Web @Web_CNAB-1099
  Scenario: Lifestyle Logout Account Validation in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    When I Click on SignIn option from Lifestyle HomePage in PreProd
    And I Validate SignIn Boarding page is displayed in PreProd
    And I log into web application with username and  password in PreProd
    When I click on the User Profile Photo in PreProd
    Then Popup screen should be displayed in PreProd
    And I validate the Profile PopUp Information Page in PreProd
    And I SignOut of the Application and validate HomePage in PreProd

