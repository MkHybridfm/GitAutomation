@CNAWeb_VideoArticleSocialMediaSectionPageScenario
Feature: Social Media Share options Validation

  @CNA_Web_PreProd_108 @Sanity_Web_PreProd @CNA_Web @Regression_Web
    @Web_CNAB-1129 @rew
  Scenario: Validation of Social Media Share options in Video Article Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on Watch section in PreProd
    And I validate Watch Page header in PreProd
    Then I click on a video from watch page in PreProd
    And I validate video page header in PreProd
    Then I validate SocialMedia Share options section in video Playback area in PreProd