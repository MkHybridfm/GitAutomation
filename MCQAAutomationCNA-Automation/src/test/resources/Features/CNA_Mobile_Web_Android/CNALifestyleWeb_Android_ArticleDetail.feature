@CNALifestyle_MobileWeb_ArticleDetailPageScenarios_Android
Feature: Lifestyle Article Detail Page scenarios

  @CNA_Mobile_Web_Android_81 @CNA_Mobile_Web_Android_83 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLifestyle
  @Web_CNAB-1104 @Web_CNAB-1105
  Scenario: Lifestyle Article Detail Page validation in Android Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in Android Mobile Web
    When I click on a article link from top stories in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections in Android Mobile Web
    And I validate article author Info Block and Share Options in Article detail Page in Android Mobile Web
    Then I validate Also worth Reading section in Lifestyle article detail page in Android Mobile Web
    And  I validate OutBrain section article detail page in Android Mobile Web

  @CNA_Mobile_Web_Android_82 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLifestyle
    @Web_CNAB-1106
  Scenario: Lifestyle video Article Detail Page validation in Android Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in Android Mobile Web
    And I scroll down to videos section in Android Mobile Web
    When I click on a video article link in Android Mobile Web
    And I validate video is muted by default in article detail page in Android Mobile Web
    Then I validate video pause and play, maximize, Audio Mute and UnMute options in Android Mobile Web
