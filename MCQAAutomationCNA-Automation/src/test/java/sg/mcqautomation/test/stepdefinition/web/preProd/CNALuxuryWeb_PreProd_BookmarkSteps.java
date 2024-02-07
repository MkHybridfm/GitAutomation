package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNALuxuryWeb_PreProd_BookmarkPage;


public class CNALuxuryWeb_PreProd_BookmarkSteps {
            CNALuxuryWeb_PreProd_BookmarkPage CNALuxuryWeb_BookmarkPage = new CNALuxuryWeb_PreProd_BookmarkPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on three dots of a article from Luxury Landing Page in PreProd")
    public void iClickOnThreeDotsOfAArticleFromLuxuryLandingPage() throws InterruptedException {
        CNALuxuryWeb_BookmarkPage.clickOnThreeDots();
    }


}
