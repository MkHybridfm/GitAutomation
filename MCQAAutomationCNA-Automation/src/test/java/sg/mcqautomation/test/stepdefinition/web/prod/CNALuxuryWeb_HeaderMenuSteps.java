package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNALuxuryWeb_HeaderMenuPage;

public class CNALuxuryWeb_HeaderMenuSteps {


            CNALuxuryWeb_HeaderMenuPage CNALuxuryWeb_HeaderMenuPage = new CNALuxuryWeb_HeaderMenuPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
            public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on Go to Lifestyle link from Header Menu")
    public void iClickOnGoToLifestyleLinkFromHeaderMenu() {
        CNALuxuryWeb_HeaderMenuPage.ClickOnGoToLifestyleLinkFromHeaderMenu();
    }

    @Then("I validate if Lifestyle Page header is displayed")
    public void iValidateIfLifestylePageHeaderIsDisplayed() throws InterruptedException {
        CNALuxuryWeb_HeaderMenuPage.validateLuxuryHomePage();
    }
}
