@CNAWeb_AllSectionPageScenarios
Feature: All Sections Page scenarios

  @CNA_Web_PreProd_68 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1091
  Scenario: Validate All sections Page and Options in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I click on All Sections Menu Link from Home Page in PreProd
    And I validate if All sections Page is displayed in PreProd
    Then I validate All sections Page menu section in PreProd
    And I validate Edition Switch Section in PreProd
    Then I validate Search block in All sections Page in PreProd
    And I validate Trending Topics section in PreProd
    And I validate Follow CNA Section in PreProd

  @CNA_Web_PreProd_123 @CNA_Web_PreProd_124 @Regression_Web @CNA_Web @Sanity_Web_PreProd
  Scenario Outline: Validate Search Functionality and Close button in All Sections Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I click on All Sections Menu Link from Home Page in PreProd
    And I validate if All sections Page is displayed in PreProd
    Then I enter search text in Search Text box "<Search_text>" in PreProd
    And I Validate if Search results are displayed in PreProd
    When I click on All Sections Menu Link from Home Page in PreProd
    And I validate if All sections Page is displayed in PreProd
    Then I click on close button in All Sections Page in PreProd

    Examples:
      | Search_text |
      | SriLanka    |