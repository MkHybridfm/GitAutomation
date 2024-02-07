package sg.mcqautomation.test.stepdefinition.app.ios.iPhone;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNAHomePage;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNALoginPage;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class iPhoneCNALoginSteps {

	public ActionEngineHelper action;

	iPhoneCNALoginPage cnaLoginPage = new iPhoneCNALoginPage(DriverFactory.getDriver(),
			DriverFactory.getGlobalConfig());
	iPhoneCNAHomePage cnaHomePage = new iPhoneCNAHomePage(DriverFactory.getDriver(),
			DriverFactory.getGlobalConfig());

	@Given("I launch the in iPhone")
	public void i_launch_the_app_and_log_into_the_application() throws Throwable {
		cnaLoginPage.launchApplication();
	}

	@Then("I re navigate back to signup page in iPhone")
	@Then("I validate signup page in iPhone")
	public void iValidateSignupPage() {
		Assert.assertTrue(cnaLoginPage.validateSignInWithMeConnectButton());
		Assert.assertTrue(cnaLoginPage.validateSignInWithCreateMeConnectAccountButton());
		Assert.assertTrue(cnaLoginPage.validateContinueWithAppleAccountButton());
		Assert.assertTrue(cnaLoginPage.validateContinueWithFaceBookAccountButton());
		Assert.assertTrue(cnaLoginPage.validateContinueWithGoogleAccountButton());
	}

	@And("I click on create a new meConnect account in iPhone")
	public void iClickOnCreateANewMeConnectAccount() {
		cnaLoginPage.createNewMeConnectAccountButton();
	}

	@Then("I validate create meConnect account first page in iPhone")
	public void iValidateCreateMeConnectAccountFirstPage() {
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateCancelButtonOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountPage());
	}

	@And("I provide the user login credentials to log into the application in iPhone")
	public void iProvideTheUserCredentialsToLogIntoTheApplication() throws InterruptedException {
		cnaLoginPage.loginCredentialsForNewUser();
		cnaLoginPage.clickOnNextButtonOnFirstPageOfCreateAccount();
	}

	@Then("I validate create meConnect account second page in iPhone")
	public void iValidateCreateMeConnectAccountSecondPage() {
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateCancelButtonOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountSecondPage());
	}

	@And("I provide the user details of second page in iPhone")
	public void iProvideTheUserDetailsOfSecondPage() throws InterruptedException {
		cnaLoginPage.userCredentialsOfSecondPage();
	}

	@Then("I validate create meConnect account third page in iPhone")
	public void iValidateCreateMeConnectAccountThirdPage() {
		Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateCancelButtonOnCreateMeConnectAccountPage());
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountThirdPage());
	}

	@And("I provide the user details of third page in iPhone")
	public void iProvideTheUserDetailsOfThirdPage() {
		cnaLoginPage.userCredentialsOfThirdPage();
	}

	@Then("I validate the account got created successFull message in iPhone")
	public void iValidateTheAccountGotCreatedSuccessFullMessage() {
		Assert.assertTrue(cnaLoginPage.validateContentOnCreateMeConnectAccountSuccessPage());
	}

	@When("I click on OK Button in Signup Screen in iPhone")
	public void clickonOKButton() {
		cnaLoginPage.clickonOkSucessfull();
	}


	@Then("I validate onBoarding screen with skipButton and Signup button in iPhone")
	public void iValidateOnBoardingScreenWithSkipButtonAndSignupButton() {
		Assert.assertTrue(cnaLoginPage.validateOnBoardingScreen());
	}

	@And("I validate swipe functionality onBoarding screen in iPhone")
	@And("I validate swipe functionality on Home page in iPhone")
	public void iValidateSwipeFunctionalityOnBoardingScreen() {
		cnaLoginPage.verifySwipingOnBoardingScreen();
	}

	@And("I click on signUp button in iPhone")
	public void iClickOnSignUpButton() {
		cnaLoginPage.clickOnSignUpButton();
	}

	@And("I click on meConnect login button in iPhone")
	public void iClickOnMeConnectLogin() {
		cnaLoginPage.clickOnMeConnectLoginButton();
	}

	@And("I provide meConnect connect credentials to log into the iPhone")
	public void iProvideMeConnectConnectCredentialsToLogIntoTheApplication() throws InterruptedException {
		cnaLoginPage.loginCredentials();
	}

	@And("I click on login in iPhone")
	public void i_login() throws Throwable {
		cnaLoginPage.clickOnLogin();
	}

	@Then("I should logout from iPhone")
	public void i_should_logout() throws Throwable {
		cnaLoginPage.logoutFromApp();
	}

	@And("I click on settings icon in iPhone")
	public void iClickOnSettingsIcon() {
		cnaLoginPage.clickOnSettingsIcon();
	}

    @Then("I validate the account section on settings page in iPhone")
    public void iValidateTheAccountSectionOnSettingsPage() {
		Assert.assertTrue(cnaLoginPage.validateAccountSection());
    }

    @Then("I validate the general section on settings page in iPhone")
    public void iValidateTheGeneralSectionOnSettingsPage() {
		Assert.assertTrue(cnaLoginPage.validateGeneralSection());
    }

    @Then("I validate the contact section on settings page in iPhone")
    public void iValidateTheContactSectionOnSettingsPage() throws InterruptedException {
		Assert.assertTrue(cnaLoginPage.validateContactSection());
    }

    @Then("I validate the about section on settings page in iPhone")
    public void iValidateTheAboutSectionOnSettingsPage() throws InterruptedException {
		Assert.assertTrue(cnaLoginPage.validateAboutSection());
    }

	@And("I click on close button signup page in iPhone")
	public void iClickOnCloseButtonSignupPage() {
		cnaLoginPage.clickOnCloseButtonOnSignUpPage();
	}

	@And("I click on skip button in iPhone")
	public void iClickOnSkipButton() {
		cnaLoginPage.clickONSkipButton();
	}

	@And("I click on CNA luxury in iPhone")
	public void iClickOnCNALuxury() {
		cnaLoginPage.clickOnLuxury();
	}

	@And("I click on CNA lifeStyle in iPhone")
	public void iClickOnCNALifeStyle() {
		cnaLoginPage.clickOnLifeStyle();
	}


	@And("I click on notifications on general section in iPhone")
	public void iClickOnNotificationsOnGeneralSection() {
		cnaLoginPage.clickOnNotifications();
	}

	@And("I click on display on general section in iPhone")
	public void iClickOnDisplayOnGeneralSection() {
		cnaLoginPage.clickOnDisplaySec();
	}

	@And("I click on edition on general section in iPhone")
	public void iClickOnEditionOnGeneralSection() {
		cnaLoginPage.clickOnEditionSec();
	}

	@And("I click on eye witness on contact section in iPhone")
	public void iClickOnEyeWitnessOnContactSection() {
		cnaLoginPage.clickOnEyeWitnessSec();
	}

	@And("I click on help & feedback on contact section in iPhone")
	public void iClickOnHelpFeedbackOnContactSection() {
		cnaLoginPage.clickOnHelpAndfeedbackButton();
	}

    @And("I click on advertisement sec on contact section in iPhone")
    public void iClickOnAdvertisementSecOnContactSection() {
		cnaLoginPage.clickOnAdvertisementSec();
    }

	@And("I click on mediaCorp digital filed on contact section in iPhone")
	public void iClickOnMediaCorpDigitalFiledOnContactSection() {
		cnaLoginPage.clickOnMediaCorpDigitalFieldButton();
	}

	@And("I click on channel id in iPhone")
	public void iClickOnChannelId() {
		cnaLoginPage.clickOnChannelId();
	}

	@And("I click on terms of service filed on contact section in iPhone")
	public void iClickOnTermsOfServiceFiledOnContactSection() {
		cnaLoginPage.clickOnTermsOfService();
	}

	@And("I click on privacy policy filed on contact section in iPhone")
	public void iClickOnPrivacyPolicyFiledOnContactSection() {
		cnaLoginPage.clickOnPrivacyPolicy();
	}

	@Then("I validate the logout button in iPhone")
	public void iValidateTheLogoutButton() {
		Assert.assertTrue(cnaLoginPage.validateLogoutSection());
	}

    @Then("I validate the browse All section in iPhone")
    public void iValidateTheBrowseAllSection() {
		Assert.assertTrue(cnaLoginPage.verifyBrowseAllSec());
    }

    @And("I navigate to Top stories landing page and validate the header in iPhone")
    public void iNavigateToTopStoriesLandingPageAndValidateTheHeader() {
		cnaLoginPage.clickOnTopStoriesUnderBrowseAllSec();
		//cnaHomePage.validateHomePageSectionLandingHeader();
	}

	@And("I click on watch page from menu sec in iPhone")
	public void iClickOnWatchPageFromMenuSec() {
		cnaLoginPage.clickOnWatchPage();
	}

	@And("I click on special reports from menu in iPhone")
	public void iClickOnSpecialReportsFromMenu() {
		cnaLoginPage.clickOnSpecialReports();
	}

	@Then("I validate the header as Special Reports in iPhone")
	public void iValidateTheHeaderAsSpecialReports() {
		Assert.assertTrue(cnaLoginPage.verifyHeaderOfSpecialReports());
	}

	@And("I click on eye witness on menu sec in iPhone")
	public void iClickOnEyeWitnessOnMenuSec() {
		cnaLoginPage.clickOnEyeWitness();
	}

	@Then("I validate the branded page header in iPhone")
	public void iValidateTheBrandedPageHeader() {
		Assert.assertTrue(cnaLoginPage.verifyHeaderOfBrandedContent());
	}

	@And("I click on branded Content in iPhone")
	public void iClickOnBrandedContent() {
		cnaLoginPage.clickOnBrandedContent();
	}

	@Given("I create a new account in iPhone")
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
		@When("I Enter Valid User Name on {string} in iPhone")
		public void fnEnterValidUserName(String strTitleName) throws Throwable {
			cnaLoginPage.fnEnterValidUserEmail();
		}

		@When("I Enter Valid Password Name on {string} in iPhone")
		public void fnEnterValidPassword(String strTitleName) throws Throwable {
			cnaLoginPage.fnEnterValidPassword();
		}

}