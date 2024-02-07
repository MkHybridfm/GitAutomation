@CNALifestyleWeb_ArticleDetailPageScenarios
Feature: Lifestyle Article Detail Page scenarios

  @CNA_Web_81 @CNA_Web_83 @Sanity_Web @Regression_Web @Sanity_WebLifestyle
  @Web_CNAB-1104 @Web_CNAB-1105
  Scenario: Lifestyle Article Detail Page validation
    Given I launch the CNA Lifestyle web application and check HomePage
    When I click on a article link from top stories
    And I validate article page Title
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections
    And I validate article author Info Block and Share Options in Article detail Page
    Then I validate Also worth Reading section in Lifestyle article detail page
    And  I validate OutBrain section article detail page

  @CNA_Web_82 @Sanity_Web @Sanity_WebLifestyle @Regression_Web
    @Web_CNAB-1106
  Scenario: Lifestyle video Article Detail Page validation
    Given I launch the CNA Lifestyle web application and check HomePage
    And I scroll down to videos section
    When I click on a video article link
    And I validate video is muted by default in article detail page
    Then I validate video pause and play, maximize, Audio Mute and UnMute options

  @CNA_Web_125 @CNA_Web_126 @Sanity_WebLifestyle @Regression_Web
  Scenario: Lifestyle Article Sticky header and expand full story validation
    Given I launch the CNA Lifestyle web application and check HomePage
    When I click on a article link from top stories
    And I validate article page Title
    And I scroll down to article detail page end
    Then I validate if Header and Share options are sticky at top of Page during scroll
    Then I Validate Expand to Read full story button
    And I click on Expand to read full Story button
    And I validate if full story is expanded
