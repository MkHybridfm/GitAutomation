@CNALuxuryWeb_ArticleDetailPageScenarios_MobileWeb_Android
Feature: Luxury Article Detail Page scenarios_Mobile Web Android

  @CNA_Mobile_Web_Android_97 @CNA_Mobile_Web_Android_99 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLuxury
  @Web_CNAB-1119 @Web_CNAB-1120
  Scenario: Luxury Article Detail Page validation in Android Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in Android Mobile Web
    When I click on a article link from Luxury Landing Page in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections in Android Mobile Web
    And I validate article author Info Block and Share Options in Article detail Page in Android Mobile Web
    Then I validate Also worth Reading section in Lifestyle article detail page in Android Mobile Web
    And  I validate OutBrain section article detail page in Android Mobile Web

  @CNA_Mobile_Web_Android_98 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLuxury
    @Web_CNAB-1121
  Scenario: Luxury video Article Detail Page validation in Android Mobile Web
    Given I launch the CNA Luxury video article Url in Android Mobile Web
    Then  I  validate Luxury video article page Title in Android Mobile Web
    And I validate video is muted by default in article detail page in Android Mobile Web
    Then I validate video pause and play, maximize, Audio Mute and UnMute options in Android Mobile Web

  @CNA_Mobile_Web_Android_127 @CNA_Mobile_Web_Android_128 @Sanity_Mobile_Web_AndroidLuxury
  Scenario: Luxury Article Sticky header and expand full story validation in Android Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in Android Mobile Web
    When I click on a article link from Luxury Landing Page in Android Mobile Web
    And I validate article page Title in Android Mobile Web
    And I scroll down to article detail page end in Android Mobile Web
    Then I validate if Header and Share options are sticky at top of Page during scroll in Android Mobile Web
    Then I Validate Expand to Read full story button in Android Mobile Web
    And I click on Expand to read full Story button in Android Mobile Web
    #And I validate if full story is expanded in Android Mobile Web