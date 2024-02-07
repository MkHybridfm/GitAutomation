@MenuScenarios_Android @SSO
Feature: menu scenarios

  @CNA_Android_080  @Sanity_Android  @ProdSanity_Android
    @Android_Mobile_CNAB-975
  Scenario: Validation of Menu Section in Android App
    Given I launch the Android App
    Then I Verify "Explore CNA in a brand new way" info is displayed on "CNA OnBoarding Screen" in Android Mobile
    When I Click on Do it Later Button in Android App
    Then I validate if Notification Screen is displayed on click of Do it Later link in Android App
    And I click on Yes I'll do it later option
    Then I validate the Home Page section landing header in Android App
    And I click on Menu in Android App
    Then I validate the browse All section in Android App
    And I navigate to Top stories landing page and validate the header in Android App
    And I click on Menu in Android App
    And I click on watch page from menu sec in Android App
    Then I validate the header of watch page in Android App
    And I click on Menu in Android App
    And I click listen on menu page in Android App
    Then I validate the header as "Listen" in Android App
    Then I validate the live content on the listen page in Android App
    And I click on Menu in Android App
    And I click on special reports from menu in Android App
    Then I validate the header as Special Reports in Android App
    And I click on back arrow in Android App
    And I click on eye witness on menu sec in Android App
    Then I validate the eye witness page in Android App
    And I click on back arrow in Android App
    And I click on branded Content in Android App
    Then I validate the branded page header in Android App
