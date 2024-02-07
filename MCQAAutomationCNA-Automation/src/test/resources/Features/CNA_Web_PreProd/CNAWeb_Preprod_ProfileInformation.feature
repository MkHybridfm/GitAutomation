@CNAWeb_ProfileInformationScenarios
Feature: Profile Information PopUp Validation scenarios

  @CNA_Web_PreProd_010 @CNA_Web_PreProd_011 @CNA_Web_PreProd_012 @Web_CNAB-1035 @Web_CNAB-1036 @Web_CNAB-1037
  @Sanity_Web_PreProd @CNA_Web @Regression_Web
  Scenario: Profile Information PopUp validation and SignOut Validation in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    And I log into web application with username and  password in PreProd
    When I click on the User Profile Photo in PreProd
    Then Popup screen should be displayed in PreProd
    And I validate the Profile PopUp Information Page in PreProd
    And I SignOut of the Application and validate HomePage in PreProd
