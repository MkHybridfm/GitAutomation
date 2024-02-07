package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_WatchPage;
import java.awt.*;

public class CNAWeb_PreProd_WatchSteps {
    CNAWeb_PreProd_WatchPage CNAWeb_WatchPage = new CNAWeb_PreProd_WatchPage(DriverFactory.getDriver(),
    DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Then("I validate if the video is AutoPlaying in PreProd")
    @Then("I validate if the On Air Live video is AutoPlaying in PreProd")
    public void iValidateITtheOnAirLiveVideoIsAutoPlaying() {
        CNAWeb_WatchPage.validateVideoAutoPlay();
    }

    @And("I validate OnAir Flag and Video Title, date and Description in PreProd")
    public void iValidateOnAirFlagAndVideoTitleDateAndDescription() {
        CNAWeb_WatchPage.validateOnAirFlag();
        Assert.assertTrue(CNAWeb_WatchPage.iValidateVideoMetadata());
    }

    @Then("I validate Share button for video Articles in Watch Page in PreProd")
    public void iValidateShareButtonForVideoArticlesInWatchPage() {
            CNAWeb_WatchPage.validateShareOption();
            CNAWeb_WatchPage.clickOnShareLink();
    }

    @And("I validate Full Screen options in PreProd")
    public void iValidateFullScreenOptions() {
        CNAWeb_WatchPage.validateFullScreen();
    }


    @Then("I validate View Full TV schedule link is present in PreProd")
    public void iValidateViewFullTVScheduleLinkIsPresent() {
        Assert.assertTrue(CNAWeb_WatchPage.validateViewFullScheduleLink());
    }

    @And("I click on View Full TV Schedule Link in PreProd")
    public void iClickOnViewFullTVScheduleLink() {
        CNAWeb_WatchPage.clickViewFullScheduleLink();
    }

    @Then("I Validate Schedule Page header in PreProd")
    public void iValidateSchedulePageHeader() {
        Assert.assertTrue(CNAWeb_WatchPage.validateFullScehdulePage());
    }

    @And("I validate if the TV schedule list is displayed in PreProd")
    public void iValidateIfTheTVScheduleListIsDisplayed() {
        CNAWeb_WatchPage.validateTVScheduleList();
    }


    @Then("I validate Recommended section header in Watch Page in PreProd")
    public void iValidateRecommendedSectionHeaderInWatchPage() throws InterruptedException {
        Assert.assertTrue(CNAWeb_WatchPage.validateRecommendedSectionHeader());
    }

    @And("I Validate the recommended videos List in PreProd")
    public void iValidateTheRecommendedVideosList() {
        CNAWeb_WatchPage.validateRecommendedSectionVideoList();
    }

    @Then("I click on video link from Surving The Odds Series component In Watch Page in PreProd")
    public void iClickOnVideoLinkFromSurvingTheOddsSeriesComponentInWatchPage() {
        CNAWeb_WatchPage.clickOnSeriesVideoLink();
    }

    @And("I validate Series Component Page header in PreProd")
    public void iValidateSeriesComponentPageHeader() throws InterruptedException {
        Assert.assertTrue(CNAWeb_WatchPage.validateSeriesComponentVideoPageHeader());
    }

    @Then("I validate Program Title, Follow button, Latest Episode with Season dropdown in PreProd")
    public void iValidateProgramTitleFollowButtonLatestEpisodeWithSeasonDropdown() {
            CNAWeb_WatchPage.validateVideoAutoPlay();
            Assert.assertTrue(CNAWeb_WatchPage.followButtonLastestEpisodeDropdwown());
            Assert.assertTrue(CNAWeb_WatchPage.validateSeriesVideoTitle());
    }

    @And("I validate share and Published date sections of video in PreProd")
    public void iValidateShareAndPublishedDateSections() {
        Assert.assertTrue(CNAWeb_WatchPage.validateVideoDescDateShareOption());
    }

    @Then("I click on more videos Link from New Videos section in My Watch Page in PreProd")
    public void iClickOnMoreVideosLinkFromNewVideosSectionInMyWatchPage() throws InterruptedException {
        CNAWeb_WatchPage.clickOnMoreVideosLink();
    }

    @And("I validate All Videos Page Header in PreProd")
    public void iValidateAllVideosPageHeader() throws InterruptedException {
       Assert.assertTrue( CNAWeb_WatchPage.validateAllVideosPageHeader());
    }

    @Then("I validate sort dropdown with Oldest to Newest and Most recent options in PreProd")
    public void iValidateSortDropdownWithOldestToNewestAndMostRecentOptions() {
        Assert.assertTrue(CNAWeb_WatchPage.validateSortOptionDisplay());
    }

    @And("I validate if all videos are displayed with Thumbnail content in PreProd")
    public void iValidateIfAllVideosAreDisplayedWithThumbnailContent() {
          Assert.assertTrue(CNAWeb_WatchPage.validateVideoThumbnail());
    }

    @And("I validate if pagination functionality is available in All Videos Page in PreProd")
    public void iValidateIfPaginationFunctionalityIsAvailableInAllVideosPage() throws InterruptedException {
            Assert.assertTrue(CNAWeb_WatchPage.validatePaginationSection());
    }

    @Then("I enter the search keyword as {string} in search bar of All videos Page in PreProd")
    public void iEnterTheSearchKeywordAsInSearchBarOfAllVideosPage(String searchText) throws AWTException {
        CNAWeb_WatchPage.enterSearchText(searchText);
    }

    @And("I click Return to Main Page button in PreProd")
    public void iClickReturnToMainPageButton() {
        CNAWeb_WatchPage.clickReturnToHomePage();
    }

    @Then("I validate all Videos Page is refreshed and displayed in PreProd")
    public void iValidateAllVideosPageIsRefreshedAndDisplayed() {
        Assert.assertTrue(CNAWeb_WatchPage.validateAllVideosPageRefreshDisplay());
    }

    @Then("I click on View more button at bottom of the Watch Page in PreProd")
    public void iClickOnViewMoreButtonAtBottomOfTheWatchPage() {
            CNAWeb_WatchPage.clickViewMoreWatchPage();
    }

    @And("I validate with Twelve Videos are loaded without refreshing the page in PreProd")
    public void iValidateWithVideosAreLoadedWithoutRefreshingThePage() throws InterruptedException {
        Assert.assertTrue(CNAWeb_WatchPage.validateVideosAfterViewMoreCLick());
    }


    @Then("I click on a video from watch page in PreProd")
    public void iClickOnAVideoFromWatchPage() throws InterruptedException {
            CNAWeb_WatchPage.clickOnVideoFromWatchPage();
    }

    @And("I validate video page header in PreProd")
    public void iValidateVideoPageHeader() throws InterruptedException {
            Assert.assertTrue(CNAWeb_WatchPage.validateVideoPageHeader());
    }

    @And("I validate Video Title in PreProd")
    public void iValidateVideoTitle() {
        CNAWeb_WatchPage.validateSeriesVideoTitle();
    }


    @Given("I Open a Video series component link in PreProd")
    public void iOpenAVideoSeriesComponentLink() {
        CNAWeb_WatchPage.openSeriesComponentLink();
    }

    @When("I click on View All Programmes CTA in PreProd")
    public void iClickOnViewAllProgrammesCTA() {
        CNAWeb_WatchPage.clickViewAllProgrammesCTA();
    }

    @Then("I Validate Video on Demand page is displayed in PreProd")
    public void iValidateVideoOnDemandPageIsDisplayed() {
        Assert.assertTrue(CNAWeb_WatchPage.validateOnDemandVideoPage());
    }

    @And("I validate is search, pagination options are displayed in PreProd")
    public void iValidateIsSearchPaginationOptionsAreDisplayed() {
        Assert.assertTrue(CNAWeb_WatchPage.validateOnDemandVideosPageContent());
    }
}
