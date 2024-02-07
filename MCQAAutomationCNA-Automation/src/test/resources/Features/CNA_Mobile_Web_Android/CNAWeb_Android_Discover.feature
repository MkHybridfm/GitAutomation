@CNAWeb_DiscoverPageScenarios
Feature: Discover Page scenarios

  @CNA_Mobile_Web_Android_61 @CNA_Mobile_Web_Android_62 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1084  @Web_CNAB-1085
  Scenario: Validate Discover Landing Page and three dots options in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    Then I click on Main menu icon in Android Mobile Web
    And I click on Discover Menu Link in Android Mobile Web
    Then I validate if Discovery Landing page is displayed in Android Mobile Web
    And I validate if Trending sections, Editors Pick Section and Recommended for you section is displayed in Android Mobile Web
    Then I Click on three dots of articles in Discover page in Android Mobile Web
    And I validate See more like this, See fewer like this and Share options in Android Mobile Web


  @CNA_Mobile_Web_Android_63 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  Scenario: Validate Discover Page Surprise me Option in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    Then I click on Main menu icon in Android Mobile Web
    And I click on Discover Menu Link in Android Mobile Web
    Then I validate if Discovery Landing page is displayed in Android Mobile Web
    And I Scroll down to Surprise me section in Android Mobile Web
    Then I click on Surprise Me button in Android Mobile Web
    And I validate if user is navigated to new tab Article Page in Android Mobile Web

