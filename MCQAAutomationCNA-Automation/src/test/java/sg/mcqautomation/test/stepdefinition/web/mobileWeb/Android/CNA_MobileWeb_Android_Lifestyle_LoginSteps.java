package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_Lifestyle_LoginPage;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_ProfilePopupPage;

public class CNA_MobileWeb_Android_Lifestyle_LoginSteps {

    CNA_MobileWeb_Android_Lifestyle_LoginPage CNALifestyleWeb_LoginPage = new CNA_MobileWeb_Android_Lifestyle_LoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    CNA_MobileWeb_Android_ProfilePopupPage ProfilePopUpPage = new CNA_MobileWeb_Android_ProfilePopupPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @Given("I launch the CNA Lifestyle web application and check HomePage in Android Mobile Web")
    public void ILaunchTheCNALifestyleWebApplicationAndCheckHomePage() {
        CNALifestyleWeb_LoginPage.launchApplication();
        CNALifestyleWeb_LoginPage.verifyHomePage();
    }

    @When("I Click on SignIn option from Lifestyle HomePage in Android Mobile Web")
    public void iClickOnSignInOptionFromLifestyleHomePage() {
        CNALifestyleWeb_LoginPage.clickOnSignInbutton();
    }


    @Then("I validate if user is LoggedIN to CNA Lifestyle Application in Android Mobile Web")
    public void iValidateIfUserIsLoggedINToCNALifestyleApplication() {
        CNALifestyleWeb_LoginPage.validateLifestyleLoginUserLandingPage();
    }

    @When("I click on the User Profile Photo in Android Mobile Web")
    public void iClickOnTheUserProfilePhotoInAndroidMobileWeb() {
        ProfilePopUpPage.clickOnProfilePhoto();
    }

    @Then("Pop up screen should be displayed in Android Mobile Web")
    public void popupScreenShouldBeDisplayedInAndroidMobileWeb() {
        ProfilePopUpPage.popUpScreen();
    }

    @And("I validate the Profile Pop Up Information Page in Android Mobile Web")
    public void iValidateTheProfilePopUpInformationPageInAndroidMobileWeb() throws InterruptedException {
        ProfilePopUpPage.validateProfileInformationPopUp();
    }

    @And("I SignOut of the Application and validate Home Page in Android Mobile Web")
    public void iSignOutOfTheApplicationAndValidateHomePageInAndroidMobileWeb() {
        ProfilePopUpPage.signOutYourAccount();
        CNALifestyleWeb_LoginPage.verifyHomePage();
    }
}
