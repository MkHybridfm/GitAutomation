@LifeStyleScenarios_Android_Tab @Luxury @SSO_Tab
Feature: lifeStyle scenarios

  @CNA_Android_Tab_081 @CNA_Android_Tab_082 @CNA_Android_Tab_083  @Sanity_Android_Tab
    @Android_Tab_CNAB-976 @Android_Tab_CNAB-977 @Android_Tab_CNAB-978

  Scenario: Validation of toast message on life style Section in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA lifeStyle in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    And I click on article on life style page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab

  @CNA_Android_Tab_093 @CNA_Android_Tab_094 @CNA_Android_Tab_095  @Sanity_Android_Tab
    @Android_Tab_CNAB-989 @Android_Tab_CNAB-990 @Android_Tab_CNAB-991
  Scenario: Validation of toast message on luxury Section in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Ta
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA luxury in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    And I click on article on luxury page in Android App in Tab
    And I validate toast message on the article page in Android App in Tab
    Then I validate the article page in Android App in Tab

  @CNA_Android_Tab_086  @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-982
  Scenario: Validation of life style menu section in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA lifeStyle in Android App in Tab
    And I again click on Menu in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    Then I validate the list of elements under the life style sec in Android App in Tab
    And I validate the "Entertainment" sec life style menu page in Android App in Tab
    And I validate the "Women" sec life style menu page in Android App in Tab
    And I validate the "Wellness" sec life style menu page in Android App in Tab
    And I validate the "Living" sec life style menu page in Android App in Tab
    And I validate the "Style & Beauty" sec life style menu page in Android App in Tab
    And I validate the "Dining" sec life style menu page in Android App in Tab
    And I validate the "Travel" sec life style menu page in Android App in Tab

  @CNA_Android_Tab_098  @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-994
  Scenario: Validation of luxury menu section in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on CNA luxury in Android App in Tab
    And I again click on Menu in Android App in Tab
    Then I validate search button and settings icon in Android App in Tab
    Then I validate the list of elements under the luxury sec in Android App in Tab
    And I validate the "Experiences" sec on luxury menu page in Android App in Tab
    And I validate the "Obsessions" sec on luxury menu page in Android App in Tab
    And I validate the "People" sec on luxury menu page in Android App in Tab
    And I validate the "Remarkable Living" sec on luxury menu page in Android App in Tab
