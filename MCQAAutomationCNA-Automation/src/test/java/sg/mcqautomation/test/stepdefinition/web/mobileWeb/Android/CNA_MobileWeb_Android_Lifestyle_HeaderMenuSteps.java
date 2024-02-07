package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_Lifestyle_HeaderMenuPage;

public class CNA_MobileWeb_Android_Lifestyle_HeaderMenuSteps {

    CNA_MobileWeb_Android_Lifestyle_HeaderMenuPage CNALifestyleWeb_HeaderMenuPage = new CNA_MobileWeb_Android_Lifestyle_HeaderMenuPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on Go to Luxury link from Header Menu in Android Mobile Web")
    public void iClickOnGoToLuxuryLinkFromHeaderMenu() {
        CNALifestyleWeb_HeaderMenuPage.ClickOnGoToLuxuryLinkFromHeaderMenu();
    }

    @Then("I validate if Lifestyle Luxury Page header is displayed in Android Mobile Web")
    public void iValidateIfLifestyleLuxuryPageHeaderIsDisplayed() {
        CNALifestyleWeb_HeaderMenuPage.validateLuxuryHomePage();
    }
}
