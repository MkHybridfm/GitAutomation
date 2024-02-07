@CNAWeb_LoginScenarios
Feature: Login scenarios

  @CNA_Web_001 @CNA_Web_002 @CNA_Web_003 @CNA_Web_005 @CNA_Web_007
  @Web_CNAB-1026 @Web_CNAB-1028 @Web_CNAB-1030 @Web_CNAB-1032 @Web_CNAB-1027 @Web_CNAB-2405
  @Sanity_Web @CNA_Web @Regression_Web
  Scenario: Launch and validate HomePage Primary Menu Links
    Given I launch the CNA web application and check HomePage
    And I verify the Primary menu Links in HomePage
    And I Click on SignIn option from the Primary Links section
    When I Validate SignIn Boarding page is displayed
    And I log into web application with username and  password
    Then I validate Profile photo, Username and Primary Navigation Bars

  @CNA_Web_004 @Web_CNAB-1029
    @Sanity_Web @CNA_Web @Regression_Web
  Scenario Outline: Invalid Login Validation
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    When I log into web application with invalid username "<username>" and password "<password>"
    Then I See Error Message as "Invalid email or password"

    Examples:
      | username                          | password       |
      | meListen.testautomation@gmail.com |       12345678 |
      | a.meListen.testautoma@gmail.com   | testautomation |

  @CNA_Web_006 @Web_CNAB-1031
  @Sanity_Web @CNA_Web @Regression_Web
  Scenario: MeConnect Login Page Validation
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    Then I Validate Login options in SignIn Page

    #@Sanity_Web @CNA_Web @Regression_Web
  @CNA_Web_008 @Sanity_Web @Web_CNAB-1033
  Scenario: Create new MeConnect Account Validation
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    When I create a new MeConnect account from SignIn Page
    Then I validate the account got created success message

  @CNA_Web_109 @CNA_Web_110 @CNA_Web_111 @Regression_Web @CNA_Web
  Scenario: Validate Field required warning message and Forgot Password Link
    Given I launch the CNA web application and check HomePage
    And I Click on SignIn option from the Primary Links section
    Then I click on SignIn button from boarding Page
    And I validate the Field required warning message
    Then I click on Forgot Your Password Link
    And I validate if Forgot Password pop up screen is displayed
    Then I validate Submit Button and Email Text box
    And I click on Submit without entering email Id
    Then I validate Enter valid email Id message


