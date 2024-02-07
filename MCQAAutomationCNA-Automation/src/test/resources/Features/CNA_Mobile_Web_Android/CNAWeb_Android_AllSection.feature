@CNAWeb_AllSectionPageScenarios_MobileWeb_Android
Feature: All Sections Page scenarios Mobile Web Android

  @CNA_Mobile_Web_Android_68 @Sanity_Mobile_Web_Android
  @Web_CNAB-1091
  Scenario: Validate All sections Page and Options in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    When I click on All Sections Menu Link from Home Page in Android Mobile Web
    And I validate if All sections Page is displayed in Android Mobile Web
    Then I validate All sections Page menu section in Android Mobile Web
    And I validate Edition Switch Section in Android Mobile Web
    Then I validate Search block in All sections Page in Android Mobile Web
    And I validate Trending Topics section in Android Mobile Web
    And I validate Follow CNA Section in Android Mobile Web

  @CNA_Mobile_Web_Android_123 @CNA_Mobile_Web_Android_124 @Sanity_Mobile_Web_Android
  Scenario: Validate Search Functionality and Close button in All Sections Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    When I click on All Sections Menu Link from Home Page in Android Mobile Web
    And I validate if All sections Page is displayed in Android Mobile Web
    Then I click on close button in All Sections Page in Android Mobile Web
