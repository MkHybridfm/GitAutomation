package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_Luxury_ListingPage;
import sg.mcqautomation.test.pages.web.prod.CNALuxuryWeb_ListingPage;

public class CNA_MobileWeb_Android_Luxury_ListingPageSteps {
    CNA_MobileWeb_Android_Luxury_ListingPage CNALuxuryWeb_ListingPage = new CNA_MobileWeb_Android_Luxury_ListingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on the submenu from People Landing Page in Android Mobile Web")
    public void  iClickOnTheSubmenuFromPeopleLandingPage() {
        CNALuxuryWeb_ListingPage.clickOnluxuryPageSubMenu();
    }

}
