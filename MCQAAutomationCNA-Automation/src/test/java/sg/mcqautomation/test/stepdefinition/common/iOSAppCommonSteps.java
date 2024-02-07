package sg.mcqautomation.test.stepdefinition.common;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.common.iOSAppCommonPage;

public class iOSAppCommonSteps {

	iOSAppCommonPage commonSteps = new iOSAppCommonPage(DriverFactory.getDriver(),
			DriverFactory.getGlobalConfig());

	@Then("I Verify {string} info is displayed on {string} in iPhone")
	@Then("I Verify {string} info is displayed on {string} in iPad")
	public void fnVerifyInfo(String strValue,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyInfo(strValue));
	}

	@Then("I Verify {string} info is not displayed on {string} in iPhone")
	@Then("I Verify {string} info is not displayed on {string} in iPad")
	public void fnVerifyInfoNot(String strValue,String strDescription) throws Throwable {
		Assert.assertFalse(commonSteps.fnVerifyInfo(strValue));
	}

	@Then("I Verify {string} Button is displayed on {string} in iPhone")
	@Then("I Verify {string} Button is displayed on {string} in iPad")
	public void fnVerifyButton(String strTitleName,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyButton(strTitleName));
	}

	@Then("I Verify {string} Button is not displayed on {string} in iPhone")
	@Then("I Verify {string} Button is not displayed on {string} in iPad")
	public void fnVerifyButtonNot(String strTitleName,String strDescription) throws Throwable {
		Assert.assertFalse(commonSteps.fnVerifyButtonNot(strTitleName));
	}

	@When("I Click {string} Button on {string} in iPhone")
	@When("I Click {string} Button on {string} in iPad")
	public void fnClickButton(String strTitleName,String strDescription) throws Throwable {
		commonSteps.fnClickOnButton(strTitleName);
	}

	@When("I Click {string} on {string} in iPhone")
	@When("I Click {string} on {string} in iPad")
	public void fnClickOnText(String strTitleName,String strDescription) throws Throwable {
		commonSteps.fnClickOnText(strTitleName);
	}

	@Then("I Verify {string} Image is displayed on {string} in iPhone")
	@Then("I Verify {string} Image is displayed on {string} in iPad")
	public void fnVerifyImage(String strTitleName,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyImage(strTitleName));
	}

	@When("I Click {string} Image on {string} in iPhone")
	@When("I Click {string} Image on {string} in iPad")
	public void fnClickImage(String strTitleName,String strDescription) throws Throwable {
		commonSteps.fnClickOnButton(strTitleName);
	}

	@Then("I Verify {string} Text Field is displayed on {string} in iPhone")
	@Then("I Verify {string} Text Field is displayed on {string} in iPad")
	public void fnVerifyTextField(String strTitleName,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyTextField(strTitleName));
	}

	@Then("I Verify {string} Password Text Field is displayed on {string} in iPhone")
	@Then("I Verify {string} Password Text Field is displayed on {string} in iPad")
	public void fnVerifyPasswordTextField(String strTitleName,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyTextField(strTitleName));
	}

	@When("I Launch {string} Mobile App in iPhone")
	@When("I Launch {string} Mobile App in iPad")
	public void fnLaunchApp(String strTitleName) throws Throwable {
		commonSteps.launchApplication();
	}

	@When("I wait sometime for refresh the screen in iPhone")
	@When("I wait sometime for refresh the screen in iPad")
	public void fnWaitSomeTime() throws Throwable {
		Thread.sleep(10000);
	}

	@When("I Handle App Tracking Popup {string} Mobile App in iPhone")
	@When("I Handle App Tracking Popup {string} Mobile App in iPad")
	public void fnHandlePopup(String strTitleName) throws Throwable {
		commonSteps.fnHandlePopup();
	}

	@When("I wait sometime for load webpage in iPhone")
	@When("I wait sometime for load Screen in iPhone")
	@When("I wait sometime for load Screen in iPad")
	@When("I wait sometime for load webpage in iPad")
	public void fnWaitSomeTimeWebPage() throws Throwable {
		Thread.sleep(40000);
	}

	@Then("I Verify {string} info is visible on {string} in iPhone")
	@Then("I Verify {string} info is visible on {string} in iPad")
	public void fnVerifyInfoVisible(String strValue,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyInfoVisible(strValue));
	}

	@Then("I Verify {string} info is not visible on {string} in iPhone")
	@Then("I Verify {string} info is not visible on {string} in iPad")
	public void fnVerifyInfoNotvisible(String strValue,String strDescription) throws Throwable {
		Assert.assertFalse(commonSteps.fnVerifyInfoVisible(strValue));
	}

	@Then("I Verify Navigation Bar {string} info is not visible on {string} in iPhone")
	@Then("I Verify Navigation Bar {string} info is not visible on {string} in iPad")
	public void fnVerifyInfoNotNavigationBar(String strValue,String strDescription) throws Throwable {
		Assert.assertFalse(commonSteps.fnVerifyNavigationBar(strValue));
	}

	@Then("I Verify Navigation Bar {string} info is visible on {string} in iPhone")
	@Then("I Verify Navigation Bar {string} info is visible on {string} in iPad")
	public void fnVerifyInfoNavigationBar(String strValue,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyNavigationBar(strValue));
	}

	@When("I Click Back Button on {string} in iPhone")
	@When("I Click Back Button on {string} in iPad")
	public void fnClickBackButton(String strDescription) throws Throwable {
		commonSteps.fnClickBack();
	}

	@When("I Select {string} Bottom Tab in iPhone")
	@When("I Select {string} Bottom Tab in iPad")
	public void fnSelectBottomTab(String strTabName) throws Throwable {
		commonSteps.fnSelectBottomTab(strTabName);
	}

	@When("I Scroll Up Screen in iPhone")
	@When("I Scroll Up Screen in iPad")
	public void fnScrollUp() throws Throwable {
		commonSteps.fnScrollUp();
	}
}
