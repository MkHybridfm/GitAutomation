@CNALifestyleWeb_ArticleDetailPageScenarios
Feature: Lifestyle Article Detail Page scenarios

  @CNA_Web_PreProd_81 @CNA_Web_PreProd_83 @Sanity_Web_PreProd @Regression_Web @Sanity_Web_PreProdLifestyle
  @Web_CNAB-1104 @Web_CNAB-1105
  Scenario: Lifestyle Article Detail Page validation in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    When I click on a article link from top stories in PreProd
    And I validate article page Title in PreProd
    Then I validate article page Headline, Description, image Or video, Updated & published date and full story sections in PreProd
    And I validate article author Info Block and Share Options in Article detail Page in PreProd
    Then I validate Also worth Reading section in Lifestyle article detail page in PreProd
    And  I validate OutBrain section article detail page in PreProd

  @CNA_Web_PreProd_82 @Sanity_Web_PreProd @Sanity_Web_PreProdLifestyle @Regression_Web
    @Web_CNAB-1106
  Scenario: Lifestyle video Article Detail Page validation in PreProd
    Given I launch the CNA Lifestyle web application and check HomePage in PreProd
    And I scroll down to videos section in PreProd
    When I click on a video article link in PreProd
    And I validate video is muted by default in article detail page in PreProd
    Then I validate video pause and play, maximize, Audio Mute and UnMute options in PreProd
