package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_LoginPage;


public class CNA_MobileWeb_Android_LoginSteps {

    CNA_MobileWeb_Android_LoginPage cnaWeb_LoginPage = new CNA_MobileWeb_Android_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I launch the CNA web application and check HomePage in Android Mobile Web")
    public void i_launch_the_cna_web_application_and_check_home_page() {
        cnaWeb_LoginPage.launchApplication();
        cnaWeb_LoginPage.verifyHomePage();
    }

    @And("I verify the Primary menu Links in HomePage in Android Mobile Web")
    public void iVerifyThePrimaryMenuLinksInHomePage() {
        cnaWeb_LoginPage.verifyPrimaryMenuLinks();
    }

    @And("I Click on SignIn option from the Primary Links section in Android Mobile Web")
    public void iClickOnSignInOptionFromThePrimaryLinksSection() {
        cnaWeb_LoginPage.clickOnSignIn();
    }

    @When("I Validate SignIn Boarding page is displayed in Android Mobile Web")
    public void iValidateSignInBoardingPageIsDisplayed() {
        cnaWeb_LoginPage.signInOnBoardingPage();
    }

    @And("I log into web application with username and  password in Android Mobile Web")
    public void iLogIntoWebApplicationWithUsernameAndPassword() throws InterruptedException {
        cnaWeb_LoginPage.loginWithValidCreds();
        cnaWeb_LoginPage.clickSignInButton();
        //cnaWeb_LoginPage.refreshBrowser();
    }

    @Then("I validate Profile photo, Username and Primary Navigation Bars in Android Mobile Web")
    public void iValidateProfilePhotoUsernameAndPrimaryNavigationBars() {
        cnaWeb_LoginPage.validateProfilePhoto();
        cnaWeb_LoginPage.validateUsername();
        cnaWeb_LoginPage.validatePrimaryNavigationBars();
    }

    @When("I log into web application with invalid username {string} and password {string} in Android Mobile Web")
    public void iLogIntoWebApplicationWithInvalidUsernameAndPassword(String username, String password) throws InterruptedException {
        cnaWeb_LoginPage.loginWithInvalidValidCreds(username, password);
        cnaWeb_LoginPage.clickSignInButton();
    }

    @Then("I See Error Message as {string} in Android Mobile Web")
    public void iShouldSeeError(String strError) throws InterruptedException {
        String strText=cnaWeb_LoginPage.fnGetLoginError();
        Assert.assertEquals(strError.toLowerCase(), strText.toLowerCase());
    }

    @Then("I Validate Login options in SignIn Page in Android Mobile Web")
    public void iValidateLoginOptionsInSignInPage() {
        cnaWeb_LoginPage.loginToCNAWithMeConnectSectionsValidations();
        cnaWeb_LoginPage.loginOptionsValidations();
    }

    @When("I create a new MeConnect account from SignIn Page in Android Mobile Web")
    public void iCreateANewMeConnectAccountFromSignInPage() throws InterruptedException {
        cnaWeb_LoginPage.clickOnCreateNewMeConnectButton();
        cnaWeb_LoginPage.CreateNewMeConnectAccount();
    }

    @Then("I validate the account got created success message in Android Mobile Web")
    public void iValidateTheAccountGotCreatedSuccessMessage() {
        cnaWeb_LoginPage.validateSuccessMessage();
    }

    @Then("I click on SignIn button from boarding Page in Android Mobile Web")
    public void iClickOnSignInButtonFromBoardingPage() throws InterruptedException {
        cnaWeb_LoginPage.clickSignInButton();
    }

    @And("I validate the Field required warning message in Android Mobile Web")
    public void iValidateTheFieldRequiredWarningMessage() {
        cnaWeb_LoginPage.validateWarningMessage();
    }

    @Then("I click on Forgot Your Password Link in Android Mobile Web")
    public void iClickOnForgotYourPasswordLink() {
        cnaWeb_LoginPage.clickForgotPasswordLink();
    }

    @And("I validate if Forgot Password pop up screen is displayed in Android Mobile Web")
    public void iValidateIfForgotPasswordPopUpScreenIsDisplayed() {
        Assert.assertTrue(cnaWeb_LoginPage.validateForgotPasswordPopup());
    }

    @Then("I validate Submit Button and Email Text box in Android Mobile Web")
    public void iValidateSubmitButtonAndEmailTextBox() {
        Assert.assertTrue(cnaWeb_LoginPage.validateSubmitButtonAndEmailTextbox());
    }

    @And("I click on Submit without entering email Id in Android Mobile Web")
    public void iClickOnSubmitWithoutEnteringEmailId() {
        cnaWeb_LoginPage.clickSubmitButton();
    }

    @Then("I validate Enter valid email Id message in Android Mobile Web")
    public void iValidateEnterValidEmailIdMessage() {
        Assert.assertTrue(cnaWeb_LoginPage.validateEnterValidmailMessage());
    }

}



