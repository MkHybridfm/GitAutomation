package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_LoginPage;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_ProfilePopupPage;

public class CNAWeb_ProfilePopupSteps
{

    CNAWeb_ProfilePopupPage cnaWeb_ProfilePage = new CNAWeb_ProfilePopupPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    CNAWeb_LoginPage cnaWeb_LoginPage = new CNAWeb_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on the User Profile Photo")
    public void IClickOnTheUserProfilePhoto() {
        cnaWeb_ProfilePage.clickOnProfilePhoto();
    }

    @Then("Popup screen should be displayed")
    public void popupScreenShouldBeDisplayed() {
        cnaWeb_ProfilePage.popUpScreen();
    }

    @And("I validate the Profile PopUp Information Page")
    public void iValidateTheProfilePopUpInformationPage() throws InterruptedException {
        cnaWeb_ProfilePage.validateProfileInformationPopUp();
    }

    @And("I SignOut of the Application and validate HomePage")
    public void iSignOutOfTheApplicationAndValidateHomePage() {
        cnaWeb_ProfilePage.signOutYourAccount();
        cnaWeb_LoginPage.verifyHomePage();
    }

    @And("I validate if Manage meConnect Account button")
    public void iValidateIfManageMeConnectAccountButton() throws InterruptedException {
        cnaWeb_ProfilePage.validateManageMeconnectButton();
    }

    @Then("I click on Manage meConnect Account button")
    public void iClickOnManageMeConnectAccountButton() {
        cnaWeb_ProfilePage.clickManageMeConnectButton();
    }

    @And("I validate if MeConnect Profile setup page is displayed")
    public void iValidateIfMeConnectProfileSetupPageIsDisplayed() {
        cnaWeb_ProfilePage.validateMeConnectProfileSetupPage();
    }
}
