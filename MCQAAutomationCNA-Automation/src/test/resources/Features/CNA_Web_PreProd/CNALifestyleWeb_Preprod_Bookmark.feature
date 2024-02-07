@CNALifestyleWeb_BookmarkScenarios
Feature: Lifestyle Bookmark scenarios

  @CNA_Web_PreProd_80 @Sanity_Web_PreProd @Sanity_Web_PreProdLifestyle @Regression_Web
    @Web_CNAB-1103
  Scenario: Bookmark Feature validation for anonymous user in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    When I click on three dots of a article from Lifestyle Landing Page in PreProd
    Then I click on Bookmark option for a Top Story for Anonymous User in PreProd
    And I validate if user is redirected to Login Page in PreProd

  @CNA_Web_PreProd_79 @Sanity_Web_PreProd @Sanity_Web_PreProdLifestyle @Regression_Web
  @Web_CNAB-1102
  Scenario: Validation of Bookmark feature for LoggedIN user in HomePage via 3dots in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    When I Click on SignIn option from Lifestyle HomePage in PreProd
    And I Validate SignIn Boarding page is displayed in PreProd
    Then I log into web application with username and  password in PreProd
    When I click on three dots of a article from Lifestyle Landing Page in PreProd
    Then I click on Bookmark option for a Top Story for loggedIn user in PreProd
    And I validate if "Added to your bookmarks." toast message is displayed in PreProd
    And I validate if Bookmark button is changed to "Bookmarked" in PreProd
    Then I click on Bookmarked option in PreProd
    And I validate if "Removed from your bookmarks." toast message is displayed in PreProd
    And I validate if Bookmark button is changed to "Bookmark" in PreProd