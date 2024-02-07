package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.testng.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_VideoArticleSocialMediaShareSectionPage;

public class CNA_MobileWeb_IOS_VideoArticleSocialMediaShareOptionsSteps {
    CNA_MobileWeb_IOS_VideoArticleSocialMediaShareSectionPage CNAWeb_VideoArticleSocialMediaShareSectionPage = new CNA_MobileWeb_IOS_VideoArticleSocialMediaShareSectionPage(DriverFactory.getDriver(),
        DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @When("I validate SocialMedia Share options section in video Playback area in IOS Mobile Web")
    public void iValidateSocialMediaShareOptionsSectionInVideoPlaybackArea() {
            Assert.assertTrue(CNAWeb_VideoArticleSocialMediaShareSectionPage.ValidateSocialMediaShareOption());
    }


}
