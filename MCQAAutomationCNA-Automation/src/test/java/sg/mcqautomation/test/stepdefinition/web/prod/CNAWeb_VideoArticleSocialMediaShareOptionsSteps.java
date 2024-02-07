package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.testng.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_VideoArticleSocialMediaShareSectionPage;

public class CNAWeb_VideoArticleSocialMediaShareOptionsSteps {
    CNAWeb_VideoArticleSocialMediaShareSectionPage CNAWeb_VideoArticleSocialMediaShareSectionPage = new CNAWeb_VideoArticleSocialMediaShareSectionPage(DriverFactory.getDriver(),
        DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @When("I validate SocialMedia Share options section in video Playback area")
    public void iValidateSocialMediaShareOptionsSectionInVideoPlaybackArea() {
            Assert.assertTrue(CNAWeb_VideoArticleSocialMediaShareSectionPage.ValidateSocialMediaShareOption());
    }


}
