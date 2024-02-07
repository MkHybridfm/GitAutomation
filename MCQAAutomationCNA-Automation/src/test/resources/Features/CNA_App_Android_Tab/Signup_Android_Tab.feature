@SignupScenarios_Android_Tab @SSO_Tab
Feature: Signup scenarios

  @CNA_Android_Tab_005 @CNA_Android_Tab_006 @CNA_Android_Tab_007 @CNA_Android_Tab_008 @CNA_Android_Tab_009  @Sanity_Android_Tab  @ProdSanity_Android_Tab
  @Android_Tab_CNAB-898 @Android_Tab_CNAB-899 @Android_Tab_CNAB-900 @Android_Tab_CNAB-901 @Android_Tab_CNAB-902
  Scenario: Verification of create new meConnect Account in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I click on Get Started button in Android App in Tab
    Then I validate if CNA Save preferences page is displayed in Android App in Tab
    When I Select Trending Topics in Android App in Tab
    When I Click on Save Preference button in Android App in Tab
    Then I validate if meConnect Sign Up page is displayed
    And I click on create a new meConnect account in Android App in Tab
    Then I validate create meConnect account first page in Android App in Tab
    And I provide the user login credentials to log into the application in Android App in Tab
    Then I validate create meConnect account second page in Android App in Tab
    And I provide the user details of second page in Android App in Tab
    Then I validate create meConnect account third page in Android App in Tab
    And I provide the user details of third page in Android App in Tab
    Then I validate the account got created successFull message in Android App in Tab
