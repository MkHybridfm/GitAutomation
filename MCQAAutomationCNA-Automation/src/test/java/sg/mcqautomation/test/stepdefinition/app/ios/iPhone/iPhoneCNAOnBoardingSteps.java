package sg.mcqautomation.test.stepdefinition.app.ios.iPhone;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNASSO;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class iPhoneCNAOnBoardingSteps {

	public ActionEngineHelper action;

	iPhoneCNASSO cnaOnBoarding = new iPhoneCNASSO(DriverFactory.getDriver(),
			DriverFactory.getGlobalConfig());

	@Then("I Verify CNA OnBoarding Screen in iPhone")
	public void fnOnBoardingScreen() {
		Assert.assertTrue(cnaOnBoarding.fnOnBoardingScreen());
	}

	@When("I Click on Do it Later Button in iPhone")
	public void fnClickonDoItLater() {
		cnaOnBoarding.fnClickonDoItLater();
	}

	@When("I Click on Get Started Button in iPhone")
	public void fnClickGetStarted() {
		cnaOnBoarding.fnClickGetStarted();
	}

	@Then("I Verify Notification Screen in iPhone")
	public void fnOnBoardingPermissionScreen() {
		Assert.assertTrue(cnaOnBoarding.fnOnBoardingPermissionScreen());
	}
	@When("I Click on Manage Notification in iPhone")
	public void fnClickOBCNABtnManageNotifications() {
		cnaOnBoarding.fnClickOBCNABtnManageNotifications();
	}
	@Then("I Verify Manage Tracking Screen in iPhone")
	public void fnOnBoardingManageTracking() {
		Assert.assertTrue(cnaOnBoarding.fnOnBoardingManageTracking());
	}
	@When("I Click on Manage Tracking in iPhone")
	public void fnOBCNABtnManageTracking() {
		cnaOnBoarding.fnOBCNABtnManageTracking();
	}

	@Then("I Verify CNA OnBoarding Save Preference Screen in iPhone")
	public void fnOnBoardingSavePreferences() {
		Assert.assertTrue(cnaOnBoarding.fnOnBoardingSavePreferences());
	}

	@Then("I Verify CNA OnBoarding Save Preference Trending Topics Section in iPhone")
	public void fnOnBoardingSavePreferencesTrendingTopics() {
		Assert.assertTrue(cnaOnBoarding.fnOnBoardingSavePreferencesTrendingTopics());
	}



	@Then("I Verify CNA OnBoarding Save Preference More Topics Section in iPhone")
	public void fnOnBoardingSavePreferencesMoreTopics() {
		Assert.assertTrue(cnaOnBoarding.fnOnBoardingSavePreferencesMoreTopics());
	}


	@When("I Click on Save Preference in iPhone")
	public void fnClickonSavePref() {
		cnaOnBoarding.fnClickonSavePref();
	}

	@Then("I Verify CNA Login Screen in iPhone")
	public void fnLoginScreen() {
		Assert.assertTrue(cnaOnBoarding.fnLoginScreen());
	}

	@Then("I Verify Sign in with meconnect from CNA Login Screen in iPhone")
	public void LoginCNASigninwithmeconnect() {
		Assert.assertTrue(cnaOnBoarding.LoginCNASigninwithmeconnect());
	}

	@Then("I Verify Don’t have an account yet? Create one now from CNA Login Screen in iPhone")
	public void LoginCNACreateNewAccount() {
		Assert.assertTrue(cnaOnBoarding.LoginCNACreateNewAccount());
	}

	@Then("I Verify Continue with Apple from CNA Login Screen in iPhone")
	public void LoginCNAApple() {
		Assert.assertTrue(cnaOnBoarding.LoginCNAApple());
	}

	@Then("I Verify Continue with Facebook from CNA Login Screen in iPhone")
	public void LoginCNAFaceBook() {
		Assert.assertTrue(cnaOnBoarding.LoginCNAFaceBook());
	}

	@Then("I Verify Continue with Google from CNA Login Screen in iPhone")
	public void LoginCNAGoogle() {
		Assert.assertTrue(cnaOnBoarding.LoginCNAGoogle());
	}

	@Then("I Verify Do it later from CNA Login Screen in iPhone")
	public void LoginCNADoItLater() {
		Assert.assertTrue(cnaOnBoarding.LoginCNADoItLater());
	}

	@Then("I Click on Do it later from CNA Login Screen in iPhone")
	public void LoginCNAClickDoItLater() {
		cnaOnBoarding.LoginCNAClickDoItLater();
	}

	//****
	@When("I Select Trending Topics in iPhone")
	public void fnSelectTrendingTopics() {
		cnaOnBoarding.fnSelectTrendingTopics();
	}

	@When("I Select More Topics in iPhone")
	public void fnSelectMoreTopics() {
		cnaOnBoarding.fnSelectMoreTopics();
	}



}