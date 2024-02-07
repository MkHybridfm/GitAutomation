@SignupScenarios @SSO
Feature: Signup scenarios

  @CNA_Android_005 @CNA_Android_006 @CNA_Android_007 @CNA_Android_008 @CNA_Android_009  @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-898 @Android_Mobile_CNAB-899 @Android_Mobile_CNAB-900 @Android_Mobile_CNAB-901 @Android_Mobile_CNAB-902
  Scenario: Verification of create new meConnect Account in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    And I Click "Get Started" Button on "CNA Onboarding Screen" in Android Mobile
    Then I validate if CNA Save preferences page is displayed in Android App
    When I Select Trending Topics in Android App
    And I Click "Save Preferences" Button on "CNA Onboarding Screen" in Android Mobile
     Then I Verify "Sign in with meconnect" Button is displayed on "CNA SignUp Screen" in Android Mobile
    And I click on create a new meConnect account in Android App
    Then I validate create meConnect account first page in Android App
    And I provide the user login credentials to log into the application in Android App
    Then I validate create meConnect account second page in Android App
    And I provide the user details of second page in Android App
    Then I validate create meConnect account third page in Android App
    And I provide the user details of third page in Android App
    Then I validate the account got created successFull message in Android App
