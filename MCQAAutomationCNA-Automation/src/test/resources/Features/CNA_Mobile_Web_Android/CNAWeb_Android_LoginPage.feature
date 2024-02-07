@CNAMobile_Web_LoginScenarios
Feature: Login scenarios for Mobile Web Android

  @CNA_Mobile_Web_Android_001 @CNA_Mobile_Web_Android_002 @CNA_Mobile_Web_Android_003 @CNA_Mobile_Web_Android_005 @CNA_Mobile_Web_Android_007
  @Web_CNAB-1026 @Web_CNAB-1028 @Web_CNAB-1030 @Web_CNAB-1032 @Web_CNAB-1027 @Web_CNAB-2405
  @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android
  Scenario: Launch and validate HomePage Primary Menu Links in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I verify the Primary menu Links in HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    When I Validate SignIn Boarding page is displayed in Android Mobile Web
    And I log into web application with username and  password in Android Mobile Web
    Then I validate Profile photo, Username and Primary Navigation Bars in Android Mobile Web

  @CNA_Mobile_Web_Android_004 @Web_CNAB-1029 @Sanity_Mobile_Web_Android
  Scenario Outline: Invalid Login Validation in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    When I log into web application with invalid username "<username>" and password "<password>" in Android Mobile Web
    Then I See Error Message as "Invalid email or password" in Android Mobile Web

    Examples:
      | username                          | password       |
      | meListen.testautomation@gmail.com |       12345678 |
      | a.meListen.testautoma@gmail.com   | testautomation |

  @CNA_Mobile_Web_Android_006 @Web_CNAB-1031
  @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android
  Scenario: MeConnect Login Page Validation in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    Then I Validate Login options in SignIn Page in Android Mobile Web

    #@Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @CNA_Mobile_Web_Android_008 @Sanity_Mobile_Web_Android @Web_CNAB-1033
  Scenario: Create new MeConnect Account Validation in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    When I create a new MeConnect account from SignIn Page in Android Mobile Web
    Then I validate the account got created success message in Android Mobile Web

  @CNA_Mobile_Web_Android_109 @CNA_Mobile_Web_Android_110 @CNA_Mobile_Web_Android_111 @CNA_Mobile_Web_Android @Sanity_Mobile_Web_Android
  Scenario: Validate Field required warning message and Forgot Password Link in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I Click on SignIn option from the Primary Links section in Android Mobile Web
    Then I click on SignIn button from boarding Page in Android Mobile Web
    And I validate the Field required warning message in Android Mobile Web
    Then I click on Forgot Your Password Link in Android Mobile Web
    And I validate if Forgot Password pop up screen is displayed in Android Mobile Web
    Then I validate Submit Button and Email Text box in Android Mobile Web
    And I click on Submit without entering email Id in Android Mobile Web
    Then I validate Enter valid email Id message in Android Mobile Web


