@CNALuxuryWeb_ArticleDetailPageScenarios_MobileWeb_IOS
Feature: Luxury Article Detail Page scenarios_Mobile Web IOS

  @CNA_Mobile_Web_IOS_97 @CNA_Mobile_Web_IOS_99 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLuxury
  @Web_CNAB-1119 @Web_CNAB-1120
  Scenario: Luxury Article Detail Page validation in IOS Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in IOS Mobile Web
    When I click on a article link from Luxury Landing Page in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections in IOS Mobile Web
    And I validate article author Info Block and Share Options in Article detail Page in IOS Mobile Web
    Then I validate Also worth Reading section in Lifestyle article detail page in IOS Mobile Web
    And  I validate OutBrain section article detail page in IOS Mobile Web

  @CNA_Mobile_Web_IOS_98 @Sanity_Mobile_Web_IOS @Sanity_Mobile_Web_IOSLuxury
    @Web_CNAB-1121
  Scenario: Luxury video Article Detail Page validation in IOS Mobile Web
    Given I launch the CNA Luxury video article Url in IOS Mobile Web
    Then  I  validate Luxury video article page Title in IOS Mobile Web
    And I validate video is muted by default in article detail page in IOS Mobile Web
    Then I validate video pause and play, maximize, Audio Mute and UnMute options in IOS Mobile Web

  @CNA_Mobile_Web_IOS_127 @CNA_Mobile_Web_IOS_128 @Sanity_Mobile_Web_IOSLuxury
  Scenario: Luxury Article Sticky header and expand full story validation in IOS Mobile Web
    Given I launch the CNA Luxury web application and check HomePage in IOS Mobile Web
    When I click on a article link from Luxury Landing Page in IOS Mobile Web
    And I validate article page Title in IOS Mobile Web
    And I scroll down to article detail page end in IOS Mobile Web
    Then I validate if Header and Share options are sticky at top of Page during scroll in IOS Mobile Web
    Then I Validate Expand to Read full story button in IOS Mobile Web
    And I click on Expand to read full Story button in IOS Mobile Web
    #And I validate if full story is expanded in IOS Mobile Web