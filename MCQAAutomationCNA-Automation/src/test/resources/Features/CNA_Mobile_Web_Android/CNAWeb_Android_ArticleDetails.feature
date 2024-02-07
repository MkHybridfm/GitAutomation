@CNA_MobileWeb_ArticleDetialsPageScenarios_Android
Feature: Validation of features in Article details Page in Android device

  @CNA_Mobile_Web_Android_018 @CNA_Mobile_Web_Android_019 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android
  @Web_CNAB-1043 @Web_CNAB-1044
  Scenario: Validation of article Detail Page and Infinite scroll in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    When I click on article from homepage in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections in Android Mobile Web
    And I validate Infinite scroll down functionality in Article Page in Android Mobile Web

  @CNA_Mobile_Web_Android_023 @CNA_Mobile_Web_Android_024  @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android
    @Web_CNAB-1048 @Web_CNAB-1049
  Scenario: Validate 'Also worth Reading' and 'Outbrain' sections in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    When I click on article from homepage in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    Then I validate Also worth Reading section in Android Mobile Web
    And  I validate OutBrain section in Android Mobile Web

  @CNA_Mobile_Web_Android_020  @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Web_CNAB-1045
  Scenario: Validate video article detail page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on Main menu icon in Android Mobile Web
    Then I click on Watch page link from main menu in Android Mobile Web
    When I click on video article from homepage in Android Mobile Web
    And I validate video is muted by default in article detail page in Android Mobile Web
    Then I validate video pause and play, maximize, Audio Mute and UnMute options in Android Mobile Web

  @CNA_Mobile_Web_Android_022  @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android  @Web_CNAB-1047
  Scenario: Validate Content Snippet in article detail page in Android Mobile Web
    Given I launch the Context Snippet article detail Page in Android Mobile Web
    Then I scroll down to the Context Snippet section in Android Mobile Web
    And I click on Expand option in Android Mobile Web
    And I validate the expanded context of Context Snippet in Android Mobile Web

  @CNA_Mobile_Web_Android_021 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Web_CNAB-1046
  Scenario: Validate User accesses article with hero image in Android Mobile Web
    Given I Open a article with hero image or gallery in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    Then I validate the Image Icon with Carousel Images in Android Mobile Web
