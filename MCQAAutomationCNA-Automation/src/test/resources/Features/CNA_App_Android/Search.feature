@SearchScenarios_Android @CNA_LifeStyle @CNA_Luxury @SSO
Feature: search scenarios

  @CNA_Android_055 @CNA_Android_056 @CNA_Android_057  @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-950 @Android_Mobile_CNAB-951 @Android_Mobile_CNAB-952
  Scenario: Validation of my search page on CNA in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on search button in Android App
    Then I validate the search page with "Trending Topics" in Android App
    And I enter the search keyword as "News" on search bar in Android App
    Then I verify the contents with the search key word in Android App

  @CNA_Android_055_a @CNA_Android_056_a  @CNA_Android_057_a  @Sanity_Android
  @Android_Mobile_CNAB-950 @Android_Mobile_CNAB-951 @Android_Mobile_CNAB-952
  Scenario: Validation of my search page on CNA Luxury in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA luxury in Android App
    Then I validate search button and settings icon in Android App
    And I click on search button in Android App
    Then I validate the search page with "Trending Topics" in Android App
    And I enter the search keyword as "News" on search bar in Android App
    Then I verify the contents with the search key word in Android App

  @CNA_Android_055_b @CNA_Android_056_b @CNA_Android_057_b  @Sanity_Android
  @Android_Mobile_CNAB-950 @Android_Mobile_CNAB-951 @Android_Mobile_CNAB-952
  Scenario: Validation of my search page on CNA Life style in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA lifeStyle in Android App
    Then I validate search button and settings icon in Android App
    And I click on search button in Android App
    Then I validate the search page with "Trending Topics" in Android App
    And I enter the search keyword as "News" on search bar in Android App
    Then I verify the contents with the search key word in Android App
    And I click on close button on search page in Android App
