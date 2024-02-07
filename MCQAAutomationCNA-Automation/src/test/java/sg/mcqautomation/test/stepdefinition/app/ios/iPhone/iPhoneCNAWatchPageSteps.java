package sg.mcqautomation.test.stepdefinition.app.ios.iPhone;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNAWatchPage;

public class iPhoneCNAWatchPageSteps {

    iPhoneCNAWatchPage cnaWatchPage = new iPhoneCNAWatchPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on watch section in iPhone")
    public void iClickOnWatchSection() throws InterruptedException {
        cnaWatchPage.clickOnWatchSec();
    }

    @Then("I validate the header of watch page in iPhone")
    public void iValidateTheHeaderOfWatchPage() throws InterruptedException {
        Assert.assertTrue(cnaWatchPage.verifyHeaderOfTheWatchPage());
    }

    @Then("I validate the live status displayed on the video in iPhone")
    public void iValidateTheLiveStatusDisplayedOnTheVideo() throws InterruptedException {
        Assert.assertTrue(cnaWatchPage.verifyLiveStatusOnWatchPage());
    }

    @And("I click on full tv schedule in iPhone")
    public void iClickOnFullTvSchedule() {
        cnaWatchPage.clickOnFullTvSchedule();
    }

    @Then("I validate the label displayed with {string} in iPhone")
    public void iValidateTheLabelDisplayedWith(String text) {
        Assert.assertTrue(cnaWatchPage.verifyLabelOnLiveTv());
    }

    @And("I click on latest episode in iPhone")
    public void iClickOnLatestEpisode() throws InterruptedException {
        cnaWatchPage.clickOnLatestEpisode();
    }

    @Then("I verify the fields with {string} and {string} in iPhone")
    public void iVerifyTheFieldsWithAnd(String text, String text1) throws InterruptedException {
            Assert.assertTrue(cnaWatchPage.verifyTheReferenceVideoLabel().equalsIgnoreCase(text));
            Assert.assertTrue(cnaWatchPage.verifyPopularShowsLabel().equalsIgnoreCase(text1));
    }

    @Then("I validate the player controls on video in iPhone")
    public void iValidateThePlayerControlsOnVideo() throws InterruptedException {
        Assert.assertTrue(cnaWatchPage.validateVideoPlayerControls());
    }

    @And("I click on three dots under the recommended section in iPhone")
    public void iClickOnThreeDotsUnderTheRecommendedSection() {
        cnaWatchPage.clickOnThreeDotsUnderTheRecommendedSec();
    }

    @Then("I validate the share button in iPhone")
    public void iValidateTheShareButton() {
        Assert.assertTrue(cnaWatchPage.verifyShareOptions());
    }

    @And("I click on three dots under the latest section in iPhone")
    public void iClickOnThreeDotsUnderTheLatestSection() {
        cnaWatchPage.clickOnThreeDots();
    }

    @Then("I validate the player controls start time on video in iPhone")
    public void iValidateThePlayerControlsOnVideostarttime() throws InterruptedException {
        Assert.assertTrue(cnaWatchPage.validateVideoPlayerControlsstarttime());
    }

    @Then("I validate the player controls end time on video in iPhone")
    public void iValidateThePlayerControlsOnVideoendtime() throws InterruptedException {
        Assert.assertTrue(cnaWatchPage.validateVideoPlayerControlsendtime());
    }

    @Then("I validate the player controls sound on video in iPhone")
    public void iValidateThePlayerControlssoundbutton() throws InterruptedException {
        Assert.assertTrue(cnaWatchPage.validateVideoPlayerControlssound());
    }
}