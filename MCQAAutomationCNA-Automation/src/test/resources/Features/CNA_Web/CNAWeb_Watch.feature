@CNAWeb_WatchPageScenarios
Feature: Watch Page scenarios

  @CNA_Web_051 @CNA_Web_052 @CNA_Web_053 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1074 @Web_CNAB-1075 @Web_CNAB-1076
  Scenario: Validate Watch Page Video options and Share functionality
    Given I launch the CNA web application and check HomePage
    And I click on Watch section
    And I validate Watch Page header
    Then I validate if the On Air Live video is AutoPlaying
    And I validate OnAir Flag and Video Title, date and Description
    And I validate video pause and play, maximize, Audio Mute and UnMute options
    And I validate Full Screen options
    Then I validate Share button for video Articles in Watch Page
    And I validate share via social platform links
    And I validate close pop up X button

  @CNA_Web_054 @CNA_Web_055 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1077 @Web_CNAB-1078
  Scenario: Validate Full TV schedule component in Watch Page
    Given I launch the CNA web application and check HomePage
    And I click on Watch section
    And I validate Watch Page header
    Then I validate Recommended section header in Watch Page
    And I Validate the recommended videos List
    Then I validate View Full TV schedule link is present
    And I click on View Full TV Schedule Link
    Then I Validate Schedule Page header
    And I validate if the TV schedule list is displayed

  @CNA_Web_056 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1079
  Scenario: Validate Series Component Page from Watch Page
    Given I Open a Video series component link
    And I validate Series Component Page header
    Then I validate Program Title, Follow button, Latest Episode with Season dropdown
    And I validate share and Published date sections of video

  @CNA_Web_058 @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1081
  Scenario Outline: Validate video page Sorting options
    Given I launch the CNA web application and check HomePage
    And I click on Watch section
    And I validate Watch Page header
    Then I click on more videos Link from New Videos section in My Watch Page
    And I validate All Videos Page Header
    Then I validate sort dropdown with Oldest to Newest and Most recent options
    And I validate if all videos are displayed with Thumbnail content
    And I validate if pagination functionality is available in All Videos Page
    Then I enter the search keyword as "<Search_text>" in search bar of All videos Page
    And I click Return to Main Page button
    Then I validate all Videos Page is refreshed and displayed

    Examples:
      | Search_text |
      | testingabc  |


  @CNA_Web_059 @Sanity_Web @CNA_Web @Regression_Web
  @Web_CNAB-1082
  Scenario: Validate view more button at bottom of Watch Page
    Given I launch the CNA web application and check HomePage
    And I click on Watch section
    And I validate Watch Page header
    Then I click on View more button at bottom of the Watch Page
    And I validate with Twelve Videos are loaded without refreshing the page

  @CNA_Web_060  @CNA_Web_057 @Sanity_Web @CNA_Web @Regression_Web
    @Web_CNAB-1083 @Web_CNAB-1080
  Scenario: Validate Video Options and Share functionality
    Given I launch the CNA web application and check HomePage
    And I click on Watch section
    And I validate Watch Page header
    Then I click on a video from watch page
    And I validate video page header
    Then I validate if the video is AutoPlaying
    And I validate Video Title
    And I validate video pause and play, maximize, Audio Mute and UnMute options
    And I validate Full Screen options

  @CNA_Web_118 @Regression_Web @CNA_Web
  Scenario: Validate Video on Demand Page
    Given I launch the CNA web application and check HomePage
    And I click on Watch section
    And I validate Watch Page header
    When I click on View All Programmes CTA
    Then I Validate Video on Demand page is displayed
    And I validate is search, pagination options are displayed

