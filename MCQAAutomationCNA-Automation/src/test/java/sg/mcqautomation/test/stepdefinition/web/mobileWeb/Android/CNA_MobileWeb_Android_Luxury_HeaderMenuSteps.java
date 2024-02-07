package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_Luxury_HeaderMenuPage;
import sg.mcqautomation.test.pages.web.prod.CNALuxuryWeb_HeaderMenuPage;

public class CNA_MobileWeb_Android_Luxury_HeaderMenuSteps {


    CNA_MobileWeb_Android_Luxury_HeaderMenuPage CNALuxuryWeb_HeaderMenuPage = new CNA_MobileWeb_Android_Luxury_HeaderMenuPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
            public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on Go to Lifestyle link from Header Menu in Android Mobile Web")
    public void iClickOnGoToLifestyleLinkFromHeaderMenu() {
        CNALuxuryWeb_HeaderMenuPage.ClickOnGoToLifestyleLinkFromHeaderMenu();
    }

    @Then("I validate if Lifestyle Page header is displayed in Android Mobile Web")
    public void iValidateIfLifestylePageHeaderIsDisplayed() throws InterruptedException {
        CNALuxuryWeb_HeaderMenuPage.validateLuxuryHomePage();
    }
}
