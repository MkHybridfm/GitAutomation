@CNAWeb_VideoArticleSocialMediaSectionPageScenario
Feature: Social Media Share options Validation

  @CNA_Web_108 @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1129
  Scenario: Validation of Social Media Share options in Video Article Page
    Given I launch the CNA web application and check HomePage
    And I click on Watch section
    And I validate Watch Page header
    Then I click on a video from watch page
    And I validate video page header
    Then I validate SocialMedia Share options section in video Playback area