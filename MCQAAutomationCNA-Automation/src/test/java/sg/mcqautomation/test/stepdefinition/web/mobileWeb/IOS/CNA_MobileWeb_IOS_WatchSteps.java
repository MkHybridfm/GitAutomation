package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_WatchPage;

import java.awt.*;

public class CNA_MobileWeb_IOS_WatchSteps {
    CNA_MobileWeb_IOS_WatchPage CNAWeb_WatchPage = new CNA_MobileWeb_IOS_WatchPage(DriverFactory.getDriver(),
    DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Then("I validate if the video is AutoPlaying in IOS Mobile Web")
    @Then("I validate if the On Air Live video is AutoPlaying in IOS Mobile Web")
    public void iValidateITtheOnAirLiveVideoIsAutoPlaying() {
        CNAWeb_WatchPage.validateVideoAutoPlay();
    }

    @And("I validate OnAir Flag and Video Title, date and Description in IOS Mobile Web")
    public void iValidateOnAirFlagAndVideoTitleDateAndDescription() {
        CNAWeb_WatchPage.validateOnAirFlag();
        Assert.assertTrue(CNAWeb_WatchPage.iValidateVideoMetadata());
    }

    @Then("I validate Share button for video Articles in Watch Page in IOS Mobile Web")
    public void iValidateShareButtonForVideoArticlesInWatchPage() {
            CNAWeb_WatchPage.validateShareOption();
            CNAWeb_WatchPage.clickOnShareLink();
    }

    @And("I validate Full Screen options in IOS Mobile Web")
    public void iValidateFullScreenOptions() {
        CNAWeb_WatchPage.validateFullScreen();
    }


    @Then("I validate View Full TV schedule link is present in IOS Mobile Web")
    public void iValidateViewFullTVScheduleLinkIsPresent() {
        Assert.assertTrue(CNAWeb_WatchPage.validateViewFullScheduleLink());
    }

    @And("I click on View Full TV Schedule Link in IOS Mobile Web")
    public void iClickOnViewFullTVScheduleLink() {
        CNAWeb_WatchPage.clickViewFullScheduleLink();
    }

    @Then("I Validate Schedule Page header in IOS Mobile Web")
    public void iValidateSchedulePageHeader() {
        Assert.assertTrue(CNAWeb_WatchPage.validateFullScehdulePage());
    }

    @And("I validate if the TV schedule list is displayed in IOS Mobile Web")
    public void iValidateIfTheTVScheduleListIsDisplayed() {
        CNAWeb_WatchPage.validateTVScheduleList();
    }


    @Then("I validate Recommended section header in Watch Page in IOS Mobile Web")
    public void iValidateRecommendedSectionHeaderInWatchPage() throws InterruptedException {
        Assert.assertTrue(CNAWeb_WatchPage.validateRecommendedSectionHeader());
    }

    @And("I Validate the recommended videos List in IOS Mobile Web")
    public void iValidateTheRecommendedVideosList() {
        CNAWeb_WatchPage.validateRecommendedSectionVideoList();
    }

    @Then("I click on video link from Surving The Odds Series component In Watch Page in IOS Mobile Web")
    public void iClickOnVideoLinkFromSurvingTheOddsSeriesComponentInWatchPage() {
        CNAWeb_WatchPage.clickOnSeriesVideoLink();
    }

    @And("I validate Series Component Page header in IOS Mobile Web")
    public void iValidateSeriesComponentPageHeader() throws InterruptedException {
        Assert.assertTrue(CNAWeb_WatchPage.validateSeriesComponentVideoPageHeader());
    }

    @Then("I validate Program Title, Follow button, Latest Episode with Season dropdown in IOS Mobile Web")
    public void iValidateProgramTitleFollowButtonLatestEpisodeWithSeasonDropdown() {
            CNAWeb_WatchPage.validateVideoAutoPlay();
            Assert.assertTrue(CNAWeb_WatchPage.followButtonLastestEpisodeDropdwown());
            Assert.assertTrue(CNAWeb_WatchPage.validateSeriesVideoTitle());
    }

    @And("I validate share and Published date sections of video in IOS Mobile Web")
    public void iValidateShareAndPublishedDateSections() {
        Assert.assertTrue(CNAWeb_WatchPage.validateVideoDescDateShareOption());
    }

    @Then("I click on more videos Link from New Videos section in My Watch Page in IOS Mobile Web")
    public void iClickOnMoreVideosLinkFromNewVideosSectionInMyWatchPage() throws InterruptedException {
        CNAWeb_WatchPage.clickOnMoreVideosLink();
    }

    @And("I validate All Videos Page Header in IOS Mobile Web")
    public void iValidateAllVideosPageHeader() throws InterruptedException {
       Assert.assertTrue( CNAWeb_WatchPage.validateAllVideosPageHeader());
    }

    @Then("I validate sort dropdown with Oldest to Newest and Most recent options in IOS Mobile Web")
    public void iValidateSortDropdownWithOldestToNewestAndMostRecentOptions() {
        Assert.assertTrue(CNAWeb_WatchPage.validateSortOptionDisplay());
    }

    @And("I validate if all videos are displayed with Thumbnail content in IOS Mobile Web")
    public void iValidateIfAllVideosAreDisplayedWithThumbnailContent() {
          Assert.assertTrue(CNAWeb_WatchPage.validateVideoThumbnail());
    }

    @And("I validate if pagination functionality is available in All Videos Page in IOS Mobile Web")
    public void iValidateIfPaginationFunctionalityIsAvailableInAllVideosPage() throws InterruptedException {
            Assert.assertTrue(CNAWeb_WatchPage.validatePaginationSection());
    }

    @Then("I enter the search keyword as {string} in search bar of All videos Page in IOS Mobile Web")
    public void iEnterTheSearchKeywordAsInSearchBarOfAllVideosPage(String searchText) throws AWTException {
        CNAWeb_WatchPage.enterSearchText(searchText);
    }

    @And("I click Return to Main Page button in IOS Mobile Web")
    public void iClickReturnToMainPageButton() {
        CNAWeb_WatchPage.clickReturnToHomePage();
    }

    @Then("I validate all Videos Page is refreshed and displayed in IOS Mobile Web")
    public void iValidateAllVideosPageIsRefreshedAndDisplayed() {
        Assert.assertTrue(CNAWeb_WatchPage.validateAllVideosPageRefreshDisplay());
    }

    @Then("I click on View more button at bottom of the Watch Page in IOS Mobile Web")
    public void iClickOnViewMoreButtonAtBottomOfTheWatchPage() {
            CNAWeb_WatchPage.clickViewMoreWatchPage();
    }

    @And("I validate with Twelve Videos are loaded without refreshing the page in IOS Mobile Web")
    public void iValidateWithVideosAreLoadedWithoutRefreshingThePage() throws InterruptedException {
        Assert.assertTrue(CNAWeb_WatchPage.validateVideosAfterViewMoreCLick());
    }


    @Then("I click on a video from watch page in IOS Mobile Web")
    public void iClickOnAVideoFromWatchPage() {
            CNAWeb_WatchPage.clickOnVideoFromWatchPage();
    }

    @And("I validate video page header in IOS Mobile Web")
    public void iValidateVideoPageHeader() throws InterruptedException {
            Assert.assertTrue(CNAWeb_WatchPage.validateVideoPageHeader());
    }

    @And("I validate Video Title in IOS Mobile Web")
    public void iValidateVideoTitle() {
        CNAWeb_WatchPage.validateSeriesVideoTitle();
    }


    @Given("I Open a Video series component link in IOS Mobile Web")
    public void iOpenAVideoSeriesComponentLink() {
        CNAWeb_WatchPage.openSeriesComponentLink();
    }

    @When("I click on View All Programmes CTA in IOS Mobile Web")
    public void iClickOnViewAllProgrammesCTA() {
        CNAWeb_WatchPage.clickViewAllProgrammesCTA();
    }

    @Then("I Validate Video on Demand page is displayed in IOS Mobile Web")
    public void iValidateVideoOnDemandPageIsDisplayed() {
        Assert.assertTrue(CNAWeb_WatchPage.validateOnDemandVideoPage());
    }

    @And("I validate is search, pagination options are displayed in IOS Mobile Web")
    public void iValidateIsSearchPaginationOptionsAreDisplayed() {
        Assert.assertTrue(CNAWeb_WatchPage.validateOnDemandVideosPageContent());
    }
}
