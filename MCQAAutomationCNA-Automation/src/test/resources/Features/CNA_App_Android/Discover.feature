@DiscoverScenarios_Android @SSO
Feature: Discover scenarios

  @CNA_Android_035  @Sanity_Android
    @Android_Mobile_CNAB-930
  Scenario: Validation of discover landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on discover section in Android App
    Then I validate the header of discover page in Android App

  @CNA_Android_036  @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-931
  Scenario: Validation of three dots on discover landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on discover section in Android App
    Then I validate the header of discover page in Android App
    And I click on three dots on discover page in Android App
    Then I validate the options on three dots in Android App

  @CNA_Android_037 @CNA_Android_038  @Sanity_Android
    @Android_Mobile_CNAB-932 @Android_Mobile_CNAB-933
  Scenario: Validation of surprise me functionality on discover landing page in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on discover section in Android App
    Then I validate the header of discover page in Android App
    And I click on article of discover page in Android App
    Then I validate the article title on article page in Android App
    And I click on back arrow on article page in Android App
    And I validate the surprise me functionality on Discover page in Android App
    And I click on surprise me button in Android App
    Then I navigate to the article page in web view in Android App
    And I click on Done button on web view page in Android App
