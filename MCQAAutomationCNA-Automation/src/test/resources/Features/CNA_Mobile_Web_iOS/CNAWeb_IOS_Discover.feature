@CNAWeb_DiscoverPageScenarios
Feature: Discover Page scenarios

  @CNA_Mobile_Web_IOS_61 @CNA_Mobile_Web_IOS_62 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1084  @Web_CNAB-1085
  Scenario: Validate Discover Landing Page and three dots options in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    Then I click on Main menu icon in IOS Mobile Web
    And I click on Discover Menu Link in IOS Mobile Web
    Then I validate if Discovery Landing page is displayed in IOS Mobile Web
    And I validate if Trending sections, Editors Pick Section and Recommended for you section is displayed in IOS Mobile Web
    Then I Click on three dots of articles in Discover page in IOS Mobile Web
    And I validate See more like this, See fewer like this and Share options in IOS Mobile Web


  @CNA_Mobile_Web_IOS_63 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  Scenario: Validate Discover Page Surprise me Option in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    Then I click on Main menu icon in IOS Mobile Web
    And I click on Discover Menu Link in IOS Mobile Web
    Then I validate if Discovery Landing page is displayed in IOS Mobile Web
    And I Scroll down to Surprise me section in IOS Mobile Web
    Then I click on Surprise Me button in IOS Mobile Web
    And I validate if user is navigated to new tab Article Page in IOS Mobile Web

