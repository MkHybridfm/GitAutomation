@CNAWeb_WatchPageScenarios
Feature: Watch Page scenarios

  @CNA_Mobile_Web_Android_051 @CNA_Mobile_Web_Android_052 @CNA_Mobile_Web_Android_053 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1074 @Web_CNAB-1075 @Web_CNAB-1076
  Scenario: Validate Watch Page Video options and Share functionality in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on Watch section in Android Mobile Web
    And I validate Watch Page header in Android Mobile Web
    Then I validate if the On Air Live video is AutoPlaying in Android Mobile Web
    And I validate OnAir Flag and Video Title, date and Description in Android Mobile Web
    And I validate video pause and play, maximize, Audio Mute and UnMute options in Android Mobile Web
    And I validate Full Screen options in Android Mobile Web
    Then I validate Share button for video Articles in Watch Page in Android Mobile Web
    And I validate share via social platform links in Android Mobile Web
    And I validate close pop up X button in Android Mobile Web

  @CNA_Mobile_Web_Android_054 @CNA_Mobile_Web_Android_055 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1077 @Web_CNAB-1078
  Scenario: Validate Full TV schedule component in Watch Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on Watch section in Android Mobile Web
    And I validate Watch Page header in Android Mobile Web
    Then I validate Recommended section header in Watch Page in Android Mobile Web
    And I Validate the recommended videos List in Android Mobile Web
    Then I validate View Full TV schedule link is present in Android Mobile Web
    And I click on View Full TV Schedule Link in Android Mobile Web
    Then I Validate Schedule Page header in Android Mobile Web
    And I validate if the TV schedule list is displayed in Android Mobile Web

  @CNA_Mobile_Web_Android_056 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1079
  Scenario: Validate Series Component Page from Watch Page in Android Mobile Web
    Given I Open a Video series component link in Android Mobile Web
    And I validate Series Component Page header in Android Mobile Web
    Then I validate Program Title, Follow button, Latest Episode with Season dropdown in Android Mobile Web
    And I validate share and Published date sections of video in Android Mobile Web

  @CNA_Mobile_Web_Android_058 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
    @Web_CNAB-1081
  Scenario Outline: Validate video page Sorting options in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on Watch section in Android Mobile Web
    And I validate Watch Page header in Android Mobile Web
    Then I click on more videos Link from New Videos section in My Watch Page in Android Mobile Web
    And I validate All Videos Page Header in Android Mobile Web
    Then I validate sort dropdown with Oldest to Newest and Most recent options in Android Mobile Web
    And I validate if all videos are displayed with Thumbnail content in Android Mobile Web
    And I validate if pagination functionality is available in All Videos Page in Android Mobile Web
    Then I enter the search keyword as "<Search_text>" in search bar of All videos Page in Android Mobile Web
    And I click Return to Main Page button in Android Mobile Web
    Then I validate all Videos Page is refreshed and displayed in Android Mobile Web

    Examples:
      | Search_text |
      | testingabc  |


  @CNA_Mobile_Web_Android_059 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
  @Web_CNAB-1082
  Scenario: Validate view more button at bottom of Watch Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on Watch section in Android Mobile Web
    And I validate Watch Page header in Android Mobile Web
    Then I click on View more button at bottom of the Watch Page in Android Mobile Web
    And I validate with Twelve Videos are loaded without refreshing the page in Android Mobile Web

  @CNA_Mobile_Web_Android_060  @CNA_Mobile_Web_Android_057 @Sanity_Mobile_Web_Android @CNA_Mobile_Web_Android @Regression_Web
    @Web_CNAB-1083 @Web_CNAB-1080
  Scenario: Validate Video Options and Share functionality in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on Watch section in Android Mobile Web
    And I validate Watch Page header in Android Mobile Web
    Then I click on a video from watch page in Android Mobile Web
    And I validate video page header in Android Mobile Web
    Then I validate if the video is AutoPlaying in Android Mobile Web
    And I validate Video Title in Android Mobile Web
    And I validate video pause and play, maximize, Audio Mute and UnMute options in Android Mobile Web
    And I validate Full Screen options in Android Mobile Web

  @CNA_Mobile_Web_Android_118 @Regression_Web @CNA_Mobile_Web_Android
  Scenario: Validate Video on Demand Page in Android Mobile Web
    Given I launch the CNA web application and check HomePage in Android Mobile Web
    And I click on Watch section in Android Mobile Web
    And I validate Watch Page header in Android Mobile Web
    When I click on View All Programmes CTA in Android Mobile Web
    Then I Validate Video on Demand page is displayed in Android Mobile Web
    And I validate is search, pagination options are displayed in Android Mobile Web

