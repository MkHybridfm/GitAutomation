package sg.mcqautomation.test.stepdefinition.app.ios.iPad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNAHomePage;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNALoginPage;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class iPadCNALoginSteps {

	public ActionEngineHelper action;

	iPadCNALoginPage cnaLoginPage = new iPadCNALoginPage(DriverFactory.getDriver(),
			DriverFactory.getGlobalConfig());
	iPadCNAHomePage cnaHomePage = new iPadCNAHomePage(DriverFactory.getDriver(),
			DriverFactory.getGlobalConfig());

	@Given("I launch the in iPad")
	public void i_launch_the_app_and_log_into_the_application() throws Throwable {
		cnaLoginPage.launchApplication();
	}

	@Then("I re navigate back to signup page in iPad")
	@Then("I validate signup page in iPad")
	public void iValidateSignupPage() {
		Assert.assertTrue(cnaLoginPage.validateSignInWithMeConnectButton());
		Assert.assertTrue(cnaLoginPage.validateSignInWithCreateMeConnectAccountButton());
		Assert.assertTrue(cnaLoginPage.validateContinueWithAppleAccountButton());
		Assert.assertTrue(cnaLoginPage.validateContinueWithFaceBookAccountButton());
		Assert.assertTrue(cnaLoginPage.validateContinueWithGoogleAccountButton());
	}

	@And("I click on create a new meConnect account in iPad")
	public void iClickOnCreateANewMeConnectAccount() {
		cnaLoginPage.createNewMeConnectAccountButton();
	}

	@Then("I validate create meConnect account first page in iPad")
	public void iValidateCreateMeConnectAccountFirstPage() {
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateCancelButtonOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountPage());
	}

	@And("I provide the user login credentials to log into the application in iPad")
	public void iProvideTheUserCredentialsToLogIntoTheApplication() throws InterruptedException {
		cnaLoginPage.loginCredentialsForNewUser();
		cnaLoginPage.clickOnNextButtonOnFirstPageOfCreateAccount();
	}

	@Then("I validate create meConnect account second page in iPad")
	public void iValidateCreateMeConnectAccountSecondPage() {
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateCancelButtonOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountSecondPage());
	}

	@And("I provide the user details of second page in iPad")
	public void iProvideTheUserDetailsOfSecondPage() throws InterruptedException {
		cnaLoginPage.userCredentialsOfSecondPage();
	}

	@Then("I validate create meConnect account third page in iPad")
	public void iValidateCreateMeConnectAccountThirdPage() {
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateCancelButtonOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountThirdPage());
	}

	@And("I provide the user details of third page in iPad")
	public void iProvideTheUserDetailsOfThirdPage() {
		cnaLoginPage.userCredentialsOfThirdPage();
	}

	@Then("I validate the account got created successFull message in iPad")
	public void iValidateTheAccountGotCreatedSuccessFullMessage() {
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountSuccessPage());
	}

	@When("I click on OK Button in Signup Screen in iPad")
	public void clickonOKButton() {
		cnaLoginPage.clickonOkSucessfull();
	}


	@Then("I validate onBoarding screen with skipButton and Signup button in iPad")
	public void iValidateOnBoardingScreenWithSkipButtonAndSignupButton() {
		Assert.assertTrue(cnaLoginPage.validateOnBoardingScreen());
	}

	@And("I validate swipe functionality onBoarding screen in iPad")
	@And("I validate swipe functionality on Home page in iPad")
	public void iValidateSwipeFunctionalityOnBoardingScreen() {
		cnaLoginPage.verifySwipingOnBoardingScreen();
	}

	@And("I click on signUp button in iPad")
	public void iClickOnSignUpButton() {
		cnaLoginPage.clickOnSignUpButton();
	}

	@And("I click on meConnect login button in iPad")
	public void iClickOnMeConnectLogin() {
		cnaLoginPage.clickOnMeConnectLoginButton();
	}

	@And("I provide meConnect connect credentials to log into the iPad")
	public void iProvideMeConnectConnectCredentialsToLogIntoTheApplication() throws InterruptedException {
		cnaLoginPage.loginCredentials();
	}

	@And("I click on login in iPad")
	public void i_login() throws Throwable {
		cnaLoginPage.clickOnLogin();
	}

	@Then("I should logout from iPad")
	public void i_should_logout() throws Throwable {
		cnaLoginPage.logoutFromApp();
	}

	@And("I click on settings icon in iPad")
	public void iClickOnSettingsIcon() {
		cnaLoginPage.clickOnSettingsIcon();
	}

	@Then("I validate the account section on settings page in iPad")
	public void iValidateTheAccountSectionOnSettingsPage() {
		Assert.assertTrue(cnaLoginPage.validateAccountSection());
	}

	@Then("I validate the general section on settings page in iPad")
	public void iValidateTheGeneralSectionOnSettingsPage() {
		Assert.assertTrue(cnaLoginPage.validateGeneralSection());
	}

	@Then("I validate the contact section on settings page in iPad")
	public void iValidateTheContactSectionOnSettingsPage() throws InterruptedException {
		Assert.assertTrue(cnaLoginPage.validateContactSection());
	}

	@Then("I validate the about section on settings page in iPad")
	public void iValidateTheAboutSectionOnSettingsPage() throws InterruptedException {
		Assert.assertTrue(cnaLoginPage.validateAboutSection());
	}

	@And("I click on close button signup page in iPad")
	public void iClickOnCloseButtonSignupPage() {
		cnaLoginPage.clickOnCloseButtonOnSignUpPage();
	}

	@And("I click on skip button in iPad")
	public void iClickOnSkipButton() {
		cnaLoginPage.clickONSkipButton();
	}

	@And("I click on CNA luxury in iPad")
	public void iClickOnCNALuxury() {
		cnaLoginPage.clickOnLuxury();
	}

	@And("I click on CNA lifeStyle in iPad")
	public void iClickOnCNALifeStyle() {
		cnaLoginPage.clickOnLifeStyle();
	}


	@And("I click on notifications on general section in iPad")
	public void iClickOnNotificationsOnGeneralSection() {
		cnaLoginPage.clickOnNotifications();
	}

	@And("I click on display on general section in iPad")
	public void iClickOnDisplayOnGeneralSection() {
		cnaLoginPage.clickOnDisplaySec();
	}

	@And("I click on edition on general section in iPad")
	public void iClickOnEditionOnGeneralSection() {
		cnaLoginPage.clickOnEditionSec();
	}

	@And("I click on eye witness on contact section in iPad")
	public void iClickOnEyeWitnessOnContactSection() {
		cnaLoginPage.clickOnEyeWitnessSec();
	}

	@And("I click on help & feedback on contact section in iPad")
	public void iClickOnHelpFeedbackOnContactSection() {
		cnaLoginPage.clickOnHelpAndfeedbackButton();
	}

	@And("I click on advertisement sec on contact section in iPad")
	public void iClickOnAdvertisementSecOnContactSection() {
		cnaLoginPage.clickOnAdvertisementSec();
	}

	@And("I click on mediaCorp digital filed on contact section in iPad")
	public void iClickOnMediaCorpDigitalFiledOnContactSection() {
		cnaLoginPage.clickOnMediaCorpDigitalFieldButton();
	}

	@And("I click on channel id in iPad")
	public void iClickOnChannelId() {
		cnaLoginPage.clickOnChannelId();
	}

	@And("I click on terms of service filed on contact section in iPad")
	public void iClickOnTermsOfServiceFiledOnContactSection() {
		cnaLoginPage.clickOnTermsOfService();
	}

	@And("I click on privacy policy filed on contact section in iPad")
	public void iClickOnPrivacyPolicyFiledOnContactSection() {
		cnaLoginPage.clickOnPrivacyPolicy();
	}

	@Then("I validate the logout button in iPad")
	public void iValidateTheLogoutButton() {
		Assert.assertTrue(cnaLoginPage.validateLogoutSection());
	}

	@Then("I validate the browse All section in iPad")
	public void iValidateTheBrowseAllSection() {
		Assert.assertTrue(cnaLoginPage.verifyBrowseAllSec());
	}

	@And("I navigate to Top stories landing page and validate the header in iPad")
	public void iNavigateToTopStoriesLandingPageAndValidateTheHeader() {
		cnaLoginPage.clickOnTopStoriesUnderBrowseAllSec();
		//cnaHomePage.validateHomePageSectionLandingHeader();
	}

	@And("I click on watch page from menu sec in iPad")
	public void iClickOnWatchPageFromMenuSec() {
		cnaLoginPage.clickOnWatchPage();
	}

	@And("I click on special reports from menu in iPad")
	public void iClickOnSpecialReportsFromMenu() {
		cnaLoginPage.clickOnSpecialReports();
	}

	@Then("I validate the header as Special Reports in iPad")
	public void iValidateTheHeaderAsSpecialReports() {
		Assert.assertTrue(cnaLoginPage.verifyHeaderOfSpecialReports());
	}

	@And("I click on eye witness on menu sec in iPad")
	public void iClickOnEyeWitnessOnMenuSec() {
		cnaLoginPage.clickOnEyeWitness();
	}

	@Then("I validate the branded page header in iPad")
	public void iValidateTheBrandedPageHeader() {
		Assert.assertTrue(cnaLoginPage.verifyHeaderOfBrandedContent());
	}

	@And("I click on branded Content in iPad")
	public void iClickOnBrandedContent() {
		cnaLoginPage.clickOnBrandedContent();
	}

	@Given("I create a new account in iPad")
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

	//*****
	@When("I Enter Valid User Name on {string} in iPad")
	public void fnEnterValidUserName(String strTitleName) throws Throwable {
		cnaLoginPage.fnEnterValidUserEmail();
	}

	@When("I Enter Valid Password Name on {string} in iPad")
	public void fnEnterValidPassword(String strTitleName) throws Throwable {
		cnaLoginPage.fnEnterValidPassword();
	}

}