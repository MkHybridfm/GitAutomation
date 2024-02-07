@MenuScenarios_Android_Tab @SSO_Tab
Feature: menu scenarios

  @CNA_Android_Tab_080  @Sanity_Android_Tab  @ProdSanity_Android_Tab
    @Android_Tab_CNAB-975
  Scenario: Validation of Menu Section in Android App in Tab
    Given I launch the Android App in Tab
    Then I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab
    When I Click on Do it Later Button in Android App in Tab
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab
    And I click on Yes I'll do it later option in Tab
    Then I validate the Home Page section landing header in Android App in Tab
    And I click on Menu in Android App in Tab
    Then I validate the browse All section in Android App in Tab
    And I navigate to Top stories landing page and validate the header in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on watch page from menu sec in Android App in Tab
    Then I validate the header of watch page in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click listen on menu page in Android App in Tab
    Then I validate the header as "Listen" in Android App in Tab
    Then I validate the live content on the listen page in Android App in Tab
    And I click on Menu in Android App in Tab
    And I click on special reports from menu in Android App in Tab
    Then I validate the header as Special Reports in Android App in Tab
    And I click on back arrow in Android App in Tab
    And I click on eye witness on menu sec in Android App in Tab
    Then I validate the eye witness page in Android App in Tab
    And I click on back arrow in Android App in Tab
    And I click on branded Content in Android App in Tab
    Then I validate the branded page header in Android App in Tab
