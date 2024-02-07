package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_ListenPage;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_ListenPage;

public class CNA_MobileWeb_Android_ListenSteps {

    CNA_MobileWeb_Android_ListenPage CNAWeb_ListenPage = new CNA_MobileWeb_Android_ListenPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I Click on Listen Menu Link in Android Mobile Web")
    public void iClickOnListenMenuLink() {
        CNAWeb_ListenPage.clickListenMenuLink();
    }

    @And("I validate Listen Landing Page Header in Android Mobile Web")
    public void iValidateListenLandingPageHeader() {
        Assert.assertTrue(CNAWeb_ListenPage.validateListenLandingPage());
    }

    @Then("I Validate OnAir section, View full Schedule Link, Editors Picks, CNA Program, On Demand and View more CTA sections in Android Mobile Web")
    public void validateListenPageSections() {
        Assert.assertTrue(CNAWeb_ListenPage.validateListenPageSections());
    }

    @And("I click on View Full schedule link from Listen Page in Android Mobile Web")
    public void iClickOnViewFullScheduleLinkFromListenPage() {
        CNAWeb_ListenPage.clickViewFullScheduleLink();
    }

    @Then("I validate if weekday schedule List is displayed in Android Mobile Web")
    public void iValidateIfWeekdayScheduleListIsDisplayed() {
        Assert.assertTrue(CNAWeb_ListenPage.viewFullSchedulePage());
    }

    @Then("I click on a Podcast Link from Listen Page in Android Mobile Web")
    public void iClickOnAPodcastLinkFromListenPage() {
        CNAWeb_ListenPage.clickOnPodcastLink();
    }

    @And("I validate if Podcast Page Header is displayed in Android Mobile Web")
    public void iValidateIfPodcastPageHeaderIsDisplayed() {
        Assert.assertTrue(CNAWeb_ListenPage.validatepodcastPlayPage());
    }

    @Then("I click on Pause button in Android Mobile Web")
    @Then("I click on Play Podcast button in Android Mobile Web")
    public void iClickOnPlayPodcastButton() {
        CNAWeb_ListenPage.clickOnPlayButton();
    }

    @And("I validate if Play control area is displayed in Android Mobile Web")
    public void iValidateIfPlayControlAreaIsDisplayed() {
        Assert.assertTrue(CNAWeb_ListenPage.validatepodcastPlayControlSection());
    }

    @And("I validate if Play button is displayed in Android Mobile Web")
    public void iValidateIfPlayButtonIsDisplayed() {
        Assert.assertTrue(CNAWeb_ListenPage.validatePodcastPlaybutton());
    }

    @Then("I click on View all link from More Podcasts Section in Android Mobile Web")
    public void iClickOnViewAllLinkFromMorePodcastsSection() {
            CNAWeb_ListenPage.clickOnViewAllLInk();
    }

    @And("I validate if All Podcasts Page is displayed in Android Mobile Web")
    public void iValidateIfAllPodcastsPageIsDisplayed() {
        Assert.assertTrue(CNAWeb_ListenPage.validateAllPodacstsPage());
    }

    @Then("I validate if Search Text box is displayed in Android Mobile Web")
    @And("I validate if Sorting filter is displayed in Android Mobile Web")
    @Then("I validate if Pagination is displayed at bottom of the page in Android Mobile Web")
    public void iVvalidateSearchSortingPaginationSections() {
        Assert.assertTrue(CNAWeb_ListenPage.validateSearchSortingPaginationSections());
    }

    @And("I validate if showing count is increased on moving to next Page in Android Mobile Web")
    public void iValidateIfShowingCountIsIncreasedOnMovingToNextPage() {
            CNAWeb_ListenPage.validateShowingCount();
    }

    @And("I click on three dots of article from Listen Page in Android Mobile Web")
    public void iClickOnThreeDotsOfArticleFromListenPage() {
        CNAWeb_ListenPage.clickOnthreeDots();
    }

    @Then("I validate the bookmark and share options from three dots in Android Mobile Web")
    public void iValidateTheBookmarkAndShareOptionsFromThreeDots() {
        Assert.assertTrue(CNAWeb_ListenPage.validateBookmarkShareOptions());
    }

    @Then("I click on Listen Now button in Android Mobile Web")
    public void iClickOnListenNowButton() {
        CNAWeb_ListenPage.clickOnListenNow();
    }

    @And("I validate Pause and Play functionality in Android Mobile Web")
    public void iValidatePauseAndPlayFunctionality() throws InterruptedException {
        Assert.assertTrue(CNAWeb_ListenPage.validatePlayandPauseFunctions());
    }


    @Then("I click on Load More episodes button in Android Mobile Web")
    public void iClickOnLoadMoreEpisodesButton() throws InterruptedException {
        CNAWeb_ListenPage.clickLoadMoreEpisodesButton();
    }

    @And("I validate if all the episodes are loaded in Android Mobile Web")
    public void iValidateIfAllTheEpisodesAreLoaded() throws InterruptedException {
        Assert.assertTrue(CNAWeb_ListenPage.latestEpisodeListValidation());
    }

    @And("I click on Find out more Link from Schedule List page in Android Mobile Web")
    public void iClickOnFindOutMoreLinkFromScheduleListPage() {
        CNAWeb_ListenPage.clickFindOutMoreLink();
    }

    @Then("I validate the share option and Podcast description in Android Mobile Web")
    public void iValidateTheShareOptionAndPodcastDescription() {
        Assert.assertTrue(CNAWeb_ListenPage.validatePodcastDescAndShareOptions());
    }
}
