@CNALuxuryWeb_ArticleDetailPageScenarios
Feature: Luxury Article Detail Page scenarios

  @CNA_Web_97 @CNA_Web_99 @Sanity_Web @Sanity_WebLuxury @Regression_Web
  @Web_CNAB-1119 @Web_CNAB-1120
  Scenario: Luxury Article Detail Page validation
    Given I launch the CNA Luxury web application and check HomePage
    When I click on a article link from Luxury Landing Page
    And I validate article page Title
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections
    And I validate article author Info Block and Share Options in Article detail Page
    Then I validate Also worth Reading section in Lifestyle article detail page
    And  I validate OutBrain section article detail page

  @CNA_Web_98 @Sanity_Web @Sanity_WebLuxury @Regression_Web
    @Web_CNAB-1121
  Scenario: Luxury video Article Detail Page validation
    Given I launch the CNA Luxury video article Url
    Then  I  validate Luxury video article page Title
    And I validate video is muted by default in article detail page
    Then I validate video pause and play, maximize, Audio Mute and UnMute options

  @CNA_Web_127 @CNA_Web_128 @Sanity_WebLuxury @Regression_Web
  Scenario: Luxury Article Sticky header and expand full story validation
    Given I launch the CNA Luxury web application and check HomePage
    When I click on a article link from Luxury Landing Page
    And I validate article page Title
    And I scroll down to article detail page end
    Then I validate if Header and Share options are sticky at top of Page during scroll
    Then I Validate Expand to Read full story button
    And I click on Expand to read full Story button
    And I validate if full story is expanded