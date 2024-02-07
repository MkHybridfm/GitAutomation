package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNALuxuryWeb_PreProd_ListingPage;

public class CNALuxuryWeb_PreProd_ListingPageSteps {
    CNALuxuryWeb_PreProd_ListingPage CNALuxuryWeb_ListingPage = new CNALuxuryWeb_PreProd_ListingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on the submenu from People Landing Page in PreProd")
    public void  iClickOnTheSubmenuFromPeopleLandingPage() {
        CNALuxuryWeb_ListingPage.clickOnluxuryPageSubMenu();
    }

}
