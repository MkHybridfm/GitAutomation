package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNALifestyleWeb_LoginPage;

public class CNALifestyleWeb_LoginSteps {

    CNALifestyleWeb_LoginPage CNALifestyleWeb_LoginPage = new CNALifestyleWeb_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @Given("I launch the CNA Lifestyle web application and check HomePage")
    public void ILaunchTheCNALifestyleWebApplicationAndCheckHomePage() {
        CNALifestyleWeb_LoginPage.launchApplication();
        CNALifestyleWeb_LoginPage.verifyHomePage();
    }

    @When("I Click on SignIn option from Lifestyle HomePage")
    public void iClickOnSignInOptionFromLifestyleHomePage() {
        CNALifestyleWeb_LoginPage.clickOnSignInbutton();
    }


    @Then("I validate if user is LoggedIN to CNA Lifestyle Application")
    public void iValidateIfUserIsLoggedINToCNALifestyleApplication() {
        CNALifestyleWeb_LoginPage.validateLifestyleLoginUserLandingPage();
    }
}
