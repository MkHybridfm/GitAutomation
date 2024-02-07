package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_Lifestyle_HeaderMenuPage;

public class CNA_MobileWeb_IOS_Lifestyle_HeaderMenuSteps {

    CNA_MobileWeb_IOS_Lifestyle_HeaderMenuPage CNALifestyleWeb_HeaderMenuPage = new CNA_MobileWeb_IOS_Lifestyle_HeaderMenuPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on Go to Luxury link from Header Menu in IOS Mobile Web")
    public void iClickOnGoToLuxuryLinkFromHeaderMenu() {
        CNALifestyleWeb_HeaderMenuPage.ClickOnGoToLuxuryLinkFromHeaderMenu();
    }

    @Then("I validate if Lifestyle Luxury Page header is displayed in IOS Mobile Web")
    public void iValidateIfLifestyleLuxuryPageHeaderIsDisplayed() {
        CNALifestyleWeb_HeaderMenuPage.validateLuxuryHomePage();
    }
}
