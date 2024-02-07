@CNAWeb_DiscoverPageScenarios
Feature: Discover Page scenarios

  @CNA_Web_PreProd_61 @CNA_Web_PreProd_62 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1084  @Web_CNAB-1085
  Scenario: Validate Discover Landing Page and three dots options in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on Discover Menu Link in PreProd
    Then I validate if Discovery Landing page is displayed in PreProd
    And I validate if Trending sections, Editors Pick Section and Recommended for you section is displayed in PreProd
    Then I Click on three dots of articles in Discover page in PreProd
    And I validate See more like this, See fewer like this and Share options in PreProd


  @CNA_Web_PreProd_63 @Sanity_Web_PreProd @CNA_Web @Regression_Web @Sanity_Web_PreProd
  Scenario: Validate Discover Page Surprise me Option in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on Discover Menu Link in PreProd
    Then I validate if Discovery Landing page is displayed in PreProd
    And I Scroll down to Surprise me section in PreProd
    Then I click on Surprise Me button in PreProd
    And I validate if user is navigated to new tab Article Page in PreProd

