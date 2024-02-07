@CNAWeb_ArticleDetialsPageScenarios
Feature: Validation of features in Article details Page

  @CNA_Web_018 @CNA_Web_019 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1043 @Web_CNAB-1044
  Scenario: Validation of article Detail Page and Infinite scroll
    Given I launch the CNA web application and check HomePage
    When I click on article from homepage
    And I validate article page Title
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections
    And I validate Infinite scroll down functionality in Article Page

  @CNA_Web_023 @CNA_Web_024  @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1048 @Web_CNAB-1049
  Scenario: Validate 'Also worth Reading' and 'Outbrain' sections
    Given I launch the CNA web application and check HomePage
    When I click on article from homepage
    And I validate article page Title
    Then I validate Also worth Reading section
    And  I validate OutBrain section

  @CNA_Web_020  @Sanity_Web @CNA_Web @Regression_Web @Web_CNAB-1045
  Scenario: Validate video article detail page
    Given I launch the CNA web application and check HomePage
    When I click on video article from homepage
    And I validate video is muted by default in article detail page
    Then I validate video pause and play, maximize, Audio Mute and UnMute options

  @CNA_Web_022  @Sanity_Web @CNA_Web @Regression_Web  @Web_CNAB-1047
  Scenario: Validate Content Snippet in article detail page
    Given I launch the Context Snippet article detail Page
    Then I scroll down to the Context Snippet section
    And I click on Expand option
    And I validate the expanded context of Context Snippet

  @CNA_Web_021 @Sanity_Web @CNA_Web @Regression_Web @Web_CNAB-1046
  Scenario: Validate User accesses article with hero image
    Given I Open a article with hero image or gallery
    And I validate article page Title
    Then I validate the Image Icon with Carousel Images

  @CNA_Web_114 @CNA_Web_115 @CNA_Web_116 @Regression_Web @CNA_Web
  Scenario: Validate Header and Share option is sticky during scroll down in Article details page
    Given I launch the CNA web application and check HomePage
    When I click on article from homepage
    And I validate if share options are displayed in article detail Page
    And I scroll down to article detail page end
    Then I validate if Header and Share options are sticky at top of Page during scroll
    Then I Validate Expand to Read full story button
    And I click on Expand to read full Story button
    And I validate if full story is expanded





