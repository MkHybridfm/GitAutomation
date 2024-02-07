package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.And;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNALuxuryWeb_ListingPage;

public class CNALuxuryWeb_ListingPageSteps {
    CNALuxuryWeb_ListingPage CNALuxuryWeb_ListingPage = new CNALuxuryWeb_ListingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on the submenu from People Landing Page")
    public void  iClickOnTheSubmenuFromPeopleLandingPage() {
        CNALuxuryWeb_ListingPage.clickOnluxuryPageSubMenu();
    }

}
