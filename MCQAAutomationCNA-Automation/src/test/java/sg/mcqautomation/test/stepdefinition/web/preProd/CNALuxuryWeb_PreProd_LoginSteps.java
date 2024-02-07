package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNALuxuryWeb_PreProd_LoginPage;

public class CNALuxuryWeb_PreProd_LoginSteps {

    CNALuxuryWeb_PreProd_LoginPage CNALuxuryWeb_LoginPage = new CNALuxuryWeb_PreProd_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @Given("I launch the CNA Luxury web application and check HomePage in PreProd")
    public void ILaunchTheCNALuxuryWebApplicationAndCheckHomePage() {
        CNALuxuryWeb_LoginPage.launchApplication();
        CNALuxuryWeb_LoginPage.verifyHomePage();
    }


    @When("I Click on SignIn option from Luxury HomePage in PreProd")
    public void iClickOnSignInOptionFromLuxuryHomePage() {
        CNALuxuryWeb_LoginPage.clickOnSignInbutton();
    }

    @Then("I validate if user is LoggedIN to CNA Luxury Application in PreProd")
    public void iValidateIfUserIsLoggedINToCNALuxuryApplication() {
        CNALuxuryWeb_LoginPage.validateLifestyleLoginUserLandingPage();
    }
}

