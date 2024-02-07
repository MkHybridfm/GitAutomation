package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_Lifestyle_LoginPage;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_ProfilePopupPage;

public class CNA_MobileWeb_IOS_Lifestyle_LoginSteps {

    CNA_MobileWeb_IOS_Lifestyle_LoginPage CNALifestyleWeb_LoginPage = new CNA_MobileWeb_IOS_Lifestyle_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    CNA_MobileWeb_IOS_ProfilePopupPage ProfilePopUpPage = new CNA_MobileWeb_IOS_ProfilePopupPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @Given("I launch the CNA Lifestyle web application and check HomePage in IOS Mobile Web")
    public void ILaunchTheCNALifestyleWebApplicationAndCheckHomePage() {
        CNALifestyleWeb_LoginPage.launchApplication();
        CNALifestyleWeb_LoginPage.verifyHomePage();
    }

    @When("I Click on SignIn option from Lifestyle HomePage in IOS Mobile Web")
    public void iClickOnSignInOptionFromLifestyleHomePage() {
        CNALifestyleWeb_LoginPage.clickOnSignInbutton();
    }


    @Then("I validate if user is LoggedIN to CNA Lifestyle Application in IOS Mobile Web")
    public void iValidateIfUserIsLoggedINToCNALifestyleApplication() {
        CNALifestyleWeb_LoginPage.validateLifestyleLoginUserLandingPage();
    }

    @When("I click on the User Profile Photo in IOS Mobile Web")
    public void iClickOnTheUserProfilePhotoInIOSMobileWeb() {
        ProfilePopUpPage.clickOnProfilePhoto();
    }

    @Then("Pop up screen should be displayed in IOS Mobile Web")
    public void popupScreenShouldBeDisplayedInIOSMobileWeb() {
        ProfilePopUpPage.popUpScreen();
    }

    @And("I validate the Profile Pop Up Information Page in IOS Mobile Web")
    public void iValidateTheProfilePopUpInformationPageInIOSMobileWeb() throws InterruptedException {
        ProfilePopUpPage.validateProfileInformationPopUp();
    }

    @And("I SignOut of the Application and validate Home Page in IOS Mobile Web")
    public void iSignOutOfTheApplicationAndValidateHomePageInIOSMobileWeb() {
        ProfilePopUpPage.signOutYourAccount();
        CNALifestyleWeb_LoginPage.verifyHomePage();
    }
}
