@CNAMobileWeb_LandingPageScenarios_Android
Feature: Landing Page scenarios Mobile Web Android

  @CNA_Mobile_Web_Android_014 @CNA_Mobile_Web_Android_015 @CNA_Mobile_Web_Android_0016 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android
  @Web_CNAB-1039 @Web_CNAB-1040 @Web_CNAB-1041
  Scenario: Validate Landing Page Components in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I verify the Primary menu Links in HomePage in Android Mobile Web
    And I verify all the section Pages in Landing Page in Android Mobile Web
    And I verify Top Stories Primary and Secondary Components in Android Mobile Web
    Then I validate all the Category Header Components from header to Elsewhere Mediacorp Widget section in Android Mobile Web
    And I validate Footer section components in Android Mobile Web
    And I verify header section in other component pages and during scroll down in Android Mobile Web

  #   @CNA_038 @Sanity_Mobile_Web_Android
#  Scenario: Validation of Share Article popup screen // covered in Landing page scenario as @CNA_017 //

  @CNA_Mobile_Web_Android_017 @CNA_Mobile_Web_Android_038 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android
    @Web_CNAB-1042 @Web_CNAB-1061
  Scenario: Validate Share Article Option from landing Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    When I click on the share link from any article in LandingPage in Android Mobile Web
    Then I validate Copy Link button and link text in Android Mobile Web
    And I validate share via social platform links in Android Mobile Web
    And I validate close pop up X button in Android Mobile Web

  @CNA_Mobile_Web_Android_113 @CNA_Mobile_Web_Android
  Scenario: Validate View more Latest news Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    Then I click on View More Latest News button in Android Mobile Web
    And I validate if Latest News Page is displayed with all Components in Android Mobile Web


