package sg.mcqautomation.test.stepdefinition.app.ios.iPhone;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNAListenPage;

public class iPhoneCNAListenPageSteps {

    iPhoneCNAListenPage cnaListenPage = new iPhoneCNAListenPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();



    @And("I click listen on menu page in iPhone")
    public void iClickListenOnMenuPage() {
        cnaListenPage.clickOnListenPage();
    }

    @Then("I validate the live content on the listen page in iPhone")
    public void iValidateTheLiveContentOnTheListenPage() {
        Assert.assertTrue(cnaListenPage.verifyTheLiveContentOnListenPage());
    }

    @Then("I validate the header as {string} in iPhone")
    public void iValidateTheHeaderAs(String text) {
        Assert.assertTrue(cnaListenPage.verifyHeaderOfListenPage().equalsIgnoreCase(text));
    }

    @And("I click on view full schedule link in iPhone")
    public void iClickOnViewFullScheduleLink() {
        cnaListenPage.clickOnViewFullScheduleLink();
    }

    @Then("I validate the schedule page in web view in iPhone")
    public void iValidateTheSchedulePageInWebView() {
        Assert.assertTrue(cnaListenPage.verifyTheContentTitleOnWebView());
    }

    @Then("I validate the bookmark and share options in iPhone")
    public void iValidateTheBookmarkAndShareOptions() {
        Assert.assertTrue(cnaListenPage.verifyBookMarkAndShareOptions());
    }

    @Then("I validate the share options in iPhone")
    public void iValidateShareOptions() {
        Assert.assertTrue(cnaListenPage.verifyShareOptions());
    }

    @Then("I validate the bookmark options in iPhone")
    public void iValidateBookmarkOptions() {
        Assert.assertTrue(cnaListenPage.verifyBookmarkOptions());
    }

    @And("I click on article on listen page in iPhone")
    public void iClickOnArticleOnListenPage() {
        cnaListenPage.clickONArticle();
    }

    @Then("I play the podcast in iPhone")
    public void iPlayThePodcast() throws InterruptedException {
        cnaListenPage.playPodcast();
    }

    @Then("I Select one Podcast to play in iPhone")
    public void iselectpodcast() throws InterruptedException {
        cnaListenPage.selectPodcast();
    }

    @Then("I click on three dots on listen page in iPhone")
    public void iClickOnThreeDotsOnPage() {
        cnaListenPage.clickOnThreeDotsOnListenPage();
    }

    @Then("I Verify Podcast Player Podcast Details in iPhone")
    public void plyerPodcastDetails() {
        Assert.assertTrue(cnaListenPage.plyerPodcastDetails());
    }

    @Then("I Verify Podcast Player Pause Button in iPhone")
    public void plyerPodcastPause() {
        Assert.assertTrue(cnaListenPage.plyerPodcastPause());
    }

    @Then("I Verify Podcast Player Rewind Button in iPhone")
    public void plyerPodcastRewind() {
        Assert.assertTrue(cnaListenPage.plyerPodcastRewind());
    }
    @Then("I Verify Podcast Player Forward Button in iPhone")
    public void plyerPodcastForward() {
        Assert.assertTrue(cnaListenPage.plyerPodcastForward());
    }

    @Then("I Verify Podcast Player Slider in iPhone")
    public void plyerPodcastSlider() {
        Assert.assertTrue(cnaListenPage.plyerPodcastSlider());
    }

    @Then("I Verify Podcast Player Start Time in iPhone")
    public void plyerPodcastDetailsBT() {
        Assert.assertTrue(cnaListenPage.plyerPodcastDetailsBT());
    }

    @Then("I Verify Podcast Player End Time in iPhone")
    public void plyerPodcastDetailsET() {
        Assert.assertTrue(cnaListenPage.plyerPodcastDetailsET());
    }

    @When("I Close Podcast Player in iPhone")
    public void plyerPodcastClose() {
        cnaListenPage.plyerPodcastClose();
    }

    @Then("I Verify List of Podcast in Listen Screen in iPhone")
    public void verifyPodcastDetails() {
        Assert.assertTrue(cnaListenPage.verifyPodcastCount());
    }

    @Then("I Verify List of Latest Episode in iPhone")
    public void isLatestEpisodeCount() throws InterruptedException {
        Assert.assertTrue(cnaListenPage.verifyLatestEpisodeCount());
    }

}

