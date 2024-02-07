@CNAWeb_WatchPageScenarios
Feature: Watch Page scenarios

  @CNA_Mobile_Web_IOS_051 @CNA_Mobile_Web_IOS_052 @CNA_Mobile_Web_IOS_053 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1074 @Web_CNAB-1075 @Web_CNAB-1076
  Scenario: Validate Watch Page Video options and Share functionality in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I click on Watch section in IOS Mobile Web
    And I validate Watch Page header in IOS Mobile Web
    Then I validate if the On Air Live video is AutoPlaying in IOS Mobile Web
    And I validate OnAir Flag and Video Title, date and Description in IOS Mobile Web
    And I validate video pause and play, maximize, Audio Mute and UnMute options in IOS Mobile Web
    And I validate Full Screen options in IOS Mobile Web
    Then I validate Share button for video Articles in Watch Page in IOS Mobile Web
    And I validate share via social platform links in IOS Mobile Web
    And I validate close pop up X button in IOS Mobile Web

  @CNA_Mobile_Web_IOS_054 @CNA_Mobile_Web_IOS_055 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1077 @Web_CNAB-1078
  Scenario: Validate Full TV schedule component in Watch Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I click on Watch section in IOS Mobile Web
    And I validate Watch Page header in IOS Mobile Web
    Then I validate Recommended section header in Watch Page in IOS Mobile Web
    And I Validate the recommended videos List in IOS Mobile Web
    Then I validate View Full TV schedule link is present in IOS Mobile Web
    And I click on View Full TV Schedule Link in IOS Mobile Web
    Then I Validate Schedule Page header in IOS Mobile Web
    And I validate if the TV schedule list is displayed in IOS Mobile Web

  @CNA_Mobile_Web_IOS_056 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1079
  Scenario: Validate Series Component Page from Watch Page in IOS Mobile Web
    Given I Open a Video series component link in IOS Mobile Web
    And I validate Series Component Page header in IOS Mobile Web
    Then I validate Program Title, Follow button, Latest Episode with Season dropdown in IOS Mobile Web
    And I validate share and Published date sections of video in IOS Mobile Web

  @CNA_Mobile_Web_IOS_058 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
    @Web_CNAB-1081
  Scenario Outline: Validate video page Sorting options in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I click on Watch section in IOS Mobile Web
    And I validate Watch Page header in IOS Mobile Web
    Then I click on more videos Link from New Videos section in My Watch Page in IOS Mobile Web
    And I validate All Videos Page Header in IOS Mobile Web
    Then I validate sort dropdown with Oldest to Newest and Most recent options in IOS Mobile Web
    And I validate if all videos are displayed with Thumbnail content in IOS Mobile Web
    And I validate if pagination functionality is available in All Videos Page in IOS Mobile Web
    Then I enter the search keyword as "<Search_text>" in search bar of All videos Page in IOS Mobile Web
    And I click Return to Main Page button in IOS Mobile Web
    Then I validate all Videos Page is refreshed and displayed in IOS Mobile Web

    Examples:
      | Search_text |
      | testingabc  |


  @CNA_Mobile_Web_IOS_059 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
  @Web_CNAB-1082
  Scenario: Validate view more button at bottom of Watch Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I click on Watch section in IOS Mobile Web
    And I validate Watch Page header in IOS Mobile Web
    Then I click on View more button at bottom of the Watch Page in IOS Mobile Web
    And I validate with Twelve Videos are loaded without refreshing the page in IOS Mobile Web

  @CNA_Mobile_Web_IOS_060  @CNA_Mobile_Web_IOS_057 @Sanity_Mobile_Web_IOS @CNA_Mobile_Web_IOS @Regression_Web
    @Web_CNAB-1083 @Web_CNAB-1080
  Scenario: Validate Video Options and Share functionality in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I click on Watch section in IOS Mobile Web
    And I validate Watch Page header in IOS Mobile Web
    Then I click on a video from watch page in IOS Mobile Web
    And I validate video page header in IOS Mobile Web
    Then I validate if the video is AutoPlaying in IOS Mobile Web
    And I validate Video Title in IOS Mobile Web
    And I validate video pause and play, maximize, Audio Mute and UnMute options in IOS Mobile Web
    And I validate Full Screen options in IOS Mobile Web

  @CNA_Mobile_Web_IOS_118 @Regression_Web @CNA_Mobile_Web_IOS
  Scenario: Validate Video on Demand Page in IOS Mobile Web
    Given I launch the CNA web application and check HomePage in IOS Mobile Web
    And I click on Watch section in IOS Mobile Web
    And I validate Watch Page header in IOS Mobile Web
    When I click on View All Programmes CTA in IOS Mobile Web
    Then I Validate Video on Demand page is displayed in IOS Mobile Web
    And I validate is search, pagination options are displayed in IOS Mobile Web

