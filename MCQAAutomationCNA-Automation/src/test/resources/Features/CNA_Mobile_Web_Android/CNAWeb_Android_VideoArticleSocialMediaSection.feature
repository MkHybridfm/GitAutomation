@CNAWeb_VideoArticleSocialMediaSectionPageScenario
Feature: Social Media Share options Validation

  @CNA_Mobile_Web_Android_108 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
    @Web_CNAB-1129
  Scenario: Validation of Social Media Share options in Video Article Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on Watch section in Android Mobile Web
    And I validate Watch Page header in Android Mobile Web
    Then I click on a video from watch page in Android Mobile Web
    And I validate video page header in Android Mobile Web
    Then I validate SocialMedia Share options section in video Playback area in Android Mobile Web