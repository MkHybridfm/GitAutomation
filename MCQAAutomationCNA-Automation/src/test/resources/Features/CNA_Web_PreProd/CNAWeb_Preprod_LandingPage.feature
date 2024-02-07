@CNAWeb_LandingPageScenarios
Feature: Landing Page scenarios

  @CNA_Web_PreProd_014 @CNA_Web_PreProd_015 @CNA_Web_PreProd_0016 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1039 @Web_CNAB-1040 @Web_CNAB-1041
  Scenario: Validate Landing Page Components in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I verify the Primary menu Links in HomePage in PreProd
    And I verify all the section Pages in Landing Page in PreProd
    And I verify Top Stories Primary and Secondary Components in PreProd
    Then I validate all the Category Header Components from header to Elsewhere Mediacorp Widget section in PreProd
    And I validate Footer section components in PreProd
    And I verify header section in other component pages and during scroll down in PreProd

  #   @CNA_038 @Sanity_Web_PreProd
#  Scenario: Validation of Share Article popup screen // covered in Landing page scenario as @CNA_017 //

  @CNA_Web_PreProd_017 @CNA_Web_PreProd_038 @Sanity_Web_PreProd @CNA_Web @Regression_Web
    @Web_CNAB-1042 @Web_CNAB-1061
  Scenario: Validate Share Article Option from landing Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I click on the share link from any article in LandingPage in PreProd
    Then I validate Copy Link button and link text in PreProd
    And I validate share via social platform links in PreProd
    And I validate close pop up X button in PreProd

  @CNA_Web_PreProd_113 @Regression_Web @CNA_Web @Sanity_Web_PreProd
  Scenario: Validate View more Latest news Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    Then I click on View More Latest News button in PreProd
    And I validate if Latest News Page is displayed with all Components in PreProd


