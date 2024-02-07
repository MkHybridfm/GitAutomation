@CNAWeb_VideoArticleSocialMediaSectionPageScenario
Feature: Social Media Share options Validation

  @CNA_Mobile_Web_IOS_108 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
    @Web_CNAB-1129
  Scenario: Validation of Social Media Share options in Video Article Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I click on Watch section in IOS Mobile Web
    And I validate Watch Page header in IOS Mobile Web
    Then I click on a video from watch page in IOS Mobile Web
    And I validate video page header in IOS Mobile Web
    Then I validate SocialMedia Share options section in video Playback area in IOS Mobile Web