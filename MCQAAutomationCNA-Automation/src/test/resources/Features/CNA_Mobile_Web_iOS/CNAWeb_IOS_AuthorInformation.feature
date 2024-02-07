@CNAWeb_AuthorInformationPage
Feature: Validation of Information in Author Information Page

@CNA_Mobile_Web_IOS_025 @CNA_Mobile_Web_IOS_026 @CNA_Mobile_Web_IOS_027  @Sanity_Mobile_Web_IOS
    @Web_CNAB-1050 @Web_CNAB-1051 @Web_CNAB-1052 @res
    Scenario: Validate Author details in Article Detail Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I click on Main menu icon in IOS Mobile Web
    Then I click on commentary section page link from the menu in IOS Mobile Web
    Then I click on an article link from commentary page in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    And I validate article author Info Block in IOS Mobile Web
    Then I click on author profile link in IOS Mobile Web
    And I validate Author Profile Information Page Title in IOS Mobile Web
    And I validate Author block, follow button, social link, articles list and sort sections in IOS Mobile Web