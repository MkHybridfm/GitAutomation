package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.And;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_Luxury_BookmarkPage;

public class CNA_MobileWeb_IOS_Luxury_BookmarkSteps {
    CNA_MobileWeb_IOS_Luxury_BookmarkPage CNALuxuryWeb_BookmarkPage = new CNA_MobileWeb_IOS_Luxury_BookmarkPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on three dots of a article from Luxury Landing Page in IOS Mobile Web")
    public void iClickOnThreeDotsOfAArticleFromLuxuryLandingPage() throws InterruptedException {
        CNALuxuryWeb_BookmarkPage.clickOnThreeDots();
    }


}
