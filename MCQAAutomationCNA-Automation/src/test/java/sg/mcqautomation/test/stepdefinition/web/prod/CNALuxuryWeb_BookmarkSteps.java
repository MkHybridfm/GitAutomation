package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.And;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNALuxuryWeb_BookmarkPage;

public class CNALuxuryWeb_BookmarkSteps {
            CNALuxuryWeb_BookmarkPage CNALuxuryWeb_BookmarkPage = new CNALuxuryWeb_BookmarkPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on three dots of a article from Luxury Landing Page")
    public void iClickOnThreeDotsOfAArticleFromLuxuryLandingPage() throws InterruptedException {
        CNALuxuryWeb_BookmarkPage.clickOnThreeDots();
    }


}
