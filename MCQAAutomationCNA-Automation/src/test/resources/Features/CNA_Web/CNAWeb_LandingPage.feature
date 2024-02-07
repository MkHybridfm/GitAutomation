@CNAWeb_LandingPageScenarios
Feature: Landing Page scenarios

  @CNA_Web_014 @CNA_Web_015 @CNA_Web_0016 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1039 @Web_CNAB-1040 @Web_CNAB-1041
  Scenario: Validate Landing Page Components
    Given I launch the CNA web application and check HomePage
    And I verify the Primary menu Links in HomePage
    And I verify all the section Pages in Landing Page
    And I verify Top Stories Primary and Secondary Components
    Then I validate all the Category Header Components from header to Elsewhere Mediacorp Widget section
    And I validate Footer section components
    And I verify header section in other component pages and during scroll down

  #   @CNA_038 @Sanity_Web
#  Scenario: Validation of Share Article popup screen // covered in Landing page scenario as @CNA_017 //

  @CNA_Web_017 @CNA_Web_038 @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1042 @Web_CNAB-1061
  Scenario: Validate Share Article Option from landing Page
    Given I launch the CNA web application and check HomePage
    When I click on the share link from any article in LandingPage
    Then I validate Copy Link button and link text
    And I validate share via social platform links
    And I validate close pop up X button

  @CNA_Web_113 @Regression_Web @CNA_Web
  Scenario: Validate View more Latest news Page
    Given I launch the CNA web application and check HomePage
    Then I click on View More Latest News button
    And I validate if Latest News Page is displayed with all Components


