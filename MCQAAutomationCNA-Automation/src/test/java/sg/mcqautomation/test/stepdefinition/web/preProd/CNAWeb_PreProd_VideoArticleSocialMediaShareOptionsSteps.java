package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.testng.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_VideoArticleSocialMediaShareSectionPage;

public class CNAWeb_PreProd_VideoArticleSocialMediaShareOptionsSteps {
    CNAWeb_PreProd_VideoArticleSocialMediaShareSectionPage CNAWeb_VideoArticleSocialMediaShareSectionPage = new CNAWeb_PreProd_VideoArticleSocialMediaShareSectionPage(DriverFactory.getDriver(),
        DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @When("I validate SocialMedia Share options section in video Playback area in PreProd")
    public void iValidateSocialMediaShareOptionsSectionInVideoPlaybackArea() {
            Assert.assertTrue(CNAWeb_VideoArticleSocialMediaShareSectionPage.ValidateSocialMediaShareOption());
    }


}
