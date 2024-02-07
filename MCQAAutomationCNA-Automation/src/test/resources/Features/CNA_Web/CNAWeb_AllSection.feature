@CNAWeb_AllSectionPageScenarios
Feature: All Sections Page scenarios

  @CNA_Web_68 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1091
  Scenario: Validate All sections Page and Options
    Given I launch the CNA web application and check HomePage
    When I click on All Sections Menu Link from Home Page
    And I validate if All sections Page is displayed
    Then I validate All sections Page menu section
    And I validate Edition Switch Section
    Then I validate Search block in All sections Page
    And I validate Trending Topics section
    And I validate Follow CNA Section

  @CNA_Web_123 @CNA_Web_124 @Regression_Web @CNA_Web
  Scenario Outline: Validate Search Functionality and Close button in All Sections Page
    Given I launch the CNA web application and check HomePage
    When I click on All Sections Menu Link from Home Page
    And I validate if All sections Page is displayed
    Then I enter search text in Search Text box "<Search_text>"
    And I Validate if Search results are displayed
    When I click on All Sections Menu Link from Home Page
    And I validate if All sections Page is displayed
    Then I click on close button in All Sections Page

    Examples:
      | Search_text |
      | SriLanka    |