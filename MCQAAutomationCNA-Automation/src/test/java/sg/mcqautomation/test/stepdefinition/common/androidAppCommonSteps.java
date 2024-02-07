package sg.mcqautomation.test.stepdefinition.common;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.common.androidAppCommonPage;

public class androidAppCommonSteps {

	androidAppCommonPage commonSteps = new androidAppCommonPage(DriverFactory.getDriver(),
			DriverFactory.getGlobalConfig());

	@Then("I Verify {string} info is displayed on {string} in Android Mobile")
	@Then("I Verify {string} info is displayed on {string} in Android Tablet")
	public void fnVerifyInfo(String strValue,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyInfo(strValue));
	}

	@Then("I Verify {string} info is not displayed on {string} in Android Mobile")
	@Then("I Verify {string} info is not displayed on {string} in Android Tablet")
	public void fnVerifyInfoNot(String strValue,String strDescription) throws Throwable {
		Assert.assertFalse(commonSteps.fnVerifyInfo(strValue));
	}

	@Then("I Verify {string} Button is displayed on {string} in Android Mobile")
	@Then("I Verify {string} Button is displayed on {string} in Android Tablet")
	public void fnVerifyButton(String strTitleName,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyButton(strTitleName));
	}

	@When("I Click {string} Button on {string} in Android Mobile")
	@When("I Click {string} Button on {string} in Android Tablet")
	public void fnClickButton(String strTitleName,String strDescription) throws Throwable {
		commonSteps.fnClickOnButton(strTitleName);
	}

	@When("I Click {string} on {string} in Android Mobile")
	@When("I Click {string} on {string} in Android Tablet")
	public void fnClickOnText(String strTitleName,String strDescription) throws Throwable {
		commonSteps.fnClickOnText(strTitleName);
	}

	@Then("I Verify {string} Image is displayed on {string} in Android Mobile")
	@Then("I Verify {string} Image is displayed on {string} in Android Tablet")
	public void fnVerifyImage(String strTitleName,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyImage(strTitleName));
	}

	@When("I Click {string} Image on {string} in Android Mobile")
	@When("I Click {string} Image on {string} in Android Tablet")
	public void fnClickImage(String strTitleName,String strDescription) throws Throwable {
		commonSteps.fnClickImage(strTitleName);
	}

	@Then("I Verify {string} Text Field is displayed on {string} in Android Mobile")
	@Then("I Verify {string} Text Field is displayed on {string} in Android Tablet")
	public void fnVerifyTextField(String strTitleName,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyTextField(strTitleName));
	}

	@Then("I Verify {string} Password Text Field is displayed on {string} in Android Mobile")
	@Then("I Verify {string} Password Text Field is displayed on {string} in Android Tablet")
	public void fnVerifyPasswordTextField(String strTitleName,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyTextField(strTitleName));
	}

	@When("I Launch {string} Mobile App in Android Mobile")
	@When("I Launch {string} Mobile App in Android Tablet")
	public void fnLaunchApp(String strTitleName) throws Throwable {
		commonSteps.launchApplication();
	}

	@When("I wait sometime for refresh the screen in Android Mobile")
	@When("I wait sometime for refresh the screen in Android Tablet")
	public void fnWaitSomeTime() throws Throwable {
		Thread.sleep(10000);
	}

	@When("I Handle App Tracking Popup {string} Mobile App in Android Mobile")
	@When("I Handle App Tracking Popup {string} Mobile App in Android Tablet")
	public void fnHandlePopup(String strTitleName) throws Throwable {
		commonSteps.fnHandlePopup();
	}

	@When("I wait sometime for load webpage in Android Mobile")
	@When("I wait sometime for load webpage in Android Tablet")
	public void fnWaitSomeTimeWebPage() throws Throwable {
		Thread.sleep(40000);
	}

	@Then("I Verify {string} info is visible on {string} in Android Mobile")
	@Then("I Verify {string} info is visible on {string} in Android Tablet")
	public void fnVerifyInfoVisible(String strValue,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyInfoVisible(strValue));
	}

	@Then("I Verify {string} info is not visible on {string} in Android Mobile")
	@Then("I Verify {string} info is not visible on {string} in Android Tablet")
	public void fnVerifyInfoNotvisible(String strValue,String strDescription) throws Throwable {
		Assert.assertFalse(commonSteps.fnVerifyInfoVisible(strValue));
	}

	@Then("I Verify {string} text is displayed on {string} in Android Mobile")
	@Then("I Verify {string} text is displayed on {string} in Android Tablet")
	public void fnVerifyText(String strValue,String strDescription) throws Throwable {
		Assert.assertTrue(commonSteps.fnVerifyText(strValue));
	}
}
