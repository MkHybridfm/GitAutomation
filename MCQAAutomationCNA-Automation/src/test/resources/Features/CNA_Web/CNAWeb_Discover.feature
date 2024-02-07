@CNAWeb_DiscoverPageScenarios
Feature: Discover Page scenarios

  @CNA_Web_61 @CNA_Web_62 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1084  @Web_CNAB-1085
  Scenario: Validate Discover Landing Page and three dots options
    Given I launch the CNA web application and check HomePage
    And I click on Discover Menu Link
    Then I validate if Discovery Landing page is displayed
    And I validate if Trending sections, Editors Pick Section and Recommended for you section is displayed
    Then I Click on three dots of articles in Discover page
    And I validate See more like this, See fewer like this and Share options


  @CNA_Web_63 @Sanity_Web @CNA_Web @Regression_Web
  Scenario: Validate Discover Page Surprise me Option
    Given I launch the CNA web application and check HomePage
    And I click on Discover Menu Link
    Then I validate if Discovery Landing page is displayed
    And I Scroll down to Surprise me section
    Then I click on Surprise Me button
    And I validate if user is navigated to new tab Article Page

