package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.testng.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_VideoArticleSocialMediaShareSectionPage;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_VideoArticleSocialMediaShareSectionPage;

public class CNA_MobileWeb_Android_VideoArticleSocialMediaShareOptionsSteps {
    CNA_MobileWeb_Android_VideoArticleSocialMediaShareSectionPage CNAWeb_VideoArticleSocialMediaShareSectionPage = new CNA_MobileWeb_Android_VideoArticleSocialMediaShareSectionPage(DriverFactory.getDriver(),
        DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @When("I validate SocialMedia Share options section in video Playback area in Android Mobile Web")
    public void iValidateSocialMediaShareOptionsSectionInVideoPlaybackArea() {
            Assert.assertTrue(CNAWeb_VideoArticleSocialMediaShareSectionPage.ValidateSocialMediaShareOption());
    }


}
