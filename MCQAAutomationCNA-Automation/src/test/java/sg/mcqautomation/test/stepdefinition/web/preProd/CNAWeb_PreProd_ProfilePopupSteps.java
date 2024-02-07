package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_LoginPage;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_ProfilePopupPage;

public class CNAWeb_PreProd_ProfilePopupSteps
{

    CNAWeb_PreProd_ProfilePopupPage cnaWeb_ProfilePage = new CNAWeb_PreProd_ProfilePopupPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    CNAWeb_PreProd_LoginPage cnaWeb_LoginPage = new CNAWeb_PreProd_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on the User Profile Photo in PreProd")
    public void IClickOnTheUserProfilePhoto() {
        cnaWeb_ProfilePage.clickOnProfilePhoto();
    }

    @Then("Popup screen should be displayed in PreProd")
    public void popupScreenShouldBeDisplayed() {
        cnaWeb_ProfilePage.popUpScreen();
    }

    @And("I validate the Profile PopUp Information Page in PreProd")
    public void iValidateTheProfilePopUpInformationPage() throws InterruptedException {
        cnaWeb_ProfilePage.validateProfileInformationPopUp();
    }

    @And("I SignOut of the Application and validate HomePage in PreProd")
    public void iSignOutOfTheApplicationAndValidateHomePage() {
        cnaWeb_ProfilePage.signOutYourAccount();
        cnaWeb_LoginPage.verifyHomePage();
    }

    @And("I validate if Manage meConnect Account button in PreProd")
    public void iValidateIfManageMeConnectAccountButton() throws InterruptedException {
        cnaWeb_ProfilePage.validateManageMeconnectButton();
    }

    @Then("I click on Manage meConnect Account button in PreProd")
    public void iClickOnManageMeConnectAccountButton() {
        cnaWeb_ProfilePage.clickManageMeConnectButton();
    }

    @And("I validate if MeConnect Profile setup page is displayed in PreProd")
    public void iValidateIfMeConnectProfileSetupPageIsDisplayed() {
        cnaWeb_ProfilePage.validateMeConnectProfileSetupPage();
    }
}
