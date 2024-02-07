@CNAWeb_LoginScenarios
Feature: Login scenarios

  @CNA_Web_PreProd_001 @CNA_Web_PreProd_002 @CNA_Web_PreProd_003 @CNA_Web_PreProd_005 @CNA_Web_PreProd_007
  @Web_CNAB-1026 @Web_CNAB-1028 @Web_CNAB-1030 @Web_CNAB-1032 @Web_CNAB-1027 @Web_CNAB-2405
  @Sanity_Web_PreProd @CNA_Web @Regression_Web
  Scenario: Launch and validate HomePage Primary Menu Links in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I verify the Primary menu Links in HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    When I Validate SignIn Boarding page is displayed in PreProd
    And I log into web application with username and  password in PreProd
    Then I validate Profile photo, Username and Primary Navigation Bars in PreProd

  @CNA_Web_PreProd_004 @Web_CNAB-1029
    @Sanity_Web_PreProd @CNA_Web @Regression_Web @re
  Scenario Outline: Invalid Login Validation in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    When I log into web application with invalid username "<username>" and password "<password>" in PreProd
    Then I See Error Message as "Invalid email or password" in PreProd

    Examples:
      | username                          | password       |
      | meListen.testautomation@gmail.com |       12345678 |
      | a.meListen.testautoma@gmail.com   | testautomation |

  @CNA_Web_PreProd_006 @Web_CNAB-1031
  @Sanity_Web_PreProd @CNA_Web @Regression_Web
  Scenario: MeConnect Login Page Validation in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    Then I Validate Login options in SignIn Page in PreProd

    #@Sanity_Web_PreProd @CNA_Web @Regression_Web
  @CNA_Web_PreProd_008 @Sanity_Web_PreProd @Web_CNAB-1033 @re
  Scenario: Create new MeConnect Account Validation in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    When I create a new MeConnect account from SignIn Page in PreProd
    Then I validate the account got created success message in PreProd

  @CNA_Web_PreProd_109 @CNA_Web_PreProd_110 @CNA_Web_PreProd_111 @Regression_Web @CNA_Web
  Scenario: Validate Field required warning message and Forgot Password Link in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    Then I click on SignIn button from boarding Page in PreProd
    And I validate the Field required warning message in PreProd
    Then I click on Forgot Your Password Link in PreProd
    And I validate if Forgot Password pop up screen is displayed in PreProd
    Then I validate Submit Button and Email Text box in PreProd
    And I click on Submit without entering email Id in PreProd
    Then I validate Enter valid email Id message in PreProd


