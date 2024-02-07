package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNALifestyleWeb_HeaderMenuPage;

public class CNALifestyleWeb_HeaderMenuSteps {

    CNALifestyleWeb_HeaderMenuPage CNALifestyleWeb_HeaderMenuPage = new CNALifestyleWeb_HeaderMenuPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on Go to Luxury link from Header Menu")
    public void iClickOnGoToLuxuryLinkFromHeaderMenu() {
        CNALifestyleWeb_HeaderMenuPage.ClickOnGoToLuxuryLinkFromHeaderMenu();
    }

    @Then("I validate if Lifestyle Luxury Page header is displayed")
    public void iValidateIfLifestyleLuxuryPageHeaderIsDisplayed() {
        CNALifestyleWeb_HeaderMenuPage.validateLuxuryHomePage();
    }
}
