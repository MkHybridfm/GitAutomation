package sg.mcqautomation.test.stepdefinition.app.android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android.CNA_Android_HomePage;
import sg.mcqautomation.test.pages.app.android.CNA_Android_LoginPage;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_Android_LoginSteps {

	public ActionEngineHelper action;

	CNA_Android_LoginPage cnaLoginPage = new CNA_Android_LoginPage(DriverFactory.getDriver(),
			DriverFactory.getGlobalConfig());
	CNA_Android_HomePage cnaHomePage = new CNA_Android_HomePage(DriverFactory.getDriver(),
			DriverFactory.getGlobalConfig());

	@Given("I launch the Android App")
	public void i_launch_the_app_and_log_into_the_application() throws Throwable {
		cnaLoginPage.launchApplication();
	}

	@Then("I re navigate back to signup page in Android App")
	@Then("I validate signup page in Android App")
	public void iValidateSignupPage() {
		Assert.assertTrue(cnaLoginPage.validateSignInWithMeConnectButton());
		Assert.assertTrue(cnaLoginPage.validateSignInWithCreateMeConnectAccountButton());
		Assert.assertTrue(cnaLoginPage.validateContinueWithAppleAccountButton());
		Assert.assertTrue(cnaLoginPage.validateContinueWithFaceBookAccountButton());
		Assert.assertTrue(cnaLoginPage.validateContinueWithGoogleAccountButton());

	}

	@And("I click on create a new meConnect account in Android App")
	public void iClickOnCreateANewMeConnectAccount() {
		cnaLoginPage.createNewMeConnectAccountButton();
	}

	@Then("I validate create meConnect account first page in Android App")
	public void iValidateCreateMeConnectAccountFirstPage() {
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateCancelButtonOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountPage());
	}

	@And("I provide the user login credentials to log into the application in Android App")
	public void iProvideTheUserCredentialsToLogIntoTheApplication() throws InterruptedException {
		cnaLoginPage.loginCredentialsForNewUser();
		cnaLoginPage.clickOnNextButtonOnFirstPageOfCreateAccount();
	}

	@Then("I validate create meConnect account second page in Android App")
	public void iValidateCreateMeConnectAccountSecondPage() {
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateCancelButtonOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountSecondPage());
	}

	@And("I provide the user details of second page in Android App")
	public void iProvideTheUserDetailsOfSecondPage() throws InterruptedException {
		cnaLoginPage.userCredentialsOfSecondPage();
	}

	@Then("I validate create meConnect account third page in Android App")
	public void iValidateCreateMeConnectAccountThirdPage() {
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateCancelButtonOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountThirdPage());
	}

	@And("I provide the user details of third page in Android App")
	public void iProvideTheUserDetailsOfThirdPage() {
		cnaLoginPage.userCredentialsOfThirdPage();
	}

	@Then("I validate the account got created successFull message in Android App")
	public void iValidateTheAccountGotCreatedSuccessFullMessage() {
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountSuccessPage());
	}

	@Then("I validate onBoarding screen with skipButton and Signup button in Android App")
	public void iValidateOnBoardingScreenWithSkipButtonAndSignupButton() {
		Assert.assertTrue(cnaLoginPage.validateOnBoardingScreen());
	}

	@And("I validate swipe functionality onBoarding screen in Android App")
	@And("I validate swipe functionality on Home page in Android App")
	public void iValidateSwipeFunctionalityOnBoardingScreen() {
		cnaLoginPage.verifySwipingOnBoardingScreen();
	}

	@And("I click on signUp button in Android App")
	public void iClickOnSignUpButton() {
		cnaLoginPage.clickOnSignUpButton();
	}

	@And("I click on meConnect login button in Android App")
	public void iClickOnMeConnectLogin() {
		cnaLoginPage.clickOnMeConnectLoginButton();
	}

	@And("I provide meConnect connect credentials to log into the Android App")
	public void iProvideMeConnectConnectCredentialsToLogIntoTheApplication() throws InterruptedException {
		cnaLoginPage.loginCredentials();
	}

	@And("I click on login in Android App")
	public void i_login() throws Throwable {
		cnaLoginPage.clickOnLogin();
	}

	@Then("I should logout from Android App")
	public void i_should_logout() throws Throwable {
		cnaLoginPage.logoutFromApp();
	}

	@And("I click on settings icon in Android App")
	public void iClickOnSettingsIcon() {
		cnaLoginPage.clickOnSettingsIcon();
	}

    @Then("I validate the account section on settings page in Android App")
    public void iValidateTheAccountSectionOnSettingsPage() throws InterruptedException {
		//Assert.assertTrue(cnaLoginPage.validateAccountSection());
    }

    @Then("I validate the general section on settings page in Android App")
    public void iValidateTheGeneralSectionOnSettingsPage() {
		Assert.assertTrue(cnaLoginPage.validateGeneralSection());
    }

    @Then("I validate the contact section on settings page in Android App")
    public void iValidateTheContactSectionOnSettingsPage() throws InterruptedException {
		Assert.assertTrue(cnaLoginPage.validateContactSection());
    }

    @Then("I validate the about section on settings page in Android App")
    public void iValidateTheAboutSectionOnSettingsPage() throws InterruptedException {
		Assert.assertTrue(cnaLoginPage.validateAboutSection());
    }

	@And("I click on close button signup page in Android App")
	public void iClickOnCloseButtonSignupPage() {
		cnaLoginPage.clickOnCloseButtonOnSignUpPage();
	}

	@And("I click on skip button in Android App")
	public void iClickOnSkipButton() {
		cnaLoginPage.clickONSkipButton();
	}

	@And("I click on CNA luxury in Android App")
	public void iClickOnCNALuxury() {
		cnaLoginPage.clickOnLuxury();
	}

	@And("I click on CNA lifeStyle in Android App")
	public void iClickOnCNALifeStyle() {
		cnaLoginPage.clickOnLifeStyle();
	}

	@And("I click on notifications on general section in Android App")
	public void iClickOnNotificationsOnGeneralSection() {
		cnaLoginPage.clickOnNotifications();
	}

	@And("I click on display on general section in Android App")
	public void iClickOnDisplayOnGeneralSection() {
		cnaLoginPage.clickOnDisplaySec();
	}

	@And("I click on edition on general section in Android App")
	public void iClickOnEditionOnGeneralSection() {
		cnaLoginPage.clickOnEditionSec();
	}

	@And("I click on eye witness on contact section in Android App")
	public void iClickOnEyeWitnessOnContactSection() {
		cnaLoginPage.clickOnEyeWitnessSec();
	}

	@And("I click on help & feedback on contact section in Android App")
	public void iClickOnHelpFeedbackOnContactSection() {
		cnaLoginPage.clickOnHelpAndfeedbackButton();
	}

    @And("I click on advertisement sec on contact section in Android App")
    public void iClickOnAdvertisementSecOnContactSection() {
		cnaLoginPage.clickOnAdvertisementSec();
    }

	@And("I click on mediaCorp digital filed on contact section in Android App")
	public void iClickOnMediaCorpDigitalFiledOnContactSection() {
		cnaLoginPage.clickOnMediaCorpDigitalFieldButton();
	}

	@And("I click on channel id in Android App")
	public void iClickOnChannelId() {
		cnaLoginPage.clickOnChannelId();
	}

	@And("I click on terms of service filed on contact section in Android App")
	public void iClickOnTermsOfServiceFiledOnContactSection() {
		cnaLoginPage.clickOnTermsOfService();
	}

	@And("I click on privacy policy filed on contact section in Android App")
	public void iClickOnPrivacyPolicyFiledOnContactSection() {
		cnaLoginPage.clickOnPrivacyPolicy();
	}

	@Then("I validate the logout button in Android App")
	public void iValidateTheLogoutButton() {
		Assert.assertTrue(cnaLoginPage.validateLogoutSection());
	}

    @Then("I validate the browse All section in Android App")
    public void iValidateTheBrowseAllSection() {
		Assert.assertTrue(cnaLoginPage.verifyBrowseAllSec());
    }

    @And("I navigate to Top stories landing page and validate the header in Android App")
    public void iNavigateToTopStoriesLandingPageAndValidateTheHeader() {
		cnaLoginPage.clickOnTopStoriesUnderBrowseAllSec();
		//cnaHomePage.validateHomePageSectionLandingHeader();
	}

	@And("I click on watch page from menu sec in Android App")
	public void iClickOnWatchPageFromMenuSec() {
		cnaLoginPage.clickOnWatchPage();
	}

	@And("I click on special reports from menu in Android App")
	public void iClickOnSpecialReportsFromMenu() {
		cnaLoginPage.clickOnSpecialReports();
	}

	@Then("I validate the header as Special Reports in Android App")
	public void iValidateTheHeaderAsSpecialReports() {
		Assert.assertTrue(cnaLoginPage.verifyHeaderOfSpecialReports());
	}

	@And("I click on eye witness on menu sec in Android App")
	public void iClickOnEyeWitnessOnMenuSec() {
		cnaLoginPage.clickOnEyeWitness();
	}

	@Then("I validate the branded page header in Android App")
	public void iValidateTheBrandedPageHeader() {
		Assert.assertTrue(cnaLoginPage.verifyHeaderOfBrandedContent());
	}

	@And("I click on branded Content in Android App")
	public void iClickOnBrandedContent() {
		cnaLoginPage.clickOnBrandedContent();
	}

	@Given("I create a new account in Android App")
	public void iLaunchTheAppAndCreateANewAccount() throws InterruptedException {
		cnaLoginPage.clickOnSignUpButton();
		cnaLoginPage.createNewMeConnectAccountButton();
		cnaLoginPage.loginCredentialsForNewUser();
		cnaLoginPage.clickOnNextButtonOnFirstPageOfCreateAccount();
		cnaLoginPage.userCredentialsOfSecondPage();
		cnaLoginPage.userCredentialsOfThirdPage();
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountSuccessPage());
		cnaLoginPage.clickOkButtonOnSuccessMessagePage();
	}
}
