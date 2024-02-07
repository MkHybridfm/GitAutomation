@CNAWeb_AuthorInformationPage
Feature: Validation of Information in Author Information Page

@CNA_Web_025 @CNA_Web_026 @CNA_Web_027  @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1050 @Web_CNAB-1051 @Web_CNAB-1052
    Scenario: Validate Author details in Article Detail Page
    Given I launch the CNA web application and check HomePage
    When I click on commentary section and select a article
    And I validate article page Title
    And I validate article author Info Block
    Then I click on author profile link
    And I validate Author Profile Information Page Title
    And I validate Author block, follow button, social link, articles list and sort sections