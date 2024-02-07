package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNALuxuryWeb_LoginPage;

public class CNALuxuryWeb_LoginSteps {

    CNALuxuryWeb_LoginPage CNALuxuryWeb_LoginPage = new CNALuxuryWeb_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @Given("I launch the CNA Luxury web application and check HomePage")
    public void ILaunchTheCNALuxuryWebApplicationAndCheckHomePage() {
        CNALuxuryWeb_LoginPage.launchApplication();
        CNALuxuryWeb_LoginPage.verifyHomePage();
    }


    @When("I Click on SignIn option from Luxury HomePage")
    public void iClickOnSignInOptionFromLuxuryHomePage() {
        CNALuxuryWeb_LoginPage.clickOnSignInbutton();
    }

    @Then("I validate if user is LoggedIN to CNA Luxury Application")
    public void iValidateIfUserIsLoggedINToCNALuxuryApplication() {
        CNALuxuryWeb_LoginPage.validateLifestyleLoginUserLandingPage();
    }
}

