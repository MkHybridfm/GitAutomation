@CNAWeb_ArticleDetialsPageScenarios
Feature: Validation of features in Article details Page

  @CNA_Web_PreProd_018 @CNA_Web_PreProd_019 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1043 @Web_CNAB-1044
  Scenario: Validation of article Detail Page and Infinite scroll in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I click on article from homepage in PreProd
    And I validate article page Title in PreProd
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections in PreProd
    And I validate Infinite scroll down functionality in Article Page in PreProd

  @CNA_Web_PreProd_023 @CNA_Web_PreProd_024  @Sanity_Web_PreProd @CNA_Web @Regression_Web
    @Web_CNAB-1048 @Web_CNAB-1049
  Scenario: Validate 'Also worth Reading' and 'Outbrain' sections in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I click on article from homepage in PreProd
    And I validate article page Title in PreProd
    Then I validate Also worth Reading section in PreProd
    And  I validate OutBrain section in PreProd

  @CNA_Web_PreProd_020  @Sanity_Web_PreProd @CNA_Web @Regression_Web @Web_CNAB-1045
  Scenario: Validate video article detail page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on Watch section in PreProd
    And I validate Watch Page header in PreProd
    Then I click on a video from watch page in PreProd
    And I validate video page header in PreProd
    Then I validate if the video is AutoPlaying in PreProd
    And I validate Video Title in PreProd
    And I validate video pause and play, maximize, Audio Mute and UnMute options in PreProd

  @CNA_Web_PreProd_114 @CNA_Web_PreProd_115 @CNA_Web_PreProd_116 @Regression_Web @CNA_Web @Sanity_Web_PreProd
  Scenario: Validate Header and Share option is sticky during scroll down in Article details page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    When I click on article from homepage in PreProd
    And I validate if share options are displayed in article detail Page in PreProd
    And I scroll down to article detail page end in PreProd
    Then I validate if Header and Share options are sticky at top of Page during scroll in PreProd
    Then I Validate Expand to Read full story button in PreProd
    And I click on Expand to read full Story button in PreProd
    And I validate if full story is expanded in PreProd





