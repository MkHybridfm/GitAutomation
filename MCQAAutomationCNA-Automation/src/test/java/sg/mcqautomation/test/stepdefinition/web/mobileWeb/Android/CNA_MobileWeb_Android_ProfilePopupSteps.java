package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_LoginPage;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_ProfilePopupPage;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_LoginPage;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_ProfilePopupPage;

public class CNA_MobileWeb_Android_ProfilePopupSteps
{

    CNA_MobileWeb_Android_ProfilePopupPage cnaWeb_ProfilePage = new CNA_MobileWeb_Android_ProfilePopupPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    CNA_MobileWeb_Android_LoginPage cnaWeb_LoginPage = new CNA_MobileWeb_Android_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on the User Profile Image in Android Mobile Web")
    public void IClickOnTheUserProfilePhoto() {
        cnaWeb_ProfilePage.clickOnProfilePhoto();
    }

    @Then("Popup screen should be displayed in Android Mobile Web")
    public void popupScreenShouldBeDisplayed() {
        cnaWeb_ProfilePage.popUpScreen();
    }

    @And("I validate the Profile PopUp Information Page in Android Mobile Web")
    public void iValidateTheProfilePopUpInformationPage() throws InterruptedException {
        cnaWeb_ProfilePage.validateProfileInformationPopUp();
    }

    @And("I SignOut of the Application and validate HomePage in Android Mobile Web")
    public void iSignOutOfTheApplicationAndValidateHomePage() {
        cnaWeb_ProfilePage.signOutYourAccount();
        cnaWeb_LoginPage.verifyHomePage();
    }

    @And("I validate if Manage meConnect Account button in Android Mobile Web")
    public void iValidateIfManageMeConnectAccountButton() throws InterruptedException {
        cnaWeb_ProfilePage.validateManageMeconnectButton();
    }

    @Then("I click on Manage meConnect Account button in Android Mobile Web")
    public void iClickOnManageMeConnectAccountButton() {
        cnaWeb_ProfilePage.clickManageMeConnectButton();
    }

    @And("I validate if MeConnect Profile setup page is displayed in Android Mobile Web")
    public void iValidateIfMeConnectProfileSetupPageIsDisplayed() {
        cnaWeb_ProfilePage.validateMeConnectProfileSetupPage();
    }
}
