package sg.mcqautomation.test.stepdefinition.app.android;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android.CNA_Android_WatchPage;

public class CNA_Android_WatchPageSteps {

    CNA_Android_WatchPage cnaWatchPage = new CNA_Android_WatchPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on watch section in Android App")
    public void iClickOnWatchSection() throws InterruptedException {
        cnaWatchPage.clickOnWatchSec();
    }

    @Then("I validate the header of watch page in Android App")
    public void iValidateTheHeaderOfWatchPage() throws InterruptedException {
        Assert.assertTrue(cnaWatchPage.verifyHeaderOfTheWatchPage());
    }

    @Then("I validate the live status displayed on the video in Android App")
    public void iValidateTheLiveStatusDisplayedOnTheVideo() throws InterruptedException {
        Assert.assertTrue(cnaWatchPage.verifyLiveStatusOnWatchPage());
    }

    @And("I click on full tv schedule in Android App")
    public void iClickOnFullTvSchedule() {
        cnaWatchPage.clickOnFullTvSchedule();
    }

    @Then("I validate the label displayed with {string} in Android App")
    public void iValidateTheLabelDisplayedWith(String text) {
        Assert.assertTrue(cnaWatchPage.verifyLabelOnLiveTv());
    }

    @And("I click on latest episode in Android App")
    public void iClickOnLatestEpisode() throws InterruptedException {
        cnaWatchPage.clickOnLatestEpisode();
    }

    @Then("I verify the fields with {string} and {string} in Android App")
    public void iVerifyTheFieldsWithAnd(String text, String text1) throws InterruptedException {
            Assert.assertTrue(cnaWatchPage.verifyTheReferenceVideoLabel().equalsIgnoreCase(text));
            Assert.assertTrue(cnaWatchPage.verifyPopularShowsLabel().equalsIgnoreCase(text1));
    }

    @Then("I validate the player controls on video in Android App")
    public void iValidateThePlayerControlsOnVideo() throws InterruptedException {
        Assert.assertTrue(cnaWatchPage.validateVideoPlayerControls());
    }

    @And("I click on three dots under the recommended section in Android App")
    public void iClickOnThreeDotsUnderTheRecommendedSection() {
        cnaWatchPage.clickOnThreeDotsUnderTheRecommendedSec();
    }

    @Then("I validate the share button in Android App")
    public void iValidateTheShareButton() {
        Assert.assertTrue(cnaWatchPage.verifyShareOptions());
    }

    @And("I click on three dots under the latest section in Android App")
    public void iClickOnThreeDotsUnderTheLatestSection() {
        cnaWatchPage.clickOnThreeDots();
    }
}