package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_LoginPage;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_ProfilePopupPage;

public class CNA_MobileWeb_IOS_ProfilePopupSteps
{

    CNA_MobileWeb_IOS_ProfilePopupPage cnaWeb_ProfilePage = new CNA_MobileWeb_IOS_ProfilePopupPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    CNA_MobileWeb_IOS_LoginPage cnaWeb_LoginPage = new CNA_MobileWeb_IOS_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I click on the User Profile Image in IOS Mobile Web")
    public void IClickOnTheUserProfilePhoto() {
        cnaWeb_ProfilePage.clickOnProfilePhoto();
    }

    @Then("Popup screen should be displayed in IOS Mobile Web")
    public void popupScreenShouldBeDisplayed() {
        cnaWeb_ProfilePage.popUpScreen();
    }

    @And("I validate the Profile PopUp Information Page in IOS Mobile Web")
    public void iValidateTheProfilePopUpInformationPage() throws InterruptedException {
        cnaWeb_ProfilePage.validateProfileInformationPopUp();
    }

    @And("I SignOut of the Application and validate HomePage in IOS Mobile Web")
    public void iSignOutOfTheApplicationAndValidateHomePage() {
        cnaWeb_ProfilePage.signOutYourAccount();
        cnaWeb_LoginPage.verifyHomePage();
    }

    @And("I validate if Manage meConnect Account button in IOS Mobile Web")
    public void iValidateIfManageMeConnectAccountButton() throws InterruptedException {
        cnaWeb_ProfilePage.validateManageMeconnectButton();
    }

    @Then("I click on Manage meConnect Account button in IOS Mobile Web")
    public void iClickOnManageMeConnectAccountButton() {
        cnaWeb_ProfilePage.clickManageMeConnectButton();
    }

    @And("I validate if MeConnect Profile setup page is displayed in IOS Mobile Web")
    public void iValidateIfMeConnectProfileSetupPageIsDisplayed() {
        cnaWeb_ProfilePage.validateMeConnectProfileSetupPage();
    }

   }
