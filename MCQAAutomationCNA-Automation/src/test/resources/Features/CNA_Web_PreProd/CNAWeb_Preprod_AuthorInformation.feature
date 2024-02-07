@CNAWeb_AuthorInformationPage
Feature: Validation of Information in Author Information Page

@CNA_Web_PreProd_025 @CNA_Web_PreProd_026 @CNA_Web_PreProd_027  @Sanity_Web_PreProd @CNA_Web @Regression_Web
    @Web_CNAB-1050 @Web_CNAB-1051 @Web_CNAB-1052 @rew
    Scenario: Validate Content Snippet in Article Detail Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I click on commentary section and select a article in PreProd
    And I validate article page Title in PreProd
    And I validate article author Info Block in PreProd
    Then I click on author profile link in PreProd
    And I validate Author Profile Information Page Title in PreProd
    And I validate Author block, follow button, social link, articles list and sort sections in PreProd