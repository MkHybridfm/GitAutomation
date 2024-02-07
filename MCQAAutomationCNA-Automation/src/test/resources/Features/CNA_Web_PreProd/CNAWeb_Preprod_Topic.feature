@CNAWeb_TopicListingPageScenarios
Feature: Topic Listing Page scenarios

  @CNA_Web_PreProd_039 @CNA_Web_PreProd_040 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1062 @Web_CNAB-1063
  Scenario: Validate Topic Listing Page and Follow button for Anonymous user in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I click on article from homepage in PreProd
    And I validate article page Title in PreProd
    Then I validate if Related Topics section is present in PreProd
    And I click on a topic from Related topics section in PreProd
    Then I validate if user is navigated to Topic Listing screen in PreProd
    And I validate Topic Name,Follow button,Title sections in PreProd
    And I validate article list in topic listing screen in PreProd
    And I validate Published date, Sort Option, Filter and Pagination option in PreProd
    Then I click on Follow button for Anonymous user in PreProd
    And I validate if user is redirected to Login Page in PreProd

  @CNA_Web_PreProd_041 @CNA_Web_PreProd_042 @CNA_Web_PreProd_043 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1064 @Web_CNAB-1065 @Web_CNAB-1066
  Scenario: Validation of Follow feature for LoggedIN user from Topic Listing Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I Click on SignIn option from the Primary Links section in PreProd
    When I Validate SignIn Boarding page is displayed in PreProd
    And I log into web application with username and  password in PreProd
    When I click on article from homepage in PreProd
    And I validate article page Title in PreProd
    Then I validate if Related Topics section is present in PreProd
    And I click on a topic from Related topics section in PreProd
    Then I validate if user is navigated to Topic Listing screen in PreProd
    Then I click on Follow button for LoggedIn user in PreProd
    And I validate button name is changed to "Following" in PreProd




