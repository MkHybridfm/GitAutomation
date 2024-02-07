@CNA_MobileWeb_ArticleDetialsPageScenarios_IOS
Feature: Validation of features in Article details Page in IOS device

  @CNA_Mobile_Web_IOS_018 @CNA_Mobile_Web_IOS_019 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @ios_web
  @Web_CNAB-1043 @Web_CNAB-1044
  Scenario: Validation of article Detail Page and Infinite scroll in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I click on article from homepage in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections in IOS Mobile Web
    And I validate Infinite scroll down functionality in Article Page in IOS Mobile Web

  @CNA_Mobile_Web_IOS_023 @CNA_Mobile_Web_IOS_024  @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @ios_web
    @Web_CNAB-1048 @Web_CNAB-1049
  Scenario: Validate 'Also worth Reading' and 'Outbrain' sections in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I click on article from homepage in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    Then I validate Also worth Reading section in IOS Mobile Web
    And  I validate OutBrain section in IOS Mobile Web

  @CNA_Mobile_Web_IOS_020  @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Web_CNAB-1045
  Scenario: Validate video article detail page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I click on video article from homepage in IOS Mobile Web
    And I validate video is muted by default in article detail page in IOS Mobile Web
    Then I validate video pause and play, maximize, Audio Mute and UnMute options in IOS Mobile Web

  @CNA_Mobile_Web_IOS_022  @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS  @Web_CNAB-1047 @ios_web
  Scenario: Validate Content Snippet in article detail page in IOS Mobile Web
    Given I launch the Context Snippet article detail Page in IOS Mobile Web
    Then I scroll down to the Context Snippet section in IOS Mobile Web
    And I click on Expand option in IOS Mobile Web
    And I validate the expanded context of Context Snippet in IOS Mobile Web

  @CNA_Mobile_Web_IOS_021 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Web_CNAB-1046 @ios_web
  Scenario: Validate User accesses article with hero image in IOS Mobile Web
    Given I Open a article with hero image or gallery in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    Then I validate the Image Icon with Carousel Images in IOS Mobile Web

  @CNA_Mobile_Web_IOS_114 @CNA_Mobile_Web_IOS_115 @CNA_Mobile_Web_IOS_116 @CNA_Mobile_Web_IOS
  Scenario: Validate Header and Share option is sticky during scroll down in Article details page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    When I click on article from homepage in IOS Mobile Web
    And I validate if share options are displayed in article detail Page in IOS Mobile Web
    And I scroll down to article detail page end in IOS Mobile Web
    Then I validate if Header and Share options are sticky at top of Page during scroll in IOS Mobile Web
    Then I Validate Expand to Read full story button in IOS Mobile Web
    And I click on Expand to read full Story button in IOS Mobile Web
    And I validate if full story is expanded in IOS Mobile Web