@SearchScenarios_Android @CNA_LifeStyle @CNA_Luxury @SSO_Tab
Feature: search scenarios

  @CNA_Android_Tab_055 @CNA_Android_Tab_056 @CNA_Android_Tab_057  @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-950 @Android_Tab_CNAB-951 @Android_Tab_CNAB-952
  Scenario: Validation of my search page on CNA in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on search button in Android App in Tab
    Then I validate the search page with "Trending Topics" in Android App in Tab
    And I enter the search keyword as "News" on search bar in Android App in Tab
    Then I verify the contents with the search key word in Android App in Tab

  @CNA_Android_Tab_055_a @CNA_Android_Tab_056_a  @CNA_Android_Tab_057_a  @Sanity_Android_Tab
    @Android_Tab_CNAB-950 @Android_Tab_CNAB-951 @Android_Tab_CNAB-952
  Scenario: Validation of my search page on CNA Luxury in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA luxury in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    And I click on search button in Android App in Tab
    Then I validate the search page with "Trending Topics" in Android App in Tab
    And I enter the search keyword as "News" on search bar in Android App in Tab
    Then I verify the contents with the search key word in Android App in Tab

  @CNA_Android_Tab_055_b @CNA_Android_Tab_056_b @CNA_Android_Tab_057_b  @Sanity_Android_Tab
    @Android_Tab_CNAB-950 @Android_Tab_CNAB-951 @Android_Tab_CNAB-952
  Scenario: Validation of my search page on CNA Life style in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA lifeStyle in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    And I click on search button in Android App in Tab
    Then I validate the search page with "Trending Topics" in Android App in Tab
    And I enter the search keyword as "News" on search bar in Android App in Tab
    Then I verify the contents with the search key word in Android App in Tab
    And I click on close button on search page in Android App in Tab
