package sg.mcqautomation.test.stepdefinition.app.android_tab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android.CNA_Android_Ads;

public class CNA_Android_Tab_AdsSteps {

	CNA_Android_Ads cnaAds = new CNA_Android_Ads(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Then("I validate the LB adds in Android App in Tab")
    @Then("I validate the LB adds on sec landing pages in Android App in Tab")
    public void iValidateLBAdds() throws InterruptedException {
        Assert.assertTrue(cnaAds.validateLBAddOnSecLandingPage());
    }

    @And("I validate IMU adds on sec landing pages in Android App in Tab")
    public void iIMUAddsOnSecLandingPages() {
        Assert.assertTrue(cnaAds.validateIMUAddOnSecLandingPage());
    }

    @And("I swipe to other sec landing page in Android App in Tab")
    public void iSwipeToOtherSecLandingPage() {
        cnaAds.swipeSecLandingPage();
    }

    @Then("I validate the LB add on the video detail page in Android App in Tab")
    public void iValidateTheLBAddOnTheVideoDetailPage() {
        Assert.assertTrue(cnaAds.validateLBAddOnWatchPage());

    }

    @Then("I validate the IMU add on video detail page in Android App in Tab")
    public void iValidateTheIMUAddOnVideoDetailPage() {
        Assert.assertTrue(cnaAds.validateIMUAddOnWatchPage());
    }

    @And("I validate IMU adds on article landing pages in Android App in Tab")
    public void iIMUAddsOnArticleLandingPages() {
        Assert.assertTrue(cnaAds.validateIMUAddOnArticleLandingPage());
    }

    @Then("I click on News report under watch sec in Android App in Tab")
    public void iClickOnNewsReportUnderWatchSec() {
        cnaAds.clickOnNewsReports();
    }

    @Then("I click on podcast under listen in Android App in Tab")
    public void iClickOnPodcastUnderListen() {
        cnaAds.clickOnPodcast();
    }

    @And("I validate the LB adds under Docs And Shows in Android App in Tab")
    @And("I validate the LB adds under new reports in Android App in Tab")
    public void iValidateTheLBAddsUnderNewReports() {
        Assert.assertTrue(cnaAds.validateLBAddOnNewReports());
    }

    @And("I validate the IMU adds under Docs And Shows in Android App in Tab")
    @And("I validate IMU adds under new reports in Android App in Tab")
    public void iValidateIMUAddsUnderNewReports() {
        Assert.assertTrue(cnaAds.validateIMUAddOnNewReports());
    }

    @Then("I click on documentation and shows under the watch sec in Android App in Tab")
    public void iClickOnDocumentationAndShowsUnderTheWatchSec() {
        cnaAds.clickOnDocsAndShows();
    }

    @And("I validate the LB adds under podcast page in Android App in Tab")
    public void iValidateTheLBAddsUnderPodcastPage() {
        Assert.assertTrue(cnaAds.validateLBAddOnPodcast());
    }

    @And("I click on home button in Android App in Tab")
    public void iClickOnHomeButton() {
        cnaAds.clickOnHomeButton();
    }

    @And("I validate IMU adds in Android App in Tab")
    public void iIMUAdds() {
        Assert.assertTrue(cnaAds.validateIMUAdds());
    }
}