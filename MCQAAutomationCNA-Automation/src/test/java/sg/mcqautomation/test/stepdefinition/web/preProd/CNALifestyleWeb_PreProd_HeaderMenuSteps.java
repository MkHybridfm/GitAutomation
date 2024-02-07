package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNALifestyleWeb_PreProd_HeaderMenuPage;

public class CNALifestyleWeb_PreProd_HeaderMenuSteps {

    CNALifestyleWeb_PreProd_HeaderMenuPage CNALifestyleWeb_HeaderMenuPage = new CNALifestyleWeb_PreProd_HeaderMenuPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on Go to Luxury link from Header Menu in PreProd")
    public void iClickOnGoToLuxuryLinkFromHeaderMenu() {
        CNALifestyleWeb_HeaderMenuPage.ClickOnGoToLuxuryLinkFromHeaderMenu();
    }

    @Then("I validate if Lifestyle Luxury Page header is displayed in PreProd")
    public void iValidateIfLifestyleLuxuryPageHeaderIsDisplayed() {
        CNALifestyleWeb_HeaderMenuPage.validateLuxuryHomePage();
    }
}
