package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_LoginPage;
import sg.mcqautomation.test.pages.web.preProd.CNALifestyleWeb_PreProd_LandingPage;

public class CNALifestyleWeb_PreProd_LandingPageSteps {


    CNALifestyleWeb_PreProd_LandingPage CNALifestyleWeb_LandingPage = new CNALifestyleWeb_PreProd_LandingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    CNAWeb_PreProd_LoginPage cnaWeb_LoginPage = new CNAWeb_PreProd_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I validate if all the landing Page components are present in PreProd")
    public void IValidateIfAllTheLandingPageComponentsArePresent() {
        CNALifestyleWeb_LandingPage.validateLifestyleLandingPageComponents();
    }

    @When("I click on Entertainment Main Menu link in PreProd")
    public void iClickOnEntertainmentMainMenuLink() {
        CNALifestyleWeb_LandingPage.clickEntertainmentMainmenuLink();
    }

    @And("I validate if Entertainment Landing Page is displayed in PreProd")
    public void iValidateIfEntertainmentLandingPageIsDisplayed() {
        Assert.assertTrue(CNALifestyleWeb_LandingPage.validateEntertainmentLandingPage());
    }

    @Then("I validate if SignIN option and Search option is available in PreProd")
    public void iValidateIfSignINOptionAndSearchOptionIsAvailable() {
        Assert.assertTrue(CNALifestyleWeb_LandingPage.validateProfileIconAndSearchMenu());
    }

    @When("I click on Living Main Menu link in PreProd")
    public void iClickOnLivingMainMenuLink() {
        CNALifestyleWeb_LandingPage.clickLivingMainmenuLink();
    }

    @And("I validate if Living Landing Page is displayed in PreProd")
    public void iValidateIfLivingLandingPageIsDisplayed() {
        Assert.assertTrue(CNALifestyleWeb_LandingPage.validateLivingLandingPage());
    }

    @When("I click on Travel Main Menu link in PreProd")
    public void iClickOnTravelMainMenuLink() {
        CNALifestyleWeb_LandingPage.clickTravelMainmenuLink();
    }

    @And("I validate if Travel Landing Page is displayed in PreProd")
    public void iValidateIfTravelLandingPageIsDisplayed() {
        Assert.assertTrue(CNALifestyleWeb_LandingPage.validateTravelLandingPage());
    }
}
