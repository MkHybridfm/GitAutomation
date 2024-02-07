package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNALuxuryWeb_PreProd_HeaderMenuPage;

public class CNALuxuryWeb_PreProd_HeaderMenuSteps {


            CNALuxuryWeb_PreProd_HeaderMenuPage CNALuxuryWeb_HeaderMenuPage = new CNALuxuryWeb_PreProd_HeaderMenuPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
            public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on Go to Lifestyle link from Header Menu in PreProd")
    public void iClickOnGoToLifestyleLinkFromHeaderMenu() {
        CNALuxuryWeb_HeaderMenuPage.ClickOnGoToLifestyleLinkFromHeaderMenu();
    }

    @Then("I validate if Lifestyle Page header is displayed in PreProd")
    public void iValidateIfLifestylePageHeaderIsDisplayed() throws InterruptedException {
        CNALuxuryWeb_HeaderMenuPage.validateLuxuryHomePage();
    }
}
