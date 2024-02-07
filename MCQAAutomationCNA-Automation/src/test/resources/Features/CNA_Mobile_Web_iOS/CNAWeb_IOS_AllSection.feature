@CNAWeb_AllSectionPageScenarios_MobileWeb_IOS
Feature: All Sections Page scenarios Mobile Web IOS

  @CNA_Mobile_Web_IOS_68 @Sanity_Mobile_Web_IOS
  @Web_CNAB-1091
  Scenario: Validate All sections Page and Options in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I click on All Sections Menu Link from Home Page in IOS Mobile Web
    And I validate if All sections Page is displayed in IOS Mobile Web
    Then I validate All sections Page menu section in IOS Mobile Web
    And I validate Edition Switch Section in IOS Mobile Web
    Then I validate Search block in All sections Page in IOS Mobile Web
    And I validate Trending Topics section in IOS Mobile Web
    And I validate Follow CNA Section in IOS Mobile Web

  @CNA_Mobile_Web_IOS_123 @CNA_Mobile_Web_IOS_124 @Sanity_Mobile_Web_IOS
  Scenario: Validate Search Functionality and Close button in All Sections Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I click on All Sections Menu Link from Home Page in IOS Mobile Web
    And I validate if All sections Page is displayed in IOS Mobile Web
    Then I click on close button in All Sections Page in IOS Mobile Web
