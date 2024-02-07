@LifeStyleScenarios_Android @Luxury @SSO
Feature: lifeStyle scenarios

  @CNA_Android_081 @CNA_Android_082 @CNA_Android_083  @Sanity_Android
    @Android_Mobile_CNAB-976 @Android_Mobile_CNAB-977 @Android_Mobile_CNAB-978
  Scenario: Validation of toast message on life style Section in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA lifeStyle in Android App
    Then I validate search button and settings icon in Android App
    And I click on article on life style page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App

  @CNA_Android_093 @CNA_Android_094 @CNA_Android_095  @Sanity_Android
    @Android_Mobile_CNAB-989 @Android_Mobile_CNAB-990 @Android_Mobile_CNAB-991
  Scenario: Validation of toast message on luxury Section in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA luxury in Android App
    Then I validate search button and settings icon in Android App
    And I click on article on luxury page in Android App
    And I validate toast message on the article page in Android App
    Then I validate the article page in Android App

  @CNA_Android_086  @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-982
  Scenario: Validation of life style menu section in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA lifeStyle in Android App
    And I again click on Menu in Android App
    Then I validate search button and settings icon in Android App
    Then I validate the list of elements under the life style sec in Android App
    And I validate the "Entertainment" sec life style menu page in Android App
    And I validate the "Women" sec life style menu page in Android App
    And I validate the "Wellness" sec life style menu page in Android App
    And I validate the "Living" sec life style menu page in Android App
    And I validate the "Style & Beauty" sec life style menu page in Android App
    And I validate the "Dining" sec life style menu page in Android App
    And I validate the "Travel" sec life style menu page in Android App

  @CNA_Android_098  @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-994
  Scenario: Validation of luxury menu section in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    And I click on CNA luxury in Android App
    And I again click on Menu in Android App
    Then I validate search button and settings icon in Android App
    Then I validate the list of elements under the luxury sec in Android App
    And I validate the "Experiences" sec on luxury menu page in Android App
    And I validate the "Obsessions" sec on luxury menu page in Android App
    And I validate the "People" sec on luxury menu page in Android App
    And I validate the "Remarkable Living" sec on luxury menu page in Android App
