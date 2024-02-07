package sg.mcqautomation.test.stepdefinition.app.android;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android.CNA_Android_ListenPage;

public class CNA_Android_ListenPageSteps {

    CNA_Android_ListenPage cnaListenPage = new CNA_Android_ListenPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();



    @And("I click listen on menu page in Android App")
    public void iClickListenOnMenuPage() {
        cnaListenPage.clickOnListenPage();
    }

    @Then("I validate the live content on the listen page in Android App")
    public void iValidateTheLiveContentOnTheListenPage() {
        Assert.assertTrue(cnaListenPage.verifyTheLiveContentOnListenPage());
    }

    @Then("I validate the header as {string} in Android App")
    public void iValidateTheHeaderAs(String text) {
        Assert.assertTrue(cnaListenPage.verifyHeaderOfListenPage().equalsIgnoreCase(text));
    }

    @And("I click on view full schedule link in Android App")
    public void iClickOnViewFullScheduleLink() {
        cnaListenPage.clickOnViewFullScheduleLink();
    }

    @Then("I validate the schedule page in web view in Android App")
    public void iValidateTheSchedulePageInWebView() {
        Assert.assertTrue(cnaListenPage.verifyTheContentTitleOnWebView());
    }

    @Then("I validate the bookmark and share options in Android App")
    public void iValidateTheBookmarkAndShareOptions() {
        Assert.assertTrue(cnaListenPage.verifyBookMarkAndShareOptions());
    }

    @And("I click on article on listen page in Android App")
    public void iClickOnArticleOnListenPage() {
        cnaListenPage.clickONArticle();
    }

    @Then("I play the podcast in Android App")
    public void iPlayThePodcast() throws InterruptedException {
        cnaListenPage.playPodcast();
    }

    @Then("I click on three dots on listen page in Android App")
    public void iClickOnThreeDotsOnPage() {
        cnaListenPage.clickOnThreeDotsOnListenPage();
    }
}