@CNAWeb_AuthorInformationPage
Feature: Validation of Information in Author Information Page

@CNA_Mobile_Web_Android_025 @CNA_Mobile_Web_Android_026 @CNA_Mobile_Web_Android_027  @Sanity_Mobile_Web_Android
    @Web_CNAB-1050 @Web_CNAB-1051 @Web_CNAB-1052
    Scenario: Validate Author details in Article Detail Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on Main menu icon in Android Mobile Web
    Then I click on commentary section page link from the menu in Android Mobile Web
    Then I click on an article link from commentary page in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    And I validate article author Info Block in Android Mobile Web
    Then I click on author profile link in Android Mobile Web
    And I validate Author Profile Information Page Title in Android Mobile Web
    And I validate Author block, follow button, social link, articles list and sort sections in Android Mobile Web