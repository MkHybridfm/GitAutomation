@CNALifestyle_MobileWeb_ArticleDetailPageScenarios_IOS
Feature: Lifestyle Article Detail Page scenarios

  @CNA_Mobile_Web_IOS_81 @CNA_Mobile_Web_IOS_83 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLifestyle
  @Web_CNAB-1104 @Web_CNAB-1105
  Scenario: Lifestyle Article Detail Page validation in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    When I click on a article link from top stories in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections in IOS Mobile Web
    And I validate article author Info Block and Share Options in Article detail Page in IOS Mobile Web
    Then I validate Also worth Reading section in Lifestyle article detail page in IOS Mobile Web
    And  I validate OutBrain section article detail page in IOS Mobile Web

  @CNA_Mobile_Web_IOS_82 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLifestyle
    @Web_CNAB-1106
  Scenario: Lifestyle video Article Detail Page validation in IOS Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web
    And I scroll down to videos section in IOS Mobile Web
    When I click on a video article link in IOS Mobile Web
    And I validate video is muted by default in article detail page in IOS Mobile Web
    Then I validate video pause and play, maximize, Audio Mute and UnMute options in IOS Mobile Web
