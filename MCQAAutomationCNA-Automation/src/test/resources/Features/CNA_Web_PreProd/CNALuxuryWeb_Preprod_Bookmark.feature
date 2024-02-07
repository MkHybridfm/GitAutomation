@CNALuxuryWeb_BookmarkScenarios
Feature: Luxury Bookmark scenarios

  @CNA_Web_PreProd_104 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
    @Web_CNAB-1126
  Scenario: Bookmark Feature validation for anonymous user in Luxury application in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I click on three dots of a article from Luxury Landing Page in PreProd
    Then I click on Bookmark option for a Top Story for Anonymous User in PreProd
    And I validate if user is redirected to Login Page in PreProd

  @CNA_Web_PreProd_103 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
  @Web_CNAB-1125
  Scenario: Validation of Luxury Bookmark feature for LoggedIN user in HomePage via 3dots in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I Click on SignIn option from Luxury HomePage in PreProd
    And I Validate SignIn Boarding page is displayed in PreProd
    Then I log into web application with username and  password in PreProd
    When I click on three dots of a article from Luxury Landing Page in PreProd
    Then I click on Bookmark option for a Top Story for loggedIn user in PreProd
    And I validate if "Added to your bookmarks." toast message is displayed in PreProd
    And I validate if Bookmark button is changed to "Bookmarked" in PreProd
    Then I click on Bookmarked option in PreProd
    And I validate if "Removed from your bookmarks." toast message is displayed in PreProd
    And I validate if Bookmark button is changed to "Bookmark" in PreProd