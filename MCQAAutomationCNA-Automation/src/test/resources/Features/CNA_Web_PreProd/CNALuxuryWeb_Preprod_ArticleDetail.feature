@CNALuxuryWeb_ArticleDetailPageScenarios
Feature: Luxury Article Detail Page scenarios

  @CNA_Web_PreProd_97 @CNA_Web_PreProd_99 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
  @Web_CNAB-1119 @Web_CNAB-1120
  Scenario: Luxury Article Detail Page validation in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I click on a article link from Luxury Landing Page in PreProd
    And I validate article page Title in PreProd
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections in PreProd
    And I validate article author Info Block and Share Options in Article detail Page in PreProd
    Then I validate Also worth Reading section in Lifestyle article detail page in PreProd
    And  I validate OutBrain section article detail page in PreProd

  @CNA_Web_PreProd_98 @Sanity_Web_PreProd @Sanity_Web_PreProdLuxury @Regression_Web
    @Web_CNAB-1121
  Scenario: Luxury video Article Detail Page validation in PreProd
    Given I launch the CNA Luxury video article Url in PreProd
    Then  I  validate Luxury video article page Title in PreProd
    And I validate video is muted by default in article detail page in PreProd
    Then I validate video pause and play, maximize, Audio Mute and UnMute options in PreProd

  @CNA_Web_PreProd_127 @CNA_Web_PreProd_128 @Sanity_Web_PreProdLuxury @Regression_Web
  Scenario: Luxury Article Sticky header and expand full story validation in PreProd
    Given I launch the CNA Luxury web application and check HomePage in PreProd
    When I click on a article link from Luxury Landing Page in PreProd
    And I validate article page Title in PreProd
    And I scroll down to article detail page end in PreProd
    Then I validate if Header and Share options are sticky at top of Page during scroll in PreProd
    Then I Validate Expand to Read full story button in PreProd
    And I click on Expand to read full Story button in PreProd
    And I validate if full story is expanded in PreProd