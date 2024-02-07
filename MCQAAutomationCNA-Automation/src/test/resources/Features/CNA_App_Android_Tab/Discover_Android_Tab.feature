@DiscoverScenarios_Android_Tab @SSO_Tab
Feature: Discover scenarios

  @CNA_Android_Tab_035  @Sanity_Android_Tab
    @Android_Tab_CNAB-930
  Scenario: Validation of discover landing page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on discover section in Android App in Tab
    Then I validate the header of discover page in Android App in Tab

  @CNA_Android_Tab_036  @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-931
  Scenario: Validation of three dots on discover landing page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on discover section in Android App in Tab
    Then I validate the header of discover page in Android App in Tab
    And I click on three dots on discover page in Android App in Tab
    Then I validate the options on three dots in Android App in Tab

  @CNA_Android_Tab_037 @CNA_Android_Tab_038  @Sanity_Android_Tab
    @Android_Tab_CNAB-932 @Android_Tab_CNAB-933
  Scenario: Validation of surprise me functionality on discover landing page in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on discover section in Android App in Tab
    Then I validate the header of discover page in Android App in Tab
    And I click on article of discover page in Android App in Tab
    Then I validate the article title on article page in Android App in Tab
    And I click on back arrow on article page in Android App in Tab
    And I validate the surprise me functionality on Discover page in Android App in Tab
    And I click on surprise me button in Android App in Tab
    Then I navigate to the article page in web view in Android App in Tab
    And I click on Done button on web view page in Android App in Tab
