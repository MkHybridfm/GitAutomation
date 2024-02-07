@CNAMobileWeb_LandingPageScenarios_IOS @ios_web
Feature: Landing Page scenarios Mobile Web IOS

  @CNA_Mobile_Web_IOS_014 @CNA_Mobile_Web_IOS_015 @CNA_Mobile_Web_IOS_0016 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS
  @Web_CNAB-1039 @Web_CNAB-1040 @Web_CNAB-1041
  Scenario: Validate Landing Page Components in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I verify the Primary menu Links in HomePage in IOS Mobile Web
    And I verify all the section Pages in Landing Page in IOS Mobile Web
    And I verify Top Stories Primary and Secondary Components in IOS Mobile Web
    Then I validate all the Category Header Components from header to Elsewhere Mediacorp Widget section in IOS Mobile Web
    And I validate Footer section components in IOS Mobile Web
    And I verify header section in other component pages and during scroll down in IOS Mobile Web

  #   @CNA_038 @Sanity_Mobile_Web_IOS
#  Scenario: Validation of Share Article popup screen // covered in Landing page scenario as @CNA_017 //

  @CNA_Mobile_Web_IOS_017 @CNA_Mobile_Web_IOS_038 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS
    @Web_CNAB-1042 @Web_CNAB-1061
  Scenario: Validate Share Article Option from landing Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I click on the share link from any article in LandingPage in IOS Mobile Web
    Then I validate Copy Link button and link text in IOS Mobile Web
    And I validate share via social platform links in IOS Mobile Web
    And I validate close pop up X button in IOS Mobile Web

  @CNA_Mobile_Web_IOS_113 @CNA_Mobile_Web_IOS
  Scenario: Validate View more Latest news Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    Then I click on View More Latest News button in IOS Mobile Web
    And I validate if Latest News Page is displayed with all Components in IOS Mobile Web


