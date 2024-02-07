package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_Luxury_LoginPage;
import sg.mcqautomation.test.pages.web.prod.CNALuxuryWeb_LoginPage;

public class CNA_MobileWeb_Android_Luxury_LoginSteps {

    CNA_MobileWeb_Android_Luxury_LoginPage CNALuxuryWeb_LoginPage = new CNA_MobileWeb_Android_Luxury_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @Given("I launch the CNA Luxury web application and check HomePage in Android Mobile Web")
    public void ILaunchTheCNALuxuryWebApplicationAndCheckHomePage() {
        CNALuxuryWeb_LoginPage.launchApplication();
        CNALuxuryWeb_LoginPage.verifyHomePage();
    }


    @When("I Click on SignIn option from Luxury HomePage in Android Mobile Web")
    public void iClickOnSignInOptionFromLuxuryHomePage() {
        CNALuxuryWeb_LoginPage.clickOnSignInbutton();
    }

    @Then("I validate if user is LoggedIN to CNA Luxury Application in Android Mobile Web")
    public void iValidateIfUserIsLoggedINToCNALuxuryApplication() {
        CNALuxuryWeb_LoginPage.validateLifestyleLoginUserLandingPage();
    }
}

