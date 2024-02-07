@CNAMobile_Web_LoginScenarios_IOS @ios_web
Feature: Login scenarios for Mobile Web IOS

  @CNA_Mobile_Web_IOS_001 @CNA_Mobile_Web_IOS_002 @CNA_Mobile_Web_IOS_003 @CNA_Mobile_Web_IOS_005 @CNA_Mobile_Web_IOS_007
  @Web_CNAB-1026 @Web_CNAB-1028 @Web_CNAB-1030 @Web_CNAB-1032 @Web_CNAB-1027 @Web_CNAB-2405
  @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS
  Scenario: Launch and validate HomePage Primary Menu Links in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I verify the Primary menu Links in HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    When I Validate SignIn Boarding page is displayed in IOS Mobile Web
    And I log into web application with username and  password in IOS Mobile Web
    Then I validate Profile photo, Username and Primary Navigation Bars in IOS Mobile Web

  @CNA_Mobile_Web_IOS_004 @Web_CNAB-1029 @Sanity_Mobile_Web_IOS @res
  Scenario Outline: Invalid Login Validation in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    When I log into web application with invalid username "<username>" and password "<password>" in IOS Mobile Web
    Then I See Error Message as "Invalid email or password" in IOS Mobile Web

    Examples:
      | username                          | password       |
      | meListen.testautomation@gmail.com |       12345678 |
      | a.meListen.testautoma@gmail.com   | testautomation |

  @CNA_Mobile_Web_IOS_006 @Web_CNAB-1031
  @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @res
  Scenario: MeConnect Login Page Validation in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    Then I Validate Login options in SignIn Page in IOS Mobile Web

    #@Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @CNA_Mobile_Web_IOS_008 @Sanity_Mobile_Web_IOS @Web_CNAB-1033 @res
  Scenario: Create new MeConnect Account Validation in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    When I create a new MeConnect account from SignIn Page in IOS Mobile Web
    Then I validate the account got created success message in IOS Mobile Web

  @CNA_Mobile_Web_IOS_109 @CNA_Mobile_Web_IOS_110 @CNA_Mobile_Web_IOS_111 @CNA_Mobile_Web_IOS @Sanity_Mobile_Web_IOS @res
  Scenario: Validate Field required warning message and Forgot Password Link in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I Click on SignIn option from the Primary Links section in IOS Mobile Web
    Then I click on SignIn button from boarding Page in IOS Mobile Web
    And I validate the Field required warning message in IOS Mobile Web
    Then I click on Forgot Your Password Link in IOS Mobile Web
    And I validate if Forgot Password pop up screen is displayed in IOS Mobile Web
    Then I validate Submit Button and Email Text box in IOS Mobile Web
    And I click on Submit without entering email Id in IOS Mobile Web
    Then I validate Enter valid email Id message in IOS Mobile Web


