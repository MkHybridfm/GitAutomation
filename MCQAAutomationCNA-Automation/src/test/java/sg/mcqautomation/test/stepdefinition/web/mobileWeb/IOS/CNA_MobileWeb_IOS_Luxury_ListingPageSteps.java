package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_Luxury_ListingPage;

public class CNA_MobileWeb_IOS_Luxury_ListingPageSteps {
    CNA_MobileWeb_IOS_Luxury_ListingPage CNALuxuryWeb_ListingPage = new CNA_MobileWeb_IOS_Luxury_ListingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on the submenu from People Landing Page in IOS Mobile Web")
    public void  iClickOnTheSubmenuFromPeopleLandingPage() {
        CNALuxuryWeb_ListingPage.clickOnluxuryPageSubMenu();
    }

    @And("I click on menu icon in Luxury application in IOS Mobile Web")
    public void iClickOnMenuIconInLuxuryApplicationInIOSMobileWeb() {
        CNALuxuryWeb_ListingPage.clickOnluxuryMainMenuIcon();
    }

    @Then("I click on a submenu from the menu in Luxury application in IOS Mobile Web")
    public void iClickOnASubmenuFromTheMenuInLuxuryApplicationInIOSMobileWeb() {
        CNALuxuryWeb_ListingPage.clickOnluxurySubmenuLink();
    }
}
