@CNAWeb_WatchPageScenarios
Feature: Watch Page scenarios

  @CNA_Web_PreProd_051 @CNA_Web_PreProd_052 @CNA_Web_PreProd_053 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1074 @Web_CNAB-1075 @Web_CNAB-1076
  Scenario: Validate Watch Page Video options and Share functionality in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on Watch section in PreProd
    And I validate Watch Page header in PreProd
    Then I validate if the On Air Live video is AutoPlaying in PreProd
    #And I validate OnAir Flag and Video Title, date and Description in PreProd
    And I validate video pause and play, maximize, Audio Mute and UnMute options in PreProd
    And I validate Full Screen options in PreProd
    Then I validate Share button for video Articles in Watch Page in PreProd
    And I validate share via social platform links in PreProd
    And I validate close pop up X button in PreProd

  @CNA_Web_PreProd_054 @CNA_Web_PreProd_055 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1077 @Web_CNAB-1078
  Scenario: Validate Full TV schedule component in Watch Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on Watch section in PreProd
    And I validate Watch Page header in PreProd
    Then I validate Recommended section header in Watch Page in PreProd
    And I Validate the recommended videos List in PreProd
    Then I validate View Full TV schedule link is present in PreProd
    And I click on View Full TV Schedule Link in PreProd
    Then I Validate Schedule Page header in PreProd
    And I validate if the TV schedule list is displayed in PreProd

  @CNA_Web_PreProd_056 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1079
  Scenario: Validate Series Component Page from Watch Page in PreProd
    Given I Open a Video series component link in PreProd
    And I validate Series Component Page header in PreProd
    Then I validate Program Title, Follow button, Latest Episode with Season dropdown in PreProd
    And I validate share and Published date sections of video in PreProd

  @CNA_Web_PreProd_058 @Sanity_Web_PreProd @CNA_Web @Regression_Web
    @Web_CNAB-1081
  Scenario Outline: Validate video page Sorting options in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on Watch section in PreProd
    And I validate Watch Page header in PreProd
    Then I click on more videos Link from New Videos section in My Watch Page in PreProd
    And I validate All Videos Page Header in PreProd
    Then I validate sort dropdown with Oldest to Newest and Most recent options in PreProd
    And I validate if all videos are displayed with Thumbnail content in PreProd
    And I validate if pagination functionality is available in All Videos Page in PreProd
    Then I enter the search keyword as "<Search_text>" in search bar of All videos Page in PreProd
    And I click Return to Main Page button in PreProd
    Then I validate all Videos Page is refreshed and displayed in PreProd

    Examples:
      | Search_text |
      | testingabc  |


  @CNA_Web_PreProd_059 @Sanity_Web_PreProd @CNA_Web @Regression_Web
  @Web_CNAB-1082
  Scenario: Validate view more button at bottom of Watch Page in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on Watch section in PreProd
    And I validate Watch Page header in PreProd
    Then I click on View more button at bottom of the Watch Page in PreProd
    And I validate with Twelve Videos are loaded without refreshing the page in PreProd

  @CNA_Web_PreProd_060  @CNA_Web_PreProd_057 @Sanity_Web_PreProd @CNA_Web @Regression_Web
    @Web_CNAB-1083 @Web_CNAB-1080
  Scenario: Validate Video Options and Share functionality in PreProd
    Given I launch the CNA web application and check HomePage in PreProd
    And I click on Watch section in PreProd
    And I validate Watch Page header in PreProd
    Then I click on a video from watch page in PreProd
    And I validate video page header in PreProd
    Then I validate if the video is AutoPlaying in PreProd
    And I validate Video Title in PreProd
    And I validate video pause and play, maximize, Audio Mute and UnMute options in PreProd
    And I validate Full Screen options in PreProd


